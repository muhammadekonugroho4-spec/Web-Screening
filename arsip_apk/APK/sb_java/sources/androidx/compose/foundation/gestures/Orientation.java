package androidx.compose.foundation.gestures;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/gestures/Orientation;", "", "<init>", "(Ljava/lang/String;I)V", "Vertical", "Horizontal", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum Orientation extends Enum<Orientation> {
    public static final Orientation Horizontal = null;
    public static final Orientation Vertical = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Orientation[] f7586a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f7587b = null;

    static {
        Vertical = new Orientation("Vertical", 0);
        Horizontal = new Orientation("Horizontal", 1);
        Orientation[] r02 = a();
        f7586a = r02;
        f7587b = kotlin.enums.b.a(r02);
    }

    Orientation(String r1, int r2) {
    }

    public static final /* synthetic */ Orientation[] a() {
        return new Orientation[]{Vertical, Horizontal};
    }

    public static kotlin.enums.a getEntries() {
        return f7587b;
    }

    public static Orientation valueOf(String r1) {
        return (Orientation) Enum.valueOf(Orientation.class, r1);
    }

    public static Orientation[] values() {
        return (Orientation[]) f7586a.clone();
    }
}
