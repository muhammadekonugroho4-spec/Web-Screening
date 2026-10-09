package com.google.crypto.tink.internal;

import com.gojek.ojosdk.exif.ExifInterface;
import com.google.crypto.tink.subtle.Random;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* loaded from: classes6.dex */
public final class EllipticCurvesUtil {
    private static final BigInteger EIGHT = null;
    private static final BigInteger FOUR = null;
    public static final ECParameterSpec NIST_P256_PARAMS = null;
    public static final ECParameterSpec NIST_P384_PARAMS = null;
    public static final ECParameterSpec NIST_P521_PARAMS = null;
    private static final BigInteger THREE = null;
    private static final BigInteger TWO = null;

    public static class JacobianEcPoint {
        static final JacobianEcPoint INFINITY = null;

        /* renamed from: x, reason: collision with root package name */
        BigInteger f38445x;

        /* renamed from: y, reason: collision with root package name */
        BigInteger f38446y;

        /* renamed from: z, reason: collision with root package name */
        BigInteger f38447z;

        static {
            BigInteger r1 = BigInteger.ONE;
            INFINITY = new JacobianEcPoint(r1, r1, BigInteger.ZERO);
        }

        public JacobianEcPoint(BigInteger r1, BigInteger r2, BigInteger r3) {
            this.f38445x = r1;
            this.f38446y = r2;
            this.f38447z = r3;
        }

        public boolean isInfinity() {
            return this.f38447z.equals(BigInteger.ZERO);
        }

        public ECPoint toECPoint(BigInteger r6) {
            if (isInfinity() == true) goto L5;
            BigInteger r02 = this.f38447z.modInverse(r6);
            BigInteger r1 = r02.multiply(r02).mod(r6);
            return new ECPoint(this.f38445x.multiply(r1).mod(r6), this.f38446y.multiply(r1).mod(r6).multiply(r02).mod(r6));
        L5:
            return ECPoint.POINT_INFINITY;
        }
    }

    static {
        NIST_P256_PARAMS = getNistP256Params();
        NIST_P384_PARAMS = getNistP384Params();
        NIST_P521_PARAMS = getNistP521Params();
        TWO = BigInteger.valueOf(2);
        THREE = BigInteger.valueOf(3);
        FOUR = BigInteger.valueOf(4);
        EIGHT = BigInteger.valueOf(8);
    }

    private EllipticCurvesUtil() {
    }

    public static JacobianEcPoint addJacobianPoints(JacobianEcPoint r9, JacobianEcPoint r10, BigInteger r11, BigInteger r12) {
        if (r9.isInfinity() == false) goto L6;
        return r10;
    L6:
        if (r10.isInfinity() == false) goto L8;
        return r9;
    L8:
        BigInteger r02 = r9.f38447z;
        BigInteger r03 = r02.multiply(r02).mod(r12);
        BigInteger r1 = r10.f38447z;
        BigInteger r13 = r1.multiply(r1).mod(r12);
        BigInteger r2 = r9.f38445x.multiply(r13).mod(r12);
        BigInteger r3 = r10.f38445x.multiply(r03).mod(r12);
        BigInteger r4 = r9.f38446y.multiply(r10.f38447z).mod(r12).multiply(r13).mod(r12);
        BigInteger r5 = r10.f38446y.multiply(r9.f38447z).mod(r12).multiply(r03).mod(r12);
        if (r2.equals(r3) == true) goto L11;
        BigInteger r112 = r3.subtract(r2).mod(r12);
        BigInteger r32 = r112.multiply(FOUR).multiply(r112).mod(r12);
        BigInteger r6 = r112.multiply(r32).mod(r12);
        BigInteger r52 = r5.subtract(r4);
        BigInteger r7 = TWO;
        BigInteger r53 = r52.multiply(r7).mod(r12);
        BigInteger r22 = r2.multiply(r32).mod(r12);
        BigInteger r33 = r53.multiply(r53).mod(r12).subtract(r6).subtract(r22.multiply(r7)).mod(r12);
        BigInteger r23 = r53.multiply(r22.subtract(r33)).subtract(r4.multiply(r7).multiply(r6)).mod(r12);
        BigInteger r92 = r9.f38447z.add(r10.f38447z);
        return new JacobianEcPoint(r33, r23, r92.multiply(r92).mod(r12).subtract(r03).subtract(r13).multiply(r112).mod(r12));
    L11:
        if (r4.equals(r5) == true) goto L15;
        return JacobianEcPoint.INFINITY;
    L15:
        return doubleJacobianPoint(r9, r11, r12);
    }

