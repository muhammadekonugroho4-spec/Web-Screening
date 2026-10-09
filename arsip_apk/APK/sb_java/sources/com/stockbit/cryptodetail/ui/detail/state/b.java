package com.stockbit.cryptodetail.ui.detail.state;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f79701a;

    /* renamed from: b, reason: collision with root package name */
    public final double f79702b;

    static {
    }

    public b(List r2, double r3) {
        p.l(r2, "chartPrices");
        this.f79701a = r2;
        this.f79702b = r3;
    }

    public final List a() {
        return this.f79701a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (p.g(this.f79701a, r82.f79701a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f79702b, r82.f79702b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f79701a.hashCode() * 31) + Double.hashCode(this.f79702b);
    }

    public String toString() {
        return "CryptoDetailChartUIData(chartPrices=" + this.f79701a + ", previousClose=" + this.f79702b + ')';
    }
}
