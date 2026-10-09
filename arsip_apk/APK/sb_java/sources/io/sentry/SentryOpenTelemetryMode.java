package io.sentry;

/* loaded from: classes3.dex */
public enum SentryOpenTelemetryMode extends Enum<SentryOpenTelemetryMode> {
    private static final /* synthetic */ SentryOpenTelemetryMode[] $VALUES = null;
    public static final SentryOpenTelemetryMode AGENT = null;
    public static final SentryOpenTelemetryMode AGENTLESS = null;
    public static final SentryOpenTelemetryMode AGENTLESS_SPRING = null;
    public static final SentryOpenTelemetryMode AUTO = null;
    public static final SentryOpenTelemetryMode OFF = null;

    private static /* synthetic */ SentryOpenTelemetryMode[] $values() {
        return new SentryOpenTelemetryMode[]{AUTO, OFF, AGENT, AGENTLESS, AGENTLESS_SPRING};
    }

    static {
        AUTO = new SentryOpenTelemetryMode("AUTO", 0);
        OFF = new SentryOpenTelemetryMode("OFF", 1);
        AGENT = new SentryOpenTelemetryMode("AGENT", 2);
        AGENTLESS = new SentryOpenTelemetryMode("AGENTLESS", 3);
        AGENTLESS_SPRING = new SentryOpenTelemetryMode("AGENTLESS_SPRING", 4);
        $VALUES = $values();
    }

    SentryOpenTelemetryMode(String r1, int r2) {
    }

    public static SentryOpenTelemetryMode valueOf(String r1) {
        return (SentryOpenTelemetryMode) Enum.valueOf(SentryOpenTelemetryMode.class, r1);
    }

    public static SentryOpenTelemetryMode[] values() {
        return (SentryOpenTelemetryMode[]) $VALUES.clone();
    }
}
