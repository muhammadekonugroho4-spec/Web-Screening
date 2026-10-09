package com.stockbit.lib.pocket.domain;

/* loaded from: classes10.dex */
public final class g implements k {

    /* renamed from: a, reason: collision with root package name */
    public final double f120352a;

    public /* synthetic */ g(double r1) {
        this.f120352a = r1;
    }

    public static final /* synthetic */ g a(double r1) {
        return new g(r1);
    }

    public static double b(double r02) {
        return r02;
    }

    public static boolean c(double r4, Object r6) {
        if ((r6 instanceof g) == true) goto L6;
        return false;
    L6:
        if (Double.compare(r4, ((g) r6).f()) == 0) goto L8;
        return false;
    L8:
        return true;
    }

    public static int d(double r02) {
        return Double.hashCode(r02);
    }

    public static String e(double r02) {
        return String.valueOf(r02);
    }

    public boolean equals(Object r3) {
        return c(this.f120352a, r3);
    }

    public final /* synthetic */ double f() {
        return this.f120352a;
    }

    public int hashCode() {
        return d(this.f120352a);
    }

    public String toString() {
        return e(this.f120352a);
    }
}
