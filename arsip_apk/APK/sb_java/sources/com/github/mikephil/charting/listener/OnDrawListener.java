package com.github.mikephil.charting.listener;

import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;

/* loaded from: classes4.dex */
public interface OnDrawListener {
    void onDrawFinished(DataSet<?> r1);

    void onEntryAdded(Entry r1);

    void onEntryMoved(Entry r1);
}
