/**
 * 
 */
package org.chartjsgwt.client.options;

/**
 * <h3 id="line-chart-chart-options"><a class="fragment-link" href="#line-chart-chart-options">Line Chart Options</a></h3>
 * <p>These are the customisation options specific to Line charts. 
 * These options are merged with the <a href="#chart-configuration-global-configuration">global chart configuration options</a>, 
 * and form the options of the chart.</p>
 * <div class="table-wrapper"><table>
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
</div>
 * <p>You can override these for your <code>Chart</code> instance by passing a member <code>options</code> into the <code>Line</code> method.</p>
 * <p>For example, we could have a line chart display without an X axis by doing the following. The config merge is smart enough to handle arrays so that you do not need to specify all axis settings to change one thing.</p>
 * <pre><code class="lang-javascript"><span class="hljs-keyword">new</span> Chart(ctx, {
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
 * <p>We can also change these defaults values for each Line type that is created, this object is available at <code>Chart.defaults.line</code>.</p>
 * 
 * @author Tomáš Rohrbacher (rohrbacher[at]elvoris.cz)
 */
public class LineChartOptions extends AreaChartOptions {

	static public LineChartOptions create()
	{
		return new LineChartOptions();
		//return JavaScriptObject.createObject().cast();
	}
	
	/**
	 * Constructors must be 'protected' in subclasses of JavaScriptObject
	 */
	protected LineChartOptions() {
		super();
	}

	/**
	 * Default value: true
	 * <p>If false, the lines between points are not drawn
	 */
	public final native Boolean getShowLines () /*-{
		return this.showLines;
	}-*/;

	/**
	 * Default value: true
	 * <p>If false, the lines between points are not drawn
	 */
	public final native void setShowLines (Boolean showLines) /*-{
		this.showLines = showLines;
	}-*/;


	/**
	 * Default value: false
	 * <p>If true, NaN data does not break the line 
	 */
	public final native Boolean getSpanGaps () /*-{
		return this.spanGaps;
	}-*/;

	/**
	 * Default value: false
	 * <p>If true, NaN data does not break the line 
	 */
	public final native void setSpanGaps (Boolean spanGaps) /*-{
		this.spanGaps = spanGaps;
	}-*/;

}
