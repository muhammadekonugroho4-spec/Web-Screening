package com.stockbit.usecase.search.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;

/* loaded from: classes2.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final long f159947a;

    /* renamed from: b, reason: collision with root package name */
    public final String f159948b;

    /* renamed from: c, reason: collision with root package name */
    public final String f159949c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f159950e;

    /* renamed from: f, reason: collision with root package name */
    public final String f159951f;

    /* renamed from: g, reason: collision with root package name */
    public final String f159952g;

    /* renamed from: h, reason: collision with root package name */
    public final CharSequence f159953h;

    /* renamed from: i, reason: collision with root package name */
    public final String f159954i;

    /* renamed from: j, reason: collision with root package name */
    public final String f159955j;

    /* renamed from: k, reason: collision with root package name */
    public final String f159956k;

    /* renamed from: l, reason: collision with root package name */
    public final String f159957l;

    /* renamed from: m, reason: collision with root package name */
    public final String f159958m;

    /* renamed from: n, reason: collision with root package name */
    public final String f159959n;

    /* renamed from: o, reason: collision with root package name */
    public final double f159960o;

    /* renamed from: p, reason: collision with root package name */
    public final String f159961p;

    /* renamed from: q, reason: collision with root package name */
    public final String f159962q;

    /* renamed from: r, reason: collision with root package name */
    public final B f159963r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f159964s;

    /* renamed from: t, reason: collision with root package name */
    public final String f159965t;

    /* renamed from: u, reason: collision with root package name */
    public final String f159966u;

    /* renamed from: v, reason: collision with root package name */
    public final a f159967v;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f159968a;

        /* renamed from: b, reason: collision with root package name */
        public final String f159969b;

        public a(String r2, String r3) {
            kotlin.jvm.internal.p.l(r2, "type");
            kotlin.jvm.internal.p.l(r3, Constants.ScionAnalytics.PARAM_LABEL);
            this.f159968a = r2;
            this.f159969b = r3;
        }

        public final String a() {
            return this.f159969b;
        }

        public final String b() {
            return this.f159968a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (kotlin.jvm.internal.p.g(this.f159968a, r52.f159968a) == true) goto L12;
            return false;
        L12:
            if (kotlin.jvm.internal.p.g(this.f159969b, r52.f159969b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f159968a.hashCode() * 31) + this.f159969b.hashCode();
        }

        public String toString() {
            return "Grouping(type=" + this.f159968a + ", label=" + this.f159969b + ")";
        }
    }

    public C(long r17, String r19, String r20, String r21, String r22, String r23, String r24, CharSequence r25, String r26, String r27, String r28, String r29, String r30, String r31, double r32, String r34, String r35, B r36, boolean r37, String r38, String r39, a r40) {
        kotlin.jvm.internal.p.l(r19, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r20, "country");
        kotlin.jvm.internal.p.l(r21, "type");
        kotlin.jvm.internal.p.l(r22, "symbol");
        kotlin.jvm.internal.p.l(r23, "symbol2");
        kotlin.jvm.internal.p.l(r24, "last");
        kotlin.jvm.internal.p.l(r25, "formattedPrice");
        kotlin.jvm.internal.p.l(r26, "change");
        kotlin.jvm.internal.p.l(r27, "percent");
        kotlin.jvm.internal.p.l(r28, "value");
        kotlin.jvm.internal.p.l(r29, "marketCap");
        kotlin.jvm.internal.p.l(r30, "valueMa20");
        kotlin.jvm.internal.p.l(r31, "companyStatus");
        kotlin.jvm.internal.p.l(r34, "iconUrl");
        kotlin.jvm.internal.p.l(r35, "formattedPercentage");
        kotlin.jvm.internal.p.l(r36, "dayTradeInfo");
        kotlin.jvm.internal.p.l(r38, "labelText");
        kotlin.jvm.internal.p.l(r39, "effectiveDate");
        this.f159947a = r17;
        this.f159948b = r19;
        this.f159949c = r20;
        this.d = r21;
        this.f159950e = r22;
        this.f159951f = r23;
        this.f159952g = r24;
        this.f159953h = r25;
        this.f159954i = r26;
        this.f159955j = r27;
        this.f159956k = r28;
        this.f159957l = r29;
        this.f159958m = r30;
        this.f159959n = r31;
        this.f159960o = r32;
        this.f159961p = r34;
        this.f159962q = r35;
        this.f159963r = r36;
        this.f159964s = r37;
        this.f159965t = r38;
        this.f159966u = r39;
        this.f159967v = r40;
    }

    public final String a() {
        return this.f159954i;
    }

    public final long b() {
        return this.f159947a;
    }

    public final String c() {
        return this.f159959n;
    }

    public final String d() {
        return this.f159949c;
    }

    public final B e() {
        return this.f159963r;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C) == true) goto L8;
        return false;
    L8:
        C r82 = (C) r8;
        if (this.f159947a == r82.f159947a) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f159948b, r82.f159948b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f159949c, r82.f159949c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f159950e, r82.f159950e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f159951f, r82.f159951f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f159952g, r82.f159952g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f159953h, r82.f159953h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f159954i, r82.f159954i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f159955j, r82.f159955j) == true) goto L39;
        return false;
    L39:
        if (kotlin.jvm.internal.p.g(this.f159956k, r82.f159956k) == true) goto L42;
        return false;
    L42:
        if (kotlin.jvm.internal.p.g(this.f159957l, r82.f159957l) == true) goto L45;
        return false;
    L45:
        if (kotlin.jvm.internal.p.g(this.f159958m, r82.f159958m) == true) goto L48;
        return false;
    L48:
        if (kotlin.jvm.internal.p.g(this.f159959n, r82.f159959n) == true) goto L51;
        return false;
    L51:
        if (Double.compare(this.f159960o, r82.f159960o) == 0) goto L54;
        return false;
    L54:
        if (kotlin.jvm.internal.p.g(this.f159961p, r82.f159961p) == true) goto L57;
        return false;
    L57:
        if (kotlin.jvm.internal.p.g(this.f159962q, r82.f159962q) == true) goto L60;
        return false;
    L60:
        if (kotlin.jvm.internal.p.g(this.f159963r, r82.f159963r) == true) goto L63;
        return false;
    L63:
        if (this.f159964s == r82.f159964s) goto L66;
        return false;
    L66:
        if (kotlin.jvm.internal.p.g(this.f159965t, r82.f159965t) == true) goto L69;
        return false;
    L69:
        if (kotlin.jvm.internal.p.g(this.f159966u, r82.f159966u) == true) goto L72;
        return false;
    L72:
        if (kotlin.jvm.internal.p.g(this.f159967v, r82.f159967v) == true) goto L74;
        return false;
    L74:
        return true;
    }

    public final String f() {
        return this.f159966u;
    }

    public final String g() {
        return this.f159962q;
    }

    public final CharSequence h() {
        return this.f159953h;
    }

    public int hashCode() {
        int r02 = ((((((((((((((((((((((((((((((((((((((((Long.hashCode(this.f159947a) * 31) + this.f159948b.hashCode()) * 31) + this.f159949c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f159950e.hashCode()) * 31) + this.f159951f.hashCode()) * 31) + this.f159952g.hashCode()) * 31) + this.f159953h.hashCode()) * 31) + this.f159954i.hashCode()) * 31) + this.f159955j.hashCode()) * 31) + this.f159956k.hashCode()) * 31) + this.f159957l.hashCode()) * 31) + this.f159958m.hashCode()) * 31) + this.f159959n.hashCode()) * 31) + Double.hashCode(this.f159960o)) * 31) + this.f159961p.hashCode()) * 31) + this.f159962q.hashCode()) * 31) + this.f159963r.hashCode()) * 31) + Boolean.hashCode(this.f159964s)) * 31) + this.f159965t.hashCode()) * 31) + this.f159966u.hashCode()) * 31;
        a r1 = this.f159967v;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final a i() {
        return this.f159967v;
    }

    public final String j() {
        return this.f159961p;
    }

    public final String k() {
        return this.f159965t;
    }

    public final String l() {
        return this.f159952g;
    }

    public final String m() {
        return this.f159957l;
    }

    public final String n() {
        return this.f159948b;
    }

    public final String o() {
        return this.f159955j;
    }

    public final double p() {
        return this.f159960o;
    }

    public final String q() {
        return this.f159950e;
    }

    public final String r() {
        return this.f159951f;
    }

    public final String s() {
        return this.d;
    }

    public final boolean t() {
        return this.f159964s;
    }

    public String toString() {
        return "SubSectorCompanyUIState(companyId=" + this.f159947a + ", name=" + this.f159948b + ", country=" + this.f159949c + ", type=" + this.d + ", symbol=" + this.f159950e + ", symbol2=" + this.f159951f + ", last=" + this.f159952g + ", formattedPrice=" + this.f159953h + ", change=" + this.f159954i + ", percent=" + this.f159955j + ", value=" + this.f159956k + ", marketCap=" + this.f159957l + ", valueMa20=" + this.f159958m + ", companyStatus=" + this.f159959n + ", priceChange=" + this.f159960o + ", iconUrl=" + this.f159961p + ", formattedPercentage=" + this.f159962q + ", dayTradeInfo=" + this.f159963r + ", uma=" + this.f159964s + ", labelText=" + this.f159965t + ", effectiveDate=" + this.f159966u + ", groupingBy=" + this.f159967v + ")";
    }

    public final String u() {
        return this.f159956k;
    }

    public final String v() {
        return this.f159958m;
    }
}
