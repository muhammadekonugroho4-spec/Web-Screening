package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* loaded from: classes6.dex */
public enum OutputPrefixType extends Enum<OutputPrefixType> implements Internal.EnumLite {
    private static final /* synthetic */ OutputPrefixType[] $VALUES = null;
    public static final OutputPrefixType CRUNCHY = null;
    public static final int CRUNCHY_VALUE = 4;
    public static final OutputPrefixType LEGACY = null;
    public static final int LEGACY_VALUE = 2;
    public static final OutputPrefixType RAW = null;
    public static final int RAW_VALUE = 3;
    public static final OutputPrefixType TINK = null;
    public static final int TINK_VALUE = 1;
    public static final OutputPrefixType UNKNOWN_PREFIX = null;
    public static final int UNKNOWN_PREFIX_VALUE = 0;
    public static final OutputPrefixType UNRECOGNIZED = null;
    private static final Internal.EnumLiteMap<OutputPrefixType> internalValueMap = null;
    private final int value;

    public static final class OutputPrefixTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        static {
            INSTANCE = new OutputPrefixTypeVerifier();
        }

        private OutputPrefixTypeVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (OutputPrefixType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        OutputPrefixType r02 = new OutputPrefixType("UNKNOWN_PREFIX", 0, 0);
        UNKNOWN_PREFIX = r02;
        OutputPrefixType r1 = new OutputPrefixType("TINK", 1, 1);
        TINK = r1;
        OutputPrefixType r2 = new OutputPrefixType("LEGACY", 2, 2);
        LEGACY = r2;
        OutputPrefixType r3 = new OutputPrefixType("RAW", 3, 3);
        RAW = r3;
        OutputPrefixType r4 = new OutputPrefixType("CRUNCHY", 4, 4);
        CRUNCHY = r4;
        OutputPrefixType r5 = new OutputPrefixType("UNRECOGNIZED", 5, -1);
        UNRECOGNIZED = r5;
        $VALUES = new OutputPrefixType[]{r02, r1, r2, r3, r4, r5};
        internalValueMap = new AnonymousClass1();
    }

    OutputPrefixType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static OutputPrefixType forNumber(int r1) {
        if (r1 == 0) goto L22;
        if (r1 == 1) goto L20;
        if (r1 == 2) goto L18;
        if (r1 == 3) goto L16;
        if (r1 == 4) goto L14;
        return null;
    L14:
        return CRUNCHY;
    L16:
        return RAW;
    L18:
        return LEGACY;
    L20:
        return TINK;
    L22:
        return UNKNOWN_PREFIX;
    }

    public static Internal.EnumLiteMap<OutputPrefixType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return OutputPrefixTypeVerifier.INSTANCE;
    }

    public static OutputPrefixType valueOf(String r1) {
        return (OutputPrefixType) Enum.valueOf(OutputPrefixType.class, r1);
    }

    public static OutputPrefixType[] values() {
        return (OutputPrefixType[]) $VALUES.clone();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static OutputPrefixType valueOf(int r02) {
        return forNumber(r02);
    }
}
