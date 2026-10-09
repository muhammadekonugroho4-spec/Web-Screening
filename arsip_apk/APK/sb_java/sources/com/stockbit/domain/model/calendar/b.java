package com.stockbit.domain.model.calendar;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f80967a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80968b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80969c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f80970e;

    /* renamed from: f, reason: collision with root package name */
    public final String f80971f;

    /* renamed from: g, reason: collision with root package name */
    public final String f80972g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f80973h;

    /* renamed from: i, reason: collision with root package name */
    public final String f80974i;

    /* renamed from: j, reason: collision with root package name */
    public final String f80975j;

    public b(String r2, String r3, String r4, String r5, String r6, String r7, String r8, boolean r9, String r10, String r11) {
        p.l(r2, "companySymbol");
        p.l(r3, "cumDate");
        p.l(r4, "exDate");
        p.l(r5, "recDate");
        p.l(r6, "payDate");
        p.l(r7, "value");
        p.l(r8, "lastPriceFormatted");
        p.l(r10, "eventNote");
        p.l(r11, "valueFormatted");
        this.f80967a = r2;
        this.f80968b = r3;
        this.f80969c = r4;
        this.d = r5;
        this.f80970e = r6;
        this.f80971f = r7;
        this.f80972g = r8;
        this.f80973h = r9;
        this.f80974i = r10;
        this.f80975j = r11;
    }

    public final String a() {
        return this.f80967a;
    }

    public final String b() {
        return this.f80968b;
    }

    public final String c() {
        return this.f80974i;
    }

    public final String d() {
        return this.f80969c;
    }

    public final String e() {
        return this.f80970e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f80967a, r52.f80967a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f80968b, r52.f80968b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f80969c, r52.f80969c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f80970e, r52.f80970e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f80971f, r52.f80971f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f80972g, r52.f80972g) == true) goto L30;
        return false;
    L30:
        if (this.f80973h == r52.f80973h) goto L33;
        return false;
    L33:
        if (p.g(this.f80974i, r52.f80974i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f80975j, r52.f80975j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.f80975j;
    }

    public final boolean h() {
        return this.f80973h;
    }

    public int hashCode() {
        return (((((((((((((((((this.f80967a.hashCode() * 31) + this.f80968b.hashCode()) * 31) + this.f80969c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f80970e.hashCode()) * 31) + this.f80971f.hashCode()) * 31) + this.f80972g.hashCode()) * 31) + Boolean.hashCode(this.f80973h)) * 31) + this.f80974i.hashCode()) * 31) + this.f80975j.hashCode();
    }

    public String toString() {
        return "CalendarDividendEntity(companySymbol=" + this.f80967a + ", cumDate=" + this.f80968b + ", exDate=" + this.f80969c + ", recDate=" + this.d + ", payDate=" + this.f80970e + ", value=" + this.f80971f + ", lastPriceFormatted=" + this.f80972g + ", isCorpActionActive=" + this.f80973h + ", eventNote=" + this.f80974i + ", valueFormatted=" + this.f80975j + ")";
    }
}
