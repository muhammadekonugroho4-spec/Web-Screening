package com.bumptech.glide.load;

/* loaded from: classes4.dex */
public enum EncodeStrategy extends Enum<EncodeStrategy> {
    public static final EncodeStrategy NONE = null;
    public static final EncodeStrategy SOURCE = null;
    public static final EncodeStrategy TRANSFORMED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EncodeStrategy[] f32554a = null;

    static {
        EncodeStrategy r02 = new EncodeStrategy("SOURCE", 0);
        SOURCE = r02;
        EncodeStrategy r1 = new EncodeStrategy("TRANSFORMED", 1);
        TRANSFORMED = r1;
        EncodeStrategy r2 = new EncodeStrategy("NONE", 2);
        NONE = r2;
        f32554a = new EncodeStrategy[]{r02, r1, r2};
    }

    EncodeStrategy(String r1, int r2) {
    }

    public static EncodeStrategy valueOf(String r1) {
        return (EncodeStrategy) Enum.valueOf(EncodeStrategy.class, r1);
    }

    public static EncodeStrategy[] values() {
        return (EncodeStrategy[]) f32554a.clone();
    }
}
