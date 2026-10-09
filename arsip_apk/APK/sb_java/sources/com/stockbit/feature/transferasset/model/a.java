package com.stockbit.feature.transferasset.model;

import kotlin.jvm.internal.i;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final double f116874a;

    /* renamed from: b, reason: collision with root package name */
    public final double f116875b;

    /* renamed from: c, reason: collision with root package name */
    public final double f116876c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final double f116877e;

    static {
    }

    public a(double r1, double r3, double r5, double r7, double r9) {
        this.f116874a = r1;
        this.f116875b = r3;
        this.f116876c = r5;
        this.d = r7;
        this.f116877e = r9;
    }

    public static /* synthetic */ a b(a r11, double r12, double r14, double r16, double r18, double r20, int r22, Object r23) {
        if ((r22 & 1) == 0) goto L5;
        r12 = r11.f116874a;
    L5:
        double r1 = r12;
        if ((r22 & 2) == 0) goto L8;
        r14 = r11.f116875b;
    L8:
        double r3 = r14;
        if ((r22 & 4) == 0) goto L11;
        double r5 = r11.f116876c;
    L13:
        if ((r22 & 8) == 0) goto L15;
        double r7 = r11.d;
    L17:
        if ((r22 & 16) == 0) goto L20;
        double r9 = r11.f116877e;
    L22:
        return r11.a(r1, r3, r5, r7, r9);
    L20:
        r9 = r20;
        goto L22
    L15:
        r7 = r18;
        goto L17
    L11:
        r5 = r16;
        goto L13
    }

    public final a a(double r12, double r14, double r16, double r18, double r20) {
        return new a(r12, r14, r16, r18, r20);
    }

    public final double c() {
        return this.f116875b;
    }

    public final double d() {
        return this.f116876c;
    }

    public final double e() {
        return this.f116877e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (Double.compare(this.f116874a, r82.f116874a) == 0) goto L12;
        return false;
    L12:
        if (Double.compare(this.f116875b, r82.f116875b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f116876c, r82.f116876c) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (Double.compare(this.f116877e, r82.f116877e) == 0) goto L23;
        return false;
    L23:
        return true;
    }

    public final double f() {
        return this.d;
    }

    public final double g() {
        return this.f116874a;
    }

    public int hashCode() {
        return (((((((Double.hashCode(this.f116874a) * 31) + Double.hashCode(this.f116875b)) * 31) + Double.hashCode(this.f116876c)) * 31) + Double.hashCode(this.d)) * 31) + Double.hashCode(this.f116877e);
    }

    public String toString() {
        return "MarginUIModel(totalDebt=" + this.f116874a + ", debtMarketValue=" + this.f116875b + ", debtRatio=" + this.f116876c + ", newDebtRatio=" + this.d + ", marginCallRatioThreshold=" + this.f116877e + ')';
    }

    public /* synthetic */ a(double r3, double r5, double r7, double r9, double r11, int r13, i r14) {
        if ((r13 & 1) == 0) goto L6;
        r3 = 0.0d;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r5 = 0.0d;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r7 = 0.0d;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r9 = 0.0d;
    L15:
        if ((r13 & 16) == 0) goto L18;
        double r12 = 0.0d;
    L19:
        this(r3, r5, r7, r9, r12);
        return;
    L18:
        r12 = r11;
        goto L19
    }
}
