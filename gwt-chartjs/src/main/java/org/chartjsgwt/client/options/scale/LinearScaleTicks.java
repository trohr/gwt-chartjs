/**
 * 
 */
package org.chartjsgwt.client.options.scale;

/**
 * <h3 id="scales-linear-scale"><a class="fragment-link" href="#scales-linear-scale">Linear Scale</a></h3>
 * <p>
 * The linear scale is use to chart numerical data. It can be placed on either the x or y axis. 
 * The scatter chart type automatically configures a line chart to use one of these scales for the x axis. 
 * As the name suggests, linear interpolation is used to determine where a value lies on the axis.
 * </p>
 * <h4>Configuration Options</h4>
 * <p>The following options are provided by the linear scale. They are all located in the <code>ticks</code> sub options.</p>
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
<td>beginAtZero</td>
<td>Boolean</td>
<td>-</td>
<td>if true, scale will inclulde 0 if it is not already included.</td>
</tr>
<tr>
<td>min</td>
<td>Number</td>
<td>-</td>
<td>User defined minimum number for the scale, overrides minimum value from data.</td>
</tr>
<tr>
<td>max</td>
<td>Number</td>
<td>-</td>
<td>User defined maximum number for the scale, overrides maximum value from data.</td>
</tr>
<tr>
<td>maxTicksLimit</td>
<td>Number</td>
<td>11</td>
<td>Maximum number of ticks and gridlines to show. If not defined, it will limit to 11 ticks but will show all gridlines.</td>
</tr>
<tr>
<td>fixedStepSize</td>
<td>Number</td>
<td>-</td>
<td>User defined fixed step size for the scale. If set, the scale ticks will be enumerated by multiple of stepSize, having one tick per increment. If not set, the ticks are labeled automatically using the nice numbers algorithm.</td>
</tr>
<tr>
<td>stepSize</td>
<td>Number</td>
<td>-</td>
<td>if defined, it can be used along with the min and the max to give a custom number of steps. See the example below.</td>
</tr>
<tr>
<td>suggestedMax</td>
<td>Number</td>
<td>-</td>
<td>User defined maximum number for the scale, overrides maximum value <em>except for if</em> it is lower than the maximum value.</td>
</tr>
<tr>
<td>suggestedMin</td>
<td>Number</td>
<td>-</td>
<td>User defined minimum number for the scale, overrides minimum value <em>except for if</em> it is higher than the minimum value.</td>
</tr>
</tbody>
</table>
</div>
 * <h4>Example Configuration</h4>
 * <p>The following example creates a line chart with a vertical axis that goes from 0 to 5 in 0.5 sized steps.</p>
 * <pre><code class="lang-javascript"><span class="hljs-keyword">var</span> chartInstance = <span class="hljs-keyword">new</span> Chart(ctx, {
    type: <span class="hljs-string">'line'</span>,
    data: data,
    options: {
        scales: {
            yAxes: [{
                ticks: {
                    max: <span class="hljs-number">5</span>,
                    min: <span class="hljs-number">0</span>,
                    stepSize: <span class="hljs-number">0.5</span>
                }
            }]
        }
    }
});
</code></pre>

 * @author Tomáš Rohrbacher (rohrbacher[at]elvoris.cz)
 *
 */
public class LinearScaleTicks extends ScaleTicks
{

	static public LinearScaleTicks create()
	{
		return new LinearScaleTicks();
	}
	
	/**
	 * Default constructor
	 */
	public LinearScaleTicks() {
		super();
	}

	/**
	 * Default value: -
	 * <p>if true, scale will inclulde 0 if it is not already included.
	 */
	public final native Boolean getBeginAtZero () /*-{
		return this.beginAtZero;
	}-*/;

	/**
	 * Default value: -
	 * <p>if true, scale will inclulde 0 if it is not already included.
	 */
	public final native LinearScaleTicks setBeginAtZero (Boolean beginAtZero) /*-{
		this.beginAtZero = beginAtZero;
		return this;
	}-*/;


	/**
	 * Default value: -
	 * <p>User defined minimum number for the scale, overrides minimum value from data.
	 */
	public final native Double getMin () /*-{
		return this.min;
	}-*/;

