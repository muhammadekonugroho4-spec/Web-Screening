package com.koushikdutta.ion;

/* loaded from: classes6.dex */
enum ScaleMode extends Enum<ScaleMode> {
    public static final ScaleMode CenterCrop = null;
    public static final ScaleMode CenterInside = null;
    public static final ScaleMode FitCenter = null;
    public static final ScaleMode FitXY = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ScaleMode[] f41709a = null;

    static {
        ScaleMode r02 = new ScaleMode("FitXY", 0);
        FitXY = r02;
        ScaleMode r1 = new ScaleMode("CenterCrop", 1);
        CenterCrop = r1;
        ScaleMode r2 = new ScaleMode("FitCenter", 2);
        FitCenter = r2;
        ScaleMode r3 = new ScaleMode("CenterInside", 3);
        CenterInside = r3;
        f41709a = new ScaleMode[]{r02, r1, r2, r3};
    }

    ScaleMode(String r1, int r2) {
    }

    public static ScaleMode valueOf(String r1) {
        return (ScaleMode) Enum.valueOf(ScaleMode.class, r1);
    }

    public static ScaleMode[] values() {
        return (ScaleMode[]) f41709a.clone();
    }
}
