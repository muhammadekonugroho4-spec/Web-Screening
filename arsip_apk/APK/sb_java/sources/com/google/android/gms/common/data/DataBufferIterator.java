package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

@KeepForSdk
/* loaded from: classes5.dex */
public class DataBufferIterator<T> implements Iterator<T> {
    protected final DataBuffer zaa;
    protected int zab;

    public DataBufferIterator(DataBuffer r1) {
        this.zaa = (DataBuffer) Preconditions.checkNotNull(r1);
        this.zab = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        DataBuffer r02 = this.zaa;
        if (this.zab >= (r02.getCount() - 1)) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext() == false) goto L7;
        DataBuffer r02 = this.zaa;
        int r1 = this.zab + 1;
        this.zab = r1;
        return r02.get(r1);
    L7:
        throw new NoSuchElementException("Cannot advance the iterator beyond " + this.zab);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
