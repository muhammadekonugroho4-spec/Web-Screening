package androidx.constraintlayout.core.motion.utils;

import clickstream.internal.analytics.healthproto.Health;
import java.util.Arrays;

/* loaded from: classes.dex */
public class a extends b {

    /* renamed from: a, reason: collision with root package name */
    public final double[] f21066a;

    /* renamed from: b, reason: collision with root package name */
    public C0144a[] f21067b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21068c;

    /* renamed from: androidx.constraintlayout.core.motion.utils.a$a, reason: collision with other inner class name */
    public static class C0144a {

        /* renamed from: s, reason: collision with root package name */
        public static double[] f21069s;

        /* renamed from: a, reason: collision with root package name */
        public double[] f21070a;

        /* renamed from: b, reason: collision with root package name */
        public double f21071b;

        /* renamed from: c, reason: collision with root package name */
        public double f21072c;
        public double d;

        /* renamed from: e, reason: collision with root package name */
        public double f21073e;

        /* renamed from: f, reason: collision with root package name */
        public double f21074f;

        /* renamed from: g, reason: collision with root package name */
        public double f21075g;

        /* renamed from: h, reason: collision with root package name */
        public double f21076h;

        /* renamed from: i, reason: collision with root package name */
        public double f21077i;

        /* renamed from: j, reason: collision with root package name */
        public double f21078j;

        /* renamed from: k, reason: collision with root package name */
        public double f21079k;

        /* renamed from: l, reason: collision with root package name */
        public double f21080l;

        /* renamed from: m, reason: collision with root package name */
        public double f21081m;

        /* renamed from: n, reason: collision with root package name */
        public double f21082n;

        /* renamed from: o, reason: collision with root package name */
        public double f21083o;

        /* renamed from: p, reason: collision with root package name */
        public double f21084p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f21085q;

        /* renamed from: r, reason: collision with root package name */
        public boolean f21086r;

        static {
            f21069s = new double[91];
        }

        public C0144a(int r16, double r17, double r19, double r21, double r23, double r25, double r27) {
            boolean r5 = false;
            this.f21086r = false;
            double r6 = r25 - r21;
            double r8 = r27 - r23;
            int r10 = 1;
            if (r16 != 1) goto L5;
            this.f21085q = true;
        L18:
            this.f21072c = r17;
            this.d = r19;
            this.f21077i = 1.0d / (r19 - r17);
            if (3 != r16) goto L22;
            this.f21086r = true;
        L22:
            if (this.f21086r == true) goto L46;
            if (Math.abs(r6) < 0.001d) goto L46;
            if (Math.abs(r8) < 0.001d) goto L46;
            this.f21070a = new double[Health.EVENT_TIMESTAMP_FIELD_NUMBER];
            boolean r02 = this.f21085q;
            if (r02 == false) goto L31;
            int r2 = -1;
        L32:
            this.f21078j = r6 * r2;
            if (r02 == true) goto L36;
            r10 = -1;
        L36:
            this.f21079k = r8 * r10;
            if (r02 == false) goto L39;
            double r1 = r25;
        L40:
            this.f21080l = r1;
            if (r02 == false) goto L43;
            double r03 = r23;
        L44:
            this.f21081m = r03;
            a(r21, r23, r25, r27);
            this.f21082n = this.f21071b * this.f21077i;
            return;
        L43:
            r03 = r27;
            goto L44
        L39:
            r1 = r21;
            goto L40
        L31:
            r2 = 1;
        L46:
            this.f21086r = true;
            this.f21073e = r21;
            this.f21074f = r25;
            this.f21075g = r23;
            this.f21076h = r27;
            double r12 = Math.hypot(r8, r6);
            this.f21071b = r12;
            this.f21082n = r12 * this.f21077i;
            double r13 = this.d;
            double r3 = this.f21072c;
            this.f21080l = r6 / (r13 - r3);
            this.f21081m = r8 / (r13 - r3);
            return;
        L5:
            if (r16 == 4) goto L14;
            if (r16 == 5) goto L10;
            this.f21085q = false;
            goto L18
        L10:
            if (r8 >= 0.0d) goto L12;
            r5 = true;
        L12:
            this.f21085q = r5;
            goto L18
        L14:
            if (r8 <= 0.0d) goto L16;
            r5 = true;
        L16:
            this.f21085q = r5;
            goto L18
        }

