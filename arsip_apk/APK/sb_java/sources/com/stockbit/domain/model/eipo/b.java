package com.stockbit.domain.model.eipo;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.stockbit.eipo.EipoEntryPoint;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f82100a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82101b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82102c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82103e;

    /* renamed from: f, reason: collision with root package name */
    public final String f82104f;

    /* renamed from: g, reason: collision with root package name */
    public final String f82105g;

    /* renamed from: h, reason: collision with root package name */
    public final double f82106h;

    /* renamed from: i, reason: collision with root package name */
    public final String f82107i;

    /* renamed from: j, reason: collision with root package name */
    public final String f82108j;

    /* renamed from: k, reason: collision with root package name */
    public final String f82109k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f82110l;

    /* renamed from: m, reason: collision with root package name */
    public final List f82111m;

    /* renamed from: n, reason: collision with root package name */
    public final List f82112n;

    /* renamed from: o, reason: collision with root package name */
    public final String f82113o;

    /* renamed from: p, reason: collision with root package name */
    public final String f82114p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f82115q;

    /* renamed from: r, reason: collision with root package name */
    public final int f82116r;

    /* renamed from: s, reason: collision with root package name */
    public final int f82117s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f82118t;

    /* renamed from: u, reason: collision with root package name */
    public final double f82119u;

    /* renamed from: v, reason: collision with root package name */
    public final a f82120v;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f82121a;

        /* renamed from: b, reason: collision with root package name */
        public final String f82122b;

        public a(String r2, String r3) {
            p.l(r2, "orderId");
            p.l(r3, "orderDateTime");
            this.f82121a = r2;
            this.f82122b = r3;
        }

        public final String a() {
            return this.f82122b;
        }

        public final String b() {
            return this.f82121a;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f82121a, r52.f82121a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f82122b, r52.f82122b) == true) goto L14;
            return false;
        L14:
            return true;
        }

        public int hashCode() {
            return (this.f82121a.hashCode() * 31) + this.f82122b.hashCode();
        }

        public String toString() {
            return "LatestOrder(orderId=" + this.f82121a + ", orderDateTime=" + this.f82122b + ")";
        }
    }

    /* renamed from: com.stockbit.domain.model.eipo.b$b, reason: collision with other inner class name */
    public static final class C0773b {

        /* renamed from: a, reason: collision with root package name */
        public final String f82123a;

        /* renamed from: b, reason: collision with root package name */
        public final String f82124b;

        /* renamed from: c, reason: collision with root package name */
        public final String f82125c;

        public C0773b(String r2, String r3, String r4) {
            p.l(r2, "code");
            p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
            this.f82123a = r2;
            this.f82124b = r3;
            this.f82125c = r4;
        }

        public final String a() {
            return this.f82123a;
        }

        public final String b() {
            return this.f82125c;
        }

        public final String c() {
            return this.f82124b;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof C0773b) == true) goto L8;
            return false;
        L8:
            C0773b r52 = (C0773b) r5;
            if (p.g(this.f82123a, r52.f82123a) == true) goto L12;
            return false;
        L12:
            if (p.g(this.f82124b, r52.f82124b) == true) goto L15;
            return false;
        L15:
            if (p.g(this.f82125c, r52.f82125c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            int r02 = ((this.f82123a.hashCode() * 31) + this.f82124b.hashCode()) * 31;
            String r1 = this.f82125c;
            if (r1 != null) goto L5;
            int r12 = 0;
        L7:
            return r02 + r12;
        L5:
            r12 = r1.hashCode();
            goto L7
        }

        public String toString() {
            return "Underwriter(code=" + this.f82123a + ", name=" + this.f82124b + ", color=" + this.f82125c + ")";
        }
    }

    public b(String r17, String r18, String r19, String r20, String r21, String r22, String r23, double r24, String r26, String r27, String r28, boolean r29, List r30, List r31, String r32, String r33, boolean r34, int r35, int r36, boolean r37, double r38, a r40) {
        p.l(r17, "companyAddress");
        p.l(r18, "companyBusinessLine");
        p.l(r19, "companyDescription");
        p.l(r20, "companyLogo");
        p.l(r21, "companyName");
        p.l(r22, "companySector");
        p.l(r23, "companyStockShares");
        p.l(r26, "companySubSector");
        p.l(r27, "companyWebsite");
        p.l(r28, EipoEntryPoint.EXTRA_EMITEN_CODE);
        p.l(r30, "participantAdmins");
        p.l(r31, "penjaminEmisi");
        p.l(r32, "prospectusFile");
        p.l(r33, "summaryProspectus");
        p.l(r40, "latestOrder");
        this.f82100a = r17;
        this.f82101b = r18;
        this.f82102c = r19;
        this.d = r20;
        this.f82103e = r21;
        this.f82104f = r22;
        this.f82105g = r23;
        this.f82106h = r24;
        this.f82107i = r26;
        this.f82108j = r27;
        this.f82109k = r28;
        this.f82110l = r29;
        this.f82111m = r30;
        this.f82112n = r31;
        this.f82113o = r32;
        this.f82114p = r33;
        this.f82115q = r34;
        this.f82116r = r35;
        this.f82117s = r36;
        this.f82118t = r37;
        this.f82119u = r38;
        this.f82120v = r40;
    }

    public final String a() {
        return this.f82100a;
    }

    public final String b() {
        return this.f82101b;
    }

    public final String c() {
        return this.f82102c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f82103e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (p.g(this.f82100a, r82.f82100a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82101b, r82.f82101b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82102c, r82.f82102c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f82103e, r82.f82103e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f82104f, r82.f82104f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f82105g, r82.f82105g) == true) goto L30;
        return false;
    L30:
        if (Double.compare(this.f82106h, r82.f82106h) == 0) goto L33;
        return false;
    L33:
        if (p.g(this.f82107i, r82.f82107i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f82108j, r82.f82108j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f82109k, r82.f82109k) == true) goto L42;
        return false;
    L42:
        if (this.f82110l == r82.f82110l) goto L45;
        return false;
    L45:
        if (p.g(this.f82111m, r82.f82111m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f82112n, r82.f82112n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f82113o, r82.f82113o) == true) goto L54;
        return false;
    L54:
        if (p.g(this.f82114p, r82.f82114p) == true) goto L57;
        return false;
    L57:
        if (this.f82115q == r82.f82115q) goto L60;
        return false;
    L60:
        if (this.f82116r == r82.f82116r) goto L63;
        return false;
    L63:
        if (this.f82117s == r82.f82117s) goto L66;
        return false;
    L66:
        if (this.f82118t == r82.f82118t) goto L69;
        return false;
    L69:
        if (Double.compare(this.f82119u, r82.f82119u) == 0) goto L72;
        return false;
    L72:
        if (p.g(this.f82120v, r82.f82120v) == true) goto L74;
        return false;
    L74:
        return true;
    }

    public final String f() {
        return this.f82104f;
    }

    public final String g() {
        return this.f82105g;
    }

    public final double h() {
        return this.f82106h;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((this.f82100a.hashCode() * 31) + this.f82101b.hashCode()) * 31) + this.f82102c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82103e.hashCode()) * 31) + this.f82104f.hashCode()) * 31) + this.f82105g.hashCode()) * 31) + Double.hashCode(this.f82106h)) * 31) + this.f82107i.hashCode()) * 31) + this.f82108j.hashCode()) * 31) + this.f82109k.hashCode()) * 31) + Boolean.hashCode(this.f82110l)) * 31) + this.f82111m.hashCode()) * 31) + this.f82112n.hashCode()) * 31) + this.f82113o.hashCode()) * 31) + this.f82114p.hashCode()) * 31) + Boolean.hashCode(this.f82115q)) * 31) + Integer.hashCode(this.f82116r)) * 31) + Integer.hashCode(this.f82117s)) * 31) + Boolean.hashCode(this.f82118t)) * 31) + Double.hashCode(this.f82119u)) * 31) + this.f82120v.hashCode();
    }

    public final String i() {
        return this.f82107i;
    }

    public final String j() {
        return this.f82108j;
    }

    public final String k() {
        return this.f82109k;
    }

    public final a l() {
        return this.f82120v;
    }

    public final double m() {
        return this.f82119u;
    }

    public final List n() {
        return this.f82111m;
    }

    public final List o() {
        return this.f82112n;
    }

    public final String p() {
        return this.f82113o;
    }

    public final String q() {
        return this.f82114p;
    }

    public final int r() {
        return this.f82116r;
    }

    public final int s() {
        return this.f82117s;
    }

    public final boolean t() {
        return this.f82118t;
    }

    public String toString() {
        return "EIpoCompanyDetailEntity(companyAddress=" + this.f82100a + ", companyBusinessLine=" + this.f82101b + ", companyDescription=" + this.f82102c + ", companyLogo=" + this.d + ", companyName=" + this.f82103e + ", companySector=" + this.f82104f + ", companyStockShares=" + this.f82105g + ", companyStockSharesPercentage=" + this.f82106h + ", companySubSector=" + this.f82107i + ", companyWebsite=" + this.f82108j + ", emitenCode=" + this.f82109k + ", isUnboxingImage=" + this.f82110l + ", participantAdmins=" + this.f82111m + ", penjaminEmisi=" + this.f82112n + ", prospectusFile=" + this.f82113o + ", summaryProspectus=" + this.f82114p + ", isWarrant=" + this.f82115q + ", warrantRatioFrom=" + this.f82116r + ", warrantRatioTo=" + this.f82117s + ", isSharia=" + this.f82118t + ", maxLot=" + this.f82119u + ", latestOrder=" + this.f82120v + ")";
    }

    public final boolean u() {
        return this.f82110l;
    }

    public final boolean v() {
        return this.f82115q;
    }
}
