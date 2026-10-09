package social.chat.entity.v2;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum RoomOuterClass$RoomState extends Enum<RoomOuterClass$RoomState> implements Internal.EnumLite {
    public static final RoomOuterClass$RoomState ROOM_STATE_ACCEPTED = null;
    public static final int ROOM_STATE_ACCEPTED_VALUE = 1;
    public static final RoomOuterClass$RoomState ROOM_STATE_INVITED = null;
    public static final int ROOM_STATE_INVITED_VALUE = 2;
    public static final RoomOuterClass$RoomState ROOM_STATE_UNSPECIFIED = null;
    public static final int ROOM_STATE_UNSPECIFIED_VALUE = 0;
    public static final RoomOuterClass$RoomState UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f184064a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ RoomOuterClass$RoomState[] f184065b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f184066a = null;

        static {
            f184066a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (RoomOuterClass$RoomState.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        ROOM_STATE_UNSPECIFIED = new RoomOuterClass$RoomState("ROOM_STATE_UNSPECIFIED", 0, 0);
        ROOM_STATE_ACCEPTED = new RoomOuterClass$RoomState("ROOM_STATE_ACCEPTED", 1, 1);
        ROOM_STATE_INVITED = new RoomOuterClass$RoomState("ROOM_STATE_INVITED", 2, 2);
        UNRECOGNIZED = new RoomOuterClass$RoomState("UNRECOGNIZED", 3, -1);
        f184065b = a();
        f184064a = new a();
    }

    RoomOuterClass$RoomState(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ RoomOuterClass$RoomState[] a() {
        return new RoomOuterClass$RoomState[]{ROOM_STATE_UNSPECIFIED, ROOM_STATE_ACCEPTED, ROOM_STATE_INVITED, UNRECOGNIZED};
    }

    public static RoomOuterClass$RoomState forNumber(int r1) {
        if (r1 == 0) goto L14;
        if (r1 == 1) goto L12;
        if (r1 == 2) goto L10;
        return null;
    L10:
        return ROOM_STATE_INVITED;
    L12:
        return ROOM_STATE_ACCEPTED;
    L14:
        return ROOM_STATE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<RoomOuterClass$RoomState> internalGetValueMap() {
        return f184064a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f184066a;
    }

    public static RoomOuterClass$RoomState valueOf(String r1) {
        return (RoomOuterClass$RoomState) Enum.valueOf(RoomOuterClass$RoomState.class, r1);
    }

    public static RoomOuterClass$RoomState[] values() {
        return (RoomOuterClass$RoomState[]) f184065b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static RoomOuterClass$RoomState valueOf(int r02) {
        return forNumber(r02);
    }
}
