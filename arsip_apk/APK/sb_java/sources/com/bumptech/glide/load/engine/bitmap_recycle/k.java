package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;

/* loaded from: classes4.dex */
public interface k {
    String a(int r1, int r2, Bitmap.Config r3);

    int b(Bitmap r1);

    void c(Bitmap r1);

    Bitmap d(int r1, int r2, Bitmap.Config r3);

    String e(Bitmap r1);

    Bitmap removeLast();
}
