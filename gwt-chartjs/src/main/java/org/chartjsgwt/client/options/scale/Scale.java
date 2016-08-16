/**
 * 
 */
package org.chartjsgwt.client.options.scale;

import org.chartjsgwt.client.IsJavaScriptObject;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <h2 class="section-title"><a class="fragment-link" href="#scales">Scales</a></h2>
 * <p>Scales in v2.0 of Chart.js are significantly more powerful, but also different than those of v1.0.</p>
 * <ul>
 * 	<li>Multiple X &amp; Y axes are supported.</li>
 * 	<li>A built-in label auto-skip feature detects would-be overlapping ticks and labels and removes every nth label to keep things displaying normally.</li>
 * 	<li>Scale titles are supported</li>
 * 	<li>New scale types can be extended without writing an entirely new chart type</li>
 * 	</ul>
 * 
 * <h3 id="scales-common-configuration"><a class="fragment-link" href="#scales-common-configuration">Common Configuration</a></h3>
 * <p>Every scale extends a core scale class with the following options:</p>
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
<td>type</td>
<td>String</td>
<td>Chart specific.</td>
<td>Type of scale being employed. Custom scales can be created and registered with a string key. Options: <a href="#scales-category-scale">"category"</a>, <a href="#scales-linear-scale">"linear"</a>, <a href="#scales-logarithmic-scale">"logarithmic"</a>, <a href="#scales-time-scale">"time"</a>, <a href="#scales-radial-linear-scale">"radialLinear"</a></td>
</tr>
<tr>
<td>display</td>
<td>Boolean</td>
<td>true</td>
<td>If true, show the scale including gridlines, ticks, and labels. Overrides <em>gridLines.display</em>, <em>scaleLabel.display</em>, and <em>ticks.display</em>.</td>
</tr>
<tr>
<td>position</td>
<td>String</td>
<td>"left"</td>
<td>Position of the scale. Possible values are 'top', 'left', 'bottom' and 'right'.</td>
</tr>
<tr>
<td>id</td>
<td>String</td>
<td></td>
<td>The ID is used to link datasets and scale axes together. The properties <code>datasets.xAxisID</code> or <code>datasets.yAxisID</code> have to match the scale properties <code>scales.xAxes.id</code> or <code>scales.yAxes.id</code>. This is especially needed if multi-axes charts are used.</td>
</tr>
<tr>
<td>beforeUpdate</td>
<td>Function</td>
<td>undefined</td>
<td>Callback called before the update process starts. Passed a single argument, the scale instance.</td>
</tr>
<tr>
<td>beforeSetDimensions</td>
<td>Function</td>
<td>undefined</td>
<td>Callback that runs before dimensions are set. Passed a single argument, the scale instance.</td>
</tr>
<tr>
<td>afterSetDimensions</td>
<td>Function</td>
<td>undefined</td>
<td>Callback that runs after dimensions are set. Passed a single argument, the scale instance.</td>
</tr>
<tr>
<td>beforeDataLimits</td>
<td>Function</td>
<td>undefined</td>
<td>Callback that runs before data limits are determined. Passed a single argument, the scale instance.</td>
</tr>
<tr>
<td>afterDataLimits</td>
<td>Function</td>
<td>undefined</td>
<td>Callback that runs after data limits are determined. Passed a single argument, the scale instance.</td>
</tr>
<tr>
<td>beforeBuildTicks</td>
<td>Function</td>
<td>undefined</td>
<td>Callback that runs before ticks are created. Passed a single argument, the scale instance.</td>
</tr>
<tr>
<td>afterBuildTicks</td>
<td>Function</td>
<td>undefined</td>
<td>Callback that runs after ticks are created. Useful for filtering ticks. Passed a single argument, the scale instance.</td>
</tr>
<tr>
<td>beforeTickToLabelConversion</td>
<td>Function</td>
<td>undefined</td>
<td>Callback that runs before ticks are converted into strings. Passed a single argument, the scale instance.</td>
</tr>
<tr>
<td>afterTickToLabelConversion</td>
<td>Function</td>
<td>undefined</td>
<td>Callback that runs after ticks are converted into strings. Passed a single argument, the scale instance.</td>
</tr>
<tr>
<td>beforeCalculateTickRotation</td>
<td>Function</td>
<td>undefined</td>
<td>Callback that runs before tick rotation is determined. Passed a single argument, the scale instance.</td>
</tr>
<tr>
<td>afterCalculateTickRotation</td>
<td>Function</td>
<td>undefined</td>
<td>Callback that runs after tick rotation is determined. Passed a single argument, the scale instance.</td>
</tr>
<tr>
<td>beforeFit</td>
<td>Function</td>
<td>undefined</td>
<td>Callback that runs before the scale fits to the canvas. Passed a single argument, the scale instance.</td>
</tr>
<tr>
<td>afterFit</td>
<td>Function</td>
<td>undefined</td>
<td>Callback that runs after the scale fits to the canvas. Passed a single argument, the scale instance.</td>
</tr>
<tr>
<td>afterUpdate</td>
<td>Function</td>
<td>undefined</td>
<td>Callback that runs at the end of the update process. Passed a single argument, the scale instance.</td>
</tr>
<tr>
<td><strong>gridLines</strong></td>
<td>Object</td>
<td>-</td>
<td>See <a href="#grid-line-configuration">grid line configuration</a> section.</td>
</tr>
<tr>
<td><strong>scaleLabel</strong></td>
<td>Object</td>
<td></td>
<td>See <a href="#scale-title-configuration">scale title configuration</a> section.</td>
</tr>
<tr>
<td><strong>ticks</strong></td>
<td>Object</td>
<td></td>
<td>See <a href="#ticks-configuration">ticks configuration</a> section.</td>
</tr>
</tbody>
</table>
</div>
 * 
 * @author Tomáš Rohrbacher (rohrbacher[at]elvoris.cz)
 *
 */
