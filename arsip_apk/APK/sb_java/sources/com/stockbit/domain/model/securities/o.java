package com.stockbit.domain.model.securities;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f85382a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85383b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85384c;
    public final String d;

    public o(String r2, String r3, String r4, String r5) {
        kotlin.jvm.internal.p.l(r2, "sourceAccNo");
        kotlin.jvm.internal.p.l(r3, "sourceName");
        kotlin.jvm.internal.p.l(r4, "destinationAccNo");
        kotlin.jvm.internal.p.l(r5, "destinationName");
        this.f85382a = r2;
        this.f85383b = r3;
        this.f85384c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f85384c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f85382a;
    }

    public final String d() {
        return this.f85383b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof o) == true) goto L8;
        return false;
    L8:
        o r52 = (o) r5;
        if (kotlin.jvm.internal.p.g(this.f85382a, r52.f85382a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f85383b, r52.f85383b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f85384c, r52.f85384c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f85382a.hashCode() * 31) + this.f85383b.hashCode()) * 31) + this.f85384c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "RealizedMoveStockCashEntity(sourceAccNo=" + this.f85382a + ", sourceName=" + this.f85383b + ", destinationAccNo=" + this.f85384c + ", destinationName=" + this.d + ")";
    }
}
