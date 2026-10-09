package securities.trm.core.info.publics.v1;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum EventType extends Enum<EventType> implements Internal.EnumLite {
    public static final EventType EVENT_TYPE_DISABLE_EXCEED_DEBT_RATIO = null;
    public static final int EVENT_TYPE_DISABLE_EXCEED_DEBT_RATIO_VALUE = 2;
    public static final EventType EVENT_TYPE_DISABLE_OUTSIDE_MARKET_HOURS = null;
    public static final int EVENT_TYPE_DISABLE_OUTSIDE_MARKET_HOURS_VALUE = 1;
    public static final EventType EVENT_TYPE_UNSPECIFIED = null;
    public static final int EVENT_TYPE_UNSPECIFIED_VALUE = 0;
    public static final EventType UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f183919a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EventType[] f183920b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f183921a = null;

        static {
            f183921a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (EventType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        EVENT_TYPE_UNSPECIFIED = new EventType("EVENT_TYPE_UNSPECIFIED", 0, 0);
        EVENT_TYPE_DISABLE_OUTSIDE_MARKET_HOURS = new EventType("EVENT_TYPE_DISABLE_OUTSIDE_MARKET_HOURS", 1, 1);
        EVENT_TYPE_DISABLE_EXCEED_DEBT_RATIO = new EventType("EVENT_TYPE_DISABLE_EXCEED_DEBT_RATIO", 2, 2);
        UNRECOGNIZED = new EventType("UNRECOGNIZED", 3, -1);
        f183920b = a();
        f183919a = new a();
    }

    EventType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ EventType[] a() {
        return new EventType[]{EVENT_TYPE_UNSPECIFIED, EVENT_TYPE_DISABLE_OUTSIDE_MARKET_HOURS, EVENT_TYPE_DISABLE_EXCEED_DEBT_RATIO, UNRECOGNIZED};
    }

    public static EventType forNumber(int r1) {
        if (r1 == 0) goto L14;
        if (r1 == 1) goto L12;
        if (r1 == 2) goto L10;
        return null;
    L10:
        return EVENT_TYPE_DISABLE_EXCEED_DEBT_RATIO;
    L12:
        return EVENT_TYPE_DISABLE_OUTSIDE_MARKET_HOURS;
    L14:
        return EVENT_TYPE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<EventType> internalGetValueMap() {
        return f183919a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f183921a;
    }

    public static EventType valueOf(String r1) {
        return (EventType) Enum.valueOf(EventType.class, r1);
    }

    public static EventType[] values() {
        return (EventType[]) f183920b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static EventType valueOf(int r02) {
        return forNumber(r02);
    }
}
