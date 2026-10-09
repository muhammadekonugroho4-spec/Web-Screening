package com.stockbit.feature.cryptoportfolio.ui.portfoliolist.state;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f94987a;

    /* renamed from: b, reason: collision with root package name */
    public final String f94988b;

    /* renamed from: c, reason: collision with root package name */
    public final String f94989c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f94990e;

    /* renamed from: f, reason: collision with root package name */
    public final String f94991f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f94992g;

    /* renamed from: h, reason: collision with root package name */
    public final List f94993h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f94994i;

    static {
    }

    public b(String r2, String r3, String r4, String r5, String r6, String r7, Boolean r8, List r9, boolean r10) {
        p.l(r2, "tradingBalanceFormatted");
        p.l(r3, "investedFormatted");
        p.l(r4, "openPendingFormatted");
        p.l(r5, "profitLossFormatted");
        p.l(r6, "gainLossPercentFormatted");
        p.l(r7, "totalEquityFormatted");
        p.l(r9, FirebaseAnalytics.Param.ITEMS);
        this.f94987a = r2;
        this.f94988b = r3;
        this.f94989c = r4;
        this.d = r5;
        this.f94990e = r6;
        this.f94991f = r7;
        this.f94992g = r8;
        this.f94993h = r9;
        this.f94994i = r10;
    }

    public final String a() {
        return this.f94990e;
    }

    public final boolean b() {
        return this.f94994i;
    }

    public final String c() {
        return this.f94988b;
    }

    public final List d() {
        return this.f94993h;
    }

    public final String e() {
        return this.f94989c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f94987a, r52.f94987a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f94988b, r52.f94988b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f94989c, r52.f94989c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f94990e, r52.f94990e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f94991f, r52.f94991f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f94992g, r52.f94992g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f94993h, r52.f94993h) == true) goto L33;
        return false;
    L33:
        if (this.f94994i == r52.f94994i) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.f94991f;
    }

    public final String h() {
        return this.f94987a;
    }

    public int hashCode() {
        int r02 = ((((((((((this.f94987a.hashCode() * 31) + this.f94988b.hashCode()) * 31) + this.f94989c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f94990e.hashCode()) * 31) + this.f94991f.hashCode()) * 31;
        Boolean r1 = this.f94992g;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((((r02 + r12) * 31) + this.f94993h.hashCode()) * 31) + Boolean.hashCode(this.f94994i);
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final Boolean i() {
        return this.f94992g;
    }

    public String toString() {
        return "CryptoPortfolioListUIData(tradingBalanceFormatted=" + this.f94987a + ", investedFormatted=" + this.f94988b + ", openPendingFormatted=" + this.f94989c + ", profitLossFormatted=" + this.d + ", gainLossPercentFormatted=" + this.f94990e + ", totalEquityFormatted=" + this.f94991f + ", isProfitPositive=" + this.f94992g + ", items=" + this.f94993h + ", hasNoHoldings=" + this.f94994i + ')';
    }
}
