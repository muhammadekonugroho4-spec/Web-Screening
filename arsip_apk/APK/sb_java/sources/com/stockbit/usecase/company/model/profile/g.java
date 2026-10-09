package com.stockbit.usecase.company.model.profile;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f156492a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156493b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156494c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final BigDecimal f156495e;

    /* renamed from: f, reason: collision with root package name */
    public final String f156496f;

    /* renamed from: g, reason: collision with root package name */
    public final BigDecimal f156497g;

    /* renamed from: h, reason: collision with root package name */
    public final String f156498h;

    /* renamed from: i, reason: collision with root package name */
    public final BigDecimal f156499i;

    /* renamed from: j, reason: collision with root package name */
    public final String f156500j;

    public g(String r2, String r3, String r4, String r5, BigDecimal r6, String r7, BigDecimal r8, String r9, BigDecimal r10, String r11) {
        p.l(r2, "listingDate");
        p.l(r3, "totalShares");
        p.l(r4, "tradingEndDate");
        p.l(r5, FirebaseAnalytics.Param.PRICE);
        p.l(r6, "numberOfSecurities");
        p.l(r7, "numberOfSecuritiesFormatted");
        p.l(r8, "localPercentage");
        p.l(r9, "localPercentageFormatted");
        p.l(r10, "foreignPercentage");
        p.l(r11, "foreignPercentageFormatted");
        this.f156492a = r2;
        this.f156493b = r3;
        this.f156494c = r4;
        this.d = r5;
        this.f156495e = r6;
        this.f156496f = r7;
        this.f156497g = r8;
        this.f156498h = r9;
        this.f156499i = r10;
        this.f156500j = r11;
    }

    public final BigDecimal a() {
        return this.f156499i;
    }

    public final String b() {
        return this.f156500j;
    }

    public final String c() {
        return this.f156492a;
    }

    public final BigDecimal d() {
        return this.f156497g;
    }

    public final String e() {
        return this.f156498h;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f156492a, r52.f156492a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156493b, r52.f156493b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f156494c, r52.f156494c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f156495e, r52.f156495e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f156496f, r52.f156496f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f156497g, r52.f156497g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f156498h, r52.f156498h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f156499i, r52.f156499i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f156500j, r52.f156500j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final BigDecimal f() {
        return this.f156495e;
    }

    public final String g() {
        return this.f156496f;
    }

    public final String h() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((((((((((this.f156492a.hashCode() * 31) + this.f156493b.hashCode()) * 31) + this.f156494c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f156495e.hashCode()) * 31) + this.f156496f.hashCode()) * 31) + this.f156497g.hashCode()) * 31) + this.f156498h.hashCode()) * 31) + this.f156499i.hashCode()) * 31) + this.f156500j.hashCode();
    }

    public final String i() {
        return this.f156493b;
    }

    public final String j() {
        return this.f156494c;
    }

    public String toString() {
        return "CompanyProfileListingInfoUIState(listingDate=" + this.f156492a + ", totalShares=" + this.f156493b + ", tradingEndDate=" + this.f156494c + ", price=" + this.d + ", numberOfSecurities=" + this.f156495e + ", numberOfSecuritiesFormatted=" + this.f156496f + ", localPercentage=" + this.f156497g + ", localPercentageFormatted=" + this.f156498h + ", foreignPercentage=" + this.f156499i + ", foreignPercentageFormatted=" + this.f156500j + ")";
    }
}
