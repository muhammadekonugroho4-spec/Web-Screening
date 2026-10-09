package com.google.crypto.tink.aead.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* loaded from: classes6.dex */
final class ChaCha20Util {
    static final int BLOCK_SIZE_IN_BYTES = 64;
    static final int BLOCK_SIZE_IN_INTS = 16;
    static final int KEY_SIZE_IN_BYTES = 32;
    static final int KEY_SIZE_IN_INTS = 8;
    private static final int[] SIGMA = null;

    static {
        SIGMA = toIntArray(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});
    }

    private ChaCha20Util() {
    }

    public static void quarterRound(int[] r2, int r3, int r4, int r5, int r6) {
        int r02 = r2[r3] + r2[r4];
        r2[r3] = r02;
        int r03 = rotateLeft(r02 ^ r2[r6], 16);
        r2[r6] = r03;
        int r1 = r2[r5] + r03;
        r2[r5] = r1;
        int r04 = rotateLeft(r2[r4] ^ r1, 12);
        r2[r4] = r04;
        int r12 = r2[r3] + r04;
        r2[r3] = r12;
        int r32 = rotateLeft(r2[r6] ^ r12, 8);
        r2[r6] = r32;
        int r62 = r2[r5] + r32;
        r2[r5] = r62;
        r2[r4] = rotateLeft(r2[r4] ^ r62, 7);
    }

    private static int rotateLeft(int r1, int r2) {
        int r02 = r1 << r2;
        return (r1 >>> (-r2)) | r02;
    }

    public static void setSigmaAndKey(int[] r3, int[] r4) {
        int[] r02 = SIGMA;
        System.arraycopy(r02, 0, r3, 0, r02.length);
        System.arraycopy(r4, 0, r3, r02.length, 8);
    }

    public static void shuffleState(int[] r16) {
        int r2 = 0;
    L4:
        if (r2 >= 10) goto L6;
        quarterRound(r16, 0, 4, 8, 12);
        quarterRound(r16, 1, 5, 9, 13);
        quarterRound(r16, 2, 6, 10, 14);
        quarterRound(r16, 3, 7, 11, 15);
        quarterRound(r16, 0, 5, 10, 15);
        quarterRound(r16, 1, 6, 11, 12);
        quarterRound(r16, 2, 7, 8, 13);
        quarterRound(r16, 3, 4, 9, 14);
        r2 = r2 + 1;
        goto L4
    }

    public static int[] toIntArray(byte[] r1) {
        IntBuffer r12 = ByteBuffer.wrap(r1).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] r02 = new int[r12.remaining()];
        r12.get(r02);
        return r02;
    }
}
