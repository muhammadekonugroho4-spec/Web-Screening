package androidx.compose.foundation.text.selection;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/text/selection/DownResolution;", "", "<init>", "(Ljava/lang/String;I)V", "Up", "Drag", "Timeout", "Cancel", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
enum DownResolution extends Enum<DownResolution> {
    public static final DownResolution Cancel = null;
    public static final DownResolution Drag = null;
    public static final DownResolution Timeout = null;
    public static final DownResolution Up = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DownResolution[] f10806a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f10807b = null;

    static {
        Up = new DownResolution("Up", 0);
        Drag = new DownResolution("Drag", 1);
        Timeout = new DownResolution("Timeout", 2);
        Cancel = new DownResolution("Cancel", 3);
        DownResolution[] r02 = a();
        f10806a = r02;
        f10807b = kotlin.enums.b.a(r02);
    }

    DownResolution(String r1, int r2) {
    }

    public static final /* synthetic */ DownResolution[] a() {
        return new DownResolution[]{Up, Drag, Timeout, Cancel};
    }

    public static kotlin.enums.a getEntries() {
        return f10807b;
    }

    public static DownResolution valueOf(String r1) {
        return (DownResolution) Enum.valueOf(DownResolution.class, r1);
    }

    public static DownResolution[] values() {
        return (DownResolution[]) f10806a.clone();
    }
}
