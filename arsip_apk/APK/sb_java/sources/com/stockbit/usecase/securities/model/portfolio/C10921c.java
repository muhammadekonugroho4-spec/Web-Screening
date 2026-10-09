package com.stockbit.usecase.securities.model.portfolio;

/* renamed from: com.stockbit.usecase.securities.model.portfolio.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10921c {

    /* renamed from: a, reason: collision with root package name */
    public final String f161724a;

    /* renamed from: b, reason: collision with root package name */
    public final String f161725b;

    /* renamed from: c, reason: collision with root package name */
    public final String f161726c;

    public C10921c(String r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r2, "productId");
        kotlin.jvm.internal.p.l(r3, "productName");
        kotlin.jvm.internal.p.l(r4, "productIcon");
        this.f161724a = r2;
        this.f161725b = r3;
        this.f161726c = r4;
    }

    public final String a() {
        return this.f161726c;
    }

    public final String b() {
        return this.f161724a;
    }

    public final String c() {
        return this.f161725b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C10921c) == true) goto L8;
        return false;
    L8:
        C10921c r52 = (C10921c) r5;
        if (kotlin.jvm.internal.p.g(this.f161724a, r52.f161724a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f161725b, r52.f161725b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f161726c, r52.f161726c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f161724a.hashCode() * 31) + this.f161725b.hashCode()) * 31) + this.f161726c.hashCode();
    }

    public String toString() {
        return "BondProductInfoUIState(productId=" + this.f161724a + ", productName=" + this.f161725b + ", productIcon=" + this.f161726c + ")";
    }
}
