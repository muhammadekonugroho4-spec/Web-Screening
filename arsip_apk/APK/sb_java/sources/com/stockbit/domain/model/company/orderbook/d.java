package com.stockbit.domain.model.company.orderbook;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f81726a;

    /* renamed from: b, reason: collision with root package name */
    public final List f81727b;

    /* renamed from: c, reason: collision with root package name */
    public final List f81728c;

    public d(List r2, List r3, List r4) {
        p.l(r2, "prices");
        p.l(r3, "volumes");
        p.l(r4, "freqs");
        this.f81726a = r2;
        this.f81727b = r3;
        this.f81728c = r4;
    }

    public final List a() {
        return this.f81728c;
    }

    public final List b() {
        return this.f81726a;
    }

    public final List c() {
        return this.f81727b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f81726a, r52.f81726a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81727b, r52.f81727b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81728c, r52.f81728c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f81726a.hashCode() * 31) + this.f81727b.hashCode()) * 31) + this.f81728c.hashCode();
    }

    public String toString() {
        return "OrderBookBidOfferEntity(prices=" + this.f81726a + ", volumes=" + this.f81727b + ", freqs=" + this.f81728c + ")";
    }
}
