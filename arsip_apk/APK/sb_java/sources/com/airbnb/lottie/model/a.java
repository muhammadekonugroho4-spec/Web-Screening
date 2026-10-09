package com.airbnb.lottie.model;

import android.graphics.PointF;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final PointF f31242a;

    /* renamed from: b, reason: collision with root package name */
    public final PointF f31243b;

    /* renamed from: c, reason: collision with root package name */
    public final PointF f31244c;

    public a() {
        this.f31242a = new PointF();
        this.f31243b = new PointF();
        this.f31244c = new PointF();
    }

    public PointF a() {
        return this.f31242a;
    }

    public PointF b() {
        return this.f31243b;
    }

    public PointF c() {
        return this.f31244c;
    }

    public void d(float r2, float r3) {
        this.f31242a.set(r2, r3);
    }

    public void e(float r2, float r3) {
        this.f31243b.set(r2, r3);
    }

    public void f(float r2, float r3) {
        this.f31244c.set(r2, r3);
    }

    public a(PointF r1, PointF r2, PointF r3) {
        this.f31242a = r1;
        this.f31243b = r2;
        this.f31244c = r3;
    }
}
