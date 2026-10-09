package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes4.dex */
public final class w implements com.bumptech.glide.load.engine.s, com.bumptech.glide.load.engine.o {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f33112a;

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.s f33113b;

    public w(Resources r1, com.bumptech.glide.load.engine.s r2) {
        this.f33112a = (Resources) com.bumptech.glide.util.k.d(r1);
        this.f33113b = (com.bumptech.glide.load.engine.s) com.bumptech.glide.util.k.d(r2);
    }

    public static com.bumptech.glide.load.engine.s c(Resources r1, com.bumptech.glide.load.engine.s r2) {
        if (r2 != null) goto L6;
        return null;
    L6:
        return new w(r1, r2);
    }

    @Override // com.bumptech.glide.load.engine.s
    public Class a() {
        return BitmapDrawable.class;
    }

    public BitmapDrawable b() {
        return new BitmapDrawable(this.f33112a, (Bitmap) this.f33113b.get());
    }

    @Override // com.bumptech.glide.load.engine.s
    public /* bridge */ /* synthetic */ Object get() {
        return b();
    }

    @Override // com.bumptech.glide.load.engine.s
    public int getSize() {
        return this.f33113b.getSize();
    }

    @Override // com.bumptech.glide.load.engine.o
    public void initialize() {
        com.bumptech.glide.load.engine.s r02 = this.f33113b;
        if ((r02 instanceof com.bumptech.glide.load.engine.o) == false) goto L6;
        ((com.bumptech.glide.load.engine.o) r02).initialize();
        return;
    }

    @Override // com.bumptech.glide.load.engine.s
    public void recycle() {
        this.f33113b.recycle();
    }
}
