package com.stockbit.domain.model.cashsweep;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f81143a;

    /* renamed from: b, reason: collision with root package name */
    public final int f81144b;

    /* renamed from: c, reason: collision with root package name */
    public final int f81145c;

    public j(int r1, int r2, int r3) {
        this.f81143a = r1;
        this.f81144b = r2;
        this.f81145c = r3;
    }

    public final int a() {
        return this.f81145c;
    }

    public final int b() {
        return this.f81144b;
    }

    public final int c() {
        return this.f81143a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (this.f81143a == r52.f81143a) goto L12;
        return false;
    L12:
        if (this.f81144b == r52.f81144b) goto L15;
        return false;
    L15:
        if (this.f81145c == r52.f81145c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f81143a) * 31) + Integer.hashCode(this.f81144b)) * 31) + Integer.hashCode(this.f81145c);
    }

    public String toString() {
        return "DateEntity(year=" + this.f81143a + ", month=" + this.f81144b + ", day=" + this.f81145c + ")";
    }
}
