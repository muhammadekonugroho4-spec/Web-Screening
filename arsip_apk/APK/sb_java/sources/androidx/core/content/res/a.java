package androidx.core.content.res;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f22741a;

    /* renamed from: b, reason: collision with root package name */
    public final float f22742b;

    /* renamed from: c, reason: collision with root package name */
    public final float f22743c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final float f22744e;

    /* renamed from: f, reason: collision with root package name */
    public final float f22745f;

    /* renamed from: g, reason: collision with root package name */
    public final float f22746g;

    /* renamed from: h, reason: collision with root package name */
    public final float f22747h;

    /* renamed from: i, reason: collision with root package name */
    public final float f22748i;

    public a(float r1, float r2, float r3, float r4, float r5, float r6, float r7, float r8, float r9) {
        this.f22741a = r1;
        this.f22742b = r2;
        this.f22743c = r3;
        this.d = r4;
        this.f22744e = r5;
        this.f22745f = r6;
        this.f22746g = r7;
        this.f22747h = r8;
        this.f22748i = r9;
    }

    public static a b(float r12, float r13, float r14) {
        float r1 = 100.0f;
        float r2 = 1000.0f;
        float r5 = 0.0f;
        a r4 = null;
        float r3 = 1000.0f;
    L4:
        if (Math.abs(r5 - r1) <= 0.01f) goto L19;
        float r6 = ((r1 - r5) / 2.0f) + r5;
        int r7 = e(r6, r13, r12).p();
        float r8 = b.b(r7);
        float r9 = Math.abs(r14 - r8);
        if (r9 >= 0.2f) goto L11;
        a r72 = c(r7);
        float r10 = r72.a(e(r72.k(), r72.i(), r12));
        if (r10 > 1.0f) goto L11;
        r4 = r72;
        r2 = r9;
        r3 = r10;
    L11:
        if (r2 != 0.0f) goto L16;
        if (r3 != 0.0f) goto L16;
        return r4;
    L16:
        if (r8 < r14) goto L17;
        r1 = r6;
        goto L4
    L17:
        r5 = r6;
        goto L4
    L19:
        return r4;
    }

    public static a c(int r14) {
        float[] r02 = new float[7];
        float[] r2 = new float[3];
        d(r14, m.f22783k, r02, r2);
        return new a(r2[0], r2[1], r02[0], r02[1], r02[2], r02[3], r02[4], r02[5], r02[6]);
    }

    public static void d(int r21, m r22, float[] r23, float[] r24) {
        b.f(r21, r24);
        float[][] r02 = b.f22749a;
        float r3 = r24[0];
        float[] r4 = r02[0];
        float r5 = r4[0] * r3;
        float r7 = r24[1];
        float r52 = r5 + (r4[1] * r7);
        float r9 = r24[2];
        float r53 = r52 + (r4[2] * r9);
        float[] r42 = r02[1];
        float r10 = ((r42[0] * r3) + (r42[1] * r7)) + (r42[2] * r9);
        float[] r03 = r02[2];
        float r32 = ((r3 * r03[0]) + (r7 * r03[1])) + (r9 * r03[2]);
        float r04 = r22.i()[0] * r53;
        float r43 = r22.i()[1] * r10;
        float r54 = r22.i()[2] * r32;
        float r33 = (float) Math.pow((r22.c() * Math.abs(r04)) / 100.0d, 0.42d);
        float r72 = (float) Math.pow((r22.c() * Math.abs(r43)) / 100.0d, 0.42d);
        float r92 = (float) Math.pow((r22.c() * Math.abs(r54)) / 100.0d, 0.42d);
        float r05 = ((Math.signum(r04) * 400.0f) * r33) / (r33 + 27.13f);
        float r34 = ((Math.signum(r43) * 400.0f) * r72) / (r72 + 27.13f);
        float r44 = ((Math.signum(r54) * 400.0f) * r92) / (r92 + 27.13f);
        double r55 = r44;
        float r73 = ((float) (((r05 * 11.0d) + (r34 * (-12.0d))) + r55)) / 11.0f;
        float r56 = ((float) ((r05 + r34) - (r55 * 2.0d))) / 9.0f;
        float r35 = r34 * 20.0f;
        float r93 = (((r05 * 20.0f) + r35) + (21.0f * r44)) / 20.0f;
        float r06 = (((r05 * 40.0f) + r35) + r44) / 20.0f;
        float r36 = (((float) Math.atan2(r56, r73)) * 180.0f) / 3.1415927f;
        if (r36 >= 0.0f) goto L6;
        r36 = r36 + 360.0f;
    L8:
        float r8 = (3.1415927f * r36) / 180.0f;
        float r07 = ((float) Math.pow((r06 * r22.f()) / r22.a(), r22.b() * r22.j())) * 100.0f;
        float r74 = (((4.0f / r22.b()) * ((float) Math.sqrt(r07 / 100.0f))) * (r22.a() + 4.0f)) * r22.d();
        if (r36 >= 20.14d) goto L11;
        float r15 = 360.0f + r36;
    L12:
        float r57 = ((float) Math.sqrt(r07 / 100.0d)) * (((float) Math.pow(1.64d - Math.pow(0.29d, r22.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((r15 * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * r22.g()) * r22.h()) * ((float) Math.sqrt((r73 * r73) + (r56 * r56)))) / (r93 + 0.305f), 0.9d)));
        float r6 = r22.d() * r57;
        float r45 = ((float) Math.sqrt((r4 * r22.b()) / (r22.a() + 4.0f))) * 50.0f;
        float r94 = (1.7f * r07) / ((0.007f * r07) + 1.0f);
        float r102 = ((float) Math.log((0.0228f * r6) + 1.0f)) * 43.85965f;
        double r11 = r8;
        float r82 = ((float) Math.cos(r11)) * r102;
        float r103 = r102 * ((float) Math.sin(r11));
        r24[0] = r36;
        r24[1] = r57;
        if (r23 == null) goto L16;
        r23[0] = r07;
        r23[1] = r74;
        r23[2] = r6;
        r23[3] = r45;
        r23[4] = r94;
        r23[5] = r82;
        r23[6] = r103;
        return;
    L16:
        return;
    L11:
        r15 = r36;
        goto L12
    L6:
        if (r36 < 360.0f) goto L8;
        r36 = r36 - 360.0f;
        goto L8
    }

    public static a e(float r1, float r2, float r3) {
        return f(r1, r2, r3, m.f22783k);
    }

    public static a f(float r12, float r13, float r14, m r15) {
        float r02 = (((4.0f / r15.b()) * ((float) Math.sqrt(r12 / 100.0d))) * (r15.a() + 4.0f)) * r15.d();
        float r2 = r15.d() * r13;
        float r6 = ((float) Math.sqrt(((r13 / ((float) Math.sqrt(r4))) * r15.b()) / (r15.a() + 4.0f))) * 50.0f;
        float r7 = (1.7f * r12) / ((0.007f * r12) + 1.0f);
        float r4 = ((float) Math.log((r2 * 0.0228d) + 1.0d)) * 43.85965f;
        double r8 = (3.1415927f * r14) / 180.0f;
        return new a(r14, r13, r12, r02, r2, r6, r7, ((float) Math.cos(r8)) * r4, r4 * ((float) Math.sin(r8)));
    }

    public static int m(float r1, float r2, float r3) {
        return n(r1, r2, r3, m.f22783k);
    }

    public static int n(float r6, float r7, float r8, m r9) {
        if (r7 < 1.0d) goto L32;
        if (Math.round(r8) <= 0.0d) goto L32;
        if (Math.round(r8) >= 100.0d) goto L32;
        if (r6 >= 0.0f) goto L12;
        float r62 = 0.0f;
    L13:
        a r3 = null;
        boolean r2 = true;
        float r1 = 0.0f;
        float r02 = r7;
    L15:
        if (Math.abs(r1 - r7) < 0.4f) goto L26;
        a r4 = b(r62, r02, r8);
        if (r2 == true) goto L18;
        if (r4 != null) goto L24;
        r7 = r02;
    L25:
        r02 = ((r7 - r1) / 2.0f) + r1;
        goto L15
    L24:
        r1 = r02;
        r3 = r4;
        goto L25
    L18:
        if (r4 != null) goto L20;
        r02 = ((r7 - r1) / 2.0f) + r1;
        r2 = false;
        goto L15
    L20:
        return r4.o(r9);
    L26:
        if (r3 != null) goto L30;
        return b.a(r8);
    L30:
        return r3.o(r9);
    L12:
        r62 = Math.min(360.0f, r6);
    L32:
        return b.a(r8);
    }

    public float a(a r5) {
        float r02 = l() - r5.l();
        float r1 = g() - r5.g();
        float r2 = h() - r5.h();
        return (float) (Math.pow(Math.sqrt(((r02 * r02) + (r1 * r1)) + (r2 * r2)), 0.63d) * 1.41d);
    }

    public float g() {
        return this.f22747h;
    }

    public float h() {
        return this.f22748i;
    }

    public float i() {
        return this.f22742b;
    }

    public float j() {
        return this.f22741a;
    }

    public float k() {
        return this.f22743c;
    }

    public float l() {
        return this.f22746g;
    }

    public int o(m r18) {
        if (i() != 0.0d) goto L5;
    L8:
        float r02 = 0.0f;
    L9:
        float r03 = (float) Math.pow(r02 / Math.pow(1.64d - Math.pow(0.29d, r18.e()), 0.73d), 1.1111111111111112d);
        double r6 = (j() * 3.1415927f) / 180.0f;
        float r1 = ((float) (Math.cos(2.0d + r6) + 3.8d)) * 0.25f;
        float r8 = r18.a() * ((float) Math.pow(k() / 100.0d, (1.0d / r18.b()) / r18.j()));
        float r12 = ((r1 * 3846.1538f) * r18.g()) * r18.h();
        float r82 = r8 / r18.f();
        float r4 = (float) Math.sin(r6);
        float r5 = (float) Math.cos(r6);
        float r62 = (((0.305f + r82) * 23.0f) * r03) / (((r12 * 23.0f) + ((11.0f * r03) * r5)) + ((r03 * 108.0f) * r4));
        float r52 = r5 * r62;
        float r63 = r62 * r4;
        float r83 = r82 * 460.0f;
        float r04 = (((451.0f * r52) + r83) + (288.0f * r63)) / 1403.0f;
        float r42 = ((r83 - (891.0f * r52)) - (261.0f * r63)) / 1403.0f;
        float r84 = ((r83 - (r52 * 220.0f)) - (r63 * 6300.0f)) / 1403.0f;
        float r05 = (Math.signum(r04) * (100.0f / r18.c())) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(r04) * 27.13d) / (400.0d - Math.abs(r04))), 2.380952380952381d));
        float r43 = (Math.signum(r42) * (100.0f / r18.c())) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(r42) * 27.13d) / (400.0d - Math.abs(r42))), 2.380952380952381d));
        float r3 = (Math.signum(r84) * (100.0f / r18.c())) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(r84) * 27.13d) / (400.0d - Math.abs(r84))), 2.380952380952381d));
        float r06 = r05 / r18.i()[0];
        float r44 = r43 / r18.i()[1];
        float r32 = r3 / r18.i()[2];
        float[][] r13 = b.f22750b;
        float[] r7 = r13[0];
        float r85 = ((r7[0] * r06) + (r7[1] * r44)) + (r7[2] * r32);
        float[] r72 = r13[1];
        float r9 = ((r72[0] * r06) + (r72[1] * r44)) + (r72[2] * r32);
        float[] r14 = r13[2];
        return androidx.core.graphics.d.c(r85, r9, ((r06 * r14[0]) + (r44 * r14[1])) + (r32 * r14[2]));
    L5:
        if (k() == 0.0d) goto L8;
        r02 = i() / ((float) Math.sqrt(k() / 100.0d));
        goto L9
    }

    public int p() {
        return o(m.f22783k);
    }
}
