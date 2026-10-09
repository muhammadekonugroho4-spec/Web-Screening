package com.stockbit.feature.history.ui.detailhistorytenderoffer;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class h {

    /* renamed from: h, reason: collision with root package name */
    public static final a f97839h = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f97840a;

    /* renamed from: b, reason: collision with root package name */
    public final String f97841b;

    /* renamed from: c, reason: collision with root package name */
    public final String f97842c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f97843e;

    /* renamed from: f, reason: collision with root package name */
    public final String f97844f;

    /* renamed from: g, reason: collision with root package name */
    public final String f97845g;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f97839h = new a(null);
    }

    public h(String r2, String r3, String r4, String r5, String r6, String r7, String r8) {
        p.l(r2, "symbol");
        p.l(r3, Constants.KEY_DATE);
        p.l(r4, "shares");
        p.l(r5, FirebaseAnalytics.Param.PRICE);
        p.l(r6, "amount");
        p.l(r7, "fee");
        p.l(r8, "netAmount");
        this.f97840a = r2;
        this.f97841b = r3;
        this.f97842c = r4;
        this.d = r5;
        this.f97843e = r6;
        this.f97844f = r7;
        this.f97845g = r8;
    }

    public final String a() {
        return this.f97843e;
    }

    public final String b() {
        return this.f97841b;
    }

    public final String c() {
        return this.f97844f;
    }

    public final String d() {
        return this.f97845g;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (p.g(this.f97840a, r52.f97840a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f97841b, r52.f97841b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f97842c, r52.f97842c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f97843e, r52.f97843e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f97844f, r52.f97844f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f97845g, r52.f97845g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.f97842c;
    }

    public int hashCode() {
        return (((((((((((this.f97840a.hashCode() * 31) + this.f97841b.hashCode()) * 31) + this.f97842c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f97843e.hashCode()) * 31) + this.f97844f.hashCode()) * 31) + this.f97845g.hashCode();
    }

    public String toString() {
        return "DetailHistoryTenderOfferUIState(symbol=" + this.f97840a + ", date=" + this.f97841b + ", shares=" + this.f97842c + ", price=" + this.d + ", amount=" + this.f97843e + ", fee=" + this.f97844f + ", netAmount=" + this.f97845g + ')';
    }
}
