package io.github.sidney3172.client;

import com.google.gwt.dom.client.Style;
import io.github.sidney3172.client.options.HasScale;

/**
 * Created by sidney3172 on 13/08/14.
 */
public abstract class ChartWithScale extends ChartWithTooltip implements HasScale{

	public ChartWithScale() {
		// default constructor
	}
	
	public ChartWithScale(int width, int height) {
		super(width, height);
	}
	
    public void showScale(boolean scale) {
        if(!scale)
            options.clearProperty(SHOWSCALE);
        else
            options.setProperty(SHOWSCALE, true);
    }

    public void setScaleOverride(boolean override) {
        if(!override)
            options.clearProperty(SCALEOVERRIDE);
        else
            options.setProperty(SCALEOVERRIDE, override);
    }

    public void setScaleSteps(int steps) {
        options.setProperty(SCALESTEPS, steps);
    }

    public void setScaleStepWidth(int width) {
        options.setProperty(SCALESTEPWIDTH, width);
    }

    public void setScaleStartValue(double startValue) {
        options.setProperty(SCALESTARTVALUE, startValue);
    }

    public void setScaleLineColor(String color) {
        options.setProperty(SCALELINECOLOR, color);
    }

    public void setScaleLineWidth(int pixelWidth) {
        options.setProperty(SCALELINEWIDTH, pixelWidth);
    }

    public void setScaleShowLabels(boolean showLabels) {
        if(!showLabels)
            options.clearProperty(SCALESHOWLABELS);
        else
            options.setProperty(SCALESHOWLABELS, true);
    }

    public void setScaleLabel(String template) {
        options.setProperty(SCALELABEL, template);
    }

    public void setScaleIntegersOnly(boolean only) {
        if(!only)
            options.clearProperty(SCALEINTEGERSONLY);
        else
            options.setProperty(SCALEINTEGERSONLY, only);
    }

    public void setScaleBeginAtZero(boolean beginAtZero) {
        options.setProperty(SCALEBEGINATZERO, beginAtZero);
    }

    public void setScaleFontFamily(String fontFamily) {
        options.setProperty(SCALEFONTFAMILY, fontFamily);
    }

    public void setScaleFontSize(int size) {
        options.setProperty(SCALEFONTSIZE, size);
    }

    public void setScaleFontStyle(Style.FontStyle style) {
        options.setProperty(SCALEFONTSTYLE, style.getCssName());
    }

    public void setScaleFontColor(String color) {
        options.setProperty(SCALEFONTCOLOR, color);
    }
}
