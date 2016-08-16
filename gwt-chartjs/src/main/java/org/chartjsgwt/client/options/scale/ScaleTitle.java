/**
 * 
 */
package org.chartjsgwt.client.options.scale;

import org.chartjsgwt.client.IsJavaScriptObject;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <h4>Scale Title Configuration</h4>
 * <p>
 * The scale title configuration is nested under the scale configuration in the <code>scaleLabel</code> key.
 * It defines options for the scale title.
 * </p>
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
<td>display</td>
<td>Boolean</td>
<td>false</td>
<td></td>
</tr>
<tr>
<td>labelString</td>
<td>String</td>
<td>""</td>
<td>The text for the title. (i.e. "# of People", "Response Choices")</td>
</tr>
<tr>
<td>fontColor</td>
<td>Color</td>
<td>"#666"</td>
<td>Font color for the scale title.</td>
</tr>
<tr>
<td>fontFamily</td>
<td>String</td>
<td>"'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"</td>
<td>Font family for the scale title, follows CSS font-family options.</td>
</tr>
<tr>
<td>fontSize</td>
<td>Number</td>
<td>12</td>
<td>Font size for the scale title.</td>
</tr>
<tr>
<td>fontStyle</td>
<td>String</td>
<td>"normal"</td>
<td>Font style for the scale title, follows CSS font-style options (i.e. normal, italic, oblique, initial, inherit).</td>
</tr>
</tbody>
</table>
</div>
 * 
 * @author Tomáš Rohrbacher (rohrbacher[at]elvoris.cz)
 */
public class ScaleTitle
implements IsJavaScriptObject
{

	static final public ScaleTitle create()
	{
		return new ScaleTitle();
	}

	//
	//	REGEX
	//	<tr>\s*<td>(\w+)</td>\s*<td>([\w\[\]\s]+)</td>\s*<td>(.*)</td>\s+<td>(.*)</td>\s*</tr>
	//	REPLACE-WITH
	//	\t/**\n\t * Type: $2\n\t * Default value: $3\n\t * <p>$4\n\t */\n\tpublic final native $2 get_$1 () /*-{\n\t\treturn this.$1;\n\t}-*/;\n\n\t/**\n\t * Type: $2\n\t * Default value: $3\n\t * <p>$4\n\t */\n\tpublic final native ScaleTitle set_$1 ($2 $1) /*-{\n\t\tthis.$1 = $1;\n\t\treturn this;\n\t}-*/;\n\n
	//

	/**
	 * Default constructor
	 */
	protected ScaleTitle() {
	}

	@Override
	public final native JavaScriptObject asJavaScriptObject() /*-{
		return this;
	}-*/;


	/**
	 * Type: Boolean
	 * Default value: false
	 * <p>
	 */
	public final native Boolean getDisplay () /*-{
		return this.display;
	}-*/;

	/**
	 * Type: Boolean
	 * Default value: false
	 * <p>
	 */
	public final native ScaleTitle setDisplay (Boolean display) /*-{
		this.display = display;
		return this;
	}-*/;


	/**
	 * Type: String
	 * Default value: ""
	 * <p>The text for the title. (i.e. "# of People", "Response Choices")
	 */
	public final native String getLabelString () /*-{
		return this.labelString;
	}-*/;

	/**
	 * Type: String
	 * Default value: ""
	 * <p>The text for the title. (i.e. "# of People", "Response Choices")
	 */
	public final native ScaleTitle setLabelString (String labelString) /*-{
		this.labelString = labelString;
		return this;
	}-*/;


	/**
	 * Type: Color
	 * Default value: "#666"
	 * <p>Font color for the scale title.
	 */
	public final native String getFontColor () /*-{
		return this.fontColor;
	}-*/;

	/**
	 * Type: Color
	 * Default value: "#666"
	 * <p>Font color for the scale title.
	 */
	public final native ScaleTitle setFontColor (String fontColor) /*-{
		this.fontColor = fontColor;
		return this;
	}-*/;


	/**
	 * Type: String
	 * Default value: "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"
	 * <p>Font family for the scale title, follows CSS font-family options.
	 */
	public final native String getFontFamily () /*-{
		return this.fontFamily;
	}-*/;

	/**
	 * Type: String
	 * Default value: "'Helvetica Neue', 'Helvetica', 'Arial', sans-serif"
	 * <p>Font family for the scale title, follows CSS font-family options.
	 */
	public final native ScaleTitle setFontFamily (String fontFamily) /*-{
		this.fontFamily = fontFamily;
		return this;
	}-*/;


	/**
	 * Type: Number
	 * Default value: 12
	 * <p>Font size for the scale title.
	 */
	public final native Integer getFontSize () /*-{
		return this.fontSize;
	}-*/;

	/**
	 * Type: Number
	 * Default value: 12
	 * <p>Font size for the scale title.
	 */
	public final ScaleTitle setFontSize (Integer fontSize) {
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
	 * Type: String
	 * Default value: "normal"
	 * <p>Font style for the scale title, follows CSS font-style options (i.e. normal, italic, oblique, initial, inherit).
	 */
	public final native String getFontStyle () /*-{
		return this.fontStyle;
	}-*/;

	/**
	 * Type: String
	 * Default value: "normal"
	 * <p>Font style for the scale title, follows CSS font-style options (i.e. normal, italic, oblique, initial, inherit).
	 */
	public final native ScaleTitle setFontStyle (String fontStyle) /*-{
		this.fontStyle = fontStyle;
		return this;
	}-*/;

}
