package com.stockbit.domain.model.securities;

import java.math.BigDecimal;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f85058a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85059b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85060c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final BigDecimal f85061e;

    /* renamed from: f, reason: collision with root package name */
    public final String f85062f;

    /* renamed from: g, reason: collision with root package name */
    public final String f85063g;

    /* renamed from: h, reason: collision with root package name */
    public final String f85064h;

    public c(String r2, String r3, String r4, String r5, BigDecimal r6, String r7, String r8, String r9) {
        kotlin.jvm.internal.p.l(r2, "paymentDate");
        kotlin.jvm.internal.p.l(r3, "ratioOldShare");
        kotlin.jvm.internal.p.l(r4, "ratioNewShare");
        kotlin.jvm.internal.p.l(r5, "closingPriceDate");
        kotlin.jvm.internal.p.l(r6, "closingPrice");
        kotlin.jvm.internal.p.l(r7, "oldShare");
        kotlin.jvm.internal.p.l(r8, "dividendShare");
        kotlin.jvm.internal.p.l(r9, "bonusShare");
        this.f85058a = r2;
        this.f85059b = r3;
        this.f85060c = r4;
        this.d = r5;
        this.f85061e = r6;
        this.f85062f = r7;
        this.f85063g = r8;
        this.f85064h = r9;
    }

    public final String a() {
        return this.f85064h;
    }

    public final BigDecimal b() {
        return this.f85061e;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f85063g;
    }

    public final String e() {
        return this.f85062f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (kotlin.jvm.internal.p.g(this.f85058a, r52.f85058a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f85059b, r52.f85059b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f85060c, r52.f85060c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f85061e, r52.f85061e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f85062f, r52.f85062f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f85063g, r52.f85063g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f85064h, r52.f85064h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f85058a;
    }

    public final String g() {
        return this.f85060c;
    }

    public final String h() {
        return this.f85059b;
    }

    public int hashCode() {
        return (((((((((((((this.f85058a.hashCode() * 31) + this.f85059b.hashCode()) * 31) + this.f85060c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f85061e.hashCode()) * 31) + this.f85062f.hashCode()) * 31) + this.f85063g.hashCode()) * 31) + this.f85064h.hashCode();
    }

    public String toString() {
        return "HistoryAdditionalInfoStockEntity(paymentDate=" + this.f85058a + ", ratioOldShare=" + this.f85059b + ", ratioNewShare=" + this.f85060c + ", closingPriceDate=" + this.d + ", closingPrice=" + this.f85061e + ", oldShare=" + this.f85062f + ", dividendShare=" + this.f85063g + ", bonusShare=" + this.f85064h + ")";
    }
}
