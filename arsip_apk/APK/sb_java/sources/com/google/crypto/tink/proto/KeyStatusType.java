package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;

/* loaded from: classes6.dex */
public enum KeyStatusType extends Enum<KeyStatusType> implements Internal.EnumLite {
    private static final /* synthetic */ KeyStatusType[] $VALUES = null;
    public static final KeyStatusType DESTROYED = null;
    public static final int DESTROYED_VALUE = 3;
    public static final KeyStatusType DISABLED = null;
    public static final int DISABLED_VALUE = 2;
    public static final KeyStatusType ENABLED = null;
    public static final int ENABLED_VALUE = 1;
    public static final KeyStatusType UNKNOWN_STATUS = null;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    public static final KeyStatusType UNRECOGNIZED = null;
    private static final Internal.EnumLiteMap<KeyStatusType> internalValueMap = null;
    private final int value;

    public static final class KeyStatusTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = null;

        static {
            INSTANCE = new KeyStatusTypeVerifier();
        }

        private KeyStatusTypeVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (KeyStatusType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        KeyStatusType r02 = new KeyStatusType("UNKNOWN_STATUS", 0, 0);
        UNKNOWN_STATUS = r02;
        KeyStatusType r1 = new KeyStatusType("ENABLED", 1, 1);
        ENABLED = r1;
        KeyStatusType r2 = new KeyStatusType("DISABLED", 2, 2);
        DISABLED = r2;
        KeyStatusType r3 = new KeyStatusType("DESTROYED", 3, 3);
        DESTROYED = r3;
        KeyStatusType r4 = new KeyStatusType("UNRECOGNIZED", 4, -1);
        UNRECOGNIZED = r4;
        $VALUES = new KeyStatusType[]{r02, r1, r2, r3, r4};
        internalValueMap = new AnonymousClass1();
    }

    KeyStatusType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static KeyStatusType forNumber(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return DESTROYED;
    L14:
        return DISABLED;
    L16:
        return ENABLED;
    L18:
        return UNKNOWN_STATUS;
    }

    public static Internal.EnumLiteMap<KeyStatusType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return KeyStatusTypeVerifier.INSTANCE;
    }

    public static KeyStatusType valueOf(String r1) {
        return (KeyStatusType) Enum.valueOf(KeyStatusType.class, r1);
    }

    public static KeyStatusType[] values() {
        return (KeyStatusType[]) $VALUES.clone();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static KeyStatusType valueOf(int r02) {
        return forNumber(r02);
    }
}
