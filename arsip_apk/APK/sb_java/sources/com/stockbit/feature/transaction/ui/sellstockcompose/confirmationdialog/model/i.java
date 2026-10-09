package com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.stockbit.usecase.securities.model.SellSmartOrderType;
import com.stockbit.usecase.transaction.model.SellProfitLossColorState;
import com.stockbit.usecase.transaction.model.type.GTCType;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class i extends a {

    /* renamed from: a, reason: collision with root package name */
    public final String f116204a;

    /* renamed from: b, reason: collision with root package name */
    public final String f116205b;

    /* renamed from: c, reason: collision with root package name */
    public final String f116206c;
    public final GTCType d;

    /* renamed from: e, reason: collision with root package name */
    public final String f116207e;

    /* renamed from: f, reason: collision with root package name */
    public final String f116208f;

    /* renamed from: g, reason: collision with root package name */
    public final String f116209g;

    /* renamed from: h, reason: collision with root package name */
    public final String f116210h;

    /* renamed from: i, reason: collision with root package name */
    public final String f116211i;

    /* renamed from: j, reason: collision with root package name */
    public final String f116212j;

    /* renamed from: k, reason: collision with root package name */
    public final String f116213k;

    /* renamed from: l, reason: collision with root package name */
    public final SellProfitLossColorState f116214l;

    /* renamed from: m, reason: collision with root package name */
    public final String f116215m;

    /* renamed from: n, reason: collision with root package name */
    public final String f116216n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f116217o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f116218p;

    /* renamed from: q, reason: collision with root package name */
    public final String f116219q;

    /* renamed from: r, reason: collision with root package name */
    public final SellSmartOrderType f116220r;

    static {
    }

    public i(String r17, String r18, String r19, GTCType r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, SellProfitLossColorState r28, String r29, String r30, boolean r31, boolean r32, String r33, SellSmartOrderType r34) {
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
        p.l(r30, "companyType");
        p.l(r33, "trailPercentage");
        p.l(r34, "sellSmartOrderType");
        this.f116204a = r17;
        this.f116205b = r18;
        this.f116206c = r19;
        this.d = r20;
        this.f116207e = r21;
        this.f116208f = r22;
        this.f116209g = r23;
        this.f116210h = r24;
        this.f116211i = r25;
        this.f116212j = r26;
        this.f116213k = r27;
        this.f116214l = r28;
        this.f116215m = r29;
        this.f116216n = r30;
        this.f116217o = r31;
        this.f116218p = r32;
        this.f116219q = r33;
        this.f116220r = r34;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public String a() {
        return this.f116216n;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public GTCType b() {
        return this.d;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public String c() {
        return this.f116207e;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public String d() {
        return this.f116206c;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public String e() {
        return this.f116208f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (p.g(this.f116204a, r52.f116204a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f116205b, r52.f116205b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f116206c, r52.f116206c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f116207e, r52.f116207e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f116208f, r52.f116208f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f116209g, r52.f116209g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f116210h, r52.f116210h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f116211i, r52.f116211i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f116212j, r52.f116212j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f116213k, r52.f116213k) == true) goto L42;
        return false;
    L42:
        if (this.f116214l == r52.f116214l) goto L45;
        return false;
    L45:
        if (p.g(this.f116215m, r52.f116215m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f116216n, r52.f116216n) == true) goto L51;
        return false;
    L51:
        if (this.f116217o == r52.f116217o) goto L54;
        return false;
    L54:
        if (this.f116218p == r52.f116218p) goto L57;
        return false;
    L57:
        if (p.g(this.f116219q, r52.f116219q) == true) goto L60;
        return false;
    L60:
        if (this.f116220r == r52.f116220r) goto L62;
        return false;
    L62:
        return true;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public String f() {
        return this.f116209g;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public String g() {
        return this.f116213k;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public boolean h() {
        return this.f116217o;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.f116204a.hashCode() * 31) + this.f116205b.hashCode()) * 31) + this.f116206c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f116207e.hashCode()) * 31) + this.f116208f.hashCode()) * 31) + this.f116209g.hashCode()) * 31) + this.f116210h.hashCode()) * 31) + this.f116211i.hashCode()) * 31) + this.f116212j.hashCode()) * 31) + this.f116213k.hashCode()) * 31) + this.f116214l.hashCode()) * 31) + this.f116215m.hashCode()) * 31) + this.f116216n.hashCode()) * 31) + Boolean.hashCode(this.f116217o)) * 31) + Boolean.hashCode(this.f116218p)) * 31) + this.f116219q.hashCode()) * 31) + this.f116220r.hashCode();
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public boolean i() {
        return this.f116218p;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public String j() {
        return this.f116204a;
    }

    public String k() {
        return this.f116215m;
    }

    public String l() {
        return this.f116210h;
    }

    public String m() {
        return this.f116211i;
    }

    public String n() {
        return this.f116212j;
    }

    public SellProfitLossColorState o() {
        return this.f116214l;
    }

    public final SellSmartOrderType p() {
        return this.f116220r;
    }

    public String q() {
        return this.f116205b;
    }

    public final String r() {
        return this.f116219q;
    }

    public String toString() {
        return "SellConfirmationTrailingStopOrderUiState(stockName=" + this.f116204a + ", stockImage=" + this.f116205b + ", orderType=" + this.f116206c + ", expiry=" + this.d + ", lot=" + this.f116207e + ", price=" + this.f116208f + ", proceedAmount=" + this.f116209g + ", brokerFee=" + this.f116210h + ", exchangeFee=" + this.f116211i + ", proceedAmountNetFee=" + this.f116212j + ", profitOrLoss=" + this.f116213k + ", profitOrLossColor=" + this.f116214l + ", boardType=" + this.f116215m + ", companyType=" + this.f116216n + ", showBackToOrderPage=" + this.f116217o + ", showShareTrade=" + this.f116218p + ", trailPercentage=" + this.f116219q + ", sellSmartOrderType=" + this.f116220r + ')';
    }

    public /* synthetic */ i(String r23, String r24, String r25, GTCType r26, String r27, String r28, String r29, String r30, String r31, String r32, String r33, SellProfitLossColorState r34, String r35, String r36, boolean r37, boolean r38, String r39, SellSmartOrderType r40, int r41, kotlin.jvm.internal.i r42) {
        if ((r41 & 4096) == 0) goto L5;
        String r16 = "";
    L7:
        if ((r41 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L9;
        String r17 = "";
    L11:
        if ((32768 & r41) == 0) goto L13;
        boolean r19 = false;
    L15:
        if ((r41 & 131072) == 0) goto L18;
        SellSmartOrderType r21 = SellSmartOrderType.ORDER_TYPE_MARKET;
    L19:
        this(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r16, r17, r37, r19, r39, r21);
        return;
    L18:
        r21 = r40;
        goto L19
    L13:
        r19 = r38;
        goto L15
    L9:
        r17 = r36;
        goto L11
    L5:
        r16 = r35;
        goto L7
    }
}
