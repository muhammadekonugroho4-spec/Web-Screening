package com.stockbit.feature.cryptotransaction.ui.sell.model;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.stockbit.usecase.cryptotransaction.contract.entity.CryptoOrderType;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final CryptoOrderType f96076a;

    /* renamed from: b, reason: collision with root package name */
    public final String f96077b;

    /* renamed from: c, reason: collision with root package name */
    public final String f96078c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final float f96079e;

    /* renamed from: f, reason: collision with root package name */
    public final String f96080f;

    /* renamed from: g, reason: collision with root package name */
    public final String f96081g;

    /* renamed from: h, reason: collision with root package name */
    public final String f96082h;

    /* renamed from: i, reason: collision with root package name */
    public final String f96083i;

    /* renamed from: j, reason: collision with root package name */
    public final String f96084j;

    /* renamed from: k, reason: collision with root package name */
    public final String f96085k;

    /* renamed from: l, reason: collision with root package name */
    public final String f96086l;

    /* renamed from: m, reason: collision with root package name */
    public final String f96087m;

    /* renamed from: n, reason: collision with root package name */
    public final String f96088n;

    /* renamed from: o, reason: collision with root package name */
    public final String f96089o;

    /* renamed from: p, reason: collision with root package name */
    public final String f96090p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f96091q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f96092r;

    static {
    }

    public d(CryptoOrderType r17, String r18, String r19, String r20, float r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, boolean r33, boolean r34) {
        p.l(r17, "orderType");
        p.l(r18, "coinName");
        p.l(r19, "coinSymbol");
        p.l(r20, "coinLogoUrl");
        p.l(r22, "availableQty");
        p.l(r23, "priceInput");
        p.l(r24, "quantityInput");
        p.l(r25, "totalValue");
        p.l(r26, "feeLabel");
        p.l(r27, "exchangeFeeLabel");
        p.l(r28, "cfxFeeLabel");
        p.l(r29, "taxFeePlain");
        p.l(r30, "netTotal");
        p.l(r31, "proceedsDisplay");
        p.l(r32, "pnlDisplay");
        this.f96076a = r17;
        this.f96077b = r18;
        this.f96078c = r19;
        this.d = r20;
        this.f96079e = r21;
        this.f96080f = r22;
        this.f96081g = r23;
        this.f96082h = r24;
        this.f96083i = r25;
        this.f96084j = r26;
        this.f96085k = r27;
        this.f96086l = r28;
        this.f96087m = r29;
        this.f96088n = r30;
        this.f96089o = r31;
        this.f96090p = r32;
        this.f96091q = r33;
        this.f96092r = r34;
    }

    public static /* synthetic */ d b(d r17, CryptoOrderType r18, String r19, String r20, String r21, float r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33, boolean r34, boolean r35, int r36, Object r37) {
        if ((r36 & 1) == 0) goto L5;
        CryptoOrderType r2 = r17.f96076a;
    L7:
        if ((r36 & 2) == 0) goto L9;
        String r3 = r17.f96077b;
    L11:
        if ((r36 & 4) == 0) goto L13;
        String r4 = r17.f96078c;
    L15:
        if ((r36 & 8) == 0) goto L17;
        String r5 = r17.d;
    L19:
        if ((r36 & 16) == 0) goto L21;
        float r6 = r17.f96079e;
    L23:
        if ((r36 & 32) == 0) goto L25;
        String r7 = r17.f96080f;
    L27:
        if ((r36 & 64) == 0) goto L29;
        String r8 = r17.f96081g;
    L31:
        if ((r36 & 128) == 0) goto L33;
        String r9 = r17.f96082h;
    L35:
        if ((r36 & 256) == 0) goto L37;
        String r10 = r17.f96083i;
    L39:
        if ((r36 & 512) == 0) goto L41;
        String r11 = r17.f96084j;
    L43:
        if ((r36 & 1024) == 0) goto L45;
        String r12 = r17.f96085k;
    L47:
        if ((r36 & 2048) == 0) goto L49;
        String r13 = r17.f96086l;
    L51:
        if ((r36 & 4096) == 0) goto L53;
        String r14 = r17.f96087m;
    L55:
        if ((r36 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r15 = r17.f96088n;
    L58:
        CryptoOrderType r182 = r2;
        if ((r36 & 16384) == 0) goto L61;
        String r210 = r17.f96089o;
    L63:
        if ((r36 & 32768) == 0) goto L65;
        String r1 = r17.f96090p;
    L66:
        String r192 = r1;
        if ((r36 & 65536) == 0) goto L69;
        boolean r16 = r17.f96091q;
    L71:
        if ((r36 & 131072) == 0) goto L74;
        boolean r202 = r16;
        boolean r352 = r202;
        boolean r362 = r17.f96092r;
    L76:
        return r17.a(r182, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r210, r192, r352, r362);
    L74:
        r362 = r35;
        r352 = r16;
        goto L76
    L69:
        r16 = r34;
        goto L71
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

    public final d a(CryptoOrderType r21, String r22, String r23, String r24, float r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33, String r34, String r35, String r36, boolean r37, boolean r38) {
        p.l(r21, "orderType");
        p.l(r22, "coinName");
        p.l(r23, "coinSymbol");
        p.l(r24, "coinLogoUrl");
        p.l(r26, "availableQty");
        p.l(r27, "priceInput");
        p.l(r28, "quantityInput");
        p.l(r29, "totalValue");
        p.l(r30, "feeLabel");
        p.l(r31, "exchangeFeeLabel");
        p.l(r32, "cfxFeeLabel");
        p.l(r33, "taxFeePlain");
        p.l(r34, "netTotal");
        p.l(r35, "proceedsDisplay");
        p.l(r36, "pnlDisplay");
        return new d(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38);
    }

    public final String c() {
        return this.f96080f;
    }

    public final String d() {
        return this.f96086l;
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
        if (this.f96076a == r52.f96076a) goto L12;
        return false;
    L12:
        if (p.g(this.f96077b, r52.f96077b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f96078c, r52.f96078c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (Float.compare(this.f96079e, r52.f96079e) == 0) goto L24;
        return false;
    L24:
        if (p.g(this.f96080f, r52.f96080f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f96081g, r52.f96081g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f96082h, r52.f96082h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f96083i, r52.f96083i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f96084j, r52.f96084j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f96085k, r52.f96085k) == true) goto L42;
        return false;
    L42:
        if (p.g(this.f96086l, r52.f96086l) == true) goto L45;
        return false;
    L45:
        if (p.g(this.f96087m, r52.f96087m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f96088n, r52.f96088n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f96089o, r52.f96089o) == true) goto L54;
        return false;
    L54:
        if (p.g(this.f96090p, r52.f96090p) == true) goto L57;
        return false;
    L57:
        if (this.f96091q == r52.f96091q) goto L60;
        return false;
    L60:
        if (this.f96092r == r52.f96092r) goto L62;
        return false;
    L62:
        return true;
    }

    public final String f() {
        return this.f96077b;
    }

    public final String g() {
        return this.f96078c;
    }

    public final String h() {
        return this.f96085k;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.f96076a.hashCode() * 31) + this.f96077b.hashCode()) * 31) + this.f96078c.hashCode()) * 31) + this.d.hashCode()) * 31) + Float.hashCode(this.f96079e)) * 31) + this.f96080f.hashCode()) * 31) + this.f96081g.hashCode()) * 31) + this.f96082h.hashCode()) * 31) + this.f96083i.hashCode()) * 31) + this.f96084j.hashCode()) * 31) + this.f96085k.hashCode()) * 31) + this.f96086l.hashCode()) * 31) + this.f96087m.hashCode()) * 31) + this.f96088n.hashCode()) * 31) + this.f96089o.hashCode()) * 31) + this.f96090p.hashCode()) * 31) + Boolean.hashCode(this.f96091q)) * 31) + Boolean.hashCode(this.f96092r);
    }

    public final String i() {
        return this.f96088n;
    }

    public final CryptoOrderType j() {
        return this.f96076a;
    }

    public final String k() {
        return this.f96090p;
    }

    public final String l() {
        return this.f96081g;
    }

    public final String m() {
        return this.f96089o;
    }

    public final String n() {
        return this.f96082h;
    }

    public final float o() {
        return this.f96079e;
    }

    public final String p() {
        return this.f96087m;
    }

    public final String q() {
        return this.f96083i;
    }

    public final boolean r() {
        return this.f96092r;
    }

    public final boolean s() {
        return this.f96091q;
    }

    public String toString() {
        return "CryptoSellUIData(orderType=" + this.f96076a + ", coinName=" + this.f96077b + ", coinSymbol=" + this.f96078c + ", coinLogoUrl=" + this.d + ", sliderPercentage=" + this.f96079e + ", availableQty=" + this.f96080f + ", priceInput=" + this.f96081g + ", quantityInput=" + this.f96082h + ", totalValue=" + this.f96083i + ", feeLabel=" + this.f96084j + ", exchangeFeeLabel=" + this.f96085k + ", cfxFeeLabel=" + this.f96086l + ", taxFeePlain=" + this.f96087m + ", netTotal=" + this.f96088n + ", proceedsDisplay=" + this.f96089o + ", pnlDisplay=" + this.f96090p + ", isSubmitting=" + this.f96091q + ", isInsufficientQty=" + this.f96092r + ')';
    }

    public /* synthetic */ d(CryptoOrderType r21, String r22, String r23, String r24, float r25, String r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33, String r34, String r35, String r36, boolean r37, boolean r38, int r39, i r40) {
        if ((r39 & 1) == 0) goto L5;
        CryptoOrderType r1 = CryptoOrderType.LIMIT;
    L6:
        String r3 = "";
        if ((r39 & 2) == 0) goto L9;
        String r2 = "";
    L11:
        if ((r39 & 4) == 0) goto L13;
        String r4 = "";
    L15:
        if ((r39 & 8) == 0) goto L17;
        String r5 = "";
    L19:
        if ((r39 & 16) == 0) goto L21;
        float r6 = 0.0f;
    L23:
        if ((r39 & 32) == 0) goto L25;
        String r7 = "";
    L27:
        if ((r39 & 64) == 0) goto L29;
        String r8 = "";
    L31:
        if ((r39 & 128) == 0) goto L33;
        String r9 = "";
    L35:
        if ((r39 & 256) == 0) goto L37;
        String r10 = "";
    L39:
        if ((r39 & 512) == 0) goto L41;
        String r11 = "";
    L43:
        if ((r39 & 1024) == 0) goto L45;
        String r12 = "";
    L47:
        if ((r39 & 2048) == 0) goto L49;
        String r13 = "";
    L51:
        if ((r39 & 4096) == 0) goto L53;
        String r14 = "0";
    L55:
        if ((r39 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) goto L59;
        r3 = r34;
    L59:
        if ((r39 & 16384) == 0) goto L61;
        String r15 = "Rp 0";
    L63:
        if ((r39 & 32768) == 0) goto L65;
        String r16 = "0 (0%)";
    L67:
        if ((r39 & 65536) == 0) goto L69;
        boolean r17 = false;
    L71:
        if ((r39 & 131072) == 0) goto L74;
        boolean r392 = false;
    L75:
        this(r1, r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r3, r15, r16, r17, r392);
        return;
    L74:
        r392 = r38;
        goto L75
    L69:
        r17 = r37;
        goto L71
    L65:
        r16 = r36;
        goto L67
    L61:
        r15 = r35;
        goto L63
    L53:
        r14 = r33;
        goto L55
    L49:
        r13 = r32;
        goto L51
    L45:
        r12 = r31;
        goto L47
    L41:
        r11 = r30;
        goto L43
    L37:
        r10 = r29;
        goto L39
    L33:
        r9 = r28;
        goto L35
    L29:
        r8 = r27;
        goto L31
    L25:
        r7 = r26;
        goto L27
    L21:
        r6 = r25;
        goto L23
    L17:
        r5 = r24;
        goto L19
    L13:
        r4 = r23;
        goto L15
    L9:
        r2 = r22;
        goto L11
    L5:
        r1 = r21;
        goto L6
    }
}
