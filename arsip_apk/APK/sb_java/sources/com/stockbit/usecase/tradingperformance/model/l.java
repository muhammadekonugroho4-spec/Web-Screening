package com.stockbit.usecase.tradingperformance.model;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f163520a;

    /* renamed from: b, reason: collision with root package name */
    public final String f163521b;

    /* renamed from: c, reason: collision with root package name */
    public final String f163522c;
    public final String d;

    public l(String r2, String r3, String r4, String r5) {
        kotlin.jvm.internal.p.l(r2, "symbol");
        kotlin.jvm.internal.p.l(r3, "iconUrl");
        kotlin.jvm.internal.p.l(r4, "value");
        kotlin.jvm.internal.p.l(r5, "percentageText");
        this.f163520a = r2;
        this.f163521b = r3;
        this.f163522c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f163521b;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f163520a;
    }

    public final String d() {
        return this.f163522c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (kotlin.jvm.internal.p.g(this.f163520a, r52.f163520a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f163521b, r52.f163521b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f163522c, r52.f163522c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f163520a.hashCode() * 31) + this.f163521b.hashCode()) * 31) + this.f163522c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "SubSectorStockAllocationItemUIState(symbol=" + this.f163520a + ", iconUrl=" + this.f163521b + ", value=" + this.f163522c + ", percentageText=" + this.d + ")";
    }
}
