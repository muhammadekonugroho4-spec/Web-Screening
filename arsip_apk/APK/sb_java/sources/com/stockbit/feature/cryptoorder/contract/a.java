package com.stockbit.feature.cryptoorder.contract;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f94161a;

    /* renamed from: b, reason: collision with root package name */
    public final String f94162b;

    /* renamed from: c, reason: collision with root package name */
    public final String f94163c;
    public final String d;

    public a(String r2, String r3, String r4, String r5) {
        p.l(r2, "orderId");
        p.l(r3, "coinSymbol");
        p.l(r4, "coinName");
        p.l(r5, "coinLogo");
        this.f94161a = r2;
        this.f94162b = r3;
        this.f94163c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f94163c;
    }

    public final String c() {
        return this.f94162b;
    }

    public final String d() {
        return this.f94161a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f94161a, r52.f94161a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f94162b, r52.f94162b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f94163c, r52.f94163c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f94161a.hashCode() * 31) + this.f94162b.hashCode()) * 31) + this.f94163c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "CryptoOrderContractArgs(orderId=" + this.f94161a + ", coinSymbol=" + this.f94162b + ", coinName=" + this.f94163c + ", coinLogo=" + this.d + ')';
    }

    public /* synthetic */ a(String r2, String r3, String r4, String r5, int r6, i r7) {
        if ((r6 & 4) == 0) goto L6;
        r4 = "";
    L6:
        if ((r6 & 8) == 0) goto L8;
        r5 = "";
    L8:
        this(r2, r3, r4, r5);
    }
}
