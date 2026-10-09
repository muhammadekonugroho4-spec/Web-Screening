package com.stockbit.domain.model.securities;

/* loaded from: classes8.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f85730a;

    /* renamed from: b, reason: collision with root package name */
    public final s f85731b;

    /* renamed from: c, reason: collision with root package name */
    public final q f85732c;
    public final k d;

    public r(String r2, s r3, q r4, k r5) {
        kotlin.jvm.internal.p.l(r2, "stockCode");
        kotlin.jvm.internal.p.l(r3, "stockType");
        kotlin.jvm.internal.p.l(r4, "stockBoardTradable");
        kotlin.jvm.internal.p.l(r5, "marginBoardTradableEntity");
        this.f85730a = r2;
        this.f85731b = r3;
        this.f85732c = r4;
        this.d = r5;
    }

    public final k a() {
        return this.d;
    }

    public final q b() {
        return this.f85732c;
    }

    public final String c() {
        return this.f85730a;
    }

    public final s d() {
        return this.f85731b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof r) == true) goto L8;
        return false;
    L8:
        r r52 = (r) r5;
        if (kotlin.jvm.internal.p.g(this.f85730a, r52.f85730a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f85731b, r52.f85731b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f85732c, r52.f85732c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f85730a.hashCode() * 31) + this.f85731b.hashCode()) * 31) + this.f85732c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "StockTradableEntity(stockCode=" + this.f85730a + ", stockType=" + this.f85731b + ", stockBoardTradable=" + this.f85732c + ", marginBoardTradableEntity=" + this.d + ")";
    }
}
