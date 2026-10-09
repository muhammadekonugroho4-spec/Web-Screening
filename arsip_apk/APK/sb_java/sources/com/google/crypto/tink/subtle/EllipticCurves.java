package com.google.crypto.tink.subtle;

import com.google.common.primitives.UnsignedBytes;
import com.google.crypto.tink.internal.BigIntegerEncoding;
import com.google.crypto.tink.internal.EllipticCurvesUtil;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* loaded from: classes6.dex */
public final class EllipticCurves {

    /* renamed from: com.google.crypto.tink.subtle.EllipticCurves$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType = null;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType = null;

        static {
            int[] r02 = new int[CurveType.values().length];
            $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType = r02;
            r02[CurveType.NIST_P256.ordinal()] = 1;     // Catch: NoSuchFieldError -> L13
        L21:
            $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType[CurveType.NIST_P384.ordinal()] = 2;     // Catch: NoSuchFieldError -> L14
        L23:
            $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType[CurveType.NIST_P521.ordinal()] = 3;     // Catch: NoSuchFieldError -> L15
        L8:
            int[] r3 = new int[PointFormatType.values().length];
            $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType = r3;
            r3[PointFormatType.UNCOMPRESSED.ordinal()] = 1;     // Catch: NoSuchFieldError -> L16
        L29:
            $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType[PointFormatType.DO_NOT_USE_CRUNCHY_UNCOMPRESSED.ordinal()] = 2;     // Catch: NoSuchFieldError -> L17
        L19:
            $SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType[PointFormatType.COMPRESSED.ordinal()] = 3;     // Catch: NoSuchFieldError -> L18
            return;
        }
    }

    public enum CurveType extends Enum<CurveType> {
        private static final /* synthetic */ CurveType[] $VALUES = null;
        public static final CurveType NIST_P256 = null;
        public static final CurveType NIST_P384 = null;
        public static final CurveType NIST_P521 = null;

        static {
            CurveType r02 = new CurveType("NIST_P256", 0);
            NIST_P256 = r02;
            CurveType r1 = new CurveType("NIST_P384", 1);
            NIST_P384 = r1;
            CurveType r2 = new CurveType("NIST_P521", 2);
            NIST_P521 = r2;
            $VALUES = new CurveType[]{r02, r1, r2};
        }

        CurveType(String r1, int r2) {
        }

        public static CurveType valueOf(String r1) {
            return (CurveType) Enum.valueOf(CurveType.class, r1);
        }

