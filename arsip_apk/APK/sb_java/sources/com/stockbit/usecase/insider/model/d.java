package com.stockbit.usecase.insider.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final e f158108a;

    /* renamed from: b, reason: collision with root package name */
    public final List f158109b;

    public d(e r2, List r3) {
        p.l(r2, "header");
        p.l(r3, FirebaseAnalytics.Param.ITEMS);
        this.f158108a = r2;
        this.f158109b = r3;
    }

    public static /* synthetic */ d d(d r02, e r1, List r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r02.f158108a;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r02.f158109b;
    L9:
        return r02.c(r1, r2);
    }

    public final e a() {
        return this.f158108a;
    }

    public final List b() {
        return this.f158109b;
    }

    public final d c(e r2, List r3) {
        p.l(r2, "header");
        p.l(r3, FirebaseAnalytics.Param.ITEMS);
        return new d(r2, r3);
    }

    public final e e() {
        return this.f158108a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f158108a, r52.f158108a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f158109b, r52.f158109b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final List f() {
        return this.f158109b;
    }

    public int hashCode() {
        return (this.f158108a.hashCode() * 31) + this.f158109b.hashCode();
    }

    public String toString() {
        return "InsiderDetailDataUIState(header=" + this.f158108a + ", items=" + this.f158109b + ")";
    }
}
