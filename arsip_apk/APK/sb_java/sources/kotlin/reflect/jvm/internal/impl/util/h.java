package kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class h extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final h f180169a = null;

    public static final class a implements Iterator, kotlin.jvm.internal.markers.a {
        public a() {
        }

        public Void a() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return a();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    static {
        f180169a = new h();
    }

    public h() {
        super(null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public /* bridge */ /* synthetic */ void a(int r1, Object r2) {
        d(r1, (Void) r2);
    }

    public Void b(int r1) {
        return null;
    }

    public void d(int r1, Void r2) {
        kotlin.jvm.internal.p.l(r2, "value");
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public /* bridge */ /* synthetic */ Object get(int r1) {
        return b(r1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public int getSize() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }
}
