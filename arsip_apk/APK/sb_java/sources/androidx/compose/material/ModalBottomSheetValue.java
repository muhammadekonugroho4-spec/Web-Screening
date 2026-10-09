package androidx.compose.material;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/material/ModalBottomSheetValue;", "", "<init>", "(Ljava/lang/String;I)V", "Hidden", "Expanded", "HalfExpanded", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum ModalBottomSheetValue extends Enum<ModalBottomSheetValue> {
    public static final ModalBottomSheetValue Expanded = null;
    public static final ModalBottomSheetValue HalfExpanded = null;
    public static final ModalBottomSheetValue Hidden = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ModalBottomSheetValue[] f11373a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f11374b = null;

    static {
        Hidden = new ModalBottomSheetValue("Hidden", 0);
        Expanded = new ModalBottomSheetValue("Expanded", 1);
        HalfExpanded = new ModalBottomSheetValue("HalfExpanded", 2);
        ModalBottomSheetValue[] r02 = a();
        f11373a = r02;
        f11374b = kotlin.enums.b.a(r02);
    }

    ModalBottomSheetValue(String r1, int r2) {
    }

    public static final /* synthetic */ ModalBottomSheetValue[] a() {
        return new ModalBottomSheetValue[]{Hidden, Expanded, HalfExpanded};
    }

    public static kotlin.enums.a getEntries() {
        return f11374b;
    }

    public static ModalBottomSheetValue valueOf(String r1) {
        return (ModalBottomSheetValue) Enum.valueOf(ModalBottomSheetValue.class, r1);
    }

    public static ModalBottomSheetValue[] values() {
        return (ModalBottomSheetValue[]) f11373a.clone();
    }
}
