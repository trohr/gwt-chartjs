package io.github.sidney3172.client.data;

import com.google.gwt.core.client.JavaScriptObject;


public class Series extends JavaScriptObject{
	
	protected Series() {
	}
	
	public final native double getValue() /*-{
		return this.value;
	}-*/;
	
	public final native void setValue(double value) /*-{
		this.value = value;
	}-*/;

	public final native String getColor() /*-{
		return this.color;
	}-*/;

	public final native void setColor(String color) /*-{
		this.color = color;
	}-*/;
	
	public final native String getHighlightColor() /*-{
		return this.highlight;
	}-*/;
	
	public final native void setHightlightColor(String value) /*-{
		this.highlight = value;
	}-*/;
	
	public final native String getLabel() /*-{
		return this.label;
	}-*/;
	
	public final native void setLabel(String value) /*-{
		this.label = value;
	}-*/;
}
