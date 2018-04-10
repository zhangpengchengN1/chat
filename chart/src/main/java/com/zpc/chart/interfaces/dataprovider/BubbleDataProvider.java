package com.zpc.chart.interfaces.dataprovider;


import com.zpc.chart.data.BubbleData;

public interface BubbleDataProvider extends BarLineScatterCandleBubbleDataProvider {

    BubbleData getBubbleData();
}
