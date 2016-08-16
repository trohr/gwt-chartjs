package org.chartjsgwt.client.options.hover;

/**
 * <p>Sets which elements hover. 
 * Acceptable options are <code>'single'</code>, <code>'label'</code>, <code>'x-axis'</code>, or <code>'dataset'</code>.
 * 
 * <dl>
 * <dt>single</dt><dd>highlights the closest element.</dd> 
 * <dt><code>label</code></dt><dd>highlights elements in all datasets at the same <code>X</code> value.</dd> 
 * <dt><code>x-axis</code></dt><dd>also highlights elements in all datasets at the same <code>X</code> value, but activates when hovering anywhere within the vertical slice of the x-axis representing that <code>X</code> value.</dd> 
 * <dt><code>dataset</code></dt><dd>highlights the closest dataset.</dd>
 * </dl>
 * 
 * @author Tomáš Rohrbacher (rohrbacher[at]elvoris.cz)
 */
public enum HoverMode
{
	SINGLE ("single"),
	LABEL ("label"),
	X_AXIS ("x-axis"),
	DATASET ("dataset"),
	;

    private String value;

    private HoverMode(String value){
        this.value = value;
    }

    /**
     * @return javascript name of the hover mode (used in native chart.js code)
     */
    public String getValue(){
        return value;
    }
    
}
