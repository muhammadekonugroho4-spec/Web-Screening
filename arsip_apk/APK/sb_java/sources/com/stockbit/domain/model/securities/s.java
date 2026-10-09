package com.stockbit.domain.model.securities;

/* loaded from: classes8.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f85733a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f85734b;

    public s(boolean r1, boolean r2) {
        this.f85733a = r1;
        this.f85734b = r2;
    }

    public final boolean a() {
        return this.f85733a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof s) == true) goto L8;
        return false;
    L8:
        s r52 = (s) r5;
        if (this.f85733a == r52.f85733a) goto L12;
        return false;
    L12:
        if (this.f85734b == r52.f85734b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f85733a) * 31) + Boolean.hashCode(this.f85734b);
    }

    public String toString() {
        return "StockTradableTypeEntity(isSharia=" + this.f85733a + ", isMargin=" + this.f85734b + ")";
    }
}
