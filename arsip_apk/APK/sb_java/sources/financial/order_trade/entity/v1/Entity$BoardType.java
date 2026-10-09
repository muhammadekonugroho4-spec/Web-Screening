package financial.order_trade.entity.v1;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum Entity$BoardType extends Enum<Entity$BoardType> implements Internal.EnumLite {
    public static final Entity$BoardType BOARD_TYPE_ALL = null;
    public static final int BOARD_TYPE_ALL_VALUE = 4;
    public static final Entity$BoardType BOARD_TYPE_CASH = null;
    public static final int BOARD_TYPE_CASH_VALUE = 3;
    public static final Entity$BoardType BOARD_TYPE_NEGOTIATION = null;
    public static final int BOARD_TYPE_NEGOTIATION_VALUE = 2;
    public static final Entity$BoardType BOARD_TYPE_REGULAR = null;
    public static final int BOARD_TYPE_REGULAR_VALUE = 1;
    public static final Entity$BoardType BOARD_TYPE_UNSPECIFIED = null;
    public static final int BOARD_TYPE_UNSPECIFIED_VALUE = 0;
    public static final Entity$BoardType UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f174189a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Entity$BoardType[] f174190b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f174191a = null;

        static {
            f174191a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (Entity$BoardType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        BOARD_TYPE_UNSPECIFIED = new Entity$BoardType("BOARD_TYPE_UNSPECIFIED", 0, 0);
        BOARD_TYPE_REGULAR = new Entity$BoardType("BOARD_TYPE_REGULAR", 1, 1);
        BOARD_TYPE_NEGOTIATION = new Entity$BoardType("BOARD_TYPE_NEGOTIATION", 2, 2);
        BOARD_TYPE_CASH = new Entity$BoardType("BOARD_TYPE_CASH", 3, 3);
        BOARD_TYPE_ALL = new Entity$BoardType("BOARD_TYPE_ALL", 4, 4);
        UNRECOGNIZED = new Entity$BoardType("UNRECOGNIZED", 5, -1);
        f174190b = a();
        f174189a = new a();
    }

    Entity$BoardType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ Entity$BoardType[] a() {
        return new Entity$BoardType[]{BOARD_TYPE_UNSPECIFIED, BOARD_TYPE_REGULAR, BOARD_TYPE_NEGOTIATION, BOARD_TYPE_CASH, BOARD_TYPE_ALL, UNRECOGNIZED};
    }

    public static Entity$BoardType forNumber(int r1) {
        if (r1 == 0) goto L22;
        if (r1 == 1) goto L20;
        if (r1 == 2) goto L18;
        if (r1 == 3) goto L16;
        if (r1 == 4) goto L14;
        return null;
    L14:
        return BOARD_TYPE_ALL;
    L16:
        return BOARD_TYPE_CASH;
    L18:
        return BOARD_TYPE_NEGOTIATION;
    L20:
        return BOARD_TYPE_REGULAR;
    L22:
        return BOARD_TYPE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<Entity$BoardType> internalGetValueMap() {
        return f174189a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f174191a;
    }

    public static Entity$BoardType valueOf(String r1) {
        return (Entity$BoardType) Enum.valueOf(Entity$BoardType.class, r1);
    }

    public static Entity$BoardType[] values() {
        return (Entity$BoardType[]) f174190b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Entity$BoardType valueOf(int r02) {
        return forNumber(r02);
    }
}
