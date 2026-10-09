package androidx.compose.foundation.text;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/HandleState;", "", "<init>", "(Ljava/lang/String;I)V", "None", "Selection", "Cursor", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum HandleState extends Enum<HandleState> {
    public static final HandleState Cursor = null;
    public static final HandleState None = null;
    public static final HandleState Selection = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ HandleState[] f9400a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f9401b = null;

    static {
        None = new HandleState("None", 0);
        Selection = new HandleState("Selection", 1);
        Cursor = new HandleState("Cursor", 2);
        HandleState[] r02 = a();
        f9400a = r02;
        f9401b = kotlin.enums.b.a(r02);
    }

    HandleState(String r1, int r2) {
    }

    public static final /* synthetic */ HandleState[] a() {
        return new HandleState[]{None, Selection, Cursor};
    }

    public static kotlin.enums.a getEntries() {
        return f9401b;
    }

    public static HandleState valueOf(String r1) {
        return (HandleState) Enum.valueOf(HandleState.class, r1);
    }

    public static HandleState[] values() {
        return (HandleState[]) f9400a.clone();
    }
}
