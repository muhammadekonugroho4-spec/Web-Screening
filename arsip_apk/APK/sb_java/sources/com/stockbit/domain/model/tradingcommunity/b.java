package com.stockbit.domain.model.tradingcommunity;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f85949a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85950b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85951c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f85952e;

    public b(String r2, String r3, int r4, String r5, boolean r6) {
        p.l(r2, "leaderUsername");
        p.l(r3, "communityName");
        p.l(r5, "nextAction");
        this.f85949a = r2;
        this.f85950b = r3;
        this.f85951c = r4;
        this.d = r5;
        this.f85952e = r6;
    }

    public final String a() {
        return this.f85950b;
    }

    public final String b() {
        return this.f85949a;
    }

    public final String c() {
        return this.d;
    }

    public final int d() {
        return this.f85951c;
    }

    public final boolean e() {
        return this.f85952e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f85949a, r52.f85949a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85950b, r52.f85950b) == true) goto L15;
        return false;
    L15:
        if (this.f85951c == r52.f85951c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f85952e == r52.f85952e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f85949a.hashCode() * 31) + this.f85950b.hashCode()) * 31) + Integer.hashCode(this.f85951c)) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f85952e);
    }

    public String toString() {
        return "TradingCommunityApplyCodeEntity(leaderUsername=" + this.f85949a + ", communityName=" + this.f85950b + ", roomId=" + this.f85951c + ", nextAction=" + this.d + ", isLeaderHasPILicense=" + this.f85952e + ")";
    }
}
