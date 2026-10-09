package com.stockbit.usecase.company.model.orderbook;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final f f156348a;

    /* renamed from: b, reason: collision with root package name */
    public final f f156349b;

    /* renamed from: c, reason: collision with root package name */
    public final f f156350c;
    public final f d;

    /* renamed from: e, reason: collision with root package name */
    public final int f156351e;

    public b(f r1, f r2, f r3, f r4, int r5) {
        this.f156348a = r1;
        this.f156349b = r2;
        this.f156350c = r3;
        this.d = r4;
        this.f156351e = r5;
    }

    public final f a() {
        return this.f156348a;
    }

    public final f b() {
        return this.f156349b;
    }

    public final f c() {
        return this.f156350c;
    }

    public final f d() {
        return this.d;
    }

    public final int e() {
        return this.f156351e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f156348a, r52.f156348a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156349b, r52.f156349b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f156350c, r52.f156350c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f156351e == r52.f156351e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        f r02 = this.f156348a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        f r2 = this.f156349b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        f r23 = this.f156350c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        f r25 = this.d;
        if (r25 == null) goto L19;
        r1 = r25.hashCode();
    L19:
        return ((r06 + r1) * 31) + Integer.hashCode(this.f156351e);
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "OrderBookBestBidOfferUIState(bidPrice=" + this.f156348a + ", bidQuantity=" + this.f156349b + ", offerPrice=" + this.f156350c + ", offerQuantity=" + this.d + ", timeLeftSeconds=" + this.f156351e + ")";
    }
}
