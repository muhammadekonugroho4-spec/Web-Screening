package io.sentry.hints;

/* loaded from: classes3.dex */
public enum EventDropReason extends Enum<EventDropReason> {
    private static final /* synthetic */ EventDropReason[] $VALUES = null;
    public static final EventDropReason MULTITHREADED_DEDUPLICATION = null;

    private static /* synthetic */ EventDropReason[] $values() {
        return new EventDropReason[]{MULTITHREADED_DEDUPLICATION};
    }

    static {
        MULTITHREADED_DEDUPLICATION = new EventDropReason("MULTITHREADED_DEDUPLICATION", 0);
        $VALUES = $values();
    }

    EventDropReason(String r1, int r2) {
    }

    public static EventDropReason valueOf(String r1) {
        return (EventDropReason) Enum.valueOf(EventDropReason.class, r1);
    }

    public static EventDropReason[] values() {
        return (EventDropReason[]) $VALUES.clone();
    }
}
