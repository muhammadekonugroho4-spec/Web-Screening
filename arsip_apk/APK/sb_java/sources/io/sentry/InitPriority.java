package io.sentry;

/* loaded from: classes3.dex */
public enum InitPriority extends Enum<InitPriority> {
    private static final /* synthetic */ InitPriority[] $VALUES = null;
    public static final InitPriority HIGH = null;
    public static final InitPriority HIGHEST = null;
    public static final InitPriority LOW = null;
    public static final InitPriority LOWEST = null;
    public static final InitPriority MEDIUM = null;

    private static /* synthetic */ InitPriority[] $values() {
        return new InitPriority[]{LOWEST, LOW, MEDIUM, HIGH, HIGHEST};
    }

    static {
        LOWEST = new InitPriority("LOWEST", 0);
        LOW = new InitPriority("LOW", 1);
        MEDIUM = new InitPriority("MEDIUM", 2);
        HIGH = new InitPriority("HIGH", 3);
        HIGHEST = new InitPriority("HIGHEST", 4);
        $VALUES = $values();
    }

    InitPriority(String r1, int r2) {
    }

    public static InitPriority valueOf(String r1) {
        return (InitPriority) Enum.valueOf(InitPriority.class, r1);
    }

    public static InitPriority[] values() {
        return (InitPriority[]) $VALUES.clone();
    }
}
