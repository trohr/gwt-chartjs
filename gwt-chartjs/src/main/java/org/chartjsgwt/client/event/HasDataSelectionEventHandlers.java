package org.chartjsgwt.client.event;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.HasHandlers;

/**
 * Interface describe methods required for adding new handlers of {@link DataSelectionEvent}
 * @author sidney3172
 *
 */
public interface HasDataSelectionEventHandlers extends HasHandlers {

	/**
	 * Add {@link DataSelectionEvent} handler to widget.
	 * @param handler
	 */
	public HandlerRegistration addDataSelectionHandler(DataSelectionHandler handler);
}
