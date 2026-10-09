package com.stockbit.feature.transaction.ui.dialog.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.stockbit.domain.model.type.securities.TradingActionType;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f113479a;

    /* renamed from: b, reason: collision with root package name */
    public final String f113480b;

    /* renamed from: c, reason: collision with root package name */
    public final String f113481c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f113482e;

    /* renamed from: f, reason: collision with root package name */
    public final String f113483f;

    /* renamed from: g, reason: collision with root package name */
    public final String f113484g;

    /* renamed from: h, reason: collision with root package name */
    public final String f113485h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f113486i;

    /* renamed from: j, reason: collision with root package name */
    public final TradingActionType f113487j;

    static {
    }

    public a(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, boolean r10, TradingActionType r11) {
        p.l(r2, FirebaseAnalytics.Param.PRICE);
        p.l(r3, "shares");
        p.l(r4, "orderId");
        p.l(r5, "uiref");
        p.l(r6, "symbol");
        p.l(r7, "gtc");
        p.l(r8, "boardtype");
        p.l(r9, "multiplier");
        p.l(r11, "tradingActionType");
        this.f113479a = r2;
        this.f113480b = r3;
        this.f113481c = r4;
        this.d = r5;
        this.f113482e = r6;
        this.f113483f = r7;
        this.f113484g = r8;
        this.f113485h = r9;
        this.f113486i = r10;
        this.f113487j = r11;
    }

    public final String a() {
        return this.f113485h;
    }

    public final String b() {
        return this.f113481c;
    }

    public final String c() {
        return this.f113479a;
    }

    public final String d() {
        return this.f113480b;
    }

    public final TradingActionType e() {
        return this.f113487j;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f113479a, r52.f113479a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f113480b, r52.f113480b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f113481c, r52.f113481c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f113482e, r52.f113482e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f113483f, r52.f113483f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f113484g, r52.f113484g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f113485h, r52.f113485h) == true) goto L33;
        return false;
    L33:
        if (this.f113486i == r52.f113486i) goto L36;
        return false;
    L36:
        if (this.f113487j == r52.f113487j) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final boolean g() {
        return this.f113486i;
    }

    public int hashCode() {
        return (((((((((((((((((this.f113479a.hashCode() * 31) + this.f113480b.hashCode()) * 31) + this.f113481c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f113482e.hashCode()) * 31) + this.f113483f.hashCode()) * 31) + this.f113484g.hashCode()) * 31) + this.f113485h.hashCode()) * 31) + Boolean.hashCode(this.f113486i)) * 31) + this.f113487j.hashCode();
    }

    public String toString() {
        return "AmendOrderData(price=" + this.f113479a + ", shares=" + this.f113480b + ", orderId=" + this.f113481c + ", uiref=" + this.d + ", symbol=" + this.f113482e + ", gtc=" + this.f113483f + ", boardtype=" + this.f113484g + ", multiplier=" + this.f113485h + ", isDayTrade=" + this.f113486i + ", tradingActionType=" + this.f113487j + ')';
    }
}
