package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class d implements Iterator, kotlin.jvm.internal.markers.a {

    /* renamed from: a, reason: collision with root package name */
    public Object f16251a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f16252b;

    /* renamed from: c, reason: collision with root package name */
    public int f16253c;

    static {
    }

    public d(Object r1, Map r2) {
        this.f16251a = r1;
        this.f16252b = r2;
    }

    private final void a() {
        if (hasNext() == false) goto L6;
        return;
    L6:
        throw new NoSuchElementException();
    }

    public final int b() {
        return this.f16253c;
    }

    public final void d(int r1) {
        this.f16253c = r1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f16253c >= this.f16252b.size()) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        a();
        Object r02 = this.f16251a;
        this.f16253c++;
        Object r1 = this.f16252b.get(r02);
        if (r1 == null) goto L7;
        this.f16251a = ((a) r1).c();
        return r02;
    L7:
        throw new ConcurrentModificationException("Hash code of an element (" + r02 + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
