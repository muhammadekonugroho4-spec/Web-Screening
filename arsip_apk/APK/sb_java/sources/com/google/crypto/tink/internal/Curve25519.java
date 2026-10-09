package com.google.crypto.tink.internal;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.subtle.Bytes;
import com.google.crypto.tink.subtle.Hex;
import java.security.InvalidKeyException;
import java.util.Arrays;

@Alpha
/* loaded from: classes6.dex */
public final class Curve25519 {
    static final byte[][] BANNED_PUBLIC_KEYS = null;

    static {
        BANNED_PUBLIC_KEYS = new byte[][]{new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{-32, -21, 122, 124, 59, 65, -72, -82, Ascii.SYN, 86, -29, -6, -15, -97, -60, 106, -38, 9, -115, -21, -100, 50, -79, -3, -122, 98, 5, Ascii.SYN, 95, 73, -72, 0}, new byte[]{95, -100, -107, -68, -93, 80, -116, 36, -79, -48, -79, 85, -100, -125, -17, 91, 4, 68, 92, -60, 88, Ascii.FS, -114, -122, -40, 34, 78, -35, -48, -97, 17, 87}, new byte[]{-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Ascii.DEL}, new byte[]{-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Ascii.DEL}, new byte[]{-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Ascii.DEL}};
    }

    private Curve25519() {
    }

    public static void copyConditional(long[] r6, long[] r7, int r8) {
        int r82 = -r8;
        int r02 = 0;
    L4:
        if (r02 >= 10) goto L6;
        int r3 = (((int) r6[r02]) ^ ((int) r7[r02])) & r82;
        r6[r02] = ((int) r1) ^ r3;
        r02 = r02 + 1;
        goto L4
    }

    public static void curveMult(long[] r17, byte[] r18, byte[] r19) throws InvalidKeyException {
        long[] r10 = Field25519.expand(validatePubKeyAndClearMsb(r19));
        long[] r2 = new long[19];
        long[] r3 = new long[19];
        r3[0] = 1;
        long[] r6 = new long[19];
        r6[0] = 1;
        long[] r7 = new long[19];
        long[] r8 = new long[19];
        long[] r9 = new long[19];
        r9[0] = 1;
        long[] r12 = new long[19];
        long[] r1 = new long[19];
        r1[0] = 1;
        System.arraycopy(r10, 0, r2, 0, 10);
        int r14 = 0;
    L4:
        if (r14 >= 32) goto L10;
        int r15 = r18[31 - r14] & UnsignedBytes.MAX_VALUE;
        long[] r4 = r8;
        long[] r5 = r9;
        long[] r82 = r2;
        long[] r92 = r3;
        long[] r22 = r12;
        long[] r32 = r1;
        int r13 = 0;
    L7:
        if (r13 >= 8) goto L9;
        int r122 = (r15 >> (7 - r13)) & 1;
        swapConditional(r6, r82, r122);
        swapConditional(r7, r92, r122);
        monty(r22, r32, r4, r5, r6, r7, r82, r92, r10);
        swapConditional(r22, r4, r122);
        swapConditional(r32, r5, r122);
        r13 = r13 + 1;
        long[] r16 = r6;
        r6 = r22;
        r22 = r16;
        long[] r162 = r7;
        r7 = r32;
        r32 = r162;
        long[] r163 = r82;
        r82 = r4;
        r4 = r163;
        long[] r164 = r92;
        r92 = r5;
        r5 = r164;
        goto L7
    L9:
        r14 = r14 + 1;
        r12 = r22;
        r1 = r32;
        r2 = r82;
        r3 = r92;
        r8 = r4;
        r9 = r5;
        goto L4
    L10:
        long[] r110 = new long[10];
        Field25519.inverse(r110, r7);
        Field25519.mult(r17, r6, r110);
        if (isCollinear(r10, r17, r2, r3) == false) goto L14;
        return;
    L14:
        throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: " + Hex.encode(r19));
    }

