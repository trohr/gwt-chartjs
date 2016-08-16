package org.chartjsgwt.client;

import org.chartjsgwt.client.data.ChartData;
import org.chartjsgwt.client.data.ChartDataProvider;
import org.chartjsgwt.client.event.DataSelectionEvent;
import org.chartjsgwt.client.event.DataSelectionHandler;
import org.chartjsgwt.client.event.HasDataSelectionEventHandlers;
import org.chartjsgwt.client.options.CommonChartOptions;
import org.chartjsgwt.client.options.IsResponsive;
import org.chartjsgwt.client.options.animation.AnimationCallback2;
import org.chartjsgwt.client.options.animation.AnimationMixin;
import org.chartjsgwt.client.options.animation.AnimationType;
import org.chartjsgwt.client.options.animation.HasAnimation2;
import org.chartjsgwt.client.resources.ChartStyle;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.CanvasElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.SimplePanel;

/**
 * Base class for all chart widgets<br/>
 * Class describes generic behavior of all chart widgets
 * @author sidney3172
 *
 */
public abstract class Chart extends SimplePanel
implements 
HasAnimation2, //HasAnimationCompleteHandlers, 
HasClickHandlers, HasDataSelectionEventHandlers, 
IsResponsive
{

	final private class DataSelectionClickHandler implements ClickHandler
	{
		static final private boolean LOG_DATA_SELECTION_DEVELOP = false;
        @Override
        public void onClick(final ClickEvent clickEvent) {
            NativeEvent evt = clickEvent.getNativeEvent();
            
            if (LOG_DATA_SELECTION_DEVELOP)
            {
            	GWT.log("Processing click: "
            			+ "\nevent: "+evt.getString()
            			+ "\nchart: "+(nativeChart == null ? null : nativeChart.toSource())
            	);
            }
            
            JavaScriptObject data = getClickPoints(evt, nativeChart);
            
            if (LOG_DATA_SELECTION_DEVELOP)
            {
            	GWT.log("Clicked on elements: "+(data == null ? null : data.toSource()));
            }
            
            if (data != null) {
                DataSelectionEvent.fire(Chart.this, Chart.this, data);
            }
        }
        
        private native JavaScriptObject getClickPoints(JavaScriptObject event, JavaScriptObject canvas)/*-{
            if(canvas == null || event == null)
                return null;
            try {
                return canvas.getElementsAtEvent(event);
            }
            catch(e) {
                //exception occurred when added additional ClickHandler which destroys chart before processing.
                return null;
            }
        }-*/;

	}
	

    final private CommonChartOptions options;
    final private AnimationMixin animationMixin;
    
    private JavaScriptObject nativeChart;
	private CanvasElement canvas;
	private ChartStyle style;
	private ChartDataProvider provider;
	
	/**
	 * This constructor creates new chart instance with custom {@link ChartStyle}
	 * @param style - new CssResource used for styling charts
	 */
	public Chart(ChartStyle style) {
		setChartStyle(style);
		// Create options
		this.options = createOptions();
		this.animationMixin = new AnimationMixin(options);
		
//        registerNativeAnimationHandlers();
		this.canvas = Document.get().createCanvasElement();
		this.getElement().appendChild(this.canvas);
		
        sinkEvents(Event.ONCLICK);
        addClickHandler(new DataSelectionClickHandler());
	}
	
	/**
	 * Constructor creates chart with default style
	 */
	public Chart() {
		this(ChartJs.resources().chartStyle());
	}



	//
	// Initialization
	//

	/**
	 * Return main chart type for the Chart.
	 * <p>
	 * Used in javascript like this:
	 * <pre>
        var chartType = this.@org.chartjsgwt.client.Chart::getChartType()();
        var ctx = canvas.getContext("2d");
        
        nativeCanvas = new $wnd.Chart(ctx, {
        	type: chartType,
        	data: data,
        	options: options
        });
	 * </pre>
	 * @return
	 */
	abstract public String getChartType ();
	
	/**
	 * Creates the options object. This method is called only once in the constructor of the Chart.
	 * @return
	 */
	protected CommonChartOptions createOptions ()
	{
		return CommonChartOptions.create();
	}
	

	@Override
	protected void onAttach() {
		ChartJs.ensureInjected();
		super.onAttach();
		draw();
	}

	
	//
	// Getters & Setters
	//

	public final void setDataProvider(ChartDataProvider provier){
		this.provider = provier;
	}
	
	/**
	 * Set new style to the char widget. New style will be injected automatically.<br/>
	 * NOTICE: new style will be applied after re-drawing of chart<br/>
	 * @param style
	 */
	public void setChartStyle(ChartStyle style) {
		style.ensureInjected();
		setStylePrimaryName(style.chart());
	}

    protected JavaScriptObject getNativeCanvas() {
        return nativeChart;
    }

    protected CanvasElement getNativeElement() {
        return canvas;
    }

    protected final void setNativeCanvas(JavaScriptObject object) {
    	if (DataSelectionClickHandler.LOG_DATA_SELECTION_DEVELOP)
    	{
    		GWT.log("Setting native canvas: "+(
    				object == null ? null
    				: (object.toString() + ", source: "+object.toSource())
    		));
    	}
        this.nativeChart = object;
    }

	// TODO REMOVE
    @Deprecated
    protected final void processEvents(JavaScriptObject object) {
        this.setNativeCanvas(object);
    }

    /**
     * Method returns custom options for chart as a JavaScriptObject
     * @return
     */
    protected JavaScriptObject getOptionsJS() {
    	return getOptions() == null ? null : getOptions().asJavaScriptObject();
    }
    
    /**
     * Method returns custom options for chart
     * @return
     */
    public CommonChartOptions getOptions() {
    	return options;
    }

   
    //
    // Drawing functions
    //

	/**
	 * Method preparing data and invoking native draw method<br/>
	 * This method should not be overridden by sub-classes
	 */
	public void draw() {
		reload();
	}

	/**
	 * Method re-drawing chart widget without re-requesting data from data provider.<br/>
	 * To update data call {@link #reload()} method instead
	 */
	public void update() {
		if(provider == null)
		{
			throw new NullPointerException("ChartDataProvider is not specified before invoking update()");
		}
        drawChart(provider.getData());
	}

	/**
	 * Method requesting data from data provider and re-drawing chart.
	 */
	public void reload() {
		if(provider == null)
		{
			throw new NullPointerException("ChartDataProvider is not specified before invoking reload()");
		}

		//TODO : show loading
		provider.reload(new AsyncCallback<ChartData>() {
			
			@Override
			public void onSuccess(ChartData result)
			{
                drawChart(result);
			}
			
			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
			}
		});
	}
	
	private final native void drawChart(JavaScriptObject data) /*-{
        canvas = this.@org.chartjsgwt.client.Chart::getNativeElement()();
        nativeChart = this.@org.chartjsgwt.client.Chart::getNativeCanvas()();
        
        if(nativeChart != null) {
            nativeChart.destroy();
        } else {
    	}

        var options = this.@org.chartjsgwt.client.Chart::getOptionsJS()();
        var chartType = this.@org.chartjsgwt.client.Chart::getChartType()();
        
        var ctx = canvas.getContext("2d");
        nativeChart = new $wnd.Chart(ctx, {
        	type: chartType,
        	data: data,
        	options: options
        });
        
        this.@org.chartjsgwt.client.Chart::setNativeCanvas(Lcom/google/gwt/core/client/JavaScriptObject;)(nativeChart);
	}-*/;

