package financial.order_trade.entity.v1;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum Entity$ActionType extends Enum<Entity$ActionType> implements Internal.EnumLite {
    public static final Entity$ActionType ACTION_TYPE_ALL = null;
    public static final int ACTION_TYPE_ALL_VALUE = 3;
    public static final Entity$ActionType ACTION_TYPE_BUY = null;
    public static final int ACTION_TYPE_BUY_VALUE = 1;
    public static final Entity$ActionType ACTION_TYPE_SELL = null;
    public static final int ACTION_TYPE_SELL_VALUE = 2;
    public static final Entity$ActionType ACTION_TYPE_UNSPECIFIED = null;
    public static final int ACTION_TYPE_UNSPECIFIED_VALUE = 0;
    public static final Entity$ActionType UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f174186a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Entity$ActionType[] f174187b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f174188a = null;

        static {
            f174188a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (Entity$ActionType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        ACTION_TYPE_UNSPECIFIED = new Entity$ActionType("ACTION_TYPE_UNSPECIFIED", 0, 0);
        ACTION_TYPE_BUY = new Entity$ActionType("ACTION_TYPE_BUY", 1, 1);
        ACTION_TYPE_SELL = new Entity$ActionType("ACTION_TYPE_SELL", 2, 2);
        ACTION_TYPE_ALL = new Entity$ActionType("ACTION_TYPE_ALL", 3, 3);
        UNRECOGNIZED = new Entity$ActionType("UNRECOGNIZED", 4, -1);
        f174187b = a();
        f174186a = new a();
    }

    Entity$ActionType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ Entity$ActionType[] a() {
        return new Entity$ActionType[]{ACTION_TYPE_UNSPECIFIED, ACTION_TYPE_BUY, ACTION_TYPE_SELL, ACTION_TYPE_ALL, UNRECOGNIZED};
    }

    public static Entity$ActionType forNumber(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return ACTION_TYPE_ALL;
    L14:
        return ACTION_TYPE_SELL;
    L16:
        return ACTION_TYPE_BUY;
    L18:
        return ACTION_TYPE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<Entity$ActionType> internalGetValueMap() {
        return f174186a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f174188a;
    }

    public static Entity$ActionType valueOf(String r1) {
        return (Entity$ActionType) Enum.valueOf(Entity$ActionType.class, r1);
    }

    public static Entity$ActionType[] values() {
        return (Entity$ActionType[]) f174187b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Entity$ActionType valueOf(int r02) {
        return forNumber(r02);
    }
}
