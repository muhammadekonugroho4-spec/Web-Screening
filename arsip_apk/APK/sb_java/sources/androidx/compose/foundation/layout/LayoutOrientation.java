package androidx.compose.foundation.layout;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/layout/LayoutOrientation;", "", "<init>", "(Ljava/lang/String;I)V", "Horizontal", "Vertical", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum LayoutOrientation extends Enum<LayoutOrientation> {
    public static final LayoutOrientation Horizontal = null;
    public static final LayoutOrientation Vertical = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ LayoutOrientation[] f7921a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f7922b = null;

    static {
        Horizontal = new LayoutOrientation("Horizontal", 0);
        Vertical = new LayoutOrientation("Vertical", 1);
        LayoutOrientation[] r02 = a();
        f7921a = r02;
        f7922b = kotlin.enums.b.a(r02);
    }

    LayoutOrientation(String r1, int r2) {
    }

    public static final /* synthetic */ LayoutOrientation[] a() {
        return new LayoutOrientation[]{Horizontal, Vertical};
    }

    public static kotlin.enums.a getEntries() {
        return f7922b;
    }

    public static LayoutOrientation valueOf(String r1) {
        return (LayoutOrientation) Enum.valueOf(LayoutOrientation.class, r1);
    }

    public static LayoutOrientation[] values() {
        return (LayoutOrientation[]) f7921a.clone();
    }
}
