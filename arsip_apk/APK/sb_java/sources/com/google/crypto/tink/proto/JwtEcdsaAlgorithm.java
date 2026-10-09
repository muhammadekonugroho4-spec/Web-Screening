package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* loaded from: classes6.dex */
public enum JwtEcdsaAlgorithm extends Enum<JwtEcdsaAlgorithm> implements Internal.EnumLite {
    private static final /* synthetic */ JwtEcdsaAlgorithm[] $VALUES = null;
    public static final JwtEcdsaAlgorithm ES256 = null;
    public static final int ES256_VALUE = 1;
    public static final JwtEcdsaAlgorithm ES384 = null;
    public static final int ES384_VALUE = 2;
    public static final JwtEcdsaAlgorithm ES512 = null;
    public static final int ES512_VALUE = 3;
    public static final JwtEcdsaAlgorithm ES_UNKNOWN = null;
    public static final int ES_UNKNOWN_VALUE = 0;
    public static final JwtEcdsaAlgorithm UNRECOGNIZED = null;
    private static final Internal.EnumLiteMap<JwtEcdsaAlgorithm> internalValueMap = null;
    private final int value;

    public static final class JwtEcdsaAlgorithmVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        static {
            INSTANCE = new JwtEcdsaAlgorithmVerifier();
        }

        private JwtEcdsaAlgorithmVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (JwtEcdsaAlgorithm.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        JwtEcdsaAlgorithm r02 = new JwtEcdsaAlgorithm("ES_UNKNOWN", 0, 0);
        ES_UNKNOWN = r02;
        JwtEcdsaAlgorithm r1 = new JwtEcdsaAlgorithm("ES256", 1, 1);
        ES256 = r1;
        JwtEcdsaAlgorithm r2 = new JwtEcdsaAlgorithm("ES384", 2, 2);
        ES384 = r2;
        JwtEcdsaAlgorithm r3 = new JwtEcdsaAlgorithm("ES512", 3, 3);
        ES512 = r3;
        JwtEcdsaAlgorithm r4 = new JwtEcdsaAlgorithm("UNRECOGNIZED", 4, -1);
        UNRECOGNIZED = r4;
        $VALUES = new JwtEcdsaAlgorithm[]{r02, r1, r2, r3, r4};
        internalValueMap = new AnonymousClass1();
    }

    JwtEcdsaAlgorithm(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static JwtEcdsaAlgorithm forNumber(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return ES512;
    L14:
        return ES384;
    L16:
        return ES256;
    L18:
        return ES_UNKNOWN;
    }

    public static Internal.EnumLiteMap<JwtEcdsaAlgorithm> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return JwtEcdsaAlgorithmVerifier.INSTANCE;
    }

    public static JwtEcdsaAlgorithm valueOf(String r1) {
        return (JwtEcdsaAlgorithm) Enum.valueOf(JwtEcdsaAlgorithm.class, r1);
    }

    public static JwtEcdsaAlgorithm[] values() {
        return (JwtEcdsaAlgorithm[]) $VALUES.clone();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static JwtEcdsaAlgorithm valueOf(int r02) {
        return forNumber(r02);
    }
}
