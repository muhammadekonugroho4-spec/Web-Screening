package com.davemorrissey.labs.subscaleview.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;

/* loaded from: classes4.dex */
public interface ImageRegionDecoder {
    Bitmap decodeRegion(Rect r1, int r2);

    Point init(Context r1, Uri r2) throws Exception;

    boolean isReady();

    void recycle();
}
