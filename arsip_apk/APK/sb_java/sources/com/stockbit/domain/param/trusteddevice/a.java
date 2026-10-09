package com.stockbit.domain.param.trusteddevice;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f87622a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87623b;

    /* renamed from: c, reason: collision with root package name */
    public final String f87624c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f87625e;

    public a(String r2, String r3, String r4, String r5, String r6) {
        p.l(r2, "token");
        p.l(r3, "identity");
        p.l(r4, "birthDate");
        p.l(r5, "bankAccountNumber");
        p.l(r6, "motherName");
        this.f87622a = r2;
        this.f87623b = r3;
        this.f87624c = r4;
        this.d = r5;
        this.f87625e = r6;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f87624c;
    }

    public final String c() {
        return this.f87623b;
    }

    public final String d() {
        return this.f87625e;
    }

    public final String e() {
        return this.f87622a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f87622a, r52.f87622a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87623b, r52.f87623b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f87624c, r52.f87624c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f87625e, r52.f87625e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f87622a.hashCode() * 31) + this.f87623b.hashCode()) * 31) + this.f87624c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f87625e.hashCode();
    }

    public String toString() {
        return "RecoveryValidateIdentityDomainParam(token=" + this.f87622a + ", identity=" + this.f87623b + ", birthDate=" + this.f87624c + ", bankAccountNumber=" + this.d + ", motherName=" + this.f87625e + ")";
    }
}