//	private final native void drawChart(JavaScriptObject data) /*-{
//        canvas = this.@org.chartjsgwt.client.Chart::getNativeElement()();
//        nativeChart = this.@org.chartjsgwt.client.Chart::getNativeCanvas()();
//        
//        if(nativeChart != null) {
//        	console.log("destroying native chart");
//            nativeChart.destroy();
//        } else {
//        	console.log("no previous native chart to destroy");
//    	}
//
//        var options = this.@org.chartjsgwt.client.Chart::getOptionsJS()();
//        try {
//	        try {
//	    		console.log("options: "+JSON.stringify(options, null, 4));
//	        } catch (e) {
//	        	// error during log, forget it
//	        	console.log("error during chartjs log", e);
//	        }
//        } catch (noconsole) {}
//        
//        var chartType = this.@org.chartjsgwt.client.Chart::getChartType()();
//        
//        var ctx = canvas.getContext("2d");
//        nativeChart = new $wnd.Chart(ctx, {
//        	type: chartType,
//        	data: data,
//        	options: options
//        });
//        console.log("newchart: (str="+nativeChart.toString()
//        	//+") (source="+nativeChart.toSource()
//        	+") (class="+nativeChart.constructor.name+")"
//        	+") (undefined="+(nativeChart == undefined)+")"
//        );
//        
//        this.@org.chartjsgwt.client.Chart::setNativeCanvas(Lcom/google/gwt/core/client/JavaScriptObject;)(nativeChart);
//	}-*/;
	
	
    
    //
    // WHATNOT
    //
	
	/**
	 * Method sets pixel width of chart area
	 * @param width - width in pixels
	 * TODO: replace it with generic {@link #setWidth(String)} and {@link #setSize(String, String)}
	 */
	public void setPixelWidth(int width) {
		canvas.setWidth(width);
	}

    public void setWidth(String width) {
        canvas.getStyle().setProperty("width", width);
    }

    public void setHeight(String height) {
        canvas.getStyle().setProperty("height", height);
    }

	/**
	 * Method sets pixel height of chart area
	 * @param height - height in pixels
	 * TODO: replace it with generic {@link #setHeight(String)} and {@link #setSize(String, String)}
	 */
	public void setPixelHeight(int height) {
		canvas.setHeight(height);
	}
	
	
	//
	// Retrieve snapshot image of the chart
	//

    /**
     * Creates snapshot of current state of chart as image
     * @return Image object or null if AnimationMixin not rendered (or in progress)
     */
    public Image getSnapshot() {
        String code= getBase64Image(nativeChart);
        if(code == null)
            return null;
        Image image = new Image(code);
        return image;
    }

    private native String getBase64Image(JavaScriptObject nativeChart)/*-{
        if(nativeChart != null)
            return nativeChart.toBase64Image();
        return null;
    }-*/;

    
    //
    // Click and data selection handlers
    //
    
    /**
     * Important Note : clickHandler added internally by default to handle DataSelectionEvent.
     * In case external clickHandler destroying chart (eg update() method invoked) this will lead
     * to DataSelectionEvent won't be created
     */
    @Override
    public HandlerRegistration addClickHandler(ClickHandler clickHandler) {
        return addHandler(clickHandler, ClickEvent.getType());
    }

    @Override
    public HandlerRegistration addDataSelectionHandler(DataSelectionHandler handler) {
        return addHandler(handler, DataSelectionEvent.getType());
    }



    //
    // MAIN OPTIONS
    //
    
    @Override
    public void setResponsive(boolean responsive) {
    	getOptions().setResponsive(responsive);
    }

    @Override
    public void setMaintainAspectRatio(boolean maintainAspectRatio) {
    	getOptions().setMaintainAspectRatio(maintainAspectRatio);
    }
    
    /*
    public void setLegendTemplate(String template) {
    	options.setProperty("legendTemplate", template);
    }
    */
    


    //
    // Animation options
    // 
    /*
     * Specify should chart be animated or not
     * Default value is <code>true</code>
     * @param enabled
     *
    public void setAnimationEnabled(boolean enabled) {
        if(!enabled) //"animation" : false interpreted by chart.js as "true"
            options.clearProperty(ANIMATION);
        else
            options.setProperty(ANIMATION, enabled);
    }
    */

    /**
     * Specify animation easing
     * Default value is {@link AnimationType#EASE_OUT_QUART}
     * @param type
     */
    @Override
    public void setAnimationType(AnimationType type) {
    	animationMixin.setAnimationType(type);
    }

    /**
     * Add animation callback to handle animation state changes
     * @param callback
     */
    public void addAnimationCallback(AnimationCallback2 callback) {
    	animationMixin.addAnimationCallback(callback);
    }

    @Override
    public void setAnimationDuration(int duration) {
    	animationMixin.setAnimationDuration(duration);
    }

//	@Override
//	public void addAnimationCompleteHandler(AnimationCompleteHandler handler) {
//		animationMixin.addAnimationCompleteHandler (handler);
//	}

}
