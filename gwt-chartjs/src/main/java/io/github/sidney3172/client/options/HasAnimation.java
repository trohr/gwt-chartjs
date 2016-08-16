package io.github.sidney3172.client.options;

import org.chartjsgwt.client.options.animation.AnimationType;

/**
 * Enum contains types of easing of chart animation
 * @author sidney3172
 */
public interface HasAnimation{

    final String ANIMATION = "animation";
    final String ANIMATION_STEPS = "animationSteps";
    final String ANIMATION_EASING = "animationEasing";


    /**
     * Specify should chart be animated or not
     * Default value is <code>true</code>
     * @param enabled
     */
    public void setAnimationEnabled(boolean enabled);

    /**
     * Particularly specify quality of animation
     * Default value is 60
     * @param steps
     */
    public void setAnimationSteps(int steps);

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
    public void addAnimationCallback(AnimationCallback callback);

}
