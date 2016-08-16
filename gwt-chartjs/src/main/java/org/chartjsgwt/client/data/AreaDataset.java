package org.chartjsgwt.client.data;

/**
 * <h2>Abstract area dataset</h2>
 * Has two axes: X and Y.
 * 
 * @author Tomáš Rohrbacher (rohrbacher[at]elvoris.cz)
 *
 */
public class AreaDataset extends Dataset
{
	
	protected AreaDataset() {
	}


	/**
	 * The ID of the x axis to plot this dataset on
	 */
	public final native String getXAxisID () /*-{
		return this.xAxisID;
	}-*/;

	/**
	 * The ID of the x axis to plot this dataset on
	 */
	public final native void setXAxisID (String xAxisID) /*-{
		this.xAxisID = xAxisID;
	}-*/;


	/**
	 * The ID of the y axis to plot this dataset on
	 */
	public final native String getYAxisID () /*-{
		return this.yAxisID;
	}-*/;

	/**
	 * The ID of the y axis to plot this dataset on
	 */
	public final native void setYAxisID (String yAxisID) /*-{
		this.yAxisID = yAxisID;
	}-*/;

}
