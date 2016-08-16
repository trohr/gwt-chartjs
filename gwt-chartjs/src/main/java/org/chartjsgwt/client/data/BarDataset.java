package org.chartjsgwt.client.data;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <h2 class="section-title"><a class="fragment-link" href="#bar-chart">Bar Chart</a></h2>
 * <div class="section-text">
			<h3 id="bar-chart-introduction"><a class="fragment-link" href="#bar-chart-introduction">Introduction</a></h3><p>A bar chart is a way of showing data as bars.</p>
<p>It is sometimes used to show trend data, and the comparison of multiple data sets side by side.</p>
<div class="canvas-holder"><iframe class="chartjs-hidden-iframe" style="width: 100%; display: block; border: 0px; height: 0px; margin: 0px; position: absolute; left: 0px; right: 0px; top: 0px; bottom: 0px;"></iframe>
    <canvas width="1788" height="894" style="display: block; width: 894px; height: 447px;"></canvas>
</div>

<h3 id="bar-chart-example-usage"><a class="fragment-link" href="#bar-chart-example-usage">Example Usage</a></h3><pre><code class="lang-javascript"><span class="hljs-keyword">var</span> myBarChart = <span class="hljs-keyword">new</span> Chart(ctx, {
    type: <span class="hljs-string">'bar'</span>,
    data: data,
    options: options
});
</code></pre>
<p>Or if you want horizontal bars.</p>
<pre><code class="lang-javascript"><span class="hljs-keyword">var</span> myBarChart = <span class="hljs-keyword">new</span> Chart(ctx, {
    type: <span class="hljs-string">'horizontalBar'</span>,
    data: data,
    options: options
});
</code></pre>
<h3 id="bar-chart-data-structure"><a class="fragment-link" href="#bar-chart-data-structure">Data Structure</a></h3><p>The following options can be included in a bar chart dataset to configure options for that specific dataset.</p>
<p>Some properties can be specified as an array. If these are set to an array value, the first value applies to the first bar, the second value to the second bar, and so on.</p>
<div class="table-wrapper"><table>
<thead>
<tr>
<th>Property</th>
<th>Type</th>
<th>Usage</th>
</tr>
</thead>
<tbody>
<tr>
<td>data</td>
<td><code>Array&lt;Number&gt;</code></td>
<td>The data to plot as bars</td>
</tr>
<tr>
<td>label</td>
<td><code>String</code></td>
<td>The label for the dataset which appears in the legend and tooltips</td>
</tr>
<tr>
<td>xAxisID</td>
<td><code>String</code></td>
<td>The ID of the x axis to plot this dataset on</td>
</tr>
<tr>
<td>yAxisID</td>
<td><code>String</code></td>
<td>The ID of the y axis to plot this dataset on</td>
</tr>
<tr>
<td>backgroundColor</td>
<td><code>Color or Array&lt;Color&gt;</code></td>
<td>The fill color of the bars. See <a href="#chart-configuration-colors">Colors</a></td>
</tr>
<tr>
<td>borderColor</td>
<td><code>Color or Array&lt;Color&gt;</code></td>
<td>Bar border color</td>
</tr>
<tr>
<td>borderWidth</td>
<td><code>Number or Array&lt;Number&gt;</code></td>
<td>Border width of bar in pixels</td>
</tr>
<tr>
<td>borderSkipped</td>
<td><code>String or Array&lt;String&gt;</code></td>
<td>Which edge to skip drawing the border for. Options are 'bottom', 'left', 'top', and 'right'</td>
</tr>
<tr>
<td>hoverBackgroundColor</td>
<td><code>Color or Array&lt;Color&gt;</code></td>
<td>Bar background color when hovered</td>
</tr>
<tr>
<td>hoverBorderColor</td>
<td><code>Color or Array&lt;Color&gt;</code></td>
<td>Bar border color when hovered</td>
</tr>
<tr>
<td>hoverBorderWidth</td>
<td><code>Number or Array&lt;Number&gt;</code></td>
<td>Border width of bar when hovered</td>
</tr>
</tbody>
</table>
</div><p>An example data object using these attributes is shown below.</p>
<pre><code class="lang-javascript"><span class="hljs-keyword">var</span> data = {
    labels: [<span class="hljs-string">"January"</span>, <span class="hljs-string">"February"</span>, <span class="hljs-string">"March"</span>, <span class="hljs-string">"April"</span>, <span class="hljs-string">"May"</span>, <span class="hljs-string">"June"</span>, <span class="hljs-string">"July"</span>],
    datasets: [
        {
            label: <span class="hljs-string">"My First dataset"</span>,
            backgroundColor: [
                <span class="hljs-string">'rgba(255, 99, 132, 0.2)'</span>,
                <span class="hljs-string">'rgba(54, 162, 235, 0.2)'</span>,
                <span class="hljs-string">'rgba(255, 206, 86, 0.2)'</span>,
                <span class="hljs-string">'rgba(75, 192, 192, 0.2)'</span>,
                <span class="hljs-string">'rgba(153, 102, 255, 0.2)'</span>,
                <span class="hljs-string">'rgba(255, 159, 64, 0.2)'</span>
            ],
            borderColor: [
                <span class="hljs-string">'rgba(255,99,132,1)'</span>,
                <span class="hljs-string">'rgba(54, 162, 235, 1)'</span>,
                <span class="hljs-string">'rgba(255, 206, 86, 1)'</span>,
                <span class="hljs-string">'rgba(75, 192, 192, 1)'</span>,
                <span class="hljs-string">'rgba(153, 102, 255, 1)'</span>,
                <span class="hljs-string">'rgba(255, 159, 64, 1)'</span>
            ],
            borderWidth: <span class="hljs-number">1</span>,
            data: [<span class="hljs-number">65</span>, <span class="hljs-number">59</span>, <span class="hljs-number">80</span>, <span class="hljs-number">81</span>, <span class="hljs-number">56</span>, <span class="hljs-number">55</span>, <span class="hljs-number">40</span>],
        }
    ]
};
</code></pre>
<p>The bar chart has the a very similar data structure to the line chart, and has an array of datasets, each with colours and an array of data.
We have an array of labels too for display. In the example, we are showing the same data as the previous line chart example.</p>
<h3 id="bar-chart-chart-options"><a class="fragment-link" href="#bar-chart-chart-options">Chart Options</a></h3><p>These are the customisation options specific to Bar charts. These options are merged with the <a href="#global-chart-configuration">global chart configuration options</a>, and form the options of the chart.</p>
<p>The default options for bar chart are defined in <code>Chart.defaults.bar</code>.</p>
<div class="table-wrapper"><table>
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
</div><p>You can override these for your <code>Chart</code> instance by passing a second argument into the <code>Bar</code> method as an object with the keys you want to override.</p>
<p>For example, we could have a bar chart without a stroke on each bar by doing the following:</p>
<pre><code class="lang-javascript"><span class="hljs-keyword">new</span> Chart(ctx, {
    type: <span class="hljs-string">"bar"</span>,
    data: data,
    options: {
        scales: {
                xAxes: [{
                        stacked: <span class="hljs-literal">true</span>
                }],
                yAxes: [{
                        stacked: <span class="hljs-literal">true</span>
                }]
            }
        }
    }
});
<span class="hljs-comment">// This will create a chart with all of the default options, merged from the global config,</span>
<span class="hljs-comment">//  and the Bar chart defaults but this particular instance will have `stacked` set to true</span>
<span class="hljs-comment">// for both x and y axes.</span>
</code></pre>
<p>We can also change these defaults values for each Bar type that is created, this object is available at <code>Chart.defaults.bar</code>. For horizontal bars, this object is available at <code>Chart.defaults.horizontalBar</code>.</p>
<p>The default options for horizontal bar charts are defined in <code>Chart.defaults.horizontalBar</code> and are same as those of the bar chart, but with <code>xAxes</code> and <code>yAxes</code> swapped and the following additional options.</p>
<div class="table-wrapper"><table>
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
<td><em>Options for xAxes</em></td>
<td style="text-align:center"></td>
<td></td>
<td></td>
</tr>
<tr>
<td>position</td>
<td style="text-align:center">String</td>
<td>"bottom"</td>
<td></td>
</tr>
<tr>
<td><em>Options for yAxes</em></td>
<td style="text-align:center"></td>
<td></td>
<td></td>
</tr>
<tr>
<td>position</td>
<td style="text-align:center">String</td>
<td>"left"</td>
<td></td>
</tr>
</tbody>
</table>
</div><h3 id="bar-chart-barpercentage-vs-categorypercentage"><a class="fragment-link" href="#bar-chart-barpercentage-vs-categorypercentage">barPercentage vs categoryPercentage</a></h3><p>The following shows the relationship between the bar percentage option and the category percentage option.</p>
<pre><code class="lang-text">// categoryPercentage: 1.0
// barPercentage: 1.0
Bar:        | 1.0 | 1.0 |
Category:   |    1.0    |   
Sample:     |===========|

