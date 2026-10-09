package securities.trm.core.smart_order.entity.v1;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum Order$OrderExpiryType extends Enum<Order$OrderExpiryType> implements Internal.EnumLite {
    public static final Order$OrderExpiryType ORDER_EXPIRY_TYPE_FAK = null;
    public static final int ORDER_EXPIRY_TYPE_FAK_VALUE = 3;
    public static final Order$OrderExpiryType ORDER_EXPIRY_TYPE_GFD = null;
    public static final int ORDER_EXPIRY_TYPE_GFD_VALUE = 2;
    public static final Order$OrderExpiryType ORDER_EXPIRY_TYPE_GTC = null;
    public static final int ORDER_EXPIRY_TYPE_GTC_VALUE = 1;
    public static final Order$OrderExpiryType ORDER_EXPIRY_TYPE_UNSPECIFIED = null;
    public static final int ORDER_EXPIRY_TYPE_UNSPECIFIED_VALUE = 0;
    public static final Order$OrderExpiryType UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f184007a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Order$OrderExpiryType[] f184008b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f184009a = null;

        static {
            f184009a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (Order$OrderExpiryType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        ORDER_EXPIRY_TYPE_UNSPECIFIED = new Order$OrderExpiryType("ORDER_EXPIRY_TYPE_UNSPECIFIED", 0, 0);
        ORDER_EXPIRY_TYPE_GTC = new Order$OrderExpiryType("ORDER_EXPIRY_TYPE_GTC", 1, 1);
        ORDER_EXPIRY_TYPE_GFD = new Order$OrderExpiryType("ORDER_EXPIRY_TYPE_GFD", 2, 2);
        ORDER_EXPIRY_TYPE_FAK = new Order$OrderExpiryType("ORDER_EXPIRY_TYPE_FAK", 3, 3);
        UNRECOGNIZED = new Order$OrderExpiryType("UNRECOGNIZED", 4, -1);
        f184008b = a();
        f184007a = new a();
    }

    Order$OrderExpiryType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ Order$OrderExpiryType[] a() {
        return new Order$OrderExpiryType[]{ORDER_EXPIRY_TYPE_UNSPECIFIED, ORDER_EXPIRY_TYPE_GTC, ORDER_EXPIRY_TYPE_GFD, ORDER_EXPIRY_TYPE_FAK, UNRECOGNIZED};
    }

    public static Order$OrderExpiryType forNumber(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return ORDER_EXPIRY_TYPE_FAK;
    L14:
        return ORDER_EXPIRY_TYPE_GFD;
    L16:
        return ORDER_EXPIRY_TYPE_GTC;
    L18:
        return ORDER_EXPIRY_TYPE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<Order$OrderExpiryType> internalGetValueMap() {
        return f184007a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f184009a;
    }

    public static Order$OrderExpiryType valueOf(String r1) {
        return (Order$OrderExpiryType) Enum.valueOf(Order$OrderExpiryType.class, r1);
    }

    public static Order$OrderExpiryType[] values() {
        return (Order$OrderExpiryType[]) f184008b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Order$OrderExpiryType valueOf(int r02) {
        return forNumber(r02);
    }
}
