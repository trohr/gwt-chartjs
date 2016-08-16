package io.github.sidney3172.client.data;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;


public class AreaSeries extends JavaScriptObject{
	
	protected AreaSeries() {
	}
	
	/**
	 * Background color.
	 * See <a href="http://www.chartjs.org/docs/#bar-chart-data-structure">documentation</a>.
	 */
	public final native String getBackgroundColor() /*-{
		return this.backgroundColor;
	}-*/;

	/**
	 * Background color.
	 * See <a href="http://www.chartjs.org/docs/#bar-chart-data-structure">documentation</a>.
	 * <p>
	 * TODO allow setting of multiple colors
	 */
	public final native void setBackgroundColor(String backgroundColor) /*-{
		this.backgroundColor = backgroundColor;
	}-*/;

	public final native String getBorderColor() /*-{
		return this.borderColor;
	}-*/;

	public final native void setBorderColor(String borderColor) /*-{
		this.borderColor = borderColor;
	}-*/;

	public final native Integer getBorderWidth() /*-{
		return this.borderWidth;
	}-*/;

	public final native void setBorderWidth(Integer borderWidth) /*-{
		this.borderWidth = borderWidth;
	}-*/;
	
	public final native String getBorderSkipped() /*-{
		return this.borderSkipped;
	}-*/;
	
	/**
	 * Which edge to skip drawing the border for. Options are 'bottom', 'left', 'top', and 'right'
	 */
	public final native void setBorderSkipped(String borderSkipped) /*-{
		this.borderSkipped = borderSkipped;
	}-*/;

	
	
	public final native String getPointColor() /*-{
		return this.pointColor;
	}-*/;

	public final native void setPointColor(String printColor) /*-{
		this.pointColor = printColor;
	}-*/;

	public final native String getPointStrokeColor() /*-{
		return this.pointStrokeColor;
	}-*/;

	public final native void setPointStrokeColor(String pointStrokeColor) /*-{
		this.pointStrokeColor = pointStrokeColor;
	}-*/;

	public final native String[] getData() /*-{
		return this.data;
	}-*/;

    public final native void setLabel(String label)/*-{
        this.label = label;
    }-*/;

    public final native String getLabel()/*-{
        return this.label;
    }-*/;

	public final void setData(double[] data){
		JsArrayNumber array = JsArrayNumber.createArray().cast();
		for(double str : data)
			array.push(str);
		setData(array);
	}
	
	private final native void setData(JsArrayNumber data) /*-{
		this.data = data;
	}-*/;
}
