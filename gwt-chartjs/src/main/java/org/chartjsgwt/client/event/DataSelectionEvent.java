package org.chartjsgwt.client.event;

import java.util.LinkedList;
import java.util.List;

import org.chartjsgwt.client.data.SingleSeriesData;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.json.client.JSONObject;

/**
 * Created by sidney3172 on 08/08/14.
 */
public class DataSelectionEvent extends GwtEvent<DataSelectionHandler> {

    private static Type<DataSelectionHandler> TYPE = new Type<DataSelectionHandler>();

    private Object sender;
    private LinkedList<SingleSeriesData> series;

    protected DataSelectionEvent(Object sender){
        this.sender = sender;
    }

    public Object getSender(){
        return sender;
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<DataSelectionHandler> getAssociatedType() {
        return TYPE;
    }

    public static Type<DataSelectionHandler> getType(){
        return TYPE;
    }

    @Override
    protected void dispatch(DataSelectionHandler handler) {
        handler.onDataSelected(this);
    }

    public static void fire(HasDataSelectionEventHandlers source, Object sender, JavaScriptObject data) {
//        if (!GWT.isProdMode())
//        {
//        	GWT.log("DataSelectionEvent: "+data.toString());
//        }
        JSONObject array = new JSONObject(data);
        
        DataSelectionEvent event = new DataSelectionEvent(sender);
        event.series = new LinkedList<SingleSeriesData>();
        for(String key : array.keySet()){

            JSONObject obj = array.get(key).isObject();
            if(obj != null){
                SingleSeriesData series1 = JavaScriptObject.createObject().cast();
                series1.setValue(obj.get("value").isNumber().doubleValue());
                series1.setColor(obj.get("fillColor").isString().stringValue());
                series1.setLabel(obj.get("label").isString().stringValue());
                event.series.add(series1);
            }
        }
        source.fireEvent(event);
    }

    public List<SingleSeriesData> getSeries() {
        return series;
    }
}
