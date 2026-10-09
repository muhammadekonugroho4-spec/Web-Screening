package androidx.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.collection.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2347k implements Iterator, kotlin.jvm.internal.markers.a {

    /* renamed from: a, reason: collision with root package name */
    public int f6458a;

    /* renamed from: b, reason: collision with root package name */
    public int f6459b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6460c;

    public AbstractC2347k(int r1) {
        this.f6458a = r1;
    }

    public abstract Object a(int r1);

    public abstract void b(int r1);

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f6459b >= this.f6458a) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext() == false) goto L7;
        Object r02 = a(this.f6459b);
        this.f6459b++;
        this.f6460c = true;
        return r02;
    L7:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.f6460c == true) goto L5;
        androidx.collection.internal.d.b("Call next() before removing an element.");
    L5:
        int r02 = this.f6459b - 1;
        this.f6459b = r02;
        b(r02);
        this.f6458a--;
        this.f6460c = false;
    }
}
