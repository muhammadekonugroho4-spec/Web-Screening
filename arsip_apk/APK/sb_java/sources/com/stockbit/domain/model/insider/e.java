package com.stockbit.domain.model.insider;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f84161a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84162b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f84163c;
    public final List d;

    public e(String r2, String r3, boolean r4, List r5) {
        p.l(r2, "symbol");
        p.l(r3, "companyName");
        p.l(r5, FirebaseAnalytics.Param.ITEMS);
        this.f84161a = r2;
        this.f84162b = r3;
        this.f84163c = r4;
        this.d = r5;
    }

    public static /* synthetic */ e b(e r02, String r1, String r2, boolean r3, List r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r02.f84161a;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r02.f84162b;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r02.f84163c;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        return r02.a(r1, r2, r3, r4);
    }

    public final e a(String r2, String r3, boolean r4, List r5) {
        p.l(r2, "symbol");
        p.l(r3, "companyName");
        p.l(r5, FirebaseAnalytics.Param.ITEMS);
        return new e(r2, r3, r4, r5);
    }

    public final String c() {
        return this.f84162b;
    }

    public final List d() {
        return this.d;
    }

    public final String e() {
        return this.f84161a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f84161a, r52.f84161a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84162b, r52.f84162b) == true) goto L15;
        return false;
    L15:
        if (this.f84163c == r52.f84163c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public final boolean f() {
        return this.f84163c;
    }

    public int hashCode() {
        return (((((this.f84161a.hashCode() * 31) + this.f84162b.hashCode()) * 31) + Boolean.hashCode(this.f84163c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "InsiderDetailListEntity(symbol=" + this.f84161a + ", companyName=" + this.f84162b + ", isMore=" + this.f84163c + ", items=" + this.d + ")";
    }
}
