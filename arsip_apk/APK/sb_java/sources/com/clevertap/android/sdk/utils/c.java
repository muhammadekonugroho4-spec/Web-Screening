package com.clevertap.android.sdk.utils;

import android.graphics.Bitmap;

/* loaded from: classes4.dex */
public abstract class c {
    public static final int a(Object r1) {
        if ((r1 instanceof Bitmap) == false) goto L7;
        return ((Bitmap) r1).getByteCount() / 1024;
    L7:
        if ((r1 instanceof byte[]) == true) goto L9;
        return 1;
    L9:
        return ((byte[]) r1).length / 1024;
    }
}
