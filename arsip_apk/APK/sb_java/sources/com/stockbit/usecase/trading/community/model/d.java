package com.stockbit.usecase.trading.community.model;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f163264a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f163265b;

    public d(boolean r1, boolean r2) {
        this.f163264a = r1;
        this.f163265b = r2;
    }

    public final boolean a() {
        return this.f163264a;
    }

    public final boolean b() {
        return this.f163265b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (this.f163264a == r52.f163264a) goto L12;
        return false;
    L12:
        if (this.f163265b == r52.f163265b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f163264a) * 31) + Boolean.hashCode(this.f163265b);
    }

    public String toString() {
        return "TradingCommunityInfoUIState(enabled=" + this.f163264a + ", isLeader=" + this.f163265b + ")";
    }
}
