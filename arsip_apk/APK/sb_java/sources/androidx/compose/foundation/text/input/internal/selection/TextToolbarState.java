package androidx.compose.foundation.text.input.internal.selection;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;", "", "<init>", "(Ljava/lang/String;I)V", "None", "Cursor", "Selection", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum TextToolbarState extends Enum<TextToolbarState> {
    public static final TextToolbarState Cursor = null;
    public static final TextToolbarState None = null;
    public static final TextToolbarState Selection = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TextToolbarState[] f10439a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f10440b = null;

    static {
        None = new TextToolbarState("None", 0);
        Cursor = new TextToolbarState("Cursor", 1);
        Selection = new TextToolbarState("Selection", 2);
        TextToolbarState[] r02 = a();
        f10439a = r02;
        f10440b = kotlin.enums.b.a(r02);
    }

    TextToolbarState(String r1, int r2) {
    }

    public static final /* synthetic */ TextToolbarState[] a() {
        return new TextToolbarState[]{None, Cursor, Selection};
    }

    public static kotlin.enums.a getEntries() {
        return f10440b;
    }

    public static TextToolbarState valueOf(String r1) {
        return (TextToolbarState) Enum.valueOf(TextToolbarState.class, r1);
    }

    public static TextToolbarState[] values() {
        return (TextToolbarState[]) f10439a.clone();
    }
}
