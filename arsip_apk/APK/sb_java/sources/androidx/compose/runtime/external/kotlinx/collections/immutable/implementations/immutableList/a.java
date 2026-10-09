package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class a implements ListIterator, kotlin.jvm.internal.markers.a {

    /* renamed from: a, reason: collision with root package name */
    public int f16179a;

    /* renamed from: b, reason: collision with root package name */
    public int f16180b;

    static {
    }

    public a(int r1, int r2) {
        this.f16179a = r1;
        this.f16180b = r2;
    }

    public final void a() {
        if (hasNext() == false) goto L6;
        return;
    L6:
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public void add(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b() {
        if (hasPrevious() == false) goto L6;
        return;
    L6:
        throw new NoSuchElementException();
    }

    public final int d() {
        return this.f16179a;
    }

    public final void e(int r1) {
        this.f16179a = r1;
    }

    public final void f(int r1) {
        this.f16180b = r1;
    }

    public final int getSize() {
        return this.f16180b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        if (this.f16179a >= this.f16180b) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        if (this.f16179a <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f16179a;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f16179a - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
