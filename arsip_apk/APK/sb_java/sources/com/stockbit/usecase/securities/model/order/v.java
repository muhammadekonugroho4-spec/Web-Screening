package com.stockbit.usecase.securities.model.order;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f161454a;

    /* renamed from: b, reason: collision with root package name */
    public final int f161455b;

    /* renamed from: c, reason: collision with root package name */
    public final int f161456c;

    public v(int r1, int r2, int r3) {
        this.f161454a = r1;
        this.f161455b = r2;
        this.f161456c = r3;
    }

    public final int a() {
        return this.f161454a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof v) == true) goto L8;
        return false;
    L8:
        v r52 = (v) r5;
        if (this.f161454a == r52.f161454a) goto L12;
        return false;
    L12:
        if (this.f161455b == r52.f161455b) goto L15;
        return false;
    L15:
        if (this.f161456c == r52.f161456c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f161454a) * 31) + Integer.hashCode(this.f161455b)) * 31) + Integer.hashCode(this.f161456c);
    }

    public String toString() {
        return "OrderSummaryUIState(openTotal=" + this.f161454a + ", openBuy=" + this.f161455b + ", openSell=" + this.f161456c + ")";
    }
}