    private static boolean isCollinear(long[] r8, long[] r9, long[] r10, long[] r11) {
        long[] r1 = new long[10];
        long[] r2 = new long[10];
        long[] r4 = new long[11];
        long[] r5 = new long[11];
        long[] r3 = new long[11];
        Field25519.mult(r1, r8, r9);
        Field25519.sum(r2, r8, r9);
        long[] r82 = new long[10];
        r82[0] = 486662;
        Field25519.sum(r5, r2, r82);
        Field25519.mult(r5, r5, r11);
        Field25519.sum(r5, r10);
        Field25519.mult(r5, r5, r1);
        Field25519.mult(r5, r5, r10);
        Field25519.scalarProduct(r4, r5, 4);
        Field25519.reduceCoefficients(r4);
        Field25519.mult(r5, r1, r11);
        Field25519.sub(r5, r5, r11);
        Field25519.mult(r3, r2, r10);
        Field25519.sum(r5, r5, r3);
        Field25519.square(r5, r5);
        return Bytes.equal(Field25519.contract(r4), Field25519.contract(r5));
    }

    private static void monty(long[] r13, long[] r14, long[] r15, long[] r16, long[] r17, long[] r18, long[] r19, long[] r20, long[] r21) {
        long[] r5 = Arrays.copyOf(r17, 10);
        long[] r7 = new long[19];
        long[] r8 = new long[19];
        long[] r9 = new long[19];
        long[] r10 = new long[19];
        long[] r11 = new long[19];
        long[] r12 = new long[19];
        long[] r6 = new long[19];
        Field25519.sum(r17, r18);
        Field25519.sub(r18, r5);
        long[] r52 = Arrays.copyOf(r19, 10);
        Field25519.sum(r19, r20);
        Field25519.sub(r20, r52);
        Field25519.product(r10, r19, r18);
        Field25519.product(r11, r17, r20);
        Field25519.reduceSizeByModularReduction(r10);
        Field25519.reduceCoefficients(r10);
        Field25519.reduceSizeByModularReduction(r11);
        Field25519.reduceCoefficients(r11);
        System.arraycopy(r10, 0, r52, 0, 10);
        Field25519.sum(r10, r11);
        Field25519.sub(r11, r52);
        Field25519.square(r6, r10);
        Field25519.square(r12, r11);
        Field25519.product(r11, r12, r21);
        Field25519.reduceSizeByModularReduction(r11);
        Field25519.reduceCoefficients(r11);
        System.arraycopy(r6, 0, r15, 0, 10);
        System.arraycopy(r11, 0, r16, 0, 10);
        Field25519.square(r8, r17);
        Field25519.square(r9, r18);
        Field25519.product(r13, r8, r9);
        Field25519.reduceSizeByModularReduction(r13);
        Field25519.reduceCoefficients(r13);
        Field25519.sub(r9, r8);
        Arrays.fill(r7, 10, 18, 0);
        Field25519.scalarProduct(r7, r9, 121665);
        Field25519.reduceCoefficients(r7);
        Field25519.sum(r7, r8);
        Field25519.product(r14, r9, r7);
        Field25519.reduceSizeByModularReduction(r14);
        Field25519.reduceCoefficients(r14);
    }

    public static void swapConditional(long[] r6, long[] r7, int r8) {
        int r82 = -r8;
        int r02 = 0;
    L4:
        if (r02 >= 10) goto L6;
        int r3 = (((int) r6[r02]) ^ ((int) r7[r02])) & r82;
        r6[r02] = ((int) r1) ^ r3;
        r7[r02] = ((int) r7[r02]) ^ r3;
        r02 = r02 + 1;
        goto L4
    }

    private static byte[] validatePubKeyAndClearMsb(byte[] r4) throws InvalidKeyException {
        if (r4.length != 32) goto L14;
        byte[] r42 = Arrays.copyOf(r4, r4.length);
        r42[31] = (byte) (r42[31] & Ascii.DEL);
        int r02 = 0;
    L5:
        byte[][] r1 = BANNED_PUBLIC_KEYS;
        if (r02 >= r1.length) goto L12;
        if (Bytes.equal(r1[r02], r42) == true) goto L11;
        r02 = r02 + 1;
        goto L5
    L11:
        throw new InvalidKeyException("Banned public key: " + Hex.encode(r1[r02]));
    L12:
        return r42;
    L14:
        throw new InvalidKeyException("Public key length is not 32-byte");
    }
}
