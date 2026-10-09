package com.stockbit.usecase.company.model.profile;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f156471a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156472b;

    /* renamed from: c, reason: collision with root package name */
    public final String f156473c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f156474e;

    /* renamed from: f, reason: collision with root package name */
    public final String f156475f;

    public a(String r2, String r3, String r4, String r5, String r6, String r7) {
        p.l(r2, "officeAddress");
        p.l(r3, "npwp");
        p.l(r4, "phone");
        p.l(r5, "fax");
        p.l(r6, "email");
        p.l(r7, "website");
        this.f156471a = r2;
        this.f156472b = r3;
        this.f156473c = r4;
        this.d = r5;
        this.f156474e = r6;
        this.f156475f = r7;
    }

    public final String a() {
        return this.f156474e;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f156472b;
    }

    public final String d() {
        return this.f156471a;
    }

    public final String e() {
        return this.f156473c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f156471a, r52.f156471a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156472b, r52.f156472b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f156473c, r52.f156473c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f156474e, r52.f156474e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f156475f, r52.f156475f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f156475f;
    }

    public int hashCode() {
        return (((((((((this.f156471a.hashCode() * 31) + this.f156472b.hashCode()) * 31) + this.f156473c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f156474e.hashCode()) * 31) + this.f156475f.hashCode();
    }

    public String toString() {
        return "CompanyProfileAddressUIState(officeAddress=" + this.f156471a + ", npwp=" + this.f156472b + ", phone=" + this.f156473c + ", fax=" + this.d + ", email=" + this.f156474e + ", website=" + this.f156475f + ")";
    }
}
