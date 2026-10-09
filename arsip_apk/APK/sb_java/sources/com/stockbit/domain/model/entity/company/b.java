package com.stockbit.domain.model.entity.company;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f82677a;

    /* renamed from: b, reason: collision with root package name */
    public final List f82678b;

    public b(boolean r2, List r3) {
        p.l(r3, "runningTrade");
        this.f82677a = r2;
        this.f82678b = r3;
    }

    public final List a() {
        return this.f82678b;
    }

    public final boolean b() {
        return this.f82677a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f82677a == r52.f82677a) goto L12;
        return false;
    L12:
        if (p.g(this.f82678b, r52.f82678b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f82677a) * 31) + this.f82678b.hashCode();
    }

    public String toString() {
        return "RunningTradeData(isOpenMarket=" + this.f82677a + ", runningTrade=" + this.f82678b + ')';
    }
}
