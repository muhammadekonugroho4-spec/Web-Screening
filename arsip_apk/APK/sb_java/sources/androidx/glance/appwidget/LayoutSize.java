package androidx.glance.appwidget;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/glance/appwidget/LayoutSize;", "", "(Ljava/lang/String;I)V", "Wrap", "Fixed", "Expand", "MatchParent", "glance-appwidget_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum LayoutSize extends Enum<LayoutSize> {
    public static final LayoutSize Expand = null;
    public static final LayoutSize Fixed = null;
    public static final LayoutSize MatchParent = null;
    public static final LayoutSize Wrap = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ LayoutSize[] f24843a = null;

    static {
        Wrap = new LayoutSize("Wrap", 0);
        Fixed = new LayoutSize("Fixed", 1);
        Expand = new LayoutSize("Expand", 2);
        MatchParent = new LayoutSize("MatchParent", 3);
        f24843a = a();
    }

    LayoutSize(String r1, int r2) {
    }

    public static final /* synthetic */ LayoutSize[] a() {
        return new LayoutSize[]{Wrap, Fixed, Expand, MatchParent};
    }

    public static LayoutSize valueOf(String r1) {
        return (LayoutSize) Enum.valueOf(LayoutSize.class, r1);
    }

    public static LayoutSize[] values() {
        return (LayoutSize[]) f24843a.clone();
    }
}
