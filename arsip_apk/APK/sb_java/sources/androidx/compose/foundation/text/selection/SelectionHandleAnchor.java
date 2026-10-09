package androidx.compose.foundation.text.selection;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionHandleAnchor;", "", "<init>", "(Ljava/lang/String;I)V", "Left", "Middle", "Right", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum SelectionHandleAnchor extends Enum<SelectionHandleAnchor> {
    public static final SelectionHandleAnchor Left = null;
    public static final SelectionHandleAnchor Middle = null;
    public static final SelectionHandleAnchor Right = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SelectionHandleAnchor[] f10863a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f10864b = null;

    static {
        Left = new SelectionHandleAnchor("Left", 0);
        Middle = new SelectionHandleAnchor("Middle", 1);
        Right = new SelectionHandleAnchor("Right", 2);
        SelectionHandleAnchor[] r02 = a();
        f10863a = r02;
        f10864b = kotlin.enums.b.a(r02);
    }

    SelectionHandleAnchor(String r1, int r2) {
    }

    public static final /* synthetic */ SelectionHandleAnchor[] a() {
        return new SelectionHandleAnchor[]{Left, Middle, Right};
    }

    public static kotlin.enums.a getEntries() {
        return f10864b;
    }

    public static SelectionHandleAnchor valueOf(String r1) {
        return (SelectionHandleAnchor) Enum.valueOf(SelectionHandleAnchor.class, r1);
    }

    public static SelectionHandleAnchor[] values() {
        return (SelectionHandleAnchor[]) f10863a.clone();
    }
}
