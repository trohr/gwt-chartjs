/**
 * 
 */
package org.chartjsgwt.client.options;

/**
 * @author Tomáš Rohrbacher (rohrbacher[at]elvoris.cz)
 *
 */
public class BarChartOptions extends AreaChartOptions {

	static public BarChartOptions create()
	{
		return new BarChartOptions();
		//return JavaScriptObject.createObject().cast();
	}
	
	/**
	 * Constructors must be 'protected' in subclasses of JavaScriptObject
	 */
	protected BarChartOptions() {
	}

	
}
