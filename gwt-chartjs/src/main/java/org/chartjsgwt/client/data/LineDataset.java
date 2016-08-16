package org.chartjsgwt.client.data;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayInteger;

/**
 * <h2 class="section-title"><a class="fragment-link" href="#line-chart">Line Chart</a></h2>
 * <div class="section-text">
			<h3 id="line-chart-introduction"><a class="fragment-link" href="#line-chart-introduction">Introduction</a></h3><p>A line chart is a way of plotting data points on a line. Often, it is used to show trend data, and the comparison of two data sets.</p>
<div class="canvas-holder"><iframe class="chartjs-hidden-iframe" style="width: 100%; display: block; border: 0px; height: 0px; margin: 0px; position: absolute; left: 0px; right: 0px; top: 0px; bottom: 0px;"></iframe>
    <canvas width="1788" height="894" style="display: block; width: 894px; height: 447px;"></canvas>
</div>

<h3 id="line-chart-example-usage"><a class="fragment-link" href="#line-chart-example-usage">Example Usage</a></h3><pre><code class="lang-javascript"><span class="hljs-keyword">var</span> myLineChart = <span class="hljs-keyword">new</span> Chart(ctx, {
    type: <span class="hljs-string">'line'</span>,
    data: data,
    options: options
});
</code></pre>
<p>Alternatively a line chart can be created using syntax similar to the v1.0 syntax</p>
<pre><code class="lang-javascript"><span class="hljs-keyword">var</span> myLineChart = Chart.Line(ctx, {
    data: data,
    options: options
});
</code></pre>
<h3 id="line-chart-data-structure"><a class="fragment-link" href="#line-chart-data-structure">Data Structure</a></h3><p>The following options can be included in a line chart dataset to configure options for that specific dataset.</p>
<p>All point* properties can be specified as an array. If these are set to an array value, the first value applies to the first point, the second value to the second point, and so on.</p>
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
<td>See <a href="#line-chart-data-points">data point</a> section</td>
<td>The data to plot in a line</td>
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
<td>fill</td>
<td><code>Boolean</code></td>
<td>If true, fill the area under the line</td>
</tr>
<tr>
<td>lineTension</td>
<td><code>Number</code></td>
<td>Bezier curve tension of the line. Set to 0 to draw straightlines. <em>Note</em> This was renamed from 'tension' but the old name still works.</td>
</tr>
<tr>
<td>backgroundColor</td>
<td><code>Color</code></td>
<td>The fill color under the line. See <a href="#chart-configuration-colors">Colors</a></td>
</tr>
<tr>
<td>borderWidth</td>
<td><code>Number</code></td>
<td>The width of the line in pixels</td>
</tr>
<tr>
<td>borderColor</td>
<td><code>Color</code></td>
<td>The color of the line.</td>
</tr>
<tr>
<td>borderCapStyle</td>
<td><code>String</code></td>
<td>Cap style of the line. See <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineCap" target="_blank">MDN</a></td>
</tr>
<tr>
<td>borderDash</td>
<td><code>Array&lt;Number&gt;</code></td>
<td>Length and spacing of dashes. See <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/setLineDash" target="_blank">MDN</a></td>
</tr>
<tr>
<td>borderDashOffset</td>
<td><code>Number</code></td>
<td>Offset for line dashes. See <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineDashOffset" target="_blank">MDN</a></td>
</tr>
<tr>
<td>borderJoinStyle</td>
<td><code>String</code></td>
<td>Line joint style. See <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineJoin" target="_blank">MDN</a></td>
</tr>
<tr>
<td>pointBorderColor</td>
<td><code>Color or Array&lt;Color&gt;</code></td>
<td>The border color for points.</td>
</tr>
<tr>
<td>pointBackgroundColor</td>
<td><code>Color or Array&lt;Color&gt;</code></td>
<td>The fill color for points</td>
</tr>
<tr>
<td>pointBorderWidth</td>
<td><code>Number or Array&lt;Number&gt;</code></td>
<td>The width of the point border in pixels</td>
</tr>
<tr>
<td>pointRadius</td>
<td><code>Number or Array&lt;Number&gt;</code></td>
<td>The radius of the point shape. If set to 0, nothing is rendered. </td>
</tr>
<tr>
<td>pointHoverRadius</td>
<td><code>Number or Array&lt;Number&gt;</code></td>
<td>The radius of the point when hovered</td>
</tr>
<tr>
<td>pointHitRadius</td>
<td><code>Number or Array&lt;Number&gt;</code></td>
<td>The pixel size of the non-displayed point that reacts to mouse events</td>
</tr>
<tr>
<td>pointHoverBackgroundColor</td>
<td><code>Color or Array&lt;Color&gt;</code></td>
<td>Point background color when hovered</td>
</tr>
<tr>
<td>pointHoverBorderColor</td>
<td><code>Color or Array&lt;Color&gt;</code></td>
<td>Point border color when hovered</td>
</tr>
<tr>
<td>pointHoverBorderWidth</td>
<td><code>Number or Array&lt;Number&gt;</code></td>
<td>Border width of point when hovered</td>
</tr>
<tr>
<td>pointStyle</td>
<td><code>String, Array&lt;String&gt;, Image, Array&lt;Image&gt;</code></td>
<td>The style of point. Options are 'circle', 'triangle', 'rect', 'rectRot', 'cross', 'crossRot', 'star', 'line', and 'dash'. If the option is an image, that image is drawn on the canvas using <code>drawImage</code>. </td>
</tr>
<tr>
<td>showLine</td>
<td><code>Boolean</code></td>
<td>If false, the line is not drawn for this dataset</td>
</tr>
<tr>
<td>spanGaps</td>
<td><code>Boolean</code></td>
<td>If true, lines will be drawn between points with no or null data</td>
</tr>
<tr>
<td>steppedLine</td>
<td><code>Boolean</code></td>
<td>If true, the line is shown as a steeped line and 'lineTension' will be ignored</td>
</tr>
</tbody>
</table>
</div><p>An example data object using these attributes is shown below.</p>
<pre><code class="lang-javascript"><span class="hljs-keyword">var</span> data = {
    labels: [<span class="hljs-string">"January"</span>, <span class="hljs-string">"February"</span>, <span class="hljs-string">"March"</span>, <span class="hljs-string">"April"</span>, <span class="hljs-string">"May"</span>, <span class="hljs-string">"June"</span>, <span class="hljs-string">"July"</span>],
    datasets: [
        {
            label: <span class="hljs-string">"My First dataset"</span>,
            fill: <span class="hljs-literal">false</span>,
            lineTension: <span class="hljs-number">0.1</span>,
            backgroundColor: <span class="hljs-string">"rgba(75,192,192,0.4)"</span>,
            borderColor: <span class="hljs-string">"rgba(75,192,192,1)"</span>,
            borderCapStyle: <span class="hljs-string">'butt'</span>,
            borderDash: [],
            borderDashOffset: <span class="hljs-number">0.0</span>,
            borderJoinStyle: <span class="hljs-string">'miter'</span>,
            pointBorderColor: <span class="hljs-string">"rgba(75,192,192,1)"</span>,
            pointBackgroundColor: <span class="hljs-string">"#fff"</span>,
            pointBorderWidth: <span class="hljs-number">1</span>,
            pointHoverRadius: <span class="hljs-number">5</span>,
            pointHoverBackgroundColor: <span class="hljs-string">"rgba(75,192,192,1)"</span>,
            pointHoverBorderColor: <span class="hljs-string">"rgba(220,220,220,1)"</span>,
            pointHoverBorderWidth: <span class="hljs-number">2</span>,
            pointRadius: <span class="hljs-number">1</span>,
            pointHitRadius: <span class="hljs-number">10</span>,
            data: [<span class="hljs-number">65</span>, <span class="hljs-number">59</span>, <span class="hljs-number">80</span>, <span class="hljs-number">81</span>, <span class="hljs-number">56</span>, <span class="hljs-number">55</span>, <span class="hljs-number">40</span>],
            spanGaps: <span class="hljs-literal">false</span>,
        }
    ]
};
</code></pre>
<p>The line chart usually requires an array of labels. This labels are shown on the X axis. There must be one label for each data point. More labels than datapoints are allowed, in which case the line ends at the last data point.
The data for line charts is broken up into an array of datasets. Each dataset has a colour for the fill, a colour for the line and colours for the points and strokes of the points. These colours are strings just like CSS. You can use RGBA, RGB, HEX or HSL notation.</p>
<p>The label key on each dataset is optional, and can be used when generating a scale for the chart.</p>
<p>When <code>spanGaps</code> is set to true, the gaps between points in sparse datasets are filled in. By default, it is off.</p>
<h3 id="line-chart-data-points"><a class="fragment-link" href="#line-chart-data-points">Data Points</a></h3><p>The data passed to the chart can be passed in two formats. The most common method is to pass the data array as an array of numbers. In this case, the <code>data.labels</code> array must be specified and must contain a label for each point or, in the case of labels to be displayed over multiple lines an array of labels (one for each line) i.e <code>[["June","2015"], "July"]</code>.</p>
<p>The alternate is used for sparse datasets. Data is specified using an object containing <code>x</code> and <code>y</code> properties. This is used for scatter charts as documented below.</p>
<h3 id="line-chart-scatter-line-charts"><a class="fragment-link" href="#line-chart-scatter-line-charts">Scatter Line Charts</a></h3><p>Scatter line charts can be created by changing the X axis to a linear axis. To use a scatter chart, data must be passed as objects containing X and Y properties. The example below creates a scatter chart with 3 points.</p>
<pre><code class="lang-javascript"><span class="hljs-keyword">var</span> scatterChart = <span class="hljs-keyword">new</span> Chart(ctx, {
    type: <span class="hljs-string">'line'</span>,
    data: {
        datasets: [{
            label: <span class="hljs-string">'Scatter Dataset'</span>,
            data: [{
                x: <span class="hljs-number">-10</span>,
                y: <span class="hljs-number">0</span>
            }, {
                x: <span class="hljs-number">0</span>,
                y: <span class="hljs-number">10</span>
            }, {
                x: <span class="hljs-number">10</span>,
                y: <span class="hljs-number">5</span>
            }]
        }]
    },
    options: {
        scales: {
            xAxes: [{
                type: <span class="hljs-string">'linear'</span>,
                position: <span class="hljs-string">'bottom'</span>
            }]
        }
    }
});
</code></pre>
<h3 id="line-chart-chart-options"><a class="fragment-link" href="#line-chart-chart-options">Chart Options</a></h3><p>These are the customisation options specific to Line charts. These options are merged with the <a href="#chart-configuration-global-configuration">global chart configuration options</a>, and form the options of the chart.</p>
<div class="table-wrapper"><table>
<thead>
<tr>
<th>Name</th>
<th>Type</th>
<th>Default</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>showLines</td>
<td>Boolean</td>
<td>true</td>
<td>If false, the lines between points are not drawn</td>
</tr>
<tr>
<td>spanGaps</td>
<td>Boolean</td>
<td>false</td>
<td>If true, NaN data does not break the line </td>
</tr>
</tbody>
</table>
</div><p>You can override these for your <code>Chart</code> instance by passing a member <code>options</code> into the <code>Line</code> method.</p>
<p>For example, we could have a line chart display without an X axis by doing the following. The config merge is smart enough to handle arrays so that you do not need to specify all axis settings to change one thing.</p>
<pre><code class="lang-javascript"><span class="hljs-keyword">new</span> Chart(ctx, {
    type: <span class="hljs-string">'line'</span>,
    data: data,
    options: {
        scales: {
            xAxes: [{
                display: <span class="hljs-literal">false</span>
            }]
        }
    }
});
</code></pre>
<p>We can also change these defaults values for each Line type that is created, this object is available at <code>Chart.defaults.line</code>.</p>
<h3 id="line-chart-stacked-charts"><a class="fragment-link" href="#line-chart-stacked-charts">Stacked Charts</a></h3><p>Stacked area charts can be created by setting the Y axis to a stacked configuration. The following example would have stacked lines.</p>
<pre><code class="lang-javascript"><span class="hljs-keyword">var</span> stackedLine = <span class="hljs-keyword">new</span> Chart(ctx, {
    type: <span class="hljs-string">'line'</span>,
    data: data,
    options: {
        scales: {
            yAxes: [{
                stacked: <span class="hljs-literal">true</span>
            }]
        }
    }
});
</code></pre>

</div>
 * 
 * @author Tomáš Rohrbacher (rohrbacher[at]elvoris.cz)
 *
 */
