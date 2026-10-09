package com.stockbit.usecase.company.model.seasonality;

import com.stockbit.company.CompanyEntryPoint;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public String f156577a;

    /* renamed from: b, reason: collision with root package name */
    public int f156578b;

    public d(String r2, int r3) {
        p.l(r2, CompanyEntryPoint.EXTRA_DESC);
        this.f156577a = r2;
        this.f156578b = r3;
    }

    public final String a() {
        return this.f156577a;
    }

    public final int b() {
        return this.f156578b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f156577a, r52.f156577a) == true) goto L12;
        return false;
    L12:
        if (this.f156578b == r52.f156578b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f156577a.hashCode() * 31) + Integer.hashCode(this.f156578b);
    }

    public String toString() {
        return "SeasonalityYearsUIState(desc=" + this.f156577a + ", value=" + this.f156578b + ")";
    }
}
