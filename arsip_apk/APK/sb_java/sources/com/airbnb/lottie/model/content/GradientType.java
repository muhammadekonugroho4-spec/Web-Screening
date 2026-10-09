package com.airbnb.lottie.model.content;

/* loaded from: classes4.dex */
public enum GradientType extends Enum<GradientType> {
    public static final GradientType LINEAR = null;
    public static final GradientType RADIAL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ GradientType[] f31269a = null;

    static {
        GradientType r02 = new GradientType("LINEAR", 0);
        LINEAR = r02;
        GradientType r1 = new GradientType("RADIAL", 1);
        RADIAL = r1;
        f31269a = new GradientType[]{r02, r1};
    }

    GradientType(String r1, int r2) {
    }

    public static GradientType valueOf(String r1) {
        return (GradientType) Enum.valueOf(GradientType.class, r1);
    }

    public static GradientType[] values() {
        return (GradientType[]) f31269a.clone();
    }
}
