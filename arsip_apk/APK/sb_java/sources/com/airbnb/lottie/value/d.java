package com.airbnb.lottie.value;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public float f31655a;

    /* renamed from: b, reason: collision with root package name */
    public float f31656b;

    public d(float r1, float r2) {
        this.f31655a = r1;
        this.f31656b = r2;
    }

    public boolean a(float r2, float r3) {
        if (this.f31655a == r2) goto L5;
        return false;
    L5:
        if (this.f31656b != r3) goto L10;
        return true;
    L10:
        return false;
    }

    public float b() {
        return this.f31655a;
    }

    public float c() {
        return this.f31656b;
    }

    public void d(float r1, float r2) {
        this.f31655a = r1;
        this.f31656b = r2;
    }

    public String toString() {
        return b() + "x" + c();
    }

    public d() {
        this(1.0f, 1.0f);
    }
}
