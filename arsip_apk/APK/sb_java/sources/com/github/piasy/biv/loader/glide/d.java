package com.github.piasy.biv.loader.glide;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.target.g;
import com.bumptech.glide.request.target.h;
import com.bumptech.glide.util.l;
import java.io.File;

/* loaded from: classes4.dex */
public class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final int f37920a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37921b;

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.request.d f37922c;

    public d() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.bumptech.glide.request.target.h
    public com.bumptech.glide.request.d a() {
        return this.f37922c;
    }

    @Override // com.bumptech.glide.request.target.h
    public void b(g r1) {
    }

    public void c(File r1, com.bumptech.glide.request.transition.d r2) {
    }

    @Override // com.bumptech.glide.request.target.h
    public void d(Drawable r1) {
    }

    @Override // com.bumptech.glide.request.target.h
    public /* bridge */ /* synthetic */ void e(Object r1, com.bumptech.glide.request.transition.d r2) {
        c((File) r1, r2);
    }

    @Override // com.bumptech.glide.request.target.h
    public void g(Drawable r1) {
    }

    @Override // com.bumptech.glide.request.target.h
    public void h(com.bumptech.glide.request.d r1) {
        this.f37922c = r1;
    }

    @Override // com.bumptech.glide.request.target.h
    public void i(Drawable r1) {
    }

    @Override // com.bumptech.glide.request.target.h
    public final void j(g r3) {
        if (l.u(this.f37920a, this.f37921b) == false) goto L7;
        r3.e(this.f37920a, this.f37921b);
        return;
    L7:
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.f37920a + " and height: " + this.f37921b + ", either provide dimensions in the constructor or call override()");
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

    public d(int r1, int r2) {
        this.f37920a = r1;
        this.f37921b = r2;
    }
}
