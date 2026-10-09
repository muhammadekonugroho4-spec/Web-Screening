package com.stockbit.usecase.calendar.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f155001a;

    /* renamed from: b, reason: collision with root package name */
    public final String f155002b;

    /* renamed from: c, reason: collision with root package name */
    public final String f155003c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f155004e;

    public b(String r2, String r3, String r4, String r5, boolean r6) {
        p.l(r2, "companyDisplayedName");
        p.l(r3, "companySymbol");
        p.l(r4, "value");
        p.l(r5, "note");
        this.f155001a = r2;
        this.f155002b = r3;
        this.f155003c = r4;
        this.d = r5;
        this.f155004e = r6;
    }

    public final String a() {
        return this.f155001a;
    }

    public final String b() {
        return this.f155002b;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f155003c;
    }

    public final boolean e() {
        return this.f155004e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f155001a, r52.f155001a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f155002b, r52.f155002b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f155003c, r52.f155003c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f155004e == r52.f155004e) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f155001a.hashCode() * 31) + this.f155002b.hashCode()) * 31) + this.f155003c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.f155004e);
    }

    public String toString() {
        return "CalendarTodayItemUIState(companyDisplayedName=" + this.f155001a + ", companySymbol=" + this.f155002b + ", value=" + this.f155003c + ", note=" + this.d + ", isCompanyClickable=" + this.f155004e + ")";
    }

    public /* synthetic */ b(String r7, String r8, String r9, String r10, boolean r11, int r12, i r13) {
        if ((r12 & 16) == 0) goto L5;
        r11 = true;
    L5:
        this(r7, r8, r9, r10, r11);
    }
}
