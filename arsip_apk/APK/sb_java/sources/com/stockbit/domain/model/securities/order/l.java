package com.stockbit.domain.model.securities.order;

/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f85552a;

    /* renamed from: b, reason: collision with root package name */
    public final int f85553b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85554c;

    public l(int r1, int r2, int r3) {
        this.f85552a = r1;
        this.f85553b = r2;
        this.f85554c = r3;
    }

    public final int a() {
        return this.f85553b;
    }

    public final int b() {
        return this.f85554c;
    }

    public final int c() {
        return this.f85552a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (this.f85552a == r52.f85552a) goto L12;
        return false;
    L12:
        if (this.f85553b == r52.f85553b) goto L15;
        return false;
    L15:
        if (this.f85554c == r52.f85554c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f85552a) * 31) + Integer.hashCode(this.f85553b)) * 31) + Integer.hashCode(this.f85554c);
    }

    public String toString() {
        return "OrderSummaryEntity(openTotal=" + this.f85552a + ", openBuy=" + this.f85553b + ", openSell=" + this.f85554c + ")";
    }
}
