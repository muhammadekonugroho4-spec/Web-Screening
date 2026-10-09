package coil.decode;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcoil/decode/DataSource;", "", "(Ljava/lang/String;I)V", "MEMORY_CACHE", "MEMORY", "DISK", "NETWORK", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum DataSource extends Enum<DataSource> {
    public static final DataSource DISK = null;
    public static final DataSource MEMORY = null;
    public static final DataSource MEMORY_CACHE = null;
    public static final DataSource NETWORK = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DataSource[] f29906a = null;

    static {
        MEMORY_CACHE = new DataSource("MEMORY_CACHE", 0);
        MEMORY = new DataSource("MEMORY", 1);
        DISK = new DataSource("DISK", 2);
        NETWORK = new DataSource("NETWORK", 3);
        f29906a = a();
    }

    DataSource(String r1, int r2) {
    }

    public static final /* synthetic */ DataSource[] a() {
        return new DataSource[]{MEMORY_CACHE, MEMORY, DISK, NETWORK};
    }

    public static DataSource valueOf(String r1) {
        return (DataSource) Enum.valueOf(DataSource.class, r1);
    }

    public static DataSource[] values() {
        return (DataSource[]) f29906a.clone();
    }
}
