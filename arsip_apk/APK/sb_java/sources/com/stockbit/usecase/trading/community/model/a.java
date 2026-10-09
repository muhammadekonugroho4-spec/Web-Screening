package com.stockbit.usecase.trading.community.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f163245a;

    /* renamed from: b, reason: collision with root package name */
    public final String f163246b;

    /* renamed from: c, reason: collision with root package name */
    public final String f163247c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f163248e;

    /* renamed from: f, reason: collision with root package name */
    public final String f163249f;

    /* renamed from: g, reason: collision with root package name */
    public final String f163250g;

    /* renamed from: h, reason: collision with root package name */
    public final String f163251h;

    /* renamed from: i, reason: collision with root package name */
    public final String f163252i;

    /* renamed from: j, reason: collision with root package name */
    public final String f163253j;

    /* renamed from: k, reason: collision with root package name */
    public final String f163254k;

    public a(boolean r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12) {
        p.l(r3, "nextAction");
        p.l(r4, "promptTitle");
        p.l(r5, "promptMessage");
        p.l(r6, "primaryActionLabel");
        p.l(r7, "secondaryActionLabel");
        p.l(r8, "communityName");
        p.l(r9, "userPhoneNumber");
        p.l(r10, "userName");
        p.l(r11, "leaderUserName");
        p.l(r12, "leaderFullName");
        this.f163245a = r2;
        this.f163246b = r3;
        this.f163247c = r4;
        this.d = r5;
        this.f163248e = r6;
        this.f163249f = r7;
        this.f163250g = r8;
        this.f163251h = r9;
        this.f163252i = r10;
        this.f163253j = r11;
        this.f163254k = r12;
    }

    public final String a() {
        return this.f163250g;
    }

    public final String b() {
        return this.f163253j;
    }

    public final String c() {
        return this.f163248e;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f163247c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f163245a == r52.f163245a) goto L12;
        return false;
    L12:
        if (p.g(this.f163246b, r52.f163246b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f163247c, r52.f163247c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f163248e, r52.f163248e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f163249f, r52.f163249f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f163250g, r52.f163250g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f163251h, r52.f163251h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f163252i, r52.f163252i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f163253j, r52.f163253j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f163254k, r52.f163254k) == true) goto L41;
        return false;
    L41:
        return true;
    }

    public final String f() {
        return this.f163249f;
    }

    public final String g() {
        return this.f163252i;
    }

    public final String h() {
        return this.f163251h;
    }

    public int hashCode() {
        return (((((((((((((((((((Boolean.hashCode(this.f163245a) * 31) + this.f163246b.hashCode()) * 31) + this.f163247c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f163248e.hashCode()) * 31) + this.f163249f.hashCode()) * 31) + this.f163250g.hashCode()) * 31) + this.f163251h.hashCode()) * 31) + this.f163252i.hashCode()) * 31) + this.f163253j.hashCode()) * 31) + this.f163254k.hashCode();
    }

    public final boolean i() {
        return this.f163245a;
    }

    public String toString() {
        return "GetTradingCommunityLinkagePromptUIData(isShowPrompt=" + this.f163245a + ", nextAction=" + this.f163246b + ", promptTitle=" + this.f163247c + ", promptMessage=" + this.d + ", primaryActionLabel=" + this.f163248e + ", secondaryActionLabel=" + this.f163249f + ", communityName=" + this.f163250g + ", userPhoneNumber=" + this.f163251h + ", userName=" + this.f163252i + ", leaderUserName=" + this.f163253j + ", leaderFullName=" + this.f163254k + ")";
    }
}
