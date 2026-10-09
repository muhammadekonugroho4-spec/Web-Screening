package com.google.android.gms.common.data;

import com.google.android.gms.common.data.DataBufferObserver;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class DataBufferObserverSet implements DataBufferObserver, DataBufferObserver.Observable {
    private final HashSet zaa;

    public DataBufferObserverSet() {
        this.zaa = new HashSet();
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver.Observable
    public void addObserver(DataBufferObserver r2) {
        this.zaa.add(r2);
    }

    public void clear() {
        this.zaa.clear();
    }

    public boolean hasObservers() {
        if (this.zaa.isEmpty() == true) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataChanged() {
        Iterator r02 = this.zaa.iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((DataBufferObserver) r02.next()).onDataChanged();
        goto L4
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeChanged(int r3, int r4) {
        Iterator r02 = this.zaa.iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((DataBufferObserver) r02.next()).onDataRangeChanged(r3, r4);
        goto L4
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeInserted(int r3, int r4) {
        Iterator r02 = this.zaa.iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((DataBufferObserver) r02.next()).onDataRangeInserted(r3, r4);
        goto L4
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeMoved(int r3, int r4, int r5) {
        Iterator r02 = this.zaa.iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((DataBufferObserver) r02.next()).onDataRangeMoved(r3, r4, r5);
        goto L4
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeRemoved(int r3, int r4) {
        Iterator r02 = this.zaa.iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((DataBufferObserver) r02.next()).onDataRangeRemoved(r3, r4);
        goto L4
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver.Observable
    public void removeObserver(DataBufferObserver r2) {
        this.zaa.remove(r2);
    }
}
