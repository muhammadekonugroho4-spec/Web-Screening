package androidx.compose.foundation.text.selection;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectedTextType;", "", "<init>", "(Ljava/lang/String;I)V", "EditableText", "StaticText", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum SelectedTextType extends Enum<SelectedTextType> {
    public static final SelectedTextType EditableText = null;
    public static final SelectedTextType StaticText = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SelectedTextType[] f10860a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f10861b = null;

    static {
        EditableText = new SelectedTextType("EditableText", 0);
        StaticText = new SelectedTextType("StaticText", 1);
        SelectedTextType[] r02 = a();
        f10860a = r02;
        f10861b = kotlin.enums.b.a(r02);
    }

    SelectedTextType(String r1, int r2) {
    }

    public static final /* synthetic */ SelectedTextType[] a() {
        return new SelectedTextType[]{EditableText, StaticText};
    }

    public static kotlin.enums.a getEntries() {
        return f10861b;
    }

    public static SelectedTextType valueOf(String r1) {
        return (SelectedTextType) Enum.valueOf(SelectedTextType.class, r1);
    }

    public static SelectedTextType[] values() {
        return (SelectedTextType[]) f10860a.clone();
    }
}
