package com.stockbit.canvas.ui.compose.ui.model;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f51798a;

    /* renamed from: b, reason: collision with root package name */
    public final float f51799b;

    /* renamed from: c, reason: collision with root package name */
    public final int f51800c;
    public final int d;

    static {
    }

    public /* synthetic */ f(long r1, float r3, int r4, int r5, kotlin.jvm.internal.i r6) {
        this(r1, r3, r4, r5);
    }

    public final float a() {
        return this.f51799b;
    }

    public final long b() {
        return this.f51798a;
    }

    public final int c() {
        return this.f51800c;
    }

    public final int d() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof f) == true) goto L8;
        return false;
    L8:
        f r82 = (f) r8;
        if (androidx.compose.ui.unit.l.f(this.f51798a, r82.f51798a) == true) goto L12;
        return false;
    L12:
        if (androidx.compose.ui.unit.i.j(this.f51799b, r82.f51799b) == true) goto L15;
        return false;
    L15:
        if (this.f51800c == r82.f51800c) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((androidx.compose.ui.unit.l.i(this.f51798a) * 31) + androidx.compose.ui.unit.i.k(this.f51799b)) * 31) + Integer.hashCode(this.f51800c)) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "CanvasGridGeometry(cellSize=" + androidx.compose.ui.unit.l.j(this.f51798a) + ", cardSpacing=" + androidx.compose.ui.unit.i.l(this.f51799b) + ", columns=" + this.f51800c + ", rows=" + this.d + ')';
    }

    public f(long r1, float r3, int r4, int r5) {
        this.f51798a = r1;
        this.f51799b = r3;
        this.f51800c = r4;
        this.d = r5;
    }
}
