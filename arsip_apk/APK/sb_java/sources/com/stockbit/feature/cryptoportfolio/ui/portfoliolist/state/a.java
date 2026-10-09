package com.stockbit.feature.cryptoportfolio.ui.portfoliolist.state;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f94977a;

    /* renamed from: b, reason: collision with root package name */
    public final String f94978b;

    /* renamed from: c, reason: collision with root package name */
    public final String f94979c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f94980e;

    /* renamed from: f, reason: collision with root package name */
    public final String f94981f;

    /* renamed from: g, reason: collision with root package name */
    public final String f94982g;

    /* renamed from: h, reason: collision with root package name */
    public final String f94983h;

    /* renamed from: i, reason: collision with root package name */
    public final String f94984i;

    /* renamed from: j, reason: collision with root package name */
    public final Boolean f94985j;

    /* renamed from: k, reason: collision with root package name */
    public final float f94986k;

    static {
    }

    public a(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, Boolean r11, float r12) {
        p.l(r2, "symbol");
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "logoUrl");
        p.l(r5, "quantityFormatted");
        p.l(r6, "averagePriceFormatted");
        p.l(r7, "lastPriceFormatted");
        p.l(r8, "marketValueFormatted");
        p.l(r9, "gainLossFormatted");
        p.l(r10, "gainLossPercentFormatted");
        this.f94977a = r2;
        this.f94978b = r3;
        this.f94979c = r4;
        this.d = r5;
        this.f94980e = r6;
        this.f94981f = r7;
        this.f94982g = r8;
        this.f94983h = r9;
        this.f94984i = r10;
        this.f94985j = r11;
        this.f94986k = r12;
    }

    public final String a() {
        return this.f94980e;
    }

    public final String b() {
        return this.f94983h;
    }

    public final String c() {
        return this.f94984i;
    }

    public final String d() {
        return this.f94981f;
    }

    public final String e() {
        return this.f94979c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f94977a, r52.f94977a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f94978b, r52.f94978b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f94979c, r52.f94979c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f94980e, r52.f94980e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f94981f, r52.f94981f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f94982g, r52.f94982g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f94983h, r52.f94983h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f94984i, r52.f94984i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f94985j, r52.f94985j) == true) goto L39;
        return false;
    L39:
        if (Float.compare(this.f94986k, r52.f94986k) == 0) goto L41;
        return false;
    L41:
        return true;
    }

    public final String f() {
        return this.f94982g;
    }

    public final String g() {
        return this.f94978b;
    }

    public final String h() {
        return this.d;
    }

    public int hashCode() {
        int r02 = ((((((((((((((((this.f94977a.hashCode() * 31) + this.f94978b.hashCode()) * 31) + this.f94979c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f94980e.hashCode()) * 31) + this.f94981f.hashCode()) * 31) + this.f94982g.hashCode()) * 31) + this.f94983h.hashCode()) * 31) + this.f94984i.hashCode()) * 31;
        Boolean r1 = this.f94985j;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((r02 + r12) * 31) + Float.hashCode(this.f94986k);
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public final String i() {
        return this.f94977a;
    }

    public final Boolean j() {
        return this.f94985j;
    }

    public String toString() {
        return "CryptoPortfolioListItemUIData(symbol=" + this.f94977a + ", name=" + this.f94978b + ", logoUrl=" + this.f94979c + ", quantityFormatted=" + this.d + ", averagePriceFormatted=" + this.f94980e + ", lastPriceFormatted=" + this.f94981f + ", marketValueFormatted=" + this.f94982g + ", gainLossFormatted=" + this.f94983h + ", gainLossPercentFormatted=" + this.f94984i + ", isGainPositive=" + this.f94985j + ", weightPercent=" + this.f94986k + ')';
    }
}
