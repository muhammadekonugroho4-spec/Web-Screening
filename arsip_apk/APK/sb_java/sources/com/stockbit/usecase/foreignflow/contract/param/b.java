package com.stockbit.usecase.foreignflow.contract.param;

import com.stockbit.usecase.foreignflow.contract.entity.ForeignFlowMarket;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f157901a;

    /* renamed from: b, reason: collision with root package name */
    public final ForeignFlowMarket f157902b;

    /* renamed from: c, reason: collision with root package name */
    public final a f157903c;

    public b(String r2, ForeignFlowMarket r3, a r4) {
        p.l(r2, "symbol");
        p.l(r3, "market");
        p.l(r4, "dateFilter");
        this.f157901a = r2;
        this.f157902b = r3;
        this.f157903c = r4;
    }

    public static /* synthetic */ b b(b r02, String r1, ForeignFlowMarket r2, a r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.f157901a;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.f157902b;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r02.f157903c;
    L12:
        return r02.a(r1, r2, r3);
    }

    public final b a(String r2, ForeignFlowMarket r3, a r4) {
        p.l(r2, "symbol");
        p.l(r3, "market");
        p.l(r4, "dateFilter");
        return new b(r2, r3, r4);
    }

    public final a c() {
        return this.f157903c;
    }

    public final ForeignFlowMarket d() {
        return this.f157902b;
    }

    public final String e() {
        return this.f157901a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f157901a, r52.f157901a) == true) goto L12;
        return false;
    L12:
        if (this.f157902b == r52.f157902b) goto L15;
        return false;
    L15:
        if (p.g(this.f157903c, r52.f157903c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f157901a.hashCode() * 31) + this.f157902b.hashCode()) * 31) + this.f157903c.hashCode();
    }

    public String toString() {
        return "ForeignFlowHistoricalQuery(symbol=" + this.f157901a + ", market=" + this.f157902b + ", dateFilter=" + this.f157903c + ")";
    }
}
