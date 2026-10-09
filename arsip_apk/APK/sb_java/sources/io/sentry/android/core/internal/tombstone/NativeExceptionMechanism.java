package io.sentry.android.core.internal.tombstone;

/* loaded from: classes3.dex */
public enum NativeExceptionMechanism extends Enum<NativeExceptionMechanism> {
    private static final /* synthetic */ NativeExceptionMechanism[] $VALUES = null;
    public static final NativeExceptionMechanism SIGNAL_HANDLER = null;
    public static final NativeExceptionMechanism TOMBSTONE = null;
    public static final NativeExceptionMechanism TOMBSTONE_MERGED = null;
    private final String value;

    private static /* synthetic */ NativeExceptionMechanism[] $values() {
        return new NativeExceptionMechanism[]{TOMBSTONE, SIGNAL_HANDLER, TOMBSTONE_MERGED};
    }

    static {
        TOMBSTONE = new NativeExceptionMechanism("TOMBSTONE", 0, "Tombstone");
        SIGNAL_HANDLER = new NativeExceptionMechanism("SIGNAL_HANDLER", 1, "signalhandler");
        TOMBSTONE_MERGED = new NativeExceptionMechanism("TOMBSTONE_MERGED", 2, "TombstoneMerged");
        $VALUES = $values();
    }

    NativeExceptionMechanism(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static NativeExceptionMechanism valueOf(String r1) {
        return (NativeExceptionMechanism) Enum.valueOf(NativeExceptionMechanism.class, r1);
    }

    public static NativeExceptionMechanism[] values() {
        return (NativeExceptionMechanism[]) $VALUES.clone();
    }

    public String getValue() {
        return this.value;
    }
}
