package com.tokopedia.clickstream.meta;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum NetworkType extends Enum<NetworkType> implements Internal.EnumLite {
    public static final NetworkType NETWORK_TYPE_NO_CONNECTION = null;
    public static final int NETWORK_TYPE_NO_CONNECTION_VALUE = 1;
    public static final NetworkType NETWORK_TYPE_UNSPECIFIED = null;
    public static final int NETWORK_TYPE_UNSPECIFIED_VALUE = 0;
    public static final NetworkType NETWORK_TYPE_WIFI = null;
    public static final int NETWORK_TYPE_WIFI_VALUE = 2;
    public static final NetworkType NETWORK_TYPE_WWAN2G = null;
    public static final int NETWORK_TYPE_WWAN2G_VALUE = 3;
    public static final NetworkType NETWORK_TYPE_WWAN3G = null;
    public static final int NETWORK_TYPE_WWAN3G_VALUE = 4;
    public static final NetworkType NETWORK_TYPE_WWAN4G = null;
    public static final int NETWORK_TYPE_WWAN4G_VALUE = 5;
    public static final NetworkType UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f173811a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ NetworkType[] f173812b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f173813a = null;

        static {
            f173813a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (NetworkType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        NetworkType r02 = new NetworkType("NETWORK_TYPE_UNSPECIFIED", 0, 0);
        NETWORK_TYPE_UNSPECIFIED = r02;
        NetworkType r1 = new NetworkType("NETWORK_TYPE_NO_CONNECTION", 1, 1);
        NETWORK_TYPE_NO_CONNECTION = r1;
        NetworkType r2 = new NetworkType("NETWORK_TYPE_WIFI", 2, 2);
        NETWORK_TYPE_WIFI = r2;
        NetworkType r3 = new NetworkType("NETWORK_TYPE_WWAN2G", 3, 3);
        NETWORK_TYPE_WWAN2G = r3;
        NetworkType r4 = new NetworkType("NETWORK_TYPE_WWAN3G", 4, 4);
        NETWORK_TYPE_WWAN3G = r4;
        NetworkType r5 = new NetworkType("NETWORK_TYPE_WWAN4G", 5, 5);
        NETWORK_TYPE_WWAN4G = r5;
        NetworkType r6 = new NetworkType("UNRECOGNIZED", 6, -1);
        UNRECOGNIZED = r6;
        f173812b = new NetworkType[]{r02, r1, r2, r3, r4, r5, r6};
        f173811a = new a();
    }

    NetworkType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static NetworkType forNumber(int r1) {
        if (r1 == 0) goto L26;
        if (r1 == 1) goto L24;
        if (r1 == 2) goto L22;
        if (r1 == 3) goto L20;
        if (r1 == 4) goto L18;
        if (r1 == 5) goto L16;
        return null;
    L16:
        return NETWORK_TYPE_WWAN4G;
    L18:
        return NETWORK_TYPE_WWAN3G;
    L20:
        return NETWORK_TYPE_WWAN2G;
    L22:
        return NETWORK_TYPE_WIFI;
    L24:
        return NETWORK_TYPE_NO_CONNECTION;
    L26:
        return NETWORK_TYPE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<NetworkType> internalGetValueMap() {
        return f173811a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f173813a;
    }

    public static NetworkType valueOf(String r1) {
        return (NetworkType) Enum.valueOf(NetworkType.class, r1);
    }

    public static NetworkType[] values() {
        return (NetworkType[]) f173812b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static NetworkType valueOf(int r02) {
        return forNumber(r02);
    }
}
