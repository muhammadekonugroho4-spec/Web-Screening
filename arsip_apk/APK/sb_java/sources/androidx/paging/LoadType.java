package androidx.paging;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/paging/LoadType;", "", "(Ljava/lang/String;I)V", "REFRESH", "PREPEND", "APPEND", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum LoadType extends Enum<LoadType> {
    public static final LoadType APPEND = null;
    public static final LoadType PREPEND = null;
    public static final LoadType REFRESH = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ LoadType[] f26732a = null;

    static {
        REFRESH = new LoadType("REFRESH", 0);
        PREPEND = new LoadType("PREPEND", 1);
        APPEND = new LoadType("APPEND", 2);
        f26732a = a();
    }

    LoadType(String r1, int r2) {
    }

    public static final /* synthetic */ LoadType[] a() {
        return new LoadType[]{REFRESH, PREPEND, APPEND};
    }

    public static LoadType valueOf(String r1) {
        return (LoadType) Enum.valueOf(LoadType.class, r1);
    }

    public static LoadType[] values() {
        return (LoadType[]) f26732a.clone();
    }
}
