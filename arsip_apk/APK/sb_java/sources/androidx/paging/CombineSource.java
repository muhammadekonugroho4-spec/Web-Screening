package androidx.paging;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/paging/CombineSource;", "", "(Ljava/lang/String;I)V", "INITIAL", "RECEIVER", "OTHER", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum CombineSource extends Enum<CombineSource> {
    public static final CombineSource INITIAL = null;
    public static final CombineSource OTHER = null;
    public static final CombineSource RECEIVER = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CombineSource[] f26620a = null;

    static {
        INITIAL = new CombineSource("INITIAL", 0);
        RECEIVER = new CombineSource("RECEIVER", 1);
        OTHER = new CombineSource("OTHER", 2);
        f26620a = a();
    }

    CombineSource(String r1, int r2) {
    }

    public static final /* synthetic */ CombineSource[] a() {
        return new CombineSource[]{INITIAL, RECEIVER, OTHER};
    }

    public static CombineSource valueOf(String r1) {
        return (CombineSource) Enum.valueOf(CombineSource.class, r1);
    }

    public static CombineSource[] values() {
        return (CombineSource[]) f26620a.clone();
    }
}
