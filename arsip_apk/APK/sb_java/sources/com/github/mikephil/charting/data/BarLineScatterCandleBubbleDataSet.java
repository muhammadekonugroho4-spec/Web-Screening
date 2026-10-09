package com.github.mikephil.charting.data;

import android.graphics.Color;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.google.firebase.perf.util.Constants;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class BarLineScatterCandleBubbleDataSet<T extends Entry> extends DataSet<T> implements IBarLineScatterCandleBubbleDataSet<T> {
    protected int mHighLightColor;

    public BarLineScatterCandleBubbleDataSet(List<T> r2, String r3) {
        super(r2, r3);
        this.mHighLightColor = Color.rgb(Constants.MAX_HOST_LENGTH, 187, 115);
    }

    public void copy(BarLineScatterCandleBubbleDataSet r2) {
        super.copy(r2);
        r2.mHighLightColor = this.mHighLightColor;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet
    public int getHighLightColor() {
        return this.mHighLightColor;
    }

    public void setHighLightColor(int r1) {
        this.mHighLightColor = r1;
    }
}
