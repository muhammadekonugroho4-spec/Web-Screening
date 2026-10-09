package com.stockbit.usecase.cryptotransaction.contract.param;

import com.stockbit.usecase.cryptotransaction.contract.entity.CryptoOrderType;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f157442a;

    /* renamed from: b, reason: collision with root package name */
    public final CryptoOrderType f157443b;

    /* renamed from: c, reason: collision with root package name */
    public final String f157444c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f157445e;

    /* renamed from: f, reason: collision with root package name */
    public final String f157446f;

    public c(String r2, CryptoOrderType r3, String r4, String r5, String r6, String r7) {
        p.l(r2, "coinSymbol");
        p.l(r3, "orderType");
        this.f157442a = r2;
        this.f157443b = r3;
        this.f157444c = r4;
        this.d = r5;
        this.f157445e = r6;
        this.f157446f = r7;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f157442a;
    }

    public final String c() {
        return this.f157446f;
    }

    public final CryptoOrderType d() {
        return this.f157443b;
    }

    public final String e() {
        return this.f157444c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f157442a, r52.f157442a) == true) goto L12;
        return false;
    L12:
        if (this.f157443b == r52.f157443b) goto L15;
        return false;
    L15:
        if (p.g(this.f157444c, r52.f157444c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f157445e, r52.f157445e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f157446f, r52.f157446f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f157445e;
    }

    public int hashCode() {
        int r02 = ((this.f157442a.hashCode() * 31) + this.f157443b.hashCode()) * 31;
        String r1 = this.f157444c;
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
        String r15 = this.f157445e;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (r04 + r16) * 31;
        String r17 = this.f157446f;
        if (r17 == null) goto L19;
        r2 = r17.hashCode();
    L19:
        return r05 + r2;
    L13:
        r16 = r15.hashCode();
        goto L14
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "PostCryptoBuyParam(coinSymbol=" + this.f157442a + ", orderType=" + this.f157443b + ", price=" + this.f157444c + ", baseQty=" + this.d + ", quoteQty=" + this.f157445e + ", grossQuoteQty=" + this.f157446f + ")";
    }
}
