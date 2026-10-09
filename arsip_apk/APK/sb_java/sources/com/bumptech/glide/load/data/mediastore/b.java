package com.bumptech.glide.load.data.mediastore;

import android.net.Uri;
import com.clevertap.android.sdk.Constants;

/* loaded from: classes4.dex */
public abstract class b {
    public static boolean a(Uri r1) {
        if (b(r1) == true) goto L5;
        return false;
    L5:
        if (e(r1) == true) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean b(Uri r2) {
        if (r2 != null) goto L4;
        return false;
    L4:
        if ("content".equals(r2.getScheme()) == true) goto L6;
        return false;
    L6:
        if (Constants.KEY_MEDIA.equals(r2.getAuthority()) == false) goto L12;
        return true;
    L12:
        return false;
    }

    public static boolean c(Uri r1) {
        if (b(r1) == true) goto L5;
        return false;
    L5:
        if (e(r1) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public static boolean d(int r1, int r2) {
        if (r1 == Integer.MIN_VALUE) goto L11;
        if (r2 != Integer.MIN_VALUE) goto L6;
        return false;
    L6:
        if (r1 <= 512) goto L8;
        return false;
    L8:
        if (r2 > 384) goto L15;
        return true;
    L15:
        return false;
    L11:
        return false;
    }

    public static boolean e(Uri r1) {
        return r1.getPathSegments().contains("video");
    }
}
