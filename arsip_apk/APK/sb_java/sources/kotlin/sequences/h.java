package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.functions.a f180317a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.functions.l f180318b;

    public static final class a implements Iterator, kotlin.jvm.internal.markers.a {

        /* renamed from: a, reason: collision with root package name */
        public Object f180319a;

        /* renamed from: b, reason: collision with root package name */
        public int f180320b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f180321c;

        public a(h r1) {
            this.f180321c = r1;
            this.f180320b = -2;
        }

        private final void a() {
            if (this.f180320b != (-2)) goto L5;
            Object r02 = h.c(this.f180321c).invoke();
        L6:
            this.f180319a = r02;
            if (r02 != null) goto L9;
            int r03 = 0;
        L10:
            this.f180320b = r03;
            return;
        L9:
            r03 = 1;
            goto L10
        L5:
            kotlin.jvm.functions.l r04 = h.d(this.f180321c);
            Object r1 = this.f180319a;
            kotlin.jvm.internal.p.i(r1);
            r02 = r04.invoke(r1);
            goto L6
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f180320b >= 0) goto L6;
            a();
        L6:
            if (this.f180320b != 1) goto L8;
            return true;
        L8:
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f180320b >= 0) goto L6;
            a();
        L6:
            if (this.f180320b == 0) goto L10;
            Object r02 = this.f180319a;
            kotlin.jvm.internal.p.j(r02, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f180320b = -1;
            return r02;
        L10:
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h(kotlin.jvm.functions.a r2, kotlin.jvm.functions.l r3) {
        kotlin.jvm.internal.p.l(r2, "getInitialValue");
        kotlin.jvm.internal.p.l(r3, "getNextValue");
        this.f180317a = r2;
        this.f180318b = r3;
    }

    public static final /* synthetic */ kotlin.jvm.functions.a c(h r02) {
        return r02.f180317a;
    }

    public static final /* synthetic */ kotlin.jvm.functions.l d(h r02) {
        return r02.f180318b;
    }

    @Override // kotlin.sequences.i
    public Iterator iterator() {
        return new a(this);
    }
}
