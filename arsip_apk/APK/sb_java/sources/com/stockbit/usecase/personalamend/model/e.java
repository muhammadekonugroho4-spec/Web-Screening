package com.stockbit.usecase.personalamend.model;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f159044a;

    /* renamed from: b, reason: collision with root package name */
    public final int f159045b;

    public e(int r1, int r2) {
        this.f159044a = r1;
        this.f159045b = r2;
    }

    public final int a() {
        return this.f159044a;
    }

    public final int b() {
        return this.f159045b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (this.f159044a == r52.f159044a) goto L12;
        return false;
    L12:
        if (this.f159045b == r52.f159045b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f159044a) * 31) + Integer.hashCode(this.f159045b);
    }

    public String toString() {
        return "CoolingDownMessageUIState(hour=" + this.f159044a + ", minute=" + this.f159045b + ")";
    }
}
