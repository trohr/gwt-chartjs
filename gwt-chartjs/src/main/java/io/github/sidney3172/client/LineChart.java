package io.github.sidney3172.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.rpc.AsyncCallback;
import io.github.sidney3172.client.data.AreaChartData;
import io.github.sidney3172.client.data.AreaChartDataProvider;




public class LineChart extends ChartWithScale {

	private AreaChartDataProvider provider = null;

	public LineChart() {
		// default constructor
	}
	
	public LineChart(int width, int height) {
		super(width, height);
	}

	@Override
	public void draw() {
		reload();
	}
	
	// changed LineChart to Chart
	private native void drawLine(JavaScriptObject data, int width, int height)/*-{
        canvas = this.@io.github.sidney3172.client.Chart::getNativeElement()();
        nativeCanvas = this.@io.github.sidney3172.client.Chart::getNativeCanvas()();
        if(nativeCanvas != null) {
            nativeCanvas.destroy();
        }

		canvas.width = width;
		canvas.height = height;
		
        var options = this.@io.github.sidney3172.client.Chart::constructOptions()();
        nativeCanvas = new $wnd.Chart(canvas.getContext("2d")).Line(data,options);
        this.@io.github.sidney3172.client.Chart::setNativeCanvas(Lcom/google/gwt/core/client/JavaScriptObject;)(nativeCanvas);
	}-*/;

	@Override
	public void update() {
		if(provider == null)
			throw new NullPointerException("Data provider is not specified before calling update()");
        drawLine(provider.getData(), this.width, this.height);
	}

	@Override
	public void reload() {
		if(provider == null)
			throw new NullPointerException("Data provider is not specified before calling reload()");
		//TODO: show some king of loading to user
		provider.reload(new AsyncCallback<AreaChartData>() {
			
			
			public void onSuccess(AreaChartData result) {
                drawLine(result, LineChart.this.width, LineChart.this.height);
			}
			
			
			public void onFailure(Throwable caught) {
				//TODO: show loading error to user 
			}
		});
	}
	
	public void setDataProvider(AreaChartDataProvider provider){
		this.provider = provider;
	}
}