	/**
	 * Default value: -
	 * <p>User defined minimum number for the scale, overrides minimum value from data.
	 */
	public final native LinearScaleTicks setMin (Double min) /*-{
		this.min = min;
		return this;
	}-*/;


	/**
	 * Default value: -
	 * <p>User defined maximum number for the scale, overrides maximum value from data.
	 */
	public final native Double getMax () /*-{
		return this.max;
	}-*/;

	/**
	 * Default value: -
	 * <p>User defined maximum number for the scale, overrides maximum value from data.
	 */
	public final native LinearScaleTicks setMax (Double max) /*-{
		this.max = max;
		return this;
	}-*/;


	/**
	 * Default value: 11
	 * <p>Maximum number of ticks and gridlines to show. If not defined, it will limit to 11 ticks but will show all gridlines.
	 */
	public final native Integer getMaxTicksLimit () /*-{
		return this.maxTicksLimit;
	}-*/;

	/**
	 * Default value: 11
	 * <p>Maximum number of ticks and gridlines to show. If not defined, it will limit to 11 ticks but will show all gridlines.
	 */
	public final LinearScaleTicks setMaxTicksLimit (Integer maxTicksLimit) {
		if (maxTicksLimit == null) {
			setMaxTicksLimitDefault();
		} else {
			setMaxTicksLimitInt(maxTicksLimit.intValue());
		}
		return this;
	}
	
	private final native void setMaxTicksLimitDefault () /*-{
		this.maxTicksLimit = null;
	}-*/;
	
	private final native void setMaxTicksLimitInt (int maxTicksLimit) /*-{
		this.maxTicksLimit = maxTicksLimit;
	}-*/;


	/**
	 * Default value: -
	 * <p>User defined fixed step size for the scale. If set, the scale ticks will be enumerated by multiple of stepSize, having one tick per increment. If not set, the ticks are labeled automatically using the nice numbers algorithm.
	 */
	public final native Double getFixedStepSize () /*-{
		return this.fixedStepSize;
	}-*/;

	/**
	 * Default value: -
	 * <p>User defined fixed step size for the scale. If set, the scale ticks will be enumerated by multiple of stepSize, having one tick per increment. If not set, the ticks are labeled automatically using the nice numbers algorithm.
	 */
	public final native LinearScaleTicks setFixedStepSize (Double fixedStepSize) /*-{
		this.fixedStepSize = fixedStepSize;
		return this;
	}-*/;


	/**
	 * Default value: -
	 * <p>if defined, it can be used along with the min and the max to give a custom number of steps. See the example below.
	 */
	public final native Double getStepSize () /*-{
		return this.stepSize;
	}-*/;

	/**
	 * Default value: -
	 * <p>if defined, it can be used along with the min and the max to give a custom number of steps. See the example below.
	 */
	public final native LinearScaleTicks setStepSize (Double stepSize) /*-{
		this.stepSize = stepSize;
		return this;
	}-*/;


	/**
	 * Default value: -
	 * <p>User defined maximum number for the scale, overrides maximum value <em>except for if</em> it is lower than the maximum value.
	 */
	public final native Double getSuggestedMax () /*-{
		return this.suggestedMax;
	}-*/;

	/**
	 * Default value: -
	 * <p>User defined maximum number for the scale, overrides maximum value <em>except for if</em> it is lower than the maximum value.
	 */
	public final native LinearScaleTicks setSuggestedMax (Double suggestedMax) /*-{
		this.suggestedMax = suggestedMax;
		return this;
	}-*/;


	/**
	 * Default value: -
	 * <p>User defined minimum number for the scale, overrides minimum value <em>except for if</em> it is higher than the minimum value.
	 */
	public final native Double getSuggestedMin () /*-{
		return this.suggestedMin;
	}-*/;

	/**
	 * Default value: -
	 * <p>User defined minimum number for the scale, overrides minimum value <em>except for if</em> it is higher than the minimum value.
	 */
	public final native LinearScaleTicks setSuggestedMin (Double suggestedMin) /*-{
		this.suggestedMin = suggestedMin;
		return this;
	}-*/;


}
