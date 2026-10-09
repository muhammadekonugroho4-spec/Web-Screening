package androidx.compose.runtime;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/runtime/PausedCompositionState;", "", "<init>", "(Ljava/lang/String;I)V", "Invalid", "Cancelled", "InitialPending", "RecomposePending", "Recomposing", "ApplyPending", "Applied", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum PausedCompositionState extends Enum<PausedCompositionState> {
    public static final PausedCompositionState Applied = null;
    public static final PausedCompositionState ApplyPending = null;
    public static final PausedCompositionState Cancelled = null;
    public static final PausedCompositionState InitialPending = null;
    public static final PausedCompositionState Invalid = null;
    public static final PausedCompositionState RecomposePending = null;
    public static final PausedCompositionState Recomposing = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PausedCompositionState[] f15986a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f15987b = null;

    static {
        Invalid = new PausedCompositionState("Invalid", 0);
        Cancelled = new PausedCompositionState("Cancelled", 1);
        InitialPending = new PausedCompositionState("InitialPending", 2);
        RecomposePending = new PausedCompositionState("RecomposePending", 3);
        Recomposing = new PausedCompositionState("Recomposing", 4);
        ApplyPending = new PausedCompositionState("ApplyPending", 5);
        Applied = new PausedCompositionState("Applied", 6);
        PausedCompositionState[] r02 = a();
        f15986a = r02;
        f15987b = kotlin.enums.b.a(r02);
    }

    PausedCompositionState(String r1, int r2) {
    }

    public static final /* synthetic */ PausedCompositionState[] a() {
        return new PausedCompositionState[]{Invalid, Cancelled, InitialPending, RecomposePending, Recomposing, ApplyPending, Applied};
    }

    public static kotlin.enums.a getEntries() {
        return f15987b;
    }

    public static PausedCompositionState valueOf(String r1) {
        return (PausedCompositionState) Enum.valueOf(PausedCompositionState.class, r1);
    }

    public static PausedCompositionState[] values() {
        return (PausedCompositionState[]) f15986a.clone();
    }
}
