package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f16182c;

    static {
    }

    public d(Object[] r1, int r2, int r3) {
        super(r2, r3);
        this.f16182c = r1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (hasNext() == false) goto L7;
        Object[] r02 = this.f16182c;
        int r1 = d();
        e(r1 + 1);
        return r02[r1];
    L7:
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public Object previous() {
        if (hasPrevious() == false) goto L7;
        Object[] r02 = this.f16182c;
        e(d() - 1);
        return r02[d()];
    L7:
        throw new NoSuchElementException();
    }
}
