package com.airbnb.lottie.model.content;

/* loaded from: classes4.dex */
public class Mask {

    /* renamed from: a, reason: collision with root package name */
    public final MaskMode f31270a;

    /* renamed from: b, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.h f31271b;

    /* renamed from: c, reason: collision with root package name */
    public final com.airbnb.lottie.model.animatable.d f31272c;
    public final boolean d;

    public enum MaskMode extends Enum<MaskMode> {
        public static final MaskMode MASK_MODE_ADD = null;
        public static final MaskMode MASK_MODE_INTERSECT = null;
        public static final MaskMode MASK_MODE_NONE = null;
        public static final MaskMode MASK_MODE_SUBTRACT = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ MaskMode[] f31273a = null;

        static {
            MaskMode r02 = new MaskMode("MASK_MODE_ADD", 0);
            MASK_MODE_ADD = r02;
            MaskMode r1 = new MaskMode("MASK_MODE_SUBTRACT", 1);
            MASK_MODE_SUBTRACT = r1;
            MaskMode r2 = new MaskMode("MASK_MODE_INTERSECT", 2);
            MASK_MODE_INTERSECT = r2;
            MaskMode r3 = new MaskMode("MASK_MODE_NONE", 3);
            MASK_MODE_NONE = r3;
            f31273a = new MaskMode[]{r02, r1, r2, r3};
        }

        MaskMode(String r1, int r2) {
        }

        public static MaskMode valueOf(String r1) {
            return (MaskMode) Enum.valueOf(MaskMode.class, r1);
        }

        public static MaskMode[] values() {
            return (MaskMode[]) f31273a.clone();
        }
    }

    public Mask(MaskMode r1, com.airbnb.lottie.model.animatable.h r2, com.airbnb.lottie.model.animatable.d r3, boolean r4) {
        this.f31270a = r1;
        this.f31271b = r2;
        this.f31272c = r3;
        this.d = r4;
    }

    public MaskMode a() {
        return this.f31270a;
    }

    public com.airbnb.lottie.model.animatable.h b() {
        return this.f31271b;
    }

    public com.airbnb.lottie.model.animatable.d c() {
        return this.f31272c;
    }

    public boolean d() {
        return this.d;
    }
}
