package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes.dex */
public class l extends c {
    public g d;

    public l(String r9) {
        this.f21091a = r9;
        double[] r02 = new double[r9.length() / 2];
        int r1 = r9.indexOf(40) + 1;
        int r3 = r9.indexOf(44, r1);
        int r4 = 0;
    L4:
        if (r3 == (-1)) goto L6;
        r02[r4] = Double.parseDouble(r9.substring(r1, r3).trim());
        r1 = r3 + 1;
        r3 = r9.indexOf(44, r1);
        r4 = r4 + 1;
        goto L4
    L6:
        String r92 = r9.substring(r1, r9.indexOf(41, r1)).trim();
        r02[r4] = Double.parseDouble(r92);
        this.d = d(Arrays.copyOf(r02, r4 + 1));
    }

    public static g d(double[] r18) {
        int r1 = (r18.length * 3) - 2;
        int r3 = r18.length - 1;
        double r5 = 1.0d / r3;
        double[][] r2 = (double[][]) Array.newInstance(Double.TYPE, new int[]{r1, 1});
        double[] r12 = new double[r1];
        int r9 = 0;
    L4:
        if (r9 >= r18.length) goto L9;
        double r10 = r18[r9];
        int r122 = r9 + r3;
        r2[r122][0] = r10;
        double r13 = r9 * r5;
        r12[r122] = r13;
        if (r9 <= 0) goto L8;
        int r123 = (r3 * 2) + r9;
        r2[r123][0] = r10 + 1.0d;
        r12[r123] = r13 + 1.0d;
        int r124 = r9 - 1;
        r2[r124][0] = (r10 - 1.0d) - r5;
        r12[r124] = (r13 - 1.0d) - r5;
    L8:
        r9 = r9 + 1;
        goto L4
    L9:
        g r02 = new g(r12, r2);
        System.out.println(" 0 " + r02.c(0.0d, 0));
        System.out.println(" 1 " + r02.c(1.0d, 0));
        return r02;
    }

    @Override // androidx.constraintlayout.core.motion.utils.c
    public double a(double r3) {
        return this.d.c(r3, 0);
    }

    @Override // androidx.constraintlayout.core.motion.utils.c
    public double b(double r3) {
        return this.d.f(r3, 0);
    }
}
