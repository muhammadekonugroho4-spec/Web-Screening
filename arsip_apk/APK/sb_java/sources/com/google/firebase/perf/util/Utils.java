package com.google.firebase.perf.util;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.common.primitives.UnsignedBytes;
import com.google.firebase.perf.logging.AndroidLogger;
import okhttp3.HttpUrl;

/* loaded from: classes6.dex */
public class Utils {
    private static Boolean isDebugLoggingEnabled;

    static {
    }

    public Utils() {
    }

    public static int bufferToInt(byte[] r4) {
        int r02 = 0;
        int r1 = 0;
    L4:
        if (r02 >= 4) goto L8;
        if (r02 >= r4.length) goto L8;
        r1 = r1 | ((r4[r02] & UnsignedBytes.MAX_VALUE) << (r02 * 8));
        r02 = r02 + 1;
    L8:
        return r1;
    }

    public static void checkArgument(boolean r02, String r1) {
        if (r02 == false) goto L5;
        return;
    L5:
        throw new IllegalArgumentException(r1);
    }

    public static boolean isDebugLoggingEnabled(Context r4) {
        Boolean r02 = isDebugLoggingEnabled;
        if (r02 == null) goto L14;
        return r02.booleanValue();
    L14:
        Boolean r42 = Boolean.valueOf(r4.getPackageManager().getApplicationInfo(r4.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));     // Catch: Throwable -> L9 PackageManager.NameNotFoundException -> L11
        isDebugLoggingEnabled = r42;     // Catch: Throwable -> L9 PackageManager.NameNotFoundException -> L11
        return r42.booleanValue();
    L9:
        e = move-exception;
        AndroidLogger.getInstance().debug("No perf logcat meta data found " + e.getMessage());
        return false;
    }

    public static int saturatedIntCast(long r2) {
        if (r2 <= 2147483647L) goto L7;
        return Integer.MAX_VALUE;
    L7:
        if (r2 >= (-2147483648L)) goto L11;
        return Integer.MIN_VALUE;
    L11:
        return (int) r2;
    }

    public static String stripSensitiveInfo(String r1) {
        HttpUrl r02 = HttpUrl.l(r1);
        if (r02 != null) goto L5;
        return r1;
    L5:
        return r02.j().I("").o("").t(null).h(null).toString();
    }

    public static String truncateURL(String r3, int r4) {
        if (r3.length() > r4) goto L6;
        return r3;
    L6:
        if (r3.charAt(r4) == '/') goto L8;
        HttpUrl r02 = HttpUrl.l(r3);
        if (r02 != null) goto L14;
        return r3.substring(0, r4);
    L14:
        if (r02.c().lastIndexOf(47) < 0) goto L20;
        int r03 = r3.lastIndexOf(47, r4 - 1);
        if (r03 < 0) goto L20;
        return r3.substring(0, r03);
    L20:
        return r3.substring(0, r4);
    L8:
        return r3.substring(0, r4);
    }
}
