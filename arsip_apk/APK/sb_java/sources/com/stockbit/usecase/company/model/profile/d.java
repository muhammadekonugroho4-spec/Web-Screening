package com.stockbit.usecase.company.model.profile;

import com.stockbit.search.SearchEntryPoint;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final c f156480a;

    /* renamed from: b, reason: collision with root package name */
    public final c f156481b;

    /* renamed from: c, reason: collision with root package name */
    public final c f156482c;
    public final c d;

    public d(c r2, c r3, c r4, c r5) {
        p.l(r2, SearchEntryPoint.KEY_SECTOR);
        p.l(r3, "subSector");
        p.l(r4, "industry");
        p.l(r5, "subIndustry");
        this.f156480a = r2;
        this.f156481b = r3;
        this.f156482c = r4;
        this.d = r5;
    }

    public final c a() {
        return this.f156482c;
    }

    public final c b() {
        return this.f156480a;
    }

    public final c c() {
        return this.d;
    }

    public final c d() {
        return this.f156481b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f156480a, r52.f156480a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156481b, r52.f156481b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f156482c, r52.f156482c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f156480a.hashCode() * 31) + this.f156481b.hashCode()) * 31) + this.f156482c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "CompanyProfileClassificationUIState(sector=" + this.f156480a + ", subSector=" + this.f156481b + ", industry=" + this.f156482c + ", subIndustry=" + this.d + ")";
    }
}
