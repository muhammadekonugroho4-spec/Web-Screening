package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public float[] f21128a;

    /* renamed from: b, reason: collision with root package name */
    public double[] f21129b;

    /* renamed from: c, reason: collision with root package name */
    public double[] f21130c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public g f21131e;

    /* renamed from: f, reason: collision with root package name */
    public int f21132f;

    /* renamed from: g, reason: collision with root package name */
    public double f21133g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21134h;

    static {
    }

    public h() {
        this.f21128a = new float[0];
        this.f21129b = new double[0];
        this.f21133g = 6.283185307179586d;
        this.f21134h = false;
    }

    public void a(double r5, float r7) {
        int r02 = this.f21128a.length + 1;
        int r1 = Arrays.binarySearch(this.f21129b, r5);
        if (r1 >= 0) goto L5;
        r1 = (-r1) - 1;
    L5:
        this.f21129b = Arrays.copyOf(this.f21129b, r02);
        this.f21128a = Arrays.copyOf(this.f21128a, r02);
        this.f21130c = new double[r02];
        double[] r2 = this.f21129b;
        System.arraycopy(r2, r1, r2, r1 + 1, (r02 - r1) - 1);
        this.f21129b[r1] = r5;
        this.f21128a[r1] = r7;
        this.f21134h = false;
    }

    public double b(double r11) {
        if (r11 > 0.0d) goto L6;
        return 0.0d;
    L6:
        if (r11 < 1.0d) goto L8;
        return 1.0d;
    L8:
        int r02 = Arrays.binarySearch(this.f21129b, r11);
        if (r02 >= 0) goto L11;
        r02 = (-r02) - 1;
    L11:
        float[] r1 = this.f21128a;
        float r2 = r1[r02];
        int r3 = r02 - 1;
        float r12 = r1[r3];
        double r4 = r2 - r12;
        double[] r22 = this.f21129b;
        double r6 = r22[r02];
        double r8 = r22[r3];
        double r42 = r4 / (r6 - r8);
        return (r11 * r42) + (r12 - (r42 * r8));
    }

    public double c(double r11) {
        if (r11 > 0.0d) goto L6;
        return 0.0d;
    L6:
        if (r11 < 1.0d) goto L8;
        return 1.0d;
    L8:
        int r02 = Arrays.binarySearch(this.f21129b, r11);
        if (r02 >= 0) goto L11;
        r02 = (-r02) - 1;
    L11:
        float[] r1 = this.f21128a;
        float r2 = r1[r02];
        int r3 = r02 - 1;
        float r12 = r1[r3];
        double r4 = r2 - r12;
        double[] r22 = this.f21129b;
        double r6 = r22[r02];
        double r8 = r22[r3];
        double r42 = r4 / (r6 - r8);
        return (this.f21130c[r3] + ((r12 - (r42 * r8)) * (r11 - r8))) + ((r42 * ((r11 * r11) - (r8 * r8))) / 2.0d);
    }

    public double d(double r5, double r7, double r9) {
        double r72 = r7 + c(r5);
        double r52 = b(r5) + r9;
        switch(this.f21132f) {
            case 1: goto L18;
            case 2: goto L17;
            case 3: goto L15;
            case 4: goto L13;
            case 5: goto L10;
            case 6: goto L9;
            case 7: goto L7;
            default: goto L4;
        };
    L4:
        double r92 = this.f21133g;
        return (r52 * r92) * Math.cos(r92 * r72);
    L10:
        double r93 = this.f21133g;
        return ((-r93) * r52) * Math.sin(r93 * r72);
    L18:
        return 0.0d;
    L7:
        return this.f21131e.f(r72 % 1.0d, 0);
    L9:
        return (r52 * 4.0d) * ((((r72 * 4.0d) + 2.0d) % 4.0d) - 2.0d);
    L13:
        return (-r52) * 2.0d;
    L15:
        return r52 * 2.0d;
    L17:
        return (r52 * 4.0d) * Math.signum((((r72 * 4.0d) + 3.0d) % 4.0d) - 2.0d);
    }

    public double e(double r8, double r10) {
        double r82 = c(r8) + r10;
        switch(this.f21132f) {
            case 1: goto L18;
            case 2: goto L16;
            case 3: goto L15;
            case 4: goto L13;
            case 5: goto L12;
            case 6: goto L8;
            case 7: goto L7;
            default: goto L5;
        };
    L8:
        double r83 = 1.0d - Math.abs(((r82 * 4.0d) % 4.0d) - 2.0d);
        double r84 = r83 * r83;
    L10:
        return 1.0d - r84;
    L13:
        r84 = ((r82 * 2.0d) + 1.0d) % 2.0d;
        goto L10
    L16:
        r84 = Math.abs((((r82 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
        goto L10
    L5:
        return Math.sin(this.f21133g * r82);
    L7:
        return this.f21131e.c(r82 % 1.0d, 0);
    L12:
        return Math.cos(this.f21133g * (r10 + r82));
    L15:
        return (((r82 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
    L18:
        return Math.signum(0.5d - (r82 % 1.0d));
    }

    public void f() {
        double r4 = 0.0d;
        int r3 = 0;
    L4:
        if (r3 >= this.f21128a.length) goto L6;
        r4 = r4 + r6[r3];
        r3 = r3 + 1;
        goto L4
    L6:
        double r7 = 0.0d;
        int r6 = 1;
    L7:
        float[] r9 = this.f21128a;
        if (r6 >= r9.length) goto L10;
        int r10 = r6 - 1;
        float r12 = (r9[r10] + r9[r6]) / 2.0f;
        double[] r92 = this.f21129b;
        r7 = r7 + ((r92[r6] - r92[r10]) * r12);
        r6 = r6 + 1;
        goto L7
    L10:
        int r62 = 0;
    L11:
        float[] r93 = this.f21128a;
        if (r62 >= r93.length) goto L14;
        r93[r62] = r93[r62] * ((float) (r4 / r7));
        r62 = r62 + 1;
        goto L11
    L14:
        this.f21130c[0] = 0.0d;
        int r02 = 1;
    L15:
        float[] r1 = this.f21128a;
        if (r02 >= r1.length) goto L18;
        int r2 = r02 - 1;
        float r42 = (r1[r2] + r1[r02]) / 2.0f;
        double[] r13 = this.f21129b;
        double r5 = r13[r02] - r13[r2];
        double[] r14 = this.f21130c;
        r14[r02] = r14[r2] + (r5 * r42);
        r02 = r02 + 1;
        goto L15
    L18:
        this.f21134h = true;
    }

    public void g(int r1, String r2) {
        this.f21132f = r1;
        this.d = r2;
        if (r2 == null) goto L6;
        this.f21131e = g.i(r2);
        return;
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f21129b) + " period=" + Arrays.toString(this.f21128a);
    }
}
