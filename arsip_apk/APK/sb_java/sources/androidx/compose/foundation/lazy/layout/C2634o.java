package androidx.compose.foundation.lazy.layout;

/* renamed from: androidx.compose.foundation.lazy.layout.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2634o {

    /* renamed from: b, reason: collision with root package name */
    public static final int f8794b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final androidx.compose.runtime.collection.c f8795a;

    /* renamed from: androidx.compose.foundation.lazy.layout.o$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f8796a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8797b;

        static {
        }

        public a(int r4, int r5) {
            this.f8796a = r4;
            this.f8797b = r5;
            boolean r02 = false;
            if (r4 < 0) goto L5;
            boolean r2 = true;
        L6:
            if (r2 == true) goto L8;
            androidx.compose.foundation.internal.e.a("negative start index");
        L8:
            if (r5 < r4) goto L10;
            r02 = true;
        L10:
            if (r02 == true) goto L13;
            androidx.compose.foundation.internal.e.a("end index greater than start");
            return;
        L13:
            return;
        L5:
            r2 = false;
            goto L6
        }

        public final int a() {
            return this.f8797b;
        }

        public final int b() {
            return this.f8796a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (this.f8796a == r52.f8796a) goto L12;
            return false;
        L12:
            if (this.f8797b == r52.f8797b) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f8796a) * 31) + Integer.hashCode(this.f8797b);
        }

        public String toString() {
            return "Interval(start=" + this.f8796a + ", end=" + this.f8797b + ')';
        }
    }

    static {
        f8794b = androidx.compose.runtime.collection.c.d;
    }

    public C2634o() {
        this.f8795a = new androidx.compose.runtime.collection.c(new a[16], 0);
    }

    public final a a(int r2, int r3) {
        a r02 = new a(r2, r3);
        this.f8795a.b(r02);
        return r02;
    }

    public final int b() {
        int r02 = ((a) this.f8795a.k()).a();
        androidx.compose.runtime.collection.c r1 = this.f8795a;
        Object[] r2 = r1.f16154a;
        int r12 = r1.l();
        int r3 = 0;
    L3:
        if (r3 >= r12) goto L8;
        a r4 = (a) r2[r3];
        if (r4.a() <= r02) goto L7;
        r02 = r4.a();
    L7:
        r3 = r3 + 1;
        goto L3
    L8:
        return r02;
    }

    public final int c() {
        int r02 = ((a) this.f8795a.k()).b();
        androidx.compose.runtime.collection.c r1 = this.f8795a;
        Object[] r2 = r1.f16154a;
        int r12 = r1.l();
        boolean r3 = false;
        int r4 = 0;
    L3:
        if (r4 >= r12) goto L8;
        a r5 = (a) r2[r4];
        if (r5.b() >= r02) goto L7;
        r02 = r5.b();
    L7:
        r4 = r4 + 1;
        goto L3
    L8:
        if (r02 < 0) goto L10;
        r3 = true;
    L10:
        if (r3 == true) goto L12;
        androidx.compose.foundation.internal.e.a("negative minIndex");
    L12:
        return r02;
    }

    public final boolean d() {
        if (this.f8795a.l() == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final void e(a r2) {
        this.f8795a.p(r2);
    }
}
