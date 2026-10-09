package io.sentry;

/* loaded from: classes3.dex */
public enum ScopeType extends Enum<ScopeType> {
    private static final /* synthetic */ ScopeType[] $VALUES = null;
    public static final ScopeType COMBINED = null;
    public static final ScopeType CURRENT = null;
    public static final ScopeType GLOBAL = null;
    public static final ScopeType ISOLATION = null;

    private static /* synthetic */ ScopeType[] $values() {
        return new ScopeType[]{CURRENT, ISOLATION, GLOBAL, COMBINED};
    }

    static {
        CURRENT = new ScopeType("CURRENT", 0);
        ISOLATION = new ScopeType("ISOLATION", 1);
        GLOBAL = new ScopeType("GLOBAL", 2);
        COMBINED = new ScopeType("COMBINED", 3);
        $VALUES = $values();
    }

    ScopeType(String r1, int r2) {
    }

    public static ScopeType valueOf(String r1) {
        return (ScopeType) Enum.valueOf(ScopeType.class, r1);
    }

    public static ScopeType[] values() {
        return (ScopeType[]) $VALUES.clone();
    }
}
