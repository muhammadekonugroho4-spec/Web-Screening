package com.stockbit.feature.cryptotransaction.ui.buy.model;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.stockbit.usecase.cryptotransaction.contract.entity.CryptoOrderType;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final CryptoOrderType f95729a;

    /* renamed from: b, reason: collision with root package name */
    public final String f95730b;

    /* renamed from: c, reason: collision with root package name */
    public final String f95731c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f95732e;

    /* renamed from: f, reason: collision with root package name */
    public final String f95733f;

    /* renamed from: g, reason: collision with root package name */
    public final float f95734g;

    /* renamed from: h, reason: collision with root package name */
    public final String f95735h;

    /* renamed from: i, reason: collision with root package name */
    public final String f95736i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f95737j;

    /* renamed from: k, reason: collision with root package name */
    public final String f95738k;

    /* renamed from: l, reason: collision with root package name */
    public final String f95739l;

    /* renamed from: m, reason: collision with root package name */
    public final String f95740m;

    /* renamed from: n, reason: collision with root package name */
    public final String f95741n;

    /* renamed from: o, reason: collision with root package name */
    public final String f95742o;

    /* renamed from: p, reason: collision with root package name */
    public final String f95743p;

    /* renamed from: q, reason: collision with root package name */
    public final String f95744q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f95745r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f95746s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f95747t;

    /* renamed from: u, reason: collision with root package name */
    public final String f95748u;

    static {
    }

    public d(CryptoOrderType r17, String r18, String r19, String r20, String r21, String r22, float r23, String r24, String r25, boolean r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33, boolean r34, boolean r35, boolean r36, String r37) {
        p.l(r17, "orderType");
        p.l(r18, "coinName");
        p.l(r19, "coinSymbol");
        p.l(r20, "coinLogoUrl");
        p.l(r21, "tradingBalance");
        p.l(r22, "availableBalance");
        p.l(r24, "investmentAmount");
        p.l(r25, "investmentAmountInput");
        p.l(r27, "priceInput");
        p.l(r28, "quantityInput");
        p.l(r29, "totalValue");
        p.l(r30, "feeLabel");
        p.l(r31, "exchangeFeeLabel");
        p.l(r32, "cfxFeeLabel");
        p.l(r33, "netTotal");
        p.l(r37, "depositShortfallPlain");
        this.f95729a = r17;
        this.f95730b = r18;
        this.f95731c = r19;
        this.d = r20;
        this.f95732e = r21;
        this.f95733f = r22;
        this.f95734g = r23;
        this.f95735h = r24;
        this.f95736i = r25;
        this.f95737j = r26;
        this.f95738k = r27;
        this.f95739l = r28;
        this.f95740m = r29;
        this.f95741n = r30;
        this.f95742o = r31;
        this.f95743p = r32;
        this.f95744q = r33;
        this.f95745r = r34;
        this.f95746s = r35;
        this.f95747t = r36;
        this.f95748u = r37;
    }

    public static /* synthetic */ d b(d r17, CryptoOrderType r18, String r19, String r20, String r21, String r22, String r23, float r24, String r25, String r26, boolean r27, String r28, String r29, String r30, String r31, String r32, String r33, String r34, boolean r35, boolean r36, boolean r37, String r38, int r39, Object r40) {
        if ((r39 & 1) == 0) goto L5;
        CryptoOrderType r2 = r17.f95729a;
    L7:
        if ((r39 & 2) == 0) goto L9;
        String r3 = r17.f95730b;
    L11:
        if ((r39 & 4) == 0) goto L13;
        String r4 = r17.f95731c;
    L15:
        if ((r39 & 8) == 0) goto L17;
        String r5 = r17.d;
    L19:
        if ((r39 & 16) == 0) goto L21;
        String r6 = r17.f95732e;
    L23:
        if ((r39 & 32) == 0) goto L25;
        String r7 = r17.f95733f;
    L27:
        if ((r39 & 64) == 0) goto L29;
        float r8 = r17.f95734g;
    L31:
        if ((r39 & 128) == 0) goto L33;
        String r9 = r17.f95735h;
    L35:
        if ((r39 & 256) == 0) goto L37;
        String r10 = r17.f95736i;
    L39:
        if ((r39 & 512) == 0) goto L41;
        boolean r11 = r17.f95737j;
    L43:
        if ((r39 & 1024) == 0) goto L45;
        String r12 = r17.f95738k;
    L47:
        if ((r39 & 2048) == 0) goto L49;
        String r13 = r17.f95739l;
    L51:
        if ((r39 & 4096) == 0) goto L53;
        String r14 = r17.f95740m;
    L55:
        if ((r39 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r15 = r17.f95741n;
    L58:
        CryptoOrderType r182 = r2;
        if ((r39 & 16384) == 0) goto L61;
        String r210 = r17.f95742o;
    L63:
        if ((r39 & 32768) == 0) goto L65;
        String r1 = r17.f95743p;
    L66:
        String r192 = r1;
        if ((r39 & 65536) == 0) goto L69;
        String r16 = r17.f95744q;
    L70:
        String r202 = r16;
        if ((r39 & 131072) == 0) goto L73;
        boolean r110 = r17.f95745r;
    L74:
        boolean r212 = r110;
        if ((r39 & 262144) == 0) goto L77;
        boolean r111 = r17.f95746s;
    L78:
        boolean r222 = r111;
        if ((r39 & 524288) == 0) goto L81;
        boolean r112 = r17.f95747t;
    L83:
        if ((r39 & 1048576) == 0) goto L86;
        boolean r232 = r112;
        boolean r382 = r232;
        String r392 = r17.f95748u;
    L88:
        return r17.a(r182, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r210, r192, r202, r212, r222, r382, r392);
    L86:
        r392 = r38;
        r382 = r112;
        goto L88
    L81:
        r112 = r37;
        goto L83
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

    public final d a(CryptoOrderType r24, String r25, String r26, String r27, String r28, String r29, float r30, String r31, String r32, boolean r33, String r34, String r35, String r36, String r37, String r38, String r39, String r40, boolean r41, boolean r42, boolean r43, String r44) {
        p.l(r24, "orderType");
        p.l(r25, "coinName");
        p.l(r26, "coinSymbol");
        p.l(r27, "coinLogoUrl");
        p.l(r28, "tradingBalance");
        p.l(r29, "availableBalance");
        p.l(r31, "investmentAmount");
        p.l(r32, "investmentAmountInput");
        p.l(r34, "priceInput");
        p.l(r35, "quantityInput");
        p.l(r36, "totalValue");
        p.l(r37, "feeLabel");
        p.l(r38, "exchangeFeeLabel");
        p.l(r39, "cfxFeeLabel");
        p.l(r40, "netTotal");
        p.l(r44, "depositShortfallPlain");
        return new d(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44);
    }

    public final String c() {
        return this.f95733f;
    }

    public final String d() {
        return this.f95743p;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (this.f95729a == r52.f95729a) goto L12;
        return false;
    L12:
        if (p.g(this.f95730b, r52.f95730b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f95731c, r52.f95731c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f95732e, r52.f95732e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f95733f, r52.f95733f) == true) goto L27;
        return false;
    L27:
        if (Float.compare(this.f95734g, r52.f95734g) == 0) goto L30;
        return false;
    L30:
        if (p.g(this.f95735h, r52.f95735h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f95736i, r52.f95736i) == true) goto L36;
        return false;
    L36:
        if (this.f95737j == r52.f95737j) goto L39;
        return false;
    L39:
        if (p.g(this.f95738k, r52.f95738k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f95739l, r52.f95739l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f95740m, r52.f95740m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f95741n, r52.f95741n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f95742o, r52.f95742o) == true) goto L54;
        return false;
    L54:
        if (p.g(this.f95743p, r52.f95743p) == true) goto L57;
        return false;
    L57:
        if (p.g(this.f95744q, r52.f95744q) == true) goto L60;
        return false;
    L60:
        if (this.f95745r == r52.f95745r) goto L63;
        return false;
    L63:
        if (this.f95746s == r52.f95746s) goto L66;
        return false;
    L66:
        if (this.f95747t == r52.f95747t) goto L69;
        return false;
    L69:
        if (p.g(this.f95748u, r52.f95748u) == true) goto L71;
        return false;
    L71:
        return true;
    }

    public final String f() {
        return this.f95730b;
    }

    public final String g() {
        return this.f95731c;
    }

    public final String h() {
        return this.f95748u;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((this.f95729a.hashCode() * 31) + this.f95730b.hashCode()) * 31) + this.f95731c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f95732e.hashCode()) * 31) + this.f95733f.hashCode()) * 31) + Float.hashCode(this.f95734g)) * 31) + this.f95735h.hashCode()) * 31) + this.f95736i.hashCode()) * 31) + Boolean.hashCode(this.f95737j)) * 31) + this.f95738k.hashCode()) * 31) + this.f95739l.hashCode()) * 31) + this.f95740m.hashCode()) * 31) + this.f95741n.hashCode()) * 31) + this.f95742o.hashCode()) * 31) + this.f95743p.hashCode()) * 31) + this.f95744q.hashCode()) * 31) + Boolean.hashCode(this.f95745r)) * 31) + Boolean.hashCode(this.f95746s)) * 31) + Boolean.hashCode(this.f95747t)) * 31) + this.f95748u.hashCode();
    }

    public final String i() {
        return this.f95742o;
    }

    public final boolean j() {
        return this.f95737j;
    }

    public final String k() {
        return this.f95735h;
    }

    public final String l() {
        return this.f95736i;
    }

    public final String m() {
        return this.f95744q;
    }

    public final CryptoOrderType n() {
        return this.f95729a;
    }

    public final String o() {
        return this.f95738k;
    }

    public final String p() {
        return this.f95739l;
    }

    public final float q() {
        return this.f95734g;
    }

    public final String r() {
        return this.f95740m;
    }

    public final String s() {
        return this.f95732e;
    }

    public final boolean t() {
        return this.f95747t;
    }

    public String toString() {
        return "CryptoBuyUIData(orderType=" + this.f95729a + ", coinName=" + this.f95730b + ", coinSymbol=" + this.f95731c + ", coinLogoUrl=" + this.d + ", tradingBalance=" + this.f95732e + ", availableBalance=" + this.f95733f + ", sliderPercentage=" + this.f95734g + ", investmentAmount=" + this.f95735h + ", investmentAmountInput=" + this.f95736i + ", hasInvestmentAmount=" + this.f95737j + ", priceInput=" + this.f95738k + ", quantityInput=" + this.f95739l + ", totalValue=" + this.f95740m + ", feeLabel=" + this.f95741n + ", exchangeFeeLabel=" + this.f95742o + ", cfxFeeLabel=" + this.f95743p + ", netTotal=" + this.f95744q + ", isSubmitEnabled=" + this.f95745r + ", isSubmitting=" + this.f95746s + ", isInsufficientFunds=" + this.f95747t + ", depositShortfallPlain=" + this.f95748u + ')';
    }

    public final boolean u() {
        return this.f95746s;
    }

    public /* synthetic */ d(CryptoOrderType r22, String r23, String r24, String r25, String r26, String r27, float r28, String r29, String r30, boolean r31, String r32, String r33, String r34, String r35, String r36, String r37, String r38, boolean r39, boolean r40, boolean r41, String r42, int r43, i r44) {
        if ((r43 & 1) == 0) goto L5;
        CryptoOrderType r1 = CryptoOrderType.LIMIT;
    L6:
        String r3 = "";
        if ((r43 & 2) == 0) goto L9;
        String r2 = "";
    L11:
        if ((r43 & 4) == 0) goto L13;
        String r4 = "";
    L15:
        if ((r43 & 8) == 0) goto L17;
        String r5 = "";
    L19:
        if ((r43 & 16) == 0) goto L21;
        String r6 = "";
    L23:
        if ((r43 & 32) == 0) goto L25;
        String r7 = "";
    L27:
        if ((r43 & 64) == 0) goto L29;
        float r8 = 0.0f;
    L31:
        if ((r43 & 128) == 0) goto L33;
        String r9 = "Rp 0";
    L35:
        if ((r43 & 256) == 0) goto L37;
        String r10 = "";
    L39:
        if ((r43 & 512) == 0) goto L41;
        boolean r11 = false;
    L43:
        if ((r43 & 1024) == 0) goto L45;
        String r13 = "";
    L47:
        if ((r43 & 2048) == 0) goto L49;
        String r14 = "";
    L51:
        if ((r43 & 4096) == 0) goto L53;
        String r15 = "";
    L55:
        if ((r43 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r12 = "";
    L58:
        CryptoOrderType r442 = r1;
        if ((r43 & 16384) == 0) goto L61;
        String r16 = "";
    L63:
        if ((r43 & 32768) == 0) goto L65;
        String r162 = "";
    L67:
        if ((r43 & 65536) != 0) goto L71;
        r3 = r38;
    L71:
        if ((r43 & 131072) == 0) goto L73;
        boolean r17 = false;
    L75:
        if ((r43 & 262144) == 0) goto L77;
        boolean r18 = false;
    L79:
        if ((r43 & 524288) == 0) goto L81;
        boolean r19 = false;
    L83:
        if ((r43 & 1048576) == 0) goto L86;
        String r432 = "0";
    L87:
        this(r442, r2, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r12, r16, r162, r3, r17, r18, r19, r432);
        return;
    L86:
        r432 = r42;
        goto L87
    L81:
        r19 = r41;
        goto L83
    L77:
        r18 = r40;
        goto L79
    L73:
        r17 = r39;
        goto L75
    L65:
        r162 = r37;
        goto L67
    L61:
        r16 = r36;
        goto L63
    L57:
        r12 = r35;
        goto L58
    L53:
        r15 = r34;
        goto L55
    L49:
        r14 = r33;
        goto L51
    L45:
        r13 = r32;
        goto L47
    L41:
        r11 = r31;
        goto L43
    L37:
        r10 = r30;
        goto L39
    L33:
        r9 = r29;
        goto L35
    L29:
        r8 = r28;
        goto L31
    L25:
        r7 = r27;
        goto L27
    L21:
        r6 = r26;
        goto L23
    L17:
        r5 = r25;
        goto L19
    L13:
        r4 = r24;
        goto L15
    L9:
        r2 = r23;
        goto L11
    L5:
        r1 = r22;
        goto L6
    }
}
