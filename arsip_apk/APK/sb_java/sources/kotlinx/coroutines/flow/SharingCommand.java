package kotlinx.coroutines.flow;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/flow/SharingCommand;", "", "<init>", "(Ljava/lang/String;I)V", "START", "STOP", "STOP_AND_RESET_REPLAY_CACHE", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum SharingCommand extends Enum<SharingCommand> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ SharingCommand[] $VALUES = null;
    public static final SharingCommand START = null;
    public static final SharingCommand STOP = null;
    public static final SharingCommand STOP_AND_RESET_REPLAY_CACHE = null;

    private static final /* synthetic */ SharingCommand[] $values() {
        return new SharingCommand[]{START, STOP, STOP_AND_RESET_REPLAY_CACHE};
    }

    static {
        START = new SharingCommand("START", 0);
        STOP = new SharingCommand("STOP", 1);
        STOP_AND_RESET_REPLAY_CACHE = new SharingCommand("STOP_AND_RESET_REPLAY_CACHE", 2);
        SharingCommand[] r02 = $values();
        $VALUES = r02;
        $ENTRIES = kotlin.enums.b.a(r02);
    }

    SharingCommand(String r1, int r2) {
    }

    public static kotlin.enums.a getEntries() {
        return $ENTRIES;
    }

    public static SharingCommand valueOf(String r1) {
        return (SharingCommand) Enum.valueOf(SharingCommand.class, r1);
    }

    public static SharingCommand[] values() {
        return (SharingCommand[]) $VALUES.clone();
    }
}
