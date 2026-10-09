package com.stockbit.lib.pocket.domain;

import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class i implements k {

    /* renamed from: a, reason: collision with root package name */
    public final String f120354a;

    public /* synthetic */ i(String r1) {
        this.f120354a = r1;
    }

    public static final /* synthetic */ i a(String r1) {
        return new i(r1);
    }

    public static String b(String r1) {
        p.l(r1, "value");
        return r1;
    }

    public static boolean c(String r2, Object r3) {
        if ((r3 instanceof i) == true) goto L6;
        return false;
    L6:
        if (p.g(r2, ((i) r3).f()) == true) goto L8;
        return false;
    L8:
        return true;
    }

    public static int d(String r02) {
        return r02.hashCode();
    }

    public static String e(String r02) {
        return r02;
    }

    public boolean equals(Object r2) {
        return c(this.f120354a, r2);
    }

    public final /* synthetic */ String f() {
        return this.f120354a;
    }

    public int hashCode() {
        return d(this.f120354a);
    }

    public String toString() {
        return e(this.f120354a);
    }
}
