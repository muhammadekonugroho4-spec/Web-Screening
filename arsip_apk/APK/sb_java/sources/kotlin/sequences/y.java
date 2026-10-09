package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class y implements i {

    /* renamed from: a, reason: collision with root package name */
    public final i f180343a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.functions.l f180344b;

    public static final class a implements Iterator, kotlin.jvm.internal.markers.a {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator f180345a;

        /* renamed from: b, reason: collision with root package name */
        public int f180346b;

        /* renamed from: c, reason: collision with root package name */
        public Object f180347c;
        public final /* synthetic */ y d;

        public a(y r1) {
            this.d = r1;
            this.f180345a = y.d(r1).iterator();
            this.f180346b = -1;
        }

        private final void a() {
            if (this.f180345a.hasNext() == false) goto L8;
            Object r02 = this.f180345a.next();
            if (((Boolean) y.c(this.d).invoke(r02)).booleanValue() == false) goto L8;
            this.f180346b = 1;
            this.f180347c = r02;
            return;
        L8:
            this.f180346b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f180346b != (-1)) goto L6;
            a();
        L6:
            if (this.f180346b != 1) goto L8;
            return true;
        L8:
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f180346b != (-1)) goto L6;
            a();
        L6:
            if (this.f180346b == 0) goto L10;
            Object r02 = this.f180347c;
            this.f180347c = null;
            this.f180346b = -1;
            return r02;
        L10:
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public y(i r2, kotlin.jvm.functions.l r3) {
        kotlin.jvm.internal.p.l(r2, "sequence");
        kotlin.jvm.internal.p.l(r3, "predicate");
        this.f180343a = r2;
        this.f180344b = r3;
    }

    public static final /* synthetic */ kotlin.jvm.functions.l c(y r02) {
        return r02.f180344b;
    }

    public static final /* synthetic */ i d(y r02) {
        return r02.f180343a;
    }

    @Override // kotlin.sequences.i
    public Iterator iterator() {
        return new a(this);
    }
}
