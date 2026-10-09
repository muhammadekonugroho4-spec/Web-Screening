package com.huawei.hms.common.data;

import com.huawei.hms.common.internal.Preconditions;

/* loaded from: classes6.dex */
public class SingleRefDBInnerIter<T> extends DBInnerIter<T> {
    public SingleRefDBInnerIter(DataBuffer<T> r1) {
        super(r1);
    }

    @Override // com.huawei.hms.common.data.DBInnerIter, java.util.Iterator
    public T next() {
        if (hasNext() == true) goto L6;
        return null;
    L6:
        int r02 = this.index + 1;
        this.index = r02;
        if (r02 != 0) goto L10;
        Preconditions.checkState(this.dataBuffer.get(0) instanceof DataBufferRef, "DataBuffer reference of type " + this.dataBuffer.get(0).getClass() + " is not movable");
        ((DataBufferRef) this.dataBuffer.get(0)).getWindowIndex(this.index);
    L10:
        return (T) this.dataBuffer.get(0);
    }
}
