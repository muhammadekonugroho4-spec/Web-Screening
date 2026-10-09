package io.sentry.cache.tape;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class a extends c {

    /* renamed from: io.sentry.cache.tape.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C1847a {
    }

    public static final class b implements Iterator {
        public b() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException("No elements in EmptyIterator!");
        }

        public /* synthetic */ b(C1847a r1) {
            this();
        }
    }

    public a() {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // io.sentry.cache.tape.c
    public void f(Object r1) {
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new b(null);
    }

    @Override // io.sentry.cache.tape.c
    public int size() {
        return 0;
    }

    @Override // io.sentry.cache.tape.c
    public void u(int r1) {
    }
}
