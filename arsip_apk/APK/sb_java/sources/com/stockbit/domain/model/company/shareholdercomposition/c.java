package com.stockbit.domain.model.company.shareholdercomposition;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f81942a;

    /* renamed from: b, reason: collision with root package name */
    public final long f81943b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81944c;
    public final List d;

    public c(String r2, long r3, String r5, List r6) {
        p.l(r2, "reportDate");
        p.l(r5, "totalShareFormatted");
        p.l(r6, "compositions");
        this.f81942a = r2;
        this.f81943b = r3;
        this.f81944c = r5;
        this.d = r6;
    }

    public final List a() {
        return this.d;
    }

    public final String b() {
        return this.f81942a;
    }

    public final String c() {
        return this.f81944c;
    }

    public final long d() {
        return this.f81943b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof c) == true) goto L8;
        return false;
    L8:
        c r82 = (c) r8;
        if (p.g(this.f81942a, r82.f81942a) == true) goto L12;
        return false;
    L12:
        if (this.f81943b == r82.f81943b) goto L15;
        return false;
    L15:
        if (p.g(this.f81944c, r82.f81944c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f81942a.hashCode() * 31) + Long.hashCode(this.f81943b)) * 31) + this.f81944c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "ShareholderCompositionPeriodEntity(reportDate=" + this.f81942a + ", totalShareRaw=" + this.f81943b + ", totalShareFormatted=" + this.f81944c + ", compositions=" + this.d + ")";
    }
}
