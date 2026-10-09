package androidx.compose.material_custom;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/material_custom/SheetValue;", "", "<init>", "(Ljava/lang/String;I)V", "Hidden", "Expanded", "PartiallyExpanded", "material-custom_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public enum SheetValue extends Enum<SheetValue> {
    public static final SheetValue Expanded = null;
    public static final SheetValue Hidden = null;
    public static final SheetValue PartiallyExpanded = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SheetValue[] f15497a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f15498b = null;

    static {
        Hidden = new SheetValue("Hidden", 0);
        Expanded = new SheetValue("Expanded", 1);
        PartiallyExpanded = new SheetValue("PartiallyExpanded", 2);
        SheetValue[] r02 = a();
        f15497a = r02;
        f15498b = kotlin.enums.b.a(r02);
    }

    SheetValue(String r1, int r2) {
    }

    public static final /* synthetic */ SheetValue[] a() {
        return new SheetValue[]{Hidden, Expanded, PartiallyExpanded};
    }

    public static kotlin.enums.a getEntries() {
        return f15498b;
    }

    public static SheetValue valueOf(String r1) {
        return (SheetValue) Enum.valueOf(SheetValue.class, r1);
    }

    public static SheetValue[] values() {
        return (SheetValue[]) f15497a.clone();
    }
}
