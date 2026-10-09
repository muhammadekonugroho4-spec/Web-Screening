package com.airbnb.lottie.value;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.airbnb.lottie.d f31631a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f31632b;

    /* renamed from: c, reason: collision with root package name */
    public Object f31633c;
    public final Interpolator d;

    /* renamed from: e, reason: collision with root package name */
    public final Interpolator f31634e;

    /* renamed from: f, reason: collision with root package name */
    public final Interpolator f31635f;

    /* renamed from: g, reason: collision with root package name */
    public final float f31636g;

    /* renamed from: h, reason: collision with root package name */
    public Float f31637h;

    /* renamed from: i, reason: collision with root package name */
    public float f31638i;

    /* renamed from: j, reason: collision with root package name */
    public float f31639j;

    /* renamed from: k, reason: collision with root package name */
    public int f31640k;

    /* renamed from: l, reason: collision with root package name */
    public int f31641l;

    /* renamed from: m, reason: collision with root package name */
    public float f31642m;

    /* renamed from: n, reason: collision with root package name */
    public float f31643n;

    /* renamed from: o, reason: collision with root package name */
    public PointF f31644o;

    /* renamed from: p, reason: collision with root package name */
    public PointF f31645p;

    public a(com.airbnb.lottie.d r2, Object r3, Object r4, Interpolator r5, float r6, Float r7) {
        this.f31638i = -3987645.8f;
        this.f31639j = -3987645.8f;
        this.f31640k = 784923401;
        this.f31641l = 784923401;
        this.f31642m = Float.MIN_VALUE;
        this.f31643n = Float.MIN_VALUE;
        this.f31644o = null;
        this.f31645p = null;
        this.f31631a = r2;
        this.f31632b = r3;
        this.f31633c = r4;
        this.d = r5;
        this.f31634e = null;
        this.f31635f = null;
        this.f31636g = r6;
        this.f31637h = r7;
    }

    public boolean a(float r2) {
        if (r2 >= e()) goto L5;
        return false;
    L5:
        if (r2 >= b()) goto L10;
        return true;
    L10:
        return false;
    }

    public float b() {
        if (this.f31631a != null) goto L6;
        return 1.0f;
    L6:
        if (this.f31643n != Float.MIN_VALUE) goto L12;
        if (this.f31637h != null) goto L10;
        this.f31643n = 1.0f;
        goto L12
    L10:
        this.f31643n = e() + ((this.f31637h.floatValue() - this.f31636g) / this.f31631a.e());
    L12:
        return this.f31643n;
    }

    public float c() {
        if (this.f31639j != (-3987645.8f)) goto L6;
        this.f31639j = ((Float) this.f31633c).floatValue();
    L6:
        return this.f31639j;
    }

    public int d() {
        if (this.f31641l != 784923401) goto L6;
        this.f31641l = ((Integer) this.f31633c).intValue();
    L6:
        return this.f31641l;
    }

    public float e() {
        com.airbnb.lottie.d r02 = this.f31631a;
        if (r02 != null) goto L7;
        return 0.0f;
    L7:
        if (this.f31642m != Float.MIN_VALUE) goto L10;
        this.f31642m = (this.f31636g - r02.p()) / this.f31631a.e();
    L10:
        return this.f31642m;
    }

    public float f() {
        if (this.f31638i != (-3987645.8f)) goto L6;
        this.f31638i = ((Float) this.f31632b).floatValue();
    L6:
        return this.f31638i;
    }

    public int g() {
        if (this.f31640k != 784923401) goto L6;
        this.f31640k = ((Integer) this.f31632b).intValue();
    L6:
        return this.f31640k;
    }

    public boolean h() {
        if (this.d == null) goto L5;
        return false;
    L5:
        if (this.f31634e == null) goto L7;
        return false;
    L7:
        if (this.f31635f != null) goto L13;
        return true;
    L13:
        return false;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f31632b + ", endValue=" + this.f31633c + ", startFrame=" + this.f31636g + ", endFrame=" + this.f31637h + ", interpolator=" + this.d + '}';
    }

    public a(com.airbnb.lottie.d r2, Object r3, Object r4, Interpolator r5, Interpolator r6, float r7, Float r8) {
        this.f31638i = -3987645.8f;
        this.f31639j = -3987645.8f;
        this.f31640k = 784923401;
        this.f31641l = 784923401;
        this.f31642m = Float.MIN_VALUE;
        this.f31643n = Float.MIN_VALUE;
        this.f31644o = null;
        this.f31645p = null;
        this.f31631a = r2;
        this.f31632b = r3;
        this.f31633c = r4;
        this.d = null;
        this.f31634e = r5;
        this.f31635f = r6;
        this.f31636g = r7;
        this.f31637h = r8;
    }

    public a(com.airbnb.lottie.d r2, Object r3, Object r4, Interpolator r5, Interpolator r6, Interpolator r7, float r8, Float r9) {
        this.f31638i = -3987645.8f;
        this.f31639j = -3987645.8f;
        this.f31640k = 784923401;
        this.f31641l = 784923401;
        this.f31642m = Float.MIN_VALUE;
        this.f31643n = Float.MIN_VALUE;
        this.f31644o = null;
        this.f31645p = null;
        this.f31631a = r2;
        this.f31632b = r3;
        this.f31633c = r4;
        this.d = r5;
        this.f31634e = r6;
        this.f31635f = r7;
        this.f31636g = r8;
        this.f31637h = r9;
    }

    public a(Object r3) {
        this.f31638i = -3987645.8f;
        this.f31639j = -3987645.8f;
        this.f31640k = 784923401;
        this.f31641l = 784923401;
        this.f31642m = Float.MIN_VALUE;
        this.f31643n = Float.MIN_VALUE;
        this.f31644o = null;
        this.f31645p = null;
        this.f31631a = null;
        this.f31632b = r3;
        this.f31633c = r3;
        this.d = null;
        this.f31634e = null;
        this.f31635f = null;
        this.f31636g = Float.MIN_VALUE;
        this.f31637h = Float.valueOf(Float.MAX_VALUE);
    }
}
