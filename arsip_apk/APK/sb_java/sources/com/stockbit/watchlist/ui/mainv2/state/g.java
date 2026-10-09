package com.stockbit.watchlist.ui.mainv2.state;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.stockbit.eipo.EipoEntryPoint;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f170944a;

    /* renamed from: b, reason: collision with root package name */
    public final String f170945b;

    /* renamed from: c, reason: collision with root package name */
    public final String f170946c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f170947e;

    /* renamed from: f, reason: collision with root package name */
    public final String f170948f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f170949g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f170950h;

    static {
    }

    public g(String r2, String r3, String r4, String r5, String r6, String r7, boolean r8, boolean r9) {
        kotlin.jvm.internal.p.l(r2, EipoEntryPoint.EXTRA_EMITEN_CODE);
        kotlin.jvm.internal.p.l(r3, "companyName");
        kotlin.jvm.internal.p.l(r4, "companyLogo");
        kotlin.jvm.internal.p.l(r5, FirebaseAnalytics.Param.PRICE);
        kotlin.jvm.internal.p.l(r6, "stageDisplay");
        kotlin.jvm.internal.p.l(r7, "stageDateDisplay");
        this.f170944a = r2;
        this.f170945b = r3;
        this.f170946c = r4;
        this.d = r5;
        this.f170947e = r6;
        this.f170948f = r7;
        this.f170949g = r8;
        this.f170950h = r9;
    }

    public final String a() {
        return this.f170946c;
    }

    public final String b() {
        return this.f170944a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (kotlin.jvm.internal.p.g(this.f170944a, r52.f170944a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f170945b, r52.f170945b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f170946c, r52.f170946c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f170947e, r52.f170947e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f170948f, r52.f170948f) == true) goto L27;
        return false;
    L27:
        if (this.f170949g == r52.f170949g) goto L30;
        return false;
    L30:
        if (this.f170950h == r52.f170950h) goto L32;
        return false;
    L32:
        return true;
    }

    public int hashCode() {
        return (((((((((((((this.f170944a.hashCode() * 31) + this.f170945b.hashCode()) * 31) + this.f170946c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f170947e.hashCode()) * 31) + this.f170948f.hashCode()) * 31) + Boolean.hashCode(this.f170949g)) * 31) + Boolean.hashCode(this.f170950h);
    }

    public String toString() {
        return "WatchlistMainEipoItemUIState(emitenCode=" + this.f170944a + ", companyName=" + this.f170945b + ", companyLogo=" + this.f170946c + ", price=" + this.d + ", stageDisplay=" + this.f170947e + ", stageDateDisplay=" + this.f170948f + ", isSharia=" + this.f170949g + ", isWarrant=" + this.f170950h + ')';
    }
}
