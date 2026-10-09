package com.stockbit.domain.model.company.margintrading;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f81688a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81689b;

    /* renamed from: c, reason: collision with root package name */
    public final int f81690c;

    public a(boolean r2, String r3, int r4) {
        p.l(r3, "hairCutPercentage");
        this.f81688a = r2;
        this.f81689b = r3;
        this.f81690c = r4;
    }

    public final String a() {
        return this.f81689b;
    }

    public final int b() {
        return this.f81690c;
    }

    public final boolean c() {
        return this.f81688a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f81688a == r52.f81688a) goto L12;
        return false;
    L12:
        if (p.g(this.f81689b, r52.f81689b) == true) goto L15;
        return false;
    L15:
        if (this.f81690c == r52.f81690c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f81688a) * 31) + this.f81689b.hashCode()) * 31) + Integer.hashCode(this.f81690c);
    }

    public String toString() {
        return "CompanyMarginTradingInfoEntity(isMarginTrading=" + this.f81688a + ", hairCutPercentage=" + this.f81689b + ", hairCutPercentageRaw=" + this.f81690c + ")";
    }
}
