package com.huawei.agconnect.config.impl;

import com.google.common.base.Ascii;
import com.google.firebase.perf.util.Constants;

/* loaded from: classes6.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f38825a = null;

    static {
        f38825a = "0123456789ABCDEF".toCharArray();
    }

    public static byte[] a(char[] r9) {
        if ((r9.length & 1) != 0) goto L18;
        byte[] r02 = new byte[r9.length >> 1];
        int r1 = 0;
        int r2 = 0;
    L6:
        if (r1 >= r9.length) goto L16;
        int r3 = Character.digit(r9[r1], 16);
        if (r3 == (-1)) goto L15;
        int r7 = r1 + 1;
        int r4 = Character.digit(r9[r7], 16);
        if (r4 == (-1)) goto L13;
        r1 = r1 + 2;
        r02[r2] = (byte) (((r3 << 4) | r4) & Constants.MAX_HOST_LENGTH);
        r2 = r2 + 1;
        goto L6
    L13:
        throw new IllegalArgumentException("Illegal hexadecimal character at index " + r7);
    L15:
        throw new IllegalArgumentException("Illegal hexadecimal character at index " + r1);
    L16:
        return r02;
    L18:
        throw new IllegalArgumentException("Odd number of characters.");
    }

    public static byte[] b(String r02) {
        return a(r02.toCharArray());
    }

    public static String c(byte[] r6) {
        StringBuilder r02 = new StringBuilder(r6.length * 2);
        int r1 = r6.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L6;
        byte r3 = r6[r2];
        char[] r4 = f38825a;
        r02.append(r4[(r3 >> 4) & 15]);
        r02.append(r4[r3 & Ascii.SI]);
        r2 = r2 + 1;
        goto L3
    L6:
        return r02.toString();
    }
}
