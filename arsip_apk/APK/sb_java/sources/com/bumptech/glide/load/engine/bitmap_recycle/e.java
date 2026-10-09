package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;

/* loaded from: classes4.dex */
public class e implements d {
    public e() {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
    public void a(int r1) {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
    public void b() {
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
    public void c(Bitmap r1) {
        r1.recycle();
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
    public Bitmap d(int r1, int r2, Bitmap.Config r3) {
        return Bitmap.createBitmap(r1, r2, r3);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
    public Bitmap e(int r1, int r2, Bitmap.Config r3) {
        return d(r1, r2, r3);
    }
}
