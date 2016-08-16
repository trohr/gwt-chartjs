/**
 * 
 */
package org.chartjsgwt.client.resources;

import com.google.gwt.resources.client.TextResource;

/**
 * Concrete version should be configured in the module.gwt.xml file via the 'replace-with' mechanism.
 * 
 * @author Tomáš Rohrbacher (rohrbacher[at]elvoris.cz)
 */
public interface ChartResources
{

	TextResource chartJsSource();
	ChartStyle chartStyle();
	
}