        public final void a(double r17, double r19, double r21, double r23) {
            double r1 = r21 - r17;
            double r3 = r19 - r23;
            int r8 = 0;
            double r9 = 0.0d;
            double r11 = 0.0d;
            double r13 = 0.0d;
        L4:
            if (r8 >= f21069s.length) goto L9;
            int r20 = r8;
            double r5 = Math.toRadians((r8 * 90.0d) / (r15.length - 1));
            double r7 = Math.sin(r5) * r1;
            double r52 = Math.cos(r5) * r3;
            if (r20 <= 0) goto L8;
            r9 = r9 + Math.hypot(r7 - r11, r52 - r13);
            f21069s[r20] = r9;
        L8:
            r8 = r20 + 1;
            r11 = r7;
            r13 = r52;
            goto L4
        L9:
            this.f21071b = r9;
            int r12 = 0;
        L10:
            double[] r2 = f21069s;
            if (r12 >= r2.length) goto L13;
            r2[r12] = r2[r12] / r9;
            r12 = r12 + 1;
            goto L10
        L13:
            int r72 = 0;
        L15:
            if (r72 >= this.f21070a.length) goto L24;
            double r22 = r72 / (r1.length - 1);
            int r14 = Arrays.binarySearch(f21069s, r22);
            if (r14 < 0) goto L20;
            this.f21070a[r72] = r14 / (f21069s.length - 1);
        L23:
            r72 = r72 + 1;
            goto L15
        L20:
            if (r14 != (-1)) goto L22;
            this.f21070a[r72] = 0.0d;
            goto L23
        L22:
            int r15 = -r14;
            int r4 = r15 - 2;
            double[] r82 = f21069s;
            double r92 = r82[r4];
            this.f21070a[r72] = (r4 + ((r22 - r92) / (r82[r15 - 1] - r92))) / (r82.length - 1);
            goto L23
        }

        public double b() {
            double r02 = this.f21078j * this.f21084p;
            double r2 = (-this.f21079k) * this.f21083o;
            double r4 = this.f21082n / Math.hypot(r02, r2);
            if (this.f21085q == false) goto L7;
            return (-r02) * r4;
        L7:
            return r02 * r4;
        }

        public double c() {
            double r02 = this.f21078j * this.f21084p;
            double r2 = (-this.f21079k) * this.f21083o;
            double r4 = this.f21082n / Math.hypot(r02, r2);
            if (this.f21085q == false) goto L7;
            return (-r2) * r4;
        L7:
            return r2 * r4;
        }

        public double d(double r1) {
            return this.f21080l;
        }

        public double e(double r1) {
            return this.f21081m;
        }

        public double f(double r5) {
            double r52 = (r5 - this.f21072c) * this.f21077i;
            double r02 = this.f21073e;
            return r02 + (r52 * (this.f21074f - r02));
        }

        public double g(double r5) {
            double r52 = (r5 - this.f21072c) * this.f21077i;
            double r02 = this.f21075g;
            return r02 + (r52 * (this.f21076h - r02));
        }

        public double h() {
            return this.f21080l + (this.f21078j * this.f21083o);
        }

        public double i() {
            return this.f21081m + (this.f21079k * this.f21084p);
        }

        public double j(double r7) {
            if (r7 > 0.0d) goto L6;
            return 0.0d;
        L6:
            if (r7 < 1.0d) goto L8;
            return 1.0d;
        L8:
            double[] r02 = this.f21070a;
            double r72 = r7 * (r02.length - 1);
            int r1 = (int) r72;
            double r73 = r72 - r1;
            double r2 = r02[r1];
            return r2 + (r73 * (r02[r1 + 1] - r2));
        }

        public void k(double r3) {
            if (this.f21085q == false) goto L5;
            double r02 = this.d - r3;
        L6:
            double r03 = j(r02 * this.f21077i) * 1.5707963267948966d;
            this.f21083o = Math.sin(r03);
            this.f21084p = Math.cos(r03);
            return;
        L5:
            r02 = r3 - this.f21072c;
            goto L6
        }
    }

