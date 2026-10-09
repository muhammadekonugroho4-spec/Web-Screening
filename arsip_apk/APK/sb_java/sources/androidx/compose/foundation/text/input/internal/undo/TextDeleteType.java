package androidx.compose.foundation.text.input.internal.undo;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextDeleteType;", "", "<init>", "(Ljava/lang/String;I)V", "Start", "End", "Inner", "NotByUser", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum TextDeleteType extends Enum<TextDeleteType> {
    public static final TextDeleteType End = null;
    public static final TextDeleteType Inner = null;
    public static final TextDeleteType NotByUser = null;
    public static final TextDeleteType Start = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TextDeleteType[] f10505a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f10506b = null;

    static {
        Start = new TextDeleteType("Start", 0);
        End = new TextDeleteType("End", 1);
        Inner = new TextDeleteType("Inner", 2);
        NotByUser = new TextDeleteType("NotByUser", 3);
        TextDeleteType[] r02 = a();
        f10505a = r02;
        f10506b = kotlin.enums.b.a(r02);
    }

    TextDeleteType(String r1, int r2) {
    }

    public static final /* synthetic */ TextDeleteType[] a() {
        return new TextDeleteType[]{Start, End, Inner, NotByUser};
    }

    public static kotlin.enums.a getEntries() {
        return f10506b;
    }

    public static TextDeleteType valueOf(String r1) {
        return (TextDeleteType) Enum.valueOf(TextDeleteType.class, r1);
    }

    public static TextDeleteType[] values() {
        return (TextDeleteType[]) f10505a.clone();
    }
}
