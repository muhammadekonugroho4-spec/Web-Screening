package com.huawei.hms.common.util;

import android.util.Base64;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes6.dex */
public final class Base64Utils {
    public Base64Utils() {
    }

    public static byte[] decode(String r3) {
        byte[] r1 = new byte[0];
        if (r3 != null) goto L9;
    L8:
        return r1;
    L9:
        return Base64.decode(r3, 0);
    L6:
        e = move-exception;
        HMSLog.e("Base64Utils", "decode failed : " + e.getMessage());
        goto L8
    }

    public static byte[] decodeUrlSafe(String r3) {
        byte[] r02 = new byte[0];
        if (r3 != null) goto L10;
    L9:
        return r02;
    L10:
        return Base64.decode(r3, 10);
    L7:
        e = move-exception;
        HMSLog.e("Base64Utils", "decodeUrlSafe failed : " + e.getMessage());
        goto L9
    }

    public static byte[] decodeUrlSafeNoPadding(String r3) {
        byte[] r02 = new byte[0];
        if (r3 != null) goto L10;
    L9:
        return r02;
    L10:
        return Base64.decode(r3, 11);
    L7:
        e = move-exception;
        HMSLog.e("Base64Utils", "decodeUrlSafeNoPadding failed : " + e.getMessage());
        goto L9
    }

    public static String encode(byte[] r1) {
        if (r1 != null) goto L4;
        return null;
    L4:
        return Base64.encodeToString(r1, 0);
    }

    public static String encodeUrlSafe(byte[] r1) {
        if (r1 != null) goto L4;
        return null;
    L4:
        return Base64.encodeToString(r1, 10);
    }

    public static String encodeUrlSafeNoPadding(byte[] r1) {
        if (r1 != null) goto L4;
        return null;
    L4:
        return Base64.encodeToString(r1, 11);
    }
}
