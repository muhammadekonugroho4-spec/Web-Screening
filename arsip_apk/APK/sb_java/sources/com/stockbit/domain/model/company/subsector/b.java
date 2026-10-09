package com.stockbit.domain.model.company.subsector;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: A, reason: collision with root package name */
    public final String f81947A;

    /* renamed from: B, reason: collision with root package name */
    public final String f81948B;

    /* renamed from: C, reason: collision with root package name */
    public final a f81949C;

    /* renamed from: a, reason: collision with root package name */
    public final long f81950a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81951b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81952c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f81953e;

    /* renamed from: f, reason: collision with root package name */
    public final String f81954f;

    /* renamed from: g, reason: collision with root package name */
    public final String f81955g;

    /* renamed from: h, reason: collision with root package name */
    public final long f81956h;

    /* renamed from: i, reason: collision with root package name */
    public final String f81957i;

    /* renamed from: j, reason: collision with root package name */
    public final String f81958j;

    /* renamed from: k, reason: collision with root package name */
    public final String f81959k;

    /* renamed from: l, reason: collision with root package name */
    public final String f81960l;

    /* renamed from: m, reason: collision with root package name */
    public final String f81961m;

    /* renamed from: n, reason: collision with root package name */
    public final String f81962n;

    /* renamed from: o, reason: collision with root package name */
    public final String f81963o;

    /* renamed from: p, reason: collision with root package name */
    public final String f81964p;

    /* renamed from: q, reason: collision with root package name */
    public final String f81965q;

    /* renamed from: r, reason: collision with root package name */
    public final int f81966r;

    /* renamed from: s, reason: collision with root package name */
    public final String f81967s;

    /* renamed from: t, reason: collision with root package name */
    public final double f81968t;

    /* renamed from: u, reason: collision with root package name */
    public final String f81969u;

    /* renamed from: v, reason: collision with root package name */
    public final String f81970v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f81971w;

    /* renamed from: x, reason: collision with root package name */
    public final com.stockbit.domain.model.company.subsector.a f81972x;

    /* renamed from: y, reason: collision with root package name */
    public final c f81973y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f81974z;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f81975a;

        /* renamed from: b, reason: collision with root package name */
        public final String f81976b;

        public a(String r2, String r3) {
            p.l(r2, "type");
            p.l(r3, Constants.ScionAnalytics.PARAM_LABEL);
            this.f81975a = r2;
            this.f81976b = r3;
        }

        public final String a() {
            return this.f81976b;
        }

        public final String b() {
            return this.f81975a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f81975a, r52.f81975a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f81976b, r52.f81976b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f81975a.hashCode() * 31) + this.f81976b.hashCode();
        }

        public String toString() {
            return "Grouping(type=" + this.f81975a + ", label=" + this.f81976b + ")";
        }
    }

    public b(long r17, String r19, String r20, String r21, String r22, String r23, String r24, long r25, String r27, String r28, String r29, String r30, String r31, String r32, String r33, String r34, String r35, int r36, String r37, double r38, String r40, String r41, boolean r42, com.stockbit.domain.model.company.subsector.a r43, c r44, boolean r45, String r46, String r47, a r48) {
        p.l(r19, "country");
        p.l(r20, "type");
        p.l(r21, "symbol");
        p.l(r22, "symbol2");
        p.l(r23, "symbol3");
        p.l(r24, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r27, "last");
        p.l(r28, "formattedPrice");
        p.l(r29, "change");
        p.l(r30, "percent");
        p.l(r31, "volume");
        p.l(r32, "value");
        p.l(r33, "avgVolume");
        p.l(r34, "marketCap");
        p.l(r35, "followers");
        p.l(r37, "valueMa20");
        p.l(r40, "companyStatus");
        p.l(r41, "iconUrl");
        p.l(r43, "dayTradeInfo");
        p.l(r44, "extraAttributes");
        p.l(r46, "labelText");
        p.l(r47, "effectiveDate");
        this.f81950a = r17;
        this.f81951b = r19;
        this.f81952c = r20;
        this.d = r21;
        this.f81953e = r22;
        this.f81954f = r23;
        this.f81955g = r24;
        this.f81956h = r25;
        this.f81957i = r27;
        this.f81958j = r28;
        this.f81959k = r29;
        this.f81960l = r30;
        this.f81961m = r31;
        this.f81962n = r32;
        this.f81963o = r33;
        this.f81964p = r34;
        this.f81965q = r35;
        this.f81966r = r36;
        this.f81967s = r37;
        this.f81968t = r38;
        this.f81969u = r40;
        this.f81970v = r41;
        this.f81971w = r42;
        this.f81972x = r43;
        this.f81973y = r44;
        this.f81974z = r45;
        this.f81947A = r46;
        this.f81948B = r47;
        this.f81949C = r48;
    }

    public final String a() {
        return this.f81959k;
    }

    public final long b() {
        return this.f81950a;
    }

    public final String c() {
        return this.f81969u;
    }

    public final String d() {
        return this.f81951b;
    }

    public final com.stockbit.domain.model.company.subsector.a e() {
        return this.f81972x;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (this.f81950a == r82.f81950a) goto L12;
        return false;
    L12:
        if (p.g(this.f81951b, r82.f81951b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81952c, r82.f81952c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f81953e, r82.f81953e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f81954f, r82.f81954f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f81955g, r82.f81955g) == true) goto L30;
        return false;
    L30:
        if (this.f81956h == r82.f81956h) goto L33;
        return false;
    L33:
        if (p.g(this.f81957i, r82.f81957i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f81958j, r82.f81958j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f81959k, r82.f81959k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f81960l, r82.f81960l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f81961m, r82.f81961m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f81962n, r82.f81962n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f81963o, r82.f81963o) == true) goto L54;
        return false;
    L54:
        if (p.g(this.f81964p, r82.f81964p) == true) goto L57;
        return false;
    L57:
        if (p.g(this.f81965q, r82.f81965q) == true) goto L60;
        return false;
    L60:
        if (this.f81966r == r82.f81966r) goto L63;
        return false;
    L63:
        if (p.g(this.f81967s, r82.f81967s) == true) goto L66;
        return false;
    L66:
        if (Double.compare(this.f81968t, r82.f81968t) == 0) goto L69;
        return false;
    L69:
        if (p.g(this.f81969u, r82.f81969u) == true) goto L72;
        return false;
    L72:
        if (p.g(this.f81970v, r82.f81970v) == true) goto L75;
        return false;
    L75:
        if (this.f81971w == r82.f81971w) goto L78;
        return false;
    L78:
        if (p.g(this.f81972x, r82.f81972x) == true) goto L81;
        return false;
    L81:
        if (p.g(this.f81973y, r82.f81973y) == true) goto L84;
        return false;
    L84:
        if (this.f81974z == r82.f81974z) goto L87;
        return false;
    L87:
        if (p.g(this.f81947A, r82.f81947A) == true) goto L90;
        return false;
    L90:
        if (p.g(this.f81948B, r82.f81948B) == true) goto L93;
        return false;
    L93:
        if (p.g(this.f81949C, r82.f81949C) == true) goto L95;
        return false;
    L95:
        return true;
    }

    public final String f() {
        return this.f81948B;
    }

    public final c g() {
        return this.f81973y;
    }

    public final String h() {
        return this.f81958j;
    }

    public int hashCode() {
        int r02 = ((((((((((((((((((((((((((((((((((((((((((((((((((((((Long.hashCode(this.f81950a) * 31) + this.f81951b.hashCode()) * 31) + this.f81952c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f81953e.hashCode()) * 31) + this.f81954f.hashCode()) * 31) + this.f81955g.hashCode()) * 31) + Long.hashCode(this.f81956h)) * 31) + this.f81957i.hashCode()) * 31) + this.f81958j.hashCode()) * 31) + this.f81959k.hashCode()) * 31) + this.f81960l.hashCode()) * 31) + this.f81961m.hashCode()) * 31) + this.f81962n.hashCode()) * 31) + this.f81963o.hashCode()) * 31) + this.f81964p.hashCode()) * 31) + this.f81965q.hashCode()) * 31) + Integer.hashCode(this.f81966r)) * 31) + this.f81967s.hashCode()) * 31) + Double.hashCode(this.f81968t)) * 31) + this.f81969u.hashCode()) * 31) + this.f81970v.hashCode()) * 31) + Boolean.hashCode(this.f81971w)) * 31) + this.f81972x.hashCode()) * 31) + this.f81973y.hashCode()) * 31) + Boolean.hashCode(this.f81974z)) * 31) + this.f81947A.hashCode()) * 31) + this.f81948B.hashCode()) * 31;
        a r1 = this.f81949C;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final a i() {
        return this.f81949C;
    }

    public final String j() {
        return this.f81970v;
    }

    public final String k() {
        return this.f81947A;
    }

    public final String l() {
        return this.f81957i;
    }

    public final String m() {
        return this.f81964p;
    }

    public final String n() {
        return this.f81955g;
    }

    public final String o() {
        return this.f81960l;
    }

    public final String p() {
        return this.d;
    }

    public final String q() {
        return this.f81953e;
    }

    public final String r() {
        return this.f81952c;
    }

    public final boolean s() {
        return this.f81974z;
    }

    public final String t() {
        return this.f81962n;
    }

    public String toString() {
        return "SubSectorCompanyEntity(companyId=" + this.f81950a + ", country=" + this.f81951b + ", type=" + this.f81952c + ", symbol=" + this.d + ", symbol2=" + this.f81953e + ", symbol3=" + this.f81954f + ", name=" + this.f81955g + ", tradeable=" + this.f81956h + ", last=" + this.f81957i + ", formattedPrice=" + this.f81958j + ", change=" + this.f81959k + ", percent=" + this.f81960l + ", volume=" + this.f81961m + ", value=" + this.f81962n + ", avgVolume=" + this.f81963o + ", marketCap=" + this.f81964p + ", followers=" + this.f81965q + ", followed=" + this.f81966r + ", valueMa20=" + this.f81967s + ", popularity=" + this.f81968t + ", companyStatus=" + this.f81969u + ", iconUrl=" + this.f81970v + ", isExists=" + this.f81971w + ", dayTradeInfo=" + this.f81972x + ", extraAttributes=" + this.f81973y + ", uma=" + this.f81974z + ", labelText=" + this.f81947A + ", effectiveDate=" + this.f81948B + ", groupingBy=" + this.f81949C + ")";
    }

    public final String u() {
        return this.f81967s;
    }
}
