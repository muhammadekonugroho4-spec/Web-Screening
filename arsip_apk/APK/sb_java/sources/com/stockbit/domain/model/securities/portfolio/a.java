package com.stockbit.domain.model.securities.portfolio;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f85603a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85604b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85605c;

    public a(String r2, String r3, String r4) {
        p.l(r2, "yearRate");
        p.l(r3, "paymentDate");
        p.l(r4, "distribution");
        this.f85603a = r2;
        this.f85604b = r3;
        this.f85605c = r4;
    }

    public final String a() {
        return this.f85605c;
    }

    public final String b() {
        return this.f85604b;
    }

    public final String c() {
        return this.f85603a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f85603a, r52.f85603a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85604b, r52.f85604b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85605c, r52.f85605c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f85603a.hashCode() * 31) + this.f85604b.hashCode()) * 31) + this.f85605c.hashCode();
    }

    public String toString() {
        return "BondCouponEntity(yearRate=" + this.f85603a + ", paymentDate=" + this.f85604b + ", distribution=" + this.f85605c + ")";
    }

    public /* synthetic */ a(String r2, String r3, String r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = "";
    L11:
        this(r2, r3, r4);
    }
}
