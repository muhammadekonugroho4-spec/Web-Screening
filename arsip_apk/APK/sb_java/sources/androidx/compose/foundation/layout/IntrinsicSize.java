package androidx.compose.foundation.layout;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicSize;", "", "<init>", "(Ljava/lang/String;I)V", "Min", "Max", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public enum IntrinsicSize extends Enum<IntrinsicSize> {
    public static final IntrinsicSize Max = null;
    public static final IntrinsicSize Min = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ IntrinsicSize[] f7879a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f7880b = null;

    static {
        Min = new IntrinsicSize("Min", 0);
        Max = new IntrinsicSize("Max", 1);
        IntrinsicSize[] r02 = a();
        f7879a = r02;
        f7880b = kotlin.enums.b.a(r02);
    }

    IntrinsicSize(String r1, int r2) {
    }

    public static final /* synthetic */ IntrinsicSize[] a() {
        return new IntrinsicSize[]{Min, Max};
    }

    public static kotlin.enums.a getEntries() {
        return f7880b;
    }

    public static IntrinsicSize valueOf(String r1) {
        return (IntrinsicSize) Enum.valueOf(IntrinsicSize.class, r1);
    }

    public static IntrinsicSize[] values() {
        return (IntrinsicSize[]) f7879a.clone();
    }
}
