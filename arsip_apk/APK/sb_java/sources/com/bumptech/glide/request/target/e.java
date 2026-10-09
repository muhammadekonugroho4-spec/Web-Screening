package com.bumptech.glide.request.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.request.transition.d;

/* loaded from: classes4.dex */
public abstract class e extends i implements d.a {

    /* renamed from: h, reason: collision with root package name */
    public Animatable f33348h;

    public e(ImageView r1) {
        super(r1);
    }

    @Override // com.bumptech.glide.request.transition.d.a
    public Drawable c() {
        return ((ImageView) this.f33351a).getDrawable();
    }

    @Override // com.bumptech.glide.request.target.i, com.bumptech.glide.request.target.a, com.bumptech.glide.request.target.h
    public void d(Drawable r2) {
        super.d(r2);
        Animatable r02 = this.f33348h;
        if (r02 == null) goto L5;
        r02.stop();
    L5:
        q(null);
        f(r2);
    }

    @Override // com.bumptech.glide.request.target.h
    public void e(Object r1, com.bumptech.glide.request.transition.d r2) {
        if (r2 != null) goto L4;
    L8:
        q(r1);
        return;
    L4:
        if (r2.a(r1, this) == false) goto L8;
        o(r1);
    }

    @Override // com.bumptech.glide.request.transition.d.a
    public void f(Drawable r2) {
        ((ImageView) this.f33351a).setImageDrawable(r2);
    }

    @Override // com.bumptech.glide.request.target.i, com.bumptech.glide.request.target.a, com.bumptech.glide.request.target.h
    public void g(Drawable r2) {
        super.g(r2);
        q(null);
        f(r2);
    }

    @Override // com.bumptech.glide.request.target.a, com.bumptech.glide.request.target.h
    public void i(Drawable r2) {
        super.i(r2);
        q(null);
        f(r2);
    }

    public final void o(Object r2) {
        if ((r2 instanceof Animatable) == false) goto L6;
        Animatable r22 = (Animatable) r2;
        this.f33348h = r22;
        r22.start();
        return;
    L6:
        this.f33348h = null;
    }

    @Override // com.bumptech.glide.manager.n
    public void onStart() {
        Animatable r02 = this.f33348h;
        if (r02 == null) goto L6;
        r02.start();
        return;
    }

    @Override // com.bumptech.glide.manager.n
    public void onStop() {
        Animatable r02 = this.f33348h;
        if (r02 == null) goto L6;
        r02.stop();
        return;
    }

    public abstract void p(Object r1);

    public final void q(Object r1) {
        p(r1);
        o(r1);
    }
}
