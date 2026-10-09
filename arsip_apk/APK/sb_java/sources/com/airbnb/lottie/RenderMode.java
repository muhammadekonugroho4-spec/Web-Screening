package com.airbnb.lottie;

/* loaded from: classes4.dex */
public enum RenderMode extends Enum<RenderMode> {
    public static final RenderMode AUTOMATIC = null;
    public static final RenderMode HARDWARE = null;
    public static final RenderMode SOFTWARE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ RenderMode[] f30865a = null;

    static {
        RenderMode r02 = new RenderMode("AUTOMATIC", 0);
        AUTOMATIC = r02;
        RenderMode r1 = new RenderMode("HARDWARE", 1);
        HARDWARE = r1;
        RenderMode r2 = new RenderMode("SOFTWARE", 2);
        SOFTWARE = r2;
        f30865a = new RenderMode[]{r02, r1, r2};
    }

    RenderMode(String r1, int r2) {
    }

    public static RenderMode valueOf(String r1) {
        return (RenderMode) Enum.valueOf(RenderMode.class, r1);
    }

    public static RenderMode[] values() {
        return (RenderMode[]) f30865a.clone();
    }
}
