package com.stockbit.feature.transaction.ui.buystockcompose.model;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* renamed from: com.stockbit.feature.transaction.ui.buystockcompose.model.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C8477b {

    /* renamed from: a, reason: collision with root package name */
    public final String f111503a;

    /* renamed from: b, reason: collision with root package name */
    public final String f111504b;

    /* renamed from: c, reason: collision with root package name */
    public final String f111505c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f111506e;

    /* renamed from: f, reason: collision with root package name */
    public final String f111507f;

    /* renamed from: g, reason: collision with root package name */
    public final String f111508g;

    /* renamed from: h, reason: collision with root package name */
    public final String f111509h;

    /* renamed from: i, reason: collision with root package name */
    public final String f111510i;

    /* renamed from: j, reason: collision with root package name */
    public final String f111511j;

    /* renamed from: k, reason: collision with root package name */
    public final String f111512k;

    /* renamed from: l, reason: collision with root package name */
    public final String f111513l;

    /* renamed from: m, reason: collision with root package name */
    public final String f111514m;

    /* renamed from: n, reason: collision with root package name */
    public final String f111515n;

    static {
    }

    public C8477b(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10, String r11, String r12, String r13, String r14, String r15) {
        kotlin.jvm.internal.p.l(r2, "buyFee");
        kotlin.jvm.internal.p.l(r3, "sellFee");
        kotlin.jvm.internal.p.l(r4, "brokerFee");
        kotlin.jvm.internal.p.l(r5, "exchangeTotalBuyFee");
        kotlin.jvm.internal.p.l(r6, "buyAmountExchangeFee");
        kotlin.jvm.internal.p.l(r7, "buyAmountInvestedFee");
        kotlin.jvm.internal.p.l(r8, "buyAmountBrokerFee");
        kotlin.jvm.internal.p.l(r9, "portionDeductToTB");
        kotlin.jvm.internal.p.l(r10, "dayTradeInvestment");
        kotlin.jvm.internal.p.l(r11, "dayTradePortionTB");
        kotlin.jvm.internal.p.l(r12, "marginPotentialMarginRatio");
        kotlin.jvm.internal.p.l(r13, "marginOrderDebt");
        kotlin.jvm.internal.p.l(r14, "marginCollateralValueFromOrder");
        kotlin.jvm.internal.p.l(r15, "marginUserCash");
        this.f111503a = r2;
        this.f111504b = r3;
        this.f111505c = r4;
        this.d = r5;
        this.f111506e = r6;
        this.f111507f = r7;
        this.f111508g = r8;
        this.f111509h = r9;
        this.f111510i = r10;
        this.f111511j = r11;
        this.f111512k = r12;
        this.f111513l = r13;
        this.f111514m = r14;
        this.f111515n = r15;
    }

    public final String a() {
        return this.f111505c;
    }

    public final String b() {
        return this.f111508g;
    }

    public final String c() {
        return this.f111506e;
    }

    public final String d() {
        return this.f111507f;
    }

    public final String e() {
        return this.f111503a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C8477b) == true) goto L8;
        return false;
    L8:
        C8477b r52 = (C8477b) r5;
        if (kotlin.jvm.internal.p.g(this.f111503a, r52.f111503a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f111504b, r52.f111504b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f111505c, r52.f111505c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f111506e, r52.f111506e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f111507f, r52.f111507f) == true) goto L27;
        return false;
    L27:
        if (kotlin.jvm.internal.p.g(this.f111508g, r52.f111508g) == true) goto L30;
        return false;
    L30:
        if (kotlin.jvm.internal.p.g(this.f111509h, r52.f111509h) == true) goto L33;
        return false;
    L33:
        if (kotlin.jvm.internal.p.g(this.f111510i, r52.f111510i) == true) goto L36;
        return false;
    L36:
        if (kotlin.jvm.internal.p.g(this.f111511j, r52.f111511j) == true) goto L39;
        return false;
    L39:
        if (kotlin.jvm.internal.p.g(this.f111512k, r52.f111512k) == true) goto L42;
        return false;
    L42:
        if (kotlin.jvm.internal.p.g(this.f111513l, r52.f111513l) == true) goto L45;
        return false;
    L45:
        if (kotlin.jvm.internal.p.g(this.f111514m, r52.f111514m) == true) goto L48;
        return false;
    L48:
        if (kotlin.jvm.internal.p.g(this.f111515n, r52.f111515n) == true) goto L50;
        return false;
    L50:
        return true;
    }

    public final String f() {
        return this.f111510i;
    }

    public final String g() {
        return this.f111511j;
    }

    public final String h() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.f111503a.hashCode() * 31) + this.f111504b.hashCode()) * 31) + this.f111505c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f111506e.hashCode()) * 31) + this.f111507f.hashCode()) * 31) + this.f111508g.hashCode()) * 31) + this.f111509h.hashCode()) * 31) + this.f111510i.hashCode()) * 31) + this.f111511j.hashCode()) * 31) + this.f111512k.hashCode()) * 31) + this.f111513l.hashCode()) * 31) + this.f111514m.hashCode()) * 31) + this.f111515n.hashCode();
    }

    public final String i() {
        return this.f111514m;
    }

    public final String j() {
        return this.f111513l;
    }

    public final String k() {
        return this.f111512k;
    }

    public final String l() {
        return this.f111509h;
    }

    public final String m() {
        return this.f111504b;
    }

    public String toString() {
        return "BuyFormulaUIState(buyFee=" + this.f111503a + ", sellFee=" + this.f111504b + ", brokerFee=" + this.f111505c + ", exchangeTotalBuyFee=" + this.d + ", buyAmountExchangeFee=" + this.f111506e + ", buyAmountInvestedFee=" + this.f111507f + ", buyAmountBrokerFee=" + this.f111508g + ", portionDeductToTB=" + this.f111509h + ", dayTradeInvestment=" + this.f111510i + ", dayTradePortionTB=" + this.f111511j + ", marginPotentialMarginRatio=" + this.f111512k + ", marginOrderDebt=" + this.f111513l + ", marginCollateralValueFromOrder=" + this.f111514m + ", marginUserCash=" + this.f111515n + ')';
    }

    public /* synthetic */ C8477b(String r16, String r17, String r18, String r19, String r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, String r29, int r30, kotlin.jvm.internal.i r31) {
        if ((r30 & 1) == 0) goto L5;
        String r1 = "";
    L7:
        if ((r30 & 2) == 0) goto L9;
        String r3 = "";
    L11:
        if ((r30 & 4) == 0) goto L13;
        String r4 = "";
    L15:
        if ((r30 & 8) == 0) goto L17;
        String r5 = "";
    L19:
        if ((r30 & 16) == 0) goto L21;
        String r6 = "";
    L23:
        if ((r30 & 32) == 0) goto L25;
        String r7 = "";
    L27:
        if ((r30 & 64) == 0) goto L29;
        String r8 = "";
    L31:
        if ((r30 & 128) == 0) goto L33;
        String r9 = "";
    L35:
        if ((r30 & 256) == 0) goto L37;
        String r10 = "";
    L39:
        if ((r30 & 512) == 0) goto L41;
        String r11 = "";
    L43:
        if ((r30 & 1024) == 0) goto L45;
        String r12 = "";
    L47:
        if ((r30 & 2048) == 0) goto L49;
        String r13 = "";
    L51:
        if ((r30 & 4096) == 0) goto L53;
        String r14 = "";
    L55:
        if ((r30 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L58;
        String r302 = "";
    L59:
        this(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r302);
        return;
    L58:
        r302 = r29;
        goto L59
    L53:
        r14 = r28;
        goto L55
    L49:
        r13 = r27;
        goto L51
    L45:
        r12 = r26;
        goto L47
    L41:
        r11 = r25;
        goto L43
    L37:
        r10 = r24;
        goto L39
    L33:
        r9 = r23;
        goto L35
    L29:
        r8 = r22;
        goto L31
    L25:
        r7 = r21;
        goto L27
    L21:
        r6 = r20;
        goto L23
    L17:
        r5 = r19;
        goto L19
    L13:
        r4 = r18;
        goto L15
    L9:
        r3 = r17;
        goto L11
    L5:
        r1 = r16;
        goto L7
    }
}
