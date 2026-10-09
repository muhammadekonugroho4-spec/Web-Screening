package io.sentry.ndk;

/* loaded from: classes3.dex */
public final class NdkOptions {
    private final String dist;
    private final String dsn;
    private final String environment;
    private final boolean isDebug;
    private final int maxBreadcrumbs;
    private NdkHandlerStrategy ndkHandlerStrategy;
    private final String outboxPath;
    private final String release;
    private final String sdkName;
    private float tracesSampleRate;

    public NdkOptions(String r2, boolean r3, String r4, String r5, String r6, String r7, int r8, String r9) {
        this.ndkHandlerStrategy = NdkHandlerStrategy.SENTRY_HANDLER_STRATEGY_DEFAULT;
        this.tracesSampleRate = 0.0f;
        this.dsn = r2;
        this.isDebug = r3;
        this.outboxPath = r4;
        this.release = r5;
        this.environment = r6;
        this.dist = r7;
        this.maxBreadcrumbs = r8;
        this.sdkName = r9;
    }

    public String getDist() {
        return this.dist;
    }

    public String getDsn() {
        return this.dsn;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getNdkHandlerStrategy() {
        return this.ndkHandlerStrategy.getValue();
    }

    public String getOutboxPath() {
        return this.outboxPath;
    }

    public String getRelease() {
        return this.release;
    }

    public String getSdkName() {
        return this.sdkName;
    }

    public float getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public boolean isDebug() {
        return this.isDebug;
    }

    public void setNdkHandlerStrategy(NdkHandlerStrategy r1) {
        this.ndkHandlerStrategy = r1;
    }

    public void setTracesSampleRate(float r1) {
        this.tracesSampleRate = r1;
    }
}
