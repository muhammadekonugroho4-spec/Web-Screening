package io.sentry;

/* loaded from: classes3.dex */
public enum Instrumenter extends Enum<Instrumenter> {
    private static final /* synthetic */ Instrumenter[] $VALUES = null;
    public static final Instrumenter OTEL = null;
    public static final Instrumenter SENTRY = null;

    private static /* synthetic */ Instrumenter[] $values() {
        return new Instrumenter[]{SENTRY, OTEL};
    }

    static {
        SENTRY = new Instrumenter("SENTRY", 0);
        OTEL = new Instrumenter("OTEL", 1);
        $VALUES = $values();
    }

    Instrumenter(String r1, int r2) {
    }

    public static Instrumenter valueOf(String r1) {
        return (Instrumenter) Enum.valueOf(Instrumenter.class, r1);
    }

    public static Instrumenter[] values() {
        return (Instrumenter[]) $VALUES.clone();
    }
}
