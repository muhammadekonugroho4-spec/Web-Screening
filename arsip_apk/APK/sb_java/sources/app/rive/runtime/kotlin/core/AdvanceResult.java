package app.rive.runtime.kotlin.core;

import kotlin.Metadata;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lapp/rive/runtime/kotlin/core/AdvanceResult;", "", "(Ljava/lang/String;I)V", "ADVANCED", "ONESHOT", "LOOP", "PINGPONG", "NONE", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum AdvanceResult extends Enum<AdvanceResult> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ AdvanceResult[] $VALUES = null;
    public static final AdvanceResult ADVANCED = null;
    public static final AdvanceResult LOOP = null;
    public static final AdvanceResult NONE = null;
    public static final AdvanceResult ONESHOT = null;
    public static final AdvanceResult PINGPONG = null;

    private static final /* synthetic */ AdvanceResult[] $values() {
        return new AdvanceResult[]{ADVANCED, ONESHOT, LOOP, PINGPONG, NONE};
    }

    static {
        ADVANCED = new AdvanceResult("ADVANCED", 0);
        ONESHOT = new AdvanceResult("ONESHOT", 1);
        LOOP = new AdvanceResult("LOOP", 2);
        PINGPONG = new AdvanceResult("PINGPONG", 3);
        NONE = new AdvanceResult("NONE", 4);
        AdvanceResult[] r02 = $values();
        $VALUES = r02;
        $ENTRIES = b.a(r02);
    }

    AdvanceResult(String r1, int r2) {
    }

    public static kotlin.enums.a getEntries() {
        return $ENTRIES;
    }

    public static AdvanceResult valueOf(String r1) {
        return (AdvanceResult) Enum.valueOf(AdvanceResult.class, r1);
    }

    public static AdvanceResult[] values() {
        return (AdvanceResult[]) $VALUES.clone();
    }
}
