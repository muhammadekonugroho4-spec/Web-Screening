package com.stockbit.usecase.securities.model.portfolio;

/* renamed from: com.stockbit.usecase.securities.model.portfolio.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10919a {

    /* renamed from: a, reason: collision with root package name */
    public final double f161719a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f161720b;

    public C10919a(double r1, boolean r3) {
        this.f161719a = r1;
        this.f161720b = r3;
    }

    public final double a() {
        return this.f161719a;
    }

    public final boolean b() {
        return this.f161720b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof C10919a) == true) goto L8;
        return false;
    L8:
        C10919a r82 = (C10919a) r8;
        if (Double.compare(this.f161719a, r82.f161719a) == 0) goto L12;
        return false;
    L12:
        if (this.f161720b == r82.f161720b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Double.hashCode(this.f161719a) * 31) + Boolean.hashCode(this.f161720b);
    }

    public String toString() {
        return "AvailableLotUIState(availableLot=" + this.f161719a + ", isDayTrade=" + this.f161720b + ")";
    }
}
