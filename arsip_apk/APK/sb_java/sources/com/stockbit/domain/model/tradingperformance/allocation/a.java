package com.stockbit.domain.model.tradingperformance.allocation;

import java.util.List;
import kotlin.collections.AbstractC11777v;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f85987a;

    /* renamed from: b, reason: collision with root package name */
    public final List f85988b;

    public a(List r2, List r3) {
        p.l(r2, "regular");
        p.l(r3, "dayTrade");
        this.f85987a = r2;
        this.f85988b = r3;
    }

    public static /* synthetic */ a b(a r02, List r1, List r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r02.f85987a;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.f85988b;
    L9:
        return r02.a(r1, r2);
    }

    public final a a(List r2, List r3) {
        p.l(r2, "regular");
        p.l(r3, "dayTrade");
        return new a(r2, r3);
    }

    public final List c() {
        return this.f85988b;
    }

    public final List d() {
        return this.f85987a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f85987a, r52.f85987a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85988b, r52.f85988b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f85987a.hashCode() * 31) + this.f85988b.hashCode();
    }

    public String toString() {
        return "PortfolioAllocationDataEntity(regular=" + this.f85987a + ", dayTrade=" + this.f85988b + ")";
    }

    public /* synthetic */ a(List r1, List r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = AbstractC11777v.o();
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = AbstractC11777v.o();
    L8:
        this(r1, r2);
    }
}
