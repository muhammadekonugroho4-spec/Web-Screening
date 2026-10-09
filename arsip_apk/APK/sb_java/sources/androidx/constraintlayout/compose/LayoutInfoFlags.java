package androidx.constraintlayout.compose;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/constraintlayout/compose/LayoutInfoFlags;", "", "(Ljava/lang/String;I)V", "NONE", "BOUNDS", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public enum LayoutInfoFlags extends Enum<LayoutInfoFlags> {
    public static final LayoutInfoFlags BOUNDS = null;
    public static final LayoutInfoFlags NONE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ LayoutInfoFlags[] f20887a = null;

    static {
        NONE = new LayoutInfoFlags("NONE", 0);
        BOUNDS = new LayoutInfoFlags("BOUNDS", 1);
        f20887a = a();
    }

    LayoutInfoFlags(String r1, int r2) {
    }

    public static final /* synthetic */ LayoutInfoFlags[] a() {
        return new LayoutInfoFlags[]{NONE, BOUNDS};
    }

    public static LayoutInfoFlags valueOf(String r1) {
        return (LayoutInfoFlags) Enum.valueOf(LayoutInfoFlags.class, r1);
    }

    public static LayoutInfoFlags[] values() {
        return (LayoutInfoFlags[]) f20887a.clone();
    }
}
