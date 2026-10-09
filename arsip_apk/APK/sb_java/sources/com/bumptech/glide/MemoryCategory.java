package com.bumptech.glide;

/* loaded from: classes4.dex */
public enum MemoryCategory extends Enum<MemoryCategory> {
    public static final MemoryCategory HIGH = null;
    public static final MemoryCategory LOW = null;
    public static final MemoryCategory NORMAL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ MemoryCategory[] f32375a = null;
    private final float multiplier;

    static {
        MemoryCategory r02 = new MemoryCategory("LOW", 0, 0.5f);
        LOW = r02;
        MemoryCategory r1 = new MemoryCategory("NORMAL", 1, 1.0f);
        NORMAL = r1;
        MemoryCategory r2 = new MemoryCategory("HIGH", 2, 1.5f);
        HIGH = r2;
        f32375a = new MemoryCategory[]{r02, r1, r2};
    }

    MemoryCategory(String r1, int r2, float r3) {
        this.multiplier = r3;
    }

    public static MemoryCategory valueOf(String r1) {
        return (MemoryCategory) Enum.valueOf(MemoryCategory.class, r1);
    }

    public static MemoryCategory[] values() {
        return (MemoryCategory[]) f32375a.clone();
    }

    public float getMultiplier() {
        return this.multiplier;
    }
}
