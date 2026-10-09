package io.sentry.cache.tape;

import io.sentry.cache.tape.c;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final d f176134a;

    /* renamed from: b, reason: collision with root package name */
    public final a f176135b;

    /* renamed from: c, reason: collision with root package name */
    public final c.a f176136c;

    public static final class a extends ByteArrayOutputStream {
        public a() {
        }

        public byte[] c() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    /* renamed from: io.sentry.cache.tape.b$b, reason: collision with other inner class name */
    public final class C1848b implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator f176137a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f176138b;

        public C1848b(b r1, Iterator r2) {
            this.f176138b = r1;
            this.f176137a = r2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f176137a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            byte[] r02 = (byte[]) this.f176137a.next();
            return this.f176138b.f176136c.b(r02);
        L5:
            e = move-exception;
            throw ((Error) d.t(e));
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f176137a.remove();
        }
    }

    public b(d r2, c.a r3) {
        this.f176135b = new a();
        this.f176134a = r2;
        this.f176136c = r3;
    }

    @Override // io.sentry.cache.tape.c
    public void clear() {
        this.f176134a.clear();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f176134a.close();
    }

    @Override // io.sentry.cache.tape.c
    public void f(Object r4) {
        this.f176135b.reset();
        this.f176136c.a(r4, this.f176135b);
        this.f176134a.l(this.f176135b.c(), 0, this.f176135b.size());
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C1848b(this, this.f176134a.iterator());
    }

    @Override // io.sentry.cache.tape.c
    public int size() {
        return this.f176134a.size();
    }

    public String toString() {
        return "FileObjectQueue{queueFile=" + this.f176134a + '}';
    }

    @Override // io.sentry.cache.tape.c
    public void u(int r2) {
        this.f176134a.y0(r2);
    }
}
