package app.rive.runtime.kotlin.renderers;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lapp/rive/runtime/kotlin/renderers/PointerEvents;", "", "(Ljava/lang/String;I)V", "POINTER_DOWN", "POINTER_UP", "POINTER_MOVE", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum PointerEvents extends Enum<PointerEvents> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ PointerEvents[] $VALUES = null;
    public static final PointerEvents POINTER_DOWN = null;
    public static final PointerEvents POINTER_MOVE = null;
    public static final PointerEvents POINTER_UP = null;

    private static final /* synthetic */ PointerEvents[] $values() {
        return new PointerEvents[]{POINTER_DOWN, POINTER_UP, POINTER_MOVE};
    }

    static {
        POINTER_DOWN = new PointerEvents("POINTER_DOWN", 0);
        POINTER_UP = new PointerEvents("POINTER_UP", 1);
        POINTER_MOVE = new PointerEvents("POINTER_MOVE", 2);
        PointerEvents[] r02 = $values();
        $VALUES = r02;
        $ENTRIES = kotlin.enums.b.a(r02);
    }

    PointerEvents(String r1, int r2) {
    }

    public static kotlin.enums.a getEntries() {
        return $ENTRIES;
    }

    public static PointerEvents valueOf(String r1) {
        return (PointerEvents) Enum.valueOf(PointerEvents.class, r1);
    }

    public static PointerEvents[] values() {
        return (PointerEvents[]) $VALUES.clone();
    }
}
