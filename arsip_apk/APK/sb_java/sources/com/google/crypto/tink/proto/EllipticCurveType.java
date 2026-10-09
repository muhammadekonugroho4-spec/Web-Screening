package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* loaded from: classes6.dex */
public enum EllipticCurveType extends Enum<EllipticCurveType> implements Internal.EnumLite {
    private static final /* synthetic */ EllipticCurveType[] $VALUES = null;
    public static final EllipticCurveType CURVE25519 = null;
    public static final int CURVE25519_VALUE = 5;
    public static final EllipticCurveType NIST_P256 = null;
    public static final int NIST_P256_VALUE = 2;
    public static final EllipticCurveType NIST_P384 = null;
    public static final int NIST_P384_VALUE = 3;
    public static final EllipticCurveType NIST_P521 = null;
    public static final int NIST_P521_VALUE = 4;
    public static final EllipticCurveType UNKNOWN_CURVE = null;
    public static final int UNKNOWN_CURVE_VALUE = 0;
    public static final EllipticCurveType UNRECOGNIZED = null;
    private static final Internal.EnumLiteMap<EllipticCurveType> internalValueMap = null;
    private final int value;

    public static final class EllipticCurveTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        static {
            INSTANCE = new EllipticCurveTypeVerifier();
        }

        private EllipticCurveTypeVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (EllipticCurveType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        EllipticCurveType r02 = new EllipticCurveType("UNKNOWN_CURVE", 0, 0);
        UNKNOWN_CURVE = r02;
        EllipticCurveType r1 = new EllipticCurveType("NIST_P256", 1, 2);
        NIST_P256 = r1;
        EllipticCurveType r2 = new EllipticCurveType("NIST_P384", 2, 3);
        NIST_P384 = r2;
        EllipticCurveType r3 = new EllipticCurveType("NIST_P521", 3, 4);
        NIST_P521 = r3;
        EllipticCurveType r4 = new EllipticCurveType("CURVE25519", 4, 5);
        CURVE25519 = r4;
        EllipticCurveType r5 = new EllipticCurveType("UNRECOGNIZED", 5, -1);
        UNRECOGNIZED = r5;
        $VALUES = new EllipticCurveType[]{r02, r1, r2, r3, r4, r5};
        internalValueMap = new AnonymousClass1();
    }

    EllipticCurveType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static EllipticCurveType forNumber(int r1) {
        if (r1 == 0) goto L22;
        if (r1 == 2) goto L20;
        if (r1 == 3) goto L18;
        if (r1 == 4) goto L16;
        if (r1 == 5) goto L14;
        return null;
    L14:
        return CURVE25519;
    L16:
        return NIST_P521;
    L18:
        return NIST_P384;
    L20:
        return NIST_P256;
    L22:
        return UNKNOWN_CURVE;
    }

    public static Internal.EnumLiteMap<EllipticCurveType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return EllipticCurveTypeVerifier.INSTANCE;
    }

    public static EllipticCurveType valueOf(String r1) {
        return (EllipticCurveType) Enum.valueOf(EllipticCurveType.class, r1);
    }

    public static EllipticCurveType[] values() {
        return (EllipticCurveType[]) $VALUES.clone();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EllipticCurveType valueOf(int r02) {
        return forNumber(r02);
    }
}
