/**
 * 
 */
package org.chartjsgwt.client.options;

import org.chartjsgwt.client.IsJavaScriptObject;
import org.chartjsgwt.client.options.animation.AnimationConfig;
import org.chartjsgwt.client.options.hover.HoverConfig;
import org.chartjsgwt.client.util.JsArrayUtil;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * <h3 id="chart-configuration-common-chart-configuration">
 * 	<a class="fragment-link" href="#chart-configuration-common-chart-configuration">Common Chart Configuration</a>
 * </h3>
 * 
 * <p>The following options are applicable to all charts. 
 * They can be set on the <a href="#chart-configuration-global-configuration">global configuration</a>, 
 * or they can be passed to the chart constructor.</p>
 * 
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
<td>responsive</td>
<td>Boolean</td>
<td>true</td>
<td>Resizes when the canvas container does.</td>
</tr>
<tr>
<td>responsiveAnimationDuration</td>
<td>Number</td>
<td>0</td>
<td>Duration in milliseconds it takes to animate to new size after a resize event.</td>
</tr>
<tr>
<td>maintainAspectRatio</td>
<td>Boolean</td>
<td>true</td>
<td>Maintain the original canvas aspect ratio <code>(width / height)</code> when resizing</td>
</tr>
<tr>
<td>events</td>
<td>Array[String]</td>
<td><code>["mousemove", "mouseout", "click", "touchstart", "touchmove", "touchend"]</code></td>
<td>Events that the chart should listen to for tooltips and hovering</td>
</tr>
<tr>
<td>onClick</td>
<td>Function</td>
<td>null</td>
<td>Called if the event is of type 'mouseup' or 'click'. Called in the context of the chart and passed an array of active elements</td>
</tr>
<tr>
<td>legendCallback</td>
<td>Function</td>
<td><code>function (chart) { }</code></td>
<td>Function to generate a legend. Receives the chart object to generate a legend from. Default implementation returns an HTML string.</td>
</tr>
<tr>
<td>onResize</td>
<td>Function</td>
<td>null</td>
<td>Called when a resize occurs. Gets passed two arguemnts: the chart instance and the new size.</td>
</tr>
</tbody>
</table>
</div>
 * 
 * @author Tomáš Rohrbacher (rohrbacher[at]elvoris.cz)
 *
 */
