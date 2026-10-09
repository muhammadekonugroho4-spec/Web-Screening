package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* loaded from: classes6.dex */
public enum JwtRsaSsaPssAlgorithm extends Enum<JwtRsaSsaPssAlgorithm> implements Internal.EnumLite {
    private static final /* synthetic */ JwtRsaSsaPssAlgorithm[] $VALUES = null;
    public static final JwtRsaSsaPssAlgorithm PS256 = null;
    public static final int PS256_VALUE = 1;
    public static final JwtRsaSsaPssAlgorithm PS384 = null;
    public static final int PS384_VALUE = 2;
    public static final JwtRsaSsaPssAlgorithm PS512 = null;
    public static final int PS512_VALUE = 3;
    public static final JwtRsaSsaPssAlgorithm PS_UNKNOWN = null;
    public static final int PS_UNKNOWN_VALUE = 0;
    public static final JwtRsaSsaPssAlgorithm UNRECOGNIZED = null;
    private static final Internal.EnumLiteMap<JwtRsaSsaPssAlgorithm> internalValueMap = null;
    private final int value;

    public static final class JwtRsaSsaPssAlgorithmVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        static {
            INSTANCE = new JwtRsaSsaPssAlgorithmVerifier();
        }

        private JwtRsaSsaPssAlgorithmVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (JwtRsaSsaPssAlgorithm.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        JwtRsaSsaPssAlgorithm r02 = new JwtRsaSsaPssAlgorithm("PS_UNKNOWN", 0, 0);
        PS_UNKNOWN = r02;
        JwtRsaSsaPssAlgorithm r1 = new JwtRsaSsaPssAlgorithm("PS256", 1, 1);
        PS256 = r1;
        JwtRsaSsaPssAlgorithm r2 = new JwtRsaSsaPssAlgorithm("PS384", 2, 2);
        PS384 = r2;
        JwtRsaSsaPssAlgorithm r3 = new JwtRsaSsaPssAlgorithm("PS512", 3, 3);
        PS512 = r3;
        JwtRsaSsaPssAlgorithm r4 = new JwtRsaSsaPssAlgorithm("UNRECOGNIZED", 4, -1);
        UNRECOGNIZED = r4;
        $VALUES = new JwtRsaSsaPssAlgorithm[]{r02, r1, r2, r3, r4};
        internalValueMap = new AnonymousClass1();
    }

    JwtRsaSsaPssAlgorithm(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static JwtRsaSsaPssAlgorithm forNumber(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return PS512;
    L14:
        return PS384;
    L16:
        return PS256;
    L18:
        return PS_UNKNOWN;
    }

    public static Internal.EnumLiteMap<JwtRsaSsaPssAlgorithm> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return JwtRsaSsaPssAlgorithmVerifier.INSTANCE;
    }

    public static JwtRsaSsaPssAlgorithm valueOf(String r1) {
        return (JwtRsaSsaPssAlgorithm) Enum.valueOf(JwtRsaSsaPssAlgorithm.class, r1);
    }

    public static JwtRsaSsaPssAlgorithm[] values() {
        return (JwtRsaSsaPssAlgorithm[]) $VALUES.clone();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static JwtRsaSsaPssAlgorithm valueOf(int r02) {
        return forNumber(r02);
    }
}
