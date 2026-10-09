package com.stockbit.domain.model.entity.calendar;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f82573a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82574b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82575c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82576e;

    /* renamed from: f, reason: collision with root package name */
    public final String f82577f;

    /* renamed from: g, reason: collision with root package name */
    public final String f82578g;

    /* renamed from: h, reason: collision with root package name */
    public final String f82579h;

    public c(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9) {
        kotlin.jvm.internal.p.l(r2, "companySymbol");
        kotlin.jvm.internal.p.l(r3, "cumDate");
        kotlin.jvm.internal.p.l(r4, "exDate");
        kotlin.jvm.internal.p.l(r5, "recDate");
        kotlin.jvm.internal.p.l(r6, "payDate");
        kotlin.jvm.internal.p.l(r7, "value");
        kotlin.jvm.internal.p.l(r8, "lastUpdate");
        kotlin.jvm.internal.p.l(r9, "lastPrice");
        this.f82573a = r2;
        this.f82574b = r3;
        this.f82575c = r4;
        this.d = r5;
        this.f82576e = r6;
        this.f82577f = r7;
        this.f82578g = r8;
        this.f82579h = r9;
    }

    public final String a() {
        return this.f82573a;
    }

    public final String b() {
        return this.f82574b;
    }

    public final String c() {
        return this.f82575c;
    }

    public final String d() {
        return this.f82579h;
    }

    public final String e() {
        return this.f82576e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (kotlin.jvm.internal.p.g(this.f82573a, r52.f82573a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82574b, r52.f82574b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f82575c, r52.f82575c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f82576e, r52.f82576e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f82577f, r52.f82577f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f82578g, r52.f82578g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f82579h, r52.f82579h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.f82577f;
    }

    public int hashCode() {
        return (((((((((((((this.f82573a.hashCode() * 31) + this.f82574b.hashCode()) * 31) + this.f82575c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82576e.hashCode()) * 31) + this.f82577f.hashCode()) * 31) + this.f82578g.hashCode()) * 31) + this.f82579h.hashCode();
    }

    public String toString() {
        return "CalendarCashDividend(companySymbol=" + this.f82573a + ", cumDate=" + this.f82574b + ", exDate=" + this.f82575c + ", recDate=" + this.d + ", payDate=" + this.f82576e + ", value=" + this.f82577f + ", lastUpdate=" + this.f82578g + ", lastPrice=" + this.f82579h + ')';
    }

    public /* synthetic */ c(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, int r10, kotlin.jvm.internal.i r11) {
        if ((r10 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r10 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r10 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r10 & 8) == 0) goto L15;
        r5 = "";
    L15:
        if ((r10 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r10 & 32) == 0) goto L21;
        r7 = "";
    L21:
        if ((r10 & 64) == 0) goto L24;
        r8 = "";
    L24:
        if ((r10 & 128) == 0) goto L27;
        String r102 = "";
    L26:
        String r92 = r8;
        String r82 = r7;
        String r72 = r6;
        String r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72, r82, r92, r102);
        return;
    L27:
        r102 = r9;
        goto L26
    }
}
