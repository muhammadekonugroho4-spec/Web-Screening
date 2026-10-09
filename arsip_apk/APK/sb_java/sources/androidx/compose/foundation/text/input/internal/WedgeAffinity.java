package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "", "<init>", "(Ljava/lang/String;I)V", "Start", "End", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum WedgeAffinity extends Enum<WedgeAffinity> {
    public static final WedgeAffinity End = null;
    public static final WedgeAffinity Start = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ WedgeAffinity[] f10245a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f10246b = null;

    static {
        Start = new WedgeAffinity("Start", 0);
        End = new WedgeAffinity("End", 1);
        WedgeAffinity[] r02 = a();
        f10245a = r02;
        f10246b = kotlin.enums.b.a(r02);
    }

    WedgeAffinity(String r1, int r2) {
    }

    public static final /* synthetic */ WedgeAffinity[] a() {
        return new WedgeAffinity[]{Start, End};
    }

    public static kotlin.enums.a getEntries() {
        return f10246b;
    }

    public static WedgeAffinity valueOf(String r1) {
        return (WedgeAffinity) Enum.valueOf(WedgeAffinity.class, r1);
    }

    public static WedgeAffinity[] values() {
        return (WedgeAffinity[]) f10245a.clone();
    }
}
