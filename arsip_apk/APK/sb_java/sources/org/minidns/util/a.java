package org.minidns.util;

import com.google.common.primitives.UnsignedBytes;

/* loaded from: classes3.dex */
public abstract class a {
    public static String a(byte[] r14) {
        int r02 = ((int) (8.0d - ((r14.length % 5) * 1.6d))) % 8;
        System.arraycopy(r14, 0, new byte[r14.length + r02], 0, r14.length);
        StringBuilder r3 = new StringBuilder();
        int r5 = 0;
    L4:
        if (r5 >= r14.length) goto L7;
        long r6 = (((((r2[r5] & UnsignedBytes.MAX_VALUE) << 32) + ((r2[r5 + 1] & UnsignedBytes.MAX_VALUE) << 24)) + ((r2[r5 + 2] & UnsignedBytes.MAX_VALUE) << 16)) + ((r2[r5 + 3] & UnsignedBytes.MAX_VALUE) << 8)) + (r2[r5 + 4] & UnsignedBytes.MAX_VALUE);
        r3.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) ((r6 >> 35) & 31)));
        r3.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) ((r6 >> 30) & 31)));
        r3.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) ((r6 >> 25) & 31)));
        r3.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) ((r6 >> 20) & 31)));
        r3.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) ((r6 >> 15) & 31)));
        r3.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) ((r6 >> 10) & 31)));
        r3.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) ((r6 >> 5) & 31)));
        r3.append("0123456789ABCDEFGHIJKLMNOPQRSTUV".charAt((int) (r6 & 31)));
        r5 = r5 + 5;
        goto L4
    L7:
        return r3.substring(0, r3.length() - r02) + "======".substring(0, r02);
    }
}
