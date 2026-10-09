package com.stockbit.component.chart.view;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f69880a;

    /* renamed from: b, reason: collision with root package name */
    public final float f69881b;

    /* renamed from: c, reason: collision with root package name */
    public final int f69882c;
    public final int d;

    static {
    }

    public d(float r1, float r2, int r3, int r4) {
        this.f69880a = r1;
        this.f69881b = r2;
        this.f69882c = r3;
        this.d = r4;
    }

    public final float a() {
        return this.f69880a;
    }

    public final float b() {
        return this.f69881b;
    }

    public final int c() {
        return this.f69882c;
    }

    public final int d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (Float.compare(this.f69880a, r52.f69880a) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.f69881b, r52.f69881b) == 0) goto L15;
        return false;
    L15:
        if (this.f69882c == r52.f69882c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f69880a) * 31) + Float.hashCode(this.f69881b)) * 31) + Integer.hashCode(this.f69882c)) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "MinMaxDataView(minX=" + this.f69880a + ", maxX=" + this.f69881b + ", minXIndex=" + this.f69882c + ", maxXIndex=" + this.d + ')';
    }
}
