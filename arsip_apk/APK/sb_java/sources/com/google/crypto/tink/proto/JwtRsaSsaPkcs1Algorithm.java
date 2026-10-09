package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* loaded from: classes6.dex */
public enum JwtRsaSsaPkcs1Algorithm extends Enum<JwtRsaSsaPkcs1Algorithm> implements Internal.EnumLite {
    private static final /* synthetic */ JwtRsaSsaPkcs1Algorithm[] $VALUES = null;
    public static final JwtRsaSsaPkcs1Algorithm RS256 = null;
    public static final int RS256_VALUE = 1;
    public static final JwtRsaSsaPkcs1Algorithm RS384 = null;
    public static final int RS384_VALUE = 2;
    public static final JwtRsaSsaPkcs1Algorithm RS512 = null;
    public static final int RS512_VALUE = 3;
    public static final JwtRsaSsaPkcs1Algorithm RS_UNKNOWN = null;
    public static final int RS_UNKNOWN_VALUE = 0;
    public static final JwtRsaSsaPkcs1Algorithm UNRECOGNIZED = null;
    private static final Internal.EnumLiteMap<JwtRsaSsaPkcs1Algorithm> internalValueMap = null;
    private final int value;

    public static final class JwtRsaSsaPkcs1AlgorithmVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        static {
            INSTANCE = new JwtRsaSsaPkcs1AlgorithmVerifier();
        }

        private JwtRsaSsaPkcs1AlgorithmVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (JwtRsaSsaPkcs1Algorithm.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        JwtRsaSsaPkcs1Algorithm r02 = new JwtRsaSsaPkcs1Algorithm("RS_UNKNOWN", 0, 0);
        RS_UNKNOWN = r02;
        JwtRsaSsaPkcs1Algorithm r1 = new JwtRsaSsaPkcs1Algorithm("RS256", 1, 1);
        RS256 = r1;
        JwtRsaSsaPkcs1Algorithm r2 = new JwtRsaSsaPkcs1Algorithm("RS384", 2, 2);
        RS384 = r2;
        JwtRsaSsaPkcs1Algorithm r3 = new JwtRsaSsaPkcs1Algorithm("RS512", 3, 3);
        RS512 = r3;
        JwtRsaSsaPkcs1Algorithm r4 = new JwtRsaSsaPkcs1Algorithm("UNRECOGNIZED", 4, -1);
        UNRECOGNIZED = r4;
        $VALUES = new JwtRsaSsaPkcs1Algorithm[]{r02, r1, r2, r3, r4};
        internalValueMap = new AnonymousClass1();
    }

    JwtRsaSsaPkcs1Algorithm(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static JwtRsaSsaPkcs1Algorithm forNumber(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return RS512;
    L14:
        return RS384;
    L16:
        return RS256;
    L18:
        return RS_UNKNOWN;
    }

    public static Internal.EnumLiteMap<JwtRsaSsaPkcs1Algorithm> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return JwtRsaSsaPkcs1AlgorithmVerifier.INSTANCE;
    }

    public static JwtRsaSsaPkcs1Algorithm valueOf(String r1) {
        return (JwtRsaSsaPkcs1Algorithm) Enum.valueOf(JwtRsaSsaPkcs1Algorithm.class, r1);
    }

    public static JwtRsaSsaPkcs1Algorithm[] values() {
        return (JwtRsaSsaPkcs1Algorithm[]) $VALUES.clone();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static JwtRsaSsaPkcs1Algorithm valueOf(int r02) {
        return forNumber(r02);
    }
}
