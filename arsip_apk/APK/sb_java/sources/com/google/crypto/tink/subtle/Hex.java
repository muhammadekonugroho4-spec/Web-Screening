package com.google.crypto.tink.subtle;

import com.google.common.primitives.UnsignedBytes;

/* loaded from: classes6.dex */
public final class Hex {
    private Hex() {
    }

    public static byte[] decode(String r6) {
        if ((r6.length() % 2) != 0) goto L14;
        int r02 = r6.length() / 2;
        byte[] r1 = new byte[r02];
        int r2 = 0;
    L5:
        if (r2 >= r02) goto L12;
        int r3 = r2 * 2;
        int r4 = Character.digit(r6.charAt(r3), 16);
        int r32 = Character.digit(r6.charAt(r3 + 1), 16);
        if (r4 == (-1)) goto L11;
        if (r32 == (-1)) goto L11;
        r1[r2] = (byte) ((r4 * 16) + r32);
        r2 = r2 + 1;
    L11:
        throw new IllegalArgumentException("input is not hexadecimal");
    L12:
        return r1;
    L14:
        throw new IllegalArgumentException("Expected a string of even length");
    }

    public static String encode(byte[] r6) {
        StringBuilder r02 = new StringBuilder(r6.length * 2);
        int r1 = r6.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L6;
        int r3 = r6[r2] & UnsignedBytes.MAX_VALUE;
        r02.append("0123456789abcdef".charAt(r3 / 16));
        r02.append("0123456789abcdef".charAt(r3 % 16));
        r2 = r2 + 1;
        goto L3
    L6:
        return r02.toString();
    }
}
