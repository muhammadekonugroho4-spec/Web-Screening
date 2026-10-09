package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* loaded from: classes6.dex */
public enum NullValue extends java.lang.Enum<NullValue> implements Internal.EnumLite {
    private static final /* synthetic */ NullValue[] $VALUES = null;
    public static final NullValue NULL_VALUE = null;
    public static final int NULL_VALUE_VALUE = 0;
    public static final NullValue UNRECOGNIZED = null;
    private static final Internal.EnumLiteMap<NullValue> internalValueMap = null;
    private final int value;

    public static final class NullValueVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        static {
            INSTANCE = new NullValueVerifier();
        }

        private NullValueVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (NullValue.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        NullValue r02 = new NullValue("NULL_VALUE", 0, 0);
        NULL_VALUE = r02;
        NullValue r1 = new NullValue("UNRECOGNIZED", 1, -1);
        UNRECOGNIZED = r1;
        $VALUES = new NullValue[]{r02, r1};
        internalValueMap = new AnonymousClass1();
    }

    NullValue(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static NullValue forNumber(int r02) {
        if (r02 == 0) goto L6;
        return null;
    L6:
        return NULL_VALUE;
    }

    public static Internal.EnumLiteMap<NullValue> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return NullValueVerifier.INSTANCE;
    }

    public static NullValue valueOf(String r1) {
        return (NullValue) java.lang.Enum.valueOf(NullValue.class, r1);
    }

    public static NullValue[] values() {
        return (NullValue[]) $VALUES.clone();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static NullValue valueOf(int r02) {
        return forNumber(r02);
    }
}
