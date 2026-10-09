package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* loaded from: classes6.dex */
public enum HashType extends Enum<HashType> implements Internal.EnumLite {
    private static final /* synthetic */ HashType[] $VALUES = null;
    public static final HashType SHA1 = null;
    public static final int SHA1_VALUE = 1;
    public static final HashType SHA224 = null;
    public static final int SHA224_VALUE = 5;
    public static final HashType SHA256 = null;
    public static final int SHA256_VALUE = 3;
    public static final HashType SHA384 = null;
    public static final int SHA384_VALUE = 2;
    public static final HashType SHA512 = null;
    public static final int SHA512_VALUE = 4;
    public static final HashType UNKNOWN_HASH = null;
    public static final int UNKNOWN_HASH_VALUE = 0;
    public static final HashType UNRECOGNIZED = null;
    private static final Internal.EnumLiteMap<HashType> internalValueMap = null;
    private final int value;

    public static final class HashTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        static {
            INSTANCE = new HashTypeVerifier();
        }

        private HashTypeVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (HashType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        HashType r02 = new HashType("UNKNOWN_HASH", 0, 0);
        UNKNOWN_HASH = r02;
        HashType r1 = new HashType("SHA1", 1, 1);
        SHA1 = r1;
        HashType r2 = new HashType("SHA384", 2, 2);
        SHA384 = r2;
        HashType r3 = new HashType("SHA256", 3, 3);
        SHA256 = r3;
        HashType r4 = new HashType("SHA512", 4, 4);
        SHA512 = r4;
        HashType r5 = new HashType("SHA224", 5, 5);
        SHA224 = r5;
        HashType r6 = new HashType("UNRECOGNIZED", 6, -1);
        UNRECOGNIZED = r6;
        $VALUES = new HashType[]{r02, r1, r2, r3, r4, r5, r6};
        internalValueMap = new AnonymousClass1();
    }

    HashType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static HashType forNumber(int r1) {
        if (r1 == 0) goto L26;
        if (r1 == 1) goto L24;
        if (r1 == 2) goto L22;
        if (r1 == 3) goto L20;
        if (r1 == 4) goto L18;
        if (r1 == 5) goto L16;
        return null;
    L16:
        return SHA224;
    L18:
        return SHA512;
    L20:
        return SHA256;
    L22:
        return SHA384;
    L24:
        return SHA1;
    L26:
        return UNKNOWN_HASH;
    }

    public static Internal.EnumLiteMap<HashType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return HashTypeVerifier.INSTANCE;
    }

    public static HashType valueOf(String r1) {
        return (HashType) Enum.valueOf(HashType.class, r1);
    }

    public static HashType[] values() {
        return (HashType[]) $VALUES.clone();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static HashType valueOf(int r02) {
        return forNumber(r02);
    }
}
