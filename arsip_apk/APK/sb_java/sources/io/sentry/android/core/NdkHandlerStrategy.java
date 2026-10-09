package io.sentry.android.core;

/* loaded from: classes3.dex */
public enum NdkHandlerStrategy extends Enum<NdkHandlerStrategy> {
    private static final /* synthetic */ NdkHandlerStrategy[] $VALUES = null;
    public static final NdkHandlerStrategy SENTRY_HANDLER_STRATEGY_CHAIN_AT_START = null;
    public static final NdkHandlerStrategy SENTRY_HANDLER_STRATEGY_DEFAULT = null;
    private final int value;

    private static /* synthetic */ NdkHandlerStrategy[] $values() {
        return new NdkHandlerStrategy[]{SENTRY_HANDLER_STRATEGY_DEFAULT, SENTRY_HANDLER_STRATEGY_CHAIN_AT_START};
    }

    static {
        SENTRY_HANDLER_STRATEGY_DEFAULT = new NdkHandlerStrategy("SENTRY_HANDLER_STRATEGY_DEFAULT", 0, 0);
        SENTRY_HANDLER_STRATEGY_CHAIN_AT_START = new NdkHandlerStrategy("SENTRY_HANDLER_STRATEGY_CHAIN_AT_START", 1, 1);
        $VALUES = $values();
    }

    NdkHandlerStrategy(String r1, int r2, int r3) {
        this.value = r3;
    }

    public static NdkHandlerStrategy valueOf(String r1) {
        return (NdkHandlerStrategy) Enum.valueOf(NdkHandlerStrategy.class, r1);
    }

    public static NdkHandlerStrategy[] values() {
        return (NdkHandlerStrategy[]) $VALUES.clone();
    }

    public int getValue() {
        return this.value;
    }
}
