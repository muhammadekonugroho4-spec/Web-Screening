package com.stockbit.domain.model.company.profile;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final List f81808a;

    /* renamed from: b, reason: collision with root package name */
    public final List f81809b;

    /* renamed from: c, reason: collision with root package name */
    public final List f81810c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final List f81811e;

    /* renamed from: f, reason: collision with root package name */
    public final List f81812f;

    /* renamed from: g, reason: collision with root package name */
    public final List f81813g;

    /* renamed from: h, reason: collision with root package name */
    public final List f81814h;

    /* renamed from: i, reason: collision with root package name */
    public final List f81815i;

    public f(List r2, List r3, List r4, List r5, List r6, List r7, List r8, List r9, List r10) {
        p.l(r2, "presidentDirectors");
        p.l(r3, "vicePresidents");
        p.l(r4, "directors");
        p.l(r5, "presidentCommissioners");
        p.l(r6, "vicePresidentCommissioners");
        p.l(r7, "independentPresidentCommissioners");
        p.l(r8, "independentVicePresidentCommissioners");
        p.l(r9, "commissioners");
        p.l(r10, "independentCommissioners");
        this.f81808a = r2;
        this.f81809b = r3;
        this.f81810c = r4;
        this.d = r5;
        this.f81811e = r6;
        this.f81812f = r7;
        this.f81813g = r8;
        this.f81814h = r9;
        this.f81815i = r10;
    }

    public final List a() {
        return this.f81814h;
    }

    public final List b() {
        return this.f81810c;
    }

    public final List c() {
        return this.f81815i;
    }

    public final List d() {
        return this.f81812f;
    }

    public final List e() {
        return this.f81813g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f81808a, r52.f81808a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81809b, r52.f81809b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81810c, r52.f81810c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f81811e, r52.f81811e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f81812f, r52.f81812f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f81813g, r52.f81813g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f81814h, r52.f81814h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f81815i, r52.f81815i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final List f() {
        return this.d;
    }

    public final List g() {
        return this.f81808a;
    }

    public final List h() {
        return this.f81811e;
    }

    public int hashCode() {
        return (((((((((((((((this.f81808a.hashCode() * 31) + this.f81809b.hashCode()) * 31) + this.f81810c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f81811e.hashCode()) * 31) + this.f81812f.hashCode()) * 31) + this.f81813g.hashCode()) * 31) + this.f81814h.hashCode()) * 31) + this.f81815i.hashCode();
    }

    public final List i() {
        return this.f81809b;
    }

    public String toString() {
        return "CompanyProfileExecutiveEntity(presidentDirectors=" + this.f81808a + ", vicePresidents=" + this.f81809b + ", directors=" + this.f81810c + ", presidentCommissioners=" + this.d + ", vicePresidentCommissioners=" + this.f81811e + ", independentPresidentCommissioners=" + this.f81812f + ", independentVicePresidentCommissioners=" + this.f81813g + ", commissioners=" + this.f81814h + ", independentCommissioners=" + this.f81815i + ")";
    }
}
