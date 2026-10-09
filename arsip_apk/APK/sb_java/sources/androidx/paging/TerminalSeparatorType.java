package androidx.paging;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/TerminalSeparatorType;", "", "(Ljava/lang/String;I)V", "FULLY_COMPLETE", "SOURCE_COMPLETE", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum TerminalSeparatorType extends Enum<TerminalSeparatorType> {
    public static final TerminalSeparatorType FULLY_COMPLETE = null;
    public static final TerminalSeparatorType SOURCE_COMPLETE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TerminalSeparatorType[] f26944a = null;

    static {
        FULLY_COMPLETE = new TerminalSeparatorType("FULLY_COMPLETE", 0);
        SOURCE_COMPLETE = new TerminalSeparatorType("SOURCE_COMPLETE", 1);
        f26944a = a();
    }

    TerminalSeparatorType(String r1, int r2) {
    }

    public static final /* synthetic */ TerminalSeparatorType[] a() {
        return new TerminalSeparatorType[]{FULLY_COMPLETE, SOURCE_COMPLETE};
    }

    public static TerminalSeparatorType valueOf(String r1) {
        return (TerminalSeparatorType) Enum.valueOf(TerminalSeparatorType.class, r1);
    }

    public static TerminalSeparatorType[] values() {
        return (TerminalSeparatorType[]) f26944a.clone();
    }
}
