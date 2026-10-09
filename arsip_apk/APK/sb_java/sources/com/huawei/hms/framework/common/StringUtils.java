package com.huawei.hms.framework.common;

import android.text.TextUtils;
import com.huawei.secure.android.common.util.SafeString;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes6.dex */
public class StringUtils {
    private static final int INIT_CAPACITY = 1024;
    private static boolean IS_AEGIS_STRING_LIBRARY_LOADED = false;
    private static final String SAFE_STRING_PATH = "com.huawei.secure.android.common.util.SafeString";
    private static final String TAG = "StringUtils";

    static {
    }

    public StringUtils() {
    }

    public static String anonymizeMessage(String r2) {
        if (TextUtils.isEmpty(r2) == false) goto L5;
        return r2;
    L5:
        char[] r22 = r2.toCharArray();
        int r02 = 0;
    L7:
        if (r02 >= r22.length) goto L13;
        if ((r02 % 2) == 0) goto L11;
        r22[r02] = '*';
    L11:
        r02 = r02 + 1;
        goto L7
    L13:
        return new String(r22);
    }

    public static String byte2Str(byte[] r3) {
        if (r3 != null) goto L10;
        return "";
    L10:
        return new String(r3, "UTF-8");
    L7:
        e = move-exception;
        Logger.w("StringUtils.byte2str error: UnsupportedEncodingException", anonymizeMessage(e.getMessage()));
        return "";
    }

    private static boolean checkCompatible(String r2) {
        ClassLoader r02 = SecurityBase64Utils.class.getClassLoader();
        if (r02 != null) goto L15;
        return false;
    L15:
        r02.loadClass(r2);     // Catch: ClassNotFoundException -> L14
        monitor-enter(StringUtils.class);     // Catch: ClassNotFoundException -> L14
        IS_AEGIS_STRING_LIBRARY_LOADED = true;     // Catch: Throwable -> L11
        monitor-exit(StringUtils.class);     // Catch: Throwable -> L11
        return true;
    L11:
        th = move-exception;
        throw th;     // Catch: ClassNotFoundException -> L14
    L14:
        return false;
    }

    public static String collection2String(Collection<String> r2) {
        if (r2 != null) goto L4;
        return null;
    L4:
        if (r2.isEmpty() == true) goto L14;
        StringBuilder r02 = new StringBuilder();
        Iterator<String> r22 = r2.iterator();
    L7:
        if (r22.hasNext() == false) goto L10;
        r02.append(r22.next());
        r02.append(";");
        goto L7
    L10:
        return r02.toString().substring(0, r02.length() - 1);
    L14:
        return null;
    }

    public static String format(String r1, Object... r2) {
        if (r1 != null) goto L6;
        return "";
    L6:
        return String.format(Locale.ROOT, r1, r2);
    }

    public static byte[] getBytes(long r02) {
        return getBytes(String.valueOf(r02));
    }

    public static String getTraceInfo(Throwable r5) {
        StackTraceElement[] r52 = r5.getStackTrace();
        StringBuilder r02 = new StringBuilder(1024);
        int r1 = r52.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L6;
        StackTraceElement r3 = r52[r2];
        r02.append("at ");
        r02.append(r3.toString());
        r02.append(";");
        r2 = r2 + 1;
        goto L3
    L6:
        return r02.toString();
    }

    public static String replace(String r2, CharSequence r3, CharSequence r4) {
        if (IS_AEGIS_STRING_LIBRARY_LOADED == false) goto L5;
    L16:
        return SafeString.replace(r2, r3, r4);
    L8:
        Logger.w(TAG, "SafeString.substring error");
    L10:
        if (TextUtils.isEmpty(r2) == false) goto L12;
        return r2;
    L12:
        if (TextUtils.isEmpty(r3) == true) goto L21;
        return r2.replace(r3, r4);
    L22:
        return r2;
    L21:
        return r2;
    L5:
        if (checkCompatible(SAFE_STRING_PATH) == false) goto L10;
        goto L16
    }

    public static byte[] str2Byte(String r2) {
        if (TextUtils.isEmpty(r2) == true) goto L5;
        return r2.getBytes("UTF-8");
    L8:
        e = move-exception;
        Logger.w("StringUtils.str2Byte error: UnsupportedEncodingException", anonymizeMessage(e.getMessage()));
        return new byte[0];
    L5:
        return new byte[0];
    }

    public static boolean strEquals(String r02, String r1) {
        if (r02 == r1) goto L9;
        if (r02 != null) goto L5;
        return false;
    L5:
        if (r02.equals(r1) == true) goto L12;
        return false;
    L12:
        return true;
    L9:
        return true;
    }

    public static boolean stringToBoolean(String r2, boolean r3) {
        if (TextUtils.isEmpty(r2) == false) goto L10;
        return r3;
    L10:
        return Boolean.valueOf(r2).booleanValue();
    L7:
        e = move-exception;
        Logger.w(TAG, "String to Integer catch NumberFormatException." + anonymizeMessage(e.getMessage()));
        return r3;
    }

    public static int stringToInteger(String r2, int r3) {
        if (TextUtils.isEmpty(r2) == false) goto L10;
    L9:
        return r3;
    L10:
        return Integer.parseInt(r2);
    L7:
        e = move-exception;
        Logger.w(TAG, "String to Integer catch NumberFormatException." + anonymizeMessage(e.getMessage()));
        goto L9
    }

    public static long stringToLong(String r2, long r3) {
        if (TextUtils.isEmpty(r2) == false) goto L10;
    L9:
        return r3;
    L10:
        return Long.parseLong(r2);
    L7:
        e = move-exception;
        Logger.w(TAG, "String to Long catch NumberFormatException." + anonymizeMessage(e.getMessage()));
        goto L9
    }

    public static String substring(String r2, int r3) {
        if (checkCompatible(SAFE_STRING_PATH) == false) goto L8;
        return SafeString.substring(r2, r3);
    L6:
        Logger.w(TAG, "SafeString.substring error");
    L8:
        if (TextUtils.isEmpty(r2) == false) goto L10;
    L14:
        return "";
    L10:
        if (r2.length() < r3) goto L14;
        if (r3 < 0) goto L14;
        return r2.substring(r3);
    }

    public static String toLowerCase(String r1) {
        if (r1 != null) goto L6;
        return "";
    L6:
        return r1.toLowerCase(Locale.ROOT);
    }

    public static byte[] getBytes(String r2) {
        byte[] r02 = new byte[0];
        if (r2 != null) goto L9;
    L8:
        return r02;
    L9:
        return r2.getBytes("utf-8");
    L7:
        Logger.w(TAG, "the content has error while it is converted to bytes");
        goto L8
    }

    public static String substring(String r2, int r3, int r4) {
        if (IS_AEGIS_STRING_LIBRARY_LOADED == false) goto L5;
    L19:
        return SafeString.substring(r2, r3, r4);
    L8:
        Logger.w(TAG, "SafeString.substring error");
    L10:
        if (TextUtils.isEmpty(r2) == true) goto L17;
        if (r3 < 0) goto L17;
        if (r4 > r2.length()) goto L17;
        if (r4 < r3) goto L17;
        return r2.substring(r3, r4);
    L17:
        return "";
    L5:
        if (checkCompatible(SAFE_STRING_PATH) == false) goto L10;
        goto L19
    }
}
