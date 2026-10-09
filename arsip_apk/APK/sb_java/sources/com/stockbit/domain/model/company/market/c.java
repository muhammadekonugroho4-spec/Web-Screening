package com.stockbit.domain.model.company.market;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final double f81704a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81705b;

    public c(double r2, String r4) {
        p.l(r4, "formatted");
        this.f81704a = r2;
        this.f81705b = r4;
    }

    public final double a() {
        return this.f81704a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof c) == true) goto L8;
        return false;
    L8:
        c r82 = (c) r8;
        if (Double.compare(this.f81704a, r82.f81704a) == 0) goto L12;
        return false;
    L12:
        if (p.g(this.f81705b, r82.f81705b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f81704a) * 31) + this.f81705b.hashCode();
    }

    public String toString() {
        return "CompanyMarketValueEntity(raw=" + this.f81704a + ", formatted=" + this.f81705b + ")";
    }

    public /* synthetic */ c(double r1, String r3, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = 0.0d;
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r1, r3);
    }
}
