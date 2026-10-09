package com.stockbit.usecase.companyprice.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f156966a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156967b;

    /* renamed from: c, reason: collision with root package name */
    public final a f156968c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final a f156969e;

    /* renamed from: f, reason: collision with root package name */
    public final String f156970f;

    /* renamed from: g, reason: collision with root package name */
    public final a f156971g;

    /* renamed from: h, reason: collision with root package name */
    public final String f156972h;

    /* renamed from: i, reason: collision with root package name */
    public final a f156973i;

    /* renamed from: j, reason: collision with root package name */
    public final String f156974j;

    /* renamed from: k, reason: collision with root package name */
    public final a f156975k;

    /* renamed from: l, reason: collision with root package name */
    public final String f156976l;

    /* renamed from: m, reason: collision with root package name */
    public final a f156977m;

    /* renamed from: n, reason: collision with root package name */
    public final String f156978n;

    /* renamed from: o, reason: collision with root package name */
    public final String f156979o;

    /* renamed from: p, reason: collision with root package name */
    public final double f156980p;

    /* renamed from: q, reason: collision with root package name */
    public final CharSequence f156981q;

    /* renamed from: r, reason: collision with root package name */
    public final CharSequence f156982r;

    /* renamed from: s, reason: collision with root package name */
    public final double f156983s;

    /* renamed from: t, reason: collision with root package name */
    public final a f156984t;

    /* renamed from: u, reason: collision with root package name */
    public final a f156985u;

    public d(String r10, String r11, a r12, String r13, a r14, String r15, a r16, String r17, a r18, String r19, a r20, String r21, a r22, String r23, String r24, double r25, CharSequence r27, CharSequence r28, double r29, a r31, a r32) {
        p.l(r10, "stockCode");
        p.l(r12, "priceOpenColor");
        p.l(r14, "priceLowColor");
        p.l(r16, "priceHighColor");
        p.l(r18, "lotValueColor");
        p.l(r20, "companyValueColor");
        p.l(r22, "averagePriceColor");
        p.l(r27, "lastPriceFormated");
        p.l(r28, "lastChangeFormated");
        p.l(r31, "changeColorTextTo");
        p.l(r32, "tvLastChangeApperance");
        this.f156966a = r10;
        this.f156967b = r11;
        this.f156968c = r12;
        this.d = r13;
        this.f156969e = r14;
        this.f156970f = r15;
        this.f156971g = r16;
        this.f156972h = r17;
        this.f156973i = r18;
        this.f156974j = r19;
        this.f156975k = r20;
        this.f156976l = r21;
        this.f156977m = r22;
        this.f156978n = r23;
        this.f156979o = r24;
        this.f156980p = r25;
        this.f156981q = r27;
        this.f156982r = r28;
        this.f156983s = r29;
        this.f156984t = r31;
        this.f156985u = r32;
    }

    public final a a() {
        return this.f156984t;
    }

    public final double b() {
        return this.f156983s;
    }

    public final CharSequence c() {
        return this.f156982r;
    }

    public final double d() {
        return this.f156980p;
    }

    public final CharSequence e() {
        return this.f156981q;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof d) == true) goto L8;
        return false;
    L8:
        d r82 = (d) r8;
        if (p.g(this.f156966a, r82.f156966a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156967b, r82.f156967b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f156968c, r82.f156968c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f156969e, r82.f156969e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f156970f, r82.f156970f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f156971g, r82.f156971g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f156972h, r82.f156972h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f156973i, r82.f156973i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f156974j, r82.f156974j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f156975k, r82.f156975k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f156976l, r82.f156976l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f156977m, r82.f156977m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f156978n, r82.f156978n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f156979o, r82.f156979o) == true) goto L54;
        return false;
    L54:
        if (Double.compare(this.f156980p, r82.f156980p) == 0) goto L57;
        return false;
    L57:
        if (p.g(this.f156981q, r82.f156981q) == true) goto L60;
        return false;
    L60:
        if (p.g(this.f156982r, r82.f156982r) == true) goto L63;
        return false;
    L63:
        if (Double.compare(this.f156983s, r82.f156983s) == 0) goto L66;
        return false;
    L66:
        if (p.g(this.f156984t, r82.f156984t) == true) goto L69;
        return false;
    L69:
        if (p.g(this.f156985u, r82.f156985u) == true) goto L71;
        return false;
    L71:
        return true;
    }

    public final String f() {
        return this.f156966a;
    }

    public final a g() {
        return this.f156985u;
    }

    public int hashCode() {
        int r02 = this.f156966a.hashCode() * 31;
        String r1 = this.f156967b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (((r02 + r12) * 31) + this.f156968c.hashCode()) * 31;
        String r13 = this.d;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (((r03 + r14) * 31) + this.f156969e.hashCode()) * 31;
        String r15 = this.f156970f;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (((r04 + r16) * 31) + this.f156971g.hashCode()) * 31;
        String r17 = this.f156972h;
        if (r17 != null) goto L17;
        int r18 = 0;
    L18:
        int r06 = (((r05 + r18) * 31) + this.f156973i.hashCode()) * 31;
        String r19 = this.f156974j;
        if (r19 != null) goto L21;
        int r110 = 0;
    L22:
        int r07 = (((r06 + r110) * 31) + this.f156975k.hashCode()) * 31;
        String r111 = this.f156976l;
        if (r111 != null) goto L25;
        int r112 = 0;
    L26:
        int r08 = (((r07 + r112) * 31) + this.f156977m.hashCode()) * 31;
        String r113 = this.f156978n;
        if (r113 != null) goto L29;
        int r114 = 0;
    L30:
        int r09 = (r08 + r114) * 31;
        String r115 = this.f156979o;
        if (r115 == null) goto L35;
        r2 = r115.hashCode();
    L35:
        return ((((((((((((r09 + r2) * 31) + Double.hashCode(this.f156980p)) * 31) + this.f156981q.hashCode()) * 31) + this.f156982r.hashCode()) * 31) + Double.hashCode(this.f156983s)) * 31) + this.f156984t.hashCode()) * 31) + this.f156985u.hashCode();
    L29:
        r114 = r113.hashCode();
        goto L30
    L25:
        r112 = r111.hashCode();
        goto L26
    L21:
        r110 = r19.hashCode();
        goto L22
    L17:
        r18 = r17.hashCode();
        goto L18
    L13:
        r16 = r15.hashCode();
        goto L14
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "CompanyPriceDetailUiState(stockCode=" + this.f156966a + ", priceOpen=" + this.f156967b + ", priceOpenColor=" + this.f156968c + ", priceLow=" + this.d + ", priceLowColor=" + this.f156969e + ", priceHigh=" + this.f156970f + ", priceHighColor=" + this.f156971g + ", lotValue=" + this.f156972h + ", lotValueColor=" + this.f156973i + ", companyValue=" + this.f156974j + ", companyValueColor=" + this.f156975k + ", averagePrice=" + this.f156976l + ", averagePriceColor=" + this.f156977m + ", foreignBuy=" + this.f156978n + ", foreignSell=" + this.f156979o + ", lastPriceDouble=" + this.f156980p + ", lastPriceFormated=" + this.f156981q + ", lastChangeFormated=" + this.f156982r + ", lastChangeDouble=" + this.f156983s + ", changeColorTextTo=" + this.f156984t + ", tvLastChangeApperance=" + this.f156985u + ")";
    }
}
