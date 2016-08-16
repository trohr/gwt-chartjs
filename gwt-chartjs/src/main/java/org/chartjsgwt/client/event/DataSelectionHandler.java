package org.chartjsgwt.client.event;

import com.google.gwt.event.shared.EventHandler;

/**
 * Handler interface for handling {@link DataSelectionEvent}
 * @author sidney3172
 *
 */
public interface DataSelectionHandler extends EventHandler {

	/**
	 * Method will be invoked when animation is complete
	 * @param event : object contains reference to the instance of chart
	 */
	public void onDataSelected(DataSelectionEvent event);
	
}
