package com.stockbit.usecase.movers.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f158504a;

    /* renamed from: b, reason: collision with root package name */
    public final double f158505b;

    /* renamed from: c, reason: collision with root package name */
    public final String f158506c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f158507e;

    /* renamed from: f, reason: collision with root package name */
    public final String f158508f;

    /* renamed from: g, reason: collision with root package name */
    public final String f158509g;

    /* renamed from: h, reason: collision with root package name */
    public final double f158510h;

    /* renamed from: i, reason: collision with root package name */
    public final String f158511i;

    /* renamed from: j, reason: collision with root package name */
    public final String f158512j;

    public a(String r2, double r3, String r5, String r6, String r7, String r8, String r9, double r10, String r12, String r13) {
        p.l(r2, "iep");
        p.l(r5, "iepChange");
        p.l(r6, "iepPercentage");
        p.l(r7, "iev");
        p.l(r8, "ieval");
        p.l(r9, "prev");
        p.l(r12, "prevChange");
        p.l(r13, "prevPercentage");
        this.f158504a = r2;
        this.f158505b = r3;
        this.f158506c = r5;
        this.d = r6;
        this.f158507e = r7;
        this.f158508f = r8;
        this.f158509g = r9;
        this.f158510h = r10;
        this.f158511i = r12;
        this.f158512j = r13;
    }

    public final String a() {
        return this.f158504a;
    }

    public final String b() {
        return this.f158506c;
    }

    public final String c() {
        return this.d;
    }

    public final double d() {
        return this.f158505b;
    }

    public final String e() {
        return this.f158507e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f158504a, r82.f158504a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f158505b, r82.f158505b) == 0) goto L15;
        return false;
    L15:
        if (p.g(this.f158506c, r82.f158506c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f158507e, r82.f158507e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f158508f, r82.f158508f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f158509g, r82.f158509g) == true) goto L30;
        return false;
    L30:
        if (Double.compare(this.f158510h, r82.f158510h) == 0) goto L33;
        return false;
    L33:
        if (p.g(this.f158511i, r82.f158511i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f158512j, r82.f158512j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.f158508f;
    }

    public final String g() {
        return this.f158509g;
    }

    public final String h() {
        return this.f158511i;
    }

    public int hashCode() {
        return (((((((((((((((((this.f158504a.hashCode() * 31) + Double.hashCode(this.f158505b)) * 31) + this.f158506c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f158507e.hashCode()) * 31) + this.f158508f.hashCode()) * 31) + this.f158509g.hashCode()) * 31) + Double.hashCode(this.f158510h)) * 31) + this.f158511i.hashCode()) * 31) + this.f158512j.hashCode();
    }

    public final String i() {
        return this.f158512j;
    }

    public final double j() {
        return this.f158510h;
    }

    public String toString() {
        return "IepIevMoversUIState(iep=" + this.f158504a + ", iepRaw=" + this.f158505b + ", iepChange=" + this.f158506c + ", iepPercentage=" + this.d + ", iev=" + this.f158507e + ", ieval=" + this.f158508f + ", prev=" + this.f158509g + ", prevRaw=" + this.f158510h + ", prevChange=" + this.f158511i + ", prevPercentage=" + this.f158512j + ")";
    }
}
