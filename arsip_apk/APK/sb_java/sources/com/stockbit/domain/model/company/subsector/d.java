package com.stockbit.domain.model.company.subsector;

import java.util.Date;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f81978a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81979b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f81980c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f81981e;

    public d(String r2, String r3, Date r4, String r5, String r6) {
        p.l(r2, "bidPrice");
        p.l(r3, "offerPrice");
        p.l(r4, "dueDate");
        p.l(r5, "performance");
        p.l(r6, "yield");
        this.f81978a = r2;
        this.f81979b = r3;
        this.f81980c = r4;
        this.d = r5;
        this.f81981e = r6;
    }

    public final String a() {
        return this.f81978a;
    }

    public final Date b() {
        return this.f81980c;
    }

    public final String c() {
        return this.f81981e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f81978a, r52.f81978a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81979b, r52.f81979b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81980c, r52.f81980c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f81981e, r52.f81981e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f81978a.hashCode() * 31) + this.f81979b.hashCode()) * 31) + this.f81980c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f81981e.hashCode();
    }

    public String toString() {
        return "SubSectorCompanyFrAttributesEntity(bidPrice=" + this.f81978a + ", offerPrice=" + this.f81979b + ", dueDate=" + this.f81980c + ", performance=" + this.d + ", yield=" + this.f81981e + ")";
    }
}
