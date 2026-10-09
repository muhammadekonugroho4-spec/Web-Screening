package com.github.gcacace.signaturepad.utils;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public float f37617a;

    /* renamed from: b, reason: collision with root package name */
    public float f37618b;

    /* renamed from: c, reason: collision with root package name */
    public long f37619c;

    public f() {
    }

    public float a(f r7) {
        return (float) Math.sqrt(Math.pow(r7.f37617a - this.f37617a, 2.0d) + Math.pow(r7.f37618b - this.f37618b, 2.0d));
    }

    public f b(float r1, float r2) {
        this.f37617a = r1;
        this.f37618b = r2;
        this.f37619c = System.currentTimeMillis();
        return this;
    }

    public float c(f r5) {
        long r02 = this.f37619c - r5.f37619c;
        if (r02 > 0) goto L5;
        r02 = 1;
    L5:
        float r52 = a(r5) / r02;
        if (Float.isInfinite(r52) == false) goto L8;
        return 0.0f;
    L8:
        if (Float.isNaN(r52) == true) goto L13;
        return r52;
    L13:
        return 0.0f;
    }
}
