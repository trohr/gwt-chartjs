package org.chartjsgwt.client.data;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayInteger;
import com.google.gwt.core.client.JsArrayNumber;

/**
 * <h2>Abstract dataset</h2>
 * 
 * @author Tomáš Rohrbacher (rohrbacher[at]elvoris.cz)
 *
 */
public class Dataset extends JavaScriptObject
{
	
	protected Dataset() {
	}

	//
	// Data
	//

	/**
	 * The data to plot as lines
	 */
	public final native String[] getData () /*-{
		return this.data;
	}-*/;

	/**
	 * The data to plot as lines
	 */
	public final void setData(double[] data){
		JsArrayNumber array = JsArrayNumber.createArray().cast();
		for(double str : data)
			array.push(str);
		setData(array);
	}

	/**
	 * The data to plot as lines
	 */
	public final void setData(int[] data){
		JsArrayInteger array = JsArrayInteger.createArray().cast();
		for(int str : data)
			array.push(str);
		setData(array);
	}
	
	/**
	 * The data to plot as lines
	 */
	private final native void setData (JavaScriptObject data) /*-{
		this.data = data;
	}-*/;



	//
	// Label
	//

	/**
	 * The label for the dataset which appears in the legend and tooltips
	 */
	public final native String getLabel () /*-{
		return this.label;
	}-*/;

	/**
	 * The label for the dataset which appears in the legend and tooltips
	 */
	public final native void setLabel (String label) /*-{
		this.label = label;
	}-*/;



	//
	// Type
	//

	/**
	 * The type of this dataset
	 */
	protected final native String getType () /*-{
		return this.type;
	}-*/;

	/**
	 * The type of this dataset
	 */
	protected final native void setType (String type) /*-{
		this.type = type;
	}-*/;

}
