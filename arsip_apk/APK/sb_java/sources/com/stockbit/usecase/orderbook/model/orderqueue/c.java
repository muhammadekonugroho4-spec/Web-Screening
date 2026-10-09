package com.stockbit.usecase.orderbook.model.orderqueue;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f158901a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f158902b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f158903c;

    public c(List r2, boolean r3, boolean r4) {
        p.l(r2, "orders");
        this.f158901a = r2;
        this.f158902b = r3;
        this.f158903c = r4;
    }

    public final boolean a() {
        return this.f158903c;
    }

    public final List b() {
        return this.f158901a;
    }

    public final boolean c() {
        return this.f158902b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f158901a, r52.f158901a) == true) goto L12;
        return false;
    L12:
        if (this.f158902b == r52.f158902b) goto L15;
        return false;
    L15:
        if (this.f158903c == r52.f158903c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f158901a.hashCode() * 31) + Boolean.hashCode(this.f158902b)) * 31) + Boolean.hashCode(this.f158903c);
    }

    public String toString() {
        return "OrderQueueUIState(orders=" + this.f158901a + ", isMarketOpen=" + this.f158902b + ", hasNextPage=" + this.f158903c + ")";
    }
}
