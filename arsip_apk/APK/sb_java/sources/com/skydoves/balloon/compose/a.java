package com.skydoves.balloon.compose;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f44120a;

    /* renamed from: b, reason: collision with root package name */
    public final float f44121b;

    /* renamed from: c, reason: collision with root package name */
    public final int f44122c;
    public final int d;

    public a(float r1, float r2, int r3, int r4) {
        this.f44120a = r1;
        this.f44121b = r2;
        this.f44122c = r3;
        this.d = r4;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (Float.compare(this.f44120a, r52.f44120a) == 0) goto L12;
        return false;
    L12:
        if (Float.compare(this.f44121b, r52.f44121b) == 0) goto L15;
        return false;
    L15:
        if (this.f44122c == r52.f44122c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f44120a) * 31) + Float.hashCode(this.f44121b)) * 31) + Integer.hashCode(this.f44122c)) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "BalloonLayoutInfo(x=" + this.f44120a + ", y=" + this.f44121b + ", width=" + this.f44122c + ", height=" + this.d + ')';
    }
}
