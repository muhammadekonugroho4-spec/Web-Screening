package com.stockbit.cryptodetail.ui.detail.state;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f79731a;

    /* renamed from: b, reason: collision with root package name */
    public final String f79732b;

    /* renamed from: c, reason: collision with root package name */
    public final String f79733c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f79734e;

    /* renamed from: f, reason: collision with root package name */
    public final String f79735f;

    /* renamed from: g, reason: collision with root package name */
    public final String f79736g;

    /* renamed from: h, reason: collision with root package name */
    public final String f79737h;

    /* renamed from: i, reason: collision with root package name */
    public final String f79738i;

    /* renamed from: j, reason: collision with root package name */
    public final String f79739j;

    /* renamed from: k, reason: collision with root package name */
    public final String f79740k;

    /* renamed from: l, reason: collision with root package name */
    public final String f79741l;

    static {
    }

    public j(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, String r13) {
        p.l(r2, "coinDisplayName");
        p.l(r3, "coinSymbol");
        p.l(r4, "logoUrl");
        this.f79731a = r2;
        this.f79732b = r3;
        this.f79733c = r4;
        this.d = r5;
        this.f79734e = r6;
        this.f79735f = r7;
        this.f79736g = r8;
        this.f79737h = r9;
        this.f79738i = r10;
        this.f79739j = r11;
        this.f79740k = r12;
        this.f79741l = r13;
    }

    public static /* synthetic */ j b(j r02, String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, int r13, Object r14) {
        if ((r13 & 1) == 0) goto L6;
        r1 = r02.f79731a;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r2 = r02.f79732b;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r3 = r02.f79733c;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r5 = r02.f79734e;
    L18:
        if ((r13 & 32) == 0) goto L21;
        r6 = r02.f79735f;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r7 = r02.f79736g;
    L24:
        if ((r13 & 128) == 0) goto L27;
        r8 = r02.f79737h;
    L27:
        if ((r13 & 256) == 0) goto L30;
        r9 = r02.f79738i;
    L30:
        if ((r13 & 512) == 0) goto L33;
        r10 = r02.f79739j;
    L33:
        if ((r13 & 1024) == 0) goto L36;
        r11 = r02.f79740k;
    L36:
        if ((r13 & 2048) == 0) goto L38;
        r12 = r02.f79741l;
    L38:
        String r132 = r11;
        String r142 = r12;
        String r112 = r9;
        String r122 = r10;
        String r92 = r7;
        String r102 = r8;
        String r72 = r5;
        String r82 = r6;
        String r52 = r3;
        String r62 = r4;
        return r02.a(r1, r2, r52, r62, r72, r82, r92, r102, r112, r122, r132, r142);
    }

    public final j a(String r15, String r16, String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26) {
        p.l(r15, "coinDisplayName");
        p.l(r16, "coinSymbol");
        p.l(r17, "logoUrl");
        return new j(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26);
    }

    public final String c() {
        return this.f79735f;
    }

    public final String d() {
        return this.f79736g;
    }

    public final String e() {
        return this.f79737h;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (p.g(this.f79731a, r52.f79731a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f79732b, r52.f79732b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f79733c, r52.f79733c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f79734e, r52.f79734e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f79735f, r52.f79735f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f79736g, r52.f79736g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f79737h, r52.f79737h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f79738i, r52.f79738i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f79739j, r52.f79739j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f79740k, r52.f79740k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f79741l, r52.f79741l) == true) goto L44;
        return false;
    L44:
        return true;
    }

    public final String f() {
        return this.f79731a;
    }

    public final String g() {
        return this.f79739j;
    }

    public final String h() {
        return this.d;
    }

    public int hashCode() {
        int r02 = ((((this.f79731a.hashCode() * 31) + this.f79732b.hashCode()) * 31) + this.f79733c.hashCode()) * 31;
        String r1 = this.d;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f79734e;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.f79735f;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (r04 + r16) * 31;
        String r17 = this.f79736g;
        if (r17 != null) goto L17;
        int r18 = 0;
    L18:
        int r06 = (r05 + r18) * 31;
        String r19 = this.f79737h;
        if (r19 != null) goto L21;
        int r110 = 0;
    L22:
        int r07 = (r06 + r110) * 31;
        String r111 = this.f79738i;
        if (r111 != null) goto L25;
        int r112 = 0;
    L26:
        int r08 = (r07 + r112) * 31;
        String r113 = this.f79739j;
        if (r113 != null) goto L29;
        int r114 = 0;
    L30:
        int r09 = (r08 + r114) * 31;
        String r115 = this.f79740k;
        if (r115 != null) goto L33;
        int r116 = 0;
    L34:
        int r010 = (r09 + r116) * 31;
        String r117 = this.f79741l;
        if (r117 == null) goto L39;
        r2 = r117.hashCode();
    L39:
        return r010 + r2;
    L33:
        r116 = r115.hashCode();
        goto L34
    L29:
        r114 = r113.hashCode();
        goto L30
    L25:
        r112 = r111.hashCode();
        goto L26
    L21:
        r110 = r19.hashCode();
        goto L22
    L17:
        r18 = r17.hashCode();
        goto L18
    L13:
        r16 = r15.hashCode();
        goto L14
    L9:
        r14 = r13.hashCode();
        goto L10
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String i() {
        return this.f79741l;
    }

    public final String j() {
        return this.f79738i;
    }

    public final String k() {
        return this.f79734e;
    }

    public final String l() {
        return this.f79740k;
    }

    public String toString() {
        return "CryptoProfileUIData(coinDisplayName=" + this.f79731a + ", coinSymbol=" + this.f79732b + ", logoUrl=" + this.f79733c + ", marketCap=" + this.d + ", tradingVolume24h=" + this.f79734e + ", allTimeHigh=" + this.f79735f + ", allTimeLow=" + this.f79736g + ", circulatingSupply=" + this.f79737h + ", totalSupply=" + this.f79738i + ", description=" + this.f79739j + ", websiteUrl=" + this.f79740k + ", riskDisclosureUrl=" + this.f79741l + ')';
    }

    public /* synthetic */ j(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, String r13, int r14, kotlin.jvm.internal.i r15) {
        if ((r14 & 8) == 0) goto L6;
        r5 = null;
    L6:
        if ((r14 & 16) == 0) goto L9;
        r6 = null;
    L9:
        if ((r14 & 32) == 0) goto L12;
        r7 = null;
    L12:
        if ((r14 & 64) == 0) goto L15;
        r8 = null;
    L15:
        if ((r14 & 128) == 0) goto L18;
        r9 = null;
    L18:
        if ((r14 & 256) == 0) goto L21;
        r10 = null;
    L21:
        if ((r14 & 512) == 0) goto L24;
        r11 = null;
    L24:
        if ((r14 & 1024) == 0) goto L27;
        r12 = null;
    L27:
        if ((r14 & 2048) == 0) goto L30;
        String r142 = null;
    L29:
        String r132 = r12;
        String r122 = r11;
        String r112 = r10;
        String r102 = r9;
        String r92 = r8;
        String r82 = r7;
        this(r2, r3, r4, r5, r6, r82, r92, r102, r112, r122, r132, r142);
        return;
    L30:
        r142 = r13;
        goto L29
    }
}
