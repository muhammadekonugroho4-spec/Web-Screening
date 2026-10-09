package com.stockbit.domain.model.securities.portfolio;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f85678a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85679b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85680c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f85681e;

    /* renamed from: f, reason: collision with root package name */
    public final String f85682f;

    /* renamed from: g, reason: collision with root package name */
    public final String f85683g;

    /* renamed from: h, reason: collision with root package name */
    public final String f85684h;

    /* renamed from: i, reason: collision with root package name */
    public final String f85685i;

    /* renamed from: j, reason: collision with root package name */
    public final String f85686j;

    /* renamed from: k, reason: collision with root package name */
    public final String f85687k;

    /* renamed from: l, reason: collision with root package name */
    public final String f85688l;

    /* renamed from: m, reason: collision with root package name */
    public final String f85689m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f85690n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f85691o;

    /* renamed from: p, reason: collision with root package name */
    public final String f85692p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f85693q;

    /* renamed from: r, reason: collision with root package name */
    public final String f85694r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f85695s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f85696t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f85697u;

    /* renamed from: v, reason: collision with root package name */
    public final int f85698v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f85699w;

    /* renamed from: x, reason: collision with root package name */
    public final String f85700x;

    /* renamed from: y, reason: collision with root package name */
    public final String f85701y;

    /* renamed from: z, reason: collision with root package name */
    public final String f85702z;

    public i(String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, boolean r30, boolean r31, String r32, boolean r33, String r34, boolean r35, boolean r36, boolean r37, int r38, boolean r39, String r40, String r41, String r42) {
        p.l(r17, "symbol");
        p.l(r18, "companyName");
        p.l(r19, "companyIconUrl");
        p.l(r20, "availableLot");
        p.l(r21, "balanceLot");
        p.l(r22, "total");
        p.l(r23, "priceAverage");
        p.l(r24, "priceAverageFee");
        p.l(r25, "priceLatest");
        p.l(r26, "unrealisedMarketValue");
        p.l(r27, "unrealisedProfitLoss");
        p.l(r28, "unrealisedGain");
        p.l(r29, "amountInvested");
        p.l(r32, "exerciseType");
        p.l(r34, "type");
        p.l(r40, "delistedDate");
        p.l(r41, "exerciseTradingEndDate");
        p.l(r42, "exerciseEndDate");
        this.f85678a = r17;
        this.f85679b = r18;
        this.f85680c = r19;
        this.d = r20;
        this.f85681e = r21;
        this.f85682f = r22;
        this.f85683g = r23;
        this.f85684h = r24;
        this.f85685i = r25;
        this.f85686j = r26;
        this.f85687k = r27;
        this.f85688l = r28;
        this.f85689m = r29;
        this.f85690n = r30;
        this.f85691o = r31;
        this.f85692p = r32;
        this.f85693q = r33;
        this.f85694r = r34;
        this.f85695s = r35;
        this.f85696t = r36;
        this.f85697u = r37;
        this.f85698v = r38;
        this.f85699w = r39;
        this.f85700x = r40;
        this.f85701y = r41;
        this.f85702z = r42;
    }

    public static /* synthetic */ i b(i r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, boolean r31, boolean r32, String r33, boolean r34, String r35, boolean r36, boolean r37, boolean r38, int r39, boolean r40, String r41, String r42, String r43, int r44, Object r45) {
        if ((r44 & 1) == 0) goto L5;
        String r2 = r17.f85678a;
    L7:
        if ((r44 & 2) == 0) goto L9;
        String r3 = r17.f85679b;
    L11:
        if ((r44 & 4) == 0) goto L13;
        String r4 = r17.f85680c;
    L15:
        if ((r44 & 8) == 0) goto L17;
        String r5 = r17.d;
    L19:
        if ((r44 & 16) == 0) goto L21;
        String r6 = r17.f85681e;
    L23:
        if ((r44 & 32) == 0) goto L25;
        String r7 = r17.f85682f;
    L27:
        if ((r44 & 64) == 0) goto L29;
        String r8 = r17.f85683g;
    L31:
        if ((r44 & 128) == 0) goto L33;
        String r9 = r17.f85684h;
    L35:
        if ((r44 & 256) == 0) goto L37;
        String r10 = r17.f85685i;
    L39:
        if ((r44 & 512) == 0) goto L41;
        String r11 = r17.f85686j;
    L43:
        if ((r44 & 1024) == 0) goto L45;
        String r12 = r17.f85687k;
    L47:
        if ((r44 & 2048) == 0) goto L49;
        String r13 = r17.f85688l;
    L51:
        if ((r44 & 4096) == 0) goto L53;
        String r14 = r17.f85689m;
    L55:
        if ((r44 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        boolean r15 = r17.f85690n;
    L58:
        String r182 = r2;
        if ((r44 & 16384) == 0) goto L61;
        boolean r210 = r17.f85691o;
    L63:
        if ((r44 & 32768) == 0) goto L65;
        String r1 = r17.f85692p;
    L66:
        String r192 = r1;
        if ((r44 & 65536) == 0) goto L69;
        boolean r16 = r17.f85693q;
    L70:
        boolean r202 = r16;
        if ((r44 & 131072) == 0) goto L73;
        String r110 = r17.f85694r;
    L74:
        String r212 = r110;
        if ((r44 & 262144) == 0) goto L77;
        boolean r111 = r17.f85695s;
    L78:
        boolean r222 = r111;
        if ((r44 & 524288) == 0) goto L81;
        boolean r112 = r17.f85696t;
    L82:
        boolean r232 = r112;
        if ((r44 & 1048576) == 0) goto L85;
        boolean r113 = r17.f85697u;
    L86:
        boolean r242 = r113;
        if ((r44 & 2097152) == 0) goto L89;
        int r114 = r17.f85698v;
    L90:
        int r252 = r114;
        if ((r44 & 4194304) == 0) goto L93;
        boolean r115 = r17.f85699w;
    L94:
        boolean r262 = r115;
        if ((r44 & 8388608) == 0) goto L97;
        String r116 = r17.f85700x;
    L98:
        String r272 = r116;
        if ((r44 & 16777216) == 0) goto L101;
        String r117 = r17.f85701y;
    L103:
        if ((r44 & 33554432) == 0) goto L106;
        String r282 = r117;
        String r432 = r282;
        String r442 = r17.f85702z;
    L108:
        return r17.a(r182, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r210, r192, r202, r212, r222, r232, r242, r252, r262, r272, r432, r442);
    L106:
        r442 = r43;
        r432 = r117;
        goto L108
    L101:
        r117 = r42;
        goto L103
    L97:
        r116 = r41;
        goto L98
    L93:
        r115 = r40;
        goto L94
    L89:
        r114 = r39;
        goto L90
    L85:
        r113 = r38;
        goto L86
    L81:
        r112 = r37;
        goto L82
    L77:
        r111 = r36;
        goto L78
    L73:
        r110 = r35;
        goto L74
    L69:
        r16 = r34;
        goto L70
    L65:
        r1 = r33;
        goto L66
    L61:
        r210 = r32;
        goto L63
    L57:
        r15 = r31;
        goto L58
    L53:
        r14 = r30;
        goto L55
    L49:
        r13 = r29;
        goto L51
    L45:
        r12 = r28;
        goto L47
    L41:
        r11 = r27;
        goto L43
    L37:
        r10 = r26;
        goto L39
    L33:
        r9 = r25;
        goto L35
    L29:
        r8 = r24;
        goto L31
    L25:
        r7 = r23;
        goto L27
    L21:
        r6 = r22;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r2 = r18;
        goto L7
    }

    public final boolean A() {
        return this.f85695s;
    }

    public final boolean B() {
        return this.f85699w;
    }

    public final i a(String r29, String r30, String r31, String r32, String r33, String r34, String r35, String r36, String r37, String r38, String r39, String r40, String r41, boolean r42, boolean r43, String r44, boolean r45, String r46, boolean r47, boolean r48, boolean r49, int r50, boolean r51, String r52, String r53, String r54) {
        p.l(r29, "symbol");
        p.l(r30, "companyName");
        p.l(r31, "companyIconUrl");
        p.l(r32, "availableLot");
        p.l(r33, "balanceLot");
        p.l(r34, "total");
        p.l(r35, "priceAverage");
        p.l(r36, "priceAverageFee");
        p.l(r37, "priceLatest");
        p.l(r38, "unrealisedMarketValue");
        p.l(r39, "unrealisedProfitLoss");
        p.l(r40, "unrealisedGain");
        p.l(r41, "amountInvested");
        p.l(r44, "exerciseType");
        p.l(r46, "type");
        p.l(r52, "delistedDate");
        p.l(r53, "exerciseTradingEndDate");
        p.l(r54, "exerciseEndDate");
        return new i(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54);
    }

    public final boolean c() {
        return this.f85691o;
    }

    public final String d() {
        return this.f85689m;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (p.g(this.f85678a, r52.f85678a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85679b, r52.f85679b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85680c, r52.f85680c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f85681e, r52.f85681e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f85682f, r52.f85682f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f85683g, r52.f85683g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f85684h, r52.f85684h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f85685i, r52.f85685i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f85686j, r52.f85686j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f85687k, r52.f85687k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f85688l, r52.f85688l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f85689m, r52.f85689m) == true) goto L48;
        return false;
    L48:
        if (this.f85690n == r52.f85690n) goto L51;
        return false;
    L51:
        if (this.f85691o == r52.f85691o) goto L54;
        return false;
    L54:
        if (p.g(this.f85692p, r52.f85692p) == true) goto L57;
        return false;
    L57:
        if (this.f85693q == r52.f85693q) goto L60;
        return false;
    L60:
        if (p.g(this.f85694r, r52.f85694r) == true) goto L63;
        return false;
    L63:
        if (this.f85695s == r52.f85695s) goto L66;
        return false;
    L66:
        if (this.f85696t == r52.f85696t) goto L69;
        return false;
    L69:
        if (this.f85697u == r52.f85697u) goto L72;
        return false;
    L72:
        if (this.f85698v == r52.f85698v) goto L75;
        return false;
    L75:
        if (this.f85699w == r52.f85699w) goto L78;
        return false;
    L78:
        if (p.g(this.f85700x, r52.f85700x) == true) goto L81;
        return false;
    L81:
        if (p.g(this.f85701y, r52.f85701y) == true) goto L84;
        return false;
    L84:
        if (p.g(this.f85702z, r52.f85702z) == true) goto L86;
        return false;
    L86:
        return true;
    }

    public final String f() {
        return this.f85681e;
    }

    public final boolean g() {
        return this.f85696t;
    }

    public final boolean h() {
        return this.f85697u;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((this.f85678a.hashCode() * 31) + this.f85679b.hashCode()) * 31) + this.f85680c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f85681e.hashCode()) * 31) + this.f85682f.hashCode()) * 31) + this.f85683g.hashCode()) * 31) + this.f85684h.hashCode()) * 31) + this.f85685i.hashCode()) * 31) + this.f85686j.hashCode()) * 31) + this.f85687k.hashCode()) * 31) + this.f85688l.hashCode()) * 31) + this.f85689m.hashCode()) * 31) + Boolean.hashCode(this.f85690n)) * 31) + Boolean.hashCode(this.f85691o)) * 31) + this.f85692p.hashCode()) * 31) + Boolean.hashCode(this.f85693q)) * 31) + this.f85694r.hashCode()) * 31) + Boolean.hashCode(this.f85695s)) * 31) + Boolean.hashCode(this.f85696t)) * 31) + Boolean.hashCode(this.f85697u)) * 31) + Integer.hashCode(this.f85698v)) * 31) + Boolean.hashCode(this.f85699w)) * 31) + this.f85700x.hashCode()) * 31) + this.f85701y.hashCode()) * 31) + this.f85702z.hashCode();
    }

    public final String i() {
        return this.f85680c;
    }

    public final String j() {
        return this.f85679b;
    }

    public final String k() {
        return this.f85700x;
    }

    public final boolean l() {
        return this.f85690n;
    }

    public final String m() {
        return this.f85702z;
    }

    public final String n() {
        return this.f85701y;
    }

    public final String o() {
        return this.f85692p;
    }

    public final int p() {
        return this.f85698v;
    }

    public final boolean q() {
        return this.f85693q;
    }

    public final String r() {
        return this.f85683g;
    }

    public final String s() {
        return this.f85684h;
    }

    public final String t() {
        return this.f85685i;
    }

    public String toString() {
        return "PortfolioResultEntity(symbol=" + this.f85678a + ", companyName=" + this.f85679b + ", companyIconUrl=" + this.f85680c + ", availableLot=" + this.d + ", balanceLot=" + this.f85681e + ", total=" + this.f85682f + ", priceAverage=" + this.f85683g + ", priceAverageFee=" + this.f85684h + ", priceLatest=" + this.f85685i + ", unrealisedMarketValue=" + this.f85686j + ", unrealisedProfitLoss=" + this.f85687k + ", unrealisedGain=" + this.f85688l + ", amountInvested=" + this.f85689m + ", exerciseData=" + this.f85690n + ", allowOrder=" + this.f85691o + ", exerciseType=" + this.f85692p + ", haveSmartOrder=" + this.f85693q + ", type=" + this.f85694r + ", isSharia=" + this.f85695s + ", canBuy=" + this.f85696t + ", canSell=" + this.f85697u + ", haircutMarginTrading=" + this.f85698v + ", isToBeDelisted=" + this.f85699w + ", delistedDate=" + this.f85700x + ", exerciseTradingEndDate=" + this.f85701y + ", exerciseEndDate=" + this.f85702z + ")";
    }

    public final String u() {
        return this.f85678a;
    }

    public final String v() {
        return this.f85682f;
    }

    public final String w() {
        return this.f85694r;
    }

    public final String x() {
        return this.f85688l;
    }

    public final String y() {
        return this.f85686j;
    }

    public final String z() {
        return this.f85687k;
    }

    public /* synthetic */ i(String r28, String r29, String r30, String r31, String r32, String r33, String r34, String r35, String r36, String r37, String r38, String r39, String r40, boolean r41, boolean r42, String r43, boolean r44, String r45, boolean r46, boolean r47, boolean r48, int r49, boolean r50, String r51, String r52, String r53, int r54, kotlin.jvm.internal.i r55) {
        if ((r54 & 1) == 0) goto L5;
        String r1 = "";
    L7:
        if ((r54 & 2) == 0) goto L9;
        String r3 = "";
    L11:
        if ((r54 & 4) == 0) goto L13;
        String r4 = "";
    L15:
        if ((r54 & 8) == 0) goto L17;
        String r5 = "";
    L19:
        if ((r54 & 16) == 0) goto L21;
        String r6 = "";
    L23:
        if ((r54 & 32) == 0) goto L25;
        String r7 = "";
    L27:
        if ((r54 & 64) == 0) goto L29;
        String r8 = "";
    L31:
        if ((r54 & 128) == 0) goto L33;
        String r9 = "";
    L35:
        if ((r54 & 256) == 0) goto L37;
        String r10 = "";
    L39:
        if ((r54 & 512) == 0) goto L41;
        String r11 = "";
    L43:
        if ((r54 & 1024) == 0) goto L45;
        String r12 = "";
    L47:
        if ((r54 & 2048) == 0) goto L49;
        String r13 = "";
    L51:
        if ((r54 & 4096) == 0) goto L53;
        String r14 = "";
    L54:
        boolean r16 = false;
        if ((r54 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        boolean r15 = false;
    L58:
        String r282 = r1;
        if ((r54 & 16384) == 0) goto L61;
        boolean r17 = false;
    L63:
        if ((r54 & 32768) == 0) goto L65;
        String r172 = "";
    L67:
        if ((r54 & 65536) == 0) goto L69;
        boolean r18 = false;
    L71:
        if ((r54 & 131072) == 0) goto L73;
        String r19 = "";
    L75:
        if ((r54 & 262144) == 0) goto L77;
        boolean r20 = false;
    L79:
        if ((r54 & 524288) == 0) goto L81;
        boolean r21 = false;
    L83:
        if ((r54 & 1048576) == 0) goto L85;
        boolean r22 = false;
    L87:
        if ((r54 & 2097152) == 0) goto L89;
        int r23 = 0;
    L91:
        if ((r54 & 4194304) != 0) goto L95;
        r16 = r50;
    L95:
        if ((r54 & 8388608) == 0) goto L97;
        String r24 = "";
    L99:
        if ((r54 & 16777216) == 0) goto L101;
        String r25 = "";
    L103:
        if ((r54 & 33554432) == 0) goto L106;
        String r542 = "";
    L107:
        this(r282, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r172, r18, r19, r20, r21, r22, r23, r16, r24, r25, r542);
        return;
    L106:
        r542 = r53;
        goto L107
    L101:
        r25 = r52;
        goto L103
    L97:
        r24 = r51;
        goto L99
    L89:
        r23 = r49;
        goto L91
    L85:
        r22 = r48;
        goto L87
    L81:
        r21 = r47;
        goto L83
    L77:
        r20 = r46;
        goto L79
    L73:
        r19 = r45;
        goto L75
    L69:
        r18 = r44;
        goto L71
    L65:
        r172 = r43;
        goto L67
    L61:
        r17 = r42;
        goto L63
    L57:
        r15 = r41;
        goto L58
    L53:
        r14 = r40;
        goto L54
    L49:
        r13 = r39;
        goto L51
    L45:
        r12 = r38;
        goto L47
    L41:
        r11 = r37;
        goto L43
    L37:
        r10 = r36;
        goto L39
    L33:
        r9 = r35;
        goto L35
    L29:
        r8 = r34;
        goto L31
    L25:
        r7 = r33;
        goto L27
    L21:
        r6 = r32;
        goto L23
    L17:
        r5 = r31;
        goto L19
    L13:
        r4 = r30;
        goto L15
    L9:
        r3 = r29;
        goto L11
    L5:
        r1 = r28;
        goto L7
    }
}