// categoryPercentage: 1.0
// barPercentage: 0.5
Bar:          |.5|  |.5|
Category:  |      1.0     |   
Sample:    |==============|

// categoryPercentage: 0.5
// barPercentage: 1.0
Bar:            |1.||1.|
Category:       |  .5  |   
Sample:     |==============|
</code></pre>

</div>
 * @author Tomáš Rohrbacher (rohrbacher[at]elvoris.cz)
 *
 */
public class BarDataset extends AreaDataset
{
	static final public BarDataset create ()
	{
		final BarDataset r = JavaScriptObject.createObject().cast();
		r.setType("bar");
		return r;
	}
	
	protected BarDataset() {
	}


	//
	// Bar data
	//

	/**
	 * The fill color of the bars. See <a href="#chart-configuration-colors">Colors</a>
	 * <p>
	 * TODO version with array
	 * <p>See <a href="http://www.chartjs.org/docs/#bar-chart-data-structure">documentation</a>.
	 */
	public final native String getBackgroundColor () /*-{
		return this.backgroundColor;
	}-*/;

	/**
	 * The fill color of the bars. See <a href="#chart-configuration-colors">Colors</a>
	 * <p>
	 * TODO version with array
	 * <p>See <a href="http://www.chartjs.org/docs/#bar-chart-data-structure">documentation</a>.
	 */
	public final native void setBackgroundColor (String backgroundColor) /*-{
		this.backgroundColor = backgroundColor;
	}-*/;


