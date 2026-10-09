package com.stockbit.domain.model.tradingcommunity;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f85976a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85977b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85978c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final float f85979e;

    /* renamed from: f, reason: collision with root package name */
    public final float f85980f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f85981g;

    /* renamed from: h, reason: collision with root package name */
    public final String f85982h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f85983i;

    /* renamed from: j, reason: collision with root package name */
    public final int f85984j;

    public g(String r2, String r3, String r4, String r5, float r6, float r7, boolean r8, String r9, boolean r10, int r11) {
        p.l(r2, "communityName");
        p.l(r3, "leaderUserName");
        p.l(r4, "leaderFullName");
        p.l(r5, "leaveDate");
        p.l(r9, "bannerStatusType");
        this.f85976a = r2;
        this.f85977b = r3;
        this.f85978c = r4;
        this.d = r5;
        this.f85979e = r6;
        this.f85980f = r7;
        this.f85981g = r8;
        this.f85982h = r9;
        this.f85983i = r10;
        this.f85984j = r11;
    }

    public final boolean a() {
        return this.f85981g;
    }

    public final String b() {
        return this.f85982h;
    }

    public final int c() {
        return this.f85984j;
    }

    public final String d() {
        return this.f85976a;
    }

    public final String e() {
        return this.f85978c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f85976a, r52.f85976a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85977b, r52.f85977b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85978c, r52.f85978c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (Float.compare(this.f85979e, r52.f85979e) == 0) goto L24;
        return false;
    L24:
        if (Float.compare(this.f85980f, r52.f85980f) == 0) goto L27;
        return false;
    L27:
        if (this.f85981g == r52.f85981g) goto L30;
        return false;
    L30:
        if (p.g(this.f85982h, r52.f85982h) == true) goto L33;
        return false;
    L33:
        if (this.f85983i == r52.f85983i) goto L36;
        return false;
    L36:
        if (this.f85984j == r52.f85984j) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.f85977b;
    }

    public final String g() {
        return this.d;
    }

    public final float h() {
        return this.f85979e;
    }

    public int hashCode() {
        return (((((((((((((((((this.f85976a.hashCode() * 31) + this.f85977b.hashCode()) * 31) + this.f85978c.hashCode()) * 31) + this.d.hashCode()) * 31) + Float.hashCode(this.f85979e)) * 31) + Float.hashCode(this.f85980f)) * 31) + Boolean.hashCode(this.f85981g)) * 31) + this.f85982h.hashCode()) * 31) + Boolean.hashCode(this.f85983i)) * 31) + Integer.hashCode(this.f85984j);
    }

    public final float i() {
        return this.f85980f;
    }

    public final boolean j() {
        return this.f85983i;
    }

    public String toString() {
        return "TradingCommunityStatusEntity(communityName=" + this.f85976a + ", leaderUserName=" + this.f85977b + ", leaderFullName=" + this.f85978c + ", leaveDate=" + this.d + ", newTotalBuy=" + this.f85979e + ", newTotalSell=" + this.f85980f + ", ableToLeave=" + this.f85981g + ", bannerStatusType=" + this.f85982h + ", isLeaderHasPILicense=" + this.f85983i + ", chatRoomId=" + this.f85984j + ")";
    }
}
