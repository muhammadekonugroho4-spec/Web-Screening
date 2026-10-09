package com.stockbit.lib.pocket.domain;

/* loaded from: classes10.dex */
public final class f implements k {

    /* renamed from: a, reason: collision with root package name */
    public final char f120351a;

    public /* synthetic */ f(char r1) {
        this.f120351a = r1;
    }

    public static final /* synthetic */ f a(char r1) {
        return new f(r1);
    }

    public static char b(char r02) {
        return r02;
    }

    public static boolean c(char r2, Object r3) {
        if ((r3 instanceof f) == true) goto L6;
        return false;
    L6:
        if (r2 == ((f) r3).f()) goto L8;
        return false;
    L8:
        return true;
    }

    public static int d(char r02) {
        return Character.hashCode(r02);
    }

    public static String e(char r02) {
        return String.valueOf(r02);
    }

    public boolean equals(Object r2) {
        return c(this.f120351a, r2);
    }

    public final /* synthetic */ char f() {
        return this.f120351a;
    }

    public int hashCode() {
        return d(this.f120351a);
    }

    public String toString() {
        return e(this.f120351a);
    }
}
