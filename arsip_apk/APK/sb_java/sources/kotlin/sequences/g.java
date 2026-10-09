package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final i f180311a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.functions.l f180312b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlin.jvm.functions.l f180313c;

    public static final class a implements Iterator, kotlin.jvm.internal.markers.a {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator f180314a;

        /* renamed from: b, reason: collision with root package name */
        public Iterator f180315b;

        /* renamed from: c, reason: collision with root package name */
        public int f180316c;
        public final /* synthetic */ g d;

        public a(g r1) {
            this.d = r1;
            this.f180314a = g.d(r1).iterator();
        }

        public final boolean a() {
            Iterator r02 = this.f180315b;
            if (r02 == null) goto L9;
            if (r02.hasNext() == false) goto L9;
            this.f180316c = 1;
            return true;
        L9:
            if (this.f180314a.hasNext() == false) goto L14;
            Object r03 = this.f180314a.next();
            Iterator r04 = (Iterator) g.c(this.d).invoke(g.e(this.d).invoke(r03));
            if (r04.hasNext() == false) goto L9;
            this.f180315b = r04;
            this.f180316c = 1;
            return true;
        L14:
            this.f180316c = 2;
            this.f180315b = null;
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int r02 = this.f180316c;
            if (r02 != 1) goto L6;
            return true;
        L6:
            if (r02 != 2) goto L10;
            return false;
        L10:
            return a();
        }

        @Override // java.util.Iterator
        public Object next() {
            int r02 = this.f180316c;
            if (r02 == 2) goto L13;
            if (r02 == 0) goto L6;
        L10:
            this.f180316c = 0;
            Iterator r03 = this.f180315b;
            kotlin.jvm.internal.p.i(r03);
            return r03.next();
        L6:
            if (a() == true) goto L10;
            throw new NoSuchElementException();
        L13:
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(i r2, kotlin.jvm.functions.l r3, kotlin.jvm.functions.l r4) {
        kotlin.jvm.internal.p.l(r2, "sequence");
        kotlin.jvm.internal.p.l(r3, "transformer");
        kotlin.jvm.internal.p.l(r4, "iterator");
        this.f180311a = r2;
        this.f180312b = r3;
        this.f180313c = r4;
    }

    public static final /* synthetic */ kotlin.jvm.functions.l c(g r02) {
        return r02.f180313c;
    }

    public static final /* synthetic */ i d(g r02) {
        return r02.f180311a;
    }

    public static final /* synthetic */ kotlin.jvm.functions.l e(g r02) {
        return r02.f180312b;
    }

    @Override // kotlin.sequences.i
    public Iterator iterator() {
        return new a(this);
    }
}
