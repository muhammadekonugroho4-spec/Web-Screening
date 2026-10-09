package com.stockbit.feature.cryptoportfolio.contract;

import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f94657a;

    /* renamed from: b, reason: collision with root package name */
    public final String f94658b;

    /* renamed from: c, reason: collision with root package name */
    public final String f94659c;

    public a(String r2, String r3, String r4) {
        p.l(r2, "coinSymbol");
        p.l(r3, "coinName");
        p.l(r4, "coinLogo");
        this.f94657a = r2;
        this.f94658b = r3;
        this.f94659c = r4;
    }

    public final String a() {
        return this.f94659c;
    }

    public final String b() {
        return this.f94658b;
    }

    public final String c() {
        return this.f94657a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f94657a, r52.f94657a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f94658b, r52.f94658b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f94659c, r52.f94659c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f94657a.hashCode() * 31) + this.f94658b.hashCode()) * 31) + this.f94659c.hashCode();
    }

    public String toString() {
        return "CryptoPortfolioContractArgs(coinSymbol=" + this.f94657a + ", coinName=" + this.f94658b + ", coinLogo=" + this.f94659c + ')';
    }
}
