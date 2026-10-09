package com.stockbit.usecase.securities.model.history;

import java.math.BigDecimal;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f160656a;

    /* renamed from: b, reason: collision with root package name */
    public final String f160657b;

    /* renamed from: c, reason: collision with root package name */
    public final String f160658c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final BigDecimal f160659e;

    /* renamed from: f, reason: collision with root package name */
    public final String f160660f;

    /* renamed from: g, reason: collision with root package name */
    public final String f160661g;

    /* renamed from: h, reason: collision with root package name */
    public final String f160662h;

    public c(String r2, String r3, String r4, String r5, BigDecimal r6, String r7, String r8, String r9) {
        kotlin.jvm.internal.p.l(r2, "paymentDate");
        kotlin.jvm.internal.p.l(r3, "ratioOldShare");
        kotlin.jvm.internal.p.l(r4, "ratioNewShare");
        kotlin.jvm.internal.p.l(r5, "closingPriceDate");
        kotlin.jvm.internal.p.l(r6, "closingPrice");
        kotlin.jvm.internal.p.l(r7, "oldShare");
        kotlin.jvm.internal.p.l(r8, "dividendShare");
        kotlin.jvm.internal.p.l(r9, "bonusShare");
        this.f160656a = r2;
        this.f160657b = r3;
        this.f160658c = r4;
        this.d = r5;
        this.f160659e = r6;
        this.f160660f = r7;
        this.f160661g = r8;
        this.f160662h = r9;
    }

    public final String a() {
        return this.f160662h;
    }

    public final BigDecimal b() {
        return this.f160659e;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f160661g;
    }

    public final String e() {
        return this.f160660f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (kotlin.jvm.internal.p.g(this.f160656a, r52.f160656a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f160657b, r52.f160657b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f160658c, r52.f160658c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f160659e, r52.f160659e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f160660f, r52.f160660f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f160661g, r52.f160661g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f160662h, r52.f160662h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f160656a;
    }

    public final String g() {
        return this.f160658c;
    }

    public final String h() {
        return this.f160657b;
    }

    public int hashCode() {
        return (((((((((((((this.f160656a.hashCode() * 31) + this.f160657b.hashCode()) * 31) + this.f160658c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f160659e.hashCode()) * 31) + this.f160660f.hashCode()) * 31) + this.f160661g.hashCode()) * 31) + this.f160662h.hashCode();
    }

    public String toString() {
        return "HistoryAdditionalInfoStockUIState(paymentDate=" + this.f160656a + ", ratioOldShare=" + this.f160657b + ", ratioNewShare=" + this.f160658c + ", closingPriceDate=" + this.d + ", closingPrice=" + this.f160659e + ", oldShare=" + this.f160660f + ", dividendShare=" + this.f160661g + ", bonusShare=" + this.f160662h + ")";
    }
}
