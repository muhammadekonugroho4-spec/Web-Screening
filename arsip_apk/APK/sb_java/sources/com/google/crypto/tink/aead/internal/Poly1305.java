package com.google.crypto.tink.aead.internal;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.google.crypto.tink.subtle.Bytes;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class Poly1305 {
    public static final int MAC_KEY_SIZE_IN_BYTES = 32;
    public static final int MAC_TAG_SIZE_IN_BYTES = 16;

    private Poly1305() {
    }

    public static byte[] computeMac(byte[] r57, byte[] r58) {
        if (r57.length != 32) goto L11;
        long r4 = load26(r57, 0, 0) & 67108863;
        int r8 = 3;
        int r9 = 2;
        long r10 = load26(r57, 3, 2) & 67108611;
        long r14 = load26(r57, 6, 4) & 67092735;
        long r17 = load26(r57, 9, 6) & 66076671;
        long r21 = load26(r57, 12, 8) & 1048575;
        long r25 = r10 * 5;
        long r27 = r14 * 5;
        long r29 = r17 * 5;
        long r31 = r21 * 5;
        byte[] r6 = new byte[17];
        long r34 = 0;
        int r7 = 0;
        long r36 = 0;
        long r38 = 0;
        long r40 = 0;
        long r42 = 0;
    L6:
        if (r7 >= r58.length) goto L8;
        copyBlockSize(r6, r58, r7);
        long r422 = r42 + load26(r6, 0, 0);
        long r342 = r34 + load26(r6, r8, r9);
        long r362 = r36 + load26(r6, 6, 4);
        long r382 = r38 + load26(r6, 9, 6);
        long r51 = r10;
        long r402 = r40 + (load26(r6, 12, 8) | (r6[16] << Ascii.CAN));
        long r92 = ((((r422 * r4) + (r342 * r31)) + (r362 * r29)) + (r382 * r27)) + (r402 * r25);
        long r11 = ((((r422 * r51) + (r342 * r4)) + (r362 * r31)) + (r382 * r29)) + (r402 * r27);
        long r49 = ((((r422 * r14) + (r342 * r51)) + (r362 * r4)) + (r382 * r31)) + (r402 * r29);
        long r53 = ((((r422 * r17) + (r342 * r14)) + (r362 * r51)) + (r382 * r4)) + (r402 * r31);
        long r423 = ((((r422 * r21) + (r342 * r17)) + (r362 * r14)) + (r382 * r51)) + (r402 * r4);
        long r112 = r11 + (r92 >> 26);
        long r492 = r49 + (r112 >> 26);
        r36 = r492 & 67108863;
        long r532 = r53 + (r492 >> 26);
        r38 = r532 & 67108863;
        long r424 = r423 + (r532 >> 26);
        r40 = r424 & 67108863;
        long r93 = (r92 & 67108863) + ((r424 >> 26) * 5);
        r42 = r93 & 67108863;
        r34 = (r112 & 67108863) + (r93 >> 26);
        r7 = r7 + 16;
        r10 = r51;
        r8 = 3;
        r9 = 2;
        goto L6
    L8:
        long r363 = r36 + (r34 >> 26);
        long r72 = r363 & 67108863;
        long r383 = r38 + (r363 >> 26);
        long r94 = r383 & 67108863;
        long r403 = r40 + (r383 >> 26);
        long r142 = r403 & 67108863;
        long r425 = r42 + ((r403 >> 26) * 5);
        long r172 = r425 & 67108863;
        long r5 = (r34 & 67108863) + (r425 >> 26);
        long r23 = r172 + 5;
        long r212 = r23 & 67108863;
        long r3 = (r23 >> 26) + r5;
        long r232 = r72 + (r3 >> 26);
        long r252 = r94 + (r232 >> 26);
        long r19 = r252 & 67108863;
        long r272 = (r142 + (r252 >> 26)) - 67108864;
        long r13 = r272 >> 63;
        long r173 = r172 & r13;
        long r52 = r5 & r13;
        long r73 = r72 & r13;
        long r95 = r94 & r13;
        long r253 = r142 & r13;
        long r132 = ~r13;
        long r32 = ((r3 & 67108863) & r132) | r52;
        long r54 = ((r232 & 67108863) & r132) | r73;
        long r74 = (r19 & r132) | r95;
        long r96 = r253 | (r272 & r132);
        long r133 = ((r173 | (r212 & r132)) | (r32 << 26)) & 4294967295L;
        long r33 = ((r32 >> 6) | (r54 << 20)) & 4294967295L;
        long r55 = ((r54 >> 12) | (r74 << 14)) & 4294967295L;
        long r75 = ((r74 >> 18) | (r96 << 8)) & 4294967295L;
        long r134 = r133 + load32(r57, 16);
        long r97 = r134 & 4294967295L;
        long r35 = (r33 + load32(r57, 20)) + (r134 >> 32);
        long r135 = r35 & 4294967295L;
        long r56 = (r55 + load32(r57, 24)) + (r35 >> 32);
        long r37 = r56 & 4294967295L;
        long r02 = ((r75 + load32(r57, 28)) + (r56 >> 32)) & 4294967295L;
        byte[] r59 = new byte[16];
        toByteArray(r59, r97, 0);
        toByteArray(r59, r135, 4);
        toByteArray(r59, r37, 8);
        toByteArray(r59, r02, 12);
        return r59;
    L11:
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }

    private static void copyBlockSize(byte[] r3, byte[] r4, int r5) {
        int r02 = Math.min(16, r4.length - r5);
        System.arraycopy(r4, r5, r3, 0, r02);
        r3[r02] = 1;
        if (r02 == 16) goto L6;
        Arrays.fill(r3, r02 + 1, r3.length, (byte) 0);
        return;
    }

    private static long load26(byte[] r2, int r3, int r4) {
        return (load32(r2, r3) >> r4) & 67108863;
    }

    private static long load32(byte[] r2, int r3) {
        int r02 = ((r2[r3] & UnsignedBytes.MAX_VALUE) | ((r2[r3 + 1] & UnsignedBytes.MAX_VALUE) << 8)) | ((r2[r3 + 2] & UnsignedBytes.MAX_VALUE) << 16);
        return (((r2[r3 + 3] & UnsignedBytes.MAX_VALUE) << 24) | r02) & 4294967295L;
    }

    private static void toByteArray(byte[] r4, long r5, int r7) {
        int r02 = 0;
    L4:
        if (r02 >= 4) goto L6;
        r4[r7 + r02] = (byte) (255 & r5);
        r02 = r02 + 1;
        r5 = r5 >> 8;
        goto L4
    }

    public static void verifyMac(byte[] r02, byte[] r1, byte[] r2) throws GeneralSecurityException {
        if (Bytes.equal(computeMac(r02, r1), r2) == false) goto L6;
        return;
    L6:
        throw new GeneralSecurityException("invalid MAC");
    }
}
