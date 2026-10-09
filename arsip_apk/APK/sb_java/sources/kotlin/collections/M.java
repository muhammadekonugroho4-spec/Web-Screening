package kotlin.collections;

import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class M implements Iterator, kotlin.jvm.internal.markers.a {
    public M() {
    }

    public abstract long a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
