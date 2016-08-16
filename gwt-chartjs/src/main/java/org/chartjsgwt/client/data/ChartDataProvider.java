package org.chartjsgwt.client.data;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ChartDataProvider {
	
	public ChartData getData();
	
	public void reload(AsyncCallback<ChartData> callback);
	
}
