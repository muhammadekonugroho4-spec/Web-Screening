package com.stockbit.feature.transaction.ui.portfolioorderhistory;

/* renamed from: com.stockbit.feature.transaction.ui.portfolioorderhistory.u, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C8855u {

    /* renamed from: a, reason: collision with root package name */
    public final String f115231a;

    /* renamed from: b, reason: collision with root package name */
    public final String f115232b;

    /* renamed from: c, reason: collision with root package name */
    public final String f115233c;

    static {
    }

    public C8855u(String r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r2, "period");
        kotlin.jvm.internal.p.l(r3, "start");
        kotlin.jvm.internal.p.l(r4, "end");
        this.f115231a = r2;
        this.f115232b = r3;
        this.f115233c = r4;
    }

    public final String a() {
        return this.f115233c;
    }

    public final String b() {
        return this.f115231a;
    }

    public final String c() {
        return this.f115232b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C8855u) == true) goto L8;
        return false;
    L8:
        C8855u r52 = (C8855u) r5;
        if (kotlin.jvm.internal.p.g(this.f115231a, r52.f115231a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f115232b, r52.f115232b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f115233c, r52.f115233c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f115231a.hashCode() * 31) + this.f115232b.hashCode()) * 31) + this.f115233c.hashCode();
    }

    public String toString() {
        return "HistoryPeriodApiParams(period=" + this.f115231a + ", start=" + this.f115232b + ", end=" + this.f115233c + ')';
    }
}
