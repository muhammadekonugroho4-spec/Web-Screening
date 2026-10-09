package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class D {
    public static /* bridge */ /* synthetic */ Bitmap a(MediaMetadataRetriever r02, long r1, int r3, int r4, int r5) {
        return r02.getScaledFrameAtTime(r1, r3, r4, r5);
    }
}
