package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.util.l;

/* loaded from: classes4.dex */
public abstract class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final int f33345a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33346b;

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.request.d f33347c;

    public c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.bumptech.glide.request.target.h
    public final com.bumptech.glide.request.d a() {
        return this.f33347c;
    }

    @Override // com.bumptech.glide.request.target.h
    public final void b(g r1) {
    }

    @Override // com.bumptech.glide.request.target.h
    public void g(Drawable r1) {
    }

    @Override // com.bumptech.glide.request.target.h
    public final void h(com.bumptech.glide.request.d r1) {
        this.f33347c = r1;
    }

    @Override // com.bumptech.glide.request.target.h
    public void i(Drawable r1) {
    }

    @Override // com.bumptech.glide.request.target.h
    public final void j(g r3) {
        r3.e(this.f33345a, this.f33346b);
    }

    @Override // com.bumptech.glide.manager.n
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.n
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.n
    public void onStop() {
    }

    public c(int r4, int r5) {
        if (l.u(r4, r5) == false) goto L7;
        this.f33345a = r4;
        this.f33346b = r5;
        return;
    L7:
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + r4 + " and height: " + r5);
    }
}
