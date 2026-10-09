package com.stockbit.usecase.cryptotransaction.contract.param;

import com.stockbit.usecase.cryptotransaction.contract.entity.CryptoOrderType;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f157447a;

    /* renamed from: b, reason: collision with root package name */
    public final CryptoOrderType f157448b;

    /* renamed from: c, reason: collision with root package name */
    public final String f157449c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f157450e;

    public d(String r2, CryptoOrderType r3, String r4, String r5, String r6) {
        p.l(r2, "coinSymbol");
        p.l(r3, "orderType");
        this.f157447a = r2;
        this.f157448b = r3;
        this.f157449c = r4;
        this.d = r5;
        this.f157450e = r6;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f157447a;
    }

    public final CryptoOrderType c() {
        return this.f157448b;
    }

    public final String d() {
        return this.f157449c;
    }

    public final String e() {
        return this.f157450e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f157447a, r52.f157447a) == true) goto L12;
        return false;
    L12:
        if (this.f157448b == r52.f157448b) goto L15;
        return false;
    L15:
        if (p.g(this.f157449c, r52.f157449c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f157450e, r52.f157450e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.f157447a.hashCode() * 31) + this.f157448b.hashCode()) * 31;
        String r1 = this.f157449c;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.d;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.f157450e;
        if (r15 == null) goto L15;
        r2 = r15.hashCode();
    L15:
        return r04 + r2;
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "PostCryptoSellParam(coinSymbol=" + this.f157447a + ", orderType=" + this.f157448b + ", price=" + this.f157449c + ", baseQty=" + this.d + ", quoteQty=" + this.f157450e + ")";
    }
}
