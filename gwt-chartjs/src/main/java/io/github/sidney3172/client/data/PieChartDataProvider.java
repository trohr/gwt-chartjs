package io.github.sidney3172.client.data;

import org.chartjsgwt.client.data.SingleSeriesData;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface PieChartDataProvider {
	
	public JsArray<SingleSeriesData> getData();
	
	public void reload(AsyncCallback<JsArray<SingleSeriesData>> callback);
}
