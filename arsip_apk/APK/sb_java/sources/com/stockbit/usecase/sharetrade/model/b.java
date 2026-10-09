package com.stockbit.usecase.sharetrade.model;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f162913a;

    /* renamed from: b, reason: collision with root package name */
    public final int f162914b;

    public b(boolean r1, int r2) {
        this.f162913a = r1;
        this.f162914b = r2;
    }

    public final boolean a() {
        return this.f162913a;
    }

    public final int b() {
        return this.f162914b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f162913a == r52.f162913a) goto L12;
        return false;
    L12:
        if (this.f162914b == r52.f162914b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f162913a) * 31) + Integer.hashCode(this.f162914b);
    }

    public String toString() {
        return "AutoShareTradeStatusUIState(status=" + this.f162913a + ", totalActiveTargets=" + this.f162914b + ")";
    }
}
