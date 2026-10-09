package androidx.compose.material;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/material/TabSlots;", "", "<init>", "(Ljava/lang/String;I)V", "Tabs", "Divider", "Indicator", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
enum TabSlots extends Enum<TabSlots> {
    public static final TabSlots Divider = null;
    public static final TabSlots Indicator = null;
    public static final TabSlots Tabs = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TabSlots[] f11510a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f11511b = null;

    static {
        Tabs = new TabSlots("Tabs", 0);
        Divider = new TabSlots("Divider", 1);
        Indicator = new TabSlots("Indicator", 2);
        TabSlots[] r02 = a();
        f11510a = r02;
        f11511b = kotlin.enums.b.a(r02);
    }

    TabSlots(String r1, int r2) {
    }

    public static final /* synthetic */ TabSlots[] a() {
        return new TabSlots[]{Tabs, Divider, Indicator};
    }

    public static kotlin.enums.a getEntries() {
        return f11511b;
    }

    public static TabSlots valueOf(String r1) {
        return (TabSlots) Enum.valueOf(TabSlots.class, r1);
    }

    public static TabSlots[] values() {
        return (TabSlots[]) f11510a.clone();
    }
}
