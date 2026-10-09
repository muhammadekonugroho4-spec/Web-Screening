package com.stockbit.domain.model.margintrading;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f84301a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84302b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84303c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final long f84304e;

    /* renamed from: f, reason: collision with root package name */
    public final long f84305f;

    public a(String r2, String r3, String r4, String r5, long r6, long r8) {
        p.l(r2, "buyingPower");
        p.l(r3, "holdingPeriod");
        p.l(r4, "interestRate");
        p.l(r5, "minEquityFormatted");
        this.f84301a = r2;
        this.f84302b = r3;
        this.f84303c = r4;
        this.d = r5;
        this.f84304e = r6;
        this.f84305f = r8;
    }

    public final String a() {
        return this.f84301a;
    }

    public final String b() {
        return this.f84302b;
    }

    public final String c() {
        return this.f84303c;
    }

    public final String d() {
        return this.d;
    }

    public final long e() {
        return this.f84304e;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f84301a, r82.f84301a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84302b, r82.f84302b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84303c, r82.f84303c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (this.f84304e == r82.f84304e) goto L24;
        return false;
    L24:
        if (this.f84305f == r82.f84305f) goto L26;
        return false;
    L26:
        return true;
    }

    public final long f() {
        return this.f84305f;
    }

    public int hashCode() {
        return (((((((((this.f84301a.hashCode() * 31) + this.f84302b.hashCode()) * 31) + this.f84303c.hashCode()) * 31) + this.d.hashCode()) * 31) + Long.hashCode(this.f84304e)) * 31) + Long.hashCode(this.f84305f);
    }

    public String toString() {
        return "MarginTradingActivationEntity(buyingPower=" + this.f84301a + ", holdingPeriod=" + this.f84302b + ", interestRate=" + this.f84303c + ", minEquityFormatted=" + this.d + ", minEquityRaw=" + this.f84304e + ", userEquityRaw=" + this.f84305f + ")";
    }
}
