package com.stockbit.domain.model.valueobject.company.orderbook;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f86792a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86793b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86794c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f86795e;

    /* renamed from: f, reason: collision with root package name */
    public final String f86796f;

    /* renamed from: g, reason: collision with root package name */
    public final String f86797g;

    /* renamed from: h, reason: collision with root package name */
    public final String f86798h;

    /* renamed from: i, reason: collision with root package name */
    public final String f86799i;

    /* renamed from: j, reason: collision with root package name */
    public final String f86800j;

    /* renamed from: k, reason: collision with root package name */
    public final String f86801k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f86802l;

    public d(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, boolean r13) {
        p.l(r2, "stockCode");
        p.l(r3, "brokerCode");
        p.l(r4, "sellValue");
        p.l(r5, "sellValueFormatted");
        p.l(r6, "sellAveragePrice");
        p.l(r7, "sellAveragePriceFormatted");
        p.l(r8, "sellLot");
        p.l(r9, "sellLotFormatted");
        p.l(r10, "sellFreq");
        p.l(r11, "sellFreqFormatted");
        p.l(r12, "type");
        this.f86792a = r2;
        this.f86793b = r3;
        this.f86794c = r4;
        this.d = r5;
        this.f86795e = r6;
        this.f86796f = r7;
        this.f86797g = r8;
        this.f86798h = r9;
        this.f86799i = r10;
        this.f86800j = r11;
        this.f86801k = r12;
        this.f86802l = r13;
    }

    public final String a() {
        return this.f86793b;
    }

    public final String b() {
        return this.f86795e;
    }

    public final String c() {
        return this.f86796f;
    }

    public final String d() {
        return this.f86799i;
    }

    public final String e() {
        return this.f86800j;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f86792a, r52.f86792a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86793b, r52.f86793b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f86794c, r52.f86794c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f86795e, r52.f86795e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f86796f, r52.f86796f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f86797g, r52.f86797g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f86798h, r52.f86798h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f86799i, r52.f86799i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f86800j, r52.f86800j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f86801k, r52.f86801k) == true) goto L42;
        return false;
    L42:
        if (this.f86802l == r52.f86802l) goto L44;
        return false;
    L44:
        return true;
    }

    public final String f() {
        return this.f86797g;
    }

    public final String g() {
        return this.f86798h;
    }

    public final String h() {
        return this.f86794c;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.f86792a.hashCode() * 31) + this.f86793b.hashCode()) * 31) + this.f86794c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f86795e.hashCode()) * 31) + this.f86796f.hashCode()) * 31) + this.f86797g.hashCode()) * 31) + this.f86798h.hashCode()) * 31) + this.f86799i.hashCode()) * 31) + this.f86800j.hashCode()) * 31) + this.f86801k.hashCode()) * 31) + Boolean.hashCode(this.f86802l);
    }

    public final String i() {
        return this.d;
    }

    public final String j() {
        return this.f86801k;
    }

    public final boolean k() {
        return this.f86802l;
    }

    public String toString() {
        return "BandarDetectorBrokersSell(stockCode=" + this.f86792a + ", brokerCode=" + this.f86793b + ", sellValue=" + this.f86794c + ", sellValueFormatted=" + this.d + ", sellAveragePrice=" + this.f86795e + ", sellAveragePriceFormatted=" + this.f86796f + ", sellLot=" + this.f86797g + ", sellLotFormatted=" + this.f86798h + ", sellFreq=" + this.f86799i + ", sellFreqFormatted=" + this.f86800j + ", type=" + this.f86801k + ", isEmpty=" + this.f86802l + ')';
    }

    public /* synthetic */ d(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, boolean r13, int r14, i r15) {
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
