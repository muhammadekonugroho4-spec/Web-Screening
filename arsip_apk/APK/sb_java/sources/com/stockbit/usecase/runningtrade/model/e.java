package com.stockbit.usecase.runningtrade.model;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f159610a;

    /* renamed from: b, reason: collision with root package name */
    public final com.stockbit.usecase.runningtrade.model.pagination.a f159611b;

    public e(List r2, com.stockbit.usecase.runningtrade.model.pagination.a r3) {
        p.l(r2, "runningTrades");
        p.l(r3, "pagination");
        this.f159610a = r2;
        this.f159611b = r3;
    }

    public com.stockbit.usecase.runningtrade.model.pagination.a a() {
        return this.f159611b;
    }

    public final List b() {
        return this.f159610a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f159610a, r52.f159610a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f159611b, r52.f159611b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f159610a.hashCode() * 31) + this.f159611b.hashCode();
    }

    public String toString() {
        return "RunningTradeGroupedUIState(runningTrades=" + this.f159610a + ", pagination=" + this.f159611b + ")";
    }
}
