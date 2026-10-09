package com.stockbit.usecase.emittenclassification.contract.entity;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f157571a;

    /* renamed from: b, reason: collision with root package name */
    public final String f157572b;

    public g(boolean r2, String r3) {
        p.l(r3, "haircutPercentage");
        this.f157571a = r2;
        this.f157572b = r3;
    }

    public final String a() {
        return this.f157572b;
    }

    public final boolean b() {
        return this.f157571a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (this.f157571a == r52.f157571a) goto L12;
        return false;
    L12:
        if (p.g(this.f157572b, r52.f157572b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f157571a) * 31) + this.f157572b.hashCode();
    }

    public String toString() {
        return "EmittenClassificationTradingLimitEntity(isTradingLimit=" + this.f157571a + ", haircutPercentage=" + this.f157572b + ")";
    }
}