public class LineDataset extends AreaDataset
{
	static final public LineDataset create ()
	{
		final LineDataset r = JavaScriptObject.createObject().cast();
		r.setType("line");
		return r;
	}
	
	protected LineDataset() {
	}


	
	//
	// Line data
	//

	/**
	 * If true, fill the area under the line
	 */
	public final native Boolean getFill () /*-{
		return this.fill;
	}-*/;

	/**
	 * If true, fill the area under the line
	 */
	public final native void setFill (Boolean fill) /*-{
		this.fill = fill;
	}-*/;


	/**
	 * Bezier curve tension of the line. Set to 0 to draw straightlines. <em>Note</em> This was renamed from 'tension' but the old name still works.
	 */
	public final native Double getLineTension () /*-{
		return this.lineTension;
	}-*/;

	/**
	 * Bezier curve tension of the line. Set to 0 to draw straightlines. <em>Note</em> This was renamed from 'tension' but the old name still works.
	 */
	public final native void setLineTension (Double lineTension) /*-{
		this.lineTension = lineTension;
	}-*/;


	/**
	 * The fill color under the line. See <a href="#chart-configuration-colors">Colors</a>
	 */
	public final native String getBackgroundColor () /*-{
		return this.backgroundColor;
	}-*/;

	/**
	 * The fill color under the line. See <a href="#chart-configuration-colors">Colors</a>
	 */
	public final native void setBackgroundColor (String backgroundColor) /*-{
		this.backgroundColor = backgroundColor;
	}-*/;


