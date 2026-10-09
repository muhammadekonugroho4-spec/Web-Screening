package com.github.piasy.biv.loader.glide;

import android.graphics.drawable.Drawable;

/* loaded from: classes4.dex */
public class GlideLoaderException extends RuntimeException {
    private final Drawable mErrorDrawable;

    public GlideLoaderException(Drawable r1) {
        this.mErrorDrawable = r1;
    }
}
