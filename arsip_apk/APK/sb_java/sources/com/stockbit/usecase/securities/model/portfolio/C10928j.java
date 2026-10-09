package com.stockbit.usecase.securities.model.portfolio;

/* renamed from: com.stockbit.usecase.securities.model.portfolio.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10928j {

    /* renamed from: a, reason: collision with root package name */
    public final String f161748a;

    /* renamed from: b, reason: collision with root package name */
    public final String f161749b;

    /* renamed from: c, reason: collision with root package name */
    public final String f161750c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f161751e;

    /* renamed from: f, reason: collision with root package name */
    public final String f161752f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f161753g;

    /* renamed from: h, reason: collision with root package name */
    public final String f161754h;

    /* renamed from: i, reason: collision with root package name */
    public final String f161755i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f161756j;

    public C10928j(String r2, String r3, String r4, String r5, String r6, String r7, boolean r8, String r9, String r10, boolean r11) {
        kotlin.jvm.internal.p.l(r2, "symbol");
        kotlin.jvm.internal.p.l(r3, "lot");
        kotlin.jvm.internal.p.l(r4, "invested");
        kotlin.jvm.internal.p.l(r5, "avgPrice");
        kotlin.jvm.internal.p.l(r6, "marketPrice");
        kotlin.jvm.internal.p.l(r7, "currentPrice");
        kotlin.jvm.internal.p.l(r9, "profitAndLoss");
        kotlin.jvm.internal.p.l(r10, "gain");
        this.f161748a = r2;
        this.f161749b = r3;
        this.f161750c = r4;
        this.d = r5;
        this.f161751e = r6;
        this.f161752f = r7;
        this.f161753g = r8;
        this.f161754h = r9;
        this.f161755i = r10;
        this.f161756j = r11;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f161752f;
    }

    public final String c() {
        return this.f161755i;
    }

    public final String d() {
        return this.f161750c;
    }

    public final String e() {
        return this.f161749b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C10928j) == true) goto L8;
        return false;
    L8:
        C10928j r52 = (C10928j) r5;
        if (kotlin.jvm.internal.p.g(this.f161748a, r52.f161748a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f161749b, r52.f161749b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f161750c, r52.f161750c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f161751e, r52.f161751e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f161752f, r52.f161752f) == true) goto L27;
        return false;
    L27:
        if (this.f161753g == r52.f161753g) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f161754h, r52.f161754h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f161755i, r52.f161755i) == true) goto L36;
        return false;
    L36:
        if (this.f161756j == r52.f161756j) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.f161751e;
    }

    public final String g() {
        return this.f161754h;
    }

    public final String h() {
        return this.f161748a;
    }

    public int hashCode() {
        return (((((((((((((((((this.f161748a.hashCode() * 31) + this.f161749b.hashCode()) * 31) + this.f161750c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f161751e.hashCode()) * 31) + this.f161752f.hashCode()) * 31) + Boolean.hashCode(this.f161753g)) * 31) + this.f161754h.hashCode()) * 31) + this.f161755i.hashCode()) * 31) + Boolean.hashCode(this.f161756j);
    }

    public final boolean i() {
        return this.f161753g;
    }

    public final boolean j() {
        return this.f161756j;
    }

    public String toString() {
        return "MarginDelistedCompanyUIData(symbol=" + this.f161748a + ", lot=" + this.f161749b + ", invested=" + this.f161750c + ", avgPrice=" + this.d + ", marketPrice=" + this.f161751e + ", currentPrice=" + this.f161752f + ", isCurrentPriceGreen=" + this.f161753g + ", profitAndLoss=" + this.f161754h + ", gain=" + this.f161755i + ", isProfit=" + this.f161756j + ")";
    }
}
