package com.google.android.gms.common.util;

import android.util.Base64;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes5.dex */
public final class Base64Utils {
    public Base64Utils() {
    }

    @KeepForSdk
    public static byte[] decode(String r1) {
        if (r1 != null) goto L6;
        return null;
    L6:
        return Base64.decode(r1, 0);
    }

    @KeepForSdk
    public static byte[] decodeUrlSafe(String r1) {
        if (r1 != null) goto L6;
        return null;
    L6:
        return Base64.decode(r1, 10);
    }

    @KeepForSdk
    public static byte[] decodeUrlSafeNoPadding(String r1) {
        if (r1 != null) goto L6;
        return null;
    L6:
        return Base64.decode(r1, 11);
    }

    @KeepForSdk
    public static String encode(byte[] r1) {
        if (r1 != null) goto L6;
        return null;
    L6:
        return Base64.encodeToString(r1, 0);
    }

    @KeepForSdk
    public static String encodeUrlSafe(byte[] r1) {
        if (r1 != null) goto L6;
        return null;
    L6:
        return Base64.encodeToString(r1, 10);
    }

    @KeepForSdk
    public static String encodeUrlSafeNoPadding(byte[] r1) {
        if (r1 != null) goto L6;
        return null;
    L6:
        return Base64.encodeToString(r1, 11);
    }
}
