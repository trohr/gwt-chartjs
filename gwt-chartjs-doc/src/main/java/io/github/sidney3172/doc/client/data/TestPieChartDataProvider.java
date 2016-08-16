package io.github.sidney3172.doc.client.data;

import io.github.sidney3172.client.data.PieChartDataProvider;

import org.chartjsgwt.client.data.SingleSeriesData;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class TestPieChartDataProvider implements PieChartDataProvider{

	private JsArray<SingleSeriesData> data;

	@Override
	public JsArray<SingleSeriesData> getData() {
		return data;
	}

	@Override
	public void reload(AsyncCallback<JsArray<SingleSeriesData>> callback) {
		data = getSeries();
		callback.onSuccess(data);
	}

	private JsArray<SingleSeriesData> getSeries(){
		JsArray<SingleSeriesData> array = JsArray.createArray().cast();

		SingleSeriesData series1 = JavaScriptObject.createObject().cast();
		series1.setColor("#D97041");
		series1.setValue(Math.random());
		array.push(series1);

		SingleSeriesData series2 = JavaScriptObject.createObject().cast();
		series2.setColor("#C7604C");
		series2.setValue(Math.random());
		array.push(series2);

		SingleSeriesData series3 = JavaScriptObject.createObject().cast();
		series3.setColor("#21323D");
		series3.setValue(Math.random());
		array.push(series3);

		SingleSeriesData series4 = JavaScriptObject.createObject().cast();
		series4.setColor("#9D9B7F");
		series4.setValue(Math.random());
		array.push(series4);

		return array;
	}

}