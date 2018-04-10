package com.zpc.chart.interfaces.dataprovider;


import com.zpc.chart.data.ScatterData;

public interface ScatterDataProvider extends BarLineScatterCandleBubbleDataProvider {

    ScatterData getScatterData();
}
