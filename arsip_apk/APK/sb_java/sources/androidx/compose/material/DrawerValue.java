package androidx.compose.material;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/material/DrawerValue;", "", "<init>", "(Ljava/lang/String;I)V", "Closed", "Open", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum DrawerValue extends Enum<DrawerValue> {
    public static final DrawerValue Closed = null;
    public static final DrawerValue Open = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DrawerValue[] f11224a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f11225b = null;

    static {
        Closed = new DrawerValue("Closed", 0);
        Open = new DrawerValue("Open", 1);
        DrawerValue[] r02 = a();
        f11224a = r02;
        f11225b = kotlin.enums.b.a(r02);
    }

    DrawerValue(String r1, int r2) {
    }

    public static final /* synthetic */ DrawerValue[] a() {
        return new DrawerValue[]{Closed, Open};
    }

    public static kotlin.enums.a getEntries() {
        return f11225b;
    }

    public static DrawerValue valueOf(String r1) {
        return (DrawerValue) Enum.valueOf(DrawerValue.class, r1);
    }

    public static DrawerValue[] values() {
        return (DrawerValue[]) f11224a.clone();
    }
}
