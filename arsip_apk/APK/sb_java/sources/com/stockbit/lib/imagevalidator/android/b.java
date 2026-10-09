package com.stockbit.lib.imagevalidator.android;

import android.content.ContentResolver;
import android.graphics.ImageDecoder;
import android.net.Uri;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ ImageDecoder.Source a(ContentResolver r02, Uri r1) {
        return ImageDecoder.createSource(r02, r1);
    }
}
