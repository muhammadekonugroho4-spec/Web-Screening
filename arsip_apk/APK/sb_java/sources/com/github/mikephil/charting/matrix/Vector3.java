package com.github.mikephil.charting.matrix;

/* loaded from: classes4.dex */
public final class Vector3 {
    public static final Vector3 UNIT_X = null;
    public static final Vector3 UNIT_Y = null;
    public static final Vector3 UNIT_Z = null;
    public static final Vector3 ZERO = null;

    /* renamed from: x, reason: collision with root package name */
    public float f37846x;

    /* renamed from: y, reason: collision with root package name */
    public float f37847y;

    /* renamed from: z, reason: collision with root package name */
    public float f37848z;

    static {
        ZERO = new Vector3(0.0f, 0.0f, 0.0f);
        UNIT_X = new Vector3(1.0f, 0.0f, 0.0f);
        UNIT_Y = new Vector3(0.0f, 1.0f, 0.0f);
        UNIT_Z = new Vector3(0.0f, 0.0f, 1.0f);
    }

    public Vector3() {
    }

    public final void add(Vector3 r3) {
        this.f37846x += r3.f37846x;
        this.f37847y += r3.f37847y;
        this.f37848z += r3.f37848z;
    }

    public final Vector3 cross(Vector3 r8) {
        float r1 = this.f37847y;
        float r2 = r8.f37848z;
        float r4 = this.f37848z;
        float r5 = r8.f37847y;
        float r3 = (r1 * r2) - (r4 * r5);
        float r82 = r8.f37846x;
        float r6 = this.f37846x;
        return new Vector3(r3, (r4 * r82) - (r2 * r6), (r6 * r5) - (r1 * r82));
    }

    public final float distance2(Vector3 r4) {
        float r02 = this.f37846x - r4.f37846x;
        float r1 = this.f37847y - r4.f37847y;
        float r2 = this.f37848z - r4.f37848z;
        return ((r02 * r02) + (r1 * r1)) + (r2 * r2);
    }

    public final void divide(float r2) {
        if (r2 == 0.0f) goto L6;
        this.f37846x /= r2;
        this.f37847y /= r2;
        this.f37848z /= r2;
        return;
    }

    public final float dot(Vector3 r4) {
        return ((this.f37846x * r4.f37846x) + (this.f37847y * r4.f37847y)) + (this.f37848z * r4.f37848z);
    }

    public final float length() {
        return (float) Math.sqrt(length2());
    }

    public final float length2() {
        float r02 = this.f37846x;
        float r1 = this.f37847y;
        float r03 = (r02 * r02) + (r1 * r1);
        float r12 = this.f37848z;
        return r03 + (r12 * r12);
    }

    public final void multiply(float r2) {
        this.f37846x *= r2;
        this.f37847y *= r2;
        this.f37848z *= r2;
    }

    public final float normalize() {
        float r02 = length();
        if (r02 == 0.0f) goto L5;
        this.f37846x /= r02;
        this.f37847y /= r02;
        this.f37848z /= r02;
    L5:
        return r02;
    }

    public final boolean pointsInSameDirection(Vector3 r2) {
        if (dot(r2) <= 0.0f) goto L6;
        return true;
    L6:
        return false;
    }

    public final void set(Vector3 r2) {
        this.f37846x = r2.f37846x;
        this.f37847y = r2.f37847y;
        this.f37848z = r2.f37848z;
    }

    public final void subtract(Vector3 r3) {
        this.f37846x -= r3.f37846x;
        this.f37847y -= r3.f37847y;
        this.f37848z -= r3.f37848z;
    }

    public final void subtractMultiple(Vector3 r3, float r4) {
        this.f37846x -= r3.f37846x * r4;
        this.f37847y -= r3.f37847y * r4;
        this.f37848z -= r3.f37848z * r4;
    }

    public final void zero() {
        set(0.0f, 0.0f, 0.0f);
    }

    public Vector3(float[] r4) {
        set(r4[0], r4[1], r4[2]);
    }

    public Vector3(float r1, float r2, float r3) {
        set(r1, r2, r3);
    }

    public final void add(float r2, float r3, float r4) {
        this.f37846x += r2;
        this.f37847y += r3;
        this.f37848z += r4;
    }

    public final void multiply(Vector3 r3) {
        this.f37846x *= r3.f37846x;
        this.f37847y *= r3.f37847y;
        this.f37848z *= r3.f37848z;
    }

    public final void set(float r1, float r2, float r3) {
        this.f37846x = r1;
        this.f37847y = r2;
        this.f37848z = r3;
    }

    public Vector3(Vector3 r1) {
        set(r1);
    }
}
