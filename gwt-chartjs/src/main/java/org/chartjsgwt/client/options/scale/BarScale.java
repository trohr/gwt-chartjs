/**
 * 
 */
package org.chartjsgwt.client.options.scale;

/**
 * <h3 id="bar-chart-chart-options"><a class="fragment-link" href="#bar-chart-chart-options">Chart Options</a></h3>
 * <p>These are the customisation options specific to Bar charts. 
 * 	These options are merged with the <a href="#global-chart-configuration">global chart configuration options</a>, and form the options of the chart.</p>
 * <p>The default options for bar chart are defined in <code>Chart.defaults.bar</code>.</p>
 * <div class="table-wrapper"><table>
<thead>
<tr>
<th>Name</th>
<th style="text-align:center">Type</th>
<th>Default</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td><em>hover</em>.mode</td>
<td style="text-align:center">String</td>
<td>"label"</td>
<td>Label's hover mode. "label" is used since the x axis displays data by the index in the dataset.</td>
</tr>
<tr>
<td>scales</td>
<td style="text-align:center">Object</td>
<td>-</td>
<td>-</td>
</tr>
<tr>
<td><em>scales</em>.xAxes</td>
<td style="text-align:center">Array</td>
<td></td>
<td>The bar chart officially supports only 1 x-axis but uses an array to keep the API consistent. Use a scatter chart if you need multiple x axes.</td>
</tr>
<tr>
<td><em>Options for xAxes</em></td>
<td style="text-align:center"></td>
<td></td>
<td></td>
</tr>
<tr>
<td>type</td>
<td style="text-align:center">String</td>
<td>"Category"</td>
<td>As defined in <a href="#scales-category-scale">Scales</a>.</td>
</tr>
<tr>
<td>display</td>
<td style="text-align:center">Boolean</td>
<td>true</td>
<td>If true, show the scale.</td>
</tr>
<tr>
<td>id</td>
<td style="text-align:center">String</td>
<td>"x-axis-0"</td>
<td>Id of the axis so that data can bind to it</td>
</tr>
<tr>
<td>stacked</td>
<td style="text-align:center">Boolean</td>
<td>false</td>
<td>If true, bars are stacked on the x-axis</td>
</tr>
<tr>
<td>categoryPercentage</td>
<td style="text-align:center">Number</td>
<td>0.8</td>
<td>Percent (0-1) of the available width (the space between the gridlines for small datasets) for each data-point to use for the bars. <a href="#bar-chart-barpercentage-vs-categorypercentage">Read More</a></td>
</tr>
<tr>
<td>barPercentage</td>
<td style="text-align:center">Number</td>
<td>0.9</td>
<td>Percent (0-1) of the available width each bar should be within the category percentage. 1.0 will take the whole category width and put the bars right next to each other. <a href="#bar-chart-barpercentage-vs-categorypercentage">Read More</a></td>
</tr>
<tr>
<td>gridLines</td>
<td style="text-align:center">Object</td>
<td><a href="#scales">See Scales</a></td>
<td></td>
</tr>
<tr>
<td><em>gridLines</em>.offsetGridLines</td>
<td style="text-align:center">Boolean</td>
<td>true</td>
<td>If true, the bars for a particular data point fall between the grid lines. If false, the grid line will go right down the middle of the bars.</td>
</tr>
<tr>
<td></td>
<td style="text-align:center"></td>
<td></td>
<td></td>
</tr>
<tr>
<td><em>scales</em>.yAxes</td>
<td style="text-align:center">Array</td>
<td><code>[{ type: "linear" }]</code></td>
<td></td>
</tr>
<tr>
<td><em>Options for yAxes</em></td>
<td style="text-align:center"></td>
<td></td>
<td></td>
</tr>
<tr>
<td>type</td>
<td style="text-align:center">String</td>
<td>"linear"</td>
<td>As defined in <a href="#scales-linear-scale">Scales</a>.</td>
</tr>
<tr>
<td>display</td>
<td style="text-align:center">Boolean</td>
<td>true</td>
<td>If true, show the scale.</td>
</tr>
<tr>
<td>id</td>
<td style="text-align:center">String</td>
<td>"y-axis-0"</td>
<td>Id of the axis so that data can bind to it.</td>
</tr>
<tr>
<td>stacked</td>
<td style="text-align:center">Boolean</td>
<td>false</td>
<td>If true, bars are stacked on the y-axis</td>
</tr>
</tbody>
</table>
</div>
 * 
 * @author Tomáš Rohrbacher (rohrbacher[at]elvoris.cz)
 */
public class BarScale extends Scale
{

	static public BarScale create ()
	{
		return new BarScale();
		//return JavaScriptObject.createObject().cast();
	}
	
	//
	//	REGEX
	//	<tr>\s*<td>(\w+)</td>\s*<td>(\w+)</td>\s*<td>(.*)</td>\s+<td>(.+)</td>\s*</tr>
	//	REPLACE-WITH
	//	\t/**\n\t * Default value: $3\n\t * <p>$4\n\t */\n\tpublic final native $2 get_$1 () /*-{\n\t\treturn this.$1;\n\t}-*/;\n\n\t/**\n\t * Default value: $3\n\t * <p>$4\n\t */\n\tpublic final native void set_$1 ($2 $1) /*-{\n\t\tthis.$1 = $1;\n\t}-*/;\n\n
	//
	
//	/**
//	 * Constructors must be 'protected' in subclasses of JavaScriptObject
//	 */
//	protected BarScale() {
//		super();
//	}

	/**
	 * Default constructors
	 */
	public BarScale() {
		super();
	}

	/**
	 * Default value: false
	 * <p>If true, bars are stacked on the x-axis
	 */
	public final native Boolean getStacked () /*-{
		return this.stacked;
	}-*/;

	/**
	 * Default value: false
	 * <p>If true, bars are stacked on the x-axis
	 */
	public final native void setStacked (Boolean stacked) /*-{
		this.stacked = stacked;
	}-*/;


	/**
	 * Only applies to X-Axes.
	 * <p>Default value: 0.8
	 * <p>Percent (0-1) of the available width (the space between the gridlines for small datasets) for each data-point to use for the bars. <a href="#bar-chart-barpercentage-vs-categorypercentage">Read More</a>
	 */
	public final native Double getCategoryPercentage () /*-{
		return this.categoryPercentage;
	}-*/;

	/**
	 * Only applies to X-Axes.
	 * <p>Default value: 0.8
	 * <p>Percent (0-1) of the available width (the space between the gridlines for small datasets) for each data-point to use for the bars. <a href="#bar-chart-barpercentage-vs-categorypercentage">Read More</a>
	 */
	public final native void setCategoryPercentage (Double categoryPercentage) /*-{
		this.categoryPercentage = categoryPercentage;
	}-*/;


	/**
	 * Only applies to X-Axes.
	 * <p>Default value: 0.9
	 * <p>Percent (0-1) of the available width each bar should be within the category percentage. 1.0 will take the whole category width and put the bars right next to each other. <a href="#bar-chart-barpercentage-vs-categorypercentage">Read More</a>
	 */
	public final native Double getBarPercentage () /*-{
		return this.barPercentage;
	}-*/;

	/**
	 * Only applies to X-Axes.
	 * <p>Default value: 0.9
	 * <p>Percent (0-1) of the available width each bar should be within the category percentage. 1.0 will take the whole category width and put the bars right next to each other. <a href="#bar-chart-barpercentage-vs-categorypercentage">Read More</a>
	 */
	public final native void setBarPercentage (Double barPercentage) /*-{
		this.barPercentage = barPercentage;
	}-*/;

}
