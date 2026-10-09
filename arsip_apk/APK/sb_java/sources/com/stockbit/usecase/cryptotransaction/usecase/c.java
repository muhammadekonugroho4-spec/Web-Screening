package com.stockbit.usecase.cryptotransaction.usecase;

import java.math.BigDecimal;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final BigDecimal f157476a;

    /* renamed from: b, reason: collision with root package name */
    public final BigDecimal f157477b;

    /* renamed from: c, reason: collision with root package name */
    public final BigDecimal f157478c;
    public final BigDecimal d;

    /* renamed from: e, reason: collision with root package name */
    public final BigDecimal f157479e;

    /* renamed from: f, reason: collision with root package name */
    public final BigDecimal f157480f;

    /* renamed from: g, reason: collision with root package name */
    public final BigDecimal f157481g;

    /* renamed from: h, reason: collision with root package name */
    public final String f157482h;

    /* renamed from: i, reason: collision with root package name */
    public final String f157483i;

    /* renamed from: j, reason: collision with root package name */
    public final String f157484j;

    /* renamed from: k, reason: collision with root package name */
    public final String f157485k;

    /* renamed from: l, reason: collision with root package name */
    public final String f157486l;

    /* renamed from: m, reason: collision with root package name */
    public final String f157487m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f157488n;

    public c(BigDecimal r2, BigDecimal r3, BigDecimal r4, BigDecimal r5, BigDecimal r6, BigDecimal r7, BigDecimal r8, String r9, String r10, String r11, String r12, String r13, String r14, boolean r15) {
        p.l(r2, "grossIdr");
        p.l(r3, "exchangeFee");
        p.l(r4, "cfxFee");
        p.l(r5, "taxFee");
        p.l(r6, "netIdr");
        p.l(r7, "pnl");
        p.l(r8, "pnlPct");
        p.l(r9, "grossFormatted");
        p.l(r10, "exchangeFeeFormatted");
        p.l(r11, "cfxFeeFormatted");
        p.l(r12, "taxFeeFormatted");
        p.l(r13, "netIdrFormatted");
        p.l(r14, "pnlFormatted");
        this.f157476a = r2;
        this.f157477b = r3;
        this.f157478c = r4;
        this.d = r5;
        this.f157479e = r6;
        this.f157480f = r7;
        this.f157481g = r8;
        this.f157482h = r9;
        this.f157483i = r10;
        this.f157484j = r11;
        this.f157485k = r12;
        this.f157486l = r13;
        this.f157487m = r14;
        this.f157488n = r15;
    }

    public final BigDecimal a() {
        return this.f157478c;
    }

    public final BigDecimal b() {
        return this.f157477b;
    }

    public final BigDecimal c() {
        return this.f157476a;
    }

    public final BigDecimal d() {
        return this.f157479e;
    }

    public final String e() {
        return this.f157486l;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f157476a, r52.f157476a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157477b, r52.f157477b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f157478c, r52.f157478c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f157479e, r52.f157479e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f157480f, r52.f157480f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f157481g, r52.f157481g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f157482h, r52.f157482h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f157483i, r52.f157483i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f157484j, r52.f157484j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f157485k, r52.f157485k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f157486l, r52.f157486l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f157487m, r52.f157487m) == true) goto L48;
        return false;
    L48:
        if (this.f157488n == r52.f157488n) goto L50;
        return false;
    L50:
        return true;
    }

    public final String f() {
        return this.f157487m;
    }

    public final BigDecimal g() {
        return this.d;
    }

    public final boolean h() {
        return this.f157488n;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.f157476a.hashCode() * 31) + this.f157477b.hashCode()) * 31) + this.f157478c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f157479e.hashCode()) * 31) + this.f157480f.hashCode()) * 31) + this.f157481g.hashCode()) * 31) + this.f157482h.hashCode()) * 31) + this.f157483i.hashCode()) * 31) + this.f157484j.hashCode()) * 31) + this.f157485k.hashCode()) * 31) + this.f157486l.hashCode()) * 31) + this.f157487m.hashCode()) * 31) + Boolean.hashCode(this.f157488n);
    }

    public String toString() {
        return "CryptoChargeBreakdown(grossIdr=" + this.f157476a + ", exchangeFee=" + this.f157477b + ", cfxFee=" + this.f157478c + ", taxFee=" + this.d + ", netIdr=" + this.f157479e + ", pnl=" + this.f157480f + ", pnlPct=" + this.f157481g + ", grossFormatted=" + this.f157482h + ", exchangeFeeFormatted=" + this.f157483i + ", cfxFeeFormatted=" + this.f157484j + ", taxFeeFormatted=" + this.f157485k + ", netIdrFormatted=" + this.f157486l + ", pnlFormatted=" + this.f157487m + ", isFormulaAvailable=" + this.f157488n + ")";
    }
}
