package com.stockbit.domain.model.company.profile;

import java.math.BigDecimal;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f81823a;

    /* renamed from: b, reason: collision with root package name */
    public final BigDecimal f81824b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81825c;
    public final BigDecimal d;

    /* renamed from: e, reason: collision with root package name */
    public final BigDecimal f81826e;

    /* renamed from: f, reason: collision with root package name */
    public final BigDecimal f81827f;

    /* renamed from: g, reason: collision with root package name */
    public final String f81828g;

    /* renamed from: h, reason: collision with root package name */
    public final BigDecimal f81829h;

    /* renamed from: i, reason: collision with root package name */
    public final String f81830i;

    public h(String r2, BigDecimal r3, String r4, BigDecimal r5, BigDecimal r6, BigDecimal r7, String r8, BigDecimal r9, String r10) {
        p.l(r2, "listingDate");
        p.l(r3, "totalShares");
        p.l(r4, "exerciseEndDate");
        p.l(r5, "exercisePrice");
        p.l(r6, "numberOrSecurities");
        p.l(r7, "localPercentage");
        p.l(r8, "localPercentageFormatted");
        p.l(r9, "foreignPercentage");
        p.l(r10, "foreignPercentageFormatted");
        this.f81823a = r2;
        this.f81824b = r3;
        this.f81825c = r4;
        this.d = r5;
        this.f81826e = r6;
        this.f81827f = r7;
        this.f81828g = r8;
        this.f81829h = r9;
        this.f81830i = r10;
    }

    public final String a() {
        return this.f81825c;
    }

    public final BigDecimal b() {
        return this.d;
    }

    public final BigDecimal c() {
        return this.f81829h;
    }

    public final String d() {
        return this.f81830i;
    }

    public final String e() {
        return this.f81823a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (p.g(this.f81823a, r52.f81823a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81824b, r52.f81824b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81825c, r52.f81825c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f81826e, r52.f81826e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f81827f, r52.f81827f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f81828g, r52.f81828g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f81829h, r52.f81829h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f81830i, r52.f81830i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final BigDecimal f() {
        return this.f81827f;
    }

    public final String g() {
        return this.f81828g;
    }

    public final BigDecimal h() {
        return this.f81826e;
    }

    public int hashCode() {
        return (((((((((((((((this.f81823a.hashCode() * 31) + this.f81824b.hashCode()) * 31) + this.f81825c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f81826e.hashCode()) * 31) + this.f81827f.hashCode()) * 31) + this.f81828g.hashCode()) * 31) + this.f81829h.hashCode()) * 31) + this.f81830i.hashCode();
    }

    public final BigDecimal i() {
        return this.f81824b;
    }

    public String toString() {
        return "CompanyProfileListingInfoEntity(listingDate=" + this.f81823a + ", totalShares=" + this.f81824b + ", exerciseEndDate=" + this.f81825c + ", exercisePrice=" + this.d + ", numberOrSecurities=" + this.f81826e + ", localPercentage=" + this.f81827f + ", localPercentageFormatted=" + this.f81828g + ", foreignPercentage=" + this.f81829h + ", foreignPercentageFormatted=" + this.f81830i + ")";
    }
}
