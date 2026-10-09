package com.stockbit.component.orderbook.model;

import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f73038a;

    /* renamed from: b, reason: collision with root package name */
    public final OrderBookColor f73039b;

    /* renamed from: c, reason: collision with root package name */
    public final String f73040c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final OrderBookColor f73041e;

    /* renamed from: f, reason: collision with root package name */
    public final String f73042f;

    /* renamed from: g, reason: collision with root package name */
    public Boolean f73043g;

    static {
    }

    public b(String r2, OrderBookColor r3, String r4, String r5, OrderBookColor r6, String r7, Boolean r8) {
        p.l(r2, "bestBidPrice");
        p.l(r3, "bestBidPriceColor");
        p.l(r4, "bestBidQuantity");
        p.l(r5, "bestAskPrice");
        p.l(r6, "bestAskPriceColor");
        p.l(r7, "bestAskQuantity");
        this.f73038a = r2;
        this.f73039b = r3;
        this.f73040c = r4;
        this.d = r5;
        this.f73041e = r6;
        this.f73042f = r7;
        this.f73043g = r8;
    }

    public static /* synthetic */ b b(b r02, String r1, OrderBookColor r2, String r3, String r4, OrderBookColor r5, String r6, Boolean r7, int r8, Object r9) {
        if ((r8 & 1) == 0) goto L6;
        r1 = r02.f73038a;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r2 = r02.f73039b;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r3 = r02.f73040c;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r5 = r02.f73041e;
    L18:
        if ((r8 & 32) == 0) goto L21;
        r6 = r02.f73042f;
    L21:
        if ((r8 & 64) == 0) goto L23;
        r7 = r02.f73043g;
    L23:
        String r82 = r6;
        Boolean r92 = r7;
        String r62 = r4;
        OrderBookColor r72 = r5;
        String r52 = r3;
        String r32 = r1;
        return r02.a(r32, r2, r52, r62, r72, r82, r92);
    }

    public final b a(String r10, OrderBookColor r11, String r12, String r13, OrderBookColor r14, String r15, Boolean r16) {
        p.l(r10, "bestBidPrice");
        p.l(r11, "bestBidPriceColor");
        p.l(r12, "bestBidQuantity");
        p.l(r13, "bestAskPrice");
        p.l(r14, "bestAskPriceColor");
        p.l(r15, "bestAskQuantity");
        return new b(r10, r11, r12, r13, r14, r15, r16);
    }

    public final String c() {
        return this.d;
    }

    public final OrderBookColor d() {
        return this.f73041e;
    }

    public final String e() {
        return this.f73042f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f73038a, r52.f73038a) == true) goto L12;
        return false;
    L12:
        if (this.f73039b == r52.f73039b) goto L15;
        return false;
    L15:
        if (p.g(this.f73040c, r52.f73040c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f73041e == r52.f73041e) goto L24;
        return false;
    L24:
        if (p.g(this.f73042f, r52.f73042f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f73043g, r52.f73043g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.f73038a;
    }

    public final OrderBookColor g() {
        return this.f73039b;
    }

    public final String h() {
        return this.f73040c;
    }

    public int hashCode() {
        int r02 = ((((((((((this.f73038a.hashCode() * 31) + this.f73039b.hashCode()) * 31) + this.f73040c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f73041e.hashCode()) * 31) + this.f73042f.hashCode()) * 31;
        Boolean r1 = this.f73043g;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "OrderBookComposeBestBidAskUIState(bestBidPrice=" + this.f73038a + ", bestBidPriceColor=" + this.f73039b + ", bestBidQuantity=" + this.f73040c + ", bestAskPrice=" + this.d + ", bestAskPriceColor=" + this.f73041e + ", bestAskQuantity=" + this.f73042f + ", isOpenMarket=" + this.f73043g + ')';
    }

    public /* synthetic */ b(String r10, OrderBookColor r11, String r12, String r13, OrderBookColor r14, String r15, Boolean r16, int r17, kotlin.jvm.internal.i r18) {
        if ((r17 & 64) == 0) goto L6;
        Boolean r8 = null;
    L7:
        this(r10, r11, r12, r13, r14, r15, r8);
        return;
    L6:
        r8 = r16;
        goto L7
    }
}
