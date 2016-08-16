package org.chartjsgwt.client;

import org.chartjsgwt.client.resources.ChartResources;
import org.chartjsgwt.client.resources.Resources221;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.ScriptElement;


/**
 * Utility class which helps to inject native chart.js code into browser
 * @author sidney3172
 *
 */
public final class ChartJs {

	private static boolean injected = false;
	
	private static final ChartResources RESOURCES = GWT.create(Resources221.class);
	public static final ChartResources resources ()
	{
		return RESOURCES;
	}
	
	/**
	 * Method injecting native chart.js code into the browser<br/>
	 * In case code already been injected do nothing
	 */
	public static void ensureInjected() { //TODO: do real injection (lazy loading)
		if(injected)
			return;
		String source = resources().chartJsSource().getText();
        ScriptElement scriptElement = Document.get().createScriptElement();
        scriptElement.setId("_chartjs");
        scriptElement.setInnerText(source);
        Document.get().getBody().appendChild(scriptElement);
		injected = true;
		GWT.log("Chart JS v2 injected :)");
	}
}
