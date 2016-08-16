/**
 * 
 */
package org.chartjsgwt.client.options.scale;

import org.chartjsgwt.client.IsJavaScriptObject;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <h4>Grid Line Configuration</h4>
 * <p>
 * The grid line configuration is nested under the scale configuration in the <code>gridLines</code> key.
 * It defines options for the grid lines that run perpendicular to the axis.
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
<td>true</td>
<td></td>
</tr>
<tr>
<td>color</td>
<td>Color or Array[Color]</td>
<td>"rgba(0, 0, 0, 0.1)"</td>
<td>Color of the grid lines.</td>
</tr>
<tr>
<td>lineWidth</td>
<td>Number or Array[Number]</td>
<td>1</td>
<td>Stroke width of grid lines</td>
</tr>
<tr>
<td>drawBorder</td>
<td>Boolean</td>
<td>true</td>
<td>If true draw border on the edge of the chart</td>
</tr>
<tr>
<td>drawOnChartArea</td>
<td>Boolean</td>
<td>true</td>
<td>If true, draw lines on the chart area inside the axis lines. This is useful when there are multiple axes and you need to control which grid lines are drawn</td>
</tr>
<tr>
<td>drawTicks</td>
<td>Boolean</td>
<td>true</td>
<td>If true, draw lines beside the ticks in the axis area beside the chart.</td>
</tr>
<tr>
<td>tickMarkLength</td>
<td>Number</td>
<td>10</td>
<td>Length in pixels that the grid lines will draw into the axis area.</td>
</tr>
<tr>
<td>zeroLineWidth</td>
<td>Number</td>
<td>1</td>
<td>Stroke width of the grid line for the first index (index 0).</td>
</tr>
<tr>
<td>zeroLineColor</td>
<td>Color</td>
<td>"rgba(0, 0, 0, 0.25)"</td>
<td>Stroke color of the grid line for the first index (index 0).</td>
</tr>
<tr>
<td>offsetGridLines</td>
<td>Boolean</td>
<td>false</td>
<td>If true, labels are shifted to be between grid lines. This is used in the bar chart.</td>
</tr>
</tbody>
</table>
</div>
 * 
 * @author Tomáš Rohrbacher (rohrbacher[at]elvoris.cz)
 *
 */
