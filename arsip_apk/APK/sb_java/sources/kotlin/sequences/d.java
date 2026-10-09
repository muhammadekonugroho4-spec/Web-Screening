package kotlin.sequences;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final i f180299a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.functions.l f180300b;

    public static final class a implements Iterator, kotlin.jvm.internal.markers.a {

        /* renamed from: a, reason: collision with root package name */
        public final Iterator f180301a;

        /* renamed from: b, reason: collision with root package name */
        public int f180302b;

        /* renamed from: c, reason: collision with root package name */
        public Object f180303c;
        public final /* synthetic */ d d;

        public a(d r1) {
            this.d = r1;
            this.f180301a = d.d(r1).iterator();
            this.f180302b = -1;
        }

        private final void a() {
        L3:
            if (this.f180301a.hasNext() == false) goto L8;
            Object r02 = this.f180301a.next();
            if (((Boolean) d.c(this.d).invoke(r02)).booleanValue() == true) goto L3;
            this.f180303c = r02;
            this.f180302b = 1;
            return;
        L8:
            this.f180302b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f180302b != (-1)) goto L6;
            a();
        L6:
            if (this.f180302b != 1) goto L8;
        L12:
            return true;
        L8:
            if (this.f180301a.hasNext() == true) goto L12;
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f180302b != (-1)) goto L6;
            a();
        L6:
            if (this.f180302b != 1) goto L10;
            Object r02 = this.f180303c;
            this.f180303c = null;
            this.f180302b = 0;
            return r02;
        L10:
            return this.f180301a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d(i r2, kotlin.jvm.functions.l r3) {
        kotlin.jvm.internal.p.l(r2, "sequence");
        kotlin.jvm.internal.p.l(r3, "predicate");
        this.f180299a = r2;
        this.f180300b = r3;
    }

    public static final /* synthetic */ kotlin.jvm.functions.l c(d r02) {
        return r02.f180300b;
    }

    public static final /* synthetic */ i d(d r02) {
        return r02.f180299a;
    }

    @Override // kotlin.sequences.i
    public Iterator iterator() {
        return new a(this);
    }
}
