package androidx.compose.foundation.text.input.internal.undo;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextEditType;", "", "<init>", "(Ljava/lang/String;I)V", "Insert", "Delete", "Replace", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum TextEditType extends Enum<TextEditType> {
    public static final TextEditType Delete = null;
    public static final TextEditType Insert = null;
    public static final TextEditType Replace = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TextEditType[] f10507a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f10508b = null;

    static {
        Insert = new TextEditType("Insert", 0);
        Delete = new TextEditType("Delete", 1);
        Replace = new TextEditType("Replace", 2);
        TextEditType[] r02 = a();
        f10507a = r02;
        f10508b = kotlin.enums.b.a(r02);
    }

    TextEditType(String r1, int r2) {
    }

    public static final /* synthetic */ TextEditType[] a() {
        return new TextEditType[]{Insert, Delete, Replace};
    }

    public static kotlin.enums.a getEntries() {
        return f10508b;
    }

    public static TextEditType valueOf(String r1) {
        return (TextEditType) Enum.valueOf(TextEditType.class, r1);
    }

    public static TextEditType[] values() {
        return (TextEditType[]) f10507a.clone();
    }
}
