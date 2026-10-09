package com.airbnb.lottie.utils;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public float f31623a;

    /* renamed from: b, reason: collision with root package name */
    public int f31624b;

    public f() {
    }

    public void a(float r3) {
        float r02 = this.f31623a + r3;
        this.f31623a = r02;
        int r32 = this.f31624b + 1;
        this.f31624b = r32;
        if (r32 != Integer.MAX_VALUE) goto L6;
        this.f31623a = r02 / 2.0f;
        this.f31624b = r32 / 2;
        return;
    }
}
