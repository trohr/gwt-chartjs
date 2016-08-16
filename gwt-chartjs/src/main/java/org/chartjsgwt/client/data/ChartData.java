package org.chartjsgwt.client.data;

import org.chartjsgwt.client.util.JsArrayUtil;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;

public class ChartData extends JavaScriptObject
{

	static final public ChartData create ()
	{
		return JavaScriptObject.createObject().cast();
	}
	
	protected ChartData() {
	}

	//
	// Datasets
	//

	/**
	 * Contains data for each dataset. See the documentation for each chart type to determine the valid options that can be attached to the dataset
	 * <p>Type: Array[object]
	 */
	public final native JsArray<JavaScriptObject> getDatasets() /*-{
		return this.datasets;
	}-*/;

	/**
	 * Contains data for each dataset. See the documentation for each chart type to determine the valid options that can be attached to the dataset
	 * <p>Type: Array[object]
	 */
	public final native void setDatasets(JsArray<? extends JavaScriptObject> datasets) /*-{
		this.datasets = datasets;
	}-*/;

	/**
	 * Contains data for each dataset. See the documentation for each chart type to determine the valid options that can be attached to the dataset
	 * <p>Type: Array[object]
	 */
	public final JavaScriptObject[] getDatasetsJava() {
		return JsArrayUtil.toJavaArray(this.getDatasets());
	}

	/**
	 * Contains data for each dataset. See the documentation for each chart type to determine the valid options that can be attached to the dataset
	 * <p>Type: Array[object]
	 */
	public final void setDatasetsJava(JavaScriptObject[] series) {
		this.setDatasets(JsArrayUtil.toJsArray(series));
	}

	/**
	 * @deprecated use {@link #getDatasets()}
	 */
	public final native JsArray<JavaScriptObject> getSeries() /*-{
		return this.datasets;
	}-*/;

	/**
	 * @deprecated use {@link #setDatasets(JsArray)}
	 */
	public final native void setSeries(JsArray<? extends JavaScriptObject> series) /*-{
		this.datasets = series;
	}-*/;


	//
	// Labels
	//

	/**
	 * Optional parameter that is used with the <a href="http://www.chartjs.org/docs/#scales-category-scale">category axis</a>.
	 * <p>Type: Array[string]
	 */
	public final void setLabels(String[] labels) {
		setLabelsJs(JsArrayUtil.toJsArray(labels));
	}

	/**
	 * Optional parameter that is used with the <a href="http://www.chartjs.org/docs/#scales-category-scale">category axis</a>.
	 * <p>Type: Array[string]
	 */
	public final String[] getLabels() {
		return JsArrayUtil.toJavaArray(getLabelsJs());
	}

	/**
	 * Optional parameter that is used with the <a href="http://www.chartjs.org/docs/#scales-category-scale">category axis</a>.
	 * <p>Type: Array[string]
	 */
	private final native void setLabelsJs(JsArrayString labels) /*-{
		this.labels = labels;
	}-*/;

	private final native JsArrayString getLabelsJs() /*-{
		return this.labels;
	}-*/;




	//
	// xLabels
	//

	/**
	 * Optional parameter that is used with the category axis and is used if the axis is horizontal
	 * <p>Type: Array[string]
	 */
	public final void setXLabels(String[] xLabels) {
		setLabelsJs(JsArrayUtil.toJsArray(xLabels));
	}

	/**
	 * Optional parameter that is used with the category axis and is used if the axis is horizontal
	 * <p>Type: Array[string]
	 */
	public final String[] getXLabels() {
		return JsArrayUtil.toJavaArray(getXLabelsJs());
	}

	private final native void setXLabelsJs(JsArrayString xLabels) /*-{
		this.xLabels = xLabels;
	}-*/;

	private final native JsArrayString getXLabelsJs() /*-{
		return this.xLabels;
	}-*/;



	//
	// yLabels
	//

	/**
	 * Optional parameter that is used with the category axis and is used if the axis is vertical
	 * <p>Type: Array[string]
	 */
	public final void setYLabels(String[] yLabels) {
		setLabelsJs(JsArrayUtil.toJsArray(yLabels));
	}

	/**
	 * Optional parameter that is used with the category axis and is used if the axis is vertical
	 * <p>Type: Array[string]
	 */
	public final String[] getYLabels() {
		return JsArrayUtil.toJavaArray(getYLabelsJs());
	}

	private final native void setYLabelsJs(JsArrayString yLabels) /*-{
		this.yLabels = yLabels;
	}-*/;

	private final native JsArrayString getYLabelsJs() /*-{
		return this.yLabels;
	}-*/;


}
