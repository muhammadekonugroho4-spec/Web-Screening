package com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.stockbit.usecase.transaction.model.SellProfitLossColorState;
import com.stockbit.usecase.transaction.model.type.GTCType;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class d extends e {

    /* renamed from: a, reason: collision with root package name */
    public final String f116147a;

    /* renamed from: b, reason: collision with root package name */
    public final String f116148b;

    /* renamed from: c, reason: collision with root package name */
    public final String f116149c;
    public final GTCType d;

    /* renamed from: e, reason: collision with root package name */
    public final String f116150e;

    /* renamed from: f, reason: collision with root package name */
    public final String f116151f;

    /* renamed from: g, reason: collision with root package name */
    public final String f116152g;

    /* renamed from: h, reason: collision with root package name */
    public final String f116153h;

    /* renamed from: i, reason: collision with root package name */
    public final String f116154i;

    /* renamed from: j, reason: collision with root package name */
    public final String f116155j;

    /* renamed from: k, reason: collision with root package name */
    public final String f116156k;

    /* renamed from: l, reason: collision with root package name */
    public final SellProfitLossColorState f116157l;

    /* renamed from: m, reason: collision with root package name */
    public final String f116158m;

    /* renamed from: n, reason: collision with root package name */
    public final String f116159n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f116160o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f116161p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f116162q;

    /* renamed from: r, reason: collision with root package name */
    public final String f116163r;

    /* renamed from: s, reason: collision with root package name */
    public final String f116164s;

    /* renamed from: t, reason: collision with root package name */
    public final String f116165t;

    static {
    }

    public d(String r17, String r18, String r19, GTCType r20, String r21, String r22, String r23, String r24, String r25, String r26, String r27, SellProfitLossColorState r28, String r29, String r30, boolean r31, boolean r32, boolean r33, String r34, String r35, String r36) {
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
        p.l(r34, "companyType");
        p.l(r35, "triggerVolumeInLot");
        p.l(r36, "triggerVolumeInPrice");
        this.f116147a = r17;
        this.f116148b = r18;
        this.f116149c = r19;
        this.d = r20;
        this.f116150e = r21;
        this.f116151f = r22;
        this.f116152g = r23;
        this.f116153h = r24;
        this.f116154i = r25;
        this.f116155j = r26;
        this.f116156k = r27;
        this.f116157l = r28;
        this.f116158m = r29;
        this.f116159n = r30;
        this.f116160o = r31;
        this.f116161p = r32;
        this.f116162q = r33;
        this.f116163r = r34;
        this.f116164s = r35;
        this.f116165t = r36;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public String a() {
        return this.f116163r;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public GTCType b() {
        return this.d;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public String c() {
        return this.f116150e;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public String d() {
        return this.f116149c;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public String e() {
        return this.f116151f;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public String f() {
        return this.f116152g;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public String g() {
        return this.f116156k;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public boolean h() {
        return this.f116161p;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public boolean i() {
        return this.f116162q;
    }

    @Override // com.stockbit.feature.transaction.ui.sellstockcompose.confirmationdialog.model.a
    public String j() {
        return this.f116147a;
    }

    public String k() {
        return this.f116158m;
    }

    public String l() {
        return this.f116153h;
    }

    public String m() {
        return this.f116154i;
    }

    public boolean n() {
        return this.f116160o;
    }

    public String o() {
        return this.f116159n;
    }

    public String p() {
        return this.f116155j;
    }

    public SellProfitLossColorState q() {
        return this.f116157l;
    }

    public String r() {
        return this.f116148b;
    }

    public final String s() {
        return this.f116164s;
    }

    public final String t() {
        return this.f116165t;
    }

    public /* synthetic */ d(String r25, String r26, String r27, GTCType r28, String r29, String r30, String r31, String r32, String r33, String r34, String r35, SellProfitLossColorState r36, String r37, String r38, boolean r39, boolean r40, boolean r41, String r42, String r43, String r44, int r45, kotlin.jvm.internal.i r46) {
        if ((r45 & 4096) == 0) goto L5;
        String r16 = "";
    L7:
        if ((r45 & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) goto L9;
        String r17 = "";
    L11:
        if ((r45 & 16384) == 0) goto L13;
        boolean r18 = false;
    L15:
        if ((65536 & r45) == 0) goto L17;
        boolean r20 = true;
    L19:
        if ((131072 & r45) == 0) goto L21;
        String r21 = "";
    L23:
        if ((262144 & r45) == 0) goto L25;
        String r22 = "";
    L27:
        if ((r45 & 524288) == 0) goto L30;
        String r23 = "";
    L31:
        this(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r16, r17, r18, r40, r20, r21, r22, r23);
        return;
    L30:
        r23 = r44;
        goto L31
    L25:
        r22 = r43;
        goto L27
    L21:
        r21 = r42;
        goto L23
    L17:
        r20 = r41;
        goto L19
    L13:
        r18 = r39;
        goto L15
    L9:
        r17 = r38;
        goto L11
    L5:
        r16 = r37;
        goto L7
    }
}
