package io.github.sidney3172.client;

import io.github.sidney3172.client.data.PieChartDataProvider;
import io.github.sidney3172.client.data.Series;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.user.client.rpc.AsyncCallback;


public class PieChart extends ChartWithScale {
	
	private PieChartDataProvider provider;
	
	public PieChart() {
		// default constructor
	}
	
	public PieChart(int width, int height) {
		super(width, height);
	}
	
	@Override
	public void draw() {
		reload();
	}
	
	private native void drawPie(JavaScriptObject data, int width, int height)/*-{
        canvas = this.@io.github.sidney3172.client.Chart::getNativeElement()();
        nativeCanvas = this.@io.github.sidney3172.client.Chart::getNativeCanvas()();
        if(nativeCanvas != null) {
            nativeCanvas.destroy();
        }

		canvas.width = width;
		canvas.height = height;

        options = this.@io.github.sidney3172.client.Chart::constructOptions()();
        nativeCanvas = new $wnd.Chart(canvas.getContext("2d")).Pie(data,options);
        this.@io.github.sidney3172.client.Chart::setNativeCanvas(Lcom/google/gwt/core/client/JavaScriptObject;)(nativeCanvas);
	}-*/;

	@Override
	public void update() {
		if(provider == null)
			throw new NullPointerException("PieChartDataProvider not initialized before invoking update()");
        drawPie(provider.getData(), this.width, this.height);
	}

	@Override
	public void reload() {
		if(provider == null)
			throw new NullPointerException("PieChartDataProvider not initialized before invoking update()");
		
		//TODO: show loading
		provider.reload(new AsyncCallback<JsArray<Series>>() {
			
			public void onSuccess(JsArray<Series> result) {
                drawPie(provider.getData(), PieChart.this.width, PieChart.this.height);
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
