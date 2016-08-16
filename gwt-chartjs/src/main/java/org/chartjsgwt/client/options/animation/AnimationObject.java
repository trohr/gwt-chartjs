package org.chartjsgwt.client.options.animation;

import com.google.gwt.core.client.JavaScriptObject;

/**
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
 * @author Tomáš Rohrbacher (rohrbacher[at]elvoris.cz)
 *
 */
public class AnimationObject extends JavaScriptObject
{

	/**
	 * Constructors must be 'protected' in subclasses of JavaScriptObject
	 */
	protected AnimationObject() {
	}

	/**
	 * Current Animation frame number
	 */
	public final native Integer getCurrentStep () /*-{
		return this.currentStep;
	}-*/;

	/**
	 * Current Animation frame number
	 */
	public final native void setCurrentStep (Integer currentStep) /*-{
		this.currentStep = currentStep;
	}-*/;


	/**
	 * Number of animation frames
	 */
	public final native Integer getNumSteps () /*-{
		return this.numSteps;
	}-*/;

	/**
	 * Number of animation frames
	 */
	public final native void setNumSteps (Integer numSteps) /*-{
		this.numSteps = numSteps;
	}-*/;


	/**
	 * Animation easing to use
	 */
	public final native String getEasing () /*-{
		return this.easing;
	}-*/;

	/**
	 * Animation easing to use
	 */
	public final native void setEasing (String easing) /*-{
		this.easing = easing;
	}-*/;


//	/**
//	 * Function that renders the chart
//	 */
//	public final native Function getRender () /*-{
//		return this.render;
//	}-*/;
//
//	/**
//	 * Function that renders the chart
//	 */
//	public final native void setRender (Function render) /*-{
//		this.render = render;
//	}-*/;
//
//
//	/**
//	 * User callback
//	 */
//	public final native Function get_onAnimationProgress () /*-{
//		return this.onAnimationProgress;
//	}-*/;
//
//	/**
//	 * User callback
//	 */
//	public final native void set_onAnimationProgress (Function onAnimationProgress) /*-{
//		this.onAnimationProgress = onAnimationProgress;
//	}-*/;
//
//
//	/**
//	 * User callback
//	 */
//	public final native Function get_onAnimationComplete () /*-{
//		return this.onAnimationComplete;
//	}-*/;
//
//	/**
//	 * User callback
//	 */
//	public final native void set_onAnimationComplete (Function onAnimationComplete) /*-{
//		this.onAnimationComplete = onAnimationComplete;
//	}-*/;

}
