package securities.trm.core.portfolio.entity.v2;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum Portfolio$PlatformOrderType extends Enum<Portfolio$PlatformOrderType> implements Internal.EnumLite {
    public static final Portfolio$PlatformOrderType PLATFORM_ORDER_TYPE_FAST_ORDER = null;
    public static final int PLATFORM_ORDER_TYPE_FAST_ORDER_VALUE = 3;
    public static final Portfolio$PlatformOrderType PLATFORM_ORDER_TYPE_LIMIT_DAY = null;
    public static final int PLATFORM_ORDER_TYPE_LIMIT_DAY_VALUE = 1;
    public static final Portfolio$PlatformOrderType PLATFORM_ORDER_TYPE_MARKET_FAK = null;
    public static final int PLATFORM_ORDER_TYPE_MARKET_FAK_VALUE = 2;
    public static final Portfolio$PlatformOrderType PLATFORM_ORDER_TYPE_UNSPECIFIED = null;
    public static final int PLATFORM_ORDER_TYPE_UNSPECIFIED_VALUE = 0;
    public static final Portfolio$PlatformOrderType UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f183985a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Portfolio$PlatformOrderType[] f183986b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f183987a = null;

        static {
            f183987a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (Portfolio$PlatformOrderType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        PLATFORM_ORDER_TYPE_UNSPECIFIED = new Portfolio$PlatformOrderType("PLATFORM_ORDER_TYPE_UNSPECIFIED", 0, 0);
        PLATFORM_ORDER_TYPE_LIMIT_DAY = new Portfolio$PlatformOrderType("PLATFORM_ORDER_TYPE_LIMIT_DAY", 1, 1);
        PLATFORM_ORDER_TYPE_MARKET_FAK = new Portfolio$PlatformOrderType("PLATFORM_ORDER_TYPE_MARKET_FAK", 2, 2);
        PLATFORM_ORDER_TYPE_FAST_ORDER = new Portfolio$PlatformOrderType("PLATFORM_ORDER_TYPE_FAST_ORDER", 3, 3);
        UNRECOGNIZED = new Portfolio$PlatformOrderType("UNRECOGNIZED", 4, -1);
        f183986b = a();
        f183985a = new a();
    }

    Portfolio$PlatformOrderType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ Portfolio$PlatformOrderType[] a() {
        return new Portfolio$PlatformOrderType[]{PLATFORM_ORDER_TYPE_UNSPECIFIED, PLATFORM_ORDER_TYPE_LIMIT_DAY, PLATFORM_ORDER_TYPE_MARKET_FAK, PLATFORM_ORDER_TYPE_FAST_ORDER, UNRECOGNIZED};
    }

    public static Portfolio$PlatformOrderType forNumber(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return PLATFORM_ORDER_TYPE_FAST_ORDER;
    L14:
        return PLATFORM_ORDER_TYPE_MARKET_FAK;
    L16:
        return PLATFORM_ORDER_TYPE_LIMIT_DAY;
    L18:
        return PLATFORM_ORDER_TYPE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<Portfolio$PlatformOrderType> internalGetValueMap() {
        return f183985a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f183987a;
    }

    public static Portfolio$PlatformOrderType valueOf(String r1) {
        return (Portfolio$PlatformOrderType) Enum.valueOf(Portfolio$PlatformOrderType.class, r1);
    }

    public static Portfolio$PlatformOrderType[] values() {
        return (Portfolio$PlatformOrderType[]) f183986b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Portfolio$PlatformOrderType valueOf(int r02) {
        return forNumber(r02);
    }
}
