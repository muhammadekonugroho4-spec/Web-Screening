package com.nineoldandroids.view.animation;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public final class a extends Animation {

    /* renamed from: q, reason: collision with root package name */
    public static final boolean f43617q = false;

    /* renamed from: r, reason: collision with root package name */
    public static final WeakHashMap f43618r = null;

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f43619a;

    /* renamed from: b, reason: collision with root package name */
    public final Camera f43620b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f43621c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public float f43622e;

    /* renamed from: f, reason: collision with root package name */
    public float f43623f;

    /* renamed from: g, reason: collision with root package name */
    public float f43624g;

    /* renamed from: h, reason: collision with root package name */
    public float f43625h;

    /* renamed from: i, reason: collision with root package name */
    public float f43626i;

    /* renamed from: j, reason: collision with root package name */
    public float f43627j;

    /* renamed from: k, reason: collision with root package name */
    public float f43628k;

    /* renamed from: l, reason: collision with root package name */
    public float f43629l;

    /* renamed from: m, reason: collision with root package name */
    public float f43630m;

    /* renamed from: n, reason: collision with root package name */
    public final RectF f43631n;

    /* renamed from: o, reason: collision with root package name */
    public final RectF f43632o;

    /* renamed from: p, reason: collision with root package name */
    public final Matrix f43633p;

    static {
        if (Integer.valueOf(Build.VERSION.SDK).intValue() >= 11) goto L5;
        boolean r02 = true;
    L6:
        f43617q = r02;
        f43618r = new WeakHashMap();
        return;
    L5:
        r02 = false;
        goto L6
    }

    public a(View r3) {
        this.f43620b = new Camera();
        this.d = 1.0f;
        this.f43627j = 1.0f;
        this.f43628k = 1.0f;
        this.f43631n = new RectF();
        this.f43632o = new RectF();
        this.f43633p = new Matrix();
        setDuration(0);
        setFillAfter(true);
        r3.setAnimation(this);
        this.f43619a = new WeakReference(r3);
    }

    public static a J(View r3) {
        WeakHashMap r02 = f43618r;
        a r1 = (a) r02.get(r3);
        if (r1 != null) goto L5;
    L8:
        a r12 = new a(r3);
        r02.put(r3, r12);
        return r12;
    L5:
        if (r1 != r3.getAnimation()) goto L8;
        return r1;
    }

    public void A(float r2) {
        if (this.f43627j == r2) goto L6;
        s();
        this.f43627j = r2;
        r();
        return;
    }

    public void C(float r2) {
        if (this.f43628k == r2) goto L6;
        s();
        this.f43628k = r2;
        r();
        return;
    }

    public void D(float r2) {
        if (this.f43629l == r2) goto L6;
        s();
        this.f43629l = r2;
        r();
        return;
    }

    public void F(float r2) {
        if (this.f43630m == r2) goto L6;
        s();
        this.f43630m = r2;
        r();
        return;
    }

    public void G(float r2) {
        if (((View) this.f43619a.get()) == null) goto L6;
        D(r2 - r0.getLeft());
        return;
    }

    public void H(float r2) {
        if (((View) this.f43619a.get()) == null) goto L6;
        F(r2 - r0.getTop());
        return;
    }

    public final void I(Matrix r9, View r10) {
        float r02 = r10.getWidth();
        float r102 = r10.getHeight();
        boolean r1 = this.f43621c;
        if (r1 == false) goto L5;
        float r3 = this.f43622e;
    L6:
        if (r1 == false) goto L8;
        float r12 = this.f43623f;
    L9:
        float r2 = this.f43624g;
        float r4 = this.f43625h;
        float r5 = this.f43626i;
        if (r2 == 0.0f) goto L12;
    L15:
        Camera r6 = this.f43620b;
        r6.save();
        r6.rotateX(r2);
        r6.rotateY(r4);
        r6.rotateZ(-r5);
        r6.getMatrix(r9);
        r6.restore();
        r9.preTranslate(-r3, -r12);
        r9.postTranslate(r3, r12);
    L16:
        float r22 = this.f43627j;
        float r42 = this.f43628k;
        if (r22 == 1.0f) goto L19;
    L20:
        r9.postScale(r22, r42);
        r9.postTranslate((-(r3 / r02)) * ((r22 * r02) - r02), (-(r12 / r102)) * ((r42 * r102) - r102));
    L21:
        r9.postTranslate(this.f43629l, this.f43630m);
        return;
    L19:
        if (r42 == 1.0f) goto L21;
    L12:
        if (r4 != 0.0f) goto L15;
        if (r5 == 0.0f) goto L16;
    L8:
        r12 = r102 / 2.0f;
        goto L9
    L5:
        r3 = r02 / 2.0f;
        goto L6
    }

    public final void a(RectF r4, View r5) {
        r4.set(0.0f, 0.0f, r5.getWidth(), r5.getHeight());
        Matrix r02 = this.f43633p;
        r02.reset();
        I(r02, r5);
        this.f43633p.mapRect(r4);
        r4.offset(r5.getLeft(), r5.getTop());
        float r52 = r4.right;
        float r03 = r4.left;
        if (r52 >= r03) goto L5;
        r4.right = r03;
        r4.left = r52;
    L5:
        float r53 = r4.bottom;
        float r04 = r4.top;
        if (r53 >= r04) goto L9;
        r4.top = r53;
        r4.bottom = r04;
        return;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float r2, Transformation r3) {
        View r22 = (View) this.f43619a.get();
        if (r22 == null) goto L6;
        r3.setAlpha(this.d);
        I(r3.getMatrix(), r22);
        return;
    }

    public float b() {
        return this.d;
    }

    public float c() {
        return this.f43622e;
    }

    public float e() {
        return this.f43623f;
    }

    public float g() {
        return this.f43626i;
    }

    public float h() {
        return this.f43624g;
    }

    public float i() {
        return this.f43625h;
    }

    public float j() {
        return this.f43627j;
    }

    public float k() {
        return this.f43628k;
    }

    public int l() {
        View r02 = (View) this.f43619a.get();
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.getScrollX();
    }

    public int m() {
        View r02 = (View) this.f43619a.get();
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.getScrollY();
    }

    public float n() {
        return this.f43629l;
    }

    public float o() {
        return this.f43630m;
    }

    public float p() {
        if (((View) this.f43619a.get()) != null) goto L7;
        return 0.0f;
    L7:
        return r0.getLeft() + this.f43629l;
    }

    public float q() {
        if (((View) this.f43619a.get()) != null) goto L7;
        return 0.0f;
    L7:
        return r0.getTop() + this.f43630m;
    }

    public final void r() {
        View r02 = (View) this.f43619a.get();
        if (r02 != null) goto L5;
        return;
    L5:
        if (r02.getParent() == null) goto L10;
        RectF r1 = this.f43632o;
        a(r1, r02);
        r1.union(this.f43631n);
        ((View) r02.getParent()).invalidate((int) Math.floor(r1.left), (int) Math.floor(r1.top), (int) Math.ceil(r1.right), (int) Math.ceil(r1.bottom));
        return;
    }

    public final void s() {
        View r02 = (View) this.f43619a.get();
        if (r02 == null) goto L6;
        a(this.f43631n, r02);
        return;
    }

    public void u(float r2) {
        if (this.d == r2) goto L8;
        this.d = r2;
        View r22 = (View) this.f43619a.get();
        if (r22 == null) goto L9;
        r22.invalidate();
        return;
    L9:
        return;
    }

    public void v(float r2) {
        if (this.f43621c == true) goto L5;
    L8:
        s();
        this.f43621c = true;
        this.f43622e = r2;
        r();
        return;
    L5:
        if (this.f43622e != r2) goto L8;
    }

    public void w(float r2) {
        if (this.f43621c == true) goto L5;
    L8:
        s();
        this.f43621c = true;
        this.f43623f = r2;
        r();
        return;
    L5:
        if (this.f43623f != r2) goto L8;
    }

    public void x(float r2) {
        if (this.f43626i == r2) goto L6;
        s();
        this.f43626i = r2;
        r();
        return;
    }

    public void y(float r2) {
        if (this.f43624g == r2) goto L6;
        s();
        this.f43624g = r2;
        r();
        return;
    }

    public void z(float r2) {
        if (this.f43625h == r2) goto L6;
        s();
        this.f43625h = r2;
        r();
        return;
    }
}
