package com.stockbit.domain.param.topstock;

import com.stockbit.calendar.CalendarEntryPoint;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f87611a;

    /* renamed from: b, reason: collision with root package name */
    public final String f87612b;

    /* renamed from: c, reason: collision with root package name */
    public final String f87613c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f87614e;

    /* renamed from: f, reason: collision with root package name */
    public final String f87615f;

    /* renamed from: g, reason: collision with root package name */
    public final String f87616g;

    public a(String r2, String r3, String r4, String r5, String r6, String r7, String r8) {
        p.l(r2, CalendarEntryPoint.KEY_PAGE_DETAIL);
        p.l(r3, "investorType");
        p.l(r4, "marketType");
        p.l(r5, "valueType");
        this.f87611a = r2;
        this.f87612b = r3;
        this.f87613c = r4;
        this.d = r5;
        this.f87614e = r6;
        this.f87615f = r7;
        this.f87616g = r8;
    }

    public final String a() {
        return this.f87615f;
    }

    public final String b() {
        return this.f87612b;
    }

    public final String c() {
        return this.f87613c;
    }

    public final String d() {
        return this.f87611a;
    }

    public final String e() {
        return this.f87616g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f87611a, r52.f87611a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f87612b, r52.f87612b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f87613c, r52.f87613c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f87614e, r52.f87614e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f87615f, r52.f87615f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f87616g, r52.f87616g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.f87614e;
    }

    public final String g() {
        return this.d;
    }

    public int hashCode() {
        int r02 = ((((((this.f87611a.hashCode() * 31) + this.f87612b.hashCode()) * 31) + this.f87613c.hashCode()) * 31) + this.d.hashCode()) * 31;
        String r1 = this.f87614e;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f87615f;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.f87616g;
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
        return "TopStockDomainParam(page=" + this.f87611a + ", investorType=" + this.f87612b + ", marketType=" + this.f87613c + ", valueType=" + this.d + ", startDate=" + this.f87614e + ", endDate=" + this.f87615f + ", period=" + this.f87616g + ")";
    }
}
