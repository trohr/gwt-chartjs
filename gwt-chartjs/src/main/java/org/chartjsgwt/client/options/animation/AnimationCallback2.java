package org.chartjsgwt.client.options.animation;

/**
 * Callback used to handle animation state changes for charts
 * 
 * @author Tomáš Rohrbacher (rohrbacher[at]elvoris.cz)
 */
public interface AnimationCallback2 {

    /**
     * Method will be invoked during animation in progress
     * @param progress - from 0 to 1
     */
    public void onProgress(AnimationObject progress);

    /**
     * Method will be invoked when animation complete
     */
    public void onAnimationComplete(AnimationObject progress);

}