public class GridLineConfig
implements IsJavaScriptObject
{

	static public GridLineConfig create() {
		return new GridLineConfig();
	}
	
	// From documentation HTML to Java:
	//	REGEX
	//	<tr>\s*<td>(\w+)</td>\s*<td>([\w\[\]\s]+)</td>\s*<td>(.*)</td>\s+<td>(.*)</td>\s*</tr>
	//	REPLACE-WITH
	//	\t/**\n\t * Type: $2\n\t * Default value: $3\n\t * <p>$4\n\t */\n\tpublic final native $2 get_$1 () /*-{\n\t\treturn this.$1;\n\t}-*/;\n\n\t/**\n\t * Type: $2\n\t * Default value: $3\n\t * <p>$4\n\t */\n\tpublic final native void set_$1 ($2 $1) /*-{\n\t\tthis.$1 = $1;\n\t}-*/;\n\n
	//
	
	// From void setter to chained setter:
	// 	(public final native )void( set\w+\s*\([\w\s]+\)\s*/\*-\{\s+.+;)(\s+)}-\*/;
	// 	REPLACE-WITH
	// 	$1GridLineConfig$2$3\treturn this;$3}-*/;
	
	/**
	 * Default constructor
	 */
	protected GridLineConfig() {
	}
	
	@Override
	public final native JavaScriptObject asJavaScriptObject() /*-{
		return this;
	}-*/;


	/**
	 * Type: Boolean
	 * Default value: true
	 * <p>
	 */
	public final native Boolean getDisplay () /*-{
		return this.display;
	}-*/;

	/**
	 * Type: Boolean
	 * Default value: true
	 * <p>
	 */
	public final native GridLineConfig setDisplay (Boolean display) /*-{
		this.display = display;
		return this;
	}-*/;


	/**
	 * Type: Color or Array[Color]
	 * Default value: "rgba(0, 0, 0, 0.1)"
	 * <p>Color of the grid lines.
	 */
	public final native String getColor () /*-{
		return this.color;
	}-*/;

	/**
	 * Type: Color or Array[Color]
	 * Default value: "rgba(0, 0, 0, 0.1)"
	 * <p>Color of the grid lines.
	 */
	public final native GridLineConfig setColor (String color) /*-{
		this.color = color;
		return this;
	}-*/;


	/**
	 * Type: Number or Array[Number]
	 * Default value: 1
	 * <p>Stroke width of grid lines
	 */
	public final native Double getLineWidth () /*-{
		return this.lineWidth;
	}-*/;

	/**
	 * Type: Number or Array[Number]
	 * Default value: 1
	 * <p>Stroke width of grid lines
	 */
	public final native GridLineConfig setLineWidth (Double lineWidth) /*-{
		this.lineWidth = lineWidth;
		return this;
	}-*/;


	/**
	 * Type: Boolean
	 * Default value: true
	 * <p>If true draw border on the edge of the chart
	 */
	public final native Boolean getDrawBorder () /*-{
		return this.drawBorder;
	}-*/;

	/**
	 * Type: Boolean
	 * Default value: true
	 * <p>If true draw border on the edge of the chart
	 */
	public final native GridLineConfig setDrawBorder (Boolean drawBorder) /*-{
		this.drawBorder = drawBorder;
		return this;
	}-*/;


	/**
	 * Type: Boolean
	 * Default value: true
	 * <p>If true, draw lines on the chart area inside the axis lines. This is useful when there are multiple axes and you need to control which grid lines are drawn
	 */
	public final native Boolean getDrawOnChartArea () /*-{
		return this.drawOnChartArea;
	}-*/;

	/**
	 * Type: Boolean
	 * Default value: true
	 * <p>If true, draw lines on the chart area inside the axis lines. This is useful when there are multiple axes and you need to control which grid lines are drawn
	 */
	public final native GridLineConfig setDrawOnChartArea (Boolean drawOnChartArea) /*-{
		this.drawOnChartArea = drawOnChartArea;
		return this;
	}-*/;


	/**
	 * Type: Boolean
	 * Default value: true
	 * <p>If true, draw lines beside the ticks in the axis area beside the chart.
	 */
	public final native Boolean getDrawTicks () /*-{
		return this.drawTicks;
	}-*/;

	/**
	 * Type: Boolean
	 * Default value: true
	 * <p>If true, draw lines beside the ticks in the axis area beside the chart.
	 */
	public final native GridLineConfig setDrawTicks (Boolean drawTicks) /*-{
		this.drawTicks = drawTicks;
		return this;
	}-*/;


	/**
	 * Type: Number
	 * Default value: 10
	 * <p>Length in pixels that the grid lines will draw into the axis area.
	 */
	public final native Integer getTickMarkLength () /*-{
		return this.tickMarkLength;
	}-*/;

	/**
	 * Type: Number
	 * Default value: 10
	 * <p>Length in pixels that the grid lines will draw into the axis area.
	 */
	public final native GridLineConfig setTickMarkLength (Integer tickMarkLength) /*-{
		this.tickMarkLength = tickMarkLength;
		return this;
	}-*/;


	/**
	 * Type: Number
	 * Default value: 1
	 * <p>Stroke width of the grid line for the first index (index 0).
	 */
	public final native Integer getZeroLineWidth () /*-{
		return this.zeroLineWidth;
	}-*/;

	/**
	 * Type: Number
	 * Default value: 1
	 * <p>Stroke width of the grid line for the first index (index 0).
	 */
	public final GridLineConfig setZeroLineWidth (Integer zeroLineWidth) {
		if (zeroLineWidth == null)
		{
			this.setZeroLineWidthDefault();
		}
		else
		{
			this.setZeroLineWidthInt(zeroLineWidth.intValue());
		}
		return this;
	};

	private final native void setZeroLineWidthInt (int zeroLineWidth) /*-{
		this.zeroLineWidth = zeroLineWidth;
	}-*/;
	
	private final native void setZeroLineWidthDefault () /*-{
		this.zeroLineWidth = null;
	}-*/;


	/**
	 * Type: Color
	 * Default value: "rgba(0, 0, 0, 0.25)"
	 * <p>Stroke color of the grid line for the first index (index 0).
	 */
	public final native String getZeroLineColor () /*-{
		return this.zeroLineColor;
	}-*/;

	/**
	 * Type: Color
	 * Default value: "rgba(0, 0, 0, 0.25)"
	 * <p>Stroke color of the grid line for the first index (index 0).
	 */
	public final native GridLineConfig setZeroLineColor (String zeroLineColor) /*-{
		this.zeroLineColor = zeroLineColor;
		return this;
	}-*/;


	/**
	 * Type: Boolean
	 * Default value: false
	 * <p>If true, labels are shifted to be between grid lines. This is used in the bar chart.
	 */
	public final native Boolean getOffsetGridLines () /*-{
		return this.offsetGridLines;
	}-*/;

	/**
	 * Type: Boolean
	 * Default value: false
	 * <p>If true, labels are shifted to be between grid lines. This is used in the bar chart.
	 */
	public final native GridLineConfig setOffsetGridLines (Boolean offsetGridLines) /*-{
		this.offsetGridLines = offsetGridLines;
		return this;
	}-*/;

}
