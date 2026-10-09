package com.google.crypto.tink.internal;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.crypto.tink.subtle.Bytes;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.perf.util.Constants;
import io.sentry.SentryOptions;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class Ed25519 {
    private static final CachedXYT CACHED_NEUTRAL = null;
    static final byte[] GROUP_ORDER = null;
    private static final PartialXYZT NEUTRAL = null;
    public static final int PUBLIC_KEY_LEN = 32;
    public static final int SECRET_KEY_LEN = 32;
    public static final int SIGNATURE_LEN = 64;

    public static class CachedXYT {
        final long[] t2d;
        final long[] yMinusX;
        final long[] yPlusX;

        public CachedXYT() {
            this(new long[10], new long[10], new long[10]);
        }

        public void copyConditional(CachedXYT r3, int r4) {
            Curve25519.copyConditional(this.yPlusX, r3.yPlusX, r4);
            Curve25519.copyConditional(this.yMinusX, r3.yMinusX, r4);
            Curve25519.copyConditional(this.t2d, r3.t2d, r4);
        }

        public void multByZ(long[] r3, long[] r4) {
            System.arraycopy(r4, 0, r3, 0, 10);
        }

        public CachedXYT(long[] r1, long[] r2, long[] r3) {
            this.yPlusX = r1;
            this.yMinusX = r2;
            this.t2d = r3;
        }

        public CachedXYT(CachedXYT r3) {
            this.yPlusX = Arrays.copyOf(r3.yPlusX, 10);
            this.yMinusX = Arrays.copyOf(r3.yMinusX, 10);
            this.t2d = Arrays.copyOf(r3.t2d, 10);
        }
    }

    public static class CachedXYZT extends CachedXYT {

        /* renamed from: z, reason: collision with root package name */
        private final long[] f38436z;

        public CachedXYZT() {
            this(new long[10], new long[10], new long[10], new long[10]);
        }

        @Override // com.google.crypto.tink.internal.Ed25519.CachedXYT
        public void multByZ(long[] r2, long[] r3) {
            Field25519.mult(r2, r3, this.f38436z);
        }

        public CachedXYZT(XYZT r5) {
            this();
            long[] r02 = this.yPlusX;
            XYZ r1 = r5.xyz;
            Field25519.sum(r02, r1.f38439y, r1.f38438x);
            long[] r03 = this.yMinusX;
            XYZ r12 = r5.xyz;
            Field25519.sub(r03, r12.f38439y, r12.f38438x);
            System.arraycopy(r5.xyz.f38440z, 0, this.f38436z, 0, 10);
            Field25519.mult(this.t2d, r5.f38441t, Ed25519Constants.D2);
        }

        public CachedXYZT(long[] r1, long[] r2, long[] r3, long[] r4) {
            super(r1, r2, r4);
            this.f38436z = r3;
        }
    }

    public static class PartialXYZT {

        /* renamed from: t, reason: collision with root package name */
        final long[] f38437t;
        final XYZ xyz;

        public PartialXYZT() {
            this(new XYZ(), new long[10]);
        }

        public PartialXYZT(XYZ r1, long[] r2) {
            this.xyz = r1;
            this.f38437t = r2;
        }

        public PartialXYZT(PartialXYZT r3) {
            this.xyz = new XYZ(r3.xyz);
            this.f38437t = Arrays.copyOf(r3.f38437t, 10);
        }
    }

    public static class XYZ {

        /* renamed from: x, reason: collision with root package name */
        final long[] f38438x;

        /* renamed from: y, reason: collision with root package name */
        final long[] f38439y;

        /* renamed from: z, reason: collision with root package name */
        final long[] f38440z;

        public XYZ() {
            this(new long[10], new long[10], new long[10]);
        }

        @CanIgnoreReturnValue
        public static XYZ fromPartialXYZT(XYZ r3, PartialXYZT r4) {
            Field25519.mult(r3.f38438x, r4.xyz.f38438x, r4.f38437t);
            long[] r02 = r3.f38439y;
            XYZ r1 = r4.xyz;
            Field25519.mult(r02, r1.f38439y, r1.f38440z);
            Field25519.mult(r3.f38440z, r4.xyz.f38440z, r4.f38437t);
            return r3;
        }

        public boolean isOnCurve() {
            long[] r1 = new long[10];
            Field25519.square(r1, this.f38438x);
            long[] r2 = new long[10];
            Field25519.square(r2, this.f38439y);
            long[] r3 = new long[10];
            Field25519.square(r3, this.f38440z);
            long[] r4 = new long[10];
            Field25519.square(r4, r3);
            long[] r5 = new long[10];
            Field25519.sub(r5, r2, r1);
            Field25519.mult(r5, r5, r3);
            long[] r02 = new long[10];
            Field25519.mult(r02, r1, r2);
            Field25519.mult(r02, r02, Ed25519Constants.f38442D);
            Field25519.sum(r02, r4);
            Field25519.reduce(r02, r02);
            return Bytes.equal(Field25519.contract(r5), Field25519.contract(r02));
        }

        public byte[] toBytes() {
            long[] r1 = new long[10];
            long[] r2 = new long[10];
            long[] r02 = new long[10];
            Field25519.inverse(r1, this.f38440z);
            Field25519.mult(r2, this.f38438x, r1);
            Field25519.mult(r02, this.f38439y, r1);
            byte[] r03 = Field25519.contract(r02);
            byte r3 = r03[31];
            r03[31] = (byte) ((Ed25519.access$000(r2) << 7) ^ r3);
            return r03;
        }

        public XYZ(long[] r1, long[] r2, long[] r3) {
            this.f38438x = r1;
            this.f38439y = r2;
            this.f38440z = r3;
        }

        public XYZ(XYZ r3) {
            this.f38438x = Arrays.copyOf(r3.f38438x, 10);
            this.f38439y = Arrays.copyOf(r3.f38439y, 10);
            this.f38440z = Arrays.copyOf(r3.f38440z, 10);
        }

        public XYZ(PartialXYZT r1) {
            this();
            fromPartialXYZT(this, r1);
        }
    }

    public static class XYZT {

        /* renamed from: t, reason: collision with root package name */
        final long[] f38441t;
        final XYZ xyz;

        public XYZT() {
            this(new XYZ(), new long[10]);
        }

        public static /* synthetic */ XYZT access$400(XYZT r02, PartialXYZT r1) {
            return fromPartialXYZT(r02, r1);
        }

        public static /* synthetic */ XYZT access$500(byte[] r02) throws GeneralSecurityException {
            return fromBytesNegateVarTime(r02);
        }

        private static XYZT fromBytesNegateVarTime(byte[] r10) throws GeneralSecurityException {
            long[] r1 = new long[10];
            long[] r2 = Field25519.expand(r10);
            long[] r3 = new long[10];
            r3[0] = 1;
            long[] r4 = new long[10];
            long[] r5 = new long[10];
            long[] r6 = new long[10];
            long[] r7 = new long[10];
            long[] r8 = new long[10];
            Field25519.square(r5, r2);
            Field25519.mult(r6, r5, Ed25519Constants.f38442D);
            Field25519.sub(r5, r5, r3);
            Field25519.sum(r6, r6, r3);
            long[] r02 = new long[10];
            Field25519.square(r02, r6);
            Field25519.mult(r02, r02, r6);
            Field25519.square(r1, r02);
            Field25519.mult(r1, r1, r6);
            Field25519.mult(r1, r1, r5);
            Ed25519.access$100(r1, r1);
            Field25519.mult(r1, r1, r02);
            Field25519.mult(r1, r1, r5);
            Field25519.square(r7, r1);
            Field25519.mult(r7, r7, r6);
            Field25519.sub(r8, r7, r5);
            if (Ed25519.access$200(r8) == false) goto L10;
            Field25519.sum(r8, r7, r5);
            if (Ed25519.access$200(r8) == true) goto L8;
            Field25519.mult(r1, r1, Ed25519Constants.SQRTM1);
            goto L10
        L8:
            throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
        L10:
            if (Ed25519.access$200(r1) == true) goto L17;
            if (((r10[31] & UnsignedBytes.MAX_VALUE) >> 7) == 0) goto L17;
            throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
        L17:
            if (Ed25519.access$000(r1) != ((r10[31] & UnsignedBytes.MAX_VALUE) >> 7)) goto L19;
            Ed25519.access$300(r1, r1);
        L19:
            Field25519.mult(r4, r1, r2);
            return new XYZT(new XYZ(r1, r2, r3), r4);
        }

        @CanIgnoreReturnValue
        private static XYZT fromPartialXYZT(XYZT r3, PartialXYZT r4) {
            Field25519.mult(r3.xyz.f38438x, r4.xyz.f38438x, r4.f38437t);
            long[] r02 = r3.xyz.f38439y;
            XYZ r1 = r4.xyz;
            Field25519.mult(r02, r1.f38439y, r1.f38440z);
            Field25519.mult(r3.xyz.f38440z, r4.xyz.f38440z, r4.f38437t);
            long[] r03 = r3.f38441t;
            XYZ r42 = r4.xyz;
            Field25519.mult(r03, r42.f38438x, r42.f38439y);
            return r3;
        }

        public XYZT(XYZ r1, long[] r2) {
            this.xyz = r1;
            this.f38441t = r2;
        }

        public XYZT(PartialXYZT r1) {
            this();
            fromPartialXYZT(this, r1);
        }
    }

    static {
        CACHED_NEUTRAL = new CachedXYT(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        NEUTRAL = new PartialXYZT(new XYZ(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        GROUP_ORDER = new byte[]{-19, -45, -11, 92, Ascii.SUB, 99, Ascii.DC2, 88, -42, -100, -9, -94, -34, -7, -34, Ascii.DC4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Ascii.DLE};
    }

    private Ed25519() {
    }

    public static /* synthetic */ int access$000(long[] r02) {
        return getLsb(r02);
    }

    public static /* synthetic */ void access$100(long[] r02, long[] r1) {
        pow2252m3(r02, r1);
    }

    public static /* synthetic */ boolean access$200(long[] r02) {
        return isNonZeroVarTime(r02);
    }

    public static /* synthetic */ void access$300(long[] r02, long[] r1) {
        neg(r02, r1);
    }

    private static void add(PartialXYZT r4, XYZT r5, CachedXYT r6) {
        long[] r02 = new long[10];
        long[] r1 = r4.xyz.f38438x;
        XYZ r2 = r5.xyz;
        Field25519.sum(r1, r2.f38439y, r2.f38438x);
        long[] r12 = r4.xyz.f38439y;
        XYZ r22 = r5.xyz;
        Field25519.sub(r12, r22.f38439y, r22.f38438x);
        long[] r13 = r4.xyz.f38439y;
        Field25519.mult(r13, r13, r6.yMinusX);
        XYZ r14 = r4.xyz;
        Field25519.mult(r14.f38440z, r14.f38438x, r6.yPlusX);
        Field25519.mult(r4.f38437t, r5.f38441t, r6.t2d);
        r6.multByZ(r4.xyz.f38438x, r5.xyz.f38440z);
        long[] r52 = r4.xyz.f38438x;
        Field25519.sum(r02, r52, r52);
        XYZ r53 = r4.xyz;
        Field25519.sub(r53.f38438x, r53.f38440z, r53.f38439y);
        XYZ r54 = r4.xyz;
        long[] r62 = r54.f38439y;
        Field25519.sum(r62, r54.f38440z, r62);
        Field25519.sum(r4.xyz.f38440z, r02, r4.f38437t);
        long[] r42 = r4.f38437t;
        Field25519.sub(r42, r02, r42);
    }

    private static XYZ doubleScalarMultVarTime(byte[] r6, XYZT r7, byte[] r8) {
        CachedXYZT[] r1 = new CachedXYZT[8];
        r1[0] = new CachedXYZT(r7);
        PartialXYZT r2 = new PartialXYZT();
        doubleXYZT(r2, r7);
        XYZT r72 = new XYZT(r2);
        int r3 = 1;
    L3:
        if (r3 >= 8) goto L5;
        add(r2, r72, r1[r3 - 1]);
        r1[r3] = new CachedXYZT(new XYZT(r2));
        r3 = r3 + 1;
        goto L3
    L5:
        byte[] r62 = slide(r6);
        byte[] r73 = slide(r8);
        PartialXYZT r82 = new PartialXYZT(NEUTRAL);
        XYZT r02 = new XYZT();
        int r22 = Constants.MAX_HOST_LENGTH;
    L6:
        if (r22 < 0) goto L13;
        if (r62[r22] != 0) goto L13;
        if (r73[r22] != 0) goto L13;
        r22 = r22 - 1;
    L13:
        if (r22 < 0) goto L26;
        doubleXYZ(r82, new XYZ(r82));
        byte r32 = r62[r22];
        if (r32 <= 0) goto L17;
        add(r82, XYZT.access$400(r02, r82), r1[r62[r22] / 2]);
    L19:
        byte r33 = r73[r22];
        if (r33 <= 0) goto L22;
        add(r82, XYZT.access$400(r02, r82), Ed25519Constants.B2[r73[r22] / 2]);
    L24:
        r22 = r22 - 1;
        goto L13
    L22:
        if (r33 >= 0) goto L24;
        sub(r82, XYZT.access$400(r02, r82), Ed25519Constants.B2[(-r73[r22]) / 2]);
        goto L24
    L17:
        if (r32 >= 0) goto L19;
        sub(r82, XYZT.access$400(r02, r82), r1[(-r62[r22]) / 2]);
        goto L19
    L26:
        return new XYZ(r82);
    }

    private static void doubleXYZ(PartialXYZT r3, XYZ r4) {
        long[] r02 = new long[10];
        Field25519.square(r3.xyz.f38438x, r4.f38438x);
        Field25519.square(r3.xyz.f38440z, r4.f38439y);
        Field25519.square(r3.f38437t, r4.f38440z);
        long[] r1 = r3.f38437t;
        Field25519.sum(r1, r1, r1);
        Field25519.sum(r3.xyz.f38439y, r4.f38438x, r4.f38439y);
        Field25519.square(r02, r3.xyz.f38439y);
        XYZ r42 = r3.xyz;
        Field25519.sum(r42.f38439y, r42.f38440z, r42.f38438x);
        XYZ r43 = r3.xyz;
        long[] r12 = r43.f38440z;
        Field25519.sub(r12, r12, r43.f38438x);
        XYZ r44 = r3.xyz;
        Field25519.sub(r44.f38438x, r02, r44.f38439y);
        long[] r45 = r3.f38437t;
        Field25519.sub(r45, r45, r3.xyz.f38440z);
    }

    private static void doubleXYZT(PartialXYZT r02, XYZT r1) {
        doubleXYZ(r02, r1.xyz);
    }

    private static int eq(int r02, int r1) {
        int r03 = (~(r02 ^ r1)) & Constants.MAX_HOST_LENGTH;
        int r04 = r03 & (r03 << 4);
        int r05 = r04 & (r04 << 2);
        return ((r05 & (r05 << 1)) >> 7) & 1;
    }

    public static byte[] getHashedScalar(byte[] r3) throws GeneralSecurityException {
        MessageDigest r02 = EngineFactory.MESSAGE_DIGEST.getInstance("SHA-512");
        r02.update(r3, 0, 32);
        byte[] r32 = r02.digest();
        r32[0] = (byte) (r32[0] & 248);
        byte r1 = (byte) (r32[31] & Ascii.DEL);
        r32[31] = r1;
        r32[31] = (byte) (r1 | SignedBytes.MAX_POWER_OF_TWO);
        return r32;
    }

    private static int getLsb(long[] r1) {
        return Field25519.contract(r1)[0] & 1;
    }

    private static boolean isNonZeroVarTime(long[] r5) {
        long[] r02 = new long[r5.length + 1];
        System.arraycopy(r5, 0, r02, 0, r5.length);
        Field25519.reduceCoefficients(r02);
        byte[] r52 = Field25519.contract(r02);
        int r03 = r52.length;
        int r2 = 0;
    L3:
        if (r2 >= r03) goto L8;
        if (r52[r2] != 0) goto L6;
        r2 = r2 + 1;
        goto L3
    L6:
        return true;
    L8:
        return false;
    }

    private static boolean isSmallerThanGroupOrder(byte[] r4) {
        int r02 = 31;
    L4:
        if (r02 < 0) goto L12;
        int r2 = r4[r02] & UnsignedBytes.MAX_VALUE;
        int r3 = GROUP_ORDER[r02] & UnsignedBytes.MAX_VALUE;
        if (r2 != r3) goto L7;
        r02 = r02 - 1;
        goto L4
    L7:
        if (r2 >= r3) goto L10;
        return true;
    L10:
        return false;
    L12:
        return false;
    }

    private static long load3(byte[] r5, int r6) {
        return ((r5[r6 + 2] & UnsignedBytes.MAX_VALUE) << 16) | ((r5[r6] & 255) | ((r5[r6 + 1] & UnsignedBytes.MAX_VALUE) << 8));
    }

    private static long load4(byte[] r3, int r4) {
        return ((r3[r4 + 3] & UnsignedBytes.MAX_VALUE) << 24) | load3(r3, r4);
    }

    private static void mulAdd(byte[] r90, byte[] r91, byte[] r92, byte[] r93) {
        long r4 = load3(r91, 0) & 2097151;
        long r9 = (load4(r91, 2) >> 5) & 2097151;
        long r12 = (load3(r91, 5) >> 2) & 2097151;
        long r15 = (load4(r91, 7) >> 7) & 2097151;
        long r19 = (load4(r91, 10) >> 4) & 2097151;
        long r22 = (load3(r91, 13) >> 1) & 2097151;
        long r26 = (load4(r91, 15) >> 6) & 2097151;
        long r30 = (load3(r91, 18) >> 3) & 2097151;
        long r34 = load3(r91, 21) & 2097151;
        long r37 = (load4(r91, 23) >> 5) & 2097151;
        long r40 = (load3(r91, 26) >> 2) & 2097151;
        long r42 = load4(r91, 28) >> 7;
        long r44 = load3(r92, 0) & 2097151;
        long r46 = (load4(r92, 2) >> 5) & 2097151;
        long r48 = (load3(r92, 5) >> 2) & 2097151;
        long r50 = (load4(r92, 7) >> 7) & 2097151;
        long r52 = (load4(r92, 10) >> 4) & 2097151;
        long r54 = (load3(r92, 13) >> 1) & 2097151;
        long r56 = (load4(r92, 15) >> 6) & 2097151;
        long r58 = (load3(r92, 18) >> 3) & 2097151;
        long r60 = load3(r92, 21) & 2097151;
        long r62 = (load4(r92, 23) >> 5) & 2097151;
        long r64 = (load3(r92, 26) >> 2) & 2097151;
        long r02 = load4(r92, 28) >> 7;
        long r66 = load3(r93, 0) & 2097151;
        long r68 = (load4(r93, 2) >> 5) & 2097151;
        long r70 = (load3(r93, 5) >> 2) & 2097151;
        long r72 = (load4(r93, 7) >> 7) & 2097151;
        long r74 = (load4(r93, 10) >> 4) & 2097151;
        long r76 = (load3(r93, 13) >> 1) & 2097151;
        long r78 = (load4(r93, 15) >> 6) & 2097151;
        long r80 = (load3(r93, 18) >> 3) & 2097151;
        long r82 = load3(r93, 21) & 2097151;
        long r84 = (load4(r93, 23) >> 5) & 2097151;
        long r662 = r66 + (r4 * r44);
        long r682 = (r68 + (r4 * r46)) + (r9 * r44);
        long r702 = ((r70 + (r4 * r48)) + (r9 * r46)) + (r12 * r44);
        long r722 = (((r72 + (r4 * r50)) + (r9 * r48)) + (r12 * r46)) + (r15 * r44);
        long r742 = ((((r74 + (r4 * r52)) + (r9 * r50)) + (r12 * r48)) + (r15 * r46)) + (r19 * r44);
        long r762 = (((((r76 + (r4 * r54)) + (r9 * r52)) + (r12 * r50)) + (r15 * r48)) + (r19 * r46)) + (r22 * r44);
        long r782 = ((((((r78 + (r4 * r56)) + (r9 * r54)) + (r12 * r52)) + (r15 * r50)) + (r19 * r48)) + (r22 * r46)) + (r26 * r44);
        long r802 = (((((((r80 + (r4 * r58)) + (r9 * r56)) + (r12 * r54)) + (r15 * r52)) + (r19 * r50)) + (r22 * r48)) + (r26 * r46)) + (r30 * r44);
        long r822 = ((((((((r82 + (r4 * r60)) + (r9 * r58)) + (r12 * r56)) + (r15 * r54)) + (r19 * r52)) + (r22 * r50)) + (r26 * r48)) + (r30 * r46)) + (r34 * r44);
        long r842 = (((((((((r84 + (r4 * r62)) + (r9 * r60)) + (r12 * r58)) + (r15 * r56)) + (r19 * r54)) + (r22 * r52)) + (r26 * r50)) + (r30 * r48)) + (r34 * r46)) + (r37 * r44);
        long r17 = ((((((((((((load3(r93, 26) >> 2) & 2097151) + (r4 * r64)) + (r9 * r62)) + (r12 * r60)) + (r15 * r58)) + (r19 * r56)) + (r22 * r54)) + (r26 * r52)) + (r30 * r50)) + (r34 * r48)) + (r37 * r46)) + (r40 * r44);
        long r86 = ((((((((((((load4(r93, 28) >> 7) + (r4 * r02)) + (r9 * r64)) + (r12 * r62)) + (r15 * r60)) + (r19 * r58)) + (r22 * r56)) + (r26 * r54)) + (r30 * r52)) + (r34 * r50)) + (r37 * r48)) + (r40 * r46)) + (r44 * r42);
        long r94 = ((((((((((r9 * r02) + (r12 * r64)) + (r15 * r62)) + (r19 * r60)) + (r22 * r58)) + (r26 * r56)) + (r30 * r54)) + (r34 * r52)) + (r37 * r50)) + (r40 * r48)) + (r46 * r42);
        long r122 = (((((((((r12 * r02) + (r15 * r64)) + (r19 * r62)) + (r22 * r60)) + (r26 * r58)) + (r30 * r56)) + (r34 * r54)) + (r37 * r52)) + (r40 * r50)) + (r48 * r42);
        long r152 = ((((((((r15 * r02) + (r19 * r64)) + (r22 * r62)) + (r26 * r60)) + (r30 * r58)) + (r34 * r56)) + (r37 * r54)) + (r40 * r52)) + (r50 * r42);
        long r192 = (((((((r19 * r02) + (r22 * r64)) + (r26 * r62)) + (r30 * r60)) + (r34 * r58)) + (r37 * r56)) + (r40 * r54)) + (r52 * r42);
        long r222 = ((((((r22 * r02) + (r26 * r64)) + (r30 * r62)) + (r34 * r60)) + (r37 * r58)) + (r40 * r56)) + (r54 * r42);
        long r262 = (((((r26 * r02) + (r30 * r64)) + (r34 * r62)) + (r37 * r60)) + (r40 * r58)) + (r56 * r42);
        long r302 = ((((r30 * r02) + (r34 * r64)) + (r37 * r62)) + (r40 * r60)) + (r58 * r42);
        long r342 = (((r34 * r02) + (r37 * r64)) + (r40 * r62)) + (r60 * r42);
        long r372 = ((r37 * r02) + (r40 * r64)) + (r62 * r42);
        long r402 = (r40 * r02) + (r64 * r42);
        long r422 = r42 * r02;
        long r43 = (r662 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r683 = r682 + r43;
        long r663 = r662 - (r43 << 21);
        long r45 = (r702 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r723 = r722 + r45;
        long r703 = r702 - (r45 << 21);
        long r47 = (r742 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r763 = r762 + r47;
        long r743 = r742 - (r47 << 21);
        long r49 = (r782 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r803 = r802 + r49;
        long r783 = r782 - (r49 << 21);
        long r410 = (r822 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r843 = r842 + r410;
        long r823 = r822 - (r410 << 21);
        long r411 = (r17 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r862 = r86 + r411;
        long r172 = r17 - (r411 << 21);
        long r412 = (r94 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r123 = r122 + r412;
        long r95 = r94 - (r412 << 21);
        long r413 = (r152 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r193 = r192 + r413;
        long r153 = r152 - (r413 << 21);
        long r414 = (r222 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r263 = r262 + r414;
        long r223 = r222 - (r414 << 21);
        long r415 = (r302 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r343 = r342 + r415;
        long r303 = r302 - (r415 << 21);
        long r416 = (r372 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r403 = r402 + r416;
        long r373 = r372 - (r416 << 21);
        long r417 = (r422 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r442 = (r683 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r704 = r703 + r442;
        long r684 = r683 - (r442 << 21);
        long r443 = (r723 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r744 = r743 + r443;
        long r724 = r723 - (r443 << 21);
        long r444 = (r763 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r784 = r783 + r444;
        long r764 = r763 - (r444 << 21);
        long r445 = (r803 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r824 = r823 + r445;
        long r804 = r803 - (r445 << 21);
        long r446 = (r843 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r173 = r172 + r446;
        long r844 = r843 - (r446 << 21);
        long r447 = (r862 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r96 = r95 + r447;
        long r863 = r862 - (r447 << 21);
        long r448 = (r123 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r154 = r153 + r448;
        long r124 = r123 - (r448 << 21);
        long r449 = (r193 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r224 = r223 + r449;
        long r194 = r193 - (r449 << 21);
        long r4410 = (r263 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r304 = r303 + r4410;
        long r264 = r263 - (r4410 << 21);
        long r4411 = (r343 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r374 = r373 + r4411;
        long r344 = r343 - (r4411 << 21);
        long r4412 = (r403 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r423 = (r422 - (r417 << 21)) + r4412;
        long r404 = r403 - (r4412 << 21);
        long r195 = r194 + (r417 * 136657);
        long r225 = r224 - (r417 * 683901);
        long r125 = ((r124 + (r417 * 654183)) - (r423 * 997805)) + (r404 * 136657);
        long r155 = ((r154 - (r417 * 997805)) + (r423 * 136657)) - (r404 * 683901);
        long r864 = ((((r863 + (r417 * 666643)) + (r423 * 470296)) + (r404 * 654183)) - (r374 * 997805)) + (r344 * 136657);
        long r97 = ((((r96 + (r417 * 470296)) + (r423 * 654183)) - (r404 * 997805)) + (r374 * 136657)) - (r344 * 683901);
        long r785 = r784 + (r304 * 666643);
        long r825 = ((r824 + (r374 * 666643)) + (r344 * 470296)) + (r304 * 654183);
        long r174 = ((((r173 + (r423 * 666643)) + (r404 * 470296)) + (r374 * 654183)) - (r344 * 997805)) + (r304 * 136657);
        long r418 = (r785 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r805 = ((r804 + (r344 * 666643)) + (r304 * 470296)) + r418;
        long r786 = r785 - (r418 << 21);
        long r419 = (r825 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r845 = ((((r844 + (r404 * 666643)) + (r374 * 470296)) + (r344 * 654183)) - (r304 * 997805)) + r419;
        long r826 = r825 - (r419 << 21);
        long r420 = (r174 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r865 = (r864 - (r304 * 683901)) + r420;
        long r175 = r174 - (r420 << 21);
        long r421 = (r97 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r126 = (r125 - (r374 * 683901)) + r421;
        long r98 = r97 - (r421 << 21);
        long r424 = (r155 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r196 = (r195 - (r423 * 683901)) + r424;
        long r156 = r155 - (r424 << 21);
        long r425 = (r225 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r265 = r264 + r425;
        long r226 = r225 - (r425 << 21);
        long r426 = (r805 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r827 = r826 + r426;
        long r806 = r805 - (r426 << 21);
        long r427 = (r845 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r176 = r175 + r427;
        long r846 = r845 - (r427 << 21);
        long r428 = (r865 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r99 = r98 + r428;
        long r866 = r865 - (r428 << 21);
        long r429 = (r126 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r157 = r156 + r429;
        long r127 = r126 - (r429 << 21);
        long r430 = (r196 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r227 = r226 + r430;
        long r197 = r196 - (r430 << 21);
        long r177 = r176 - (r265 * 683901);
        long r828 = ((r827 - (r265 * 997805)) + (r227 * 136657)) - (r197 * 683901);
        long r787 = ((((r786 + (r265 * 470296)) + (r227 * 654183)) - (r197 * 997805)) + (r157 * 136657)) - (r127 * 683901);
        long r664 = r663 + (r99 * 666643);
        long r705 = ((r704 + (r157 * 666643)) + (r127 * 470296)) + (r99 * 654183);
        long r745 = ((((r744 + (r227 * 666643)) + (r197 * 470296)) + (r157 * 654183)) - (r127 * 997805)) + (r99 * 136657);
        long r431 = (r664 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r685 = ((r684 + (r127 * 666643)) + (r99 * 470296)) + r431;
        long r665 = r664 - (r431 << 21);
        long r432 = (r705 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r725 = ((((r724 + (r197 * 666643)) + (r157 * 470296)) + (r127 * 654183)) - (r99 * 997805)) + r432;
        long r706 = r705 - (r432 << 21);
        long r433 = (r745 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r765 = ((((((r764 + (r265 * 666643)) + (r227 * 470296)) + (r197 * 654183)) - (r157 * 997805)) + (r127 * 136657)) - (r99 * 683901)) + r433;
        long r746 = r745 - (r433 << 21);
        long r434 = (r787 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r807 = ((((r806 + (r265 * 654183)) - (r227 * 997805)) + (r197 * 136657)) - (r157 * 683901)) + r434;
        long r788 = r787 - (r434 << 21);
        long r435 = (r828 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r847 = ((r846 + (r265 * 136657)) - (r227 * 683901)) + r435;
        long r829 = r828 - (r435 << 21);
        long r436 = (r177 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r867 = r866 + r436;
        long r178 = r177 - (r436 << 21);
        long r437 = (r685 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r707 = r706 + r437;
        long r686 = r685 - (r437 << 21);
        long r438 = (r725 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r747 = r746 + r438;
        long r726 = r725 - (r438 << 21);
        long r439 = (r765 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r789 = r788 + r439;
        long r766 = r765 - (r439 << 21);
        long r440 = (r807 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r8210 = r829 + r440;
        long r808 = r807 - (r440 << 21);
        long r441 = (r847 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r03 = (r867 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r868 = r867 - (r03 << 21);
        long r666 = r665 + (r03 * 666643);
        long r687 = r686 + (r03 * 470296);
        long r708 = r707 + (r03 * 654183);
        long r727 = r726 - (r03 * 997805);
        long r748 = r747 + (r03 * 136657);
        long r767 = r766 - (r03 * 683901);
        long r04 = r666 >> 21;
        long r688 = r687 + r04;
        long r667 = r666 - (r04 << 21);
        long r05 = r688 >> 21;
        long r709 = r708 + r05;
        long r689 = r688 - (r05 << 21);
        long r06 = r709 >> 21;
        long r728 = r727 + r06;
        long r7010 = r709 - (r06 << 21);
        long r07 = r728 >> 21;
        long r749 = r748 + r07;
        long r729 = r728 - (r07 << 21);
        long r08 = r749 >> 21;
        long r768 = r767 + r08;
        long r7410 = r749 - (r08 << 21);
        long r09 = r768 >> 21;
        long r7810 = r789 + r09;
        long r769 = r768 - (r09 << 21);
        long r010 = r7810 >> 21;
        long r809 = r808 + r010;
        long r7811 = r7810 - (r010 << 21);
        long r011 = r809 >> 21;
        long r8211 = r8210 + r011;
        long r8010 = r809 - (r011 << 21);
        long r012 = r8211 >> 21;
        long r848 = (r847 - (r441 << 21)) + r012;
        long r8212 = r8211 - (r012 << 21);
        long r013 = r848 >> 21;
        long r179 = (r178 + r441) + r013;
        long r849 = r848 - (r013 << 21);
        long r014 = r179 >> 21;
        long r869 = r868 + r014;
        long r1710 = r179 - (r014 << 21);
        long r015 = r869 >> 21;
        long r8610 = r869 - (r015 << 21);
        long r668 = r667 + (666643 * r015);
        long r6810 = r689 + (470296 * r015);
        long r7011 = r7010 + (654183 * r015);
        long r7210 = r729 - (997805 * r015);
        long r7411 = r7410 + (136657 * r015);
        long r7610 = r769 - (r015 * 683901);
        long r016 = r668 >> 21;
        long r6811 = r6810 + r016;
        long r450 = r6811 >> 21;
        long r7012 = r7011 + r450;
        long r6812 = r6811 - (r450 << 21);
        long r451 = r7012 >> 21;
        long r7211 = r7210 + r451;
        long r7013 = r7012 - (r451 << 21);
        long r452 = r7211 >> 21;
        long r7412 = r7411 + r452;
        long r7212 = r7211 - (r452 << 21);
        long r453 = r7412 >> 21;
        long r7611 = r7610 + r453;
        long r7413 = r7412 - (r453 << 21);
        long r454 = r7611 >> 21;
        long r7812 = r7811 + r454;
        long r7612 = r7611 - (r454 << 21);
        long r455 = r7812 >> 21;
        long r8011 = r8010 + r455;
        long r7813 = r7812 - (r455 << 21);
        long r456 = r8011 >> 21;
        long r8213 = r8212 + r456;
        long r8012 = r8011 - (r456 << 21);
        long r457 = r8213 >> 21;
        long r8410 = r849 + r457;
        long r910 = r8410 >> 21;
        long r1711 = r1710 + r910;
        long r8411 = r8410 - (r910 << 21);
        long r911 = r1711 >> 21;
        long r8611 = r8610 + r911;
        long r1712 = r1711 - (r911 << 21);
        r90[0] = (byte) (r668 - (r016 << 21));
        r90[1] = (byte) (r0 >> 8);
        r90[2] = (byte) ((r0 >> 16) | (r6812 << 5));
        r90[3] = (byte) (r6812 >> 3);
        r90[4] = (byte) (r6812 >> 11);
        r90[5] = (byte) ((r6812 >> 19) | (r7013 << 2));
        r90[6] = (byte) (r7013 >> 6);
        r90[7] = (byte) ((r7013 >> 14) | (r7212 << 7));
        r90[8] = (byte) (r7212 >> 1);
        r90[9] = (byte) (r7212 >> 9);
        r90[10] = (byte) ((r7212 >> 17) | (r7413 << 4));
        r90[11] = (byte) (r7413 >> 4);
        r90[12] = (byte) (r7413 >> 12);
        r90[13] = (byte) ((r7413 >> 20) | (r7612 << 1));
        r90[14] = (byte) (r7612 >> 7);
        r90[15] = (byte) ((r7612 >> 15) | (r7813 << 6));
        r90[16] = (byte) (r7813 >> 2);
        r90[17] = (byte) (r7813 >> 10);
        r90[18] = (byte) ((r7813 >> 18) | (r8012 << 3));
        r90[19] = (byte) (r8012 >> 5);
        r90[20] = (byte) (r8012 >> 13);
        r90[21] = (byte) (r8213 - (r457 << 21));
        r90[22] = (byte) (r4 >> 8);
        r90[23] = (byte) ((r4 >> 16) | (r8411 << 5));
        r90[24] = (byte) (r8411 >> 3);
        r90[25] = (byte) (r8411 >> 11);
        r90[26] = (byte) ((r8411 >> 19) | (r1712 << 2));
        r90[27] = (byte) (r1712 >> 6);
        r90[28] = (byte) ((r1712 >> 14) | (r8611 << 7));
        r90[29] = (byte) (r8611 >> 1);
        r90[30] = (byte) (r8611 >> 9);
        r90[31] = (byte) (r8611 >> 17);
    }

    private static void neg(long[] r3, long[] r4) {
        int r02 = 0;
    L4:
        if (r02 >= r4.length) goto L6;
        r3[r02] = -r4[r02];
        r02 = r02 + 1;
        goto L4
    }

    private static void pow2252m3(long[] r7, long[] r8) {
        long[] r1 = new long[10];
        long[] r2 = new long[10];
        long[] r3 = new long[10];
        Field25519.square(r1, r8);
        Field25519.square(r2, r1);
        Field25519.square(r2, r2);
        Field25519.mult(r2, r8, r2);
        Field25519.mult(r1, r1, r2);
        Field25519.square(r1, r1);
        Field25519.mult(r1, r2, r1);
        Field25519.square(r2, r1);
        int r4 = 1;
        int r5 = 1;
    L4:
        if (r5 >= 5) goto L6;
        Field25519.square(r2, r2);
        r5 = r5 + 1;
        goto L4
    L6:
        Field25519.mult(r1, r2, r1);
        Field25519.square(r2, r1);
        int r52 = 1;
    L7:
        if (r52 >= 10) goto L9;
        Field25519.square(r2, r2);
        r52 = r52 + 1;
        goto L7
    L9:
        Field25519.mult(r2, r2, r1);
        Field25519.square(r3, r2);
        int r53 = 1;
    L11:
        if (r53 >= 20) goto L13;
        Field25519.square(r3, r3);
        r53 = r53 + 1;
        goto L11
    L13:
        Field25519.mult(r2, r3, r2);
        Field25519.square(r2, r2);
        int r54 = 1;
    L14:
        if (r54 >= 10) goto L16;
        Field25519.square(r2, r2);
        r54 = r54 + 1;
        goto L14
    L16:
        Field25519.mult(r1, r2, r1);
        Field25519.square(r2, r1);
        int r02 = 1;
    L18:
        if (r02 >= 50) goto L20;
        Field25519.square(r2, r2);
        r02 = r02 + 1;
        goto L18
    L20:
        Field25519.mult(r2, r2, r1);
        Field25519.square(r3, r2);
        int r03 = 1;
    L22:
        if (r03 >= 100) goto L24;
        Field25519.square(r3, r3);
        r03 = r03 + 1;
        goto L22
    L24:
        Field25519.mult(r2, r3, r2);
        Field25519.square(r2, r2);
    L25:
        if (r4 >= 50) goto L27;
        Field25519.square(r2, r2);
        r4 = r4 + 1;
        goto L25
    L27:
        Field25519.mult(r1, r2, r1);
        Field25519.square(r1, r1);
        Field25519.square(r1, r1);
        Field25519.mult(r7, r1, r8);
    }

    private static void reduce(byte[] r74) {
        long r1 = load3(r74, 0) & 2097151;
        long r6 = (load4(r74, 2) >> 5) & 2097151;
        long r9 = (load3(r74, 5) >> 2) & 2097151;
        long r12 = (load4(r74, 7) >> 7) & 2097151;
        long r15 = (load4(r74, 10) >> 4) & 2097151;
        long r20 = (load3(r74, 13) >> 1) & 2097151;
        long r23 = (load4(r74, 15) >> 6) & 2097151;
        long r27 = (load3(r74, 18) >> 3) & 2097151;
        long r31 = load3(r74, 21) & 2097151;
        long r34 = (load4(r74, 23) >> 5) & 2097151;
        long r36 = (load3(r74, 26) >> 2) & 2097151;
        long r38 = (load4(r74, 28) >> 7) & 2097151;
        long r40 = (load4(r74, 31) >> 4) & 2097151;
        long r42 = (load3(r74, 34) >> 1) & 2097151;
        long r44 = (load4(r74, 36) >> 6) & 2097151;
        long r46 = (load3(r74, 39) >> 3) & 2097151;
        long r48 = load3(r74, 42) & 2097151;
        long r50 = (load4(r74, 44) >> 5) & 2097151;
        long r52 = (load3(r74, 47) >> 2) & 2097151;
        long r54 = (load4(r74, 49) >> 7) & 2097151;
        long r56 = (load4(r74, 52) >> 4) & 2097151;
        long r58 = (load3(r74, 55) >> 1) & 2097151;
        long r18 = (load4(r74, 57) >> 6) & 2097151;
        long r60 = load4(r74, 60) >> 3;
        long r482 = r48 - (r60 * 683901);
        long r442 = ((r44 - (r60 * 997805)) + (r18 * 136657)) - (r58 * 683901);
        long r402 = ((((r40 + (r60 * 470296)) + (r18 * 654183)) - (r58 * 997805)) + (r56 * 136657)) - (r54 * 683901);
        long r232 = r23 + (r52 * 666643);
        long r272 = (r27 + (r54 * 666643)) + (r52 * 470296);
        long r312 = ((r31 + (r56 * 666643)) + (r54 * 470296)) + (r52 * 654183);
        long r342 = (((r34 + (r58 * 666643)) + (r56 * 470296)) + (r54 * 654183)) - (r52 * 997805);
        long r362 = ((((r36 + (r18 * 666643)) + (r58 * 470296)) + (r56 * 654183)) - (r54 * 997805)) + (r52 * 136657);
        long r382 = (((((r38 + (r60 * 666643)) + (r18 * 470296)) + (r58 * 654183)) - (r56 * 997805)) + (r54 * 136657)) - (r52 * 683901);
        long r522 = (r232 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r273 = r272 + r522;
        long r233 = r232 - (r522 << 21);
        long r523 = (r312 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r343 = r342 + r523;
        long r313 = r312 - (r523 << 21);
        long r524 = (r362 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r383 = r382 + r524;
        long r363 = r362 - (r524 << 21);
        long r525 = (r402 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r422 = ((((r42 + (r60 * 654183)) - (r18 * 997805)) + (r58 * 136657)) - (r56 * 683901)) + r525;
        long r403 = r402 - (r525 << 21);
        long r526 = (r442 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r462 = ((r46 + (r60 * 136657)) - (r18 * 683901)) + r526;
        long r443 = r442 - (r526 << 21);
        long r527 = (r482 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r502 = r50 + r527;
        long r483 = r482 - (r527 << 21);
        long r528 = (r273 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r314 = r313 + r528;
        long r274 = r273 - (r528 << 21);
        long r529 = (r343 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r364 = r363 + r529;
        long r344 = r343 - (r529 << 21);
        long r5210 = (r383 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r404 = r403 + r5210;
        long r384 = r383 - (r5210 << 21);
        long r5211 = (r422 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r444 = r443 + r5211;
        long r423 = r422 - (r5211 << 21);
        long r5212 = (r462 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r484 = r483 + r5212;
        long r463 = r462 - (r5212 << 21);
        long r365 = r364 - (r502 * 683901);
        long r315 = ((r314 - (r502 * 997805)) + (r484 * 136657)) - (r463 * 683901);
        long r234 = ((((r233 + (r502 * 470296)) + (r484 * 654183)) - (r463 * 997805)) + (r444 * 136657)) - (r423 * 683901);
        long r13 = r1 + (r404 * 666643);
        long r62 = (r6 + (r423 * 666643)) + (r404 * 470296);
        long r92 = ((r9 + (r444 * 666643)) + (r423 * 470296)) + (r404 * 654183);
        long r122 = (((r12 + (r463 * 666643)) + (r444 * 470296)) + (r423 * 654183)) - (r404 * 997805);
        long r152 = ((((r15 + (r484 * 666643)) + (r463 * 470296)) + (r444 * 654183)) - (r423 * 997805)) + (r404 * 136657);
        long r202 = (((((r20 + (r502 * 666643)) + (r484 * 470296)) + (r463 * 654183)) - (r444 * 997805)) + (r423 * 136657)) - (r404 * 683901);
        long r405 = (r13 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r63 = r62 + r405;
        long r14 = r13 - (r405 << 21);
        long r406 = (r92 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r123 = r122 + r406;
        long r93 = r92 - (r406 << 21);
        long r407 = (r152 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r203 = r202 + r407;
        long r153 = r152 - (r407 << 21);
        long r408 = (r234 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r275 = ((((r274 + (r502 * 654183)) - (r484 * 997805)) + (r463 * 136657)) - (r444 * 683901)) + r408;
        long r235 = r234 - (r408 << 21);
        long r409 = (r315 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r345 = ((r344 + (r502 * 136657)) - (r484 * 683901)) + r409;
        long r316 = r315 - (r409 << 21);
        long r4010 = (r365 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r385 = r384 + r4010;
        long r366 = r365 - (r4010 << 21);
        long r4011 = (r63 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r94 = r93 + r4011;
        long r64 = r63 - (r4011 << 21);
        long r4012 = (r123 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r154 = r153 + r4012;
        long r124 = r123 - (r4012 << 21);
        long r4013 = (r203 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r236 = r235 + r4013;
        long r204 = r203 - (r4013 << 21);
        long r4014 = (r275 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r317 = r316 + r4014;
        long r276 = r275 - (r4014 << 21);
        long r4015 = (r345 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r182 = (r385 + SentryOptions.MAX_EVENT_SIZE_BYTES) >> 21;
        long r386 = r385 - (r182 << 21);
        long r16 = r14 + (r182 * 666643);
        long r65 = r64 + (r182 * 470296);
        long r95 = r94 + (r182 * 654183);
        long r125 = r124 - (r182 * 997805);
        long r155 = r154 + (r182 * 136657);
        long r205 = r204 - (r182 * 683901);
        long r183 = r16 >> 21;
        long r66 = r65 + r183;
        long r17 = r16 - (r183 << 21);
        long r184 = r66 >> 21;
        long r96 = r95 + r184;
        long r67 = r66 - (r184 << 21);
        long r185 = r96 >> 21;
        long r126 = r125 + r185;
        long r97 = r96 - (r185 << 21);
        long r186 = r126 >> 21;
        long r156 = r155 + r186;
        long r127 = r126 - (r186 << 21);
        long r187 = r156 >> 21;
        long r206 = r205 + r187;
        long r157 = r156 - (r187 << 21);
        long r188 = r206 >> 21;
        long r237 = r236 + r188;
        long r207 = r206 - (r188 << 21);
        long r189 = r237 >> 21;
        long r277 = r276 + r189;
        long r238 = r237 - (r189 << 21);
        long r1810 = r277 >> 21;
        long r318 = r317 + r1810;
        long r278 = r277 - (r1810 << 21);
        long r1811 = r318 >> 21;
        long r346 = (r345 - (r4015 << 21)) + r1811;
        long r319 = r318 - (r1811 << 21);
        long r1812 = r346 >> 21;
        long r367 = (r366 + r4015) + r1812;
        long r347 = r346 - (r1812 << 21);
        long r1813 = r367 >> 21;
        long r387 = r386 + r1813;
        long r368 = r367 - (r1813 << 21);
        long r1814 = r387 >> 21;
        long r388 = r387 - (r1814 << 21);
        long r19 = r17 + (666643 * r1814);
        long r68 = r67 + (470296 * r1814);
        long r98 = r97 + (654183 * r1814);
        long r128 = r127 - (997805 * r1814);
        long r158 = r157 + (136657 * r1814);
        long r208 = r207 - (r1814 * 683901);
        long r1815 = r19 >> 21;
        long r69 = r68 + r1815;
        long r110 = r19 - (r1815 << 21);
        long r1816 = r69 >> 21;
        long r99 = r98 + r1816;
        long r610 = r69 - (r1816 << 21);
        long r1817 = r99 >> 21;
        long r129 = r128 + r1817;
        long r910 = r99 - (r1817 << 21);
        long r1818 = r129 >> 21;
        long r159 = r158 + r1818;
        long r1210 = r129 - (r1818 << 21);
        long r1819 = r159 >> 21;
        long r209 = r208 + r1819;
        long r1510 = r159 - (r1819 << 21);
        long r1820 = r209 >> 21;
        long r239 = r238 + r1820;
        long r2010 = r209 - (r1820 << 21);
        long r1821 = r239 >> 21;
        long r279 = r278 + r1821;
        long r2310 = r239 - (r1821 << 21);
        long r1822 = r279 >> 21;
        long r3110 = r319 + r1822;
        long r2710 = r279 - (r1822 << 21);
        long r1823 = r3110 >> 21;
        long r348 = r347 + r1823;
        long r4 = r3110 - (r1823 << 21);
        long r1824 = r348 >> 21;
        long r369 = r368 + r1824;
        long r349 = r348 - (r1824 << 21);
        long r1825 = r369 >> 21;
        long r389 = r388 + r1825;
        long r3610 = r369 - (r1825 << 21);
        r74[0] = (byte) r110;
        r74[1] = (byte) (r110 >> 8);
        r74[2] = (byte) ((r110 >> 16) | (r610 << 5));
        r74[3] = (byte) (r610 >> 3);
        r74[4] = (byte) (r610 >> 11);
        r74[5] = (byte) ((r610 >> 19) | (r910 << 2));
        r74[6] = (byte) (r910 >> 6);
        r74[7] = (byte) ((r910 >> 14) | (r1210 << 7));
        r74[8] = (byte) (r1210 >> 1);
        r74[9] = (byte) (r1210 >> 9);
        r74[10] = (byte) ((r1210 >> 17) | (r1510 << 4));
        r74[11] = (byte) (r1510 >> 4);
        r74[12] = (byte) (r1510 >> 12);
        r74[13] = (byte) ((r1510 >> 20) | (r2010 << 1));
        r74[14] = (byte) (r2010 >> 7);
        r74[15] = (byte) ((r2010 >> 15) | (r2310 << 6));
        r74[16] = (byte) (r2310 >> 2);
        r74[17] = (byte) (r2310 >> 10);
        r74[18] = (byte) ((r2310 >> 18) | (r2710 << 3));
        r74[19] = (byte) (r2710 >> 5);
        r74[20] = (byte) (r2710 >> 13);
        r74[21] = (byte) r4;
        r74[22] = (byte) (r4 >> 8);
        r74[23] = (byte) ((r4 >> 16) | (r349 << 5));
        r74[24] = (byte) (r349 >> 3);
        r74[25] = (byte) (r349 >> 11);
        r74[26] = (byte) ((r349 >> 19) | (r3610 << 2));
        r74[27] = (byte) (r3610 >> 6);
        r74[28] = (byte) ((r3610 >> 14) | (r389 << 7));
        r74[29] = (byte) (r389 >> 1);
        r74[30] = (byte) (r389 >> 9);
        r74[31] = (byte) (r389 >> 17);
    }

    private static XYZ scalarMultWithBase(byte[] r8) {
        byte[] r1 = new byte[64];
        int r2 = 0;
        int r3 = 0;
    L3:
        int r5 = 1;
        if (r3 >= 32) goto L6;
        int r4 = r3 * 2;
        r1[r4] = (byte) (r8[r3] & Ascii.SI);
        r1[r4 + 1] = (byte) (((r8[r3] & UnsignedBytes.MAX_VALUE) >> 4) & 15);
        r3 = r3 + 1;
        goto L3
    L6:
        int r82 = 0;
        int r32 = 0;
    L8:
        if (r82 >= 63) goto L10;
        byte r33 = (byte) (r1[r82] + r32);
        r1[r82] = r33;
        int r42 = (r33 + 8) >> 4;
        r1[r82] = (byte) (r33 - (r42 << 4));
        r82 = r82 + 1;
        r32 = r42;
        goto L8
    L10:
        r1[63] = (byte) (r1[63] + r32);
        PartialXYZT r83 = new PartialXYZT(NEUTRAL);
        XYZT r34 = new XYZT();
    L11:
        if (r5 >= 64) goto L13;
        CachedXYT r43 = new CachedXYT(CACHED_NEUTRAL);
        select(r43, r5 / 2, r1[r5]);
        add(r83, XYZT.access$400(r34, r83), r43);
        r5 = r5 + 2;
        goto L11
    L13:
        XYZ r44 = new XYZ();
        doubleXYZ(r83, XYZ.fromPartialXYZT(r44, r83));
        doubleXYZ(r83, XYZ.fromPartialXYZT(r44, r83));
        doubleXYZ(r83, XYZ.fromPartialXYZT(r44, r83));
        doubleXYZ(r83, XYZ.fromPartialXYZT(r44, r83));
    L14:
        if (r2 >= 64) goto L16;
        CachedXYT r45 = new CachedXYT(CACHED_NEUTRAL);
        select(r45, r2 / 2, r1[r2]);
        add(r83, XYZT.access$400(r34, r83), r45);
        r2 = r2 + 2;
        goto L14
    L16:
        XYZ r02 = new XYZ(r83);
        if (r02.isOnCurve() == false) goto L20;
        return r02;
    L20:
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    public static byte[] scalarMultWithBaseToBytes(byte[] r02) {
        return scalarMultWithBase(r02).toBytes();
    }

    private static void select(CachedXYT r6, int r7, byte r8) {
        int r02 = (r8 & UnsignedBytes.MAX_VALUE) >> 7;
        int r82 = r8 - (((-r02) & r8) << 1);
        CachedXYT[][] r2 = Ed25519Constants.B_TABLE;
        r6.copyConditional(r2[r7][0], eq(r82, 1));
        r6.copyConditional(r2[r7][1], eq(r82, 2));
        r6.copyConditional(r2[r7][2], eq(r82, 3));
        r6.copyConditional(r2[r7][3], eq(r82, 4));
        r6.copyConditional(r2[r7][4], eq(r82, 5));
        r6.copyConditional(r2[r7][5], eq(r82, 6));
        r6.copyConditional(r2[r7][6], eq(r82, 7));
        r6.copyConditional(r2[r7][7], eq(r82, 8));
        long[] r72 = Arrays.copyOf(r6.yMinusX, 10);
        long[] r1 = Arrays.copyOf(r6.yPlusX, 10);
        long[] r83 = Arrays.copyOf(r6.t2d, 10);
        neg(r83, r83);
        r6.copyConditional(new CachedXYT(r72, r1, r83), r02);
    }

    public static byte[] sign(byte[] r5, byte[] r6, byte[] r7) throws GeneralSecurityException {
        byte[] r52 = Arrays.copyOfRange(r5, 0, r5.length);
        MessageDigest r02 = EngineFactory.MESSAGE_DIGEST.getInstance("SHA-512");
        r02.update(r7, 32, 32);
        r02.update(r52);
        byte[] r3 = r02.digest();
        reduce(r3);
        byte[] r1 = Arrays.copyOfRange(scalarMultWithBase(r3).toBytes(), 0, 32);
        r02.reset();
        r02.update(r1);
        r02.update(r6);
        r02.update(r52);
        byte[] r53 = r02.digest();
        reduce(r53);
        byte[] r62 = new byte[32];
        mulAdd(r62, r53, r7, r3);
        return Bytes.concat(new byte[][]{r1, r62});
    }

    private static byte[] slide(byte[] r10) {
        byte[] r1 = new byte[256];
        int r3 = 0;
    L4:
        if (r3 >= 256) goto L6;
        r1[r3] = (byte) (1 & ((r10[r3 >> 3] & UnsignedBytes.MAX_VALUE) >> (r3 & 7)));
        r3 = r3 + 1;
        goto L4
    L6:
        int r102 = 0;
    L7:
        if (r102 >= 256) goto L30;
        if (r1[r102] == 0) goto L29;
        int r32 = 1;
    L12:
        if (r32 > 6) goto L29;
        int r5 = r102 + r32;
        if (r5 >= 256) goto L29;
        byte r6 = r1[r5];
        if (r6 == 0) goto L28;
        byte r7 = r1[r102];
        if (((r6 << r32) + r7) > 15) goto L21;
        r1[r102] = (byte) (r7 + (r6 << r32));
        r1[r5] = 0;
        goto L28
    L21:
        if ((r7 - (r6 << r32)) < (-15)) goto L29;
        r1[r102] = (byte) (r7 - (r6 << r32));
    L23:
        if (r5 >= 256) goto L28;
        if (r1[r5] == 0) goto L26;
        r1[r5] = 0;
        r5 = r5 + 1;
        goto L23
    L26:
        r1[r5] = 1;
    L28:
        r32 = r32 + 1;
    L29:
        r102 = r102 + 1;
        goto L7
    L30:
        return r1;
    }

    private static void sub(PartialXYZT r4, XYZT r5, CachedXYT r6) {
        long[] r02 = new long[10];
        long[] r1 = r4.xyz.f38438x;
        XYZ r2 = r5.xyz;
        Field25519.sum(r1, r2.f38439y, r2.f38438x);
        long[] r12 = r4.xyz.f38439y;
        XYZ r22 = r5.xyz;
        Field25519.sub(r12, r22.f38439y, r22.f38438x);
        long[] r13 = r4.xyz.f38439y;
        Field25519.mult(r13, r13, r6.yPlusX);
        XYZ r14 = r4.xyz;
        Field25519.mult(r14.f38440z, r14.f38438x, r6.yMinusX);
        Field25519.mult(r4.f38437t, r5.f38441t, r6.t2d);
        r6.multByZ(r4.xyz.f38438x, r5.xyz.f38440z);
        long[] r52 = r4.xyz.f38438x;
        Field25519.sum(r02, r52, r52);
        XYZ r53 = r4.xyz;
        Field25519.sub(r53.f38438x, r53.f38440z, r53.f38439y);
        XYZ r54 = r4.xyz;
        long[] r62 = r54.f38439y;
        Field25519.sum(r62, r54.f38440z, r62);
        Field25519.sub(r4.xyz.f38440z, r02, r4.f38437t);
        long[] r42 = r4.f38437t;
        Field25519.sum(r42, r02, r42);
    }

    public static boolean verify(byte[] r5, byte[] r6, byte[] r7) throws GeneralSecurityException {
        if (r6.length == 64) goto L5;
        return false;
    L5:
        byte[] r2 = Arrays.copyOfRange(r6, 32, 64);
        if (isSmallerThanGroupOrder(r2) == true) goto L8;
        return false;
    L8:
        MessageDigest r3 = EngineFactory.MESSAGE_DIGEST.getInstance("SHA-512");
        r3.update(r6, 0, 32);
        r3.update(r7);
        r3.update(r5);
        byte[] r52 = r3.digest();
        reduce(r52);
        byte[] r53 = doubleScalarMultVarTime(r52, XYZT.access$500(r7), r2).toBytes();
        int r72 = 0;
    L9:
        if (r72 >= 32) goto L14;
        if (r53[r72] != r6[r72]) goto L12;
        r72 = r72 + 1;
        goto L9
    L12:
        return false;
    L14:
        return true;
    }
}
