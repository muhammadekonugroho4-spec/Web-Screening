package androidx.compose.material3.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/internal/TextFieldType;", "", "<init>", "(Ljava/lang/String;I)V", "Filled", "Outlined", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum TextFieldType extends Enum<TextFieldType> {
    public static final TextFieldType Filled = null;
    public static final TextFieldType Outlined = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TextFieldType[] f13725a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f13726b = null;

    static {
        Filled = new TextFieldType("Filled", 0);
        Outlined = new TextFieldType("Outlined", 1);
        TextFieldType[] r02 = a();
        f13725a = r02;
        f13726b = kotlin.enums.b.a(r02);
    }

    TextFieldType(String r1, int r2) {
    }

    public static final /* synthetic */ TextFieldType[] a() {
        return new TextFieldType[]{Filled, Outlined};
    }

    public static kotlin.enums.a getEntries() {
        return f13726b;
    }

    public static TextFieldType valueOf(String r1) {
        return (TextFieldType) Enum.valueOf(TextFieldType.class, r1);
    }

    public static TextFieldType[] values() {
        return (TextFieldType[]) f13725a.clone();
    }
}
