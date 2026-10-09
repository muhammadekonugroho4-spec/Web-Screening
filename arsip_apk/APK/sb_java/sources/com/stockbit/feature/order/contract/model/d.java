package com.stockbit.feature.order.contract.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f100682a;

    /* renamed from: b, reason: collision with root package name */
    public final String f100683b;

    /* renamed from: c, reason: collision with root package name */
    public final String f100684c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f100685e;

    /* renamed from: f, reason: collision with root package name */
    public final String f100686f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f100687g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f100688h;

    public d(String r2, String r3, String r4, String r5, boolean r6, String r7, boolean r8, boolean r9) {
        p.l(r2, "orderId");
        p.l(r3, "companySymbol");
        p.l(r4, "companyName");
        p.l(r5, "companyIconUrl");
        p.l(r7, "bracketParentStatus");
        this.f100682a = r2;
        this.f100683b = r3;
        this.f100684c = r4;
        this.d = r5;
        this.f100685e = r6;
        this.f100686f = r7;
        this.f100687g = r8;
        this.f100688h = r9;
    }

    public final String a() {
        return this.f100686f;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f100684c;
    }

    public final String d() {
        return this.f100683b;
    }

    public final String e() {
        return this.f100682a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f100682a, r52.f100682a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f100683b, r52.f100683b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f100684c, r52.f100684c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f100685e == r52.f100685e) goto L24;
        return false;
    L24:
        if (p.g(this.f100686f, r52.f100686f) == true) goto L27;
        return false;
    L27:
        if (this.f100687g == r52.f100687g) goto L30;
        return false;
    L30:
        if (this.f100688h == r52.f100688h) goto L32;
        return false;
    L32:
        return true;
    }

    public final boolean f() {
        return this.f100685e;
    }

    public final boolean g() {
        return this.f100688h;
    }

    public final boolean h() {
        return this.f100687g;
    }

    public int hashCode() {
        return (((((((((((((this.f100682a.hashCode() * 31) + this.f100683b.hashCode()) * 31) + this.f100684c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f100685e)) * 31) + this.f100686f.hashCode()) * 31) + Boolean.hashCode(this.f100687g)) * 31) + Boolean.hashCode(this.f100688h);
    }

    public String toString() {
        return "SellOrderDetailNavParam(orderId=" + this.f100682a + ", companySymbol=" + this.f100683b + ", companyName=" + this.f100684c + ", companyIconUrl=" + this.d + ", isDayTrade=" + this.f100685e + ", bracketParentStatus=" + this.f100686f + ", isFromPendingOrderList=" + this.f100687g + ", isFromBuySell=" + this.f100688h + ')';
    }

    public /* synthetic */ d(String r3, String r4, String r5, String r6, boolean r7, String r8, boolean r9, boolean r10, int r11, i r12) {
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
