package androidx.compose.foundation.text.input.internal.undo;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;", "", "<init>", "(Ljava/lang/String;I)V", "MergeIfPossible", "ClearHistory", "NeverMerge", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum TextFieldEditUndoBehavior extends Enum<TextFieldEditUndoBehavior> {
    public static final TextFieldEditUndoBehavior ClearHistory = null;
    public static final TextFieldEditUndoBehavior MergeIfPossible = null;
    public static final TextFieldEditUndoBehavior NeverMerge = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TextFieldEditUndoBehavior[] f10509a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f10510b = null;

    static {
        MergeIfPossible = new TextFieldEditUndoBehavior("MergeIfPossible", 0);
        ClearHistory = new TextFieldEditUndoBehavior("ClearHistory", 1);
        NeverMerge = new TextFieldEditUndoBehavior("NeverMerge", 2);
        TextFieldEditUndoBehavior[] r02 = a();
        f10509a = r02;
        f10510b = kotlin.enums.b.a(r02);
    }

    TextFieldEditUndoBehavior(String r1, int r2) {
    }

    public static final /* synthetic */ TextFieldEditUndoBehavior[] a() {
        return new TextFieldEditUndoBehavior[]{MergeIfPossible, ClearHistory, NeverMerge};
    }

    public static kotlin.enums.a getEntries() {
        return f10510b;
    }

    public static TextFieldEditUndoBehavior valueOf(String r1) {
        return (TextFieldEditUndoBehavior) Enum.valueOf(TextFieldEditUndoBehavior.class, r1);
    }

    public static TextFieldEditUndoBehavior[] values() {
        return (TextFieldEditUndoBehavior[]) f10509a.clone();
    }
}
