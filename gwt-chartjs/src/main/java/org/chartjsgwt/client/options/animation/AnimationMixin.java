package org.chartjsgwt.client.options.animation;

import java.util.ArrayList;
import java.util.List;

import org.chartjsgwt.client.options.CommonChartOptions;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Animation mixin for usage from Chart
 * 
 * @author Tomáš Rohrbacher (rohrbacher[at]elvoris.cz)
 */
public class AnimationMixin implements /*HasAnimationCompleteHandlers, */HasAnimation2
{
	static final private boolean LAZY_ANIMATION_CALLBACKS = true;

    final private CommonChartOptions options;
	
    private List<AnimationCallback2> callbackList;
	
	/**
	 * Default Constructor
	 */
	public AnimationMixin(CommonChartOptions options)
	{
		if (options == null)
		{
			throw new IllegalArgumentException ("Options have to be specified!");
		}
		this.options = options;
		
		if (!LAZY_ANIMATION_CALLBACKS)
		{
			this.ensureAnimationCallbacks();
		}
	}

    
    /**
     * Method returns custom options for chart
     * @return
     */
    public CommonChartOptions getOptions()
    {
    	return options;
    }
    
    public JavaScriptObject getOptionsJS()
    {
    	return options.asJavaScriptObject();
    }

    /*
     * Specify should chart be animated or not
     * Default value is <code>true</code>
     * @param enabled
     *
    public void setAnimationEnabled(boolean enabled) {
        if(!enabled) //"animation" : false interpreted by chart.js as "true"
            options.clearProperty(ANIMATION);
        else
            options.setProperty(ANIMATION, enabled);
    }
    */

    protected AnimationConfig getAnimationConfigAndCreateIfUndefined ()
    {
    	AnimationConfig animationConfig = getOptions().getAnimation();
    	if (animationConfig == null) {
    		animationConfig = AnimationConfig.create();
    		getOptions().setAnimation(animationConfig);
    	}
    	return animationConfig;
    }
    
    /**
     * Specify animation easing
     * Default value is {@link AnimationType#EASE_OUT_QUART}
     * @param type
     */
    @Override
    public void setAnimationType(AnimationType type)
    {
    	AnimationConfig animationConfig = getOptions().getAnimation();
    	if (animationConfig == null) {
    		if (type == null) {
    			return;
    		}
    		animationConfig = AnimationConfig.create();
    		getOptions().setAnimation(animationConfig);
    	}
    	animationConfig.setEasing(type == null ? null : type.getValue());
    }

    @Override
    public void setAnimationDuration(int duration)
    {
        if(duration < 0) {
            throw new IndexOutOfBoundsException("Number of millis for animation duration should not be negative. Found '"+duration+"'");
        }
        getAnimationConfigAndCreateIfUndefined ().setDuration(duration);
    }

    
    
    /**
     * Add animation callback to handle animation state changes
     * @param callback
     */
    public final void addAnimationCallback(AnimationCallback2 callback)
    {
        if (callback != null) {
        	ensureAnimationCallbacks ().add(callback);
        }
    }

    private final List<AnimationCallback2> ensureAnimationCallbacks ()
    {
        if (callbackList == null)
        {
        	callbackList = new ArrayList<AnimationCallback2>();
        	registerNativeAnimationHandlers();
        }
        return callbackList;
    }

	/*
	@Override
	public void addAnimationCompleteHandler(AnimationCompleteHandler handler) {
		addHandler(handler, AnimationCompleteEvent.getType());
	}
	*/

    protected native void registerNativeAnimationHandlers() /*-{
        var options = this.@org.chartjsgwt.client.options.animation.AnimationMixin::getOptionsJS()();
        var self = this;
        options.animation.onProgress = function(callbackData) {
            self.@org.chartjsgwt.client.options.animation.AnimationMixin::onAnimationProgress(Lorg/chartjsgwt/client/options/animation/AnimationObject;)(callbackData.animationObject);
            return;
        }
        options.animation.onComplete = function(callbackData) {
            self.@org.chartjsgwt.client.options.animation.AnimationMixin::onAnimationComplete(Lorg/chartjsgwt/client/options/animation/AnimationObject;)(callbackData.animationObject);
            return;
        }
    }-*/;


    
    protected void onAnimationProgress(AnimationObject callbackData) {
    	//GWT.log("On animation progress: "+callbackData);
        for (AnimationCallback2 callback : callbackList) {
            if (callback != null) {
                callback.onProgress(callbackData);
            }
        }
    }

    protected void onAnimationComplete(AnimationObject callbackData) {
    	//GWT.log("On animation complete: "+callbackData);
        for (AnimationCallback2 callback : callbackList) {
            if (callback != null) {
                callback.onAnimationComplete(callbackData);
            }
        }
    }

}
