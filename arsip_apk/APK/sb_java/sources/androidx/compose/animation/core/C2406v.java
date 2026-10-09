package androidx.compose.animation.core;

import androidx.compose.ui.graphics.AbstractC3510d0;

/* renamed from: androidx.compose.animation.core.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2406v implements B {

    /* renamed from: a, reason: collision with root package name */
    public final float f6923a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6924b;

    /* renamed from: c, reason: collision with root package name */
    public final float f6925c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6926e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6927f;

    static {
    }

    public C2406v(float r7, float r8, float r9, float r10) {
        this.f6923a = r7;
        this.f6924b = r8;
        this.f6925c = r9;
        this.d = r10;
        if (Float.isNaN(r7) == false) goto L5;
    L11:
        boolean r02 = false;
    L12:
        if (r02 == true) goto L14;
        Y.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + r7 + ", " + r8 + ", " + r9 + ", " + r10 + '.');
    L14:
        long r72 = AbstractC3510d0.b(0.0f, r8, r10, 1.0f, new float[5], 0);
        this.f6926e = Float.intBitsToFloat((int) (r72 >> 32));
        this.f6927f = Float.intBitsToFloat((int) (r72 & 4294967295L));
        return;
    L5:
        if (Float.isNaN(r8) == true) goto L11;
        if (Float.isNaN(r9) == true) goto L11;
        if (Float.isNaN(r10) == true) goto L11;
        r02 = true;
        goto L12
    }

    @Override // androidx.compose.animation.core.B
    public float a(float r6) {
        if (r6 > 0.0f) goto L5;
    L15:
        return r6;
    L5:
        if (r6 >= 1.0f) goto L15;
        float r2 = Math.max(r6, 1.1920929E-7f);
        float r02 = AbstractC3510d0.e(0.0f - r2, this.f6923a - r2, this.f6925c - r2, 1.0f - r2);
        if (Float.isNaN(r02) == false) goto L9;
        b(r6);
    L9:
        r6 = AbstractC3510d0.c(this.f6924b, this.d, r02);
        float r03 = this.f6926e;
        float r1 = this.f6927f;
        if (r6 >= r03) goto L13;
        r6 = r03;
    L13:
        if (r6 <= r1) goto L15;
        return r1;
    }

    public final void b(float r5) {
        throw new IllegalArgumentException("The cubic curve with parameters (" + this.f6923a + ", " + this.f6924b + ", " + this.f6925c + ", " + this.d + ") has no solution at " + r5);
    }

    public boolean equals(Object r3) {
        if ((r3 instanceof C2406v) == false) goto L14;
        C2406v r32 = (C2406v) r3;
        if (this.f6923a == r32.f6923a) goto L7;
        return false;
    L7:
        if (this.f6924b == r32.f6924b) goto L9;
        return false;
    L9:
        if (this.f6925c == r32.f6925c) goto L11;
        return false;
    L11:
        if (this.d != r32.d) goto L19;
        return true;
    L19:
        return false;
    L14:
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f6923a) * 31) + Float.hashCode(this.f6924b)) * 31) + Float.hashCode(this.f6925c)) * 31) + Float.hashCode(this.d);
    }

    public String toString() {
        return "CubicBezierEasing(a=" + this.f6923a + ", b=" + this.f6924b + ", c=" + this.f6925c + ", d=" + this.d + ')';
    }
}
