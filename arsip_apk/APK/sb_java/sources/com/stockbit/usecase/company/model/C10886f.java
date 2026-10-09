package com.stockbit.usecase.company.model;

import com.clevertap.android.sdk.Constants;

/* renamed from: com.stockbit.usecase.company.model.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10886f {

    /* renamed from: a, reason: collision with root package name */
    public final String f156216a;

    /* renamed from: b, reason: collision with root package name */
    public final long f156217b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156218c;

    public C10886f(String r2, long r3, String r5) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_DATE);
        kotlin.jvm.internal.p.l(r5, "value");
        this.f156216a = r2;
        this.f156217b = r3;
        this.f156218c = r5;
    }

    public final String a() {
        return this.f156216a;
    }

    public final String b() {
        return this.f156218c;
    }

    public final long c() {
        return this.f156217b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C10886f) == true) goto L8;
        return false;
    L8:
        C10886f r82 = (C10886f) r8;
        if (kotlin.jvm.internal.p.g(this.f156216a, r82.f156216a) == true) goto L12;
        return false;
    L12:
        if (this.f156217b == r82.f156217b) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f156218c, r82.f156218c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f156216a.hashCode() * 31) + Long.hashCode(this.f156217b)) * 31) + this.f156218c.hashCode();
    }

    public String toString() {
        return "CompanyChartPriceUIState(date=" + this.f156216a + ", xLabel=" + this.f156217b + ", value=" + this.f156218c + ")";
    }
}
