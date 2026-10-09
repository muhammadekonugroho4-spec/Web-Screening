package com.stockbit.domain.model.calendar;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f81069a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81070b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81071c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f81072e;

    /* renamed from: f, reason: collision with root package name */
    public final String f81073f;

    /* renamed from: g, reason: collision with root package name */
    public final String f81074g;

    /* renamed from: h, reason: collision with root package name */
    public final String f81075h;

    /* renamed from: i, reason: collision with root package name */
    public final String f81076i;

    /* renamed from: j, reason: collision with root package name */
    public final String f81077j;

    /* renamed from: k, reason: collision with root package name */
    public final String f81078k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f81079l;

    /* renamed from: m, reason: collision with root package name */
    public final String f81080m;

    /* renamed from: n, reason: collision with root package name */
    public final String f81081n;

    public l(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, boolean r13, String r14, String r15) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, "companyId");
        p.l(r4, FirebaseAnalytics.Param.PRICE);
        p.l(r5, "shares");
        p.l(r6, "percentage");
        p.l(r7, "start");
        p.l(r8, "end");
        p.l(r9, "paydate");
        p.l(r10, "created");
        p.l(r11, "companySymbol");
        p.l(r12, "companyName");
        p.l(r14, "eventNote");
        p.l(r15, "priceFormatted");
        this.f81069a = r2;
        this.f81070b = r3;
        this.f81071c = r4;
        this.d = r5;
        this.f81072e = r6;
        this.f81073f = r7;
        this.f81074g = r8;
        this.f81075h = r9;
        this.f81076i = r10;
        this.f81077j = r11;
        this.f81078k = r12;
        this.f81079l = r13;
        this.f81080m = r14;
        this.f81081n = r15;
    }

    public final String a() {
        return this.f81070b;
    }

    public final String b() {
        return this.f81077j;
    }

    public final String c() {
        return this.f81074g;
    }

    public final String d() {
        return this.f81080m;
    }

    public final String e() {
        return this.f81075h;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (p.g(this.f81069a, r52.f81069a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81070b, r52.f81070b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81071c, r52.f81071c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f81072e, r52.f81072e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f81073f, r52.f81073f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f81074g, r52.f81074g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f81075h, r52.f81075h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f81076i, r52.f81076i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f81077j, r52.f81077j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f81078k, r52.f81078k) == true) goto L42;
        return false;
    L42:
        if (this.f81079l == r52.f81079l) goto L45;
        return false;
    L45:
        if (p.g(this.f81080m, r52.f81080m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f81081n, r52.f81081n) == true) goto L50;
        return false;
    L50:
        return true;
    }

    public final String f() {
        return this.f81072e;
    }

    public final String g() {
        return this.f81071c;
    }

    public final String h() {
        return this.f81081n;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.f81069a.hashCode() * 31) + this.f81070b.hashCode()) * 31) + this.f81071c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f81072e.hashCode()) * 31) + this.f81073f.hashCode()) * 31) + this.f81074g.hashCode()) * 31) + this.f81075h.hashCode()) * 31) + this.f81076i.hashCode()) * 31) + this.f81077j.hashCode()) * 31) + this.f81078k.hashCode()) * 31) + Boolean.hashCode(this.f81079l)) * 31) + this.f81080m.hashCode()) * 31) + this.f81081n.hashCode();
    }

    public final String i() {
        return this.d;
    }

    public final String j() {
        return this.f81073f;
    }

    public final boolean k() {
        return this.f81079l;
    }

    public String toString() {
        return "CalendarTenderOfferEntity(id=" + this.f81069a + ", companyId=" + this.f81070b + ", price=" + this.f81071c + ", shares=" + this.d + ", percentage=" + this.f81072e + ", start=" + this.f81073f + ", end=" + this.f81074g + ", paydate=" + this.f81075h + ", created=" + this.f81076i + ", companySymbol=" + this.f81077j + ", companyName=" + this.f81078k + ", isCorpActionActive=" + this.f81079l + ", eventNote=" + this.f81080m + ", priceFormatted=" + this.f81081n + ")";
    }
}
