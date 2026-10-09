package com.stockbit.domain.model.underwriter;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: A, reason: collision with root package name */
    public final double f86550A;

    /* renamed from: B, reason: collision with root package name */
    public final String f86551B;

    /* renamed from: C, reason: collision with root package name */
    public final long f86552C;

    /* renamed from: D, reason: collision with root package name */
    public final List f86553D;

    /* renamed from: a, reason: collision with root package name */
    public final String f86554a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86555b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86556c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final int f86557e;

    /* renamed from: f, reason: collision with root package name */
    public final String f86558f;

    /* renamed from: g, reason: collision with root package name */
    public final double f86559g;

    /* renamed from: h, reason: collision with root package name */
    public final String f86560h;

    /* renamed from: i, reason: collision with root package name */
    public final double f86561i;

    /* renamed from: j, reason: collision with root package name */
    public final String f86562j;

    /* renamed from: k, reason: collision with root package name */
    public final double f86563k;

    /* renamed from: l, reason: collision with root package name */
    public final String f86564l;

    /* renamed from: m, reason: collision with root package name */
    public final double f86565m;

    /* renamed from: n, reason: collision with root package name */
    public final String f86566n;

    /* renamed from: o, reason: collision with root package name */
    public final double f86567o;

    /* renamed from: p, reason: collision with root package name */
    public final String f86568p;

    /* renamed from: q, reason: collision with root package name */
    public final double f86569q;

    /* renamed from: r, reason: collision with root package name */
    public final String f86570r;

    /* renamed from: s, reason: collision with root package name */
    public final double f86571s;

    /* renamed from: t, reason: collision with root package name */
    public final String f86572t;

    /* renamed from: u, reason: collision with root package name */
    public final double f86573u;

    /* renamed from: v, reason: collision with root package name */
    public final String f86574v;

    /* renamed from: w, reason: collision with root package name */
    public final double f86575w;

    /* renamed from: x, reason: collision with root package name */
    public final String f86576x;

    /* renamed from: y, reason: collision with root package name */
    public final double f86577y;

    /* renamed from: z, reason: collision with root package name */
    public final String f86578z;

    public a(String r17, String r18, String r19, String r20, int r21, String r22, double r23, String r25, double r26, String r28, double r29, String r31, double r32, String r34, double r35, String r37, double r38, String r40, double r41, String r43, double r44, String r46, double r47, String r49, double r50, String r52, double r53, String r55, long r56, List r58) {
        p.l(r17, Constants.KEY_ID);
        p.l(r18, "symbol");
        p.l(r19, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r20, "logoUrl");
        p.l(r22, "return1dFormatted");
        p.l(r25, "return3dFormatted");
        p.l(r28, "return5dFormatted");
        p.l(r31, "return10dFormatted");
        p.l(r34, "return15dFormatted");
        p.l(r37, "return20dFormatted");
        p.l(r40, "returnSinceIpoFormatted");
        p.l(r43, "ipoPriceFormatted");
        p.l(r46, "lastPriceFormatted");
        p.l(r49, "fundRaisedFormatted");
        p.l(r52, "fundRaisedPctFormatted");
        p.l(r55, "listedDate");
        p.l(r58, "underwriters");
        this.f86554a = r17;
        this.f86555b = r18;
        this.f86556c = r19;
        this.d = r20;
        this.f86557e = r21;
        this.f86558f = r22;
        this.f86559g = r23;
        this.f86560h = r25;
        this.f86561i = r26;
        this.f86562j = r28;
        this.f86563k = r29;
        this.f86564l = r31;
        this.f86565m = r32;
        this.f86566n = r34;
        this.f86567o = r35;
        this.f86568p = r37;
        this.f86569q = r38;
        this.f86570r = r40;
        this.f86571s = r41;
        this.f86572t = r43;
        this.f86573u = r44;
        this.f86574v = r46;
        this.f86575w = r47;
        this.f86576x = r49;
        this.f86577y = r50;
        this.f86578z = r52;
        this.f86550A = r53;
        this.f86551B = r55;
        this.f86552C = r56;
        this.f86553D = r58;
    }

    public final double A() {
        return this.f86571s;
    }

    public final String B() {
        return this.f86555b;
    }

    public final List C() {
        return this.f86553D;
    }

    public final int a() {
        return this.f86557e;
    }

    public final String b() {
        return this.f86576x;
    }

    public final String c() {
        return this.f86578z;
    }

    public final double d() {
        return this.f86550A;
    }

    public final double e() {
        return this.f86577y;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f86554a, r82.f86554a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86555b, r82.f86555b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f86556c, r82.f86556c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (this.f86557e == r82.f86557e) goto L24;
        return false;
    L24:
        if (p.g(this.f86558f, r82.f86558f) == true) goto L27;
        return false;
    L27:
        if (Double.compare(this.f86559g, r82.f86559g) == 0) goto L30;
        return false;
    L30:
        if (p.g(this.f86560h, r82.f86560h) == true) goto L33;
        return false;
    L33:
        if (Double.compare(this.f86561i, r82.f86561i) == 0) goto L36;
        return false;
    L36:
        if (p.g(this.f86562j, r82.f86562j) == true) goto L39;
        return false;
    L39:
        if (Double.compare(this.f86563k, r82.f86563k) == 0) goto L42;
        return false;
    L42:
        if (p.g(this.f86564l, r82.f86564l) == true) goto L45;
        return false;
    L45:
        if (Double.compare(this.f86565m, r82.f86565m) == 0) goto L48;
        return false;
    L48:
        if (p.g(this.f86566n, r82.f86566n) == true) goto L51;
        return false;
    L51:
        if (Double.compare(this.f86567o, r82.f86567o) == 0) goto L54;
        return false;
    L54:
        if (p.g(this.f86568p, r82.f86568p) == true) goto L57;
        return false;
    L57:
        if (Double.compare(this.f86569q, r82.f86569q) == 0) goto L60;
        return false;
    L60:
        if (p.g(this.f86570r, r82.f86570r) == true) goto L63;
        return false;
    L63:
        if (Double.compare(this.f86571s, r82.f86571s) == 0) goto L66;
        return false;
    L66:
        if (p.g(this.f86572t, r82.f86572t) == true) goto L69;
        return false;
    L69:
        if (Double.compare(this.f86573u, r82.f86573u) == 0) goto L72;
        return false;
    L72:
        if (p.g(this.f86574v, r82.f86574v) == true) goto L75;
        return false;
    L75:
        if (Double.compare(this.f86575w, r82.f86575w) == 0) goto L78;
        return false;
    L78:
        if (p.g(this.f86576x, r82.f86576x) == true) goto L81;
        return false;
    L81:
        if (Double.compare(this.f86577y, r82.f86577y) == 0) goto L84;
        return false;
    L84:
        if (p.g(this.f86578z, r82.f86578z) == true) goto L87;
        return false;
    L87:
        if (Double.compare(this.f86550A, r82.f86550A) == 0) goto L90;
        return false;
    L90:
        if (p.g(this.f86551B, r82.f86551B) == true) goto L93;
        return false;
    L93:
        if (this.f86552C == r82.f86552C) goto L96;
        return false;
    L96:
        if (p.g(this.f86553D, r82.f86553D) == true) goto L98;
        return false;
    L98:
        return true;
    }

    public final String f() {
        return this.f86572t;
    }

    public final double g() {
        return this.f86573u;
    }

    public final String h() {
        return this.f86574v;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.f86554a.hashCode() * 31) + this.f86555b.hashCode()) * 31) + this.f86556c.hashCode()) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.f86557e)) * 31) + this.f86558f.hashCode()) * 31) + Double.hashCode(this.f86559g)) * 31) + this.f86560h.hashCode()) * 31) + Double.hashCode(this.f86561i)) * 31) + this.f86562j.hashCode()) * 31) + Double.hashCode(this.f86563k)) * 31) + this.f86564l.hashCode()) * 31) + Double.hashCode(this.f86565m)) * 31) + this.f86566n.hashCode()) * 31) + Double.hashCode(this.f86567o)) * 31) + this.f86568p.hashCode()) * 31) + Double.hashCode(this.f86569q)) * 31) + this.f86570r.hashCode()) * 31) + Double.hashCode(this.f86571s)) * 31) + this.f86572t.hashCode()) * 31) + Double.hashCode(this.f86573u)) * 31) + this.f86574v.hashCode()) * 31) + Double.hashCode(this.f86575w)) * 31) + this.f86576x.hashCode()) * 31) + Double.hashCode(this.f86577y)) * 31) + this.f86578z.hashCode()) * 31) + Double.hashCode(this.f86550A)) * 31) + this.f86551B.hashCode()) * 31) + Long.hashCode(this.f86552C)) * 31) + this.f86553D.hashCode();
    }

    public final double i() {
        return this.f86575w;
    }

    public final String j() {
        return this.f86551B;
    }

    public final long k() {
        return this.f86552C;
    }

    public final String l() {
        return this.d;
    }

    public final String m() {
        return this.f86556c;
    }

    public final String n() {
        return this.f86564l;
    }

    public final double o() {
        return this.f86565m;
    }

    public final String p() {
        return this.f86566n;
    }

    public final double q() {
        return this.f86567o;
    }

    public final String r() {
        return this.f86558f;
    }

    public final double s() {
        return this.f86559g;
    }

    public final String t() {
        return this.f86568p;
    }

    public String toString() {
        return "CompanyIpoPerformanceEntity(id=" + this.f86554a + ", symbol=" + this.f86555b + ", name=" + this.f86556c + ", logoUrl=" + this.d + ", araStreak=" + this.f86557e + ", return1dFormatted=" + this.f86558f + ", return1dRaw=" + this.f86559g + ", return3dFormatted=" + this.f86560h + ", return3dRaw=" + this.f86561i + ", return5dFormatted=" + this.f86562j + ", return5dRaw=" + this.f86563k + ", return10dFormatted=" + this.f86564l + ", return10dRaw=" + this.f86565m + ", return15dFormatted=" + this.f86566n + ", return15dRaw=" + this.f86567o + ", return20dFormatted=" + this.f86568p + ", return20dRaw=" + this.f86569q + ", returnSinceIpoFormatted=" + this.f86570r + ", returnSinceIpoRaw=" + this.f86571s + ", ipoPriceFormatted=" + this.f86572t + ", ipoPriceRaw=" + this.f86573u + ", lastPriceFormatted=" + this.f86574v + ", lastPriceRaw=" + this.f86575w + ", fundRaisedFormatted=" + this.f86576x + ", fundRaisedRaw=" + this.f86577y + ", fundRaisedPctFormatted=" + this.f86578z + ", fundRaisedPctRaw=" + this.f86550A + ", listedDate=" + this.f86551B + ", listedDateEpoch=" + this.f86552C + ", underwriters=" + this.f86553D + ")";
    }

    public final double u() {
        return this.f86569q;
    }

    public final String v() {
        return this.f86560h;
    }

    public final double w() {
        return this.f86561i;
    }

    public final String x() {
        return this.f86562j;
    }

    public final double y() {
        return this.f86563k;
    }

    public final String z() {
        return this.f86570r;
    }
}
