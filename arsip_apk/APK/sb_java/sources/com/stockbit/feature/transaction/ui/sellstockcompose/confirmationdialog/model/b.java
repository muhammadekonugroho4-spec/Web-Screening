package com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.stockbit.usecase.securities.model.type.OrderTriggerType;
import com.stockbit.usecase.securities.model.type.StopOrderLeverageType;
import com.stockbit.usecase.transaction.model.SellProfitLossColorState;
import com.stockbit.usecase.transaction.model.type.GTCType;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class b extends a {

    /* renamed from: a, reason: collision with root package name */
    public final String f116107a;

    /* renamed from: b, reason: collision with root package name */
    public final String f116108b;

    /* renamed from: c, reason: collision with root package name */
    public final String f116109c;
    public final GTCType d;

    /* renamed from: e, reason: collision with root package name */
    public final String f116110e;

    /* renamed from: f, reason: collision with root package name */
    public final String f116111f;

    /* renamed from: g, reason: collision with root package name */
    public final String f116112g;

    /* renamed from: h, reason: collision with root package name */
    public final String f116113h;

    /* renamed from: i, reason: collision with root package name */
    public final String f116114i;

    /* renamed from: j, reason: collision with root package name */
    public final String f116115j;

    /* renamed from: k, reason: collision with root package name */
    public final String f116116k;

    /* renamed from: l, reason: collision with root package name */
    public final SellProfitLossColorState f116117l;

    /* renamed from: m, reason: collision with root package name */
    public final String f116118m;

    /* renamed from: n, reason: collision with root package name */
    public final String f116119n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f116120o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f116121p;

    /* renamed from: q, reason: collision with root package name */
    public final int f116122q;

    /* renamed from: r, reason: collision with root package name */
    public final OrderTriggerType f116123r;

    /* renamed from: s, reason: collision with root package name */
    public final StopOrderLeverageType f116124s;

    static {
    }

    public b(String r17, String r18, String r19, GTCType r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, SellProfitLossColorState r28, String r29, String r30, boolean r31, boolean r32, int r33, OrderTriggerType r34, StopOrderLeverageType r35) {
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
        p.l(r34, "triggerType");
        p.l(r35, "leverageType");
        this.f116107a = r17;
        this.f116108b = r18;
        this.f116109c = r19;
        this.d = r20;
        this.f116110e = r21;
        this.f116111f = r22;
        this.f116112g = r23;
        this.f116113h = r24;
        this.f116114i = r25;
        this.f116115j = r26;
        this.f116116k = r27;
        this.f116117l = r28;
        this.f116118m = r29;
        this.f116119n = r30;
        this.f116120o = r31;
        this.f116121p = r32;
        this.f116122q = r33;
        this.f116123r = r34;
        this.f116124s = r35;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public String a() {
        return this.f116119n;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public GTCType b() {
        return this.d;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public String c() {
        return this.f116110e;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public String d() {
        return this.f116109c;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public String e() {
        return this.f116111f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f116107a, r52.f116107a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f116108b, r52.f116108b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f116109c, r52.f116109c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f116110e, r52.f116110e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f116111f, r52.f116111f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f116112g, r52.f116112g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f116113h, r52.f116113h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f116114i, r52.f116114i) == true) goto L36;
        return false;
    L36:
        if (p.g(this.f116115j, r52.f116115j) == true) goto L39;
        return false;
    L39:
        if (p.g(this.f116116k, r52.f116116k) == true) goto L42;
        return false;
    L42:
        if (this.f116117l == r52.f116117l) goto L45;
        return false;
    L45:
        if (p.g(this.f116118m, r52.f116118m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f116119n, r52.f116119n) == true) goto L51;
        return false;
    L51:
        if (this.f116120o == r52.f116120o) goto L54;
        return false;
    L54:
        if (this.f116121p == r52.f116121p) goto L57;
        return false;
    L57:
        if (this.f116122q == r52.f116122q) goto L60;
        return false;
    L60:
        if (this.f116123r == r52.f116123r) goto L63;
        return false;
    L63:
        if (this.f116124s == r52.f116124s) goto L65;
        return false;
    L65:
        return true;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public String f() {
        return this.f116112g;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public String g() {
        return this.f116116k;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public boolean h() {
        return this.f116120o;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((this.f116107a.hashCode() * 31) + this.f116108b.hashCode()) * 31) + this.f116109c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f116110e.hashCode()) * 31) + this.f116111f.hashCode()) * 31) + this.f116112g.hashCode()) * 31) + this.f116113h.hashCode()) * 31) + this.f116114i.hashCode()) * 31) + this.f116115j.hashCode()) * 31) + this.f116116k.hashCode()) * 31) + this.f116117l.hashCode()) * 31) + this.f116118m.hashCode()) * 31) + this.f116119n.hashCode()) * 31) + Boolean.hashCode(this.f116120o)) * 31) + Boolean.hashCode(this.f116121p)) * 31) + Integer.hashCode(this.f116122q)) * 31) + this.f116123r.hashCode()) * 31) + this.f116124s.hashCode();
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public boolean i() {
        return this.f116121p;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public String j() {
        return this.f116107a;
    }

    public String k() {
        return this.f116113h;
    }

    public String l() {
        return this.f116114i;
    }

    public final StopOrderLeverageType m() {
        return this.f116124s;
    }

    public String n() {
        return this.f116115j;
    }

    public SellProfitLossColorState o() {
        return this.f116117l;
    }

    public String p() {
        return this.f116108b;
    }

    public final int q() {
        return this.f116122q;
    }

    public final OrderTriggerType r() {
        return this.f116123r;
    }

    public String toString() {
        return "SellConfirmationLITOrderUiState(stockName=" + this.f116107a + ", stockImage=" + this.f116108b + ", orderType=" + this.f116109c + ", expiry=" + this.d + ", lot=" + this.f116110e + ", price=" + this.f116111f + ", proceedAmount=" + this.f116112g + ", brokerFee=" + this.f116113h + ", exchangeFee=" + this.f116114i + ", proceedAmountNetFee=" + this.f116115j + ", profitOrLoss=" + this.f116116k + ", profitOrLossColor=" + this.f116117l + ", boardType=" + this.f116118m + ", companyType=" + this.f116119n + ", showBackToOrderPage=" + this.f116120o + ", showShareTrade=" + this.f116121p + ", triggerPrice=" + this.f116122q + ", triggerType=" + this.f116123r + ", leverageType=" + this.f116124s + ')';
    }

    public /* synthetic */ b(String r24, String r25, String r26, GTCType r27, String r28, String r29, String r30, String r31, String r32, String r33, String r34, SellProfitLossColorState r35, String r36, String r37, boolean r38, boolean r39, int r40, OrderTriggerType r41, StopOrderLeverageType r42, int r43, kotlin.jvm.internal.i r44) {
        if ((r43 & 4096) == 0) goto L5;
        String r16 = "";
    L7:
        if ((r43 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L9;
        String r17 = "";
    L11:
        if ((32768 & r43) == 0) goto L13;
        boolean r19 = false;
    L15:
        if ((r43 & 262144) == 0) goto L18;
        StopOrderLeverageType r22 = StopOrderLeverageType.REGULAR;
    L19:
        this(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r16, r17, r38, r19, r40, r41, r22);
        return;
    L18:
        r22 = r42;
        goto L19
    L13:
        r19 = r39;
        goto L15
    L9:
        r17 = r37;
        goto L11
    L5:
        r16 = r36;
        goto L7
    }
}
