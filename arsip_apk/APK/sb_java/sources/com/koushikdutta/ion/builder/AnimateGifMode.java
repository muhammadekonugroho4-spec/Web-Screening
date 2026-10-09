package com.koushikdutta.ion.builder;

/* loaded from: classes6.dex */
public enum AnimateGifMode extends Enum<AnimateGifMode> {
    public static final AnimateGifMode ANIMATE = null;
    public static final AnimateGifMode ANIMATE_ONCE = null;
    public static final AnimateGifMode NO_ANIMATE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AnimateGifMode[] f41750a = null;

    static {
        AnimateGifMode r02 = new AnimateGifMode("NO_ANIMATE", 0);
        NO_ANIMATE = r02;
        AnimateGifMode r1 = new AnimateGifMode("ANIMATE", 1);
        ANIMATE = r1;
        AnimateGifMode r2 = new AnimateGifMode("ANIMATE_ONCE", 2);
        ANIMATE_ONCE = r2;
        f41750a = new AnimateGifMode[]{r02, r1, r2};
    }

    AnimateGifMode(String r1, int r2) {
    }

    public static AnimateGifMode valueOf(String r1) {
        return (AnimateGifMode) Enum.valueOf(AnimateGifMode.class, r1);
    }

    public static AnimateGifMode[] values() {
        return (AnimateGifMode[]) f41750a.clone();
    }
}
