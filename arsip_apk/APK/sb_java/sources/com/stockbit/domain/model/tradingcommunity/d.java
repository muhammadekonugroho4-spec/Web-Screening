package com.stockbit.domain.model.tradingcommunity;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f85962a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f85963b;

    public d(boolean r1, boolean r2) {
        this.f85962a = r1;
        this.f85963b = r2;
    }

    public final boolean a() {
        return this.f85962a;
    }

    public final boolean b() {
        return this.f85963b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (this.f85962a == r52.f85962a) goto L12;
        return false;
    L12:
        if (this.f85963b == r52.f85963b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f85962a) * 31) + Boolean.hashCode(this.f85963b);
    }

    public String toString() {
        return "TradingCommunityInfoEntity(enabled=" + this.f85962a + ", isLeader=" + this.f85963b + ")";
    }
}