	/**
	 * The width of the line in pixels
	 */
	public final native Integer getBorderWidth () /*-{
		return this.borderWidth;
	}-*/;

	/**
	 * The width of the line in pixels
	 */
	public final native void setBorderWidth (Integer borderWidth) /*-{
		this.borderWidth = borderWidth;
	}-*/;


	/**
	 * The color of the line.
	 */
	public final native String getBorderColor () /*-{
		return this.borderColor;
	}-*/;

	/**
	 * The color of the line.
	 */
	public final native void setBorderColor (String borderColor) /*-{
		this.borderColor = borderColor;
	}-*/;


	/**
	 * Cap style of the line. See <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineCap" target="_blank">MDN</a>
	 */
	public final native String getBorderCapStyle () /*-{
		return this.borderCapStyle;
	}-*/;

	/**
	 * Cap style of the line. See <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineCap" target="_blank">MDN</a>
	 */
	public final native void setBorderCapStyle (String borderCapStyle) /*-{
		this.borderCapStyle = borderCapStyle;
	}-*/;


	/**
	 * Type: Array&lt;Number&gt;
	 * <p>Length and spacing of dashes. See <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/setLineDash" target="_blank">MDN</a>
	 */
	public final native JsArrayInteger getBorderDash () /*-{
		return this.borderDash;
	}-*/;

