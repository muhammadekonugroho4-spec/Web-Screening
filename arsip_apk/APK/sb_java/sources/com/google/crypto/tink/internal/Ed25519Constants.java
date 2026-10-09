package com.google.crypto.tink.internal;

import com.google.crypto.tink.internal.Ed25519;
import com.google.firebase.perf.util.Constants;
import java.lang.reflect.Array;
import java.math.BigInteger;

/* loaded from: classes6.dex */
final class Ed25519Constants {
    static final Ed25519.CachedXYT[] B2 = null;
    static final Ed25519.CachedXYT[][] B_TABLE = null;

    /* renamed from: D, reason: collision with root package name */
    static final long[] f38442D = null;
    static final long[] D2 = null;
    private static final BigInteger D2_BI = null;
    private static final BigInteger D_BI = null;
    private static final BigInteger P_BI = null;
    static final long[] SQRTM1 = null;
    private static final BigInteger SQRTM1_BI = null;

    /* renamed from: com.google.crypto.tink.internal.Ed25519Constants$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Point {

        /* renamed from: x, reason: collision with root package name */
        private BigInteger f38443x;

        /* renamed from: y, reason: collision with root package name */
        private BigInteger f38444y;

        private Point() {
        }

        public static /* synthetic */ BigInteger access$100(Point r02) {
            return r02.f38444y;
        }

        public static /* synthetic */ BigInteger access$102(Point r02, BigInteger r1) {
            r02.f38444y = r1;
            return r1;
        }

        public static /* synthetic */ BigInteger access$200(Point r02) {
            return r02.f38443x;
        }

        public static /* synthetic */ BigInteger access$202(Point r02, BigInteger r1) {
            r02.f38443x = r1;
            return r1;
        }

        public /* synthetic */ Point(AnonymousClass1 r1) {
            this();
        }
    }

    static {
        BigInteger r2 = BigInteger.valueOf(2).pow(Constants.MAX_HOST_LENGTH).subtract(BigInteger.valueOf(19));
        P_BI = r2;
        BigInteger r3 = BigInteger.valueOf(-121665).multiply(BigInteger.valueOf(121666).modInverse(r2)).mod(r2);
        D_BI = r3;
        BigInteger r4 = BigInteger.valueOf(2).multiply(r3).mod(r2);
        D2_BI = r4;
        BigInteger r02 = BigInteger.valueOf(2).modPow(r2.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4)), r2);
        SQRTM1_BI = r02;
        Point r1 = new Point(null);
        Point.access$102(r1, BigInteger.valueOf(4).multiply(BigInteger.valueOf(5).modInverse(r2)).mod(r2));
        Point.access$202(r1, recoverX(Point.access$100(r1)));
        f38442D = Field25519.expand(toLittleEndian(r3));
        D2 = Field25519.expand(toLittleEndian(r4));
        SQRTM1 = Field25519.expand(toLittleEndian(r02));
        int r22 = 0;
        B_TABLE = (Ed25519.CachedXYT[][]) Array.newInstance(Ed25519.CachedXYT.class, new int[]{32, 8});
        Point r5 = r1;
        int r03 = 0;
    L3:
        if (r03 >= 32) goto L11;
        int r6 = 0;
        Point r7 = r5;
    L5:
        if (r6 >= 8) goto L7;
        B_TABLE[r03][r6] = getCachedXYT(r7);
        r7 = edwards(r7, r5);
        r6 = r6 + 1;
        goto L5
    L7:
        int r62 = 0;
    L8:
        if (r62 >= 8) goto L10;
        r5 = edwards(r5, r5);
        r62 = r62 + 1;
        goto L8
    L10:
        r03 = r03 + 1;
        goto L3
    L11:
        Point r04 = edwards(r1, r1);
        B2 = new Ed25519.CachedXYT[8];
    L12:
        if (r22 >= 8) goto L14;
        B2[r22] = getCachedXYT(r1);
        r1 = edwards(r1, r04);
        r22 = r22 + 1;
        goto L12
    }

    private Ed25519Constants() {
    }

    private static Point edwards(Point r6, Point r7) {
        Point r02 = new Point(null);
        BigInteger r1 = D_BI.multiply(Point.access$200(r6).multiply(Point.access$200(r7)).multiply(Point.access$100(r6)).multiply(Point.access$100(r7)));
        BigInteger r2 = P_BI;
        BigInteger r12 = r1.mod(r2);
        BigInteger r3 = Point.access$200(r6).multiply(Point.access$100(r7)).add(Point.access$200(r7).multiply(Point.access$100(r6)));
        BigInteger r4 = BigInteger.ONE;
        Point.access$202(r02, r3.multiply(r4.add(r12).modInverse(r2)).mod(r2));
        Point.access$102(r02, Point.access$100(r6).multiply(Point.access$100(r7)).add(Point.access$200(r6).multiply(Point.access$200(r7))).multiply(r4.subtract(r12).modInverse(r2)).mod(r2));
        return r02;
    }

    private static Ed25519.CachedXYT getCachedXYT(Point r6) {
        BigInteger r1 = Point.access$100(r6).add(Point.access$200(r6));
        BigInteger r2 = P_BI;
        return new Ed25519.CachedXYT(Field25519.expand(toLittleEndian(r1.mod(r2))), Field25519.expand(toLittleEndian(Point.access$100(r6).subtract(Point.access$200(r6)).mod(r2))), Field25519.expand(toLittleEndian(D2_BI.multiply(Point.access$200(r6)).multiply(Point.access$100(r6)).mod(r2))));
    }

    private static BigInteger recoverX(BigInteger r5) {
        BigInteger r1 = r5.pow(2);
        BigInteger r2 = BigInteger.ONE;
        BigInteger r12 = r1.subtract(r2);
        BigInteger r52 = D_BI.multiply(r5.pow(2)).add(r2);
        BigInteger r22 = P_BI;
        BigInteger r53 = r12.multiply(r52.modInverse(r22));
        BigInteger r13 = r53.modPow(r22.add(BigInteger.valueOf(3)).divide(BigInteger.valueOf(8)), r22);
        if (r13.pow(2).subtract(r53).mod(r22).equals(BigInteger.ZERO) == true) goto L6;
        r13 = r13.multiply(SQRTM1_BI).mod(r22);
    L6:
        if (r13.testBit(0) == true) goto L8;
        return r13;
    L8:
        return r22.subtract(r13);
    }

    private static byte[] toLittleEndian(BigInteger r4) {
        byte[] r1 = new byte[32];
        byte[] r42 = r4.toByteArray();
        int r3 = 0;
        System.arraycopy(r42, 0, r1, 32 - r42.length, r42.length);
    L4:
        if (r3 >= 16) goto L6;
        byte r43 = r1[r3];
        int r02 = 31 - r3;
        r1[r3] = r1[r02];
        r1[r02] = r43;
        r3 = r3 + 1;
        goto L4
    L6:
        return r1;
    }
}
