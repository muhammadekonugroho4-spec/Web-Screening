package com.stockbit.domain.model.tradingperformance;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f86027a;

    /* renamed from: b, reason: collision with root package name */
    public final double f86028b;

    /* renamed from: c, reason: collision with root package name */
    public final double f86029c;
    public final double d;

    public c(String r2, double r3, double r5, double r7) {
        p.l(r2, Constants.KEY_DATE);
        this.f86027a = r2;
        this.f86028b = r3;
        this.f86029c = r5;
        this.d = r7;
    }

    public final String a() {
        return this.f86027a;
    }

    public final double b() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof c) == true) goto L8;
        return false;
    L8:
        c r82 = (c) r8;
        if (p.g(this.f86027a, r82.f86027a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f86028b, r82.f86028b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f86029c, r82.f86029c) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f86027a.hashCode() * 31) + Double.hashCode(this.f86028b)) * 31) + Double.hashCode(this.f86029c)) * 31) + Double.hashCode(this.d);
    }

    public String toString() {
        return "PortfolioReturnEntity(date=" + this.f86027a + ", equity=" + this.f86028b + ", cumulativeReturn=" + this.f86029c + ", percentage=" + this.d + ")";
    }
}
