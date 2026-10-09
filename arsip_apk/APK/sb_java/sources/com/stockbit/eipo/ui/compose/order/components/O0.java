package com.stockbit.eipo.ui.compose.order.components;

/* loaded from: classes8.dex */
public final class O0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f90238a;

    /* renamed from: b, reason: collision with root package name */
    public final long f90239b;

    /* renamed from: c, reason: collision with root package name */
    public final long f90240c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f90241e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f90242f;

    public /* synthetic */ O0(long r1, long r3, long r5, float r7, float r8, boolean r9, kotlin.jvm.internal.i r10) {
        this(r1, r3, r5, r7, r8, r9);
    }

    public final float a() {
        return this.f90241e;
    }

    public final float b() {
        return this.d;
    }

    public final boolean c() {
        return this.f90242f;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof O0) == true) goto L8;
        return false;
    L8:
        O0 r82 = (O0) r8;
        if (androidx.compose.ui.geometry.e.j(this.f90238a, r82.f90238a) == true) goto L12;
        return false;
    L12:
        if (androidx.compose.ui.geometry.e.j(this.f90239b, r82.f90239b) == true) goto L15;
        return false;
    L15:
        if (androidx.compose.ui.geometry.e.j(this.f90240c, r82.f90240c) == true) goto L18;
        return false;
    L18:
        if (Float.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (Float.compare(this.f90241e, r82.f90241e) == 0) goto L24;
        return false;
    L24:
        if (this.f90242f == r82.f90242f) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        return (((((((((androidx.compose.ui.geometry.e.o(this.f90238a) * 31) + androidx.compose.ui.geometry.e.o(this.f90239b)) * 31) + androidx.compose.ui.geometry.e.o(this.f90240c)) * 31) + Float.hashCode(this.d)) * 31) + Float.hashCode(this.f90241e)) * 31) + Boolean.hashCode(this.f90242f);
    }

    public String toString() {
        return "SliderDrawContext(trackStart=" + androidx.compose.ui.geometry.e.s(this.f90238a) + ", trackEnd=" + androidx.compose.ui.geometry.e.s(this.f90239b) + ", thumbCenter=" + androidx.compose.ui.geometry.e.s(this.f90240c) + ", valueFraction=" + this.d + ", trackHeightPx=" + this.f90241e + ", isEnabled=" + this.f90242f + ')';
    }

    public O0(long r1, long r3, long r5, float r7, float r8, boolean r9) {
        this.f90238a = r1;
        this.f90239b = r3;
        this.f90240c = r5;
        this.d = r7;
        this.f90241e = r8;
        this.f90242f = r9;
    }
}
