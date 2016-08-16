package io.github.sidney3172.client.data;

import com.google.gwt.core.client.JavaScriptObject;

public class SeriesBuilder {
	
	private AreaSeries series = null;
	
	private SeriesBuilder(){
		series = JavaScriptObject.createObject().cast();
	}
	
	public static SeriesBuilder create(){
		return new SeriesBuilder();
	}

    public SeriesBuilder withLabel(String label){
        series.setLabel(label);
        return this;
    }

	/**
	 * @deprecated Use {@link #withBackgroundColor(String)} instead
	 */
	public SeriesBuilder withFillColor(String fillColor){
		return withBackgroundColor(fillColor);
	}

	public SeriesBuilder withBackgroundColor(String fillColor){
		series.setBackgroundColor(fillColor);
		return this;
	}
	
	/**
	 * @deprecated Use {@link #withBorderColor(String)} instead
	 */
	public SeriesBuilder withStoreColor(String strokeColor){
		return withBorderColor(strokeColor);
	}

	public SeriesBuilder withBorderColor(String strokeColor){
		series.setBorderColor(strokeColor);
		return this;
	}
	
	public SeriesBuilder withBorderWidth(int borderWidth){
		series.setBorderWidth(borderWidth);
		return this;
	}
	
	public SeriesBuilder withPointColor(String pointColor){
		series.setPointColor(pointColor);
		return this;
	}

	public SeriesBuilder withPointStrokeColor(String pointStrokeColor){
		series.setPointStrokeColor(pointStrokeColor);
		return this;
	}
	
	public SeriesBuilder withData(double[] data){
		series.setData(data);
		return this;
	}
	
	public AreaSeries get(){
		return series;
	}
}