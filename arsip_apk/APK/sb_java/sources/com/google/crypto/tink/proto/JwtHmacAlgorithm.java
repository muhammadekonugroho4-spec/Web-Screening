package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* loaded from: classes6.dex */
public enum JwtHmacAlgorithm extends Enum<JwtHmacAlgorithm> implements Internal.EnumLite {
    private static final /* synthetic */ JwtHmacAlgorithm[] $VALUES = null;
    public static final JwtHmacAlgorithm HS256 = null;
    public static final int HS256_VALUE = 1;
    public static final JwtHmacAlgorithm HS384 = null;
    public static final int HS384_VALUE = 2;
    public static final JwtHmacAlgorithm HS512 = null;
    public static final int HS512_VALUE = 3;
    public static final JwtHmacAlgorithm HS_UNKNOWN = null;
    public static final int HS_UNKNOWN_VALUE = 0;
    public static final JwtHmacAlgorithm UNRECOGNIZED = null;
    private static final Internal.EnumLiteMap<JwtHmacAlgorithm> internalValueMap = null;
    private final int value;

    public static final class JwtHmacAlgorithmVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        static {
            INSTANCE = new JwtHmacAlgorithmVerifier();
        }

        private JwtHmacAlgorithmVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (JwtHmacAlgorithm.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        JwtHmacAlgorithm r02 = new JwtHmacAlgorithm("HS_UNKNOWN", 0, 0);
        HS_UNKNOWN = r02;
        JwtHmacAlgorithm r1 = new JwtHmacAlgorithm("HS256", 1, 1);
        HS256 = r1;
        JwtHmacAlgorithm r2 = new JwtHmacAlgorithm("HS384", 2, 2);
        HS384 = r2;
        JwtHmacAlgorithm r3 = new JwtHmacAlgorithm("HS512", 3, 3);
        HS512 = r3;
        JwtHmacAlgorithm r4 = new JwtHmacAlgorithm("UNRECOGNIZED", 4, -1);
        UNRECOGNIZED = r4;
        $VALUES = new JwtHmacAlgorithm[]{r02, r1, r2, r3, r4};
        internalValueMap = new AnonymousClass1();
    }

    JwtHmacAlgorithm(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static JwtHmacAlgorithm forNumber(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return HS512;
    L14:
        return HS384;
    L16:
        return HS256;
    L18:
        return HS_UNKNOWN;
    }

    public static Internal.EnumLiteMap<JwtHmacAlgorithm> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return JwtHmacAlgorithmVerifier.INSTANCE;
    }

    public static JwtHmacAlgorithm valueOf(String r1) {
        return (JwtHmacAlgorithm) Enum.valueOf(JwtHmacAlgorithm.class, r1);
    }

    public static JwtHmacAlgorithm[] values() {
        return (JwtHmacAlgorithm[]) $VALUES.clone();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static JwtHmacAlgorithm valueOf(int r02) {
        return forNumber(r02);
    }
}