        public static CurveType[] values() {
            return (CurveType[]) $VALUES.clone();
        }
    }

    public enum EcdsaEncoding extends Enum<EcdsaEncoding> {
        private static final /* synthetic */ EcdsaEncoding[] $VALUES = null;
        public static final EcdsaEncoding DER = null;
        public static final EcdsaEncoding IEEE_P1363 = null;

        static {
            EcdsaEncoding r02 = new EcdsaEncoding("IEEE_P1363", 0);
            IEEE_P1363 = r02;
            EcdsaEncoding r1 = new EcdsaEncoding("DER", 1);
            DER = r1;
            $VALUES = new EcdsaEncoding[]{r02, r1};
        }

        EcdsaEncoding(String r1, int r2) {
        }

        public static EcdsaEncoding valueOf(String r1) {
            return (EcdsaEncoding) Enum.valueOf(EcdsaEncoding.class, r1);
        }

        public static EcdsaEncoding[] values() {
            return (EcdsaEncoding[]) $VALUES.clone();
        }
    }

    public enum PointFormatType extends Enum<PointFormatType> {
        private static final /* synthetic */ PointFormatType[] $VALUES = null;
        public static final PointFormatType COMPRESSED = null;
        public static final PointFormatType DO_NOT_USE_CRUNCHY_UNCOMPRESSED = null;
        public static final PointFormatType UNCOMPRESSED = null;

        static {
            PointFormatType r02 = new PointFormatType("UNCOMPRESSED", 0);
            UNCOMPRESSED = r02;
            PointFormatType r1 = new PointFormatType("COMPRESSED", 1);
            COMPRESSED = r1;
            PointFormatType r2 = new PointFormatType("DO_NOT_USE_CRUNCHY_UNCOMPRESSED", 2);
            DO_NOT_USE_CRUNCHY_UNCOMPRESSED = r2;
            $VALUES = new PointFormatType[]{r02, r1, r2};
        }

        PointFormatType(String r1, int r2) {
        }

        public static PointFormatType valueOf(String r1) {
            return (PointFormatType) Enum.valueOf(PointFormatType.class, r1);
        }

        public static PointFormatType[] values() {
            return (PointFormatType[]) $VALUES.clone();
        }
    }

    private EllipticCurves() {
    }

    public static void checkPublicKey(ECPublicKey r1) throws GeneralSecurityException {
        EllipticCurvesUtil.checkPointOnCurve(r1.getW(), r1.getParams().getCurve());
    }

    public static byte[] computeSharedSecret(ECPrivateKey r02, ECPublicKey r1) throws GeneralSecurityException {
        validatePublicKeySpec(r1, r02);
        return computeSharedSecret(r02, r1.getW());
    }

    public static ECPoint ecPointDecode(EllipticCurve r02, PointFormatType r1, byte[] r2) throws GeneralSecurityException {
        return pointDecode(r02, r1, r2);
    }

    public static byte[] ecdsaDer2Ieee(byte[] r8, int r9) throws GeneralSecurityException {
        if (isValidDerEncoding(r8) == false) goto L19;
        byte[] r02 = new byte[r9];
        int r1 = 1;
        if ((r8[1] & UnsignedBytes.MAX_VALUE) < 128) goto L7;
        int r2 = 3;
    L8:
        int r3 = r2 + 1;
        int r22 = r2 + 2;
        int r32 = r8[r3];
        if (r8[r22] != 0) goto L11;
        int r4 = 1;
    L12:
        System.arraycopy(r8, r22 + r4, r02, ((r9 / 2) - r32) + r4, r32 - r4);
        int r23 = r22 + (r32 + 1);
        int r33 = r23 + 1;
        int r24 = r8[r23];
        if (r8[r33] == 0) goto L16;
        r1 = 0;
    L16:
        System.arraycopy(r8, r33 + r1, r02, (r9 - r24) + r1, r24 - r1);
        return r02;
    L11:
        r4 = 0;
        goto L12
    L7:
        r2 = 2;
        goto L8
    L19:
        throw new GeneralSecurityException("Invalid DER encoding");
    }

    public static byte[] ecdsaIeee2Der(byte[] r7) throws GeneralSecurityException {
        if ((r7.length % 2) != 0) goto L15;
        if (r7.length == 0) goto L15;
        if (r7.length > 132) goto L15;
        byte[] r02 = toMinimalSignedNumber(Arrays.copyOf(r7, r7.length / 2));
        byte[] r72 = toMinimalSignedNumber(Arrays.copyOfRange(r7, r7.length / 2, r7.length));
        int r2 = (r02.length + 4) + r72.length;
        if (r2 < 128) goto L11;
        byte[] r3 = new byte[r2 + 3];
        r3[0] = 48;
        r3[1] = -127;
        r3[2] = (byte) r2;
        int r22 = 3;
    L12:
        int r4 = r22 + 1;
        r3[r22] = 2;
        int r23 = r22 + 2;
        r3[r4] = (byte) r02.length;
        System.arraycopy(r02, 0, r3, r23, r02.length);
        int r24 = r23 + r02.length;
        r3[r24] = 2;
        r3[r24 + 1] = (byte) r72.length;
        System.arraycopy(r72, 0, r3, r24 + 2, r72.length);
        return r3;
    L11:
        r3 = new byte[r2 + 2];
        r3[0] = 48;
        r3[1] = (byte) r2;
        r22 = 2;
    L15:
        throw new GeneralSecurityException("Invalid IEEE_P1363 encoding");
    }

    public static int encodingSizeInBytes(EllipticCurve r2, PointFormatType r3) throws GeneralSecurityException {
        int r22 = fieldSizeInBytes(r2);
        int r32 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType[r3.ordinal()];
        if (r32 == 1) goto L14;
        if (r32 == 2) goto L12;
        if (r32 != 3) goto L10;
        return r22 + 1;
    L10:
        throw new GeneralSecurityException("unknown EC point format");
    L12:
        return r22 * 2;
    L14:
        return (r22 * 2) + 1;
    }

    public static int fieldSizeInBits(EllipticCurve r1) throws GeneralSecurityException {
        return getModulus(r1).subtract(BigInteger.ONE).bitLength();
    }

    public static int fieldSizeInBytes(EllipticCurve r02) throws GeneralSecurityException {
        return (fieldSizeInBits(r02) + 7) / 8;
    }

    public static KeyPair generateKeyPair(CurveType r02) throws GeneralSecurityException {
        return generateKeyPair(getCurveSpec(r02));
    }

    public static ECParameterSpec getCurveSpec(CurveType r3) throws NoSuchAlgorithmException {
        int r02 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$CurveType[r3.ordinal()];
        if (r02 == 1) goto L15;
        if (r02 == 2) goto L13;
        if (r02 != 3) goto L11;
        return getNistP521Params();
    L11:
        throw new NoSuchAlgorithmException("curve not implemented:" + r3);
    L13:
        return getNistP384Params();
    L15:
        return getNistP256Params();
    }

    public static ECPrivateKey getEcPrivateKey(byte[] r2) throws GeneralSecurityException {
        return (ECPrivateKey) EngineFactory.KEY_FACTORY.getInstance("EC").generatePrivate(new PKCS8EncodedKeySpec(r2));
    }

    public static ECPublicKey getEcPublicKey(byte[] r2) throws GeneralSecurityException {
        return (ECPublicKey) EngineFactory.KEY_FACTORY.getInstance("EC").generatePublic(new X509EncodedKeySpec(r2));
    }

    public static BigInteger getModulus(EllipticCurve r02) throws GeneralSecurityException {
        return EllipticCurvesUtil.getModulus(r02);
    }

    public static ECParameterSpec getNistP256Params() {
        return EllipticCurvesUtil.NIST_P256_PARAMS;
    }

    public static ECParameterSpec getNistP384Params() {
        return EllipticCurvesUtil.NIST_P384_PARAMS;
    }

    public static ECParameterSpec getNistP521Params() {
        return EllipticCurvesUtil.NIST_P521_PARAMS;
    }

    public static BigInteger getY(BigInteger r3, boolean r4, EllipticCurve r5) throws GeneralSecurityException {
        BigInteger r02 = getModulus(r5);
        BigInteger r1 = r5.getA();
        BigInteger r52 = r5.getB();
        BigInteger r32 = modSqrt(r3.multiply(r3).add(r1).multiply(r3).add(r52).mod(r02), r02);
        if (r4 != r32.testBit(0)) goto L5;
        return r32;
    L5:
        return r02.subtract(r32).mod(r02);
    }

    public static boolean isNistEcParameterSpec(ECParameterSpec r02) {
        return EllipticCurvesUtil.isNistEcParameterSpec(r02);
    }

    public static boolean isSameEcParameterSpec(ECParameterSpec r02, ECParameterSpec r1) {
        return EllipticCurvesUtil.isSameEcParameterSpec(r02, r1);
    }

    public static boolean isValidDerEncoding(byte[] r11) {
        if (r11.length >= 8) goto L6;
        return false;
    L6:
        if (r11[0] == 48) goto L8;
        return false;
    L8:
        int r1 = r11[1] & UnsignedBytes.MAX_VALUE;
        if (r1 != 129) goto L14;
        r1 = r11[2] & UnsignedBytes.MAX_VALUE;
        if (r1 >= 128) goto L13;
        return false;
    L13:
        int r3 = 2;
    L19:
        if (r1 == ((r11.length - 1) - r3)) goto L22;
        return false;
    L22:
        if (r11[r3 + 1] == 2) goto L24;
        return false;
    L24:
        int r12 = r11[r3 + 2] & UnsignedBytes.MAX_VALUE;
        int r6 = (r3 + 3) + r12;
        int r7 = r6 + 1;
        if (r7 < r11.length) goto L27;
        return false;
    L27:
        if (r12 != 0) goto L29;
        return false;
    L29:
        int r8 = r3 + 3;
        byte r9 = r11[r8];
        if ((r9 & UnsignedBytes.MAX_VALUE) < 128) goto L32;
        return false;
    L32:
        if (r12 <= 1) goto L38;
        if (r9 != 0) goto L38;
        if ((r11[r3 + 4] & UnsignedBytes.MAX_VALUE) >= 128) goto L38;
        return false;
    L38:
        if (r11[r8 + r12] == 2) goto L40;
        return false;
    L40:
        int r72 = r11[r7] & UnsignedBytes.MAX_VALUE;
        if (((r6 + 2) + r72) == r11.length) goto L43;
        return false;
    L43:
        if (r72 != 0) goto L45;
        return false;
    L45:
        byte r5 = r11[(r3 + 5) + r12];
        if ((r5 & UnsignedBytes.MAX_VALUE) < 128) goto L48;
        return false;
    L48:
        if (r72 <= 1) goto L53;
        if (r5 != 0) goto L53;
        if ((r11[(r3 + 6) + r12] & UnsignedBytes.MAX_VALUE) >= 128) goto L53;
        return false;
    L53:
        return true;
    L14:
        if (r1 == 128) goto L54;
        if (r1 > 129) goto L54;
        r3 = 1;
    L54:
        return false;
    }

    public static BigInteger modSqrt(BigInteger r9, BigInteger r10) throws GeneralSecurityException {
        if (r10.signum() != 1) goto L50;
        BigInteger r92 = r9.mod(r10);
        BigInteger r02 = BigInteger.ZERO;
        if (r92.equals(r02) == false) goto L7;
        return r02;
    L7:
        int r03 = 0;
        if (r10.testBit(0) == false) goto L13;
        if (r10.testBit(1) == false) goto L13;
        BigInteger r04 = r92.modPow(r10.add(BigInteger.ONE).shiftRight(2), r10);
    L42:
        if (r04 != null) goto L44;
    L48:
        return r04;
    L44:
        if (r04.multiply(r04).mod(r10).compareTo(r92) == 0) goto L48;
        throw new GeneralSecurityException("Could not find a modular square root");
    L13:
        if (r10.testBit(0) == true) goto L15;
    L41:
        r04 = null;
        goto L42
    L15:
        if (r10.testBit(1) == true) goto L41;
        BigInteger r2 = BigInteger.ONE;
        BigInteger r4 = r10.subtract(r2).shiftRight(1);
    L17:
        BigInteger r5 = r2.multiply(r2).subtract(r92).mod(r10);
        if (r5.equals(BigInteger.ZERO) == true) goto L19;
        BigInteger r6 = r5.modPow(r4, r10);
        BigInteger r7 = BigInteger.ONE;
        if (r6.add(r7).equals(r10) == true) goto L22;
        if (r6.equals(r7) == false) goto L40;
        r2 = r2.add(r7);
        r03 = r03 + 1;
        if (r03 != 128) goto L17;
        if (r10.isProbablePrime(80) == true) goto L17;
        throw new InvalidAlgorithmParameterException("p is not prime");
    L40:
        throw new InvalidAlgorithmParameterException("p is not prime");
    L22:
        BigInteger r05 = r10.add(r7).shiftRight(1);
        int r3 = r05.bitLength() - 2;
        BigInteger r1 = r2;
    L23:
        if (r3 < 0) goto L29;
        BigInteger r42 = r1.multiply(r7);
        r1 = r1.multiply(r1).add(r7.multiply(r7).mod(r10).multiply(r5)).mod(r10);
        BigInteger r43 = r42.add(r42).mod(r10);
        if (r05.testBit(r3) == false) goto L27;
        BigInteger r62 = r1.multiply(r2).add(r43.multiply(r5)).mod(r10);
        r7 = r2.multiply(r43).add(r1).mod(r10);
        r1 = r62;
    L28:
        r3 = r3 - 1;
        goto L23
    L27:
        r7 = r43;
        goto L28
    L29:
        r04 = r1;
        goto L42
    L19:
        return r2;
    L50:
        throw new InvalidAlgorithmParameterException("p must be positive");
    }

    public static ECPoint pointDecode(CurveType r02, PointFormatType r1, byte[] r2) throws GeneralSecurityException {
        return pointDecode(getCurveSpec(r02).getCurve(), r1, r2);
    }

    public static byte[] pointEncode(CurveType r02, PointFormatType r1, ECPoint r2) throws GeneralSecurityException {
        return pointEncode(getCurveSpec(r02).getCurve(), r1, r2);
    }

    private static byte[] toMinimalSignedNumber(byte[] r5) {
        int r02 = 0;
        int r1 = 0;
    L4:
        if (r1 >= r5.length) goto L9;
        if (r5[r1] != 0) goto L9;
        r1 = r1 + 1;
    L9:
        if (r1 != r5.length) goto L12;
        r1 = r5.length - 1;
    L12:
        if ((r5[r1] & UnsignedBytes.MAX_POWER_OF_TWO) != 128) goto L14;
        r02 = 1;
    L14:
        byte[] r2 = new byte[(r5.length - r1) + r02];
        System.arraycopy(r5, r1, r2, r02, r5.length - r1);
        return r2;
    }

    public static void validatePublicKey(ECPublicKey r02, ECPrivateKey r1) throws GeneralSecurityException {
        validatePublicKeySpec(r02, r1);
        EllipticCurvesUtil.checkPointOnCurve(r02.getW(), r1.getParams().getCurve());
    }

    public static void validatePublicKeySpec(ECPublicKey r02, ECPrivateKey r1) throws GeneralSecurityException {
    L7:
        e = move-exception;
        throw new GeneralSecurityException(e);
    L3:
        if (isSameEcParameterSpec(r02.getParams(), r1.getParams()) == false) goto L6;
        return;
    L6:
        throw new GeneralSecurityException("invalid public key spec");     // Catch: Throwable -> L7
    }

    private static void validateSharedSecret(byte[] r3, ECPrivateKey r4) throws GeneralSecurityException {
        EllipticCurve r42 = r4.getParams().getCurve();
        BigInteger r02 = new BigInteger(1, r3);
        if (r02.signum() == (-1)) goto L9;
        if (r02.compareTo(getModulus(r42)) >= 0) goto L9;
        getY(r02, true, r42);
        return;
    L9:
        throw new GeneralSecurityException("shared secret is out of range");
    }

    public static KeyPair generateKeyPair(ECParameterSpec r2) throws GeneralSecurityException {
        KeyPairGenerator r02 = EngineFactory.KEY_PAIR_GENERATOR.getInstance("EC");
        r02.initialize(r2);
        return r02.generateKeyPair();
    }

    public static ECPoint pointDecode(EllipticCurve r6, PointFormatType r7, byte[] r8) throws GeneralSecurityException {
        int r02 = fieldSizeInBytes(r6);
        int r1 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType[r7.ordinal()];
        boolean r3 = false;
        if (r1 == 1) goto L36;
        if (r1 == 2) goto L30;
        if (r1 != 3) goto L28;
        BigInteger r72 = getModulus(r6);
        if (r8.length != (r02 + 1)) goto L26;
        byte r03 = r8[0];
        if (r03 == 2) goto L15;
        if (r03 != 3) goto L24;
        r3 = true;
        goto L15
    L24:
        throw new GeneralSecurityException("invalid format");
    L15:
        BigInteger r04 = new BigInteger(1, Arrays.copyOfRange(r8, 1, r8.length));
        if (r04.signum() == (-1)) goto L22;
        if (r04.compareTo(r72) >= 0) goto L22;
        return new ECPoint(r04, getY(r04, r3, r6));
    L22:
        throw new GeneralSecurityException("x is out of range");
    L26:
        throw new GeneralSecurityException("compressed point has wrong length");
    L28:
        throw new GeneralSecurityException("invalid format:" + r7);
    L30:
        if (r8.length != (r02 * 2)) goto L34;
        ECPoint r82 = new ECPoint(new BigInteger(1, Arrays.copyOfRange(r8, 0, r02)), new BigInteger(1, Arrays.copyOfRange(r8, r02, r8.length)));
        EllipticCurvesUtil.checkPointOnCurve(r82, r6);
        return r82;
    L34:
        throw new GeneralSecurityException("invalid point size");
    L36:
        if (r8.length != ((r02 * 2) + 1)) goto L44;
        if (r8[0] != 4) goto L42;
        int r05 = r02 + 1;
        ECPoint r83 = new ECPoint(new BigInteger(1, Arrays.copyOfRange(r8, 1, r05)), new BigInteger(1, Arrays.copyOfRange(r8, r05, r8.length)));
        EllipticCurvesUtil.checkPointOnCurve(r83, r6);
        return r83;
    L42:
        throw new GeneralSecurityException("invalid point format");
    L44:
        throw new GeneralSecurityException("invalid point size");
    }

    public static byte[] pointEncode(EllipticCurve r5, PointFormatType r6, ECPoint r7) throws GeneralSecurityException {
        EllipticCurvesUtil.checkPointOnCurve(r7, r5);
        int r52 = fieldSizeInBytes(r5);
        int r02 = AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$EllipticCurves$PointFormatType[r6.ordinal()];
        if (r02 == 1) goto L23;
        int r3 = 2;
        if (r02 != 2) goto L7;
        int r62 = r52 * 2;
        byte[] r03 = new byte[r62];
        byte[] r1 = BigIntegerEncoding.toBigEndianBytes(r7.getAffineX());
        if (r1.length <= r52) goto L18;
        r1 = Arrays.copyOfRange(r1, r1.length - r52, r1.length);
    L18:
        byte[] r72 = BigIntegerEncoding.toBigEndianBytes(r7.getAffineY());
        if (r72.length <= r52) goto L21;
        r72 = Arrays.copyOfRange(r72, r72.length - r52, r72.length);
    L21:
        System.arraycopy(r72, 0, r03, r62 - r72.length, r72.length);
        System.arraycopy(r1, 0, r03, r52 - r1.length, r1.length);
        return r03;
    L7:
        if (r02 != 3) goto L14;
        int r53 = r52 + 1;
        byte[] r63 = new byte[r53];
        byte[] r04 = BigIntegerEncoding.toBigEndianBytes(r7.getAffineX());
        System.arraycopy(r04, 0, r63, r53 - r04.length, r04.length);
        if (r7.getAffineY().testBit(0) == false) goto L11;
        r3 = 3;
    L11:
        r63[0] = (byte) r3;
        return r63;
    L14:
        throw new GeneralSecurityException("invalid format:" + r6);
    L23:
        int r64 = (r52 * 2) + 1;
        byte[] r05 = new byte[r64];
        byte[] r32 = BigIntegerEncoding.toBigEndianBytes(r7.getAffineX());
        byte[] r73 = BigIntegerEncoding.toBigEndianBytes(r7.getAffineY());
        System.arraycopy(r73, 0, r05, r64 - r73.length, r73.length);
        System.arraycopy(r32, 0, r05, (r52 + 1) - r32.length, r32.length);
        r05[0] = 4;
        return r05;
    }

    public static byte[] computeSharedSecret(ECPrivateKey r2, ECPoint r3) throws GeneralSecurityException {
        EllipticCurvesUtil.checkPointOnCurve(r3, r2.getParams().getCurve());
        ECPublicKeySpec r1 = new ECPublicKeySpec(r3, r2.getParams());
        PublicKey r32 = EngineFactory.KEY_FACTORY.getInstance("EC").generatePublic(r1);
        KeyAgreement r02 = EngineFactory.KEY_AGREEMENT.getInstance("ECDH");
        r02.init(r2);
        r02.doPhase(r32, true);     // Catch: IllegalStateException -> L5
        byte[] r33 = r02.generateSecret();     // Catch: IllegalStateException -> L5
        validateSharedSecret(r33, r2);     // Catch: IllegalStateException -> L5
        return r33;
    L5:
        e = move-exception;
        throw new GeneralSecurityException(e);
    }

    public static ECPrivateKey getEcPrivateKey(CurveType r1, byte[] r2) throws GeneralSecurityException {
        ECParameterSpec r12 = getCurveSpec(r1);
        ECPrivateKeySpec r02 = new ECPrivateKeySpec(BigIntegerEncoding.fromUnsignedBigEndianBytes(r2), r12);
        return (ECPrivateKey) EngineFactory.KEY_FACTORY.getInstance("EC").generatePrivate(r02);
    }

    public static ECPublicKey getEcPublicKey(CurveType r02, PointFormatType r1, byte[] r2) throws GeneralSecurityException {
        return getEcPublicKey(getCurveSpec(r02), r1, r2);
    }

    public static ECPublicKey getEcPublicKey(ECParameterSpec r1, PointFormatType r2, byte[] r3) throws GeneralSecurityException {
        ECPublicKeySpec r32 = new ECPublicKeySpec(pointDecode(r1.getCurve(), r2, r3), r1);
        return (ECPublicKey) EngineFactory.KEY_FACTORY.getInstance("EC").generatePublic(r32);
    }

    public static ECPublicKey getEcPublicKey(CurveType r2, byte[] r3, byte[] r4) throws GeneralSecurityException {
        ECParameterSpec r22 = getCurveSpec(r2);
        ECPoint r42 = new ECPoint(new BigInteger(1, r3), new BigInteger(1, r4));
        EllipticCurvesUtil.checkPointOnCurve(r42, r22.getCurve());
        ECPublicKeySpec r32 = new ECPublicKeySpec(r42, r22);
        return (ECPublicKey) EngineFactory.KEY_FACTORY.getInstance("EC").generatePublic(r32);
    }
}
