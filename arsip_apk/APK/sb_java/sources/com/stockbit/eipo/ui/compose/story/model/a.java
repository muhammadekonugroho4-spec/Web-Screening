package com.stockbit.eipo.ui.compose.story.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f90708a;

    /* renamed from: b, reason: collision with root package name */
    public final String f90709b;

    /* renamed from: c, reason: collision with root package name */
    public final String f90710c;
    public final String d;

    static {
    }

    public a(String r2, String r3, String r4, String r5) {
        p.l(r2, "totalValue");
        p.l(r3, "orderId");
        p.l(r4, "orderLot");
        p.l(r5, "allocationType");
        this.f90708a = r2;
        this.f90709b = r3;
        this.f90710c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f90709b;
    }

    public final String c() {
        return this.f90710c;
    }

    public final String d() {
        return this.f90708a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f90708a, r52.f90708a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f90709b, r52.f90709b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f90710c, r52.f90710c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f90708a.hashCode() * 31) + this.f90709b.hashCode()) * 31) + this.f90710c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "EIpoStoryOrderData(totalValue=" + this.f90708a + ", orderId=" + this.f90709b + ", orderLot=" + this.f90710c + ", allocationType=" + this.d + ')';
    }

    public /* synthetic */ a(String r2, String r3, String r4, String r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = "Pool";
    L14:
        this(r2, r3, r4, r5);
    }
}
