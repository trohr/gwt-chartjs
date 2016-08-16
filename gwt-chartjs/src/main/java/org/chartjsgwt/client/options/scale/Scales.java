/**
 * 
 */
package org.chartjsgwt.client.options.scale;

import org.chartjsgwt.client.IsJavaScriptObject;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Scales for area charts (Bar and Line).
 * <pre>
 * {
 * 	xAxes: Array&lt;Scale&gt;,
 * 	yAxes: Array&lt;Scale&gt;
 * }
 * <pre> 
 * 
 * @author Tomáš Rohrbacher (rohrbacher[at]elvoris.cz)
 */
public class Scales
//extends JavaScriptObject
implements IsJavaScriptObject
{

	static public Scales create()
	{
		//return JavaScriptObject.createObject().cast();
		return new Scales();
	}

//	/**
//	 * Constructors must be 'protected' in subclasses of JavaScriptObject
//	 */
//	protected Scales() {
//		super();
//	}

//	private Scale[] xAxes = null;
//	private Scale[] yAxes = null;
	
	/**
	 * Default constructor
	 */
	public Scales() {
		super();
	}

	
	public final native Scale[] getXAxes () /*-{
		return this.xAxes;
	}-*/;

	public final native void setXAxes (Scale[] xAxes) /*-{
		this.xAxes = xAxes;
	}-*/;
	
	public final native void setSingleXAxis (Scale xAxis) /*-{
		if (xAxis == null)
		{
			this.xAxes = null;
		}
		else
		{
			this.xAxes = [xAxis];
		}
	}-*/;
	
	
	public final native Scale[] getYAxes () /*-{
		return this.yAxes;
	}-*/;
	
	public final native void setYAxes (Scale[] yAxes) /*-{
		this.yAxes = yAxes;
	}-*/;

	public final native void setSingleYAxis (Scale yAxis) /*-{
		if (yAxis == null)
		{
			this.yAxes = null;
		}
		else
		{
			this.yAxes = [yAxis];
		}
	}-*/;

	@Override
	public final native JavaScriptObject asJavaScriptObject () /*-{
		return this;
	}-*/;
	
}
