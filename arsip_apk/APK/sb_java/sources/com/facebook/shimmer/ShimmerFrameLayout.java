package com.facebook.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.shimmer.b;

/* loaded from: classes4.dex */
public class ShimmerFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f36958a;

    /* renamed from: b, reason: collision with root package name */
    public final c f36959b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f36960c;

    public ShimmerFrameLayout(Context r2) {
        super(r2);
        this.f36958a = new Paint();
        this.f36959b = new c();
        this.f36960c = true;
        b(r2, null);
    }

    public void a() {
        if (this.f36960c == true) goto L5;
        return;
    L5:
        f();
        this.f36960c = false;
        invalidate();
    }

    public final void b(Context r3, AttributeSet r4) {
        setWillNotDraw(false);
        this.f36959b.setCallback(this);
        if (r4 != null) goto L6;
        c(new b.a().a());
        return;
    L6:
        TypedArray r32 = r3.obtainStyledAttributes(r4, a.f36961a, 0, 0);
    L12:
        th = move-exception;
        r32.recycle();
        throw th;
    L8:
        if (r32.hasValue(a.f36965f) == true) goto L10;
    L14:
        b.AbstractC0386b r42 = new b.a();     // Catch: Throwable -> L12
    L15:
        c(r42.c(r32).a());     // Catch: Throwable -> L12
        r32.recycle();
        return;
    L10:
        if (r32.getBoolean(a.f36965f, false) == false) goto L14;
        r42 = new b.c();     // Catch: Throwable -> L12
        goto L15
    }

    public ShimmerFrameLayout c(b r2) {
        this.f36959b.d(r2);
        if (r2 != null) goto L5;
    L8:
        setLayerType(0, null);
        return this;
    L5:
        if (r2.f36994o == false) goto L8;
        setLayerType(2, this.f36958a);
        return this;
    }

    public void d(boolean r2) {
        if (this.f36960c == true) goto L10;
        this.f36960c = true;
        if (r2 == false) goto L9;
        e();
        return;
    L9:
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas r2) {
        super.dispatchDraw(r2);
        if (this.f36960c == false) goto L6;
        this.f36959b.draw(r2);
        return;
    }

    public void e() {
        this.f36959b.e();
    }

    public void f() {
        this.f36959b.f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36959b.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        super.onLayout(r1, r2, r3, r4, r5);
        int r22 = getWidth();
        int r32 = getHeight();
        this.f36959b.setBounds(0, 0, r22, r32);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable r2) {
        if (super.verifyDrawable(r2) == false) goto L5;
        return true;
    L5:
        if (r2 == this.f36959b) goto L11;
        return false;
    L11:
        return true;
    }

    public ShimmerFrameLayout(Context r2, AttributeSet r3) {
        super(r2, r3);
        this.f36958a = new Paint();
        this.f36959b = new c();
        this.f36960c = true;
        b(r2, r3);
    }

    public ShimmerFrameLayout(Context r1, AttributeSet r2, int r3) {
        super(r1, r2, r3);
        this.f36958a = new Paint();
        this.f36959b = new c();
        this.f36960c = true;
        b(r1, r2);
    }
}
