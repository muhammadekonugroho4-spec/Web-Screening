package com.google.crypto.tink.subtle;

import com.google.firebase.perf.util.Constants;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class Bytes {
    private Bytes() {
    }

    public static int byteArrayToInt(byte[] r1) {
        return byteArrayToInt(r1, r1.length);
    }

    public static byte[] concat(byte[]... r7) throws GeneralSecurityException {
        int r02 = r7.length;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r2 >= r02) goto L9;
        byte[] r4 = r7[r2];
        if (r3 > (Integer.MAX_VALUE - r4.length)) goto L8;
        r3 = r3 + r4.length;
        r2 = r2 + 1;
        goto L3
    L8:
        throw new GeneralSecurityException("exceeded size limit");
    L9:
        byte[] r03 = new byte[r3];
        int r22 = r7.length;
        int r32 = 0;
        int r42 = 0;
    L10:
        if (r32 >= r22) goto L12;
        byte[] r5 = r7[r32];
        System.arraycopy(r5, 0, r03, r42, r5.length);
        r42 = r42 + r5.length;
        r32 = r32 + 1;
        goto L10
    L12:
        return r03;
    }

    public static final boolean equal(byte[] r02, byte[] r1) {
        return MessageDigest.isEqual(r02, r1);
    }

    public static byte[] intToByteArray(int r3, int r4) {
        byte[] r02 = new byte[r3];
        int r1 = 0;
    L3:
        if (r1 >= r3) goto L5;
        r02[r1] = (byte) ((r4 >> (r1 * 8)) & Constants.MAX_HOST_LENGTH);
        r1 = r1 + 1;
        goto L3
    L5:
        return r02;
    }

    public static final byte[] xor(byte[] r4, int r5, byte[] r6, int r7, int r8) {
        if (r8 < 0) goto L12;
        if ((r4.length - r8) < r5) goto L12;
        if ((r6.length - r8) < r7) goto L12;
        byte[] r02 = new byte[r8];
        int r1 = 0;
    L8:
        if (r1 >= r8) goto L10;
        r02[r1] = (byte) (r4[r1 + r5] ^ r6[r1 + r7]);
        r1 = r1 + 1;
        goto L8
    L10:
        return r02;
    L12:
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    public static final byte[] xorEnd(byte[] r5, byte[] r6) {
        if (r5.length < r6.length) goto L10;
        int r02 = r5.length - r6.length;
        byte[] r52 = Arrays.copyOf(r5, r5.length);
        int r1 = 0;
    L6:
        if (r1 >= r6.length) goto L8;
        int r2 = r02 + r1;
        r52[r2] = (byte) (r52[r2] ^ r6[r1]);
        r1 = r1 + 1;
        goto L6
    L8:
        return r52;
    L10:
        throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
    }

    public static int byteArrayToInt(byte[] r1, int r2) {
        return byteArrayToInt(r1, 0, r2);
    }

    public static int byteArrayToInt(byte[] r4, int r5, int r6) {
        int r02 = 0;
        int r1 = 0;
    L3:
        if (r02 >= r6) goto L5;
        r1 = r1 + ((r4[r02 + r5] & Constants.MAX_HOST_LENGTH) << (r02 * 8));
        r02 = r02 + 1;
        goto L3
    L5:
        return r1;
    }

    public static final void xor(ByteBuffer r3, ByteBuffer r4, ByteBuffer r5, int r6) {
        if (r6 < 0) goto L14;
        if (r4.remaining() < r6) goto L14;
        if (r5.remaining() < r6) goto L14;
        if (r3.remaining() < r6) goto L14;
        int r02 = 0;
    L10:
        if (r02 >= r6) goto L12;
        r3.put((byte) (r4.get() ^ r5.get()));
        r02 = r02 + 1;
        goto L10
    L12:
        return;
    L14:
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }

    public static final byte[] xor(byte[] r2, byte[] r3) {
        if (r2.length != r3.length) goto L7;
        return xor(r2, 0, r3, 0, r2.length);
    L7:
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }
}
