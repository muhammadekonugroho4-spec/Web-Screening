package androidx.compose.ui.text.style;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/text/style/ResolvedTextDirection;", "", "<init>", "(Ljava/lang/String;I)V", "Ltr", "Rtl", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum ResolvedTextDirection extends Enum<ResolvedTextDirection> {
    public static final ResolvedTextDirection Ltr = null;
    public static final ResolvedTextDirection Rtl = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ResolvedTextDirection[] f20242a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f20243b = null;

    static {
        Ltr = new ResolvedTextDirection("Ltr", 0);
        Rtl = new ResolvedTextDirection("Rtl", 1);
        ResolvedTextDirection[] r02 = a();
        f20242a = r02;
        f20243b = kotlin.enums.b.a(r02);
    }

    ResolvedTextDirection(String r1, int r2) {
    }

    public static final /* synthetic */ ResolvedTextDirection[] a() {
        return new ResolvedTextDirection[]{Ltr, Rtl};
    }

    public static kotlin.enums.a getEntries() {
        return f20243b;
    }

    public static ResolvedTextDirection valueOf(String r1) {
        return (ResolvedTextDirection) Enum.valueOf(ResolvedTextDirection.class, r1);
    }

    public static ResolvedTextDirection[] values() {
        return (ResolvedTextDirection[]) f20242a.clone();
    }
}
