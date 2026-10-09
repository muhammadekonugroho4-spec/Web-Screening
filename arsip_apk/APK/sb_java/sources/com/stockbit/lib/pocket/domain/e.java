package com.stockbit.lib.pocket.domain;

/* loaded from: classes10.dex */
public final class e implements k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f120334a;

    public /* synthetic */ e(boolean r1) {
        this.f120334a = r1;
    }

    public static final /* synthetic */ e a(boolean r1) {
        return new e(r1);
    }

    public static boolean b(boolean r02) {
        return r02;
    }

    public static boolean c(boolean r2, Object r3) {
        if ((r3 instanceof e) == true) goto L6;
        return false;
    L6:
        if (r2 == ((e) r3).f()) goto L8;
        return false;
    L8:
        return true;
    }

    public static int d(boolean r02) {
        return Boolean.hashCode(r02);
    }

    public static String e(boolean r02) {
        return String.valueOf(r02);
    }

    public boolean equals(Object r2) {
        return c(this.f120334a, r2);
    }

    public final /* synthetic */ boolean f() {
        return this.f120334a;
    }

    public int hashCode() {
        return d(this.f120334a);
    }

    public String toString() {
        return e(this.f120334a);
    }
}
