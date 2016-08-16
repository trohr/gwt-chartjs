package org.chartjsgwt.client.options.animation;

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
public interface HasAnimation2
{
//
//    final String ANIMATION_ROOT = "animation";
//    final String ANIMATION_DURATION = "duration";
//    final String ANIMATION_EASING = "easing";


//    /**
//     * Specify should chart be animated or not
//     * Default value is <code>true</code>
//     * @param enabled
//     */
//    public void setAnimationEnabled(boolean enabled);

    /**
     * Particularly specify quality of animation
     * Default value is 60
     * @param steps
     */
    public void setAnimationDuration(int steps);

    /**
     * Specify animation easing
     * Default value is {@link AnimationType#EASE_OUT_QUART}
     * @param animationType
     */
    public void setAnimationType(AnimationType animationType);

    /**
     * Add animation callback to handle animation state changes
     * @param callback
     */
    public void addAnimationCallback(AnimationCallback2 callback);

}
