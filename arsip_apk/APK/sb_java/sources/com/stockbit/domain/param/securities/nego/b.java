package com.stockbit.domain.param.securities.nego;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f87546a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87547b;

    /* renamed from: c, reason: collision with root package name */
    public final String f87548c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f87549e;

    /* renamed from: f, reason: collision with root package name */
    public final String f87550f;

    /* renamed from: g, reason: collision with root package name */
    public final String f87551g;

    /* renamed from: h, reason: collision with root package name */
    public final String f87552h;

    /* renamed from: i, reason: collision with root package name */
    public final String f87553i;

    /* renamed from: j, reason: collision with root package name */
    public final String f87554j;

    public b(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11) {
        p.l(r2, "faceMatchingToken");
        p.l(r3, "idemPotencyKey");
        p.l(r4, "assetCode");
        p.l(r5, "shares");
        p.l(r6, "counterPartyId");
        p.l(r7, "orderSide");
        p.l(r8, FirebaseAnalytics.Param.PRICE);
        p.l(r9, "orderVisibility");
        p.l(r10, "purpose");
        p.l(r11, "reason");
        this.f87546a = r2;
        this.f87547b = r3;
        this.f87548c = r4;
        this.d = r5;
        this.f87549e = r6;
        this.f87550f = r7;
        this.f87551g = r8;
        this.f87552h = r9;
        this.f87553i = r10;
        this.f87554j = r11;
    }

    public final String a() {
        return this.f87548c;
    }

    public final String b() {
        return this.f87549e;
    }

    public final String c() {
        return this.f87546a;
    }

    public final String d() {
        return this.f87547b;
    }

    public final String e() {
        return this.f87550f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f87546a, r52.f87546a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87547b, r52.f87547b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f87548c, r52.f87548c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f87549e, r52.f87549e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f87550f, r52.f87550f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f87551g, r52.f87551g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f87552h, r52.f87552h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f87553i, r52.f87553i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f87554j, r52.f87554j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.f87552h;
    }

    public final String g() {
        return this.f87551g;
    }

    public final String h() {
        return this.f87553i;
    }

    public int hashCode() {
        return (((((((((((((((((this.f87546a.hashCode() * 31) + this.f87547b.hashCode()) * 31) + this.f87548c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f87549e.hashCode()) * 31) + this.f87550f.hashCode()) * 31) + this.f87551g.hashCode()) * 31) + this.f87552h.hashCode()) * 31) + this.f87553i.hashCode()) * 31) + this.f87554j.hashCode();
    }

    public final String i() {
        return this.f87554j;
    }

    public final String j() {
        return this.d;
    }

    public String toString() {
        return "PostOrderNegoDomainParam(faceMatchingToken=" + this.f87546a + ", idemPotencyKey=" + this.f87547b + ", assetCode=" + this.f87548c + ", shares=" + this.d + ", counterPartyId=" + this.f87549e + ", orderSide=" + this.f87550f + ", price=" + this.f87551g + ", orderVisibility=" + this.f87552h + ", purpose=" + this.f87553i + ", reason=" + this.f87554j + ")";
    }
}