    public static void checkPointOnCurve(ECPoint r4, EllipticCurve r5) throws GeneralSecurityException {
        BigInteger r02 = getModulus(r5);
        BigInteger r1 = r4.getAffineX();
        BigInteger r42 = r4.getAffineY();
        if (r1 == null) goto L23;
        if (r42 == null) goto L23;
        if (r1.signum() == (-1)) goto L21;
        if (r1.compareTo(r02) >= 0) goto L21;
        if (r42.signum() == (-1)) goto L19;
        if (r42.compareTo(r02) >= 0) goto L19;
        if (r42.multiply(r42).mod(r02).equals(r1.multiply(r1).add(r5.getA()).multiply(r1).add(r5.getB()).mod(r02)) == false) goto L17;
        return;
    L17:
        throw new GeneralSecurityException("Point is not on curve");
    L19:
        throw new GeneralSecurityException("y is out of range");
    L21:
        throw new GeneralSecurityException("x is out of range");
    L23:
        throw new GeneralSecurityException("point is at infinity");
    }

    public static JacobianEcPoint doubleJacobianPoint(JacobianEcPoint r7, BigInteger r8, BigInteger r9) {
        if (r7.f38446y.equals(BigInteger.ZERO) == true) goto L5;
        BigInteger r02 = r7.f38445x;
        BigInteger r03 = r02.multiply(r02).mod(r9);
        BigInteger r1 = r7.f38446y;
        BigInteger r12 = r1.multiply(r1).mod(r9);
        BigInteger r2 = r12.multiply(r12).mod(r9);
        BigInteger r3 = r7.f38447z;
        BigInteger r32 = r3.multiply(r3).mod(r9);
        BigInteger r4 = r7.f38445x.add(r12);
        BigInteger r42 = r4.multiply(r4).mod(r9).subtract(r03).subtract(r2);
        BigInteger r5 = TWO;
        BigInteger r43 = r42.multiply(r5);
        BigInteger r82 = r03.multiply(THREE).add(r8.multiply(r32).multiply(r32).mod(r9));
        BigInteger r04 = r82.multiply(r82).mod(r9).subtract(r43.multiply(r5)).mod(r9);
        BigInteger r83 = r82.multiply(r43.subtract(r04)).mod(r9).subtract(r2.multiply(EIGHT)).mod(r9);
        BigInteger r72 = r7.f38446y.add(r7.f38447z);
        return new JacobianEcPoint(r04, r83, r72.multiply(r72).mod(r9).subtract(r12).subtract(r32).mod(r9));
    L5:
        return JacobianEcPoint.INFINITY;
    }