	/**
	 * Type: Array&lt;Number&gt;
	 * <p>Length and spacing of dashes. See <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/setLineDash" target="_blank">MDN</a>
	 */
	public final native void setBorderDash (JsArrayInteger borderDash) /*-{
		this.borderDash = borderDash;
	}-*/;


	/**
	 * Offset for line dashes. See <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineDashOffset" target="_blank">MDN</a>
	 */
	public final native Double getBorderDashOffset () /*-{
		return this.borderDashOffset;
	}-*/;

	/**
	 * Offset for line dashes. See <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineDashOffset" target="_blank">MDN</a>
	 */
	public final native void setBorderDashOffset (Double borderDashOffset) /*-{
		this.borderDashOffset = borderDashOffset;
	}-*/;


	/**
	 * Line joint style. See <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineJoin" target="_blank">MDN</a>
	 */
	public final native String getBorderJoinStyle () /*-{
		return this.borderJoinStyle;
	}-*/;

	/**
	 * Line joint style. See <a href="https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/lineJoin" target="_blank">MDN</a>
	 */
	public final native void setBorderJoinStyle (String borderJoinStyle) /*-{
		this.borderJoinStyle = borderJoinStyle;
	}-*/;


	/**
	 * Type: Color or Array&lt;Color&gt;
	 * <p>The border color for points.
	 * <p>TODO version with array
	 */
	public final native String getPointBorderColor () /*-{
		return this.pointBorderColor;
	}-*/;

