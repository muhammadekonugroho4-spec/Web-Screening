package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;

/* loaded from: classes4.dex */
public class g implements com.bumptech.glide.load.engine.s, com.bumptech.glide.load.engine.o {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f33068a;

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.bitmap_recycle.d f33069b;

    public g(Bitmap r2, com.bumptech.glide.load.engine.bitmap_recycle.d r3) {
        this.f33068a = (Bitmap) com.bumptech.glide.util.k.e(r2, "Bitmap must not be null");
        this.f33069b = (com.bumptech.glide.load.engine.bitmap_recycle.d) com.bumptech.glide.util.k.e(r3, "BitmapPool must not be null");
    }

    public static g c(Bitmap r1, com.bumptech.glide.load.engine.bitmap_recycle.d r2) {
        if (r1 != null) goto L6;
        return null;
    L6:
        return new g(r1, r2);
    }

    @Override // com.bumptech.glide.load.engine.s
    public Class a() {
        return Bitmap.class;
    }

    public Bitmap b() {
        return this.f33068a;
    }

    @Override // com.bumptech.glide.load.engine.s
    public /* bridge */ /* synthetic */ Object get() {
        return b();
    }

    @Override // com.bumptech.glide.load.engine.s
    public int getSize() {
        return com.bumptech.glide.util.l.h(this.f33068a);
    }

    @Override // com.bumptech.glide.load.engine.o
    public void initialize() {
        this.f33068a.prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.s
    public void recycle() {
        this.f33069b.c(this.f33068a);
    }
}
