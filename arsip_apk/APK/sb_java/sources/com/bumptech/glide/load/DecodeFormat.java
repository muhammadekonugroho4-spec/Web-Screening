package com.bumptech.glide.load;

/* loaded from: classes4.dex */
public enum DecodeFormat extends Enum<DecodeFormat> {
    public static final DecodeFormat DEFAULT = null;
    public static final DecodeFormat PREFER_ARGB_8888 = null;
    public static final DecodeFormat PREFER_RGB_565 = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ DecodeFormat[] f32553a = null;

    static {
        DecodeFormat r02 = new DecodeFormat("PREFER_ARGB_8888", 0);
        PREFER_ARGB_8888 = r02;
        DecodeFormat r1 = new DecodeFormat("PREFER_RGB_565", 1);
        PREFER_RGB_565 = r1;
        f32553a = new DecodeFormat[]{r02, r1};
        DEFAULT = r02;
    }

    DecodeFormat(String r1, int r2) {
    }

    public static DecodeFormat valueOf(String r1) {
        return (DecodeFormat) Enum.valueOf(DecodeFormat.class, r1);
    }

    public static DecodeFormat[] values() {
        return (DecodeFormat[]) f32553a.clone();
    }
}
