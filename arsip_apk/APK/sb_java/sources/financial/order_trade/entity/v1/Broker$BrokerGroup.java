package financial.order_trade.entity.v1;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum Broker$BrokerGroup extends Enum<Broker$BrokerGroup> implements Internal.EnumLite {
    public static final Broker$BrokerGroup BROKER_GROUP_FOREIGN = null;
    public static final int BROKER_GROUP_FOREIGN_VALUE = 1;
    public static final Broker$BrokerGroup BROKER_GROUP_GOVERNMENT = null;
    public static final int BROKER_GROUP_GOVERNMENT_VALUE = 2;
    public static final Broker$BrokerGroup BROKER_GROUP_LOCAL = null;
    public static final int BROKER_GROUP_LOCAL_VALUE = 3;
    public static final Broker$BrokerGroup BROKER_GROUP_UNSPECIFIED = null;
    public static final int BROKER_GROUP_UNSPECIFIED_VALUE = 0;
    public static final Broker$BrokerGroup UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f174183a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Broker$BrokerGroup[] f174184b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f174185a = null;

        static {
            f174185a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (Broker$BrokerGroup.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        BROKER_GROUP_UNSPECIFIED = new Broker$BrokerGroup("BROKER_GROUP_UNSPECIFIED", 0, 0);
        BROKER_GROUP_FOREIGN = new Broker$BrokerGroup("BROKER_GROUP_FOREIGN", 1, 1);
        BROKER_GROUP_GOVERNMENT = new Broker$BrokerGroup("BROKER_GROUP_GOVERNMENT", 2, 2);
        BROKER_GROUP_LOCAL = new Broker$BrokerGroup("BROKER_GROUP_LOCAL", 3, 3);
        UNRECOGNIZED = new Broker$BrokerGroup("UNRECOGNIZED", 4, -1);
        f174184b = a();
        f174183a = new a();
    }

    Broker$BrokerGroup(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ Broker$BrokerGroup[] a() {
        return new Broker$BrokerGroup[]{BROKER_GROUP_UNSPECIFIED, BROKER_GROUP_FOREIGN, BROKER_GROUP_GOVERNMENT, BROKER_GROUP_LOCAL, UNRECOGNIZED};
    }

    public static Broker$BrokerGroup forNumber(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return BROKER_GROUP_LOCAL;
    L14:
        return BROKER_GROUP_GOVERNMENT;
    L16:
        return BROKER_GROUP_FOREIGN;
    L18:
        return BROKER_GROUP_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<Broker$BrokerGroup> internalGetValueMap() {
        return f174183a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f174185a;
    }

    public static Broker$BrokerGroup valueOf(String r1) {
        return (Broker$BrokerGroup) Enum.valueOf(Broker$BrokerGroup.class, r1);
    }

    public static Broker$BrokerGroup[] values() {
        return (Broker$BrokerGroup[]) f174184b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Broker$BrokerGroup valueOf(int r02) {
        return forNumber(r02);
    }
}
