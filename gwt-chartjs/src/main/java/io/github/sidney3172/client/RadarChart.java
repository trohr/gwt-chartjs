package io.github.sidney3172.client;

import io.github.sidney3172.client.data.AreaChartData;
import io.github.sidney3172.client.data.AreaChartDataProvider;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.rpc.AsyncCallback;


public class RadarChart extends ChartWithScale {
	
	private AreaChartDataProvider provider;
	private boolean scaleShowLabels = false;
	
	public RadarChart() {
		// default constructor
	}
	
	public RadarChart(int width, int height) {
		super(width, height);
	}
	
	@Override
	public void draw() {
		reload();
	}
	
	public void setScaleShowLabels(boolean scaleShowLabels){
		this.scaleShowLabels = scaleShowLabels;
	}
	
	private native void drawRadar(JavaScriptObject data, int width, int height)/*-{
        canvas = this.@io.github.sidney3172.client.Chart::getNativeElement()();
        nativeCanvas = this.@io.github.sidney3172.client.Chart::getNativeCanvas()();
        if(nativeCanvas != null) {
            nativeCanvas.destroy();
        }
        
        canvas.width = width;
		canvas.height = height;

        var options = this.@io.github.sidney3172.client.Chart::constructOptions()();
        if(options == null)
            options = {scaleShowLabels : true, pointLabelFontSize : 10};
        nativeCanvas = new $wnd.Chart(canvas.getContext("2d")).Radar(data,options);
        this.@io.github.sidney3172.client.Chart::setNativeCanvas(Lcom/google/gwt/core/client/JavaScriptObject;)(nativeCanvas);
	}-*/;

	@Override
	public void update() {
		if(provider == null)
			throw new NullPointerException("PieCharDataProvider was not initialized before invoking update()");

        drawRadar(provider.getData(), this.width, this.height);
	}

	@Override
	public void reload() {
		if(provider == null)
			throw new NullPointerException("PieCharDataProvider was not initialized before invoking reload()");
		
		//TODO: show loading..
		
		provider.reload(new AsyncCallback<AreaChartData>() {
			
			public void onSuccess(AreaChartData result) {
                drawRadar(result, RadarChart.this.width, RadarChart.this.height);
			}
			
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	public void setDataProvider(AreaChartDataProvider provider){
		this.provider = provider;
	}
	
}
