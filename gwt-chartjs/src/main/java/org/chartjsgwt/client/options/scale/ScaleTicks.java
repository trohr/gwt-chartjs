package org.chartjsgwt.client.options.scale;

import org.chartjsgwt.client.IsJavaScriptObject;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <h4>Tick Configuration</h4>
 * <p>The grid line configuration is nested under the scale configuration in the <code>ticks</code> key. It defines options for the tick marks that are generated by the axis.</p>
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
<td>autoSkip</td>
<td>Boolean</td>
<td>true</td>
<td>If true, automatically calculates how many labels that can be shown and hides labels accordingly. Turn it off to show all labels no matter what</td>
</tr>
<tr>
<td>callback</td>
<td>Function</td>
<td><code>function(value) { return helpers.isArray(value) ? value : '' + value; }</code></td>
<td>Returns the string representation of the tick value as it should be displayed on the chart. See <a href="#scales-creating-custom-tick-formats">callback</a> section below.</td>
</tr>
<tr>
<td>display</td>
<td>Boolean</td>
<td>true</td>
<td>If true, show the ticks.</td>
</tr>
<tr>
<td>fontColor</td>
<td>Color</td>
<td>"#666"</td>
<td>Font color for the tick labels.</td>
</tr>
<tr>
<td>fontFamily</td>
<td>String</td>
<td>"'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"</td>
<td>Font family for the tick labels, follows CSS font-family options.</td>
</tr>
<tr>
<td>fontSize</td>
<td>Number</td>
<td>12</td>
<td>Font size for the tick labels.</td>
</tr>
<tr>
<td>fontStyle</td>
<td>String</td>
<td>"normal"</td>
<td>Font style for the tick labels, follows CSS font-style options (i.e. normal, italic, oblique, initial, inherit).</td>
</tr>
<tr>
<td>labelOffset</td>
<td>Number</td>
<td>0</td>
<td>Distance in pixels to offset the label from the centre point of the tick (in the y direction for the x axis, and the x direction for the y axis). <em>Note: this can cause labels at the edges to be cropped by the edge of the canvas</em></td>
</tr>
<tr>
<td>maxRotation</td>
<td>Number</td>
<td>90</td>
<td>Maximum rotation for tick labels when rotating to condense labels. Note: Rotation doesn't occur until necessary. <em>Note: Only applicable to horizontal scales.</em></td>
</tr>
<tr>
<td>minRotation</td>
<td>Number</td>
<td>0</td>
<td>Minimum rotation for tick labels. <em>Note: Only applicable to horizontal scales.</em></td>
</tr>
<tr>
<td>mirror</td>
<td>Boolean</td>
<td>false</td>
<td>Flips tick labels around axis, displaying the labels inside the chart instead of outside. <em>Note: Only applicable to vertical scales.</em></td>
</tr>
<tr>
<td>padding</td>
<td>Number</td>
<td>10</td>
<td>Padding between the tick label and the axis. <em>Note: Only applicable to horizontal scales.</em></td>
</tr>
<tr>
<td>reverse</td>
<td>Boolean</td>
<td>false</td>
<td>Reverses order of tick labels.</td>
</tr>
</tbody>
</table>
</div>
 * 
 * @author Tomáš Rohrbacher (rohrbacher[at]elvoris.cz)
 *
 */
