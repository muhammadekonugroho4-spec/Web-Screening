package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* loaded from: classes.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public static c f21089b;

    /* renamed from: c, reason: collision with root package name */
    public static String[] f21090c;

    /* renamed from: a, reason: collision with root package name */
    public String f21091a;

    public static class a extends c {

        /* renamed from: h, reason: collision with root package name */
        public static double f21092h = 0.01d;

        /* renamed from: i, reason: collision with root package name */
        public static double f21093i = 1.0E-4d;
        public double d;

        /* renamed from: e, reason: collision with root package name */
        public double f21094e;

        /* renamed from: f, reason: collision with root package name */
        public double f21095f;

        /* renamed from: g, reason: collision with root package name */
        public double f21096g;

        static {
        }

        public a(String r6) {
            this.f21091a = r6;
            int r02 = r6.indexOf(40);
            int r2 = r6.indexOf(44, r02);
            this.d = Double.parseDouble(r6.substring(r02 + 1, r2).trim());
            int r22 = r2 + 1;
            int r03 = r6.indexOf(44, r22);
            this.f21094e = Double.parseDouble(r6.substring(r22, r03).trim());
            int r04 = r03 + 1;
            int r1 = r6.indexOf(44, r04);
            this.f21095f = Double.parseDouble(r6.substring(r04, r1).trim());
            int r12 = r1 + 1;
            this.f21096g = Double.parseDouble(r6.substring(r12, r6.indexOf(41, r12)).trim());
        }

        @Override // androidx.constraintlayout.core.motion.utils.c
        public double a(double r9) {
            if (r9 > 0.0d) goto L6;
            return 0.0d;
        L6:
            if (r9 < 1.0d) goto L8;
            return 1.0d;
        L8:
            double r2 = 0.5d;
            double r4 = 0.5d;
        L10:
            if (r2 <= f21092h) goto L15;
            r2 = r2 * 0.5d;
            if (d(r4) < r9) goto L13;
            r4 = r4 - r2;
            goto L10
        L13:
            r4 = r4 + r2;
            goto L10
        L15:
            double r02 = r4 - r2;
            double r6 = d(r02);
            double r42 = r4 + r2;
            double r22 = d(r42);
            double r03 = e(r02);
            return (((e(r42) - r03) * (r9 - r6)) / (r22 - r6)) + r03;
        }

        @Override // androidx.constraintlayout.core.motion.utils.c
        public double b(double r9) {
            double r2 = 0.5d;
            double r4 = 0.5d;
        L4:
            if (r2 <= f21093i) goto L9;
            r2 = r2 * 0.5d;
            if (d(r4) < r9) goto L7;
            r4 = r4 - r2;
            goto L4
        L7:
            r4 = r4 + r2;
            goto L4
        L9:
            double r92 = r4 - r2;
            double r02 = d(r92);
            double r42 = r4 + r2;
            double r22 = d(r42);
            return (e(r42) - e(r92)) / (r22 - r02);
        }

        public final double d(double r7) {
            double r02 = 1.0d - r7;
            double r2 = 3.0d * r02;
            double r03 = (r02 * r2) * r7;
            double r22 = (r2 * r7) * r7;
            double r4 = (r7 * r7) * r7;
            return ((this.d * r03) + (this.f21095f * r22)) + r4;
        }

        public final double e(double r7) {
            double r02 = 1.0d - r7;
            double r2 = 3.0d * r02;
            double r03 = (r02 * r2) * r7;
            double r22 = (r2 * r7) * r7;
            double r4 = (r7 * r7) * r7;
            return ((this.f21094e * r03) + (this.f21096g * r22)) + r4;
        }
    }

    static {
        f21089b = new c();
        f21090c = new String[]{"standard", "accelerate", "decelerate", "linear"};
    }

    public c() {
        this.f21091a = "identity";
    }

    public static c c(String r2) {
        if (r2 != null) goto L6;
        return null;
    L6:
        if (r2.startsWith("cubic") == false) goto L10;
        return new a(r2);
    L10:
        if (r2.startsWith("spline") == false) goto L14;
        return new l(r2);
    L14:
        if (r2.startsWith("Schlick") == true) goto L16;
        char r02 = 65535;
        switch(r2.hashCode()) {
            case -1354466595: goto L41;
            case -1263948740: goto L37;
            case -1197605014: goto L33;
            case -1102672091: goto L29;
            case -749065269: goto L25;
            case 1312628413: goto L21;
            default: goto L44;
        };
    L44:
        switch(r02) {
            case 0: goto L58;
            case 1: goto L56;
            case 2: goto L54;
            case 3: goto L52;
            case 4: goto L50;
            case 5: goto L48;
            default: goto L45;
        };
    L45:
        System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(f21090c));
        return f21089b;
    L48:
        return new a("cubic(0.4, 0.0, 0.2, 1)");
    L50:
        return new a("cubic(0.34, 1.56, 0.64, 1)");
    L52:
        return new a("cubic(1, 1, 0, 0)");
    L54:
        return new a("cubic(0.36, 0, 0.66, -0.56)");
    L56:
        return new a("cubic(0.0, 0.0, 0.2, 0.95)");
    L58:
        return new a("cubic(0.4, 0.05, 0.8, 0.7)");
    L21:
        if (r2.equals("standard") == false) goto L44;
        r02 = 5;
        goto L44
    L25:
        if (r2.equals("overshoot") == false) goto L44;
        r02 = 4;
        goto L44
    L29:
        if (r2.equals("linear") == false) goto L44;
        r02 = 3;
        goto L44
    L33:
        if (r2.equals("anticipate") == false) goto L44;
        r02 = 2;
        goto L44
    L37:
        if (r2.equals("decelerate") == false) goto L44;
        r02 = 1;
        goto L44
    L41:
        if (r2.equals("accelerate") == false) goto L44;
        r02 = 0;
        goto L44
    L16:
        return new i(r2);
    }

    public double a(double r1) {
        return r1;
    }

    public double b(double r1) {
        return 1.0d;
    }

    public String toString() {
        return this.f21091a;
    }
}
