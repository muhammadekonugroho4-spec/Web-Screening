package com.stockbit.usecase.trading.community.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f163269a;

    /* renamed from: b, reason: collision with root package name */
    public final String f163270b;

    /* renamed from: c, reason: collision with root package name */
    public final String f163271c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f163272e;

    /* renamed from: f, reason: collision with root package name */
    public final String f163273f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f163274g;

    /* renamed from: h, reason: collision with root package name */
    public final int f163275h;

    /* renamed from: i, reason: collision with root package name */
    public final String f163276i;

    /* renamed from: j, reason: collision with root package name */
    public final String f163277j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f163278k;

    /* renamed from: l, reason: collision with root package name */
    public final TradingCommunityBannerType f163279l;

    public f(String r2, String r3, String r4, String r5, String r6, String r7, boolean r8, int r9, String r10, String r11, boolean r12, TradingCommunityBannerType r13) {
        p.l(r2, "communityName");
        p.l(r3, "leaderUserName");
        p.l(r4, "leaderFullName");
        p.l(r5, "leaveDate");
        p.l(r6, "newTotalBuy");
        p.l(r7, "newTotalSell");
        p.l(r10, "userName");
        p.l(r11, "userPhoneNumber");
        p.l(r13, "bannerStatusType");
        this.f163269a = r2;
        this.f163270b = r3;
        this.f163271c = r4;
        this.d = r5;
        this.f163272e = r6;
        this.f163273f = r7;
        this.f163274g = r8;
        this.f163275h = r9;
        this.f163276i = r10;
        this.f163277j = r11;
        this.f163278k = r12;
        this.f163279l = r13;
    }

    public final boolean a() {
        return this.f163274g;
    }

    public final TradingCommunityBannerType b() {
        return this.f163279l;
    }

    public final String c() {
        return this.f163269a;
    }

    public final String d() {
        return this.f163271c;
    }

    public final String e() {
        return this.f163270b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f163269a, r52.f163269a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f163270b, r52.f163270b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f163271c, r52.f163271c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f163272e, r52.f163272e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f163273f, r52.f163273f) == true) goto L27;
        return false;
    L27:
        if (this.f163274g == r52.f163274g) goto L30;
        return false;
    L30:
        if (this.f163275h == r52.f163275h) goto L33;
        return false;
    L33:
        if (p.g(this.f163276i, r52.f163276i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f163277j, r52.f163277j) == true) goto L39;
        return false;
    L39:
        if (this.f163278k == r52.f163278k) goto L42;
        return false;
    L42:
        if (this.f163279l == r52.f163279l) goto L44;
        return false;
    L44:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.f163272e;
    }

    public final String h() {
        return this.f163273f;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.f163269a.hashCode() * 31) + this.f163270b.hashCode()) * 31) + this.f163271c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f163272e.hashCode()) * 31) + this.f163273f.hashCode()) * 31) + Boolean.hashCode(this.f163274g)) * 31) + Integer.hashCode(this.f163275h)) * 31) + this.f163276i.hashCode()) * 31) + this.f163277j.hashCode()) * 31) + Boolean.hashCode(this.f163278k)) * 31) + this.f163279l.hashCode();
    }

    public final String i() {
        return this.f163276i;
    }

    public final String j() {
        return this.f163277j;
    }

    public final boolean k() {
        return this.f163278k;
    }

    public String toString() {
        return "TradingCommunityStatusUIState(communityName=" + this.f163269a + ", leaderUserName=" + this.f163270b + ", leaderFullName=" + this.f163271c + ", leaveDate=" + this.d + ", newTotalBuy=" + this.f163272e + ", newTotalSell=" + this.f163273f + ", ableToLeave=" + this.f163274g + ", chatRoomId=" + this.f163275h + ", userName=" + this.f163276i + ", userPhoneNumber=" + this.f163277j + ", isLeaderHasPILicense=" + this.f163278k + ", bannerStatusType=" + this.f163279l + ")";
    }
}
