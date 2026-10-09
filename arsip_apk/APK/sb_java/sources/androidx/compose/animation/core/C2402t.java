package androidx.compose.animation.core;

import clickstream.internal.analytics.healthproto.Health;
import kotlin.collections.AbstractC11772p;

/* renamed from: androidx.compose.animation.core.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2402t {

    /* renamed from: a, reason: collision with root package name */
    public final a[][] f6894a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6895b;

    /* renamed from: androidx.compose.animation.core.t$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final float f6896a;

        /* renamed from: b, reason: collision with root package name */
        public final float f6897b;

        /* renamed from: c, reason: collision with root package name */
        public final float f6898c;
        public final float d;

        /* renamed from: e, reason: collision with root package name */
        public final float f6899e;

        /* renamed from: f, reason: collision with root package name */
        public final float f6900f;

        /* renamed from: g, reason: collision with root package name */
        public float f6901g;

        /* renamed from: h, reason: collision with root package name */
        public float f6902h;

        /* renamed from: i, reason: collision with root package name */
        public float f6903i;

        /* renamed from: j, reason: collision with root package name */
        public final float[] f6904j;

        /* renamed from: k, reason: collision with root package name */
        public final float f6905k;

        /* renamed from: l, reason: collision with root package name */
        public final float f6906l;

        /* renamed from: m, reason: collision with root package name */
        public final float f6907m;

        /* renamed from: n, reason: collision with root package name */
        public final float f6908n;

        /* renamed from: o, reason: collision with root package name */
        public final float f6909o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f6910p;

        /* renamed from: q, reason: collision with root package name */
        public final float f6911q;

        /* renamed from: r, reason: collision with root package name */
        public final float f6912r;

        static {
        }

        public a(int r8, float r9, float r10, float r11, float r12, float r13, float r14) {
            this.f6896a = r9;
            this.f6897b = r10;
            this.f6898c = r11;
            this.d = r12;
            this.f6899e = r13;
            this.f6900f = r14;
            float r02 = r13 - r11;
            float r1 = r14 - r12;
            boolean r2 = false;
            boolean r3 = true;
            if (r8 != 1) goto L5;
        L11:
            boolean r4 = true;
        L15:
            if (r4 == false) goto L17;
            float r5 = -1.0f;
        L18:
            this.f6907m = r5;
            float r6 = 1 / (r10 - r9);
            this.f6905k = r6;
            this.f6904j = new float[Health.EVENT_TIMESTAMP_FIELD_NUMBER];
            if (r8 != 3) goto L21;
            r2 = true;
        L21:
            if (r2 == false) goto L23;
        L36:
            float r82 = (float) Math.hypot(r1, r02);
            this.f6901g = r82;
            this.f6906l = r82 * r6;
            this.f6911q = r02 * r6;
            this.f6912r = r1 * r6;
            this.f6908n = Float.NaN;
            this.f6909o = Float.NaN;
        L37:
            this.f6910p = r3;
            return;
        L23:
            if (Math.abs(r02) < 0.001f) goto L36;
            if (Math.abs(r1) < 0.001f) goto L36;
            this.f6908n = r02 * r5;
            this.f6909o = r1 * (-r5);
            if (r4 == false) goto L30;
            float r83 = r13;
        L31:
            this.f6911q = r83;
            if (r4 == false) goto L34;
            float r84 = r12;
        L35:
            this.f6912r = r84;
            c(r11, r12, r13, r14);
            this.f6906l = this.f6901g * r6;
            r3 = r2;
            goto L37
        L34:
            r84 = r14;
            goto L35
        L30:
            r83 = r11;
            goto L31
        L17:
            r5 = 1.0f;
            goto L18
        L5:
            if (r8 == 4) goto L13;
            if (r8 == 5) goto L10;
        L8:
            r4 = false;
            goto L15
        L10:
            if (r1 >= 0.0f) goto L8;
        L13:
            if (r1 <= 0.0f) goto L8;
            goto L8
        }

        public static final /* synthetic */ float a(a r02) {
            return r02.f6903i;
        }

        public static final /* synthetic */ float b(a r02) {
            return r02.f6902h;
        }

        public final void c(float r17, float r18, float r19, float r20) {
            float r1 = r19 - r17;
            float r2 = r18 - r20;
            float[] r3 = AbstractC2404u.a();
            int r4 = r3.length - 1;
            float r10 = r4;
            float[] r11 = this.f6904j;
            if (1 > r4) goto L8;
            float r8 = r2;
            int r5 = 1;
            float r6 = 0.0f;
            float r7 = 0.0f;
        L5:
            float r172 = 0.0f;
            double r12 = (float) Math.toRadians((r5 * 90.0d) / r4);
            float r14 = ((float) Math.sin(r12)) * r1;
            float r122 = ((float) Math.cos(r12)) * r2;
            float r13 = r10;
            r6 = r6 + ((float) Math.hypot(r14 - r7, r122 - r8));
            r3[r5] = r6;
            if (r5 == r4) goto L9;
            r5 = r5 + 1;
            r8 = r122;
            r10 = r13;
            r7 = r14;
        L9:
            this.f6901g = r6;
            if (1 > r4) goto L15;
            int r15 = 1;
        L12:
            r3[r15] = r3[r15] / r6;
            if (r15 == r4) goto L15;
            r15 = r15 + 1;
        L15:
            int r16 = r11.length;
            int r22 = 0;
        L16:
            if (r22 >= r16) goto L26;
            float r42 = r22 / 100.0f;
            int r52 = AbstractC11772p.i(r3, r42, 0, 0, 6, null);
            if (r52 < 0) goto L22;
            r11[r22] = r52 / r13;
        L25:
            r22 = r22 + 1;
            goto L16
        L22:
            if (r52 != (-1)) goto L24;
            r11[r22] = r172;
            goto L25
        L24:
            int r53 = -r52;
            int r62 = r53 - 2;
            float r82 = r62;
            float r63 = r3[r62];
            r11[r22] = (r82 + ((r42 - r63) / (r3[r53 - 1] - r63))) / r13;
            goto L25
        L26:
            return;
        L8:
            r13 = r10;
            r172 = 0.0f;
            r6 = 0.0f;
            goto L9
        }

        public final float d() {
            float r02 = this.f6908n * this.f6903i;
            return (r02 * this.f6907m) * (this.f6906l / ((float) Math.hypot(r02, (-this.f6909o) * this.f6902h)));
        }

        public final float e() {
            float r02 = this.f6908n * this.f6903i;
            float r1 = (-this.f6909o) * this.f6902h;
            return (r1 * this.f6907m) * (this.f6906l / ((float) Math.hypot(r02, r1)));
        }

        public final float f(float r3) {
            float r32 = (r3 - this.f6896a) * this.f6905k;
            float r02 = this.f6898c;
            return r02 + (r32 * (this.f6899e - r02));
        }

        public final float g(float r3) {
            float r32 = (r3 - this.f6896a) * this.f6905k;
            float r02 = this.d;
            return r02 + (r32 * (this.f6900f - r02));
        }

        public final float h() {
            return this.f6896a;
        }

        public final float i() {
            return this.f6897b;
        }

        public final float j(float r4) {
            if (r4 > 0.0f) goto L6;
            return 0.0f;
        L6:
            if (r4 < 1.0f) goto L8;
            return 1.0f;
        L8:
            float r42 = r4 * 100;
            int r02 = (int) r42;
            float r43 = r42 - r02;
            float[] r1 = this.f6904j;
            float r2 = r1[r02];
            return r2 + (r43 * (r1[r02 + 1] - r2));
        }

        public final void k(float r5) {
            if (this.f6907m != (-1.0f)) goto L5;
            float r02 = this.f6897b - r5;
        L6:
            double r03 = j(r02 * this.f6905k) * 1.5707964f;
            this.f6902h = (float) Math.sin(r03);
            this.f6903i = (float) Math.cos(r03);
            return;
        L5:
            r02 = r5 - this.f6896a;
            goto L6
        }
    }

    static {
    }

    public C2402t(int[] r22, float[] r23, float[][] r24) {
        int r2 = 1;
        this.f6895b = true;
        int r3 = r23.length - 1;
        a[][] r4 = new a[r3][];
        int r7 = 1;
        int r8 = 1;
        int r6 = 0;
    L3:
        if (r6 >= r3) goto L24;
        int r9 = r22[r6];
        int r10 = 3;
        if (r9 == 0) goto L14;
        if (r9 == r2) goto L19;
        if (r9 == 2) goto L18;
        if (r9 == 3) goto L15;
        r10 = 4;
        if (r9 == 4) goto L14;
        r10 = 5;
        if (r9 == 5) goto L14;
        int r13 = r8;
    L20:
        float[] r82 = r24[r6];
        int r92 = r6 + 1;
        float[] r102 = r24[r92];
        float r14 = r23[r6];
        float r15 = r23[r92];
        int r25 = (r82.length % 2) + (r82.length / 2);
        a[] r11 = new a[r25];
        int r12 = 0;
    L21:
        if (r12 >= r25) goto L23;
        int r16 = r12 * 2;
        int r17 = r12;
        int r19 = r16 + 1;
        r11[r17] = new a(r13, r14, r15, r82[r16], r82[r19], r102[r16], r102[r19]);
        r12 = r17 + 1;
        goto L21
    L23:
        r4[r6] = r11;
        r6 = r92;
        r8 = r13;
        r2 = 1;
        goto L3
    L15:
        if (r7 != r2) goto L19;
    L18:
        r7 = 2;
    L17:
        r13 = r7;
    L19:
        r7 = r2;
    L14:
        r13 = r10;
        goto L20
    L24:
        this.f6894a = r4;
    }

    public final void a(float r13, float[] r14) {
        a[][] r02 = this.f6894a;
        int r1 = r02.length - 1;
        int r3 = 0;
        float r4 = r02[0][0].h();
        float r5 = r02[r1][0].i();
        int r6 = r14.length;
        if (this.f6895b == true) goto L5;
        r13 = Math.min(Math.max(r13, r4), r5);
    L21:
        int r12 = r02.length;
        int r42 = 0;
        boolean r52 = false;
    L22:
        if (r42 >= r12) goto L46;
        int r7 = 0;
        int r8 = 0;
    L25:
        if (r7 >= (r6 - 1)) goto L34;
        a r9 = r02[r42][r8];
        if (r13 > r9.i()) goto L33;
        if (r9.f6910p == false) goto L31;
        r14[r7] = r9.f(r13);
        r14[r7 + 1] = r9.g(r13);
    L32:
        r52 = true;
        goto L33
    L31:
        r9.k(r13);
        r14[r7] = r9.f6911q + (r9.f6908n * a.b(r9));
        r14[r7 + 1] = r9.f6912r + (r9.f6909o * a.a(r9));
    L33:
        r7 = r7 + 2;
        r8 = r8 + 1;
        goto L25
    L34:
        if (r52 == true) goto L37;
        r42 = r42 + 1;
        goto L22
    L37:
        return;
    L46:
        return;
    L5:
        if (r13 < r4) goto L9;
        if (r13 <= r5) goto L21;
    L9:
        if (r13 <= r5) goto L11;
        r4 = r5;
    L12:
        float r132 = r13 - r4;
        int r53 = 0;
    L14:
        if (r3 >= (r6 - 1)) goto L47;
        a r72 = r02[r1][r53];
        if (r72.f6910p == false) goto L18;
        r14[r3] = r72.f(r4) + (r72.f6911q * r132);
        r14[r3 + 1] = r72.g(r4) + (r72.f6912r * r132);
    L19:
        r3 = r3 + 2;
        r53 = r53 + 1;
        goto L14
    L18:
        r72.k(r4);
        r14[r3] = (r72.f6911q + (r72.f6908n * a.b(r72))) + (r72.d() * r132);
        r14[r3 + 1] = (r72.f6912r + (r72.f6909o * a.a(r72))) + (r72.e() * r132);
        goto L19
    L47:
        return;
    L11:
        r1 = 0;
        goto L12
    }

    public final void b(float r12, float[] r13) {
        a[][] r02 = this.f6894a;
        float r2 = r02[0][0].h();
        float r3 = r02[r02.length - 1][0].i();
        if (r12 >= r2) goto L6;
        r12 = r2;
    L6:
        if (r12 > r3) goto L9;
        r3 = r12;
    L9:
        int r122 = r13.length;
        int r22 = r02.length;
        int r5 = 0;
        boolean r6 = false;
    L10:
        if (r5 >= r22) goto L25;
        int r7 = 0;
        int r8 = 0;
    L13:
        if (r7 >= (r122 - 1)) goto L22;
        a r9 = r02[r5][r8];
        if (r3 > r9.i()) goto L21;
        if (r9.f6910p == false) goto L19;
        r13[r7] = r9.f6911q;
        r13[r7 + 1] = r9.f6912r;
    L20:
        r6 = true;
        goto L21
    L19:
        r9.k(r3);
        r13[r7] = r9.d();
        r13[r7 + 1] = r9.e();
    L21:
        r7 = r7 + 2;
        r8 = r8 + 1;
        goto L13
    L22:
        if (r6 == true) goto L31;
        r5 = r5 + 1;
        goto L10
    L31:
        return;
    }
}