public class CommonChartOptions
//extends JavaScriptObject
implements IsJavaScriptObject
{
	static public CommonChartOptions create()
	{
		return new CommonChartOptions();
		//return JavaScriptObject.createObject().cast();
	}

	/**
	 * Constructors must be 'protected' in subclasses of JavaScriptObject
	 */
	protected CommonChartOptions() {
		super();
	}

	@Override
	public final native JavaScriptObject asJavaScriptObject () /*-{
		return this;
	}-*/;

	/**
	 * Default value: true
	 * <p>Resizes when the canvas container does.
	 */
	public final native Boolean getResponsive () /*-{
		return this.responsive;
	}-*/;

	/**
	 * Default value: true
	 * <p>Resizes when the canvas container does.
	 */
	public final native void setResponsive (Boolean responsive) /*-{
		this.responsive = responsive;
	}-*/;


	/**
	 * Default value: 0
	 * <p>Duration in milliseconds it takes to animate to new size after a resize event.
	 */
	public final native Integer getResponsiveAnimationDuration () /*-{
		return this.responsiveAnimationDuration;
	}-*/;

	/**
	 * Default value: 0
	 * <p>Duration in milliseconds it takes to animate to new size after a resize event.
	 */
	public final native void setResponsiveAnimationDuration (Integer responsiveAnimationDuration) /*-{
		this.responsiveAnimationDuration = responsiveAnimationDuration;
	}-*/;


	/**
	 * Default value: true
	 * <p>Maintain the original canvas aspect ratio <code>(width / height)</code> when resizing
	 */
	public final native Boolean getMaintainAspectRatio () /*-{
		return this.maintainAspectRatio;
	}-*/;

	/**
	 * Default value: true
	 * <p>Maintain the original canvas aspect ratio <code>(width / height)</code> when resizing
	 */
	public final native void setMaintainAspectRatio (Boolean maintainAspectRatio) /*-{
		this.maintainAspectRatio = maintainAspectRatio;
	}-*/;


	/**
	 * Default value: <code>["mousemove", "mouseout", "click", "touchstart", "touchmove", "touchend"]</code>
	 * <p>Events that the chart should listen to for tooltips and hovering
	 */
	public final String[] getEvents () {
		return JsArrayUtil.toJavaArray(this.getEventsJs());
	}

	/**
	 * Default value: <code>["mousemove", "mouseout", "click", "touchstart", "touchmove", "touchend"]</code>
	 * <p>Events that the chart should listen to for tooltips and hovering
	 */
	public final void setEvents (String[] events) {
		this.setEventsJs(JsArrayUtil.toJsArray(events));
	}

	/**
	 * Default value: <code>["mousemove", "mouseout", "click", "touchstart", "touchmove", "touchend"]</code>
	 * <p>Events that the chart should listen to for tooltips and hovering
	 */
	public final native JsArrayString getEventsJs () /*-{
		return this.events;
	}-*/;

	/**
	 * Default value: <code>["mousemove", "mouseout", "click", "touchstart", "touchmove", "touchend"]</code>
	 * <p>Events that the chart should listen to for tooltips and hovering
	 */
	public final native void setEventsJs (JsArrayString events) /*-{
		this.events = events;
	}-*/;


//	/**
//	 * Default value: null
//	 * <p>Called if the event is of type 'mouseup' or 'click'. Called in the context of the chart and passed an array of active elements
//	 */
//	public final native Function getOnClick () /*-{
//		return this.onClick;
//	}-*/;
//
//	/**
//	 * Default value: null
//	 * <p>Called if the event is of type 'mouseup' or 'click'. Called in the context of the chart and passed an array of active elements
//	 */
//	public final native void setOnClick (Function onClick) /*-{
//		this.onClick = onClick;
//	}-*/;
//
//
//	/**
//	 * Default value: <code>function (chart) { }</code>
//	 * <p>Function to generate a legend. Receives the chart object to generate a legend from. Default implementation returns an HTML string.
//	 */
//	public final native Function getLegendCallback () /*-{
//		return this.legendCallback;
//	}-*/;
//
//	/**
//	 * Default value: <code>function (chart) { }</code>
//	 * <p>Function to generate a legend. Receives the chart object to generate a legend from. Default implementation returns an HTML string.
//	 */
//	public final native void setLegendCallback (Function legendCallback) /*-{
//		this.legendCallback = legendCallback;
//	}-*/;
//
//
//	/**
//	 * Default value: null
//	 * <p>Called when a resize occurs. Gets passed two arguemnts: the chart instance and the new size.
//	 */
//	public final native Function getOnResize () /*-{
//		return this.onResize;
//	}-*/;
//
//	/**
//	 * Default value: null
//	 * <p>Called when a resize occurs. Gets passed two arguemnts: the chart instance and the new size.
//	 */
//	public final native void setOnResize (Function onResize) /*-{
//		this.onResize = onResize;
//	}-*/;


	/**
	 * Gets the animation configuration.
	 */
	public final native AnimationConfig getAnimation () /*-{
		return this.animation;
	}-*/;

	/**
	 * Sets the animation configuration.
	 */
	public final native void setAnimation (AnimationConfig animation) /*-{
		this.animation = animation;
	}-*/;

	/**
	 * Gets the hover configuration.
	 */
	public final native HoverConfig getHover () /*-{
		return this.hover;
	}-*/;

	/**
	 * Sets the hover configuration.
	 */
	public final native void setHover (HoverConfig hover) /*-{
		this.hover = hover;
	}-*/;
	
}
