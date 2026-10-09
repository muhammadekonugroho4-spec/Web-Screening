package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class e {
    public static /* bridge */ /* synthetic */ Bitmap a(ImageDecoder.Source r02, ImageDecoder$OnHeaderDecodedListener r1) {
        return ImageDecoder.decodeBitmap(r02, r1);
    }
}
