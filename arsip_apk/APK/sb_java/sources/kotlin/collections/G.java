package kotlin.collections;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class G implements ListIterator, kotlin.jvm.internal.markers.a {

    /* renamed from: a, reason: collision with root package name */
    public static final G f177337a = null;

    static {
        f177337a = new G();
    }

    public G() {
    }

    public Void a() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void add(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Void b() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return false;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return a();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return 0;
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ Object previous() {
        return b();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return -1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void set(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
