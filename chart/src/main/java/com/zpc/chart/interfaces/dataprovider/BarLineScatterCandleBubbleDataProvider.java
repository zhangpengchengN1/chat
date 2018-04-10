package com.zpc.chart.interfaces.dataprovider;


import com.zpc.chart.components.YAxis;
import com.zpc.chart.utils.Transformer;
import com.zpc.chart.data.BarLineScatterCandleBubbleData;

public interface BarLineScatterCandleBubbleDataProvider extends ChartInterface {

    Transformer getTransformer(YAxis.AxisDependency axis);
    boolean isInverted(YAxis.AxisDependency axis);
    
    float getLowestVisibleX();
    float getHighestVisibleX();

    BarLineScatterCandleBubbleData getData();
}
