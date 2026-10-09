package androidx.compose.foundation.text;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/Handle;", "", "<init>", "(Ljava/lang/String;I)V", "Cursor", "SelectionStart", "SelectionEnd", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum Handle extends Enum<Handle> {
    public static final Handle Cursor = null;
    public static final Handle SelectionEnd = null;
    public static final Handle SelectionStart = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Handle[] f9398a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f9399b = null;

    static {
        Cursor = new Handle("Cursor", 0);
        SelectionStart = new Handle("SelectionStart", 1);
        SelectionEnd = new Handle("SelectionEnd", 2);
        Handle[] r02 = a();
        f9398a = r02;
        f9399b = kotlin.enums.b.a(r02);
    }

    Handle(String r1, int r2) {
    }

    public static final /* synthetic */ Handle[] a() {
        return new Handle[]{Cursor, SelectionStart, SelectionEnd};
    }

    public static kotlin.enums.a getEntries() {
        return f9399b;
    }

    public static Handle valueOf(String r1) {
        return (Handle) Enum.valueOf(Handle.class, r1);
    }

    public static Handle[] values() {
        return (Handle[]) f9398a.clone();
    }
}
