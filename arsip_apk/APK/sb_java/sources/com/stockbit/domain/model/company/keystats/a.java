package com.stockbit.domain.model.company.keystats;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f81649a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81650b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81651c;
    public final String d;

    public a(String r2, String r3, String r4, String r5) {
        p.l(r2, "period");
        p.l(r3, "dividend");
        p.l(r4, "exDate");
        p.l(r5, "paymentDate");
        this.f81649a = r2;
        this.f81650b = r3;
        this.f81651c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f81650b;
    }

    public final String b() {
        return this.f81651c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f81649a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f81649a, r52.f81649a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81650b, r52.f81650b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81651c, r52.f81651c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f81649a.hashCode() * 31) + this.f81650b.hashCode()) * 31) + this.f81651c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "KeyStatsDividendEntity(period=" + this.f81649a + ", dividend=" + this.f81650b + ", exDate=" + this.f81651c + ", paymentDate=" + this.d + ")";
    }
}
