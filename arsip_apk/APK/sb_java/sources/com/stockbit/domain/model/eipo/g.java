package com.stockbit.domain.model.eipo;

import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f82148a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82149b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82150c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82151e;

    /* renamed from: f, reason: collision with root package name */
    public final String f82152f;

    /* renamed from: g, reason: collision with root package name */
    public final String f82153g;

    /* renamed from: h, reason: collision with root package name */
    public final String f82154h;

    /* renamed from: i, reason: collision with root package name */
    public final String f82155i;

    /* renamed from: j, reason: collision with root package name */
    public final String f82156j;

    /* renamed from: k, reason: collision with root package name */
    public final String f82157k;

    /* renamed from: l, reason: collision with root package name */
    public final int f82158l;

    /* renamed from: m, reason: collision with root package name */
    public final String f82159m;

    /* renamed from: n, reason: collision with root package name */
    public final String f82160n;

    /* renamed from: o, reason: collision with root package name */
    public final String f82161o;

    /* renamed from: p, reason: collision with root package name */
    public final String f82162p;

    /* renamed from: q, reason: collision with root package name */
    public final String f82163q;

    /* renamed from: r, reason: collision with root package name */
    public final double f82164r;

    /* renamed from: s, reason: collision with root package name */
    public final double f82165s;

    /* renamed from: t, reason: collision with root package name */
    public final String f82166t;

    public g(String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, int r28, String r29, String r30, String r31, String r32, String r33, double r34, double r36, String r38) {
        p.l(r17, "orderId");
        p.l(r18, FirebaseAnalytics.Param.QUANTITY);
        p.l(r19, FirebaseAnalytics.Param.PRICE);
        p.l(r20, "total");
        p.l(r21, "stageDisplay");
        p.l(r22, "statusDisplay");
        p.l(r23, "orderDate");
        p.l(r24, "origin");
        p.l(r25, "orderType");
        p.l(r26, "orderTypeDisplay");
        p.l(r27, "offeringQuantity");
        p.l(r29, "stage");
        p.l(r30, "orderStage");
        p.l(r31, "orderStageDisplay");
        p.l(r32, NotificationCompat.CATEGORY_STATUS);
        p.l(r33, "originDisplay");
        p.l(r38, "eipoBrokerPortalId");
        this.f82148a = r17;
        this.f82149b = r18;
        this.f82150c = r19;
        this.d = r20;
        this.f82151e = r21;
        this.f82152f = r22;
        this.f82153g = r23;
        this.f82154h = r24;
        this.f82155i = r25;
        this.f82156j = r26;
        this.f82157k = r27;
        this.f82158l = r28;
        this.f82159m = r29;
        this.f82160n = r30;
        this.f82161o = r31;
        this.f82162p = r32;
        this.f82163q = r33;
        this.f82164r = r34;
        this.f82165s = r36;
        this.f82166t = r38;
    }

    public final double a() {
        return this.f82165s;
    }

    public final String b() {
        return this.f82166t;
    }

    public final String c() {
        return this.f82157k;
    }

    public final String d() {
        return this.f82153g;
    }

    public final String e() {
        return this.f82148a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof g) == true) goto L8;
        return false;
    L8:
        g r82 = (g) r8;
        if (p.g(this.f82148a, r82.f82148a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82149b, r82.f82149b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82150c, r82.f82150c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f82151e, r82.f82151e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f82152f, r82.f82152f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f82153g, r82.f82153g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f82154h, r82.f82154h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f82155i, r82.f82155i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f82156j, r82.f82156j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f82157k, r82.f82157k) == true) goto L42;
        return false;
    L42:
        if (this.f82158l == r82.f82158l) goto L45;
        return false;
    L45:
        if (p.g(this.f82159m, r82.f82159m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f82160n, r82.f82160n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f82161o, r82.f82161o) == true) goto L54;
        return false;
    L54:
        if (p.g(this.f82162p, r82.f82162p) == true) goto L57;
        return false;
    L57:
        if (p.g(this.f82163q, r82.f82163q) == true) goto L60;
        return false;
    L60:
        if (Double.compare(this.f82164r, r82.f82164r) == 0) goto L63;
        return false;
    L63:
        if (Double.compare(this.f82165s, r82.f82165s) == 0) goto L66;
        return false;
    L66:
        if (p.g(this.f82166t, r82.f82166t) == true) goto L68;
        return false;
    L68:
        return true;
    }

    public final String f() {
        return this.f82160n;
    }

    public final String g() {
        return this.f82161o;
    }

    public final String h() {
        return this.f82155i;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((this.f82148a.hashCode() * 31) + this.f82149b.hashCode()) * 31) + this.f82150c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82151e.hashCode()) * 31) + this.f82152f.hashCode()) * 31) + this.f82153g.hashCode()) * 31) + this.f82154h.hashCode()) * 31) + this.f82155i.hashCode()) * 31) + this.f82156j.hashCode()) * 31) + this.f82157k.hashCode()) * 31) + Integer.hashCode(this.f82158l)) * 31) + this.f82159m.hashCode()) * 31) + this.f82160n.hashCode()) * 31) + this.f82161o.hashCode()) * 31) + this.f82162p.hashCode()) * 31) + this.f82163q.hashCode()) * 31) + Double.hashCode(this.f82164r)) * 31) + Double.hashCode(this.f82165s)) * 31) + this.f82166t.hashCode();
    }

    public final String i() {
        return this.f82156j;
    }

    public final String j() {
        return this.f82154h;
    }

    public final String k() {
        return this.f82163q;
    }

    public final String l() {
        return this.f82150c;
    }

    public final String m() {
        return this.f82149b;
    }

    public final String n() {
        return this.f82162p;
    }

    public final String o() {
        return this.f82152f;
    }

    public final String p() {
        return this.d;
    }

    public final double q() {
        return this.f82164r;
    }

    public String toString() {
        return "EIpoOrderDetailEntity(orderId=" + this.f82148a + ", quantity=" + this.f82149b + ", price=" + this.f82150c + ", total=" + this.d + ", stageDisplay=" + this.f82151e + ", statusDisplay=" + this.f82152f + ", orderDate=" + this.f82153g + ", origin=" + this.f82154h + ", orderType=" + this.f82155i + ", orderTypeDisplay=" + this.f82156j + ", offeringQuantity=" + this.f82157k + ", allotmentPercentage=" + this.f82158l + ", stage=" + this.f82159m + ", orderStage=" + this.f82160n + ", orderStageDisplay=" + this.f82161o + ", status=" + this.f82162p + ", originDisplay=" + this.f82163q + ", warrant=" + this.f82164r + ", allotmentPercentageDecimal=" + this.f82165s + ", eipoBrokerPortalId=" + this.f82166t + ")";
    }
}
