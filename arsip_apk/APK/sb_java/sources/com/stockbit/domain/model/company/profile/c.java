package com.stockbit.domain.model.company.profile;

import com.stockbit.search.SearchEntryPoint;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f81789a;

    /* renamed from: b, reason: collision with root package name */
    public final d f81790b;

    /* renamed from: c, reason: collision with root package name */
    public final d f81791c;
    public final d d;

    public c(d r2, d r3, d r4, d r5) {
        p.l(r2, SearchEntryPoint.KEY_SECTOR);
        p.l(r3, "subSector");
        p.l(r4, "industry");
        p.l(r5, "subIndustry");
        this.f81789a = r2;
        this.f81790b = r3;
        this.f81791c = r4;
        this.d = r5;
    }

    public final d a() {
        return this.f81791c;
    }

    public final d b() {
        return this.f81789a;
    }

    public final d c() {
        return this.d;
    }

    public final d d() {
        return this.f81790b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f81789a, r52.f81789a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81790b, r52.f81790b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81791c, r52.f81791c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f81789a.hashCode() * 31) + this.f81790b.hashCode()) * 31) + this.f81791c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "CompanyProfileClassificationEntity(sector=" + this.f81789a + ", subSector=" + this.f81790b + ", industry=" + this.f81791c + ", subIndustry=" + this.d + ")";
    }

    public /* synthetic */ c(d r7, d r8, d r9, d r10, int r11, kotlin.jvm.internal.i r12) {
        if ((r11 & 1) == 0) goto L6;
        r7 = new d(null, null, null, 7, null);
    L6:
        if ((r11 & 2) == 0) goto L9;
        r8 = new d(null, null, null, 7, null);
    L9:
        if ((r11 & 4) == 0) goto L12;
        r9 = new d(null, null, null, 7, null);
    L12:
        if ((r11 & 8) == 0) goto L14;
        r10 = new d(null, null, null, 7, null);
    L14:
        this(r7, r8, r9, r10);
    }
}
