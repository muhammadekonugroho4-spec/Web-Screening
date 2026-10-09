package com.stockbit.domain.model.valueobject.company.pricefeed;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f86819a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86820b;

    /* renamed from: c, reason: collision with root package name */
    public final double f86821c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final double f86822e;

    /* renamed from: f, reason: collision with root package name */
    public final String f86823f;

    /* renamed from: g, reason: collision with root package name */
    public final String f86824g;

    public b(String r2, String r3, double r4, String r6, double r7, String r9, String r10) {
        p.l(r2, "stockCode");
        p.l(r3, "iep");
        p.l(r6, "iev");
        p.l(r9, "iepPercentageChange");
        p.l(r10, "iepPriceChange");
        this.f86819a = r2;
        this.f86820b = r3;
        this.f86821c = r4;
        this.d = r6;
        this.f86822e = r7;
        this.f86823f = r9;
        this.f86824g = r10;
    }

    public static /* synthetic */ b b(b r02, String r1, String r2, double r3, String r5, double r6, String r8, String r9, int r10, Object r11) {
        if ((r10 & 1) == 0) goto L6;
        r1 = r02.f86819a;
    L6:
        if ((r10 & 2) == 0) goto L9;
        r2 = r02.f86820b;
    L9:
        if ((r10 & 4) == 0) goto L12;
        r3 = r02.f86821c;
    L12:
        if ((r10 & 8) == 0) goto L15;
        r5 = r02.d;
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = r02.f86822e;
    L18:
        if ((r10 & 32) == 0) goto L21;
        r8 = r02.f86823f;
    L21:
        if ((r10 & 64) == 0) goto L23;
        r9 = r02.f86824g;
    L23:
        double r82 = r6;
        String r7 = r5;
        double r52 = r3;
        String r32 = r1;
        String r4 = r2;
        return r02.a(r32, r4, r52, r7, r82, r8, r9);
    }

    public final b a(String r12, String r13, double r14, String r16, double r17, String r19, String r20) {
        p.l(r12, "stockCode");
        p.l(r13, "iep");
        p.l(r16, "iev");
        p.l(r19, "iepPercentageChange");
        p.l(r20, "iepPriceChange");
        return new b(r12, r13, r14, r16, r17, r19, r20);
    }

    public final String c() {
        return this.f86820b;
    }

    public final String d() {
        return this.f86823f;
    }

    public final String e() {
        return this.f86824g;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (p.g(this.f86819a, r82.f86819a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f86820b, r82.f86820b) == true) goto L15;
        return false;
    L15:
        if (Double.compare(this.f86821c, r82.f86821c) == 0) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (Double.compare(this.f86822e, r82.f86822e) == 0) goto L24;
        return false;
    L24:
        if (p.g(this.f86823f, r82.f86823f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f86824g, r82.f86824g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final double f() {
        return this.f86821c;
    }

    public final String g() {
        return this.d;
    }

    public final double h() {
        return this.f86822e;
    }

    public int hashCode() {
        return (((((((((((this.f86819a.hashCode() * 31) + this.f86820b.hashCode()) * 31) + Double.hashCode(this.f86821c)) * 31) + this.d.hashCode()) * 31) + Double.hashCode(this.f86822e)) * 31) + this.f86823f.hashCode()) * 31) + this.f86824g.hashCode();
    }

    public final String i() {
        return this.f86819a;
    }

    public String toString() {
        return "IEPIEVItemData(stockCode=" + this.f86819a + ", iep=" + this.f86820b + ", iepRaw=" + this.f86821c + ", iev=" + this.d + ", ievRaw=" + this.f86822e + ", iepPercentageChange=" + this.f86823f + ", iepPriceChange=" + this.f86824g + ')';
    }

    public /* synthetic */ b(String r4, String r5, double r6, String r8, double r9, String r11, String r12, int r13, i r14) {
        if ((r13 & 1) == 0) goto L6;
        r4 = "";
    L6:
        if ((r13 & 2) == 0) goto L9;
        r5 = "";
    L9:
        if ((r13 & 4) == 0) goto L12;
        r6 = 0.0d;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r8 = "";
    L15:
        if ((r13 & 16) == 0) goto L18;
        r9 = 0.0d;
    L18:
        if ((r13 & 32) == 0) goto L21;
        r11 = "";
    L21:
        if ((r13 & 64) == 0) goto L24;
        String r132 = "";
    L23:
        double r7 = r6;
        this(r4, r5, r7, r8, r9, r11, r132);
        return;
    L24:
        r132 = r12;
        goto L23
    }
}
