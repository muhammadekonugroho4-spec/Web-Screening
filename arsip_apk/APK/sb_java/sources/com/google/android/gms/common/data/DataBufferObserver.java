package com.google.android.gms.common.data;

/* loaded from: classes5.dex */
public interface DataBufferObserver {

    public interface Observable {
        void addObserver(DataBufferObserver r1);

        void removeObserver(DataBufferObserver r1);
    }

    void onDataChanged();

    void onDataRangeChanged(int r1, int r2);

    void onDataRangeInserted(int r1, int r2);

    void onDataRangeMoved(int r1, int r2, int r3);

    void onDataRangeRemoved(int r1, int r2);
}
