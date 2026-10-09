package com.huawei.hms.common.data;

import com.huawei.hms.common.internal.Preconditions;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class DBInnerIter<O> implements Iterator<O> {
    protected final DataBuffer<O> dataBuffer;
    protected int index;

    public DBInnerIter(DataBuffer<O> r2) {
        this.index = -1;
        Preconditions.checkNotNull(r2, "dataBuffer cannot be null");
        this.dataBuffer = r2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if ((this.index + 1) >= this.dataBuffer.getCount()) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.Iterator
    public O next() {
        if (hasNext() == false) goto L6;
        DataBuffer<O> r02 = this.dataBuffer;
        int r1 = this.index + 1;
        this.index = r1;
        return r02.get(r1);
    L6:
        return null;
    }
}
