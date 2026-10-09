package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: kotlin.collections.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11759c implements Iterator, kotlin.jvm.internal.markers.a {

    /* renamed from: a, reason: collision with root package name */
    public int f177380a;

    /* renamed from: b, reason: collision with root package name */
    public Object f177381b;

    public AbstractC11759c() {
    }

    public abstract void a();

    public final void b() {
        this.f177380a = 2;
    }

    public final void d(Object r1) {
        this.f177381b = r1;
        this.f177380a = 1;
    }

    public final boolean e() {
        this.f177380a = 3;
        a();
        if (this.f177380a != 1) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int r02 = this.f177380a;
        if (r02 == 0) goto L14;
        if (r02 != 1) goto L7;
        return true;
    L7:
        if (r02 != 2) goto L11;
        return false;
    L11:
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    L14:
        return e();
    }

    @Override // java.util.Iterator
    public Object next() {
        int r02 = this.f177380a;
        if (r02 != 1) goto L7;
        this.f177380a = 0;
        return this.f177381b;
    L7:
        if (r02 == 2) goto L13;
        if (e() == false) goto L13;
        this.f177380a = 0;
        return this.f177381b;
    L13:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
