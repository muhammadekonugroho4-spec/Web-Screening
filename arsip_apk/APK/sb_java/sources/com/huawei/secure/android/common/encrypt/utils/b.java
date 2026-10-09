package com.huawei.secure.android.common.encrypt.utils;

import android.text.TextUtils;
import com.google.common.primitives.UnsignedBytes;
import java.util.Locale;

/* loaded from: classes6.dex */
public abstract class b {
    public static String a(byte[] r5) {
        if (r5 != null) goto L4;
        return "";
    L4:
        if (r5.length == 0) goto L20;
        StringBuilder r02 = new StringBuilder();
        int r1 = 0;
    L8:
        if (r1 >= r5.length) goto L14;
        String r2 = Integer.toHexString(r5[r1] & UnsignedBytes.MAX_VALUE);
        if (r2.length() != 1) goto L12;
        r02.append('0');
    L12:
        r02.append(r2);
        r1 = r1 + 1;
        goto L8
    L14:
        return r02.toString();
    L20:
        return "";
    }

    public static byte[] b(String r12) {
        if (TextUtils.isEmpty(r12) == true) goto L5;
        String r122 = r12.toUpperCase(Locale.ENGLISH);
        int r3 = r122.length() / 2;
        byte[] r5 = new byte[r3];
        byte[] r123 = r122.getBytes("UTF-8");     // Catch: NumberFormatException -> L11 Throwable -> L13
        int r6 = 0;
    L8:
        if (r6 >= r3) goto L15;
        StringBuilder r7 = new StringBuilder();     // Catch: NumberFormatException -> L11 Throwable -> L13
        r7.append("0x");     // Catch: NumberFormatException -> L11 Throwable -> L13
        int r9 = r6 * 2;     // Catch: NumberFormatException -> L11 Throwable -> L13
        r7.append(new String(new byte[]{r123[r9]}, "UTF-8"));     // Catch: NumberFormatException -> L11 Throwable -> L13
        r5[r6] = (byte) (((byte) (Byte.decode(r7.toString()).byteValue() << 4)) ^ Byte.decode("0x" + new String(new byte[]{r123[r9 + 1]}, "UTF-8")).byteValue());     // Catch: NumberFormatException -> L11 Throwable -> L13
        r6 = r6 + 1;
    L15:
        return r5;
    L13:
        e = move-exception;
        c.c("HexUtil", "hex string 2 byte array exception : " + e.getMessage());
        goto L15
    L5:
        return new byte[0];
    }
}
