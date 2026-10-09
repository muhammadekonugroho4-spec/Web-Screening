package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlinx.coroutines.ObsoleteCoroutinesApi;

@ObsoleteCoroutinesApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/channels/TickerMode;", "", "<init>", "(Ljava/lang/String;I)V", "FIXED_PERIOD", "FIXED_DELAY", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public enum TickerMode extends Enum<TickerMode> {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
    private static final /* synthetic */ TickerMode[] $VALUES = null;
    public static final TickerMode FIXED_DELAY = null;
    public static final TickerMode FIXED_PERIOD = null;

    private static final /* synthetic */ TickerMode[] $values() {
        return new TickerMode[]{FIXED_PERIOD, FIXED_DELAY};
    }

    static {
        FIXED_PERIOD = new TickerMode("FIXED_PERIOD", 0);
        FIXED_DELAY = new TickerMode("FIXED_DELAY", 1);
        TickerMode[] r02 = $values();
        $VALUES = r02;
        $ENTRIES = kotlin.enums.b.a(r02);
    }

    TickerMode(String r1, int r2) {
    }

    public static kotlin.enums.a getEntries() {
        return $ENTRIES;
    }

    public static TickerMode valueOf(String r1) {
        return (TickerMode) Enum.valueOf(TickerMode.class, r1);
    }

    public static TickerMode[] values() {
        return (TickerMode[]) $VALUES.clone();
    }
}
