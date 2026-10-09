package com.stockbit.domain.model.user;

/* loaded from: classes8.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f86693a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f86694b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f86695c;

    public v(int r1, boolean r2, boolean r3) {
        this.f86693a = r1;
        this.f86694b = r2;
        this.f86695c = r3;
    }

    public final boolean a() {
        return this.f86695c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof v) == true) goto L8;
        return false;
    L8:
        v r52 = (v) r5;
        if (this.f86693a == r52.f86693a) goto L12;
        return false;
    L12:
        if (this.f86694b == r52.f86694b) goto L15;
        return false;
    L15:
        if (this.f86695c == r52.f86695c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f86693a) * 31) + Boolean.hashCode(this.f86694b)) * 31) + Boolean.hashCode(this.f86695c);
    }

    public String toString() {
        return "UserTradingEntity(accountId=" + this.f86693a + ", isPro=" + this.f86694b + ", hasRealTradingAccess=" + this.f86695c + ")";
    }
}
