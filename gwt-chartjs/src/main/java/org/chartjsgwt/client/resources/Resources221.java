package org.chartjsgwt.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

/**
 * Class contains resources required for chart library
 * 
 * @author Tomáš Rohrbacher (rohrbacher[at]elvoris.cz)
 */
public interface Resources221 extends ClientBundle, ChartResources
{
	
	/**
	 * Contains text representation of native chart.js code
	 * @return
	 */
	@Source("js/Chart-2.2.1.min.cache.js")
	TextResource chartJsSource();
	
	/**
	 * Default style required for chart styling
	 * @return
	 */
	@Source("js/chart.css")
	ChartStyle chartStyle();
	
}
