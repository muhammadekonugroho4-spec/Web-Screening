package securities.trm.core.portfolio.entity.v2;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum Portfolio$SmartOrderLabelType extends Enum<Portfolio$SmartOrderLabelType> implements Internal.EnumLite {
    public static final Portfolio$SmartOrderLabelType SMART_ORDER_LABEL_TYPE_AUTO_BUY = null;
    public static final int SMART_ORDER_LABEL_TYPE_AUTO_BUY_VALUE = 1;
    public static final Portfolio$SmartOrderLabelType SMART_ORDER_LABEL_TYPE_BRACKET_ORDER = null;
    public static final int SMART_ORDER_LABEL_TYPE_BRACKET_ORDER_VALUE = 7;
    public static final Portfolio$SmartOrderLabelType SMART_ORDER_LABEL_TYPE_LIMIT_IF_TOUCHED = null;
    public static final int SMART_ORDER_LABEL_TYPE_LIMIT_IF_TOUCHED_VALUE = 6;
    public static final Portfolio$SmartOrderLabelType SMART_ORDER_LABEL_TYPE_STOP_LOSS = null;
    public static final int SMART_ORDER_LABEL_TYPE_STOP_LOSS_VALUE = 2;
    public static final Portfolio$SmartOrderLabelType SMART_ORDER_LABEL_TYPE_TAKE_PROFIT = null;
    public static final int SMART_ORDER_LABEL_TYPE_TAKE_PROFIT_VALUE = 3;
    public static final Portfolio$SmartOrderLabelType SMART_ORDER_LABEL_TYPE_TRAILING_STOP = null;
    public static final int SMART_ORDER_LABEL_TYPE_TRAILING_STOP_VALUE = 5;
    public static final Portfolio$SmartOrderLabelType SMART_ORDER_LABEL_TYPE_UNSPECIFIED = null;
    public static final int SMART_ORDER_LABEL_TYPE_UNSPECIFIED_VALUE = 0;
    public static final Portfolio$SmartOrderLabelType SMART_ORDER_LABEL_TYPE_VOLUME_TRIGGER_ORDER = null;
    public static final int SMART_ORDER_LABEL_TYPE_VOLUME_TRIGGER_ORDER_VALUE = 8;
    public static final Portfolio$SmartOrderLabelType UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f183994a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Portfolio$SmartOrderLabelType[] f183995b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f183996a = null;

        static {
            f183996a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (Portfolio$SmartOrderLabelType.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        SMART_ORDER_LABEL_TYPE_UNSPECIFIED = new Portfolio$SmartOrderLabelType("SMART_ORDER_LABEL_TYPE_UNSPECIFIED", 0, 0);
        SMART_ORDER_LABEL_TYPE_AUTO_BUY = new Portfolio$SmartOrderLabelType("SMART_ORDER_LABEL_TYPE_AUTO_BUY", 1, 1);
        SMART_ORDER_LABEL_TYPE_STOP_LOSS = new Portfolio$SmartOrderLabelType("SMART_ORDER_LABEL_TYPE_STOP_LOSS", 2, 2);
        SMART_ORDER_LABEL_TYPE_TAKE_PROFIT = new Portfolio$SmartOrderLabelType("SMART_ORDER_LABEL_TYPE_TAKE_PROFIT", 3, 3);
        SMART_ORDER_LABEL_TYPE_TRAILING_STOP = new Portfolio$SmartOrderLabelType("SMART_ORDER_LABEL_TYPE_TRAILING_STOP", 4, 5);
        SMART_ORDER_LABEL_TYPE_LIMIT_IF_TOUCHED = new Portfolio$SmartOrderLabelType("SMART_ORDER_LABEL_TYPE_LIMIT_IF_TOUCHED", 5, 6);
        SMART_ORDER_LABEL_TYPE_BRACKET_ORDER = new Portfolio$SmartOrderLabelType("SMART_ORDER_LABEL_TYPE_BRACKET_ORDER", 6, 7);
        SMART_ORDER_LABEL_TYPE_VOLUME_TRIGGER_ORDER = new Portfolio$SmartOrderLabelType("SMART_ORDER_LABEL_TYPE_VOLUME_TRIGGER_ORDER", 7, 8);
        UNRECOGNIZED = new Portfolio$SmartOrderLabelType("UNRECOGNIZED", 8, -1);
        f183995b = a();
        f183994a = new a();
    }

    Portfolio$SmartOrderLabelType(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ Portfolio$SmartOrderLabelType[] a() {
        return new Portfolio$SmartOrderLabelType[]{SMART_ORDER_LABEL_TYPE_UNSPECIFIED, SMART_ORDER_LABEL_TYPE_AUTO_BUY, SMART_ORDER_LABEL_TYPE_STOP_LOSS, SMART_ORDER_LABEL_TYPE_TAKE_PROFIT, SMART_ORDER_LABEL_TYPE_TRAILING_STOP, SMART_ORDER_LABEL_TYPE_LIMIT_IF_TOUCHED, SMART_ORDER_LABEL_TYPE_BRACKET_ORDER, SMART_ORDER_LABEL_TYPE_VOLUME_TRIGGER_ORDER, UNRECOGNIZED};
    }

    public static Portfolio$SmartOrderLabelType forNumber(int r02) {
        switch(r02) {
            case 0: goto L20;
            case 1: goto L18;
            case 2: goto L16;
            case 3: goto L14;
            case 4: goto L3;
            case 5: goto L12;
            case 6: goto L10;
            case 7: goto L8;
            case 8: goto L6;
            default: goto L3;
        };
    L3:
        return null;
    L6:
        return SMART_ORDER_LABEL_TYPE_VOLUME_TRIGGER_ORDER;
    L8:
        return SMART_ORDER_LABEL_TYPE_BRACKET_ORDER;
    L10:
        return SMART_ORDER_LABEL_TYPE_LIMIT_IF_TOUCHED;
    L12:
        return SMART_ORDER_LABEL_TYPE_TRAILING_STOP;
    L14:
        return SMART_ORDER_LABEL_TYPE_TAKE_PROFIT;
    L16:
        return SMART_ORDER_LABEL_TYPE_STOP_LOSS;
    L18:
        return SMART_ORDER_LABEL_TYPE_AUTO_BUY;
    L20:
        return SMART_ORDER_LABEL_TYPE_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<Portfolio$SmartOrderLabelType> internalGetValueMap() {
        return f183994a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f183996a;
    }

    public static Portfolio$SmartOrderLabelType valueOf(String r1) {
        return (Portfolio$SmartOrderLabelType) Enum.valueOf(Portfolio$SmartOrderLabelType.class, r1);
    }

    public static Portfolio$SmartOrderLabelType[] values() {
        return (Portfolio$SmartOrderLabelType[]) f183995b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Portfolio$SmartOrderLabelType valueOf(int r02) {
        return forNumber(r02);
    }
}
