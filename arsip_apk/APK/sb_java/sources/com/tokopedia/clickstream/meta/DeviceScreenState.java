package com.tokopedia.clickstream.meta;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum DeviceScreenState extends Enum<DeviceScreenState> implements Internal.EnumLite {
    public static final DeviceScreenState DEVICE_SCREEN_STATE_LOCKED = null;
    public static final int DEVICE_SCREEN_STATE_LOCKED_VALUE = 2;
    public static final DeviceScreenState DEVICE_SCREEN_STATE_UNLOCKED = null;
    public static final int DEVICE_SCREEN_STATE_UNLOCKED_VALUE = 1;
    public static final DeviceScreenState DEVICE_SCREEN_STATE_UNSPECIFIED = null;
    public static final int DEVICE_SCREEN_STATE_UNSPECIFIED_VALUE = 0;
    public static final DeviceScreenState UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f173802a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ DeviceScreenState[] f173803b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f173804a = null;

        static {
            f173804a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (DeviceScreenState.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        DeviceScreenState r02 = new DeviceScreenState("DEVICE_SCREEN_STATE_UNSPECIFIED", 0, 0);
        DEVICE_SCREEN_STATE_UNSPECIFIED = r02;
        DeviceScreenState r1 = new DeviceScreenState("DEVICE_SCREEN_STATE_UNLOCKED", 1, 1);
        DEVICE_SCREEN_STATE_UNLOCKED = r1;
        DeviceScreenState r2 = new DeviceScreenState("DEVICE_SCREEN_STATE_LOCKED", 2, 2);
        DEVICE_SCREEN_STATE_LOCKED = r2;
        DeviceScreenState r3 = new DeviceScreenState("UNRECOGNIZED", 3, -1);
        UNRECOGNIZED = r3;
        f173803b = new DeviceScreenState[]{r02, r1, r2, r3};
        f173802a = new a();
    }

    DeviceScreenState(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static DeviceScreenState forNumber(int r1) {
        if (r1 == 0) goto L14;
        if (r1 == 1) goto L12;
        if (r1 == 2) goto L10;
        return null;
    L10:
        return DEVICE_SCREEN_STATE_LOCKED;
    L12:
        return DEVICE_SCREEN_STATE_UNLOCKED;
    L14:
        return DEVICE_SCREEN_STATE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<DeviceScreenState> internalGetValueMap() {
        return f173802a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f173804a;
    }

    public static DeviceScreenState valueOf(String r1) {
        return (DeviceScreenState) Enum.valueOf(DeviceScreenState.class, r1);
    }

    public static DeviceScreenState[] values() {
        return (DeviceScreenState[]) f173803b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static DeviceScreenState valueOf(int r02) {
        return forNumber(r02);
    }
}
