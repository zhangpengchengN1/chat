package com.zpc.chart.interfaces.dataprovider;


import com.zpc.chart.components.YAxis;
import com.zpc.chart.data.LineData;

public interface LineDataProvider extends BarLineScatterCandleBubbleDataProvider {

    LineData getLineData();

    YAxis getAxis(YAxis.AxisDependency dependency);
}
