package com.stockbit.domain.model.alert;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f80572a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80573b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80574c;
    public final PriceAlertOperatorType d;

    /* renamed from: e, reason: collision with root package name */
    public final String f80575e;

    /* renamed from: f, reason: collision with root package name */
    public final String f80576f;

    /* renamed from: g, reason: collision with root package name */
    public final String f80577g;

    /* renamed from: h, reason: collision with root package name */
    public final String f80578h;

    /* renamed from: i, reason: collision with root package name */
    public final String f80579i;

    public b(String r2, String r3, String r4, PriceAlertOperatorType r5, String r6, String r7, String r8, String r9, String r10) {
        kotlin.jvm.internal.p.l(r2, "stock");
        kotlin.jvm.internal.p.l(r3, "companyName");
        kotlin.jvm.internal.p.l(r4, "operator");
        kotlin.jvm.internal.p.l(r5, "operatorType");
        kotlin.jvm.internal.p.l(r6, "operatorSign");
        kotlin.jvm.internal.p.l(r7, "value");
        kotlin.jvm.internal.p.l(r8, "country");
        kotlin.jvm.internal.p.l(r9, "valueFormatted");
        kotlin.jvm.internal.p.l(r10, "symbol2");
        this.f80572a = r2;
        this.f80573b = r3;
        this.f80574c = r4;
        this.d = r5;
        this.f80575e = r6;
        this.f80576f = r7;
        this.f80577g = r8;
        this.f80578h = r9;
        this.f80579i = r10;
    }

    public final String a() {
        return this.f80573b;
    }

    public final String b() {
        return this.f80577g;
    }

    public final String c() {
        return this.f80574c;
    }

    public final String d() {
        return this.f80575e;
    }

    public final PriceAlertOperatorType e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (kotlin.jvm.internal.p.g(this.f80572a, r52.f80572a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f80573b, r52.f80573b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f80574c, r52.f80574c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f80575e, r52.f80575e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f80576f, r52.f80576f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f80577g, r52.f80577g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f80578h, r52.f80578h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f80579i, r52.f80579i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.f80572a;
    }

    public final String g() {
        return this.f80579i;
    }

    public final String h() {
        return this.f80576f;
    }

    public int hashCode() {
        return (((((((((((((((this.f80572a.hashCode() * 31) + this.f80573b.hashCode()) * 31) + this.f80574c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f80575e.hashCode()) * 31) + this.f80576f.hashCode()) * 31) + this.f80577g.hashCode()) * 31) + this.f80578h.hashCode()) * 31) + this.f80579i.hashCode();
    }

    public final String i() {
        return this.f80578h;
    }

    public String toString() {
        return "AlertCommandEntity(stock=" + this.f80572a + ", companyName=" + this.f80573b + ", operator=" + this.f80574c + ", operatorType=" + this.d + ", operatorSign=" + this.f80575e + ", value=" + this.f80576f + ", country=" + this.f80577g + ", valueFormatted=" + this.f80578h + ", symbol2=" + this.f80579i + ")";
    }

    public /* synthetic */ b(String r2, String r3, String r4, PriceAlertOperatorType r5, String r6, String r7, String r8, String r9, String r10, int r11, kotlin.jvm.internal.i r12) {
        if ((r11 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r11 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r11 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r11 & 8) == 0) goto L15;
        r5 = PriceAlertOperatorType.LESS_THAN;
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
        PriceAlertOperatorType r62 = r5;
        String r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72, r82, r92, r102, r112);
        return;
    L30:
        r112 = r10;
        goto L29
    }
}
