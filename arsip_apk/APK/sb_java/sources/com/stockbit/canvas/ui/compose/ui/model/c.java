package com.stockbit.canvas.ui.compose.ui.model;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f51793a;

    /* renamed from: b, reason: collision with root package name */
    public final int f51794b;

    /* renamed from: c, reason: collision with root package name */
    public final int f51795c;
    public final int d;

    static {
    }

    public c(int r1, int r2, int r3, int r4) {
        this.f51793a = r1;
        this.f51794b = r2;
        this.f51795c = r3;
        this.d = r4;
    }

    public final int a() {
        return this.f51793a;
    }

    public final int b() {
        return this.f51795c;
    }

    public final int c() {
        return this.f51794b;
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
        if (this.f51793a == r52.f51793a) goto L12;
        return false;
    L12:
        if (this.f51794b == r52.f51794b) goto L15;
        return false;
    L15:
        if (this.f51795c == r52.f51795c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f51793a) * 31) + Integer.hashCode(this.f51794b)) * 31) + Integer.hashCode(this.f51795c)) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "CanvasCardPlacement(column=" + this.f51793a + ", row=" + this.f51794b + ", columnSpan=" + this.f51795c + ", rowSpan=" + this.d + ')';
    }
}
