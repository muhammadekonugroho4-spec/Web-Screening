package com.stockbit.usecase.tradingperformance.model;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final double f163451a;

    /* renamed from: b, reason: collision with root package name */
    public final int f163452b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f163453c;
    public final C1677a d;

    /* renamed from: com.stockbit.usecase.tradingperformance.model.a$a, reason: collision with other inner class name */
    public static final class C1677a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f163454a;

        /* renamed from: b, reason: collision with root package name */
        public final float f163455b;

        public C1677a(boolean r1, float r2) {
            this.f163454a = r1;
            this.f163455b = r2;
        }

        public final boolean a() {
            return this.f163454a;
        }

        public final float b() {
            return this.f163455b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C1677a) == true) goto L8;
            return false;
        L8:
            C1677a r52 = (C1677a) r5;
            if (this.f163454a == r52.f163454a) goto L12;
            return false;
        L12:
            if (Float.compare(this.f163455b, r52.f163455b) == 0) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f163454a) * 31) + Float.hashCode(this.f163455b);
        }

        public String toString() {
            return "AnimationUIState(animate=" + this.f163454a + ", value=" + this.f163455b + ")";
        }

        public /* synthetic */ C1677a(boolean r1, float r2, int r3, kotlin.jvm.internal.i r4) {
            if ((r3 & 1) == 0) goto L6;
            r1 = false;
        L6:
            if ((r3 & 2) == 0) goto L8;
            r2 = 0.0f;
        L8:
            this(r1, r2);
        }
    }

    public a(double r2, int r4, boolean r5, C1677a r6) {
        kotlin.jvm.internal.p.l(r6, "animation");
        this.f163451a = r2;
        this.f163452b = r4;
        this.f163453c = r5;
        this.d = r6;
    }

    public final C1677a a() {
        return this.d;
    }

    public final int b() {
        return this.f163452b;
    }

    public final double c() {
        return this.f163451a;
    }

    public final boolean d() {
        return this.f163453c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (Double.compare(this.f163451a, r82.f163451a) == 0) goto L12;
        return false;
    L12:
        if (this.f163452b == r82.f163452b) goto L15;
        return false;
    L15:
        if (this.f163453c == r82.f163453c) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r82.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Double.hashCode(this.f163451a) * 31) + Integer.hashCode(this.f163452b)) * 31) + Boolean.hashCode(this.f163453c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "AllocationChartItemUIState(value=" + this.f163451a + ", rank=" + this.f163452b + ", isOther=" + this.f163453c + ", animation=" + this.d + ")";
    }

    public /* synthetic */ a(double r7, int r9, boolean r10, C1677a r11, int r12, kotlin.jvm.internal.i r13) {
        if ((r12 & 1) == 0) goto L5;
        r7 = 0.0d;
    L5:
        double r1 = r7;
        boolean r8 = false;
        if ((r12 & 2) == 0) goto L8;
        int r3 = 0;
    L10:
        if ((r12 & 4) == 0) goto L12;
        boolean r4 = false;
    L14:
        if ((r12 & 8) == 0) goto L16;
        r11 = new C1677a(r8, 0.0f, 3, null);
    L16:
        this(r1, r3, r4, r11);
        return;
    L12:
        r4 = r10;
        goto L14
    L8:
        r3 = r9;
        goto L10
    }
}