    public static BigInteger getModulus(EllipticCurve r1) throws GeneralSecurityException {
        ECField r12 = r1.getField();
        if ((r12 instanceof ECFieldFp) == false) goto L7;
        return ((ECFieldFp) r12).getP();
    L7:
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    private static ECParameterSpec getNistCurveSpec(String r3, String r4, String r5, String r6, String r7) {
        BigInteger r02 = new BigInteger(r3);
        BigInteger r32 = new BigInteger(r4);
        BigInteger r42 = r02.subtract(new BigInteger(ExifInterface.GpsMeasureMode.MODE_3_DIMENSIONAL));
        BigInteger r1 = new BigInteger(r5, 16);
        BigInteger r52 = new BigInteger(r6, 16);
        BigInteger r62 = new BigInteger(r7, 16);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(r02), r42, r1), new ECPoint(r52, r62), r32, 1);
    }

    private static ECParameterSpec getNistP256Params() {
        return getNistCurveSpec("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
    }

    private static ECParameterSpec getNistP384Params() {
        return getNistCurveSpec("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
    }

    private static ECParameterSpec getNistP521Params() {
        return getNistCurveSpec("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
    }

    public static boolean isNistEcParameterSpec(ECParameterSpec r1) {
        if (isSameEcParameterSpec(r1, NIST_P256_PARAMS) == false) goto L5;
        return true;
    L5:
        if (isSameEcParameterSpec(r1, NIST_P384_PARAMS) == false) goto L7;
        return true;
    L7:
        if (isSameEcParameterSpec(r1, NIST_P521_PARAMS) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public static boolean isSameEcParameterSpec(ECParameterSpec r2, ECParameterSpec r3) {
        if (r2.getCurve().equals(r3.getCurve()) == true) goto L5;
        return false;
    L5:
        if (r2.getGenerator().equals(r3.getGenerator()) == true) goto L7;
        return false;
    L7:
        if (r2.getOrder().equals(r3.getOrder()) == true) goto L9;
        return false;
    L9:
        if (r2.getCofactor() != r3.getCofactor()) goto L16;
        return true;
    L16:
        return false;
    }

    public static ECPoint multiplyByGenerator(BigInteger r6, ECParameterSpec r7) throws GeneralSecurityException {
        if (isNistEcParameterSpec(r7) == false) goto L22;
        if (r6.signum() != 1) goto L20;
        if (r6.compareTo(r7.getOrder()) >= 0) goto L18;
        EllipticCurve r02 = r7.getCurve();
        ECPoint r1 = r7.getGenerator();
        checkPointOnCurve(r1, r02);
        BigInteger r72 = r7.getCurve().getA();
        BigInteger r2 = getModulus(r02);
        JacobianEcPoint r3 = toJacobianEcPoint(ECPoint.POINT_INFINITY, r2);
        JacobianEcPoint r12 = toJacobianEcPoint(r1, r2);
        int r4 = r6.bitLength();
    L9:
        if (r4 < 0) goto L15;
        if (r6.testBit(r4) == false) goto L13;
        r3 = addJacobianPoints(r3, r12, r72, r2);
        r12 = doubleJacobianPoint(r12, r72, r2);
    L14:
        r4 = r4 - 1;
        goto L9
    L13:
        r12 = addJacobianPoints(r3, r12, r72, r2);
        r3 = doubleJacobianPoint(r3, r72, r2);
        goto L14
    L15:
        ECPoint r62 = r3.toECPoint(r2);
        checkPointOnCurve(r62, r02);
        return r62;
    L18:
        throw new GeneralSecurityException("k must be smaller than the order of the generator");
    L20:
        throw new GeneralSecurityException("k must be positive");
    L22:
        throw new GeneralSecurityException("spec must be NIST P256, P384 or P521");
    }

    public static JacobianEcPoint toJacobianEcPoint(ECPoint r5, BigInteger r6) {
        if (r5.equals(ECPoint.POINT_INFINITY) == true) goto L5;
        BigInteger r02 = new BigInteger(1, Random.randBytes((r6.bitLength() + 8) / 8)).mod(r6);
        BigInteger r1 = r02.multiply(r02).mod(r6);
        BigInteger r2 = r1.multiply(r02).mod(r6);
        return new JacobianEcPoint(r5.getAffineX().multiply(r1).mod(r6), r5.getAffineY().multiply(r2).mod(r6), r02);
    L5:
        return JacobianEcPoint.INFINITY;
    }
}
