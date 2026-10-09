package com.stockbit.usecase.depositbalance.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f157522a;

    /* renamed from: b, reason: collision with root package name */
    public final String f157523b;

    /* renamed from: c, reason: collision with root package name */
    public final String f157524c;

    public a(String r2, String r3, String r4) {
        p.l(r2, "bankLogoUrl");
        p.l(r3, "accountName");
        p.l(r4, "accountNumber");
        this.f157522a = r2;
        this.f157523b = r3;
        this.f157524c = r4;
    }

    public final String a() {
        return this.f157523b;
    }

    public final String b() {
        return this.f157524c;
    }

    public final String c() {
        return this.f157522a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f157522a, r52.f157522a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157523b, r52.f157523b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f157524c, r52.f157524c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f157522a.hashCode() * 31) + this.f157523b.hashCode()) * 31) + this.f157524c.hashCode();
    }

    public String toString() {
        return "RdnBalanceUiState(bankLogoUrl=" + this.f157522a + ", accountName=" + this.f157523b + ", accountNumber=" + this.f157524c + ")";
    }
}
