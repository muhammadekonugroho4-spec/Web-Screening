package com.stockbit.canvas.ui.compose.ui.model;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f51796a;

    /* renamed from: b, reason: collision with root package name */
    public final int f51797b;

    static {
    }

    public e(int r1, int r2) {
        this.f51796a = r1;
        this.f51797b = r2;
    }

    public static /* synthetic */ e b(e r02, int r1, int r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r02.f51796a;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.f51797b;
    L9:
        return r02.a(r1, r2);
    }

    public final e a(int r2, int r3) {
        return new e(r2, r3);
    }

    public final int c() {
        return this.f51796a;
    }

    public final int d() {
        return this.f51797b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (this.f51796a == r52.f51796a) goto L12;
        return false;
    L12:
        if (this.f51797b == r52.f51797b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f51796a) * 31) + Integer.hashCode(this.f51797b);
    }

    public String toString() {
        return "CanvasCardSpan(columns=" + this.f51796a + ", rows=" + this.f51797b + ')';
    }
}
