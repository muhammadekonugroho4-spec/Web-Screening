package com.stockbit.cryptodetail.ui.detail.state;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f79721a;

    /* renamed from: b, reason: collision with root package name */
    public final String f79722b;

    /* renamed from: c, reason: collision with root package name */
    public final String f79723c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final String f79724e;

    /* renamed from: f, reason: collision with root package name */
    public final String f79725f;

    /* renamed from: g, reason: collision with root package name */
    public final String f79726g;

    /* renamed from: h, reason: collision with root package name */
    public final String f79727h;

    /* renamed from: i, reason: collision with root package name */
    public final String f79728i;

    static {
    }

    public h(String r2, String r3, String r4, double r5, String r7, String r8, String r9, String r10, String r11) {
        p.l(r2, FirebaseAnalytics.Param.PRICE);
        p.l(r3, "changeAmount");
        p.l(r4, "changePercent");
        p.l(r7, "usdPrice");
        p.l(r8, "open");
        p.l(r9, Constants.PRIORITY_HIGH);
        p.l(r10, "low");
        p.l(r11, Constants.KEY_HIDE_CLOSE);
        this.f79721a = r2;
        this.f79722b = r3;
        this.f79723c = r4;
        this.d = r5;
        this.f79724e = r7;
        this.f79725f = r8;
        this.f79726g = r9;
        this.f79727h = r10;
        this.f79728i = r11;
    }

    public final String a() {
        return this.f79722b;
    }

    public final String b() {
        return this.f79723c;
    }

    public final double c() {
        return this.d;
    }

    public final String d() {
        return this.f79728i;
    }

    public final String e() {
        return this.f79726g;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof h) == true) goto L8;
        return false;
    L8:
        h r82 = (h) r8;
        if (p.g(this.f79721a, r82.f79721a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f79722b, r82.f79722b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f79723c, r82.f79723c) == true) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (p.g(this.f79724e, r82.f79724e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f79725f, r82.f79725f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f79726g, r82.f79726g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f79727h, r82.f79727h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f79728i, r82.f79728i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.f79727h;
    }

    public final String g() {
        return this.f79725f;
    }

    public final String h() {
        return this.f79721a;
    }

    public int hashCode() {
        return (((((((((((((((this.f79721a.hashCode() * 31) + this.f79722b.hashCode()) * 31) + this.f79723c.hashCode()) * 31) + Double.hashCode(this.d)) * 31) + this.f79724e.hashCode()) * 31) + this.f79725f.hashCode()) * 31) + this.f79726g.hashCode()) * 31) + this.f79727h.hashCode()) * 31) + this.f79728i.hashCode();
    }

    public final String i() {
        return this.f79724e;
    }

    public String toString() {
        return "CryptoDetailScrubOverlay(price=" + this.f79721a + ", changeAmount=" + this.f79722b + ", changePercent=" + this.f79723c + ", changePrice=" + this.d + ", usdPrice=" + this.f79724e + ", open=" + this.f79725f + ", high=" + this.f79726g + ", low=" + this.f79727h + ", close=" + this.f79728i + ')';
    }
}
