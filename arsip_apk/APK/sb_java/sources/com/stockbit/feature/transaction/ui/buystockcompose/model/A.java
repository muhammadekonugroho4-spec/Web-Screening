package com.stockbit.feature.transaction.ui.buystockcompose.model;

/* loaded from: classes9.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f111427a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f111428b;

    /* renamed from: c, reason: collision with root package name */
    public final double f111429c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f111430e;

    /* renamed from: f, reason: collision with root package name */
    public final String f111431f;

    /* renamed from: g, reason: collision with root package name */
    public final String f111432g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f111433h;

    static {
    }

    public A(boolean r2, boolean r3, double r4, String r6, String r7, String r8, String r9, boolean r10) {
        kotlin.jvm.internal.p.l(r6, "buyingPowerValue");
        kotlin.jvm.internal.p.l(r7, "holdingPeriod");
        kotlin.jvm.internal.p.l(r8, "interestRate");
        kotlin.jvm.internal.p.l(r9, "buyingPower");
        this.f111427a = r2;
        this.f111428b = r3;
        this.f111429c = r4;
        this.d = r6;
        this.f111430e = r7;
        this.f111431f = r8;
        this.f111432g = r9;
        this.f111433h = r10;
    }

    public final double a() {
        return this.f111429c;
    }

    public final String b() {
        return this.f111432g;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f111430e;
    }

    public final String e() {
        return this.f111431f;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof A) == true) goto L8;
        return false;
    L8:
        A r82 = (A) r8;
        if (this.f111427a == r82.f111427a) goto L12;
        return false;
    L12:
        if (this.f111428b == r82.f111428b) goto L15;
        return false;
    L15:
        if (Double.compare(this.f111429c, r82.f111429c) == 0) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f111430e, r82.f111430e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f111431f, r82.f111431f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f111432g, r82.f111432g) == true) goto L30;
        return false;
    L30:
        if (this.f111433h == r82.f111433h) goto L32;
        return false;
    L32:
        return true;
    }

    public final boolean f() {
        return this.f111433h;
    }

    public final boolean g() {
        return this.f111427a;
    }

    public final boolean h() {
        return this.f111428b;
    }

    public int hashCode() {
        return (((((((((((((Boolean.hashCode(this.f111427a) * 31) + Boolean.hashCode(this.f111428b)) * 31) + Double.hashCode(this.f111429c)) * 31) + this.d.hashCode()) * 31) + this.f111430e.hashCode()) * 31) + this.f111431f.hashCode()) * 31) + this.f111432g.hashCode()) * 31) + Boolean.hashCode(this.f111433h);
    }

    public String toString() {
        return "MarginTradingUIState(isMarginActivate=" + this.f111427a + ", isMarginEnabled=" + this.f111428b + ", balanceRaw=" + this.f111429c + ", buyingPowerValue=" + this.d + ", holdingPeriod=" + this.f111430e + ", interestRate=" + this.f111431f + ", buyingPower=" + this.f111432g + ", isInVerification=" + this.f111433h + ')';
    }

    public /* synthetic */ A(boolean r3, boolean r4, double r5, String r7, String r8, String r9, String r10, boolean r11, int r12, kotlin.jvm.internal.i r13) {
        if ((r12 & 1) == 0) goto L6;
        r3 = false;
    L6:
        if ((r12 & 2) == 0) goto L9;
        r4 = false;
    L9:
        if ((r12 & 4) == 0) goto L12;
        r5 = 0.0d;
    L12:
        if ((r12 & 8) == 0) goto L15;
        r7 = "";
    L15:
        if ((r12 & 16) == 0) goto L18;
        r8 = "";
    L18:
        if ((r12 & 32) == 0) goto L21;
        r9 = "";
    L21:
        if ((r12 & 64) == 0) goto L24;
        r10 = "";
    L24:
        if ((r12 & 128) == 0) goto L27;
        boolean r122 = false;
    L26:
        String r112 = r10;
        String r102 = r9;
        double r6 = r5;
        this(r3, r4, r6, r7, r8, r102, r112, r122);
        return;
    L27:
        r122 = r11;
        goto L26
    }
}
