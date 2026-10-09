package com.tokopedia.clickstream.meta;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum DeviceType extends Enum<DeviceType> implements Internal.EnumLite {
    public static final DeviceType DEVICE_TYPE_LANDI = null;
    public static final int DEVICE_TYPE_LANDI_VALUE = 2;
    public static final DeviceType DEVICE_TYPE_MOBILE = null;
    public static final int DEVICE_TYPE_MOBILE_VALUE = 1;
    public static final DeviceType DEVICE_TYPE_UNSPECIFIED = null;
    public static final int DEVICE_TYPE_UNSPECIFIED_VALUE = 0;
    public static final DeviceType UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f173805a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ DeviceType[] f173806b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f173807a = null;

        static {
            f173807a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (DeviceType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        DeviceType r02 = new DeviceType("DEVICE_TYPE_UNSPECIFIED", 0, 0);
        DEVICE_TYPE_UNSPECIFIED = r02;
        DeviceType r1 = new DeviceType("DEVICE_TYPE_MOBILE", 1, 1);
        DEVICE_TYPE_MOBILE = r1;
        DeviceType r2 = new DeviceType("DEVICE_TYPE_LANDI", 2, 2);
        DEVICE_TYPE_LANDI = r2;
        DeviceType r3 = new DeviceType("UNRECOGNIZED", 3, -1);
        UNRECOGNIZED = r3;
        f173806b = new DeviceType[]{r02, r1, r2, r3};
        f173805a = new a();
    }

    DeviceType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static DeviceType forNumber(int r1) {
        if (r1 == 0) goto L14;
        if (r1 == 1) goto L12;
        if (r1 == 2) goto L10;
        return null;
    L10:
        return DEVICE_TYPE_LANDI;
    L12:
        return DEVICE_TYPE_MOBILE;
    L14:
        return DEVICE_TYPE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<DeviceType> internalGetValueMap() {
        return f173805a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f173807a;
    }

    public static DeviceType valueOf(String r1) {
        return (DeviceType) Enum.valueOf(DeviceType.class, r1);
    }

    public static DeviceType[] values() {
        return (DeviceType[]) f173806b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static DeviceType valueOf(int r02) {
        return forNumber(r02);
    }
}
