package com.stockbit.domain.model.cashsweep;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f81114a;

    /* renamed from: b, reason: collision with root package name */
    public final double f81115b;

    /* renamed from: c, reason: collision with root package name */
    public final double f81116c;
    public final n d;

    /* renamed from: e, reason: collision with root package name */
    public final double f81117e;

    /* renamed from: f, reason: collision with root package name */
    public final f f81118f;

    /* renamed from: g, reason: collision with root package name */
    public final double f81119g;

    /* renamed from: h, reason: collision with root package name */
    public final String f81120h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f81121i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f81122j;

    /* renamed from: k, reason: collision with root package name */
    public final b f81123k;

    /* renamed from: l, reason: collision with root package name */
    public final double f81124l;

    /* renamed from: m, reason: collision with root package name */
    public final double f81125m;

    /* renamed from: n, reason: collision with root package name */
    public final double f81126n;

    /* renamed from: o, reason: collision with root package name */
    public final double f81127o;

    /* renamed from: p, reason: collision with root package name */
    public final double f81128p;

    /* renamed from: q, reason: collision with root package name */
    public final double f81129q;

    public e(boolean r3, double r4, double r6, n r8, double r9, f r11, double r12, String r14, boolean r15, boolean r16, b r17, double r18, double r20, double r22, double r24, double r26, double r28) {
        p.l(r8, "tradingBalanceChange");
        p.l(r11, "cashSweepMoney");
        p.l(r14, "estimateDisbursementDate");
        p.l(r17, "banner");
        this.f81114a = r3;
        this.f81115b = r4;
        this.f81116c = r6;
        this.d = r8;
        this.f81117e = r9;
        this.f81118f = r11;
        this.f81119g = r12;
        this.f81120h = r14;
        this.f81121i = r15;
        this.f81122j = r16;
        this.f81123k = r17;
        this.f81124l = r18;
        this.f81125m = r20;
        this.f81126n = r22;
        this.f81127o = r24;
        this.f81128p = r26;
        this.f81129q = r28;
    }

    public final b a() {
        return this.f81123k;
    }

    public final double b() {
        return this.f81117e;
    }

    public final f c() {
        return this.f81118f;
    }

    public final String d() {
        return this.f81120h;
    }

    public final double e() {
        return this.f81127o;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof e) == true) goto L8;
        return false;
    L8:
        e r82 = (e) r8;
        if (this.f81114a == r82.f81114a) goto L12;
        return false;
    L12:
        if (Double.compare(this.f81115b, r82.f81115b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f81116c, r82.f81116c) == 0) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (Double.compare(this.f81117e, r82.f81117e) == 0) goto L24;
        return false;
    L24:
        if (p.g(this.f81118f, r82.f81118f) == true) goto L27;
        return false;
    L27:
        if (Double.compare(this.f81119g, r82.f81119g) == 0) goto L30;
        return false;
    L30:
        if (p.g(this.f81120h, r82.f81120h) == true) goto L33;
        return false;
    L33:
        if (this.f81121i == r82.f81121i) goto L36;
        return false;
    L36:
        if (this.f81122j == r82.f81122j) goto L39;
        return false;
    L39:
        if (p.g(this.f81123k, r82.f81123k) == true) goto L42;
        return false;
    L42:
        if (Double.compare(this.f81124l, r82.f81124l) == 0) goto L45;
        return false;
    L45:
        if (Double.compare(this.f81125m, r82.f81125m) == 0) goto L48;
        return false;
    L48:
        if (Double.compare(this.f81126n, r82.f81126n) == 0) goto L51;
        return false;
    L51:
        if (Double.compare(this.f81127o, r82.f81127o) == 0) goto L54;
        return false;
    L54:
        if (Double.compare(this.f81128p, r82.f81128p) == 0) goto L57;
        return false;
    L57:
        if (Double.compare(this.f81129q, r82.f81129q) == 0) goto L59;
        return false;
    L59:
        return true;
    }

    public final double f() {
        return this.f81125m;
    }

    public final double g() {
        return this.f81119g;
    }

    public final double h() {
        return this.f81124l;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((Boolean.hashCode(this.f81114a) * 31) + Double.hashCode(this.f81115b)) * 31) + Double.hashCode(this.f81116c)) * 31) + this.d.hashCode()) * 31) + Double.hashCode(this.f81117e)) * 31) + this.f81118f.hashCode()) * 31) + Double.hashCode(this.f81119g)) * 31) + this.f81120h.hashCode()) * 31) + Boolean.hashCode(this.f81121i)) * 31) + Boolean.hashCode(this.f81122j)) * 31) + this.f81123k.hashCode()) * 31) + Double.hashCode(this.f81124l)) * 31) + Double.hashCode(this.f81125m)) * 31) + Double.hashCode(this.f81126n)) * 31) + Double.hashCode(this.f81127o)) * 31) + Double.hashCode(this.f81128p)) * 31) + Double.hashCode(this.f81129q);
    }

    public final double i() {
        return this.f81129q;
    }

    public final double j() {
        return this.f81115b;
    }

    public final double k() {
        return this.f81116c;
    }

    public final n l() {
        return this.d;
    }

    public final boolean m() {
        return this.f81114a;
    }

    public final boolean n() {
        return this.f81122j;
    }

    public final boolean o() {
        return this.f81121i;
    }

    public String toString() {
        return "CashSweepEntity(isEnabled=" + this.f81114a + ", reservedAmount=" + this.f81115b + ", tradingBalance=" + this.f81116c + ", tradingBalanceChange=" + this.d + ", cashOnHand=" + this.f81117e + ", cashSweepMoney=" + this.f81118f + ", pendingBalance=" + this.f81119g + ", estimateDisbursementDate=" + this.f81120h + ", isSharia=" + this.f81121i + ", isRedeemable=" + this.f81122j + ", banner=" + this.f81123k + ", pendingRedemptionAmount=" + this.f81124l + ", leverageAmount=" + this.f81125m + ", marketValueAmount=" + this.f81126n + ", haircutAmount=" + this.f81127o + ", pendingInvestedAmount=" + this.f81128p + ", pendingSellWithdrawalAmount=" + this.f81129q + ")";
    }
}
