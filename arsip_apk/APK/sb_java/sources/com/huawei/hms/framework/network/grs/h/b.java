package com.huawei.hms.framework.network.grs.h;

import android.text.TextUtils;
import com.google.common.primitives.UnsignedBytes;
import com.huawei.hms.framework.common.Logger;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f39264a = "b";

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f39265b = null;

    static {
        f39265b = Pattern.compile("[0-9]*[a-z|A-Z]*[一-龥]*");
    }

    public static String a(String r1) {
        return a(r1, "SHA-256");
    }

    public static String b(String r6) {
        if (TextUtils.isEmpty(r6) == false) goto L5;
        return r6;
    L5:
        int r2 = 1;
        if (r6.length() != 1) goto L8;
        return "*";
    L8:
        StringBuffer r02 = new StringBuffer();
        int r3 = 0;
    L10:
        if (r3 >= r6.length()) goto L19;
        String r4 = r6.charAt(r3) + "";
        if (f39265b.matcher(r4).matches() == false) goto L17;
        if ((r2 % 2) != 0) goto L16;
        r4 = "*";
    L16:
        r2 = r2 + 1;
    L17:
        r02.append(r4);
        r3 = r3 + 1;
        goto L10
    L19:
        return r02.toString();
    }

    private static String a(String r2, String r3) {
        byte[] r22 = r2.getBytes("UTF-8");     // Catch: UnsupportedEncodingException -> L9
        return a(MessageDigest.getInstance(r3).digest(r22));
    L6:
        String r23 = f39264a;
        String r32 = "encrypt NoSuchAlgorithmException";
    L7:
        Logger.w(r23, r32);
        return null;
    L9:
        r23 = f39264a;
        r32 = "encrypt UnsupportedEncodingException";
        goto L7
    }

    private static String a(byte[] r5) {
        StringBuilder r02 = new StringBuilder();
        int r1 = 0;
    L4:
        if (r1 >= r5.length) goto L10;
        String r2 = Integer.toHexString(r5[r1] & UnsignedBytes.MAX_VALUE);
        if (r2.length() != 1) goto L8;
        r02.append("0");
    L8:
        r02.append(r2);
        r1 = r1 + 1;
        goto L4
    L10:
        return r02.toString();
    }
}
