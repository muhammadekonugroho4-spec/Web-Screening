package com.huawei.hms.framework.common;

import android.util.Base64;
import com.huawei.secure.android.common.util.SafeBase64;

/* loaded from: classes6.dex */
public class SecurityBase64Utils {
    private static volatile boolean IS_AEGIS_BASE64_LIBRARY_LOADED = false;
    private static final String SAFE_BASE64_PATH = "com.huawei.secure.android.common.util.SafeBase64";

    static {
    }

    public SecurityBase64Utils() {
    }

    private static boolean checkCompatible(String r2) {
        ClassLoader r02 = SecurityBase64Utils.class.getClassLoader();
        if (r02 != null) goto L15;
        return false;
    L15:
        r02.loadClass(r2);     // Catch: ClassNotFoundException -> L14
        monitor-enter(SecurityBase64Utils.class);     // Catch: ClassNotFoundException -> L14
        IS_AEGIS_BASE64_LIBRARY_LOADED = true;     // Catch: Throwable -> L11
        monitor-exit(SecurityBase64Utils.class);     // Catch: Throwable -> L11
        return true;
    L11:
        th = move-exception;
        throw th;     // Catch: ClassNotFoundException -> L14
    L14:
        return false;
    }

    public static byte[] decode(String r1, int r2) {
        if (IS_AEGIS_BASE64_LIBRARY_LOADED == true) goto L12;
        if (checkCompatible(SAFE_BASE64_PATH) == true) goto L12;
        return Base64.decode(r1, r2);
    L10:
        return new byte[0];
    L12:
        return SafeBase64.decode(r1, r2);
    }

    public static String encodeToString(byte[] r1, int r2) {
        if (IS_AEGIS_BASE64_LIBRARY_LOADED == true) goto L12;
        if (checkCompatible(SAFE_BASE64_PATH) == true) goto L12;
        return Base64.encodeToString(r1, r2);
    L9:
        return null;
    L12:
        return SafeBase64.encodeToString(r1, r2);
    }
}
