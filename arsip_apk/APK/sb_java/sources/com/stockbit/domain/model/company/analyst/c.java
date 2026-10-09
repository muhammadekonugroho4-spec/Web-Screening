package com.stockbit.domain.model.company.analyst;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f81389a;

    /* renamed from: b, reason: collision with root package name */
    public final int f81390b;

    /* renamed from: c, reason: collision with root package name */
    public final int f81391c;
    public final int d;

    public c(int r1, int r2, int r3, int r4) {
        this.f81389a = r1;
        this.f81390b = r2;
        this.f81391c = r3;
        this.d = r4;
    }

    public final int a() {
        return this.f81391c;
    }

    public final int b() {
        return this.f81390b;
    }

    public final int c() {
        return this.f81389a;
    }

    public final int d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (this.f81389a == r52.f81389a) goto L12;
        return false;
    L12:
        if (this.f81390b == r52.f81390b) goto L15;
        return false;
    L15:
        if (this.f81391c == r52.f81391c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f81389a) * 31) + Integer.hashCode(this.f81390b)) * 31) + Integer.hashCode(this.f81391c)) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "AnalystPriceTargetEntity(bestTarget=" + this.f81389a + ", bestLowTarget=" + this.f81390b + ", bestHighTarget=" + this.f81391c + ", currentPrice=" + this.d + ")";
    }
}
