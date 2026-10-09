package com.stockbit.domain.model.company.seasonality;

import com.stockbit.company.CompanyEntryPoint;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f81930a;

    /* renamed from: b, reason: collision with root package name */
    public final int f81931b;

    public f(String r2, int r3) {
        p.l(r2, CompanyEntryPoint.EXTRA_DESC);
        this.f81930a = r2;
        this.f81931b = r3;
    }

    public final String a() {
        return this.f81930a;
    }

    public final int b() {
        return this.f81931b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f81930a, r52.f81930a) == true) goto L12;
        return false;
    L12:
        if (this.f81931b == r52.f81931b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f81930a.hashCode() * 31) + Integer.hashCode(this.f81931b);
    }

    public String toString() {
        return "SeasonalityYearsEntity(desc=" + this.f81930a + ", value=" + this.f81931b + ")";
    }
}
