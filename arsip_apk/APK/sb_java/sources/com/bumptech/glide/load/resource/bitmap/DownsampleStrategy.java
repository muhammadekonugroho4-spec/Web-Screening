package com.bumptech.glide.load.resource.bitmap;

/* loaded from: classes4.dex */
public abstract class DownsampleStrategy {

    /* renamed from: a, reason: collision with root package name */
    public static final DownsampleStrategy f33036a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final DownsampleStrategy f33037b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final DownsampleStrategy f33038c = null;
    public static final DownsampleStrategy d = null;

    /* renamed from: e, reason: collision with root package name */
    public static final DownsampleStrategy f33039e = null;

    /* renamed from: f, reason: collision with root package name */
    public static final DownsampleStrategy f33040f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final DownsampleStrategy f33041g = null;

    /* renamed from: h, reason: collision with root package name */
    public static final com.bumptech.glide.load.e f33042h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f33043i = false;

    public enum SampleSizeRounding extends Enum<SampleSizeRounding> {
        public static final SampleSizeRounding MEMORY = null;
        public static final SampleSizeRounding QUALITY = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ SampleSizeRounding[] f33044a = null;

        static {
            SampleSizeRounding r02 = new SampleSizeRounding("MEMORY", 0);
            MEMORY = r02;
            SampleSizeRounding r1 = new SampleSizeRounding("QUALITY", 1);
            QUALITY = r1;
            f33044a = new SampleSizeRounding[]{r02, r1};
        }

        SampleSizeRounding(String r1, int r2) {
        }

        public static SampleSizeRounding valueOf(String r1) {
            return (SampleSizeRounding) Enum.valueOf(SampleSizeRounding.class, r1);
        }

        public static SampleSizeRounding[] values() {
            return (SampleSizeRounding[]) f33044a.clone();
        }
    }

    public static class a extends DownsampleStrategy {
        public a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int r1, int r2, int r3, int r4) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int r1, int r2, int r3, int r4) {
            if (Math.min(r2 / r4, r1 / r3) != 0) goto L6;
            return 1.0f;
        L6:
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    public static class b extends DownsampleStrategy {
        public b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int r1, int r2, int r3, int r4) {
            return SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int r1, int r2, int r3, int r4) {
            int r12 = (int) Math.ceil(Math.max(r2 / r4, r1 / r3));
            int r32 = 1;
            if (Math.max(1, Integer.highestOneBit(r12)) < r12) goto L7;
            r32 = 0;
        L7:
            return 1.0f / (r2 << r32);
        }
    }

    public static class c extends DownsampleStrategy {
        public c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int r3, int r4, int r5, int r6) {
            if (b(r3, r4, r5, r6) != 1.0f) goto L7;
            return SampleSizeRounding.QUALITY;
        L7:
            return DownsampleStrategy.f33038c.a(r3, r4, r5, r6);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int r2, int r3, int r4, int r5) {
            return Math.min(1.0f, DownsampleStrategy.f33038c.b(r2, r3, r4, r5));
        }
    }

    public static class d extends DownsampleStrategy {
        public d() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int r1, int r2, int r3, int r4) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int r1, int r2, int r3, int r4) {
            return Math.max(r3 / r1, r4 / r2);
        }
    }

    public static class e extends DownsampleStrategy {
        public e() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int r1, int r2, int r3, int r4) {
            if (DownsampleStrategy.f33043i == false) goto L7;
            return SampleSizeRounding.QUALITY;
        L7:
            return SampleSizeRounding.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int r2, int r3, int r4, int r5) {
            if (DownsampleStrategy.f33043i == false) goto L7;
            return Math.min(r4 / r2, r5 / r3);
        L7:
            if (Math.max(r3 / r5, r2 / r4) != 0) goto L10;
            return 1.0f;
        L10:
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    public static class f extends DownsampleStrategy {
        public f() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public SampleSizeRounding a(int r1, int r2, int r3, int r4) {
            return SampleSizeRounding.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DownsampleStrategy
        public float b(int r1, int r2, int r3, int r4) {
            return 1.0f;
        }
    }

    static {
        f33036a = new a();
        f33037b = new b();
        f33038c = new e();
        d = new c();
        d r02 = new d();
        f33039e = r02;
        f33040f = new f();
        f33041g = r02;
        f33042h = com.bumptech.glide.load.e.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", r02);
        f33043i = true;
    }

    public DownsampleStrategy() {
    }

    public abstract SampleSizeRounding a(int r1, int r2, int r3, int r4);

    public abstract float b(int r1, int r2, int r3, int r4);
}
