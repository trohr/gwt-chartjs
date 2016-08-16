/**
 * 
 */
package org.chartjsgwt.client.options.hover;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <h3 id="chart-configuration-hover-configuration"><a class="fragment-link" href="#chart-configuration-hover-configuration">Hover Configuration</a></h3>
 * <p>The hover configuration is passed into the <code>options.hover</code> namespace. The global hover configuration is at <code>Chart.defaults.global.hover</code>.</p>
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
<td>mode</td>
<td>String</td>
<td>'single'</td>
<td>Sets which elements hover. Acceptable options are <code>'single'</code>, <code>'label'</code>, <code>'x-axis'</code>, or <code>'dataset'</code>. <br>&nbsp;<br><code>single</code> highlights the closest element. <br>&nbsp;<br><code>label</code> highlights elements in all datasets at the same <code>X</code> value. <br>&nbsp;<br><code>'x-axis'</code> also highlights elements in all datasets at the same <code>X</code> value, but activates when hovering anywhere within the vertical slice of the x-axis representing that <code>X</code> value.  <br>&nbsp;<br><code>dataset</code> highlights the closest dataset.</td>
</tr>
<tr>
<td>animationDuration</td>
<td>Number</td>
<td>400</td>
<td>Duration in milliseconds it takes to animate hover style changes</td>
</tr>
<tr>
<td>onHover</td>
<td>Function</td>
<td>null</td>
<td>Called when any of the events fire. Called in the context of the chart and passed an array of active elements (bars, points, etc)</td>
</tr>
</tbody>
</table>
</div>
 * 
 * @author Tomáš Rohrbacher (rohrbacher[at]elvoris.cz)
 *
 */
public class HoverConfig extends JavaScriptObject
{

	static public HoverConfig create()
	{
		return JavaScriptObject.createObject().cast();
	}

	/**
	 * Constructors must be 'protected' in subclasses of JavaScriptObject
	 */
	protected HoverConfig() {
		super();
	}



	/**
	 * Default value: 'single'
	 * <p>Sets which elements hover. Acceptable options are <code>'single'</code>, <code>'label'</code>, <code>'x-axis'</code>, or <code>'dataset'</code>. <br>&nbsp;<br><code>single</code> highlights the closest element. <br>&nbsp;<br><code>label</code> highlights elements in all datasets at the same <code>X</code> value. <br>&nbsp;<br><code>'x-axis'</code> also highlights elements in all datasets at the same <code>X</code> value, but activates when hovering anywhere within the vertical slice of the x-axis representing that <code>X</code> value.  <br>&nbsp;<br><code>dataset</code> highlights the closest dataset.
	 */
	public final native String getMode () /*-{
		return this.mode;
	}-*/;

	/**
	 * Default value: 'single'
	 * <p>Sets which elements hover. 
	 * Acceptable options are <code>'single'</code>, 
	 * <code>'label'</code>, 
	 * <code>'x-axis'</code>, 
	 * or <code>'dataset'</code>. 
	 * <br>&nbsp;<br><code>single</code> highlights the closest element. 
	 * <br>&nbsp;<br><code>label</code> highlights elements in all datasets at the same <code>X</code> value. 
	 * <br>&nbsp;<br><code>'x-axis'</code> also highlights elements in all datasets at the same <code>X</code> value, but activates when hovering anywhere within the vertical slice of the x-axis representing that <code>X</code> value.  
	 * <br>&nbsp;<br><code>dataset</code> highlights the closest dataset.
	 */
	public final native void setMode (String mode) /*-{
		this.mode = mode;
	}-*/;
	
	/**
	 * Default value: 'single'
	 * <p>Sets which elements hover. 
	 * Acceptable options are <code>'single'</code>, 
	 * <code>'label'</code>, 
	 * <code>'x-axis'</code>, 
	 * or <code>'dataset'</code>. 
	 * <br>&nbsp;<br><code>single</code> highlights the closest element. 
	 * <br>&nbsp;<br><code>label</code> highlights elements in all datasets at the same <code>X</code> value. 
	 * <br>&nbsp;<br><code>'x-axis'</code> also highlights elements in all datasets at the same <code>X</code> value, but activates when hovering anywhere within the vertical slice of the x-axis representing that <code>X</code> value.  
	 * <br>&nbsp;<br><code>dataset</code> highlights the closest dataset.
	 */
	public final void setMode (HoverMode mode) {
		this.setMode(mode == null ? null : mode.getValue());
	}


	/**
	 * Default value: 400
	 * <p>Duration in milliseconds it takes to animate hover style changes
	 */
	public final native Integer getAnimationDuration () /*-{
		return this.animationDuration;
	}-*/;

	/**
	 * Default value: 400
	 * <p>Duration in milliseconds it takes to animate hover style changes
	 */
	public final native void setAnimationDuration (Integer animationDuration) /*-{
		this.animationDuration = animationDuration;
	}-*/;

//	/**
//	 * Default value: null
//	 * <p>Called when any of the events fire. Called in the context of the chart and passed an array of active elements (bars, points, etc)
//	 */
//	public final native Function getOnHover () /*-{
//		return this.onHover;
//	}-*/;
//
//	/**
//	 * Default value: null
//	 * <p>Called when any of the events fire. Called in the context of the chart and passed an array of active elements (bars, points, etc)
//	 */
//	public final native void set_onHover (Function onHover) /*-{
//		this.onHover = onHover;
//	}-*/;

}