	/**
	 * Bar border color
	 * <p>
	 * TODO version with array
	 */
	public final native String getBorderColor () /*-{
		return this.borderColor;
	}-*/;

	/**
	 * Bar border color
	 * <p>
	 * TODO version with array
	 */
	public final native void setBorderColor (String borderColor) /*-{
		this.borderColor = borderColor;
	}-*/;


	/**
	 * Border width of bar in pixels
	 * <p>
	 * TODO version with array
	 */
	public final native Integer getBorderWidth () /*-{
		return this.borderWidth;
	}-*/;

	/**
	 * Border width of bar in pixels
	 * <p>
	 * TODO version with array
	 */
	public final native void setBorderWidth (Integer borderWidth) /*-{
		this.borderWidth = borderWidth;
	}-*/;


	/**
	 * Which edge to skip drawing the border for. Options are 'bottom', 'left', 'top', and 'right'
	 * <p>
	 * TODO version with array
	 */
	public final native String getBorderSkipped () /*-{
		return this.borderSkipped;
	}-*/;

	/**
	 * Which edge to skip drawing the border for. Options are 'bottom', 'left', 'top', and 'right'
	 * <p>TODO version with array
	 */
	public final native void setBorderSkipped (String borderSkipped) /*-{
		this.borderSkipped = borderSkipped;
	}-*/;


	/**
	 * Bar background color when hovered
	 * <p>
	 * TODO version with array
	 */
	public final native String getHoverBackgroundColor () /*-{
		return this.hoverBackgroundColor;
	}-*/;

	/**
	 * Bar background color when hovered
	 * <p>
	 * TODO version with array
	 */
	public final native void setHoverBackgroundColor (String hoverBackgroundColor) /*-{
		this.hoverBackgroundColor = hoverBackgroundColor;
	}-*/;


	/**
	 * Bar border color when hovered
	 * <p>
	 * TODO version with array
	 */
	public final native String getHoverBorderColor () /*-{
		return this.hoverBorderColor;
	}-*/;

	/**
	 * Bar border color when hovered
	 * <p>
	 * TODO version with array
	 */
	public final native void setHoverBorderColor (String hoverBorderColor) /*-{
		this.hoverBorderColor = hoverBorderColor;
	}-*/;


	/**
	 * Border width of bar when hovered
	 * <p>
	 * TODO version with array
	 */
	public final native Integer getHoverBorderWidth () /*-{
		return this.hoverBorderWidth;
	}-*/;

	/**
	 * Border width of bar when hovered
	 * <p>
	 * TODO version with array
	 */
	public final native void setHoverBorderWidth (Integer hoverBorderWidth) /*-{
		this.hoverBorderWidth = hoverBorderWidth;
	}-*/;


}
