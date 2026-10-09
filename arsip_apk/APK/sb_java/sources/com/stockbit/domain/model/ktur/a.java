package com.stockbit.domain.model.ktur;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f84208a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84209b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84210c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84211e;

    /* renamed from: f, reason: collision with root package name */
    public final String f84212f;

    /* renamed from: g, reason: collision with root package name */
    public final String f84213g;

    public a(String r2, String r3, String r4, String r5, String r6, String r7, String r8) {
        p.l(r2, "companySymbol");
        p.l(r3, "companyName");
        p.l(r4, "rupsId");
        p.l(r5, "rupsEventAt");
        p.l(r6, "rupsVenue");
        p.l(r7, "downloadUrl");
        p.l(r8, "logo");
        this.f84208a = r2;
        this.f84209b = r3;
        this.f84210c = r4;
        this.d = r5;
        this.f84211e = r6;
        this.f84212f = r7;
        this.f84213g = r8;
    }

    public final String a() {
        return this.f84209b;
    }

    public final String b() {
        return this.f84208a;
    }

    public final String c() {
        return this.f84212f;
    }

    public final String d() {
        return this.f84213g;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f84208a, r52.f84208a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84209b, r52.f84209b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84210c, r52.f84210c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f84211e, r52.f84211e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f84212f, r52.f84212f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f84213g, r52.f84213g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.f84211e;
    }

    public int hashCode() {
        return (((((((((((this.f84208a.hashCode() * 31) + this.f84209b.hashCode()) * 31) + this.f84210c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f84211e.hashCode()) * 31) + this.f84212f.hashCode()) * 31) + this.f84213g.hashCode();
    }

    public String toString() {
        return "KTUREntity(companySymbol=" + this.f84208a + ", companyName=" + this.f84209b + ", rupsId=" + this.f84210c + ", rupsEventAt=" + this.d + ", rupsVenue=" + this.f84211e + ", downloadUrl=" + this.f84212f + ", logo=" + this.f84213g + ")";
    }
}
