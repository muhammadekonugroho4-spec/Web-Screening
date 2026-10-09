package androidx.compose.ui.unit;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/unit/LayoutDirection;", "", "<init>", "(Ljava/lang/String;I)V", "Ltr", "Rtl", "ui-unit"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum LayoutDirection extends Enum<LayoutDirection> {
    public static final LayoutDirection Ltr = null;
    public static final LayoutDirection Rtl = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ LayoutDirection[] f20615a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f20616b = null;

    static {
        Ltr = new LayoutDirection("Ltr", 0);
        Rtl = new LayoutDirection("Rtl", 1);
        LayoutDirection[] r02 = a();
        f20615a = r02;
        f20616b = kotlin.enums.b.a(r02);
    }

    LayoutDirection(String r1, int r2) {
    }

    public static final /* synthetic */ LayoutDirection[] a() {
        return new LayoutDirection[]{Ltr, Rtl};
    }

    public static kotlin.enums.a getEntries() {
        return f20616b;
    }

    public static LayoutDirection valueOf(String r1) {
        return (LayoutDirection) Enum.valueOf(LayoutDirection.class, r1);
    }

    public static LayoutDirection[] values() {
        return (LayoutDirection[]) f20615a.clone();
    }
}
