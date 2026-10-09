package com.stockbit.lib.pocket.domain;

/* loaded from: classes10.dex */
public final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    public final int f120353a;

    public /* synthetic */ h(int r1) {
        this.f120353a = r1;
    }

    public static final /* synthetic */ h a(int r1) {
        return new h(r1);
    }

    public static int b(int r02) {
        return r02;
    }

    public static boolean c(int r2, Object r3) {
        if ((r3 instanceof h) == true) goto L6;
        return false;
    L6:
        if (r2 == ((h) r3).f()) goto L8;
        return false;
    L8:
        return true;
    }

    public static int d(int r02) {
        return Integer.hashCode(r02);
    }

    public static String e(int r02) {
        return String.valueOf(r02);
    }

    public boolean equals(Object r2) {
        return c(this.f120353a, r2);
    }

    public final /* synthetic */ int f() {
        return this.f120353a;
    }

    public int hashCode() {
        return d(this.f120353a);
    }

    public String toString() {
        return e(this.f120353a);
    }
}
