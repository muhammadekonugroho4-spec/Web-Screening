package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* loaded from: classes6.dex */
public enum EcPointFormat extends Enum<EcPointFormat> implements Internal.EnumLite {
    private static final /* synthetic */ EcPointFormat[] $VALUES = null;
    public static final EcPointFormat COMPRESSED = null;
    public static final int COMPRESSED_VALUE = 2;
    public static final EcPointFormat DO_NOT_USE_CRUNCHY_UNCOMPRESSED = null;
    public static final int DO_NOT_USE_CRUNCHY_UNCOMPRESSED_VALUE = 3;
    public static final EcPointFormat UNCOMPRESSED = null;
    public static final int UNCOMPRESSED_VALUE = 1;
    public static final EcPointFormat UNKNOWN_FORMAT = null;
    public static final int UNKNOWN_FORMAT_VALUE = 0;
    public static final EcPointFormat UNRECOGNIZED = null;
    private static final Internal.EnumLiteMap<EcPointFormat> internalValueMap = null;
    private final int value;

    public static final class EcPointFormatVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        static {
            INSTANCE = new EcPointFormatVerifier();
        }

        private EcPointFormatVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (EcPointFormat.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        EcPointFormat r02 = new EcPointFormat("UNKNOWN_FORMAT", 0, 0);
        UNKNOWN_FORMAT = r02;
        EcPointFormat r1 = new EcPointFormat("UNCOMPRESSED", 1, 1);
        UNCOMPRESSED = r1;
        EcPointFormat r2 = new EcPointFormat("COMPRESSED", 2, 2);
        COMPRESSED = r2;
        EcPointFormat r3 = new EcPointFormat("DO_NOT_USE_CRUNCHY_UNCOMPRESSED", 3, 3);
        DO_NOT_USE_CRUNCHY_UNCOMPRESSED = r3;
        EcPointFormat r4 = new EcPointFormat("UNRECOGNIZED", 4, -1);
        UNRECOGNIZED = r4;
        $VALUES = new EcPointFormat[]{r02, r1, r2, r3, r4};
        internalValueMap = new AnonymousClass1();
    }

    EcPointFormat(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static EcPointFormat forNumber(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
    L14:
        return COMPRESSED;
    L16:
        return UNCOMPRESSED;
    L18:
        return UNKNOWN_FORMAT;
    }

    public static Internal.EnumLiteMap<EcPointFormat> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return EcPointFormatVerifier.INSTANCE;
    }

    public static EcPointFormat valueOf(String r1) {
        return (EcPointFormat) Enum.valueOf(EcPointFormat.class, r1);
    }

    public static EcPointFormat[] values() {
        return (EcPointFormat[]) $VALUES.clone();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EcPointFormat valueOf(int r02) {
        return forNumber(r02);
    }
}
