package org.minidns.util;

import com.google.common.primitives.UnsignedBytes;

/* loaded from: classes3.dex */
public abstract class b {
    public static String a(byte[] r8) {
        int r02 = (3 - (r8.length % 3)) % 3;
        byte[] r1 = new byte[r8.length + r02];
        System.arraycopy(r8, 0, r1, 0, r8.length);
        StringBuilder r2 = new StringBuilder();
        int r4 = 0;
    L4:
        if (r4 >= r8.length) goto L7;
        int r5 = (((r1[r4] & UnsignedBytes.MAX_VALUE) << 16) + ((r1[r4 + 1] & UnsignedBytes.MAX_VALUE) << 8)) + (r1[r4 + 2] & UnsignedBytes.MAX_VALUE);
        r2.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((r5 >> 18) & 63));
        r2.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((r5 >> 12) & 63));
        r2.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((r5 >> 6) & 63));
        r2.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(r5 & 63));
        r4 = r4 + 3;
        goto L4
    L7:
        return r2.substring(0, r2.length() - r02) + "==".substring(0, r02);
    }
}
