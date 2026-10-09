package com.bumptech.glide.load;

/* loaded from: classes4.dex */
public enum PreferredColorSpace extends Enum<PreferredColorSpace> {
    public static final PreferredColorSpace DISPLAY_P3 = null;
    public static final PreferredColorSpace SRGB = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PreferredColorSpace[] f32556a = null;

    static {
        PreferredColorSpace r02 = new PreferredColorSpace("SRGB", 0);
        SRGB = r02;
        PreferredColorSpace r1 = new PreferredColorSpace("DISPLAY_P3", 1);
        DISPLAY_P3 = r1;
        f32556a = new PreferredColorSpace[]{r02, r1};
    }

    PreferredColorSpace(String r1, int r2) {
    }

    public static PreferredColorSpace valueOf(String r1) {
        return (PreferredColorSpace) Enum.valueOf(PreferredColorSpace.class, r1);
    }

    public static PreferredColorSpace[] values() {
        return (PreferredColorSpace[]) f32556a.clone();
    }
}
