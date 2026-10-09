package com.stockbit.usecase.company.model.orderbook;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f156352a;

    /* renamed from: b, reason: collision with root package name */
    public final List f156353b;

    /* renamed from: c, reason: collision with root package name */
    public final List f156354c;

    public c(List r2, List r3, List r4) {
        p.l(r2, "volumes");
        p.l(r3, "prices");
        p.l(r4, "freqs");
        this.f156352a = r2;
        this.f156353b = r3;
        this.f156354c = r4;
    }

    public final List a() {
        return this.f156354c;
    }

    public final List b() {
        return this.f156353b;
    }

    public final List c() {
        return this.f156352a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f156352a, r52.f156352a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156353b, r52.f156353b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f156354c, r52.f156354c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f156352a.hashCode() * 31) + this.f156353b.hashCode()) * 31) + this.f156354c.hashCode();
    }

    public String toString() {
        return "OrderBookBidOfferUIState(volumes=" + this.f156352a + ", prices=" + this.f156353b + ", freqs=" + this.f156354c + ")";
    }
}
