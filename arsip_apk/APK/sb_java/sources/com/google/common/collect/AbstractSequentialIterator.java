package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.NoSuchElementException;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
public abstract class AbstractSequentialIterator<T> extends UnmodifiableIterator<T> {
    private T nextOrNull;

    public AbstractSequentialIterator(T r1) {
        this.nextOrNull = r1;
    }

    public abstract T computeNext(T r1);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.nextOrNull == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        T r02 = this.nextOrNull;
        if (r02 == null) goto L7;
        this.nextOrNull = computeNext(r02);
        return r02;
    L7:
        throw new NoSuchElementException();
    }
}
