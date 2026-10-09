package com.stockbit.domain.model.tradingcommunity;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f85964a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85965b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85966c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f85967e;

    /* renamed from: f, reason: collision with root package name */
    public final String f85968f;

    /* renamed from: g, reason: collision with root package name */
    public final String f85969g;

    /* renamed from: h, reason: collision with root package name */
    public final String f85970h;

    /* renamed from: i, reason: collision with root package name */
    public final String f85971i;

    public e(boolean r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10) {
        p.l(r3, "nextAction");
        p.l(r4, "promptTitle");
        p.l(r5, "promptMessage");
        p.l(r6, "primaryActionLabel");
        p.l(r7, "secondaryActionLabel");
        p.l(r8, "communityName");
        p.l(r9, "leaderUserName");
        p.l(r10, "leaderFullName");
        this.f85964a = r2;
        this.f85965b = r3;
        this.f85966c = r4;
        this.d = r5;
        this.f85967e = r6;
        this.f85968f = r7;
        this.f85969g = r8;
        this.f85970h = r9;
        this.f85971i = r10;
    }

    public final String a() {
        return this.f85969g;
    }

    public final String b() {
        return this.f85971i;
    }

    public final String c() {
        return this.f85970h;
    }

    public final String d() {
        return this.f85965b;
    }

    public final String e() {
        return this.f85967e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (this.f85964a == r52.f85964a) goto L12;
        return false;
    L12:
        if (p.g(this.f85965b, r52.f85965b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85966c, r52.f85966c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f85967e, r52.f85967e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f85968f, r52.f85968f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f85969g, r52.f85969g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f85970h, r52.f85970h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f85971i, r52.f85971i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.f85966c;
    }

    public final String h() {
        return this.f85968f;
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.f85964a) * 31) + this.f85965b.hashCode()) * 31) + this.f85966c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f85967e.hashCode()) * 31) + this.f85968f.hashCode()) * 31) + this.f85969g.hashCode()) * 31) + this.f85970h.hashCode()) * 31) + this.f85971i.hashCode();
    }

    public final boolean i() {
        return this.f85964a;
    }

    public String toString() {
        return "TradingCommunityLinkagePromptEntity(isShowPrompt=" + this.f85964a + ", nextAction=" + this.f85965b + ", promptTitle=" + this.f85966c + ", promptMessage=" + this.d + ", primaryActionLabel=" + this.f85967e + ", secondaryActionLabel=" + this.f85968f + ", communityName=" + this.f85969g + ", leaderUserName=" + this.f85970h + ", leaderFullName=" + this.f85971i + ")";
    }
}