    public a(int[] r24, double[] r25, double[][] r26) {
        this.f21068c = true;
        this.f21066a = r25;
        this.f21067b = new C0144a[r25.length - 1];
        int r5 = 1;
        int r6 = 1;
        int r4 = 0;
    L3:
        C0144a[] r7 = this.f21067b;
        if (r4 >= r7.length) goto L22;
        int r8 = r24[r4];
        int r9 = 3;
        if (r8 == 0) goto L21;
        if (r8 != 1) goto L9;
    L20:
        r5 = 1;
    L18:
        r9 = r5;
        goto L21
    L9:
        if (r8 == 2) goto L19;
        if (r8 == 3) goto L16;
        r9 = 4;
        if (r8 == 4) goto L21;
        r9 = 5;
        if (r8 == 5) goto L21;
        r9 = r6;
        goto L21
    L16:
        if (r5 != 1) goto L20;
    L19:
        r5 = 2;
    L21:
        double r10 = r25[r4];
        int r62 = r4 + 1;
        double r12 = r25[r62];
        double[] r14 = r26[r4];
        double r15 = r14[0];
        double r17 = r14[1];
        double[] r142 = r26[r62];
        r7[r4] = new C0144a(r9, r10, r12, r15, r17, r142[0], r142[1]);
        r4 = r62;
        r6 = r9;
        goto L3
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public double c(double r8, int r10) {
        int r1 = 0;
        if (this.f21068c == false) goto L27;
        C0144a[] r02 = this.f21067b;
        C0144a r2 = r02[0];
        double r3 = r2.f21072c;
        if (r8 >= r3) goto L20;
        double r82 = r8 - r3;
        if (r2.f21086r == false) goto L13;
        if (r10 != 0) goto L12;
        double r5 = r2.f(r3);
        double r03 = this.f21067b[0].d(r3);
    L11:
        return r5 + (r82 * r03);
    L12:
        r5 = r2.g(r3);
        r03 = this.f21067b[0].e(r3);
        goto L11
    L13:
        r2.k(r3);
        if (r10 != 0) goto L18;
        double r22 = this.f21067b[0].h();
        double r04 = this.f21067b[0].b();
    L17:
        return r22 + (r82 * r04);
    L18:
        r22 = this.f21067b[0].i();
        r04 = this.f21067b[0].c();
        goto L17
    L20:
        if (r8 <= r02[r02.length - 1].d) goto L33;
        double r12 = r02[r02.length - 1].d;
        double r83 = r8 - r12;
        int r32 = r02.length - 1;
        if (r10 != 0) goto L26;
        double r4 = r02[r32].f(r12);
        double r05 = this.f21067b[r32].d(r12);
    L25:
        return r4 + (r83 * r05);
    L26:
        r4 = r02[r32].g(r12);
        r05 = this.f21067b[r32].e(r12);
    L33:
        C0144a[] r06 = this.f21067b;
        if (r1 >= r06.length) goto L51;
        C0144a r07 = r06[r1];
        if (r8 <= r07.d) goto L38;
        r1 = r1 + 1;
        goto L33
    L38:
        if (r07.f21086r == false) goto L44;
        if (r10 != 0) goto L43;
        return r07.f(r8);
    L43:
        return r07.g(r8);
    L44:
        r07.k(r8);
        if (r10 != 0) goto L49;
        return this.f21067b[r1].h();
    L49:
        return this.f21067b[r1].i();
    L51:
        return Double.NaN;
    L27:
        C0144a[] r08 = this.f21067b;
        double r23 = r08[0].f21072c;
        if (r8 >= r23) goto L31;
        r8 = r23;
        goto L33
    L31:
        if (r8 <= r08[r08.length - 1].d) goto L33;
        r8 = r08[r08.length - 1].d;
        goto L33
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public void d(double r11, double[] r13) {
        if (this.f21068c == false) goto L20;
        C0144a[] r02 = this.f21067b;
        C0144a r3 = r02[0];
        double r4 = r3.f21072c;
        if (r11 >= r4) goto L13;
        double r112 = r11 - r4;
        if (r3.f21086r == false) goto L10;
        r13[0] = r3.f(r4) + (this.f21067b[0].d(r4) * r112);
        r13[1] = this.f21067b[0].g(r4) + (r112 * this.f21067b[0].e(r4));
        return;
    L10:
        r3.k(r4);
        r13[0] = this.f21067b[0].h() + (this.f21067b[0].b() * r112);
        r13[1] = this.f21067b[0].i() + (r112 * this.f21067b[0].c());
        return;
    L13:
        if (r11 <= r02[r02.length - 1].d) goto L26;
        double r32 = r02[r02.length - 1].d;
        double r5 = r11 - r32;
        int r7 = r02.length - 1;
        C0144a r03 = r02[r7];
        if (r03.f21086r == false) goto L18;
        r13[0] = r03.f(r32) + (this.f21067b[r7].d(r32) * r5);
        r13[1] = this.f21067b[r7].g(r32) + (r5 * this.f21067b[r7].e(r32));
        return;
    L18:
        r03.k(r11);
        r13[0] = this.f21067b[r7].h() + (this.f21067b[r7].b() * r5);
        r13[1] = this.f21067b[r7].i() + (r5 * this.f21067b[r7].c());
        return;
    L26:
        int r04 = 0;
    L27:
        C0144a[] r33 = this.f21067b;
        if (r04 >= r33.length) goto L38;
        C0144a r34 = r33[r04];
        if (r11 <= r34.d) goto L32;
        r04 = r04 + 1;
        goto L27
    L32:
        if (r34.f21086r == false) goto L35;
        r13[0] = r34.f(r11);
        r13[1] = this.f21067b[r04].g(r11);
        return;
    L35:
        r34.k(r11);
        r13[0] = this.f21067b[r04].h();
        r13[1] = this.f21067b[r04].i();
        return;
    L38:
        return;
    L20:
        C0144a[] r05 = this.f21067b;
        double r35 = r05[0].f21072c;
        if (r11 >= r35) goto L24;
        r11 = r35;
    L24:
        if (r11 <= r05[r05.length - 1].d) goto L26;
        r11 = r05[r05.length - 1].d;
        goto L26
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public void e(double r11, float[] r13) {
        if (this.f21068c == false) goto L20;
        C0144a[] r02 = this.f21067b;
        C0144a r3 = r02[0];
        double r4 = r3.f21072c;
        if (r11 >= r4) goto L13;
        double r112 = r11 - r4;
        if (r3.f21086r == false) goto L10;
        r13[0] = (float) (r3.f(r4) + (this.f21067b[0].d(r4) * r112));
        r13[1] = (float) (this.f21067b[0].g(r4) + (r112 * this.f21067b[0].e(r4)));
        return;
    L10:
        r3.k(r4);
        r13[0] = (float) (this.f21067b[0].h() + (this.f21067b[0].b() * r112));
        r13[1] = (float) (this.f21067b[0].i() + (r112 * this.f21067b[0].c()));
        return;
    L13:
        if (r11 <= r02[r02.length - 1].d) goto L26;
        double r32 = r02[r02.length - 1].d;
        double r5 = r11 - r32;
        int r7 = r02.length - 1;
        C0144a r03 = r02[r7];
        if (r03.f21086r == false) goto L18;
        r13[0] = (float) (r03.f(r32) + (this.f21067b[r7].d(r32) * r5));
        r13[1] = (float) (this.f21067b[r7].g(r32) + (r5 * this.f21067b[r7].e(r32)));
        return;
    L18:
        r03.k(r11);
        r13[0] = (float) this.f21067b[r7].h();
        r13[1] = (float) this.f21067b[r7].i();
        return;
    L26:
        int r04 = 0;
    L27:
        C0144a[] r33 = this.f21067b;
        if (r04 >= r33.length) goto L38;
        C0144a r34 = r33[r04];
        if (r11 <= r34.d) goto L32;
        r04 = r04 + 1;
        goto L27
    L32:
        if (r34.f21086r == false) goto L35;
        r13[0] = (float) r34.f(r11);
        r13[1] = (float) this.f21067b[r04].g(r11);
        return;
    L35:
        r34.k(r11);
        r13[0] = (float) this.f21067b[r04].h();
        r13[1] = (float) this.f21067b[r04].i();
        return;
    L38:
        return;
    L20:
        C0144a[] r05 = this.f21067b;
        double r35 = r05[0].f21072c;
        if (r11 >= r35) goto L24;
        r11 = r35;
        goto L26
    L24:
        if (r11 <= r05[r05.length - 1].d) goto L26;
        r11 = r05[r05.length - 1].d;
        goto L26
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public double f(double r6, int r8) {
        C0144a[] r02 = this.f21067b;
        int r1 = 0;
        double r2 = r02[0].f21072c;
        if (r6 >= r2) goto L6;
        r6 = r2;
    L6:
        if (r6 <= r02[r02.length - 1].d) goto L8;
        r6 = r02[r02.length - 1].d;
    L8:
        C0144a[] r03 = this.f21067b;
        if (r1 >= r03.length) goto L26;
        C0144a r04 = r03[r1];
        if (r6 <= r04.d) goto L13;
        r1 = r1 + 1;
        goto L8
    L13:
        if (r04.f21086r == false) goto L19;
        if (r8 != 0) goto L18;
        return r04.d(r6);
    L18:
        return r04.e(r6);
    L19:
        r04.k(r6);
        if (r8 != 0) goto L24;
        return this.f21067b[r1].b();
    L24:
        return this.f21067b[r1].c();
    L26:
        return Double.NaN;
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public void g(double r7, double[] r9) {
        C0144a[] r02 = this.f21067b;
        double r2 = r02[0].f21072c;
        if (r7 >= r2) goto L6;
        r7 = r2;
    L8:
        int r03 = 0;
    L9:
        C0144a[] r22 = this.f21067b;
        if (r03 >= r22.length) goto L20;
        C0144a r23 = r22[r03];
        if (r7 <= r23.d) goto L14;
        r03 = r03 + 1;
        goto L9
    L14:
        if (r23.f21086r == false) goto L17;
        r9[0] = r23.d(r7);
        r9[1] = this.f21067b[r03].e(r7);
        return;
    L17:
        r23.k(r7);
        r9[0] = this.f21067b[r03].b();
        r9[1] = this.f21067b[r03].c();
        return;
    L20:
        return;
    L6:
        if (r7 <= r02[r02.length - 1].d) goto L8;
        r7 = r02[r02.length - 1].d;
        goto L8
    }

    @Override // androidx.constraintlayout.core.motion.utils.b
    public double[] h() {
        return this.f21066a;
    }
}
