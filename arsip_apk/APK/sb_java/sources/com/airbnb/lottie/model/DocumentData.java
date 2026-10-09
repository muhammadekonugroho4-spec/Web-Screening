package com.airbnb.lottie.model;

/* loaded from: classes4.dex */
public class DocumentData {

    /* renamed from: a, reason: collision with root package name */
    public final String f31231a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31232b;

    /* renamed from: c, reason: collision with root package name */
    public final float f31233c;
    public final Justification d;

    /* renamed from: e, reason: collision with root package name */
    public final int f31234e;

    /* renamed from: f, reason: collision with root package name */
    public final float f31235f;

    /* renamed from: g, reason: collision with root package name */
    public final float f31236g;

    /* renamed from: h, reason: collision with root package name */
    public final int f31237h;

    /* renamed from: i, reason: collision with root package name */
    public final int f31238i;

    /* renamed from: j, reason: collision with root package name */
    public final float f31239j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f31240k;

    public enum Justification extends Enum<Justification> {
        public static final Justification CENTER = null;
        public static final Justification LEFT_ALIGN = null;
        public static final Justification RIGHT_ALIGN = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Justification[] f31241a = null;

        static {
            Justification r02 = new Justification("LEFT_ALIGN", 0);
            LEFT_ALIGN = r02;
            Justification r1 = new Justification("RIGHT_ALIGN", 1);
            RIGHT_ALIGN = r1;
            Justification r2 = new Justification("CENTER", 2);
            CENTER = r2;
            f31241a = new Justification[]{r02, r1, r2};
        }

        Justification(String r1, int r2) {
        }

        public static Justification valueOf(String r1) {
            return (Justification) Enum.valueOf(Justification.class, r1);
        }

        public static Justification[] values() {
            return (Justification[]) f31241a.clone();
        }
    }

    public DocumentData(String r1, String r2, float r3, Justification r4, int r5, float r6, float r7, int r8, int r9, float r10, boolean r11) {
        this.f31231a = r1;
        this.f31232b = r2;
        this.f31233c = r3;
        this.d = r4;
        this.f31234e = r5;
        this.f31235f = r6;
        this.f31236g = r7;
        this.f31237h = r8;
        this.f31238i = r9;
        this.f31239j = r10;
        this.f31240k = r11;
    }

    public int hashCode() {
        int r02 = (((((int) ((((this.f31231a.hashCode() * 31) + this.f31232b.hashCode()) * 31) + this.f31233c)) * 31) + this.d.ordinal()) * 31) + this.f31234e;
        long r1 = Float.floatToRawIntBits(this.f31235f);
        return (((r02 * 31) + ((int) (r1 ^ (r1 >>> 32)))) * 31) + this.f31237h;
    }
}
