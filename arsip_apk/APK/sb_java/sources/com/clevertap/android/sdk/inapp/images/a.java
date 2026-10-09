package com.clevertap.android.sdk.inapp.images;

import android.graphics.BitmapFactory;
import java.io.File;

/* loaded from: classes4.dex */
public abstract class a {
    public static final boolean a(File r4) {
        if (r4 != null) goto L5;
    L12:
        return false;
    L5:
        if (r4.exists() == false) goto L12;
        BitmapFactory.Options r1 = new BitmapFactory.Options();
        r1.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(r4.getPath(), r1);
        if (r1.outWidth == (-1)) goto L12;
        if (r1.outHeight == (-1)) goto L12;
        return true;
    }
}
