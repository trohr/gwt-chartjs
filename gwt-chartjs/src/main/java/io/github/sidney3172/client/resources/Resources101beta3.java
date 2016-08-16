package io.github.sidney3172.client.resources;

import org.chartjsgwt.client.resources.ChartStyle;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

/**
 * Class contains resources required for chart library
 * @author sidney3172
 *
 */
public interface Resources101beta3 extends ClientBundle{
	
	/**
	 * Contains text representation of native chart.js code
	 * @return
	 */
	@Source("js/chart-1.0.1-beta.3.min.cache.js")
	TextResource chartJsSource();
	
	/**
	 * Default style required for chart styling
	 * @return
	 */
	@Source("js/chart.css")
	ChartStyle chartStyle();
}
