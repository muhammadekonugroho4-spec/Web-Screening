package io.sentry;

/* loaded from: classes3.dex */
public enum ScopeBindingMode extends Enum<ScopeBindingMode> {
    private static final /* synthetic */ ScopeBindingMode[] $VALUES = null;
    public static final ScopeBindingMode AUTO = null;
    public static final ScopeBindingMode OFF = null;
    public static final ScopeBindingMode ON = null;

    private static /* synthetic */ ScopeBindingMode[] $values() {
        return new ScopeBindingMode[]{AUTO, ON, OFF};
    }

    static {
        AUTO = new ScopeBindingMode("AUTO", 0);
        ON = new ScopeBindingMode("ON", 1);
        OFF = new ScopeBindingMode("OFF", 2);
        $VALUES = $values();
    }

    ScopeBindingMode(String r1, int r2) {
    }

    public static ScopeBindingMode valueOf(String r1) {
        return (ScopeBindingMode) Enum.valueOf(ScopeBindingMode.class, r1);
    }

    public static ScopeBindingMode[] values() {
        return (ScopeBindingMode[]) $VALUES.clone();
    }
}
