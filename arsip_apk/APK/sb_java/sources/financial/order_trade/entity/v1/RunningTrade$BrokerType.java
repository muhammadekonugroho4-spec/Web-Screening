package financial.order_trade.entity.v1;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum RunningTrade$BrokerType extends Enum<RunningTrade$BrokerType> implements Internal.EnumLite {
    public static final RunningTrade$BrokerType BROKER_TYPE_FOREIGN = null;
    public static final int BROKER_TYPE_FOREIGN_VALUE = 1;
    public static final RunningTrade$BrokerType BROKER_TYPE_GOVERNMENT = null;
    public static final int BROKER_TYPE_GOVERNMENT_VALUE = 2;
    public static final RunningTrade$BrokerType BROKER_TYPE_LOCAL = null;
    public static final int BROKER_TYPE_LOCAL_VALUE = 3;
    public static final RunningTrade$BrokerType BROKER_TYPE_UNSPECIFIED = null;
    public static final int BROKER_TYPE_UNSPECIFIED_VALUE = 0;
    public static final RunningTrade$BrokerType UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f174204a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ RunningTrade$BrokerType[] f174205b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f174206a = null;

        static {
            f174206a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (RunningTrade$BrokerType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        BROKER_TYPE_UNSPECIFIED = new RunningTrade$BrokerType("BROKER_TYPE_UNSPECIFIED", 0, 0);
        BROKER_TYPE_FOREIGN = new RunningTrade$BrokerType("BROKER_TYPE_FOREIGN", 1, 1);
        BROKER_TYPE_GOVERNMENT = new RunningTrade$BrokerType("BROKER_TYPE_GOVERNMENT", 2, 2);
        BROKER_TYPE_LOCAL = new RunningTrade$BrokerType("BROKER_TYPE_LOCAL", 3, 3);
        UNRECOGNIZED = new RunningTrade$BrokerType("UNRECOGNIZED", 4, -1);
        f174205b = a();
        f174204a = new a();
    }

    RunningTrade$BrokerType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ RunningTrade$BrokerType[] a() {
        return new RunningTrade$BrokerType[]{BROKER_TYPE_UNSPECIFIED, BROKER_TYPE_FOREIGN, BROKER_TYPE_GOVERNMENT, BROKER_TYPE_LOCAL, UNRECOGNIZED};
    }

    public static RunningTrade$BrokerType forNumber(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return BROKER_TYPE_LOCAL;
    L14:
        return BROKER_TYPE_GOVERNMENT;
    L16:
        return BROKER_TYPE_FOREIGN;
    L18:
        return BROKER_TYPE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<RunningTrade$BrokerType> internalGetValueMap() {
        return f174204a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f174206a;
    }

    public static RunningTrade$BrokerType valueOf(String r1) {
        return (RunningTrade$BrokerType) Enum.valueOf(RunningTrade$BrokerType.class, r1);
    }

    public static RunningTrade$BrokerType[] values() {
        return (RunningTrade$BrokerType[]) f174205b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static RunningTrade$BrokerType valueOf(int r02) {
        return forNumber(r02);
    }
}
