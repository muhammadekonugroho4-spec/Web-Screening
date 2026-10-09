package com.stockbit.usecase.securities.model.portfolio;

/* renamed from: com.stockbit.usecase.securities.model.portfolio.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10922d {

    /* renamed from: a, reason: collision with root package name */
    public final String f161727a;

    /* renamed from: b, reason: collision with root package name */
    public final C10921c f161728b;

    /* renamed from: c, reason: collision with root package name */
    public final String f161729c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final String f161730e;

    /* renamed from: f, reason: collision with root package name */
    public final String f161731f;

    public C10922d(String r2, C10921c r3, String r4, double r5, String r7, String r8) {
        kotlin.jvm.internal.p.l(r2, "orderId");
        kotlin.jvm.internal.p.l(r3, "product");
        kotlin.jvm.internal.p.l(r4, "investmentCapital");
        kotlin.jvm.internal.p.l(r7, "totalUnit");
        kotlin.jvm.internal.p.l(r8, "buyDate");
        this.f161727a = r2;
        this.f161728b = r3;
        this.f161729c = r4;
        this.d = r5;
        this.f161730e = r7;
        this.f161731f = r8;
    }

    public final String a() {
        return this.f161731f;
    }

    public final String b() {
        return this.f161729c;
    }

    public final String c() {
        return this.f161727a;
    }

    public final C10921c d() {
        return this.f161728b;
    }

    public final String e() {
        return this.f161730e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C10922d) == true) goto L8;
        return false;
    L8:
        C10922d r82 = (C10922d) r8;
        if (kotlin.jvm.internal.p.g(this.f161727a, r82.f161727a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f161728b, r82.f161728b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f161729c, r82.f161729c) == true) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f161730e, r82.f161730e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f161731f, r82.f161731f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        return (((((((((this.f161727a.hashCode() * 31) + this.f161728b.hashCode()) * 31) + this.f161729c.hashCode()) * 31) + Double.hashCode(this.d)) * 31) + this.f161730e.hashCode()) * 31) + this.f161731f.hashCode();
    }

    public String toString() {
        return "BondTransactionHistoryUIState(orderId=" + this.f161727a + ", product=" + this.f161728b + ", investmentCapital=" + this.f161729c + ", investmentCapitalRaw=" + this.d + ", totalUnit=" + this.f161730e + ", buyDate=" + this.f161731f + ")";
    }
}
