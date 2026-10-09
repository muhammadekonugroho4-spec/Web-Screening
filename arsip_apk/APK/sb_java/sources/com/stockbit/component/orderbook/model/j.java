package com.stockbit.component.orderbook.model;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: g, reason: collision with root package name */
    public static final a f73104g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final j f73105h = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f73106a;

    /* renamed from: b, reason: collision with root package name */
    public final String f73107b;

    /* renamed from: c, reason: collision with root package name */
    public final String f73108c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final double f73109e;

    /* renamed from: f, reason: collision with root package name */
    public final double f73110f;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final j a() {
            return j.a();
        }

        public a() {
        }
    }

    static {
        f73104g = new a(null);
        f73105h = new j("9,004", "292,278", "306,182", "5,002", 292278.0d, 306182.0d);
    }

    public j(String r2, String r3, String r4, String r5, double r6, double r8) {
        p.l(r2, "totalFreqBid");
        p.l(r3, "totalLotBid");
        p.l(r4, "totalLotAsk");
        p.l(r5, "totalFreqAsk");
        this.f73106a = r2;
        this.f73107b = r3;
        this.f73108c = r4;
        this.d = r5;
        this.f73109e = r6;
        this.f73110f = r8;
    }

    public static final /* synthetic */ j a() {
        return f73105h;
    }

    public static /* synthetic */ j c(j r02, String r1, String r2, String r3, String r4, double r5, double r7, int r9, Object r10) {
        if ((r9 & 1) == 0) goto L6;
        r1 = r02.f73106a;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r2 = r02.f73107b;
    L9:
        if ((r9 & 4) == 0) goto L12;
        r3 = r02.f73108c;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r5 = r02.f73109e;
    L18:
        if ((r9 & 32) == 0) goto L20;
        r7 = r02.f73110f;
    L20:
        double r92 = r7;
        double r72 = r5;
        String r52 = r3;
        String r6 = r4;
        return r02.b(r1, r2, r52, r6, r72, r92);
    }

    public final j b(String r11, String r12, String r13, String r14, double r15, double r17) {
        p.l(r11, "totalFreqBid");
        p.l(r12, "totalLotBid");
        p.l(r13, "totalLotAsk");
        p.l(r14, "totalFreqAsk");
        return new j(r11, r12, r13, r14, r15, r17);
    }

    public final boolean d() {
        if ((this.f73109e + this.f73110f) <= 0.0d) goto L6;
        return true;
    L6:
        return false;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof j) == true) goto L8;
        return false;
    L8:
        j r82 = (j) r8;
        if (p.g(this.f73106a, r82.f73106a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f73107b, r82.f73107b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f73108c, r82.f73108c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (Double.compare(this.f73109e, r82.f73109e) == 0) goto L24;
        return false;
    L24:
        if (Double.compare(this.f73110f, r82.f73110f) == 0) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f73106a;
    }

    public final String g() {
        return this.f73108c;
    }

    public final double h() {
        return this.f73110f;
    }

    public int hashCode() {
        return (((((((((this.f73106a.hashCode() * 31) + this.f73107b.hashCode()) * 31) + this.f73108c.hashCode()) * 31) + this.d.hashCode()) * 31) + Double.hashCode(this.f73109e)) * 31) + Double.hashCode(this.f73110f);
    }

    public final String i() {
        return this.f73107b;
    }

    public final double j() {
        return this.f73109e;
    }

    public String toString() {
        return "OrderBookTotalUIState(totalFreqBid=" + this.f73106a + ", totalLotBid=" + this.f73107b + ", totalLotAsk=" + this.f73108c + ", totalFreqAsk=" + this.d + ", totalLotBidDouble=" + this.f73109e + ", totalLotAskDouble=" + this.f73110f + ')';
    }

    public /* synthetic */ j(String r3, String r4, String r5, String r6, double r7, double r9, int r11, kotlin.jvm.internal.i r12) {
        if ((r11 & 1) == 0) goto L6;
        r3 = "";
    L6:
        if ((r11 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r11 & 4) == 0) goto L12;
        r5 = "";
    L12:
        if ((r11 & 8) == 0) goto L15;
        r6 = "";
    L15:
        if ((r11 & 16) == 0) goto L18;
        r7 = 0.0d;
    L18:
        if ((r11 & 32) == 0) goto L21;
        double r10 = 0.0d;
    L20:
        double r8 = r7;
        String r72 = r6;
        String r62 = r5;
        this(r3, r4, r62, r72, r8, r10);
        return;
    L21:
        r10 = r9;
        goto L20
    }
}
