package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* loaded from: classes6.dex */
public enum HpkeAead extends Enum<HpkeAead> implements Internal.EnumLite {
    private static final /* synthetic */ HpkeAead[] $VALUES = null;
    public static final HpkeAead AEAD_UNKNOWN = null;
    public static final int AEAD_UNKNOWN_VALUE = 0;
    public static final HpkeAead AES_128_GCM = null;
    public static final int AES_128_GCM_VALUE = 1;
    public static final HpkeAead AES_256_GCM = null;
    public static final int AES_256_GCM_VALUE = 2;
    public static final HpkeAead CHACHA20_POLY1305 = null;
    public static final int CHACHA20_POLY1305_VALUE = 3;
    public static final HpkeAead UNRECOGNIZED = null;
    private static final Internal.EnumLiteMap<HpkeAead> internalValueMap = null;
    private final int value;

    public static final class HpkeAeadVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        static {
            INSTANCE = new HpkeAeadVerifier();
        }

        private HpkeAeadVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (HpkeAead.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        HpkeAead r02 = new HpkeAead("AEAD_UNKNOWN", 0, 0);
        AEAD_UNKNOWN = r02;
        HpkeAead r1 = new HpkeAead("AES_128_GCM", 1, 1);
        AES_128_GCM = r1;
        HpkeAead r2 = new HpkeAead("AES_256_GCM", 2, 2);
        AES_256_GCM = r2;
        HpkeAead r3 = new HpkeAead("CHACHA20_POLY1305", 3, 3);
        CHACHA20_POLY1305 = r3;
        HpkeAead r4 = new HpkeAead("UNRECOGNIZED", 4, -1);
        UNRECOGNIZED = r4;
        $VALUES = new HpkeAead[]{r02, r1, r2, r3, r4};
        internalValueMap = new AnonymousClass1();
    }

    HpkeAead(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static HpkeAead forNumber(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return CHACHA20_POLY1305;
    L14:
        return AES_256_GCM;
    L16:
        return AES_128_GCM;
    L18:
        return AEAD_UNKNOWN;
    }

    public static Internal.EnumLiteMap<HpkeAead> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return HpkeAeadVerifier.INSTANCE;
    }

    public static HpkeAead valueOf(String r1) {
        return (HpkeAead) Enum.valueOf(HpkeAead.class, r1);
    }

    public static HpkeAead[] values() {
        return (HpkeAead[]) $VALUES.clone();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static HpkeAead valueOf(int r02) {
        return forNumber(r02);
    }
}
