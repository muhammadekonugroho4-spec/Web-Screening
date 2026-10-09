package com.stockbit.domain.model.calendar;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f81047a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81048b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81049c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f81050e;

    /* renamed from: f, reason: collision with root package name */
    public final String f81051f;

    /* renamed from: g, reason: collision with root package name */
    public final String f81052g;

    /* renamed from: h, reason: collision with root package name */
    public final String f81053h;

    /* renamed from: i, reason: collision with root package name */
    public final String f81054i;

    public j(String r2, boolean r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10) {
        p.l(r2, "companySymbol");
        p.l(r4, "factor");
        p.l(r5, "eventNote");
        p.l(r6, "ratiosFormatted");
        p.l(r7, "cumDate");
        p.l(r8, "exDate");
        p.l(r9, "paymentDate");
        p.l(r10, "recordingDate");
        this.f81047a = r2;
        this.f81048b = r3;
        this.f81049c = r4;
        this.d = r5;
        this.f81050e = r6;
        this.f81051f = r7;
        this.f81052g = r8;
        this.f81053h = r9;
        this.f81054i = r10;
    }

    public final String a() {
        return this.f81047a;
    }

    public final boolean b() {
        return this.f81048b;
    }

    public final String c() {
        return this.f81051f;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f81052g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (p.g(this.f81047a, r52.f81047a) == true) goto L12;
        return false;
    L12:
        if (this.f81048b == r52.f81048b) goto L15;
        return false;
    L15:
        if (p.g(this.f81049c, r52.f81049c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f81050e, r52.f81050e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f81051f, r52.f81051f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f81052g, r52.f81052g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f81053h, r52.f81053h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f81054i, r52.f81054i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.f81049c;
    }

    public final String g() {
        return this.f81053h;
    }

    public final String h() {
        return this.f81050e;
    }

    public int hashCode() {
        return (((((((((((((((this.f81047a.hashCode() * 31) + Boolean.hashCode(this.f81048b)) * 31) + this.f81049c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f81050e.hashCode()) * 31) + this.f81051f.hashCode()) * 31) + this.f81052g.hashCode()) * 31) + this.f81053h.hashCode()) * 31) + this.f81054i.hashCode();
    }

    public final String i() {
        return this.f81054i;
    }

    public String toString() {
        return "CalendarStockDividendEntity(companySymbol=" + this.f81047a + ", corpActionActive=" + this.f81048b + ", factor=" + this.f81049c + ", eventNote=" + this.d + ", ratiosFormatted=" + this.f81050e + ", cumDate=" + this.f81051f + ", exDate=" + this.f81052g + ", paymentDate=" + this.f81053h + ", recordingDate=" + this.f81054i + ")";
    }

    public /* synthetic */ j(String r2, boolean r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, int r11, kotlin.jvm.internal.i r12) {
        if ((r11 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r11 & 2) == 0) goto L9;
        r3 = false;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r11 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r11 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r11 & 32) == 0) goto L21;
        r7 = "";
    L21:
        if ((r11 & 64) == 0) goto L24;
        r8 = "";
    L24:
        if ((r11 & 128) == 0) goto L27;
        r9 = "";
    L27:
        if ((r11 & 256) == 0) goto L30;
        String r112 = "";
    L29:
        String r102 = r9;
        String r92 = r8;
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        boolean r42 = r3;
        this(r2, r42, r52, r62, r72, r82, r92, r102, r112);
        return;
    L30:
        r112 = r10;
        goto L29
    }
}
