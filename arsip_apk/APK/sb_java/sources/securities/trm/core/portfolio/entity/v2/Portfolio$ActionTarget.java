package securities.trm.core.portfolio.entity.v2;

import com.google.protobuf.Internal;

/* loaded from: classes3.dex */
public enum Portfolio$ActionTarget extends Enum<Portfolio$ActionTarget> implements Internal.EnumLite {
    public static final Portfolio$ActionTarget ACTION_TARGET_BRACKET_ORDER = null;
    public static final int ACTION_TARGET_BRACKET_ORDER_VALUE = 6;
    public static final Portfolio$ActionTarget ACTION_TARGET_DAY_TRADE = null;
    public static final int ACTION_TARGET_DAY_TRADE_VALUE = 2;
    public static final Portfolio$ActionTarget ACTION_TARGET_LEGACY_SMARTORDER = null;
    public static final int ACTION_TARGET_LEGACY_SMARTORDER_VALUE = 3;
    public static final Portfolio$ActionTarget ACTION_TARGET_NEGO_ENGINE = null;
    public static final int ACTION_TARGET_NEGO_ENGINE_VALUE = 8;
    public static final Portfolio$ActionTarget ACTION_TARGET_REGULAR = null;
    public static final int ACTION_TARGET_REGULAR_VALUE = 1;
    public static final Portfolio$ActionTarget ACTION_TARGET_STOP_ORDER = null;
    public static final int ACTION_TARGET_STOP_ORDER_VALUE = 5;
    public static final Portfolio$ActionTarget ACTION_TARGET_TRAILING_STOP = null;
    public static final int ACTION_TARGET_TRAILING_STOP_VALUE = 4;
    public static final Portfolio$ActionTarget ACTION_TARGET_UNSPECIFIED = null;
    public static final int ACTION_TARGET_UNSPECIFIED_VALUE = 0;
    public static final Portfolio$ActionTarget ACTION_TARGET_VOLUME_TRIGGER_ORDER = null;
    public static final int ACTION_TARGET_VOLUME_TRIGGER_ORDER_VALUE = 7;
    public static final Portfolio$ActionTarget UNRECOGNIZED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final Internal.EnumLiteMap f183938a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Portfolio$ActionTarget[] f183939b = null;
    private final int value;

    public static final class b implements Internal.EnumVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final Internal.EnumVerifier f183940a = null;

        static {
            f183940a = new b();
        }

        public b() {
        }

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int r1) {
            if (Portfolio$ActionTarget.forNumber(r1) == null) goto L6;
            return true;
        L6:
            return false;
        }
    }

    static {
        ACTION_TARGET_UNSPECIFIED = new Portfolio$ActionTarget("ACTION_TARGET_UNSPECIFIED", 0, 0);
        ACTION_TARGET_REGULAR = new Portfolio$ActionTarget("ACTION_TARGET_REGULAR", 1, 1);
        ACTION_TARGET_DAY_TRADE = new Portfolio$ActionTarget("ACTION_TARGET_DAY_TRADE", 2, 2);
        ACTION_TARGET_LEGACY_SMARTORDER = new Portfolio$ActionTarget("ACTION_TARGET_LEGACY_SMARTORDER", 3, 3);
        ACTION_TARGET_TRAILING_STOP = new Portfolio$ActionTarget("ACTION_TARGET_TRAILING_STOP", 4, 4);
        ACTION_TARGET_STOP_ORDER = new Portfolio$ActionTarget("ACTION_TARGET_STOP_ORDER", 5, 5);
        ACTION_TARGET_BRACKET_ORDER = new Portfolio$ActionTarget("ACTION_TARGET_BRACKET_ORDER", 6, 6);
        ACTION_TARGET_VOLUME_TRIGGER_ORDER = new Portfolio$ActionTarget("ACTION_TARGET_VOLUME_TRIGGER_ORDER", 7, 7);
        ACTION_TARGET_NEGO_ENGINE = new Portfolio$ActionTarget("ACTION_TARGET_NEGO_ENGINE", 8, 8);
        UNRECOGNIZED = new Portfolio$ActionTarget("UNRECOGNIZED", 9, -1);
        f183939b = a();
        f183938a = new a();
    }

    Portfolio$ActionTarget(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static /* synthetic */ Portfolio$ActionTarget[] a() {
        return new Portfolio$ActionTarget[]{ACTION_TARGET_UNSPECIFIED, ACTION_TARGET_REGULAR, ACTION_TARGET_DAY_TRADE, ACTION_TARGET_LEGACY_SMARTORDER, ACTION_TARGET_TRAILING_STOP, ACTION_TARGET_STOP_ORDER, ACTION_TARGET_BRACKET_ORDER, ACTION_TARGET_VOLUME_TRIGGER_ORDER, ACTION_TARGET_NEGO_ENGINE, UNRECOGNIZED};
    }

    public static Portfolio$ActionTarget forNumber(int r02) {
        switch(r02) {
            case 0: goto L22;
            case 1: goto L20;
            case 2: goto L18;
            case 3: goto L16;
            case 4: goto L14;
            case 5: goto L12;
            case 6: goto L10;
            case 7: goto L8;
            case 8: goto L6;
            default: goto L3;
        };
    L3:
        return null;
    L6:
        return ACTION_TARGET_NEGO_ENGINE;
    L8:
        return ACTION_TARGET_VOLUME_TRIGGER_ORDER;
    L10:
        return ACTION_TARGET_BRACKET_ORDER;
    L12:
        return ACTION_TARGET_STOP_ORDER;
    L14:
        return ACTION_TARGET_TRAILING_STOP;
    L16:
        return ACTION_TARGET_LEGACY_SMARTORDER;
    L18:
        return ACTION_TARGET_DAY_TRADE;
    L20:
        return ACTION_TARGET_REGULAR;
    L22:
        return ACTION_TARGET_UNSPECIFIED;
    }

    public static Internal.EnumLiteMap<Portfolio$ActionTarget> internalGetValueMap() {
        return f183938a;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.f183940a;
    }

    public static Portfolio$ActionTarget valueOf(String r1) {
        return (Portfolio$ActionTarget) Enum.valueOf(Portfolio$ActionTarget.class, r1);
    }

    public static Portfolio$ActionTarget[] values() {
        return (Portfolio$ActionTarget[]) f183939b.clone();
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) goto L7;
        return this.value;
    L7:
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Portfolio$ActionTarget valueOf(int r02) {
        return forNumber(r02);
    }
}
