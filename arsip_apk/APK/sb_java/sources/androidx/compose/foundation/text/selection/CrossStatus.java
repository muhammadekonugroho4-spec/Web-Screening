package androidx.compose.foundation.text.selection;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/selection/CrossStatus;", "", "<init>", "(Ljava/lang/String;I)V", "CROSSED", "NOT_CROSSED", "COLLAPSED", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum CrossStatus extends Enum<CrossStatus> {
    public static final CrossStatus COLLAPSED = null;
    public static final CrossStatus CROSSED = null;
    public static final CrossStatus NOT_CROSSED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CrossStatus[] f10803a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f10804b = null;

    static {
        CROSSED = new CrossStatus("CROSSED", 0);
        NOT_CROSSED = new CrossStatus("NOT_CROSSED", 1);
        COLLAPSED = new CrossStatus("COLLAPSED", 2);
        CrossStatus[] r02 = a();
        f10803a = r02;
        f10804b = kotlin.enums.b.a(r02);
    }

    CrossStatus(String r1, int r2) {
    }

    public static final /* synthetic */ CrossStatus[] a() {
        return new CrossStatus[]{CROSSED, NOT_CROSSED, COLLAPSED};
    }

    public static kotlin.enums.a getEntries() {
        return f10804b;
    }

    public static CrossStatus valueOf(String r1) {
        return (CrossStatus) Enum.valueOf(CrossStatus.class, r1);
    }

    public static CrossStatus[] values() {
        return (CrossStatus[]) f10803a.clone();
    }
}
