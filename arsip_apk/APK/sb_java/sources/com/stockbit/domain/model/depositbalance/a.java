package com.stockbit.domain.model.depositbalance;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f82078a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82079b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82080c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82081e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f82082f;

    public a(String r2, String r3, String r4, String r5, String r6, boolean r7) {
        p.l(r2, "bankCode");
        p.l(r3, "bankName");
        p.l(r4, "bankLogo");
        p.l(r5, "accountName");
        p.l(r6, "accountNo");
        this.f82078a = r2;
        this.f82079b = r3;
        this.f82080c = r4;
        this.d = r5;
        this.f82081e = r6;
        this.f82082f = r7;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f82081e;
    }

    public final String c() {
        return this.f82080c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f82078a, r52.f82078a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82079b, r52.f82079b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82080c, r52.f82080c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f82081e, r52.f82081e) == true) goto L24;
        return false;
    L24:
        if (this.f82082f == r52.f82082f) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        return (((((((((this.f82078a.hashCode() * 31) + this.f82079b.hashCode()) * 31) + this.f82080c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82081e.hashCode()) * 31) + Boolean.hashCode(this.f82082f);
    }

    public String toString() {
        return "RdnBalanceEntity(bankCode=" + this.f82078a + ", bankName=" + this.f82079b + ", bankLogo=" + this.f82080c + ", accountName=" + this.d + ", accountNo=" + this.f82081e + ", foreignAccount=" + this.f82082f + ")";
    }
}
