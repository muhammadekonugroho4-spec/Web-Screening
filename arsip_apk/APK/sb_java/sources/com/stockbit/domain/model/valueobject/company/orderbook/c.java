package com.stockbit.domain.model.valueobject.company.orderbook;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f86781a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86782b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86783c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f86784e;

    /* renamed from: f, reason: collision with root package name */
    public final String f86785f;

    /* renamed from: g, reason: collision with root package name */
    public final String f86786g;

    /* renamed from: h, reason: collision with root package name */
    public final String f86787h;

    /* renamed from: i, reason: collision with root package name */
    public final String f86788i;

    /* renamed from: j, reason: collision with root package name */
    public final String f86789j;

    /* renamed from: k, reason: collision with root package name */
    public final String f86790k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f86791l;

    public c(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, boolean r13) {
        p.l(r2, "stockCode");
        p.l(r3, "brokerCode");
        p.l(r4, "buyValue");
        p.l(r5, "buyValueFormatted");
        p.l(r6, "buyAveragePrice");
        p.l(r7, "buyAveragePriceFormatted");
        p.l(r8, "buyLot");
        p.l(r9, "buyLotFormatted");
        p.l(r10, "buyFreq");
        p.l(r11, "buyFreqFormatted");
        p.l(r12, "type");
        this.f86781a = r2;
        this.f86782b = r3;
        this.f86783c = r4;
        this.d = r5;
        this.f86784e = r6;
        this.f86785f = r7;
        this.f86786g = r8;
        this.f86787h = r9;
        this.f86788i = r10;
        this.f86789j = r11;
        this.f86790k = r12;
        this.f86791l = r13;
    }

    public final String a() {
        return this.f86782b;
    }

    public final String b() {
        return this.f86784e;
    }

    public final String c() {
        return this.f86785f;
    }

    public final String d() {
        return this.f86788i;
    }

    public final String e() {
        return this.f86789j;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f86781a, r52.f86781a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86782b, r52.f86782b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f86783c, r52.f86783c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f86784e, r52.f86784e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f86785f, r52.f86785f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f86786g, r52.f86786g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f86787h, r52.f86787h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f86788i, r52.f86788i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f86789j, r52.f86789j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f86790k, r52.f86790k) == true) goto L42;
        return false;
    L42:
        if (this.f86791l == r52.f86791l) goto L44;
        return false;
    L44:
        return true;
    }

    public final String f() {
        return this.f86786g;
    }

    public final String g() {
        return this.f86787h;
    }

    public final String h() {
        return this.f86783c;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.f86781a.hashCode() * 31) + this.f86782b.hashCode()) * 31) + this.f86783c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f86784e.hashCode()) * 31) + this.f86785f.hashCode()) * 31) + this.f86786g.hashCode()) * 31) + this.f86787h.hashCode()) * 31) + this.f86788i.hashCode()) * 31) + this.f86789j.hashCode()) * 31) + this.f86790k.hashCode()) * 31) + Boolean.hashCode(this.f86791l);
    }

    public final String i() {
        return this.d;
    }

    public final String j() {
        return this.f86790k;
    }

    public final boolean k() {
        return this.f86791l;
    }

    public String toString() {
        return "BandarDetectorBrokersBuy(stockCode=" + this.f86781a + ", brokerCode=" + this.f86782b + ", buyValue=" + this.f86783c + ", buyValueFormatted=" + this.d + ", buyAveragePrice=" + this.f86784e + ", buyAveragePriceFormatted=" + this.f86785f + ", buyLot=" + this.f86786g + ", buyLotFormatted=" + this.f86787h + ", buyFreq=" + this.f86788i + ", buyFreqFormatted=" + this.f86789j + ", type=" + this.f86790k + ", isEmpty=" + this.f86791l + ')';
    }

    public /* synthetic */ c(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, boolean r13, int r14, i r15) {
        if ((r14 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r14 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r14 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r14 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r14 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r14 & 32) == 0) goto L21;
        r7 = "";
    L21:
        if ((r14 & 64) == 0) goto L24;
        r8 = "";
    L24:
        if ((r14 & 128) == 0) goto L27;
        r9 = "";
    L27:
        if ((r14 & 256) == 0) goto L30;
        r10 = "";
    L30:
        if ((r14 & 512) == 0) goto L33;
        r11 = "";
    L33:
        if ((r14 & 1024) == 0) goto L36;
        r12 = "";
    L36:
        if ((r14 & 2048) == 0) goto L38;
        r13 = false;
    L38:
        boolean r142 = r13;
        String r132 = r12;
        String r122 = r11;
        String r112 = r10;
        String r102 = r9;
        String r92 = r8;
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72, r82, r92, r102, r112, r122, r132, r142);
    }
}
