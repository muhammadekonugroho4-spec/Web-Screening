package com.stockbit.component.orderbook.model;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.stockbit.component.orderbook.F1;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: C, reason: collision with root package name */
    public static final a f73111C = null;

    /* renamed from: D, reason: collision with root package name */
    public static final k f73112D = null;

    /* renamed from: A, reason: collision with root package name */
    public final boolean f73113A;

    /* renamed from: B, reason: collision with root package name */
    public final String f73114B;

    /* renamed from: a, reason: collision with root package name */
    public final double f73115a;

    /* renamed from: b, reason: collision with root package name */
    public final String f73116b;

    /* renamed from: c, reason: collision with root package name */
    public final String f73117c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final String f73118e;

    /* renamed from: f, reason: collision with root package name */
    public final int f73119f;

    /* renamed from: g, reason: collision with root package name */
    public final String f73120g;

    /* renamed from: h, reason: collision with root package name */
    public final int f73121h;

    /* renamed from: i, reason: collision with root package name */
    public final String f73122i;

    /* renamed from: j, reason: collision with root package name */
    public final int f73123j;

    /* renamed from: k, reason: collision with root package name */
    public final String f73124k;

    /* renamed from: l, reason: collision with root package name */
    public final int f73125l;

    /* renamed from: m, reason: collision with root package name */
    public final String f73126m;

    /* renamed from: n, reason: collision with root package name */
    public final int f73127n;

    /* renamed from: o, reason: collision with root package name */
    public final String f73128o;

    /* renamed from: p, reason: collision with root package name */
    public final int f73129p;

    /* renamed from: q, reason: collision with root package name */
    public final String f73130q;

    /* renamed from: r, reason: collision with root package name */
    public final int f73131r;

    /* renamed from: s, reason: collision with root package name */
    public final String f73132s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f73133t;

    /* renamed from: u, reason: collision with root package name */
    public final String f73134u;

    /* renamed from: v, reason: collision with root package name */
    public final Integer f73135v;

    /* renamed from: w, reason: collision with root package name */
    public final Boolean f73136w;

    /* renamed from: x, reason: collision with root package name */
    public final String f73137x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f73138y;

    /* renamed from: z, reason: collision with root package name */
    public final String f73139z;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        f73111C = new a(null);
        int r7 = F1.f72501a;
        double r3 = 0.0d;
        String r5 = "-";
        String r6 = "-";
        String r8 = "-";
        String r10 = "-";
        String r12 = "-";
        String r14 = "-";
        String r16 = "-";
        String r18 = "-";
        String r20 = "-";
        String r22 = null;
        Integer r23 = null;
        String r24 = null;
        Integer r25 = null;
        Boolean r26 = null;
        String r27 = "-";
        boolean r28 = false;
        String r29 = "-";
        boolean r30 = false;
        String r31 = "-";
        f73112D = new k(r3, r5, r6, r7, r8, r7, r10, r7, r12, r7, r14, r7, r16, r7, r18, r7, r20, r7, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, 8126464, null);
    }

    public k(double r15, String r17, String r18, int r19, String r20, int r21, String r22, int r23, String r24, int r25, String r26, int r27, String r28, int r29, String r30, int r31, String r32, int r33, String r34, Integer r35, String r36, Integer r37, Boolean r38, String r39, boolean r40, String r41, boolean r42, String r43) {
        p.l(r17, "previousPriceFormatted");
        p.l(r18, "openPrice");
        p.l(r20, "highPrice");
        p.l(r22, "lowPrice");
        p.l(r24, "fBuyPrice");
        p.l(r26, "lot");
        p.l(r28, "value");
        p.l(r30, "averagePrice");
        p.l(r32, "fSellPrice");
        p.l(r39, "arbPrice");
        p.l(r41, "araPrice");
        p.l(r43, "totalFrequency");
        this.f73115a = r15;
        this.f73116b = r17;
        this.f73117c = r18;
        this.d = r19;
        this.f73118e = r20;
        this.f73119f = r21;
        this.f73120g = r22;
        this.f73121h = r23;
        this.f73122i = r24;
        this.f73123j = r25;
        this.f73124k = r26;
        this.f73125l = r27;
        this.f73126m = r28;
        this.f73127n = r29;
        this.f73128o = r30;
        this.f73129p = r31;
        this.f73130q = r32;
        this.f73131r = r33;
        this.f73132s = r34;
        this.f73133t = r35;
        this.f73134u = r36;
        this.f73135v = r37;
        this.f73136w = r38;
        this.f73137x = r39;
        this.f73138y = r40;
        this.f73139z = r41;
        this.f73113A = r42;
        this.f73114B = r43;
    }

    public static /* synthetic */ k b(k r19, double r20, String r22, String r23, int r24, String r25, int r26, String r27, int r28, String r29, int r30, String r31, int r32, String r33, int r34, String r35, int r36, String r37, int r38, String r39, Integer r40, String r41, Integer r42, Boolean r43, String r44, boolean r45, String r46, boolean r47, String r48, int r49, Object r50) {
        if ((r49 & 1) == 0) goto L5;
        double r2 = r19.f73115a;
    L7:
        if ((r49 & 2) == 0) goto L9;
        String r4 = r19.f73116b;
    L11:
        if ((r49 & 4) == 0) goto L13;
        String r5 = r19.f73117c;
    L15:
        if ((r49 & 8) == 0) goto L17;
        int r6 = r19.d;
    L19:
        if ((r49 & 16) == 0) goto L21;
        String r7 = r19.f73118e;
    L23:
        if ((r49 & 32) == 0) goto L25;
        int r8 = r19.f73119f;
    L27:
        if ((r49 & 64) == 0) goto L29;
        String r9 = r19.f73120g;
    L31:
        if ((r49 & 128) == 0) goto L33;
        int r10 = r19.f73121h;
    L35:
        if ((r49 & 256) == 0) goto L37;
        String r11 = r19.f73122i;
    L39:
        if ((r49 & 512) == 0) goto L41;
        int r12 = r19.f73123j;
    L43:
        if ((r49 & 1024) == 0) goto L45;
        String r13 = r19.f73124k;
    L47:
        if ((r49 & 2048) == 0) goto L49;
        int r14 = r19.f73125l;
    L51:
        if ((r49 & 4096) == 0) goto L53;
        String r15 = r19.f73126m;
    L54:
        double r16 = r2;
        if ((r49 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        int r210 = r19.f73127n;
    L59:
        if ((r49 & 16384) == 0) goto L61;
        String r3 = r19.f73128o;
    L63:
        if ((r49 & 32768) == 0) goto L65;
        int r1 = r19.f73129p;
    L66:
        int r202 = r1;
        if ((r49 & 65536) == 0) goto L69;
        String r17 = r19.f73130q;
    L70:
        String r21 = r17;
        if ((r49 & 131072) == 0) goto L73;
        int r18 = r19.f73131r;
    L74:
        int r222 = r18;
        if ((r49 & 262144) == 0) goto L77;
        String r110 = r19.f73132s;
    L78:
        String r232 = r110;
        if ((r49 & 524288) == 0) goto L81;
        Integer r111 = r19.f73133t;
    L82:
        Integer r242 = r111;
        if ((r49 & 1048576) == 0) goto L85;
        String r112 = r19.f73134u;
    L86:
        String r252 = r112;
        if ((r49 & 2097152) == 0) goto L89;
        Integer r113 = r19.f73135v;
    L90:
        Integer r262 = r113;
        if ((r49 & 4194304) == 0) goto L93;
        Boolean r114 = r19.f73136w;
    L94:
        Boolean r272 = r114;
        if ((r49 & 8388608) == 0) goto L97;
        String r115 = r19.f73137x;
    L98:
        String r282 = r115;
        if ((r49 & 16777216) == 0) goto L101;
        boolean r116 = r19.f73138y;
    L102:
        boolean r292 = r116;
        if ((r49 & 33554432) == 0) goto L105;
        String r117 = r19.f73139z;
    L106:
        String r302 = r117;
        if ((r49 & 67108864) == 0) goto L109;
        boolean r118 = r19.f73113A;
    L111:
        if ((r49 & 134217728) == 0) goto L114;
        boolean r312 = r118;
        boolean r482 = r312;
        String r492 = r19.f73114B;
    L116:
        return r19.a(r16, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r210, r3, r202, r21, r222, r232, r242, r252, r262, r272, r282, r292, r302, r482, r492);
    L114:
        r492 = r48;
        r482 = r118;
        goto L116
    L109:
        r118 = r47;
        goto L111
    L105:
        r117 = r46;
        goto L106
    L101:
        r116 = r45;
        goto L102
    L97:
        r115 = r44;
        goto L98
    L93:
        r114 = r43;
        goto L94
    L89:
        r113 = r42;
        goto L90
    L85:
        r112 = r41;
        goto L86
    L81:
        r111 = r40;
        goto L82
    L77:
        r110 = r39;
        goto L78
    L73:
        r18 = r38;
        goto L74
    L69:
        r17 = r37;
        goto L70
    L65:
        r1 = r36;
        goto L66
    L61:
        r3 = r35;
        goto L63
    L57:
        r210 = r34;
        goto L59
    L53:
        r15 = r33;
        goto L54
    L49:
        r14 = r32;
        goto L51
    L45:
        r13 = r31;
        goto L47
    L41:
        r12 = r30;
        goto L43
    L37:
        r11 = r29;
        goto L39
    L33:
        r10 = r28;
        goto L35
    L29:
        r9 = r27;
        goto L31
    L25:
        r8 = r26;
        goto L27
    L21:
        r7 = r25;
        goto L23
    L17:
        r6 = r24;
        goto L19
    L13:
        r5 = r23;
        goto L15
    L9:
        r4 = r22;
        goto L11
    L5:
        r2 = r20;
        goto L7
    }

    public final String A() {
        return this.f73126m;
    }

    public final int B() {
        return this.f73127n;
    }

    public final boolean C() {
        return this.f73113A;
    }

    public final boolean D() {
        return this.f73138y;
    }

    public final k a(double r32, String r34, String r35, int r36, String r37, int r38, String r39, int r40, String r41, int r42, String r43, int r44, String r45, int r46, String r47, int r48, String r49, int r50, String r51, Integer r52, String r53, Integer r54, Boolean r55, String r56, boolean r57, String r58, boolean r59, String r60) {
        p.l(r34, "previousPriceFormatted");
        p.l(r35, "openPrice");
        p.l(r37, "highPrice");
        p.l(r39, "lowPrice");
        p.l(r41, "fBuyPrice");
        p.l(r43, "lot");
        p.l(r45, "value");
        p.l(r47, "averagePrice");
        p.l(r49, "fSellPrice");
        p.l(r56, "arbPrice");
        p.l(r58, "araPrice");
        p.l(r60, "totalFrequency");
        return new k(r32, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60);
    }

    public final String c() {
        return this.f73139z;
    }

    public final String d() {
        return this.f73137x;
    }

    public final String e() {
        return this.f73128o;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof k) == true) goto L8;
        return false;
    L8:
        k r82 = (k) r8;
        if (Double.compare(this.f73115a, r82.f73115a) == 0) goto L12;
        return false;
    L12:
        if (p.g(this.f73116b, r82.f73116b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f73117c, r82.f73117c) == true) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L21;
        return false;
    L21:
        if (p.g(this.f73118e, r82.f73118e) == true) goto L24;
        return false;
    L24:
        if (this.f73119f == r82.f73119f) goto L27;
        return false;
    L27:
        if (p.g(this.f73120g, r82.f73120g) == true) goto L30;
        return false;
    L30:
        if (this.f73121h == r82.f73121h) goto L33;
        return false;
    L33:
        if (p.g(this.f73122i, r82.f73122i) == true) goto L36;
        return false;
    L36:
        if (this.f73123j == r82.f73123j) goto L39;
        return false;
    L39:
        if (p.g(this.f73124k, r82.f73124k) == true) goto L42;
        return false;
    L42:
        if (this.f73125l == r82.f73125l) goto L45;
        return false;
    L45:
        if (p.g(this.f73126m, r82.f73126m) == true) goto L48;
        return false;
    L48:
        if (this.f73127n == r82.f73127n) goto L51;
        return false;
    L51:
        if (p.g(this.f73128o, r82.f73128o) == true) goto L54;
        return false;
    L54:
        if (this.f73129p == r82.f73129p) goto L57;
        return false;
    L57:
        if (p.g(this.f73130q, r82.f73130q) == true) goto L60;
        return false;
    L60:
        if (this.f73131r == r82.f73131r) goto L63;
        return false;
    L63:
        if (p.g(this.f73132s, r82.f73132s) == true) goto L66;
        return false;
    L66:
        if (p.g(this.f73133t, r82.f73133t) == true) goto L69;
        return false;
    L69:
        if (p.g(this.f73134u, r82.f73134u) == true) goto L72;
        return false;
    L72:
        if (p.g(this.f73135v, r82.f73135v) == true) goto L75;
        return false;
    L75:
        if (p.g(this.f73136w, r82.f73136w) == true) goto L78;
        return false;
    L78:
        if (p.g(this.f73137x, r82.f73137x) == true) goto L81;
        return false;
    L81:
        if (this.f73138y == r82.f73138y) goto L84;
        return false;
    L84:
        if (p.g(this.f73139z, r82.f73139z) == true) goto L87;
        return false;
    L87:
        if (this.f73113A == r82.f73113A) goto L90;
        return false;
    L90:
        if (p.g(this.f73114B, r82.f73114B) == true) goto L92;
        return false;
    L92:
        return true;
    }

    public final int f() {
        return this.f73129p;
    }

    public final String g() {
        return this.f73122i;
    }

    public final int h() {
        return this.f73123j;
    }

    public int hashCode() {
        int r02 = ((((((((((((((((((((((((((((((((((Double.hashCode(this.f73115a) * 31) + this.f73116b.hashCode()) * 31) + this.f73117c.hashCode()) * 31) + Integer.hashCode(this.d)) * 31) + this.f73118e.hashCode()) * 31) + Integer.hashCode(this.f73119f)) * 31) + this.f73120g.hashCode()) * 31) + Integer.hashCode(this.f73121h)) * 31) + this.f73122i.hashCode()) * 31) + Integer.hashCode(this.f73123j)) * 31) + this.f73124k.hashCode()) * 31) + Integer.hashCode(this.f73125l)) * 31) + this.f73126m.hashCode()) * 31) + Integer.hashCode(this.f73127n)) * 31) + this.f73128o.hashCode()) * 31) + Integer.hashCode(this.f73129p)) * 31) + this.f73130q.hashCode()) * 31) + Integer.hashCode(this.f73131r)) * 31;
        String r1 = this.f73132s;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        Integer r13 = this.f73133t;
        if (r13 != null) goto L9;
        int r14 = 0;
    L10:
        int r04 = (r03 + r14) * 31;
        String r15 = this.f73134u;
        if (r15 != null) goto L13;
        int r16 = 0;
    L14:
        int r05 = (r04 + r16) * 31;
        Integer r17 = this.f73135v;
        if (r17 != null) goto L17;
        int r18 = 0;
    L18:
        int r06 = (r05 + r18) * 31;
        Boolean r19 = this.f73136w;
        if (r19 == null) goto L23;
        r2 = r19.hashCode();
    L23:
        return ((((((((((r06 + r2) * 31) + this.f73137x.hashCode()) * 31) + Boolean.hashCode(this.f73138y)) * 31) + this.f73139z.hashCode()) * 31) + Boolean.hashCode(this.f73113A)) * 31) + this.f73114B.hashCode();
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
        return this.f73130q;
    }

    public final int j() {
        return this.f73131r;
    }

    public final Boolean k() {
        return this.f73136w;
    }

    public final String l() {
        return this.f73118e;
    }

    public final int m() {
        return this.f73119f;
    }

    public final String n() {
        return this.f73132s;
    }

    public final Integer o() {
        return this.f73133t;
    }

    public final String p() {
        return this.f73134u;
    }

    public final Integer q() {
        return this.f73135v;
    }

    public final String r() {
        return this.f73124k;
    }

    public final int s() {
        return this.f73125l;
    }

    public final String t() {
        return this.f73120g;
    }

    public String toString() {
        return "OrderbookOHLCUiState(previousPrice=" + this.f73115a + ", previousPriceFormatted=" + this.f73116b + ", openPrice=" + this.f73117c + ", openPriceColor=" + this.d + ", highPrice=" + this.f73118e + ", highPriceColor=" + this.f73119f + ", lowPrice=" + this.f73120g + ", lowPriceColor=" + this.f73121h + ", fBuyPrice=" + this.f73122i + ", fBuyPriceColor=" + this.f73123j + ", lot=" + this.f73124k + ", lotColor=" + this.f73125l + ", value=" + this.f73126m + ", valueColor=" + this.f73127n + ", averagePrice=" + this.f73128o + ", averagePriceColor=" + this.f73129p + ", fSellPrice=" + this.f73130q + ", fSellPriceColor=" + this.f73131r + ", iepPrice=" + this.f73132s + ", iepPriceColor=" + this.f73133t + ", ievPrice=" + this.f73134u + ", ievPriceColor=" + this.f73135v + ", foreignGroupVisiblity=" + this.f73136w + ", arbPrice=" + this.f73137x + ", isArbVisible=" + this.f73138y + ", araPrice=" + this.f73139z + ", isAraVisible=" + this.f73113A + ", totalFrequency=" + this.f73114B + ')';
    }

    public final int u() {
        return this.f73121h;
    }

    public final String v() {
        return this.f73117c;
    }

    public final int w() {
        return this.d;
    }

    public final double x() {
        return this.f73115a;
    }

    public final String y() {
        return this.f73116b;
    }

    public final String z() {
        return this.f73114B;
    }

    public /* synthetic */ k(double r33, String r35, String r36, int r37, String r38, int r39, String r40, int r41, String r42, int r43, String r44, int r45, String r46, int r47, String r48, int r49, String r50, int r51, String r52, Integer r53, String r54, Integer r55, Boolean r56, String r57, boolean r58, String r59, boolean r60, String r61, int r62, kotlin.jvm.internal.i r63) {
        if ((r62 & 262144) == 0) goto L5;
        String r22 = null;
    L7:
        if ((r62 & 524288) == 0) goto L9;
        Integer r23 = null;
    L11:
        if ((r62 & 1048576) == 0) goto L13;
        String r24 = null;
    L15:
        if ((r62 & 2097152) == 0) goto L17;
        Integer r25 = null;
    L19:
        if ((r62 & 4194304) == 0) goto L22;
        Boolean r26 = null;
    L23:
        this(r33, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r22, r23, r24, r25, r26, r57, r58, r59, r60, r61);
        return;
    L22:
        r26 = r56;
        goto L23
    L17:
        r25 = r55;
        goto L19
    L13:
        r24 = r54;
        goto L15
    L9:
        r23 = r53;
        goto L11
    L5:
        r22 = r52;
        goto L7
    }
}
