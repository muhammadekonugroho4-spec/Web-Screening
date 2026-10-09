package com.stockbit.domain.model.company.profile;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f81783a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81784b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81785c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f81786e;

    /* renamed from: f, reason: collision with root package name */
    public final String f81787f;

    public a(String r2, String r3, String r4, String r5, String r6, String r7) {
        p.l(r2, "officeAddress");
        p.l(r3, "npwp");
        p.l(r4, "phone");
        p.l(r5, "fax");
        p.l(r6, "email");
        p.l(r7, "website");
        this.f81783a = r2;
        this.f81784b = r3;
        this.f81785c = r4;
        this.d = r5;
        this.f81786e = r6;
        this.f81787f = r7;
    }

    public final String a() {
        return this.f81786e;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f81784b;
    }

    public final String d() {
        return this.f81783a;
    }

    public final String e() {
        return this.f81785c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f81783a, r52.f81783a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81784b, r52.f81784b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81785c, r52.f81785c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f81786e, r52.f81786e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f81787f, r52.f81787f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f81787f;
    }

    public int hashCode() {
        return (((((((((this.f81783a.hashCode() * 31) + this.f81784b.hashCode()) * 31) + this.f81785c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f81786e.hashCode()) * 31) + this.f81787f.hashCode();
    }

    public String toString() {
        return "CompanyProfileAddressEntity(officeAddress=" + this.f81783a + ", npwp=" + this.f81784b + ", phone=" + this.f81785c + ", fax=" + this.d + ", email=" + this.f81786e + ", website=" + this.f81787f + ")";
    }
}