public class ScaleTicks 
implements IsJavaScriptObject
{
	
	//
	//	REGEX
	//	<tr>\s*<td>(\w+)</td>\s*<td>([\w\[\]\s]+)</td>\s*<td>(.*)</td>\s+<td>(.*)</td>\s*</tr>
	//	REPLACE-WITH
	//	\t/**\n\t * Type: $2\n\t * Default value: $3\n\t * <p>$4\n\t */\n\tpublic final native $2 get_$1 () /*-{\n\t\treturn this.$1;\n\t}-*/;\n\n\t/**\n\t * Type: $2\n\t * Default value: $3\n\t * <p>$4\n\t */\n\tpublic final native void set_$1 ($2 $1) /*-{\n\t\tthis.$1 = $1;\n\t}-*/;\n\n
	//

	static public interface TicksFormatter
	{
		String format (Object value, int index, Object[] values);
	}
	
	// JSON.stringify throws error when trying to stringify this object... so do not remember it :)
	//private TicksFormatter formatter = null;
	
	/**
	 * Default constructor
	 */
	public ScaleTicks() {
	}
	
	@Override
	public final native JavaScriptObject asJavaScriptObject() /*-{
		return this;
	}-*/;

	
	/**
	 * Default value: <code>function(value) { return helpers.isArray(value) ? value : '' + value; }</code>
	 * <p>Returns the string representation of the tick value as it should be displayed on the chart. See <a href="#scales-creating-custom-tick-formats">callback</a> section below.
	 */
	public final native JavaScriptObject getFormatCallback () /*-{
		return this.callback;
	}-*/;

	/**
	 * Default value: <code>function(value) { return helpers.isArray(value) ? value : '' + value; }</code>
	 * <p>Returns the string representation of the tick value as it should be displayed on the chart. See <a href="#scales-creating-custom-tick-formats">callback</a> section below.
	 */
	public final native ScaleTicks setFormatCallback (JavaScriptObject callback) /*-{
		this.callback = callback;
		return this;
	}-*/;

	/*
	public final TicksFormatter getFormatter() {
		return formatter;
	}
	*/
	
	public final ScaleTicks setFormatter(TicksFormatter formatter) {
		//this.formatter = formatter;
		setFormatCallback(createFormatterCallbackFunction(formatter));
		return this;
	}

	private native JavaScriptObject createFormatterCallbackFunction (TicksFormatter formatter) /*-{
		if (formatter != null)
		{
			return function(value, index, values)
			{
				return formatter.@org.chartjsgwt.client.options.scale.ScaleTicks.TicksFormatter::format(Ljava/lang/Object;I[Ljava/lang/Object;)(value, index, values);
			};
		}
		else
		{
			return function(value) { return $wnd.Array.isArray(value) ? value : '' + value; };
		}
	}-*/;
	


	/**
	 * Default value: true
	 * <p>If true, automatically calculates how many labels that can be shown and hides labels accordingly. Turn it off to show all labels no matter what
	 */
	public final native Boolean getAutoSkip () /*-{
		return this.autoSkip;
	}-*/;

	/**
	 * Default value: true
	 * <p>If true, automatically calculates how many labels that can be shown and hides labels accordingly. Turn it off to show all labels no matter what
	 */
	public final native ScaleTicks setAutoSkip (Boolean autoSkip) /*-{
		this.autoSkip = autoSkip;
		return this;
	}-*/;

	/**
	 * Default value: true
	 * <p>If true, show the ticks.
	 */
	public final native Boolean getDisplay () /*-{
		return this.display;
	}-*/;

	/**
	 * Default value: true
	 * <p>If true, show the ticks.
	 */
	public final native ScaleTicks setDisplay (Boolean display) /*-{
		this.display = display;
		return this;
	}-*/;


	/**
	 * Default value: "#666"
	 * <p>Font color for the tick labels.
	 */
	public final native String getFontColor () /*-{
		return this.fontColor;
	}-*/;

	/**
	 * Default value: "#666"
	 * <p>Font color for the tick labels.
	 */
	public final native ScaleTicks setFontColor (String fontColor) /*-{
		this.fontColor = fontColor;
		return this;
	}-*/;


	/**
	 * Default value: "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"
	 * <p>Font family for the tick labels, follows CSS font-family options.
	 */
	public final native String getFontFamily () /*-{
		return this.fontFamily;
	}-*/;

	/**
	 * Default value: "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"
	 * <p>Font family for the tick labels, follows CSS font-family options.
	 */
	public final native ScaleTicks setFontFamily (String fontFamily) /*-{
		this.fontFamily = fontFamily;
		return this;
	}-*/;


	/**
	 * Default value: 12
	 * <p>Font size for the tick labels.
	 */
	public final native Integer getFontSize () /*-{
		return this.fontSize;
	}-*/;

	/**
	 * Default value: 12
	 * <p>Font size for the tick labels.
	 */
	public final ScaleTicks setFontSize (Integer fontSize) {
		if (fontSize == null) {
			setFontSizeDefault();
		} else {
			setFontSizeInt(fontSize.intValue());
		}
		return this;
	}
	
	private final native void setFontSizeDefault () /*-{
		this.fontSize = null;
	}-*/;
	
	private final native void setFontSizeInt (int fontSize) /*-{
		this.fontSize = fontSize;
	}-*/;


	/**
	 * Default value: "normal"
	 * <p>Font style for the tick labels, follows CSS font-style options (i.e. normal, italic, oblique, initial, inherit).
	 */
	public final native String getFontStyle () /*-{
		return this.fontStyle;
	}-*/;

	/**
	 * Default value: "normal"
	 * <p>Font style for the tick labels, follows CSS font-style options (i.e. normal, italic, oblique, initial, inherit).
	 */
	public final native ScaleTicks setFontStyle (String fontStyle) /*-{
		this.fontStyle = fontStyle;
		return this;
	}-*/;


	/**
	 * Default value: 0
	 * <p>Distance in pixels to offset the label from the centre point of the tick (in the y direction for the x axis, and the x direction for the y axis). <em>Note: this can cause labels at the edges to be cropped by the edge of the canvas</em>
	 */
	public final native Integer getLabelOffset () /*-{
		return this.labelOffset;
	}-*/;

	/**
	 * Default value: 0
	 * <p>Distance in pixels to offset the label from the centre point of the tick (in the y direction for the x axis, and the x direction for the y axis). <em>Note: this can cause labels at the edges to be cropped by the edge of the canvas</em>
	 */
	public final ScaleTicks setLabelOffset (Integer labelOffset) {
		if (labelOffset == null) {
			setLabelOffsetDefault();
		} else {
			setLabelOffsetInt(labelOffset.intValue());
		}
		return this;
	}
	
	private final native void setLabelOffsetDefault () /*-{
		this.labelOffset = null;
	}-*/;
	
	private final native void setLabelOffsetInt (int labelOffset) /*-{
		this.labelOffset = labelOffset;
	}-*/;


	/**
	 * Default value: 90
	 * <p>Maximum rotation for tick labels when rotating to condense labels. Note: Rotation doesn't occur until necessary. <em>Note: Only applicable to horizontal scales.</em>
	 */
	public final native Integer getMaxRotation () /*-{
		return this.maxRotation;
	}-*/;

	/**
	 * Default value: 90
	 * <p>Maximum rotation for tick labels when rotating to condense labels. Note: Rotation doesn't occur until necessary. <em>Note: Only applicable to horizontal scales.</em>
	 */
	public final ScaleTicks setMaxRotation (Integer maxRotation) {
		if (maxRotation == null) {
			setMaxRotationDefault();
		} else {
			setMaxRotationInt(maxRotation.intValue());
		}
		return this;
	}
	
	private final native void setMaxRotationDefault () /*-{
		this.maxRotation = null;
	}-*/;
	
	private final native void setMaxRotationInt (int maxRotation) /*-{
		this.maxRotation = maxRotation;
	}-*/;


	/**
	 * Default value: 0
	 * <p>Minimum rotation for tick labels. <em>Note: Only applicable to horizontal scales.</em>
	 */
	public final native Integer getMinRotation () /*-{
		return this.minRotation;
	}-*/;

	/**
	 * Default value: 0
	 * <p>Minimum rotation for tick labels. <em>Note: Only applicable to horizontal scales.</em>
	 */
	public final ScaleTicks setMinRotation (Integer minRotation) {
		if (minRotation == null) {
			setMinRotationDefault();
		} else {
			setMinRotationInt(minRotation.intValue());
		}
		return this;
	}

	private final native void setMinRotationDefault () /*-{
		this.minRotation = null;
	}-*/;
	
	private final native void setMinRotationInt (int minRotation) /*-{
		this.minRotation = minRotation;
	}-*/;


	/**
	 * Default value: false
	 * <p>Flips tick labels around axis, displaying the labels inside the chart instead of outside. <em>Note: Only applicable to vertical scales.</em>
	 */
	public final native Boolean getMirror () /*-{
		return this.mirror;
	}-*/;

	/**
	 * Default value: false
	 * <p>Flips tick labels around axis, displaying the labels inside the chart instead of outside. <em>Note: Only applicable to vertical scales.</em>
	 */
	public final native ScaleTicks setMirror (Boolean mirror) /*-{
		this.mirror = mirror;
		return this;
	}-*/;


	/**
	 * Default value: 10
	 * <p>Padding between the tick label and the axis. <em>Note: Only applicable to horizontal scales.</em>
	 */
	public final native Integer getPadding () /*-{
		return this.padding;
	}-*/;

	/**
	 * Default value: 10
	 * <p>Padding between the tick label and the axis. <em>Note: Only applicable to horizontal scales.</em>
	 */
	public final native ScaleTicks setPadding (Integer padding) /*-{
		this.padding = padding;
		return this;
	}-*/;


	/**
	 * Default value: false
	 * <p>Reverses order of tick labels.
	 */
	public final native Boolean getReverse () /*-{
		return this.reverse;
	}-*/;

	/**
	 * Default value: false
	 * <p>Reverses order of tick labels.
	 */
	public final native ScaleTicks setReverse (Boolean reverse) /*-{
		this.reverse = reverse;
		return this;
	}-*/;

}
