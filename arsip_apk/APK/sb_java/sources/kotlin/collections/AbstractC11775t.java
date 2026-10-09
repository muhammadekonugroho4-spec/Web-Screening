package kotlin.collections;

import java.util.Iterator;

/* renamed from: kotlin.collections.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11775t implements Iterator, kotlin.jvm.internal.markers.a {
    public AbstractC11775t() {
    }

    public abstract char a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