	/**
	 * Type: Color or Array&lt;Color&gt;
	 * <p>The border color for points.
	 * <p>TODO version with array
	 */
	public final native void setPointBorderColor (String pointBorderColor) /*-{
		this.pointBorderColor = pointBorderColor;
	}-*/;


	/**
	 * Type: Color or Array&lt;Color&gt;
	 * <p>The fill color for points
	 * <p>TODO version with array
	 */
	public final native String getPointBackgroundColor () /*-{
		return this.pointBackgroundColor;
	}-*/;

	/**
	 * Type: Color or Array&lt;Color&gt;
	 * <p>The fill color for points
	 * <p>TODO version with array
	 */
	public final native void setPointBackgroundColor (String pointBackgroundColor) /*-{
		this.pointBackgroundColor = pointBackgroundColor;
	}-*/;


	/**
	 * Type: Number or Array&lt;Number&gt;
	 * <p>The width of the point border in pixels
	 * <p>TODO version with array
	 */
	public final native Integer getPointBorderWidth () /*-{
		return this.pointBorderWidth;
	}-*/;

	/**
	 * Type: Number or Array&lt;Number&gt;
	 * <p>The width of the point border in pixels
	 * <p>TODO version with array
	 */
	public final native void setPointBorderWidth (Integer pointBorderWidth) /*-{
		this.pointBorderWidth = pointBorderWidth;
	}-*/;


	/**
	 * Type: Number or Array&lt;Number&gt;
	 * <p>The radius of the point shape. If set to 0, nothing is rendered. 
	 * <p>TODO version with array
	 */
	public final native Integer getPointRadius () /*-{
		return this.pointRadius;
	}-*/;

	/**
	 * Type: Number or Array&lt;Number&gt;
	 * <p>The radius of the point shape. If set to 0, nothing is rendered. 
	 * <p>TODO version with array
	 */
	public final native void setPointRadius (Integer pointRadius) /*-{
		this.pointRadius = pointRadius;
	}-*/;


	/**
	 * Type: Number or Array&lt;Number&gt;
	 * <p>The radius of the point when hovered
	 * <p>TODO version with array
	 */
	public final native Integer getPointHoverRadius () /*-{
		return this.pointHoverRadius;
	}-*/;

	/**
	 * Type: Number or Array&lt;Number&gt;
	 * <p>The radius of the point when hovered
	 * <p>TODO version with array
	 */
	public final native void setPointHoverRadius (Integer pointHoverRadius) /*-{
		this.pointHoverRadius = pointHoverRadius;
	}-*/;


	/**
	 * Type: Number or Array&lt;Number&gt;
	 * <p>The pixel size of the non-displayed point that reacts to mouse events
	 */
	public final native Integer getPointHitRadius () /*-{
		return this.pointHitRadius;
	}-*/;

	/**
	 * Type: Number or Array&lt;Number&gt;
	 * <p>The pixel size of the non-displayed point that reacts to mouse events
	 * <p>TODO version with array
	 */
	public final native void setPointHitRadius (Integer pointHitRadius) /*-{
		this.pointHitRadius = pointHitRadius;
	}-*/;


