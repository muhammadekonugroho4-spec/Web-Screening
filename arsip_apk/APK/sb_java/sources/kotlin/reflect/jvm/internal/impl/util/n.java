package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class n extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f180178a;

    /* renamed from: b, reason: collision with root package name */
    public final int f180179b;

    public static final class a implements Iterator, kotlin.jvm.internal.markers.a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f180180a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f180181b;

        public a(n r1) {
            this.f180181b = r1;
            this.f180180a = true;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f180180a;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f180180a == false) goto L7;
            this.f180180a = false;
            return this.f180181b.d();
        L7:
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public n(Object r2, int r3) {
        kotlin.jvm.internal.p.l(r2, "value");
        super(null);
        this.f180178a = r2;
        this.f180179b = r3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public void a(int r1, Object r2) {
        kotlin.jvm.internal.p.l(r2, "value");
        throw new IllegalStateException();
    }

    public final int b() {
        return this.f180179b;
    }

    public final Object d() {
        return this.f180178a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public Object get(int r2) {
        if (r2 == this.f180179b) goto L5;
        return null;
    L5:
        return this.f180178a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public int getSize() {
        return 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c, java.lang.Iterable
    public Iterator iterator() {
        return new a(this);
    }
}
