package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* loaded from: classes6.dex */
public enum EcdsaSignatureEncoding extends Enum<EcdsaSignatureEncoding> implements Internal.EnumLite {
    private static final /* synthetic */ EcdsaSignatureEncoding[] $VALUES = null;
    public static final EcdsaSignatureEncoding DER = null;
    public static final int DER_VALUE = 2;
    public static final EcdsaSignatureEncoding IEEE_P1363 = null;
    public static final int IEEE_P1363_VALUE = 1;
    public static final EcdsaSignatureEncoding UNKNOWN_ENCODING = null;
    public static final int UNKNOWN_ENCODING_VALUE = 0;
    public static final EcdsaSignatureEncoding UNRECOGNIZED = null;
    private static final Internal.EnumLiteMap<EcdsaSignatureEncoding> internalValueMap = null;
    private final int value;

    public static final class EcdsaSignatureEncodingVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        static {
            INSTANCE = new EcdsaSignatureEncodingVerifier();
        }

        private EcdsaSignatureEncodingVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (EcdsaSignatureEncoding.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        EcdsaSignatureEncoding r02 = new EcdsaSignatureEncoding("UNKNOWN_ENCODING", 0, 0);
        UNKNOWN_ENCODING = r02;
        EcdsaSignatureEncoding r1 = new EcdsaSignatureEncoding("IEEE_P1363", 1, 1);
        IEEE_P1363 = r1;
        EcdsaSignatureEncoding r2 = new EcdsaSignatureEncoding("DER", 2, 2);
        DER = r2;
        EcdsaSignatureEncoding r3 = new EcdsaSignatureEncoding("UNRECOGNIZED", 3, -1);
        UNRECOGNIZED = r3;
        $VALUES = new EcdsaSignatureEncoding[]{r02, r1, r2, r3};
        internalValueMap = new AnonymousClass1();
    }

    EcdsaSignatureEncoding(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static EcdsaSignatureEncoding forNumber(int r1) {
        if (r1 == 0) goto L14;
        if (r1 == 1) goto L12;
        if (r1 == 2) goto L10;
        return null;
    L10:
        return DER;
    L12:
        return IEEE_P1363;
    L14:
        return UNKNOWN_ENCODING;
    }

    public static Internal.EnumLiteMap<EcdsaSignatureEncoding> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return EcdsaSignatureEncodingVerifier.INSTANCE;
    }

    public static EcdsaSignatureEncoding valueOf(String r1) {
        return (EcdsaSignatureEncoding) Enum.valueOf(EcdsaSignatureEncoding.class, r1);
    }

    public static EcdsaSignatureEncoding[] values() {
        return (EcdsaSignatureEncoding[]) $VALUES.clone();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EcdsaSignatureEncoding valueOf(int r02) {
        return forNumber(r02);
    }
}
