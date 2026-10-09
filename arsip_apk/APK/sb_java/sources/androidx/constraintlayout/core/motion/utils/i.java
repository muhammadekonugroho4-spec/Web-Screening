package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class i extends c {
    public double d;

    /* renamed from: e, reason: collision with root package name */
    public double f21135e;

    public i(String r6) {
        this.f21091a = r6;
        int r02 = r6.indexOf(40);
        int r2 = r6.indexOf(44, r02);
        this.d = Double.parseDouble(r6.substring(r02 + 1, r2).trim());
        int r22 = r2 + 1;
        this.f21135e = Double.parseDouble(r6.substring(r22, r6.indexOf(44, r22)).trim());
    }

    @Override // androidx.constraintlayout.core.motion.utils.c
    public double a(double r1) {
        return e(r1);
    }

    @Override // androidx.constraintlayout.core.motion.utils.c
    public double b(double r1) {
        return d(r1);
    }

    public final double d(double r13) {
        double r02 = this.f21135e;
        if (r13 >= r02) goto L6;
        double r2 = this.d;
        return ((r2 * r02) * r02) / ((((r02 - r13) * r2) + r13) * ((r2 * (r02 - r13)) + r13));
    L6:
        double r22 = this.d;
        return (((r02 - 1.0d) * r22) * (r02 - 1.0d)) / (((((-r22) * (r02 - r13)) - r13) + 1.0d) * ((((-r22) * (r02 - r13)) - r13) + 1.0d));
    }

    public final double e(double r9) {
        double r02 = this.f21135e;
        if (r9 >= r02) goto L7;
        return (r02 * r9) / (r9 + (this.d * (r02 - r9)));
    L7:
        return ((1.0d - r02) * (r9 - 1.0d)) / ((1.0d - r9) - (this.d * (r02 - r9)));
    }
}