public class Scale
//extends JavaScriptObject
implements IsJavaScriptObject
{
	static final public String POSITION_LEFT = "left";
	static final public String POSITION_RIGHT = "right";
	static final public String POSITION_TOP = "top";
	static final public String POSITION_BOTTOM = "bottom";
	
	static final public String SCALE_TYPE_LINEAR = "linear";
	static final public String SCALE_TYPE_LOGARITHMIC = "logarithmic";
	static final public String SCALE_TYPE_TIME = "time";
	static final public String SCALE_TYPE_RADIALLINEAR = "radialLinear";
	
	
	//
	//	REGEX
	//	<tr>\s*<td><strong>(\w+)</strong></td>\s*<td>(\w+)</td>\s*<td>(.*)</td>\s+<td>(.+)</td>\s*</tr>
	//	REPLACE-WITH
	//	\t/**\n\t * Default value: $3\n\t * <p>$4\n\t */\n\tpublic final native $2 get_$1 () /*-{\n\t\treturn this.$1;\n\t}-*/;\n\n\t/**\n\t * Default value: $3\n\t * <p>$4\n\t */\n\tpublic final native void set_$1 ($2 $1) /*-{\n\t\tthis.$1 = $1;\n\t}-*/;\n\n
	//

	static public Scale create ()
	{
		//return JavaScriptObject.createObject().cast();
		return new Scale();
	}

	/**
	 * Default constructor
	 */
	public Scale() {
	}
	
//	/**
//	 * Constructors must be 'protected' in subclasses of JavaScriptObject
//	 */
//	protected Scale() {
//		// Has to be empty
//	}
	
	@Override
	public final native JavaScriptObject asJavaScriptObject() /*-{
		return this;
	}-*/;

	/**
	 * Default value: Chart specific.
	 * <p>Type of scale being employed. Custom scales can be created and registered with a string key. 
	 * Options: <a href="#scales-category-scale">"category"</a>, 
	 * <a href="#scales-linear-scale">"linear"</a>, 
	 * <a href="#scales-logarithmic-scale">"logarithmic"</a>, 
	 * <a href="#scales-time-scale">"time"</a>, 
	 * <a href="#scales-radial-linear-scale">"radialLinear"</a>.
	 */
	public final native String getType () /*-{
		return this.type;
	}-*/;

	/**
	 * Default value: Chart specific.
	 * <p>Type of scale being employed. Custom scales can be created and registered with a string key. 
	 * Options: <a href="#scales-category-scale">"category"</a>, 
	 * <a href="#scales-linear-scale">"linear"</a>, 
	 * <a href="#scales-logarithmic-scale">"logarithmic"</a>, 
	 * <a href="#scales-time-scale">"time"</a>, 
	 * <a href="#scales-radial-linear-scale">"radialLinear"</a>.
	 */
	public final native Scale setType (String type) /*-{
		this.type = type;
		return this;
	}-*/;


	/**
	 * Default value: true
	 * <p>If true, show the scale including gridlines, ticks, and labels. 
	 * Overrides <em>gridLines.display</em>, <em>scaleLabel.display</em>, and <em>ticks.display</em>.
	 */
	public final native Boolean getDisplay () /*-{
		return this.display;
	}-*/;

	/**
	 * Default value: true
	 * <p>If true, show the scale including gridlines, ticks, and labels. 
	 * Overrides <em>gridLines.display</em>, <em>scaleLabel.display</em>, and <em>ticks.display</em>.
	 */
	public final native Scale setDisplay (Boolean display) /*-{
		this.display = display;
		return this;
	}-*/;


	/**
	 * Default value: "left"
	 * <p>Position of the scale. Possible values are 'top', 'left', 'bottom' and 'right'.
	 */
	public final native String getPosition () /*-{
		return this.position;
	}-*/;

	/**
	 * Default value: "left"
	 * <p>Position of the scale. Possible values are 'top', 'left', 'bottom' and 'right'.
	 */
	public final native Scale setPosition (String position) /*-{
		this.position = position;
		return this;
	}-*/;


	/**
	 * Default value: 
	 * <p>The ID is used to link datasets and scale axes together. The properties <code>datasets.xAxisID</code> or <code>datasets.yAxisID</code> have to match the scale properties <code>scales.xAxes.id</code> or <code>scales.yAxes.id</code>. This is especially needed if multi-axes charts are used.
	 */
	public final native String getId () /*-{
		return this.id;
	}-*/;

	/**
	 * Default value: 
	 * <p>The ID is used to link datasets and scale axes together. The properties <code>datasets.xAxisID</code> or <code>datasets.yAxisID</code> have to match the scale properties <code>scales.xAxes.id</code> or <code>scales.yAxes.id</code>. This is especially needed if multi-axes charts are used.
	 */
	public final native Scale setId (String id) /*-{
		this.id = id;
		return this;
	}-*/;


	/**
	 * Default value: -
	 * <p>See <a href="#grid-line-configuration">grid line configuration</a> section.
	 */
	public final native GridLineConfig getGridLines () /*-{
		return this.gridLines;
	}-*/;

	/**
	 * Default value: -
	 * <p>See <a href="#grid-line-configuration">grid line configuration</a> section.
	 */
	public final native Scale setGridLines (GridLineConfig gridLines) /*-{
		this.gridLines = gridLines;
		return this;
	}-*/;


	/**
	 * Default value: 
	 * <p>See <a href="#scale-title-configuration">scale title configuration</a> section.
	 */
	public final native ScaleTitle getScaleLabel () /*-{
		return this.scaleLabel;
	}-*/;

	/**
	 * Default value: 
	 * <p>See <a href="#scale-title-configuration">scale title configuration</a> section.
	 */
	public final native Scale setScaleLabel (ScaleTitle scaleLabel) /*-{
		this.scaleLabel = scaleLabel;
		return this;
	}-*/;


	/**
	 * Default value: 
	 * <p>See <a href="#ticks-configuration">ticks configuration</a> section.
	 */
	public final native JavaScriptObject getTicks () /*-{
		return this.ticks;
	}-*/;

	/**
	 * Default value: 
	 * <p>See <a href="#ticks-configuration">ticks configuration</a> section.
	 */
	public final native Scale setTicks (JavaScriptObject ticks) /*-{
		this.ticks = ticks;
		return this;
	}-*/;

	public final Scale setTicks (ScaleTicks ticks) {
		setTicks(ticks == null ? null : ticks.asJavaScriptObject());
		return this;
	}
	
}
