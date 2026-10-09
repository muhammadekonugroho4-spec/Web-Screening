package com.stockbit.domain.model.securities.formula;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final d f85172a;

    /* renamed from: b, reason: collision with root package name */
    public final int f85173b;

    /* renamed from: c, reason: collision with root package name */
    public final h f85174c;

    public b(d r2, int r3, h r4) {
        p.l(r2, "fee");
        p.l(r4, "previewFee");
        this.f85172a = r2;
        this.f85173b = r3;
        this.f85174c = r4;
    }

    public final d a() {
        return this.f85172a;
    }

    public final int b() {
        return this.f85173b;
    }

    public final h c() {
        return this.f85174c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f85172a, r52.f85172a) == true) goto L12;
        return false;
    L12:
        if (this.f85173b == r52.f85173b) goto L15;
        return false;
    L15:
        if (p.g(this.f85174c, r52.f85174c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f85172a.hashCode() * 31) + Integer.hashCode(this.f85173b)) * 31) + this.f85174c.hashCode();
    }

    public String toString() {
        return "DayTradeEntity(fee=" + this.f85172a + ", portionDeductToTB=" + this.f85173b + ", previewFee=" + this.f85174c + ")";
    }
}
