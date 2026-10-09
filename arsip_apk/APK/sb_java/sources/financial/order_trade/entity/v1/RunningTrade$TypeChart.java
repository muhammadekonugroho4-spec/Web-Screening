package financial.order_trade.entity.v1;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum RunningTrade$TypeChart extends Enum<RunningTrade$TypeChart> implements Internal.EnumLite {
    public static final RunningTrade$TypeChart TYPE_CHART_PRICE = null;
    public static final int TYPE_CHART_PRICE_VALUE = 3;
    public static final RunningTrade$TypeChart TYPE_CHART_UNSPECIFIED = null;
    public static final int TYPE_CHART_UNSPECIFIED_VALUE = 0;
    public static final RunningTrade$TypeChart TYPE_CHART_VALUE = null;
    public static final int TYPE_CHART_VALUE_VALUE = 1;
    public static final RunningTrade$TypeChart TYPE_CHART_VOLUME = null;
    public static final int TYPE_CHART_VOLUME_VALUE = 2;
    public static final RunningTrade$TypeChart UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f174207a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ RunningTrade$TypeChart[] f174208b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f174209a = null;

        static {
            f174209a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (RunningTrade$TypeChart.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        TYPE_CHART_UNSPECIFIED = new RunningTrade$TypeChart("TYPE_CHART_UNSPECIFIED", 0, 0);
        TYPE_CHART_VALUE = new RunningTrade$TypeChart("TYPE_CHART_VALUE", 1, 1);
        TYPE_CHART_VOLUME = new RunningTrade$TypeChart("TYPE_CHART_VOLUME", 2, 2);
        TYPE_CHART_PRICE = new RunningTrade$TypeChart("TYPE_CHART_PRICE", 3, 3);
        UNRECOGNIZED = new RunningTrade$TypeChart("UNRECOGNIZED", 4, -1);
        f174208b = a();
        f174207a = new a();
    }

    RunningTrade$TypeChart(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ RunningTrade$TypeChart[] a() {
        return new RunningTrade$TypeChart[]{TYPE_CHART_UNSPECIFIED, TYPE_CHART_VALUE, TYPE_CHART_VOLUME, TYPE_CHART_PRICE, UNRECOGNIZED};
    }

    public static RunningTrade$TypeChart forNumber(int r1) {
        if (r1 == 0) goto L18;
        if (r1 == 1) goto L16;
        if (r1 == 2) goto L14;
        if (r1 == 3) goto L12;
        return null;
    L12:
        return TYPE_CHART_PRICE;
    L14:
        return TYPE_CHART_VOLUME;
    L16:
        return TYPE_CHART_VALUE;
    L18:
        return TYPE_CHART_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<RunningTrade$TypeChart> internalGetValueMap() {
        return f174207a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f174209a;
    }

    public static RunningTrade$TypeChart valueOf(String r1) {
        return (RunningTrade$TypeChart) Enum.valueOf(RunningTrade$TypeChart.class, r1);
    }

    public static RunningTrade$TypeChart[] values() {
        return (RunningTrade$TypeChart[]) f174208b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static RunningTrade$TypeChart valueOf(int r02) {
        return forNumber(r02);
    }
}
