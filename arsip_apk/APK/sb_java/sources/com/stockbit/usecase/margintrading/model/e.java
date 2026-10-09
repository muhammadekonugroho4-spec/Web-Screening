package com.stockbit.usecase.margintrading.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final double f158427a;

    /* renamed from: b, reason: collision with root package name */
    public final float f158428b;

    /* renamed from: c, reason: collision with root package name */
    public final float f158429c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final int f158430e;

    /* renamed from: f, reason: collision with root package name */
    public final String f158431f;

    /* renamed from: g, reason: collision with root package name */
    public final String f158432g;

    /* renamed from: h, reason: collision with root package name */
    public final String f158433h;

    /* renamed from: i, reason: collision with root package name */
    public final String f158434i;

    /* renamed from: j, reason: collision with root package name */
    public final double f158435j;

    /* renamed from: k, reason: collision with root package name */
    public final MarginRatioRiskType f158436k;

    public e(double r2, float r4, float r5, float r6, int r7, String r8, String r9, String r10, String r11, double r12, MarginRatioRiskType r14) {
        p.l(r8, "marginUsed");
        p.l(r9, "totalCollateral");
        p.l(r10, "portfolioValue");
        p.l(r11, "bufferValue");
        p.l(r14, "riskLevel");
        this.f158427a = r2;
        this.f158428b = r4;
        this.f158429c = r5;
        this.d = r6;
        this.f158430e = r7;
        this.f158431f = r8;
        this.f158432g = r9;
        this.f158433h = r10;
        this.f158434i = r11;
        this.f158435j = r12;
        this.f158436k = r14;
    }

    public final float a() {
        return this.f158428b;
    }

    public final double b() {
        return this.f158435j;
    }

    public final String c() {
        return this.f158434i;
    }

    public final float d() {
        return this.d;
    }

    public final int e() {
        return this.f158430e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof e) == true) goto L8;
        return false;
    L8:
        e r82 = (e) r8;
        if (Double.compare(this.f158427a, r82.f158427a) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.f158428b, r82.f158428b) == 0) goto L15;
        return false;
    L15:
        if (Float.compare(this.f158429c, r82.f158429c) == 0) goto L18;
        return false;
    L18:
        if (Float.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (this.f158430e == r82.f158430e) goto L24;
        return false;
    L24:
        if (p.g(this.f158431f, r82.f158431f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f158432g, r82.f158432g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f158433h, r82.f158433h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f158434i, r82.f158434i) == true) goto L36;
        return false;
    L36:
        if (Double.compare(this.f158435j, r82.f158435j) == 0) goto L39;
        return false;
    L39:
        if (this.f158436k == r82.f158436k) goto L41;
        return false;
    L41:
        return true;
    }

    public final float f() {
        return this.f158429c;
    }

    public final double g() {
        return this.f158427a;
    }

    public final String h() {
        return this.f158431f;
    }

    public int hashCode() {
        return (((((((((((((((((((Double.hashCode(this.f158427a) * 31) + Float.hashCode(this.f158428b)) * 31) + Float.hashCode(this.f158429c)) * 31) + Float.hashCode(this.d)) * 31) + Integer.hashCode(this.f158430e)) * 31) + this.f158431f.hashCode()) * 31) + this.f158432g.hashCode()) * 31) + this.f158433h.hashCode()) * 31) + this.f158434i.hashCode()) * 31) + Double.hashCode(this.f158435j)) * 31) + this.f158436k.hashCode();
    }

    public final String i() {
        return this.f158433h;
    }

    public final MarginRatioRiskType j() {
        return this.f158436k;
    }

    public final String k() {
        return this.f158432g;
    }

    public String toString() {
        return "MarginRatioUIState(marginRatio=" + this.f158427a + ", atRiskRatioThreshold=" + this.f158428b + ", marginCallRatioThreshold=" + this.f158429c + ", forceSellRatioThreshold=" + this.d + ", marginCallCounter=" + this.f158430e + ", marginUsed=" + this.f158431f + ", totalCollateral=" + this.f158432g + ", portfolioValue=" + this.f158433h + ", bufferValue=" + this.f158434i + ", bufferRatio=" + this.f158435j + ", riskLevel=" + this.f158436k + ")";
    }
}
