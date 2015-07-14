package io.github.sidney3172.playground.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class PlaygroundEntryPoint implements EntryPoint{

	public void onModuleLoad() {
		RootPanel.get().add(new PlaygroundView());
	}
}
