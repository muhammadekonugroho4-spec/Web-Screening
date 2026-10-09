package com.bumptech.glide.load.resource.drawable;

import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.drawable.Drawable;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ Drawable a(ImageDecoder.Source r02, ImageDecoder$OnHeaderDecodedListener r1) {
        return ImageDecoder.decodeDrawable(r02, r1);
    }
}
