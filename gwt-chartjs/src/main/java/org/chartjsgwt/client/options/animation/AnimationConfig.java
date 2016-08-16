package org.chartjsgwt.client.options.animation;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <h3 id="chart-configuration-animation-configuration"><a class="fragment-link" href="#chart-configuration-animation-configuration">Animation Configuration</a></h3>
 * <p>The following animation options are available. 
 * The global options for are defined in <code>Chart.defaults.global.animation</code>.
 * </p>
 * <div class="table-wrapper"><table>
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
<td>duration</td>
<td style="text-align:center">Number</td>
<td>1000</td>
<td>The number of milliseconds an animation takes.</td>
</tr>
<tr>
<td>easing</td>
<td style="text-align:center">String</td>
<td>"easeOutQuart"</td>
<td>Easing function to use.</td>
</tr>
<tr>
<td>onProgress</td>
<td style="text-align:center">Function</td>
<td>none</td>
<td>Callback called on each step of an animation. Passed a single argument, an object, containing the chart instance and an object with details of the animation.</td>
</tr>
<tr>
<td>onComplete</td>
<td style="text-align:center">Function</td>
<td>none</td>
<td>Callback called at the end of an animation. Passed the same arguments as <code>onProgress</code></td>
</tr>
</tbody>
</table>
</div>
 * 
 * <h4>Animation Callbacks</h4>
 * <p>The <code>onProgress</code> and <code>onComplete</code> callbacks are useful for synchronizing an external draw to the chart animation. The callback is passed an object that implements the following interface. An example usage of these callbacks can be found on <a href="https://github.com/chartjs/Chart.js/blob/master/samples/AnimationCallbacks/progress-bar.html" target="_blank">Github</a>. This sample displays a progress bar showing how far along the animation is.</p>
 * <pre><code class="lang-javscript">{
    // Chart object
    chartInstance,

    // Contains details of the on-going animation
    animationObject,
}
</code></pre>
 * 
 * <h4>Animation Object</h4>
 * <p>The animation object passed to the callbacks is of type <code>Chart.Animation</code>. The object has the following parameters.</p>
 * <pre><code class="lang-javascript">{
    <span class="hljs-comment">// Current Animation frame number</span>
    currentStep: <span class="hljs-built_in">Number</span>,

    <span class="hljs-comment">// Number of animation frames</span>
    numSteps: <span class="hljs-built_in">Number</span>,

    <span class="hljs-comment">// Animation easing to use</span>
    easing: <span class="hljs-built_in">String</span>,

    <span class="hljs-comment">// Function that renders the chart</span>
    render: <span class="hljs-built_in">Function</span>,

    <span class="hljs-comment">// User callback</span>
    onAnimationProgress: <span class="hljs-built_in">Function</span>,

    <span class="hljs-comment">// User callback</span>
    onAnimationComplete: <span class="hljs-built_in">Function</span>
}
</code></pre>
 * 
 * @author Tomáš Rohrbacher (rohrbacher[at]elvoris.cz)
 */
public class AnimationConfig extends JavaScriptObject 
{
	static final public AnimationConfig create() {
		return JavaScriptObject.createObject().cast();
	}
	
	/**
	 * Constructors must be 'protected' in subclasses of JavaScriptObject
	 */
	protected AnimationConfig() {}
	
	/**
	 * Default value: 1000
	 * <p>The number of milliseconds an animation takes.
	 */
	public final native Integer getDuration () /*-{
		return this.duration;
	}-*/;

	/**
	 * Default value: 1000
	 * <p>The number of milliseconds an animation takes.
	 */
	public final native void setDuration (Integer duration) /*-{
		this.duration = duration;
	}-*/;


	/**
	 * Default value: "easeOutQuart"
	 * <p>Easing function to use.
	 */
	public final native String getEasing () /*-{
		return this.easing;
	}-*/;

	/**
	 * Default value: "easeOutQuart"
	 * <p>Easing function to use.
	 */
	public final native void setEasing (String easing) /*-{
		this.easing = easing;
	}-*/;


//	/**
//	 * Default value: none
//	 * <p>Callback called on each step of an animation. Passed a single argument, an object, containing the chart instance and an object with details of the animation.
//	 */
//	public final native Function getOnProgress () /*-{
//		return this.onProgress;
//	}-*/;
//
//	/**
//	 * Default value: none
//	 * <p>Callback called on each step of an animation. Passed a single argument, an object, containing the chart instance and an object with details of the animation.
//	 */
//	public final native void setOnProgress (Function onProgress) /*-{
//		this.onProgress = onProgress;
//	}-*/;
//
//
//	/**
//	 * Default value: none
//	 * <p>Callback called at the end of an animation. Passed the same arguments as <code>onProgress</code>
//	 */
//	public final native Function getOnComplete () /*-{
//		return this.onComplete;
//	}-*/;
//
//	/**
//	 * Default value: none
//	 * <p>Callback called at the end of an animation. Passed the same arguments as <code>onProgress</code>
//	 */
//	public final native void setOnComplete (Function onComplete) /*-{
//		this.onComplete = onComplete;
//	}-*/;

}
