package com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.stockbit.usecase.transaction.model.SellProfitLossColorState;
import com.stockbit.usecase.transaction.model.SplitMethodType;
import com.stockbit.usecase.transaction.model.type.GTCType;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class c extends e {

    /* renamed from: a, reason: collision with root package name */
    public final String f116125a;

    /* renamed from: b, reason: collision with root package name */
    public final String f116126b;

    /* renamed from: c, reason: collision with root package name */
    public final String f116127c;
    public final GTCType d;

    /* renamed from: e, reason: collision with root package name */
    public final String f116128e;

    /* renamed from: f, reason: collision with root package name */
    public final String f116129f;

    /* renamed from: g, reason: collision with root package name */
    public final String f116130g;

    /* renamed from: h, reason: collision with root package name */
    public final String f116131h;

    /* renamed from: i, reason: collision with root package name */
    public final String f116132i;

    /* renamed from: j, reason: collision with root package name */
    public final String f116133j;

    /* renamed from: k, reason: collision with root package name */
    public final String f116134k;

    /* renamed from: l, reason: collision with root package name */
    public final SellProfitLossColorState f116135l;

    /* renamed from: m, reason: collision with root package name */
    public final String f116136m;

    /* renamed from: n, reason: collision with root package name */
    public final String f116137n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f116138o;

    /* renamed from: p, reason: collision with root package name */
    public final String f116139p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f116140q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f116141r;

    /* renamed from: s, reason: collision with root package name */
    public final a f116142s;

    /* renamed from: t, reason: collision with root package name */
    public final String f116143t;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f116144a;

        /* renamed from: b, reason: collision with root package name */
        public final SplitMethodType f116145b;

        /* renamed from: c, reason: collision with root package name */
        public final kotlin.ranges.j f116146c;

        static {
        }

        public a(String r2, SplitMethodType r3, kotlin.ranges.j r4) {
            p.l(r2, "splitQty");
            p.l(r3, "splitMethod");
            p.l(r4, "splitRangeLot");
            this.f116144a = r2;
            this.f116145b = r3;
            this.f116146c = r4;
        }

        public final SplitMethodType a() {
            return this.f116145b;
        }

        public final String b() {
            return this.f116144a;
        }

        public final kotlin.ranges.j c() {
            return this.f116146c;
        }

        public boolean equals(Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof a) == true) goto L8;
            return false;
        L8:
            a r52 = (a) r5;
            if (p.g(this.f116144a, r52.f116144a) == true) goto L12;
            return false;
        L12:
            if (this.f116145b == r52.f116145b) goto L15;
            return false;
        L15:
            if (p.g(this.f116146c, r52.f116146c) == true) goto L17;
            return false;
        L17:
            return true;
        }

        public int hashCode() {
            return (((this.f116144a.hashCode() * 31) + this.f116145b.hashCode()) * 31) + this.f116146c.hashCode();
        }

        public String toString() {
            return "SplitOrderInfo(splitQty=" + this.f116144a + ", splitMethod=" + this.f116145b + ", splitRangeLot=" + this.f116146c + ')';
        }
    }

    static {
    }

    public c(String r17, String r18, String r19, GTCType r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, SellProfitLossColorState r28, String r29, String r30, boolean r31, String r32, boolean r33, boolean r34, a r35, String r36) {
        p.l(r17, "stockName");
        p.l(r18, "stockImage");
        p.l(r19, "orderType");
        p.l(r20, "expiry");
        p.l(r21, "lot");
        p.l(r22, FirebaseAnalytics.Param.PRICE);
        p.l(r23, "proceedAmount");
        p.l(r24, "brokerFee");
        p.l(r25, "exchangeFee");
        p.l(r26, "proceedAmountNetFee");
        p.l(r27, "profitOrLoss");
        p.l(r28, "profitOrLossColor");
        p.l(r29, "boardType");
        p.l(r30, "portfolioType");
        p.l(r32, "companyType");
        p.l(r36, "triggerVolumeInLot");
        this.f116125a = r17;
        this.f116126b = r18;
        this.f116127c = r19;
        this.d = r20;
        this.f116128e = r21;
        this.f116129f = r22;
        this.f116130g = r23;
        this.f116131h = r24;
        this.f116132i = r25;
        this.f116133j = r26;
        this.f116134k = r27;
        this.f116135l = r28;
        this.f116136m = r29;
        this.f116137n = r30;
        this.f116138o = r31;
        this.f116139p = r32;
        this.f116140q = r33;
        this.f116141r = r34;
        this.f116142s = r35;
        this.f116143t = r36;
    }

    public static /* synthetic */ c l(c r17, String r18, String r19, String r20, GTCType r21, String r22, String r23, String r24, String r25, String r26, String r27, String r28, SellProfitLossColorState r29, String r30, String r31, boolean r32, String r33, boolean r34, boolean r35, a r36, String r37, int r38, Object r39) {
        if ((r38 & 1) == 0) goto L5;
        String r2 = r17.f116125a;
    L7:
        if ((r38 & 2) == 0) goto L9;
        String r3 = r17.f116126b;
    L11:
        if ((r38 & 4) == 0) goto L13;
        String r4 = r17.f116127c;
    L15:
        if ((r38 & 8) == 0) goto L17;
        GTCType r5 = r17.d;
    L19:
        if ((r38 & 16) == 0) goto L21;
        String r6 = r17.f116128e;
    L23:
        if ((r38 & 32) == 0) goto L25;
        String r7 = r17.f116129f;
    L27:
        if ((r38 & 64) == 0) goto L29;
        String r8 = r17.f116130g;
    L31:
        if ((r38 & 128) == 0) goto L33;
        String r9 = r17.f116131h;
    L35:
        if ((r38 & 256) == 0) goto L37;
        String r10 = r17.f116132i;
    L39:
        if ((r38 & 512) == 0) goto L41;
        String r11 = r17.f116133j;
    L43:
        if ((r38 & 1024) == 0) goto L45;
        String r12 = r17.f116134k;
    L47:
        if ((r38 & 2048) == 0) goto L49;
        SellProfitLossColorState r13 = r17.f116135l;
    L51:
        if ((r38 & 4096) == 0) goto L53;
        String r14 = r17.f116136m;
    L55:
        if ((r38 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L57;
        String r15 = r17.f116137n;
    L58:
        String r182 = r2;
        if ((r38 & 16384) == 0) goto L61;
        boolean r210 = r17.f116138o;
    L63:
        if ((r38 & 32768) == 0) goto L65;
        String r1 = r17.f116139p;
    L66:
        String r192 = r1;
        if ((r38 & 65536) == 0) goto L69;
        boolean r16 = r17.f116140q;
    L70:
        boolean r202 = r16;
        if ((r38 & 131072) == 0) goto L73;
        boolean r110 = r17.f116141r;
    L74:
        boolean r212 = r110;
        if ((r38 & 262144) == 0) goto L77;
        a r111 = r17.f116142s;
    L79:
        if ((r38 & 524288) == 0) goto L82;
        a r222 = r111;
        a r372 = r222;
        String r382 = r17.f116143t;
    L84:
        return r17.k(r182, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r210, r192, r202, r212, r372, r382);
    L82:
        r382 = r37;
        r372 = r111;
        goto L84
    L77:
        r111 = r36;
        goto L79
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

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public String a() {
        return this.f116139p;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public GTCType b() {
        return this.d;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public String c() {
        return this.f116128e;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public String d() {
        return this.f116127c;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public String e() {
        return this.f116129f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f116125a, r52.f116125a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f116126b, r52.f116126b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f116127c, r52.f116127c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f116128e, r52.f116128e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f116129f, r52.f116129f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f116130g, r52.f116130g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f116131h, r52.f116131h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f116132i, r52.f116132i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f116133j, r52.f116133j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f116134k, r52.f116134k) == true) goto L42;
        return false;
    L42:
        if (this.f116135l == r52.f116135l) goto L45;
        return false;
    L45:
        if (p.g(this.f116136m, r52.f116136m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f116137n, r52.f116137n) == true) goto L51;
        return false;
    L51:
        if (this.f116138o == r52.f116138o) goto L54;
        return false;
    L54:
        if (p.g(this.f116139p, r52.f116139p) == true) goto L57;
        return false;
    L57:
        if (this.f116140q == r52.f116140q) goto L60;
        return false;
    L60:
        if (this.f116141r == r52.f116141r) goto L63;
        return false;
    L63:
        if (p.g(this.f116142s, r52.f116142s) == true) goto L66;
        return false;
    L66:
        if (p.g(this.f116143t, r52.f116143t) == true) goto L68;
        return false;
    L68:
        return true;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public String f() {
        return this.f116130g;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public String g() {
        return this.f116134k;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public boolean h() {
        return this.f116140q;
    }

    public int hashCode() {
        int r02 = ((((((((((((((((((((((((((((((((((this.f116125a.hashCode() * 31) + this.f116126b.hashCode()) * 31) + this.f116127c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f116128e.hashCode()) * 31) + this.f116129f.hashCode()) * 31) + this.f116130g.hashCode()) * 31) + this.f116131h.hashCode()) * 31) + this.f116132i.hashCode()) * 31) + this.f116133j.hashCode()) * 31) + this.f116134k.hashCode()) * 31) + this.f116135l.hashCode()) * 31) + this.f116136m.hashCode()) * 31) + this.f116137n.hashCode()) * 31) + Boolean.hashCode(this.f116138o)) * 31) + this.f116139p.hashCode()) * 31) + Boolean.hashCode(this.f116140q)) * 31) + Boolean.hashCode(this.f116141r)) * 31;
        a r1 = this.f116142s;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((r02 + r12) * 31) + this.f116143t.hashCode();
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public boolean i() {
        return this.f116141r;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public String j() {
        return this.f116125a;
    }

    public final c k(String r23, String r24, String r25, GTCType r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33, SellProfitLossColorState r34, String r35, String r36, boolean r37, String r38, boolean r39, boolean r40, a r41, String r42) {
        p.l(r23, "stockName");
        p.l(r24, "stockImage");
        p.l(r25, "orderType");
        p.l(r26, "expiry");
        p.l(r27, "lot");
        p.l(r28, FirebaseAnalytics.Param.PRICE);
        p.l(r29, "proceedAmount");
        p.l(r30, "brokerFee");
        p.l(r31, "exchangeFee");
        p.l(r32, "proceedAmountNetFee");
        p.l(r33, "profitOrLoss");
        p.l(r34, "profitOrLossColor");
        p.l(r35, "boardType");
        p.l(r36, "portfolioType");
        p.l(r38, "companyType");
        p.l(r42, "triggerVolumeInLot");
        return new c(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42);
    }

    public String m() {
        return this.f116136m;
    }

    public String n() {
        return this.f116131h;
    }

    public String o() {
        return this.f116132i;
    }

    public boolean p() {
        return this.f116138o;
    }

    public String q() {
        return this.f116137n;
    }

    public String r() {
        return this.f116133j;
    }

    public SellProfitLossColorState s() {
        return this.f116135l;
    }

    public final a t() {
        return this.f116142s;
    }

    public String toString() {
        return "SellConfirmationLimitOrderUiState(stockName=" + this.f116125a + ", stockImage=" + this.f116126b + ", orderType=" + this.f116127c + ", expiry=" + this.d + ", lot=" + this.f116128e + ", price=" + this.f116129f + ", proceedAmount=" + this.f116130g + ", brokerFee=" + this.f116131h + ", exchangeFee=" + this.f116132i + ", proceedAmountNetFee=" + this.f116133j + ", profitOrLoss=" + this.f116134k + ", profitOrLossColor=" + this.f116135l + ", boardType=" + this.f116136m + ", portfolioType=" + this.f116137n + ", otherLotAvailable=" + this.f116138o + ", companyType=" + this.f116139p + ", showBackToOrderPage=" + this.f116140q + ", showShareTrade=" + this.f116141r + ", splitOrderInfo=" + this.f116142s + ", triggerVolumeInLot=" + this.f116143t + ')';
    }

    public String u() {
        return this.f116126b;
    }

    public final String v() {
        return this.f116143t;
    }
}
