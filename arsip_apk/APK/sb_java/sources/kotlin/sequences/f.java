package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final i f180305a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f180306b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlin.jvm.functions.l f180307c;

    public static final class a implements Iterator, kotlin.jvm.internal.markers.a {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator f180308a;

        /* renamed from: b, reason: collision with root package name */
        public int f180309b;

        /* renamed from: c, reason: collision with root package name */
        public Object f180310c;
        public final /* synthetic */ f d;

        public a(f r1) {
            this.d = r1;
            this.f180308a = f.e(r1).iterator();
            this.f180309b = -1;
        }

        public final void a() {
        L3:
            if (this.f180308a.hasNext() == false) goto L8;
            Object r02 = this.f180308a.next();
            if (((Boolean) f.c(this.d).invoke(r02)).booleanValue() != f.d(this.d)) goto L3;
            this.f180310c = r02;
            this.f180309b = 1;
            return;
        L8:
            this.f180309b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f180309b != (-1)) goto L6;
            a();
        L6:
            if (this.f180309b != 1) goto L8;
            return true;
        L8:
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f180309b != (-1)) goto L6;
            a();
        L6:
            if (this.f180309b == 0) goto L10;
            Object r02 = this.f180310c;
            this.f180310c = null;
            this.f180309b = -1;
            return r02;
        L10:
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(i r2, boolean r3, kotlin.jvm.functions.l r4) {
        kotlin.jvm.internal.p.l(r2, "sequence");
        kotlin.jvm.internal.p.l(r4, "predicate");
        this.f180305a = r2;
        this.f180306b = r3;
        this.f180307c = r4;
    }

    public static final /* synthetic */ kotlin.jvm.functions.l c(f r02) {
        return r02.f180307c;
    }

    public static final /* synthetic */ boolean d(f r02) {
        return r02.f180306b;
    }

    public static final /* synthetic */ i e(f r02) {
        return r02.f180305a;
    }

    @Override // kotlin.sequences.i
    public Iterator iterator() {
        return new a(this);
    }
}
