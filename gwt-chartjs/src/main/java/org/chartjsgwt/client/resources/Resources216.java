package org.chartjsgwt.client.resources;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

/**
 * Class contains resources required for chart library
 * @author sidney3172
 *
 */
public interface Resources216 extends ClientBundle, ChartResources
{

	/**
	 * Contains text representation of native chart.js code
	 * @return
	 */
	@Source("js/Chart-2.1.6.min.cache.js")
	TextResource chartJsSource();

	/**
	 * Default style required for chart styling
	 * @return
	 */
	@Source("js/chart.css")
	ChartStyle chartStyle();

}
