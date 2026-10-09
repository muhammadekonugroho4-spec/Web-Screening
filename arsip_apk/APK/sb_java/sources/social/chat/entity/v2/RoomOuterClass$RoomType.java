package social.chat.entity.v2;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum RoomOuterClass$RoomType extends Enum<RoomOuterClass$RoomType> implements Internal.EnumLite {
    public static final RoomOuterClass$RoomType ROOM_TYPE_BROADCAST = null;
    public static final int ROOM_TYPE_BROADCAST_VALUE = 3;
    public static final RoomOuterClass$RoomType ROOM_TYPE_GROUP = null;
    public static final int ROOM_TYPE_GROUP_VALUE = 2;
    public static final RoomOuterClass$RoomType ROOM_TYPE_PERSONAL = null;
    public static final int ROOM_TYPE_PERSONAL_VALUE = 1;
    public static final RoomOuterClass$RoomType ROOM_TYPE_UNSPECIFIED = null;
    public static final int ROOM_TYPE_UNSPECIFIED_VALUE = 0;
    public static final RoomOuterClass$RoomType UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f184067a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ RoomOuterClass$RoomType[] f184068b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f184069a = null;

        static {
            f184069a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (RoomOuterClass$RoomType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        ROOM_TYPE_UNSPECIFIED = new RoomOuterClass$RoomType("ROOM_TYPE_UNSPECIFIED", 0, 0);
        ROOM_TYPE_PERSONAL = new RoomOuterClass$RoomType("ROOM_TYPE_PERSONAL", 1, 1);
        ROOM_TYPE_GROUP = new RoomOuterClass$RoomType("ROOM_TYPE_GROUP", 2, 2);
        ROOM_TYPE_BROADCAST = new RoomOuterClass$RoomType("ROOM_TYPE_BROADCAST", 3, 3);
        UNRECOGNIZED = new RoomOuterClass$RoomType("UNRECOGNIZED", 4, -1);
        f184068b = a();
        f184067a = new a();
    }

    RoomOuterClass$RoomType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ RoomOuterClass$RoomType[] a() {
        return new RoomOuterClass$RoomType[]{ROOM_TYPE_UNSPECIFIED, ROOM_TYPE_PERSONAL, ROOM_TYPE_GROUP, ROOM_TYPE_BROADCAST, UNRECOGNIZED};
    }

    public static RoomOuterClass$RoomType forNumber(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return ROOM_TYPE_BROADCAST;
    L14:
        return ROOM_TYPE_GROUP;
    L16:
        return ROOM_TYPE_PERSONAL;
    L18:
        return ROOM_TYPE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<RoomOuterClass$RoomType> internalGetValueMap() {
        return f184067a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f184069a;
    }

    public static RoomOuterClass$RoomType valueOf(String r1) {
        return (RoomOuterClass$RoomType) Enum.valueOf(RoomOuterClass$RoomType.class, r1);
    }

    public static RoomOuterClass$RoomType[] values() {
        return (RoomOuterClass$RoomType[]) f184068b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static RoomOuterClass$RoomType valueOf(int r02) {
        return forNumber(r02);
    }
}
