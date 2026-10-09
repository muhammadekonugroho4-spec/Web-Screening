package com.stockbit.domains.usecase.tradingaccount.model.tradingprofile;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f88543a;

    /* renamed from: b, reason: collision with root package name */
    public final String f88544b;

    /* renamed from: c, reason: collision with root package name */
    public final String f88545c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f88546e;

    /* renamed from: f, reason: collision with root package name */
    public final String f88547f;

    /* renamed from: g, reason: collision with root package name */
    public final String f88548g;

    public e(String r2, String r3, String r4, String r5, String r6, String r7, String r8) {
        p.l(r2, "personalIdentityName");
        p.l(r3, "personalIdentityNumber");
        p.l(r4, "personalIdentityAddress");
        p.l(r5, "personalIdentityDomicileAddress");
        p.l(r6, "personalIdentityBirthDate");
        p.l(r7, "personalIdentityTax");
        p.l(r8, "personalIdentityMaritalStatus");
        this.f88543a = r2;
        this.f88544b = r3;
        this.f88545c = r4;
        this.d = r5;
        this.f88546e = r6;
        this.f88547f = r7;
        this.f88548g = r8;
    }

    public final String a() {
        return this.f88545c;
    }

    public final String b() {
        return this.f88546e;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f88548g;
    }

    public final String e() {
        return this.f88543a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f88543a, r52.f88543a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f88544b, r52.f88544b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f88545c, r52.f88545c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f88546e, r52.f88546e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f88547f, r52.f88547f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f88548g, r52.f88548g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public int hashCode() {
        return (((((((((((this.f88543a.hashCode() * 31) + this.f88544b.hashCode()) * 31) + this.f88545c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f88546e.hashCode()) * 31) + this.f88547f.hashCode()) * 31) + this.f88548g.hashCode();
    }

    public String toString() {
        return "TradingProfilePersonalUIState(personalIdentityName=" + this.f88543a + ", personalIdentityNumber=" + this.f88544b + ", personalIdentityAddress=" + this.f88545c + ", personalIdentityDomicileAddress=" + this.d + ", personalIdentityBirthDate=" + this.f88546e + ", personalIdentityTax=" + this.f88547f + ", personalIdentityMaritalStatus=" + this.f88548g + ")";
    }
}
