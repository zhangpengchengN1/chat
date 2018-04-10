package com.zpc.chart.interfaces.dataprovider;


import com.zpc.chart.data.CandleData;

public interface CandleDataProvider extends BarLineScatterCandleBubbleDataProvider {

    CandleData getCandleData();
}
