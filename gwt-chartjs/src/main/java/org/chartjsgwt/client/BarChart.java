package org.chartjsgwt.client;

import org.chartjsgwt.client.options.BarChartOptions;
import org.chartjsgwt.client.options.scale.BarScale;
import org.chartjsgwt.client.options.scale.Scale;


public class BarChart extends Chart {
	
	@Override
	public String getChartType() {
		return "bar";
	}
	
	@Override
	protected BarChartOptions createOptions() {
		return BarChartOptions.create();//super.createOptions().cast();
	}
	
	@Override
	public BarChartOptions getOptions() {
		return (BarChartOptions) super.getOptions();
	}

	public final void setXAxis(Scale xAxis) {
		getOptions().setSingleXAxis(xAxis);
	}

	public final void setXAxis(BarScale xAxis) {
		this.setXAxis((Scale)xAxis);
	}
	
	
	public final void setXAxes(Scale[] xAxes) {
		getOptions().setXAxes(xAxes);
	}

	public final void setXAxes(BarScale[] xAxes) {
		getOptions().setXAxes(xAxes);
	}

	public final void setYAxes(Scale[] yAxes) {
		getOptions().setYAxes(yAxes);
	}
	public final void setYAxes(BarScale[] yAxes) {
		getOptions().setYAxes(yAxes);
	}

	public final void setYAxis(Scale yAxis) {
		getOptions().setSingleYAxis(yAxis);
	}

	public final void setYAxis(BarScale yAxis) {
		this.setYAxis((Scale)yAxis);
	}
	
//	@Override
//	protected native final JavaScriptObject getOptionsJS() /*-{
//		var options = {
//		    responsive: true,
//		    maintainAspectRatio: false,
//		    scales: {
//		        yAxes: [
//		            {
//		                id: "y-axis-gpw",
//		                categoryPercentage: 0.5,
//		                ticks: {
//		                    beginAtZero: true
//		                },
//		                position: "left"
//		            },
//		            {
//		                id: "y-axis-pax",
//		                type: "linear",
//		                position: "right",
//		                ticks: {
//		                    "beginAtZero": true
//		                },
//		                gridLines: {
//		                    "display": false,
//		                    "drawOnChartArea": false,
//		                    "zeroLineWidth": 0
//		                }
//		            }
//		        ]
//		    }
//		};
//		return options;
//	}-*/;
	
//	
//	private native void drawBar(JavaScriptObject data)/*-{
//        canvas = this.@org.chartjsgwt.client.Chart::getNativeElement()();
//        nativeCanvas = this.@org.chartjsgwt.client.Chart::getNativeCanvas()();
//        if(nativeCanvas != null) {
//            nativeCanvas.destroy();
//        }
//
//        var options = this.@org.chartjsgwt.client.Chart::getOptions()();
//        var yAxisTicks = this.@org.chartjsgwt.client.BarChart::getTicksConfig()();
//        options["scales"] = {
//            yAxes: [{
//                stacked: false,
//                ticks: yAxisTicks
//            }]
//        };
//    	//console.log("options: "+JSON.stringify(options, null, 4));
//        
//        var ctx = canvas.getContext("2d");
//        nativeCanvas = new $wnd.Chart(ctx, {
//        	type: "bar",
//        	data: data,
//        	options: options
//        });
//        this.@org.chartjsgwt.client.Chart::setNativeCanvas(Lcom/google/gwt/core/client/JavaScriptObject;)(nativeCanvas);
//	}-*/;
	
	/*
	 * BAR+LINE
	 * var data = {
    labels: ["January", "February", "March", "April", "May", "June", "July"],
    datasets: [{
        label: "My First dataset",
        //new option, type will default to bar as that what is used to create the scale
        type: "line",
        fillColor: "rgba(220,220,220,0.2)",
        strokeColor: "rgba(220,220,220,1)",
        pointColor: "rgba(220,220,220,1)",
        pointStrokeColor: "#fff",
        pointHighlightFill: "#fff",
        pointHighlightStroke: "rgba(220,220,220,1)",
        data: [65, 59, 4, 81, 56, 55, 40]
    }, {
        label: "My First dataset",
        //new option, type will default to bar as that what is used to create the scale
        type: "bar",
        fillColor: "rgba(220,20,220,0.2)",
        strokeColor: "rgba(220,20,220,1)",
        pointColor: "rgba(220,20,220,1)",
        pointStrokeColor: "#fff",
        pointHighlightFill: "#fff",
        pointHighlightStroke: "rgba(220,220,220,1)",
        data: [32, 25, 33, 88, 12, 92, 33]
    }]
};
	 */

}
