package com.bumptech.glide.load;

/* loaded from: classes4.dex */
public enum DataSource extends Enum<DataSource> {
    public static final DataSource DATA_DISK_CACHE = null;
    public static final DataSource LOCAL = null;
    public static final DataSource MEMORY_CACHE = null;
    public static final DataSource REMOTE = null;
    public static final DataSource RESOURCE_DISK_CACHE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DataSource[] f32552a = null;

    static {
        DataSource r02 = new DataSource("LOCAL", 0);
        LOCAL = r02;
        DataSource r1 = new DataSource("REMOTE", 1);
        REMOTE = r1;
        DataSource r2 = new DataSource("DATA_DISK_CACHE", 2);
        DATA_DISK_CACHE = r2;
        DataSource r3 = new DataSource("RESOURCE_DISK_CACHE", 3);
        RESOURCE_DISK_CACHE = r3;
        DataSource r4 = new DataSource("MEMORY_CACHE", 4);
        MEMORY_CACHE = r4;
        f32552a = new DataSource[]{r02, r1, r2, r3, r4};
    }

    DataSource(String r1, int r2) {
    }

    public static DataSource valueOf(String r1) {
        return (DataSource) Enum.valueOf(DataSource.class, r1);
    }

    public static DataSource[] values() {
        return (DataSource[]) f32552a.clone();
    }
}
