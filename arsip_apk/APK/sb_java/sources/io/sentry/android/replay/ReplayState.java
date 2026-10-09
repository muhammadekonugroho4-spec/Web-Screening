package io.sentry.android.replay;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lio/sentry/android/replay/ReplayState;", "", "(Ljava/lang/String;I)V", "INITIAL", "STARTED", "RESUMED", "PAUSED", "STOPPED", "CLOSED", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum ReplayState extends Enum<ReplayState> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ ReplayState[] $VALUES = null;
    public static final ReplayState CLOSED = null;
    public static final ReplayState INITIAL = null;
    public static final ReplayState PAUSED = null;
    public static final ReplayState RESUMED = null;
    public static final ReplayState STARTED = null;
    public static final ReplayState STOPPED = null;

    private static final /* synthetic */ ReplayState[] $values() {
        return new ReplayState[]{INITIAL, STARTED, RESUMED, PAUSED, STOPPED, CLOSED};
    }

    static {
        INITIAL = new ReplayState("INITIAL", 0);
        STARTED = new ReplayState("STARTED", 1);
        RESUMED = new ReplayState("RESUMED", 2);
        PAUSED = new ReplayState("PAUSED", 3);
        STOPPED = new ReplayState("STOPPED", 4);
        CLOSED = new ReplayState("CLOSED", 5);
        ReplayState[] r02 = $values();
        $VALUES = r02;
        $ENTRIES = kotlin.enums.b.a(r02);
    }

    ReplayState(String r1, int r2) {
    }

    public static kotlin.enums.a getEntries() {
        return $ENTRIES;
    }

    public static ReplayState valueOf(String r1) {
        return (ReplayState) Enum.valueOf(ReplayState.class, r1);
    }

    public static ReplayState[] values() {
        return (ReplayState[]) $VALUES.clone();
    }
}
