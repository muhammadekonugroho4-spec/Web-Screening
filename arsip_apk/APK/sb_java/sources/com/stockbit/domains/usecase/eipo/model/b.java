package com.stockbit.domains.usecase.eipo.model;

import com.stockbit.domains.usecase.eipo.model.a;
import com.stockbit.eipo.EipoEntryPoint;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f88218a;

    /* renamed from: b, reason: collision with root package name */
    public final String f88219b;

    /* renamed from: c, reason: collision with root package name */
    public final String f88220c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f88221e;

    /* renamed from: f, reason: collision with root package name */
    public final String f88222f;

    /* renamed from: g, reason: collision with root package name */
    public final String f88223g;

    /* renamed from: h, reason: collision with root package name */
    public final String f88224h;

    /* renamed from: i, reason: collision with root package name */
    public final String f88225i;

    /* renamed from: j, reason: collision with root package name */
    public final String f88226j;

    /* renamed from: k, reason: collision with root package name */
    public final String f88227k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f88228l;

    /* renamed from: m, reason: collision with root package name */
    public final a.b f88229m;

    /* renamed from: n, reason: collision with root package name */
    public final List f88230n;

    /* renamed from: o, reason: collision with root package name */
    public final String f88231o;

    /* renamed from: p, reason: collision with root package name */
    public final String f88232p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f88233q;

    /* renamed from: r, reason: collision with root package name */
    public final String f88234r;

    public b(String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, boolean r28, a.b r29, List r30, String r31, String r32, boolean r33, String r34) {
        p.l(r17, "companyAddress");
        p.l(r18, "companyBusinessLine");
        p.l(r19, "companyDescription");
        p.l(r20, "companyLogo");
        p.l(r21, "companyName");
        p.l(r22, "companySector");
        p.l(r23, "companyStockShares");
        p.l(r24, "companyStockSharesPercentage");
        p.l(r25, "companySubSector");
        p.l(r26, "companyWebsite");
        p.l(r27, EipoEntryPoint.EXTRA_EMITEN_CODE);
        p.l(r29, "participantAdmin");
        p.l(r30, "penjaminEmisi");
        p.l(r31, "prospectusFile");
        p.l(r32, "summaryProspectus");
        p.l(r34, "warrantRatio");
        this.f88218a = r17;
        this.f88219b = r18;
        this.f88220c = r19;
        this.d = r20;
        this.f88221e = r21;
        this.f88222f = r22;
        this.f88223g = r23;
        this.f88224h = r24;
        this.f88225i = r25;
        this.f88226j = r26;
        this.f88227k = r27;
        this.f88228l = r28;
        this.f88229m = r29;
        this.f88230n = r30;
        this.f88231o = r31;
        this.f88232p = r32;
        this.f88233q = r33;
        this.f88234r = r34;
    }

    public final String a() {
        return this.f88218a;
    }

    public final String b() {
        return this.f88219b;
    }

    public final String c() {
        return this.f88220c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f88221e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f88218a, r52.f88218a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f88219b, r52.f88219b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f88220c, r52.f88220c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f88221e, r52.f88221e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f88222f, r52.f88222f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f88223g, r52.f88223g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f88224h, r52.f88224h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f88225i, r52.f88225i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f88226j, r52.f88226j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f88227k, r52.f88227k) == true) goto L42;
        return false;
    L42:
        if (this.f88228l == r52.f88228l) goto L45;
        return false;
    L45:
        if (p.g(this.f88229m, r52.f88229m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f88230n, r52.f88230n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f88231o, r52.f88231o) == true) goto L54;
        return false;
    L54:
        if (p.g(this.f88232p, r52.f88232p) == true) goto L57;
        return false;
    L57:
        if (this.f88233q == r52.f88233q) goto L60;
        return false;
    L60:
        if (p.g(this.f88234r, r52.f88234r) == true) goto L62;
        return false;
    L62:
        return true;
    }

    public final String f() {
        return this.f88222f;
    }

    public final String g() {
        return this.f88223g;
    }

    public final String h() {
        return this.f88224h;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.f88218a.hashCode() * 31) + this.f88219b.hashCode()) * 31) + this.f88220c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f88221e.hashCode()) * 31) + this.f88222f.hashCode()) * 31) + this.f88223g.hashCode()) * 31) + this.f88224h.hashCode()) * 31) + this.f88225i.hashCode()) * 31) + this.f88226j.hashCode()) * 31) + this.f88227k.hashCode()) * 31) + Boolean.hashCode(this.f88228l)) * 31) + this.f88229m.hashCode()) * 31) + this.f88230n.hashCode()) * 31) + this.f88231o.hashCode()) * 31) + this.f88232p.hashCode()) * 31) + Boolean.hashCode(this.f88233q)) * 31) + this.f88234r.hashCode();
    }

    public final String i() {
        return this.f88225i;
    }

    public final String j() {
        return this.f88226j;
    }

    public final String k() {
        return this.f88227k;
    }

    public final a.b l() {
        return this.f88229m;
    }

    public final List m() {
        return this.f88230n;
    }

    public final String n() {
        return this.f88231o;
    }

    public final String o() {
        return this.f88232p;
    }

    public final String p() {
        return this.f88234r;
    }

    public final boolean q() {
        return this.f88228l;
    }

    public final boolean r() {
        return this.f88233q;
    }

    public String toString() {
        return "EIpoCompanyDetailUIState(companyAddress=" + this.f88218a + ", companyBusinessLine=" + this.f88219b + ", companyDescription=" + this.f88220c + ", companyLogo=" + this.d + ", companyName=" + this.f88221e + ", companySector=" + this.f88222f + ", companyStockShares=" + this.f88223g + ", companyStockSharesPercentage=" + this.f88224h + ", companySubSector=" + this.f88225i + ", companyWebsite=" + this.f88226j + ", emitenCode=" + this.f88227k + ", isUnboxingImageEnabled=" + this.f88228l + ", participantAdmin=" + this.f88229m + ", penjaminEmisi=" + this.f88230n + ", prospectusFile=" + this.f88231o + ", summaryProspectus=" + this.f88232p + ", isWarrantRatioVisible=" + this.f88233q + ", warrantRatio=" + this.f88234r + ")";
    }
}
