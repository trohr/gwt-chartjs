/**
 * 
 */
package org.chartjsgwt.client.options;

import org.chartjsgwt.client.options.scale.Scale;
import org.chartjsgwt.client.options.scale.Scales;

/**
 * Common options for area charts (Bar and Line). 
 * 
 * @author Tomáš Rohrbacher (rohrbacher[at]elvoris.cz)
 */
public class AreaChartOptions extends CommonChartOptions {

	static public AreaChartOptions create()
	{
		return new AreaChartOptions();
		//return JavaScriptObject.createObject().cast();
	}

	/**
	 * Constructors must be 'protected' in subclasses of JavaScriptObject
	 */
	protected AreaChartOptions() {
		super();
	}


	//
	// SCALES
	//

	public final native Scales getScales () /*-{
		return this.scales;
	}-*/;

	public final native void setScales (Scales scales) /*-{
		this.scales = scales;
	}-*/;

	public final Scales useScales () {
		Scales scales = getScales();
		if (scales == null) {
			setScales(scales = Scales.create());
		}
		return scales;
	}

	//
	// X
	//

	public final Scale[] getXAxes () {
		return this.getScales() == null ? null : this.getScales().getXAxes();
	};

	public final void setXAxes (Scale[] xAxes) {
		if (this.getScales() == null)
		{
			if (xAxes == null) {
				// ok
				return;
			}
			this.setScales(Scales.create());
		}
		this.getScales().setXAxes(xAxes);
	};

	public final void setSingleXAxis (Scale xAxis) {
		if (this.getScales() == null)
		{
			if (xAxis == null) {
				// ok
				return;
			}
			this.setScales(Scales.create());
		}
		this.getScales().setSingleXAxis(xAxis);
	};



	//
	// Y
	//

	public final Scale[] getYAxes () {
		return this.getScales() == null ? null : this.getScales().getYAxes();
	};

	public final void setYAxes (Scale[] yAxes) {
		if (this.getScales() == null)
		{
			if (yAxes == null) {
				// ok
				return;
			}
			this.setScales(Scales.create());
		}
		this.getScales().setYAxes(yAxes);
	};

	public final void setSingleYAxis (Scale yAxis) {
		if (this.getScales() == null)
		{
			if (yAxis == null) {
				// ok
				return;
			}
			this.setScales(Scales.create());
		}
		this.getScales().setSingleYAxis(yAxis);
	};

}
