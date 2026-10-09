package com.stockbit.feature.order.contract.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f100669a;

    /* renamed from: b, reason: collision with root package name */
    public final String f100670b;

    /* renamed from: c, reason: collision with root package name */
    public final String f100671c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f100672e;

    /* renamed from: f, reason: collision with root package name */
    public final String f100673f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f100674g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f100675h;

    public a(String r2, String r3, String r4, String r5, boolean r6, String r7, boolean r8, boolean r9) {
        p.l(r2, "orderId");
        p.l(r3, "companySymbol");
        p.l(r4, "companyName");
        p.l(r5, "companyIconUrl");
        p.l(r7, "bracketParentStatus");
        this.f100669a = r2;
        this.f100670b = r3;
        this.f100671c = r4;
        this.d = r5;
        this.f100672e = r6;
        this.f100673f = r7;
        this.f100674g = r8;
        this.f100675h = r9;
    }

    public final String a() {
        return this.f100673f;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f100671c;
    }

    public final String d() {
        return this.f100670b;
    }

    public final String e() {
        return this.f100669a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f100669a, r52.f100669a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f100670b, r52.f100670b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f100671c, r52.f100671c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f100672e == r52.f100672e) goto L24;
        return false;
    L24:
        if (p.g(this.f100673f, r52.f100673f) == true) goto L27;
        return false;
    L27:
        if (this.f100674g == r52.f100674g) goto L30;
        return false;
    L30:
        if (this.f100675h == r52.f100675h) goto L32;
        return false;
    L32:
        return true;
    }

    public final boolean f() {
        return this.f100675h;
    }

    public final boolean g() {
        return this.f100674g;
    }

    public int hashCode() {
        return (((((((((((((this.f100669a.hashCode() * 31) + this.f100670b.hashCode()) * 31) + this.f100671c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f100672e)) * 31) + this.f100673f.hashCode()) * 31) + Boolean.hashCode(this.f100674g)) * 31) + Boolean.hashCode(this.f100675h);
    }

    public String toString() {
        return "BuyOrderDetailNavParam(orderId=" + this.f100669a + ", companySymbol=" + this.f100670b + ", companyName=" + this.f100671c + ", companyIconUrl=" + this.d + ", isDayTrade=" + this.f100672e + ", bracketParentStatus=" + this.f100673f + ", isFromPendingOrderList=" + this.f100674g + ", isFromBuySell=" + this.f100675h + ')';
    }

    public /* synthetic */ a(String r3, String r4, String r5, String r6, boolean r7, String r8, boolean r9, boolean r10, int r11, i r12) {
        if ((r11 & 4) == 0) goto L6;
        r5 = "";
    L6:
        if ((r11 & 8) == 0) goto L9;
        r6 = "";
    L9:
        if ((r11 & 16) == 0) goto L12;
        r7 = false;
    L12:
        if ((r11 & 32) == 0) goto L15;
        r8 = "";
    L15:
        if ((r11 & 64) == 0) goto L18;
        r9 = false;
    L18:
        if ((r11 & 128) == 0) goto L21;
        boolean r112 = false;
    L20:
        boolean r102 = r9;
        String r92 = r8;
        boolean r82 = r7;
        this(r3, r4, r5, r6, r82, r92, r102, r112);
        return;
    L21:
        r112 = r10;
        goto L20
    }
}
