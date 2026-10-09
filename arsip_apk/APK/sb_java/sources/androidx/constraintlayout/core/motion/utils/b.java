package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public abstract class b {

    public static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public double f21087a;

        /* renamed from: b, reason: collision with root package name */
        public double[] f21088b;

        public a(double r1, double[] r3) {
            this.f21087a = r1;
            this.f21088b = r3;
        }

        @Override // androidx.constraintlayout.core.motion.utils.b
        public double c(double r1, int r3) {
            return this.f21088b[r3];
        }

        @Override // androidx.constraintlayout.core.motion.utils.b
        public void d(double r2, double[] r4) {
            double[] r22 = this.f21088b;
            System.arraycopy(r22, 0, r4, 0, r22.length);
        }

        @Override // androidx.constraintlayout.core.motion.utils.b
        public void e(double r3, float[] r5) {
            int r32 = 0;
        L3:
            double[] r4 = this.f21088b;
            if (r32 >= r4.length) goto L6;
            r5[r32] = (float) r4[r32];
            r32 = r32 + 1;
            goto L3
        }

        @Override // androidx.constraintlayout.core.motion.utils.b
        public double f(double r1, int r3) {
            return 0.0d;
        }

        @Override // androidx.constraintlayout.core.motion.utils.b
        public void g(double r3, double[] r5) {
            int r32 = 0;
        L4:
            if (r32 >= this.f21088b.length) goto L6;
            r5[r32] = 0.0d;
            r32 = r32 + 1;
            goto L4
        }

        @Override // androidx.constraintlayout.core.motion.utils.b
        public double[] h() {
            return new double[]{this.f21087a};
        }
    }

    public b() {
    }

    public static b a(int r3, double[] r4, double[][] r5) {
        if (r4.length != 1) goto L5;
        r3 = 2;
    L5:
        if (r3 == 0) goto L12;
        if (r3 == 2) goto L10;
        return new f(r4, r5);
    L10:
        return new a(r4[0], r5[0]);
    L12:
        return new g(r4, r5);
    }

    public static b b(int[] r1, double[] r2, double[][] r3) {
        return new androidx.constraintlayout.core.motion.utils.a(r1, r2, r3);
    }

    public abstract double c(double r1, int r3);

    public abstract void d(double r1, double[] r3);

    public abstract void e(double r1, float[] r3);

    public abstract double f(double r1, int r3);

    public abstract void g(double r1, double[] r3);

    public abstract double[] h();
}
