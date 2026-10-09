package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: kotlin.jvm.internal.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11782a implements Iterator, kotlin.jvm.internal.markers.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f177490a;

    /* renamed from: b, reason: collision with root package name */
    public int f177491b;

    public C11782a(Object[] r2) {
        p.l(r2, "array");
        this.f177490a = r2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f177491b >= this.f177490a.length) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        Object[] r02 = this.f177490a;     // Catch: ArrayIndexOutOfBoundsException -> L4
        int r1 = this.f177491b;     // Catch: ArrayIndexOutOfBoundsException -> L4
        this.f177491b = r1 + 1;     // Catch: ArrayIndexOutOfBoundsException -> L4
        return r02[r1];
    L4:
        e = move-exception;
        this.f177491b--;
        throw new NoSuchElementException(e.getMessage());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
