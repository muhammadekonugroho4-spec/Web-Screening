package com.stockbit.feature.cryptoorder.ui.state;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f94605a;

    /* renamed from: b, reason: collision with root package name */
    public final String f94606b;

    /* renamed from: c, reason: collision with root package name */
    public final String f94607c;
    public final CryptoOrderStatusColorTone d;

    /* renamed from: e, reason: collision with root package name */
    public final String f94608e;

    /* renamed from: f, reason: collision with root package name */
    public final String f94609f;

    /* renamed from: g, reason: collision with root package name */
    public final int f94610g;

    /* renamed from: h, reason: collision with root package name */
    public final CryptoOrderStatusColorTone f94611h;

    static {
    }

    public f(String r2, String r3, String r4, CryptoOrderStatusColorTone r5, String r6, String r7, int r8, CryptoOrderStatusColorTone r9) {
        p.l(r2, "orderId");
        p.l(r3, "coinSymbol");
        p.l(r4, "actionLabel");
        p.l(r5, "actionColorTone");
        p.l(r6, "amount");
        p.l(r7, FirebaseAnalytics.Param.PRICE);
        p.l(r9, "statusColorTone");
        this.f94605a = r2;
        this.f94606b = r3;
        this.f94607c = r4;
        this.d = r5;
        this.f94608e = r6;
        this.f94609f = r7;
        this.f94610g = r8;
        this.f94611h = r9;
    }

    public final CryptoOrderStatusColorTone a() {
        return this.d;
    }

    public final String b() {
        return this.f94607c;
    }

    public final String c() {
        return this.f94608e;
    }

    public final String d() {
        return this.f94606b;
    }

    public final String e() {
        return this.f94605a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f94605a, r52.f94605a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f94606b, r52.f94606b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f94607c, r52.f94607c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f94608e, r52.f94608e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f94609f, r52.f94609f) == true) goto L27;
        return false;
    L27:
        if (this.f94610g == r52.f94610g) goto L30;
        return false;
    L30:
        if (this.f94611h == r52.f94611h) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.f94609f;
    }

    public final CryptoOrderStatusColorTone g() {
        return this.f94611h;
    }

    public final int h() {
        return this.f94610g;
    }

    public int hashCode() {
        return (((((((((((((this.f94605a.hashCode() * 31) + this.f94606b.hashCode()) * 31) + this.f94607c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f94608e.hashCode()) * 31) + this.f94609f.hashCode()) * 31) + Integer.hashCode(this.f94610g)) * 31) + this.f94611h.hashCode();
    }

    public String toString() {
        return "CryptoOrderListItemUIData(orderId=" + this.f94605a + ", coinSymbol=" + this.f94606b + ", actionLabel=" + this.f94607c + ", actionColorTone=" + this.d + ", amount=" + this.f94608e + ", price=" + this.f94609f + ", statusLabelRes=" + this.f94610g + ", statusColorTone=" + this.f94611h + ')';
    }
}
