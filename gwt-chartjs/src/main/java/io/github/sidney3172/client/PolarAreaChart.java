package io.github.sidney3172.client;

import io.github.sidney3172.client.data.PieChartDataProvider;
import io.github.sidney3172.client.data.Series;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.user.client.rpc.AsyncCallback;


public class PolarAreaChart extends ChartWithScale {
	
	private PieChartDataProvider provider;
	
	public PolarAreaChart() {
		// default constructor
	}
	
	public PolarAreaChart(int width, int height) {
		super(width, height);
	}
	
	@Override
	public void draw() {
		reload();
	}
	
	private native void drawPolarArea(JavaScriptObject data, int width, int height)/*-{
        canvas = this.@io.github.sidney3172.client.Chart::getNativeElement()();
        nativeCanvas = this.@io.github.sidney3172.client.Chart::getNativeCanvas()();
        if(nativeCanvas != null) {
            nativeCanvas.destroy();
        }
        
		canvas.width = width;
		canvas.height = height;

        var options = this.@io.github.sidney3172.client.Chart::constructOptions()();
        nativeCanvas = new $wnd.Chart(canvas.getContext("2d")).PolarArea(data,options);
        this.@io.github.sidney3172.client.Chart::setNativeCanvas(Lcom/google/gwt/core/client/JavaScriptObject;)(nativeCanvas);
	}-*/;

	@Override
	public void update() {
		if(provider == null)
			throw new NullPointerException("PieChartDataProvider is not initialized before invoking update()");
        drawPolarArea(provider.getData(), this.width, this.height);
	}

	@Override
	public void reload() {
		if(provider == null)
			throw new NullPointerException("PieChartDataProvider is not initialized before invoking reload()");
		
		
		//TODO: show loading to user
		
		provider.reload(new AsyncCallback<JsArray<Series>>() {
			
			public void onSuccess(JsArray<Series> result) {
                drawPolarArea(provider.getData(), PolarAreaChart.this.width, PolarAreaChart.this.height);
			}
			
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	public void setDataProvider(PieChartDataProvider provider){
		this.provider = provider;
	}
}
