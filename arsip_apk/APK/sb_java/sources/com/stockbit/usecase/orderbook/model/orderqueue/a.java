package com.stockbit.usecase.orderbook.model.orderqueue;

import com.stockbit.usecase.securities.model.OrderBookColorType;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f158880a;

    /* renamed from: b, reason: collision with root package name */
    public final OrderBookColorType f158881b;

    /* renamed from: c, reason: collision with root package name */
    public final String f158882c;
    public final OrderBookColorType d;

    /* renamed from: e, reason: collision with root package name */
    public final int f158883e;

    public a(String r1, OrderBookColorType r2, String r3, OrderBookColorType r4, int r5) {
        this.f158880a = r1;
        this.f158881b = r2;
        this.f158882c = r3;
        this.d = r4;
        this.f158883e = r5;
    }

    public final int a() {
        return this.f158883e;
    }

    public final String b() {
        return this.f158880a;
    }

    public final OrderBookColorType c() {
        return this.f158881b;
    }

    public final String d() {
        return this.f158882c;
    }

    public final OrderBookColorType e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f158880a, r52.f158880a) == true) goto L12;
        return false;
    L12:
        if (this.f158881b == r52.f158881b) goto L15;
        return false;
    L15:
        if (p.g(this.f158882c, r52.f158882c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (this.f158883e == r52.f158883e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        String r02 = this.f158880a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        OrderBookColorType r2 = this.f158881b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f158882c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        OrderBookColorType r25 = this.d;
        if (r25 == null) goto L19;
        r1 = r25.hashCode();
    L19:
        return ((r06 + r1) * 31) + Integer.hashCode(this.f158883e);
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
        return "OrderBookIEPIEVUIState(iepPrice=" + this.f158880a + ", iepPriceColor=" + this.f158881b + ", ievPrice=" + this.f158882c + ", ievPriceColor=" + this.d + ", iepIevTimeLeft=" + this.f158883e + ")";
    }
}
