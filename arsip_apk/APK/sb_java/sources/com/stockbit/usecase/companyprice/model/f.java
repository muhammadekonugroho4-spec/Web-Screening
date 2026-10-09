package com.stockbit.usecase.companyprice.model;

import com.stockbit.company.CompanyEntryPoint;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f156997a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156998b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156999c;
    public final String d;

    public f(String r2, String r3, String r4, String r5) {
        p.l(r2, "code");
        p.l(r3, CompanyEntryPoint.EXTRA_DESC);
        p.l(r4, "lightModeImage");
        p.l(r5, "darkModeImage");
        this.f156997a = r2;
        this.f156998b = r3;
        this.f156999c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f156997a;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f156998b;
    }

    public final String d() {
        return this.f156999c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f156997a, r52.f156997a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156998b, r52.f156998b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f156999c, r52.f156999c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f156997a.hashCode() * 31) + this.f156998b.hashCode()) * 31) + this.f156999c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "NotationUiState(code=" + this.f156997a + ", desc=" + this.f156998b + ", lightModeImage=" + this.f156999c + ", darkModeImage=" + this.d + ")";
    }
}