	/**
	 * Type: Color or Array&lt;Color&gt;
	 * <p>Point background color when hovered
	 * <p>TODO version with array
	 */
	public final native String getPointHoverBackgroundColor () /*-{
		return this.pointHoverBackgroundColor;
	}-*/;

	/**
	 * Type: Color or Array&lt;Color&gt;
	 * <p>Point background color when hovered
	 * <p>TODO version with array
	 */
	public final native void setPointHoverBackgroundColor (String pointHoverBackgroundColor) /*-{
		this.pointHoverBackgroundColor = pointHoverBackgroundColor;
	}-*/;


	/**
	 * Type: Color or Array&lt;Color&gt;
	 * <p>Point border color when hovered
	 * <p>TODO version with array
	 */
	public final native String getPointHoverBorderColor () /*-{
		return this.pointHoverBorderColor;
	}-*/;

	/**
	 * Type: Color or Array&lt;Color&gt;
	 * <p>Point border color when hovered
	 * <p>TODO version with array
	 */
	public final native void setPointHoverBorderColor (String pointHoverBorderColor) /*-{
		this.pointHoverBorderColor = pointHoverBorderColor;
	}-*/;


	/**
	 * Type: Number or Array&lt;Number&gt;
	 * <p>Border width of point when hovered
	 * <p>TODO version with array
	 */
	public final native Integer getPointHoverBorderWidth () /*-{
		return this.pointHoverBorderWidth;
	}-*/;

	/**
	 * Type: Number or Array&lt;Number&gt;
	 * <p>Border width of point when hovered
	 * <p>TODO version with array
	 */
	public final native void setPointHoverBorderWidth (Integer pointHoverBorderWidth) /*-{
		this.pointHoverBorderWidth = pointHoverBorderWidth;
	}-*/;


	/**
	 * Type: String, Array&lt;String&gt;, Image, Array&lt;Image&gt;
	 * <p>The style of point. Options are 'circle', 'triangle', 'rect', 'rectRot', 'cross', 'crossRot', 'star', 'line', and 'dash'. If the option is an image, that image is drawn on the canvas using <code>drawImage</code>.
	 * <p>TODO version with array 
	 */
	public final native String getPointStyle () /*-{
		return this.pointStyle;
	}-*/;

	/**
	 * Type: String, Array&lt;String&gt;, Image, Array&lt;Image&gt;
	 * <p>The style of point. Options are 'circle', 'triangle', 'rect', 'rectRot', 'cross', 'crossRot', 'star', 'line', and 'dash'. If the option is an image, that image is drawn on the canvas using <code>drawImage</code>.
	 * <p>TODO version with array 
	 */
	public final native void setPointStyle (String pointStyle) /*-{
		this.pointStyle = pointStyle;
	}-*/;


	/**
	 * If false, the line is not drawn for this dataset
	 */
	public final native Boolean getShowLine () /*-{
		return this.showLine;
	}-*/;

	/**
	 * If false, the line is not drawn for this dataset
	 */
	public final native void setShowLine (Boolean showLine) /*-{
		this.showLine = showLine;
	}-*/;


	/**
	 * If true, lines will be drawn between points with no or null data
	 */
	public final native Boolean getSpanGaps () /*-{
		return this.spanGaps;
	}-*/;

	/**
	 * If true, lines will be drawn between points with no or null data
	 */
	public final native void setSpanGaps (Boolean spanGaps) /*-{
		this.spanGaps = spanGaps;
	}-*/;


	/**
	 * If true, the line is shown as a steeped line and 'lineTension' will be ignored
	 */
	public final native Boolean getSteppedLine () /*-{
		return this.steppedLine;
	}-*/;

	/**
	 * If true, the line is shown as a steeped line and 'lineTension' will be ignored
	 */
	public final native void setSteppedLine (Boolean steppedLine) /*-{
		this.steppedLine = steppedLine;
	}-*/;



}
