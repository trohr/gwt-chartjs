package io.github.sidney3172.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.rpc.AsyncCallback;
import io.github.sidney3172.client.data.AreaChartData;
import io.github.sidney3172.client.data.AreaChartDataProvider;


public class BarChart extends ChartWithScale {
	
	private AreaChartDataProvider provider;
	
	public BarChart() {
		// default constructor
	}
	
	public BarChart(int width, int height) {
		super(width, height);
	}
	
	@Override
	public void draw() {
		reload();
		
	}
	
	private native void drawBar(JavaScriptObject data, int width, int height)/*-{
        canvas = this.@io.github.sidney3172.client.Chart::getNativeElement()();
        nativeCanvas = this.@io.github.sidney3172.client.Chart::getNativeCanvas()();
        if(nativeCanvas != null) {
            nativeCanvas.destroy();
        }
        
		canvas.width = width;
		canvas.height = height;
		
        var options = this.@io.github.sidney3172.client.Chart::constructOptions()();
        nativeCanvas = new $wnd.Chart(canvas.getContext("2d")).Bar(data, options);
        this.@io.github.sidney3172.client.Chart::setNativeCanvas(Lcom/google/gwt/core/client/JavaScriptObject;)(nativeCanvas);
	}-*/;

	@Override
	public void update() {
		if(provider == null)
			throw new NullPointerException("PieCharDataProvider is not specified before invoking update()");
        drawBar(provider.getData(), this.width, this.height);
	}

	@Override
	public void reload() {
		if(provider == null)
			throw new NullPointerException("PieCharDataProvider is not specified before invoking reload()");

		//TODO : show loading
		provider.reload(new AsyncCallback<AreaChartData>() {
			
			public void onSuccess(AreaChartData result) {
                drawBar(result, BarChart.this.width, BarChart.this.height);
			}
			
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	public void setDataProvider(AreaChartDataProvider provier){
		this.provider = provier;
	}
	
}
