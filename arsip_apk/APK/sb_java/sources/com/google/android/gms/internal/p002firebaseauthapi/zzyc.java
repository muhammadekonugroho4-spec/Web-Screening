package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes5.dex */
public final class zzyc {
    public static final void zza(ByteBuffer r3, ByteBuffer r4, ByteBuffer r5, int r6) {
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

    public static byte[] zza(byte[]... r7) throws GeneralSecurityException {
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

    public static final byte[] zza(byte[] r2, byte[] r3) {
        if (r2.length != r3.length) goto L7;
        return zza(r2, 0, r3, 0, r2.length);
    L7:
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static final byte[] zza(byte[] r3, int r4, byte[] r5, int r6, int r7) {
        if (r7 < 0) goto L12;
        if ((r3.length - r7) < r4) goto L12;
        if ((r5.length - r7) < 0) goto L12;
        byte[] r62 = new byte[r7];
        int r02 = 0;
    L8:
        if (r02 >= r7) goto L10;
        r62[r02] = (byte) (r3[r02 + r4] ^ r5[r02]);
        r02 = r02 + 1;
        goto L8
    L10:
        return r62;
    L12:
        throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
    }
}
