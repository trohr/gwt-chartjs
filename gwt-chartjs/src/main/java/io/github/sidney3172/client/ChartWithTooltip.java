package io.github.sidney3172.client;

import com.google.gwt.dom.client.Style;
import com.google.gwt.user.client.Event;
import io.github.sidney3172.client.options.HasTooltip;

/**
 * Adds tooltip configurations to Chart object
 * @author sidney3172
 */
public abstract class ChartWithTooltip extends Chart implements HasTooltip{
	
	public ChartWithTooltip() {
		// default constructor
	}
	
	public ChartWithTooltip(int width, int height) {
		super(width, height);
	}

    public void setTooltipEvents(Event... events) {
        String[] eventsString = new String[events.length];
        for(int i=0;i<events.length;i++){
            eventsString[i] = events[i].getType();
        }
        options.setArrayProperty(TOOLTIPEVENTS, eventsString);
    }

    public void setTooltipFillColor(String color) {
        options.setProperty(TOOLTIPFILLCOLOR, color);
    }

    public void showTooltips(boolean show) {
        if(!show)
            options.clearProperty(SHOWTOOLTIPS);
        else
            options.setProperty(SHOWTOOLTIPS, show);
    }

    public void setTooltipFontFamily(String fontFamily) {
        options.setProperty(TOOLTIPFONTFAMILY, fontFamily);
    }

    public void setTooltipFontSize(int fontSize) {
        options.setProperty(TOOLTIPFONTSIZE, fontSize);
    }

    public void setTooltipFontStyle(Style.FontStyle fontStyle) {
        options.setProperty(TOOLTIPFONTSTYLE, fontStyle.getCssName());
    }

    public void setTooltipFontColor(String color) {
        options.setProperty(TOOLTIPFONTCOLOR, color);
    }

    public void setTooltipTitleFontFamily(String fontFamily) {
        options.setProperty(TOOLTIPTITLEFONTFAMILY, fontFamily);
    }

    public void setTooltipTitleFontSize(int size) {
        options.setProperty(TOOLTIPTITLEFONTSIZE, size);
    }

    public void setTooltipTitleFontStyle(Style.FontStyle style) {
        options.setProperty(TOOLTIPTITLEFONTSTYLE, style.getCssName());
    }

    public void setTooltipTitleFontColor(String color) {
        options.setProperty(TOOLTIPTITLEFONTCOLOR, color);
    }

    public void setTooltipYPadding(int padding) {
        options.setProperty(TOOLTIPYPADDING, padding);
    }

    public void setTooltipXPadding(int padding) {
        options.setProperty(TOOLTIPXPADDING, padding);
    }

    public void setCornerRadius(int radius) {
        options.setProperty(TOOLTIPCORNERRADIUS, radius);
    }

    public void setTooltipCaretSize(int size) {
        options.setProperty(TOOLTIPCARETSIZE, size);
    }

    public void setTooltipXOffset(int offset) {
        options.setProperty(TOOLTIPXOFFSET, offset);
    }

    public void setTooltipTemplate(String template) {
        options.setProperty(TOOLTIPTEMPLATE, template);
    }

    public void setMultiTooltipTemplate(String template) {
        options.setProperty(MULTITOOLTIPTEMPLATE, template);
    }
}
