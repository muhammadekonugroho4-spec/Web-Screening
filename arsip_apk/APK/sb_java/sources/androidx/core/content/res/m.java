package androidx.core.content.res;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: k, reason: collision with root package name */
    public static final m f22783k = null;

    /* renamed from: a, reason: collision with root package name */
    public final float f22784a;

    /* renamed from: b, reason: collision with root package name */
    public final float f22785b;

    /* renamed from: c, reason: collision with root package name */
    public final float f22786c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f22787e;

    /* renamed from: f, reason: collision with root package name */
    public final float f22788f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f22789g;

    /* renamed from: h, reason: collision with root package name */
    public final float f22790h;

    /* renamed from: i, reason: collision with root package name */
    public final float f22791i;

    /* renamed from: j, reason: collision with root package name */
    public final float f22792j;

    static {
        f22783k = k(b.f22751c, (float) ((b.h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);
    }

    public m(float r1, float r2, float r3, float r4, float r5, float r6, float[] r7, float r8, float r9, float r10) {
        this.f22788f = r1;
        this.f22784a = r2;
        this.f22785b = r3;
        this.f22786c = r4;
        this.d = r5;
        this.f22787e = r6;
        this.f22789g = r7;
        this.f22790h = r8;
        this.f22791i = r9;
        this.f22792j = r10;
    }

    public static m k(float[] r23, float r24, float r25, float r26, boolean r27) {
        float[][] r2 = b.f22749a;
        float r4 = r23[0];
        float[] r5 = r2[0];
        float r6 = r5[0] * r4;
        float r8 = r23[1];
        float r62 = r6 + (r5[1] * r8);
        float r10 = r23[2];
        float r63 = r62 + (r5[2] * r10);
        float[] r52 = r2[1];
        float r11 = ((r52[0] * r4) + (r52[1] * r8)) + (r52[2] * r10);
        float[] r22 = r2[2];
        float r42 = ((r4 * r22[0]) + (r8 * r22[1])) + (r10 * r22[2]);
        float r53 = (r26 / 10.0f) + 0.8f;
        if (r53 < 0.9d) goto L6;
        float r28 = b.d(0.59f, 0.69f, (r53 - 0.9f) * 10.0f);
    L5:
        float r17 = r28;
        if (r27 == false) goto L10;
        float r82 = 1.0f;
    L11:
        double r12 = r82;
        if (r12 <= 1.0d) goto L15;
        r82 = 1.0f;
    L17:
        float[] r83 = {(((100.0f / r63) * r82) + 1.0f) - r82, (((100.0f / r11) * r82) + 1.0f) - r82, (((100.0f / r42) * r82) + 1.0f) - r82};
        float r102 = 1.0f / ((5.0f * r24) + 1.0f);
        float r122 = ((r102 * r102) * r102) * r102;
        float r29 = 1.0f - r122;
        float r123 = (r122 * r24) + (((0.1f * r29) * r29) * ((float) Math.cbrt(r24 * 5.0d)));
        float r13 = b.h(r25) / r23[1];
        double r3 = r13;
        float r222 = ((float) Math.sqrt(r3)) + 1.48f;
        float r43 = 0.725f / ((float) Math.pow(r3, 0.2d));
        float[] r32 = {(float) Math.pow(((r83[0] * r123) * r63) / 100.0d, 0.42d), (float) Math.pow(((r83[1] * r123) * r11) / 100.0d, 0.42d), (float) Math.pow(((r83[2] * r123) * r42) / 100.0d, 0.42d)};
        float r210 = r32[0];
        float r7 = (r210 * 400.0f) / (r210 + 27.13f);
        float r211 = r32[1];
        float r103 = (r211 * 400.0f) / (r211 + 27.13f);
        float r212 = r32[2];
        float[] r1 = {r7, r103, (400.0f * r212) / (r212 + 27.13f)};
        return new m(r13, (((r1[0] * 2.0f) + r1[1]) + (r1[2] * 0.05f)) * r43, r43, r43, r17, r53, r83, r123, (float) Math.pow(r123, 0.25d), r222);
    L15:
        if (r12 >= 0.0d) goto L17;
        r82 = 0.0f;
        goto L17
    L10:
        r82 = (1.0f - (((float) Math.exp(((-r24) - 42.0f) / 92.0f)) * 0.2777778f)) * r53;
        goto L11
    L6:
        r28 = b.d(0.525f, 0.59f, (r53 - 0.8f) * 10.0f);
        goto L5
    }

    public float a() {
        return this.f22784a;
    }

    public float b() {
        return this.d;
    }

    public float c() {
        return this.f22790h;
    }

    public float d() {
        return this.f22791i;
    }

    public float e() {
        return this.f22788f;
    }

    public float f() {
        return this.f22785b;
    }

    public float g() {
        return this.f22787e;
    }

    public float h() {
        return this.f22786c;
    }

    public float[] i() {
        return this.f22789g;
    }

    public float j() {
        return this.f22792j;
    }
}
