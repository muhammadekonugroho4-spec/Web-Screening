package com.stockbit.features.tradingperformance.ui.trade.model;

import com.clevertap.android.sdk.Constants;
import com.stockbit.usecase.tradingperformance.model.ProfitType;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f119965a;

    /* renamed from: b, reason: collision with root package name */
    public final String f119966b;

    /* renamed from: c, reason: collision with root package name */
    public final ProfitType f119967c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final ProfitType f119968e;

    /* renamed from: f, reason: collision with root package name */
    public final String f119969f;

    /* renamed from: g, reason: collision with root package name */
    public final ProfitType f119970g;

    /* renamed from: h, reason: collision with root package name */
    public final String f119971h;

    /* renamed from: i, reason: collision with root package name */
    public final ProfitType f119972i;

    /* renamed from: j, reason: collision with root package name */
    public final String f119973j;

    /* renamed from: k, reason: collision with root package name */
    public final ProfitType f119974k;

    static {
    }

    public a(String r2, String r3, ProfitType r4, String r5, ProfitType r6, String r7, ProfitType r8, String r9, ProfitType r10, String r11, ProfitType r12) {
        p.l(r2, Constants.KEY_DATE);
        p.l(r3, "amount");
        p.l(r4, "amountProfitType");
        p.l(r5, "totalRealizedGain");
        p.l(r6, "totalRealizedGainType");
        p.l(r7, "realizedGain");
        p.l(r8, "realizedGainType");
        p.l(r9, "realizedLoss");
        p.l(r10, "realizedLossType");
        p.l(r11, "totalDividendReceived");
        p.l(r12, "totalDividendReceivedType");
        this.f119965a = r2;
        this.f119966b = r3;
        this.f119967c = r4;
        this.d = r5;
        this.f119968e = r6;
        this.f119969f = r7;
        this.f119970g = r8;
        this.f119971h = r9;
        this.f119972i = r10;
        this.f119973j = r11;
        this.f119974k = r12;
    }

    public final String a() {
        return this.f119966b;
    }

    public final ProfitType b() {
        return this.f119967c;
    }

    public final String c() {
        return this.f119965a;
    }

    public final String d() {
        return this.f119969f;
    }

    public final ProfitType e() {
        return this.f119970g;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f119965a, r52.f119965a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f119966b, r52.f119966b) == true) goto L15;
        return false;
    L15:
        if (this.f119967c == r52.f119967c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (this.f119968e == r52.f119968e) goto L24;
        return false;
    L24:
        if (p.g(this.f119969f, r52.f119969f) == true) goto L27;
        return false;
    L27:
        if (this.f119970g == r52.f119970g) goto L30;
        return false;
    L30:
        if (p.g(this.f119971h, r52.f119971h) == true) goto L33;
        return false;
    L33:
        if (this.f119972i == r52.f119972i) goto L36;
        return false;
    L36:
        if (p.g(this.f119973j, r52.f119973j) == true) goto L39;
        return false;
    L39:
        if (this.f119974k == r52.f119974k) goto L41;
        return false;
    L41:
        return true;
    }

    public final String f() {
        return this.f119971h;
    }

    public final ProfitType g() {
        return this.f119972i;
    }

    public final String h() {
        return this.f119973j;
    }

    public int hashCode() {
        return (((((((((((((((((((this.f119965a.hashCode() * 31) + this.f119966b.hashCode()) * 31) + this.f119967c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f119968e.hashCode()) * 31) + this.f119969f.hashCode()) * 31) + this.f119970g.hashCode()) * 31) + this.f119971h.hashCode()) * 31) + this.f119972i.hashCode()) * 31) + this.f119973j.hashCode()) * 31) + this.f119974k.hashCode();
    }

    public final ProfitType i() {
        return this.f119974k;
    }

    public final String j() {
        return this.d;
    }

    public final ProfitType k() {
        return this.f119968e;
    }

    public String toString() {
        return "RealizedUIState(date=" + this.f119965a + ", amount=" + this.f119966b + ", amountProfitType=" + this.f119967c + ", totalRealizedGain=" + this.d + ", totalRealizedGainType=" + this.f119968e + ", realizedGain=" + this.f119969f + ", realizedGainType=" + this.f119970g + ", realizedLoss=" + this.f119971h + ", realizedLossType=" + this.f119972i + ", totalDividendReceived=" + this.f119973j + ", totalDividendReceivedType=" + this.f119974k + ')';
    }

    public /* synthetic */ a(String r2, String r3, ProfitType r4, String r5, ProfitType r6, String r7, ProfitType r8, String r9, ProfitType r10, String r11, ProfitType r12, int r13, i r14) {
        if ((r13 & 1) == 0) goto L6;
        r2 = "0";
    L6:
        if ((r13 & 2) == 0) goto L9;
        r3 = "0";
    L9:
        if ((r13 & 4) == 0) goto L12;
        r4 = ProfitType.NEUTRAL;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r5 = "0";
    L15:
        if ((r13 & 16) == 0) goto L18;
        r6 = ProfitType.NEUTRAL;
    L18:
        if ((r13 & 32) == 0) goto L21;
        r7 = "0";
    L21:
        if ((r13 & 64) == 0) goto L24;
        r8 = ProfitType.NEUTRAL;
    L24:
        if ((r13 & 128) == 0) goto L27;
        r9 = "0";
    L27:
        if ((r13 & 256) == 0) goto L30;
        r10 = ProfitType.NEUTRAL;
    L30:
        if ((r13 & 512) == 0) goto L33;
        r11 = "0";
    L33:
        if ((r13 & 1024) == 0) goto L35;
        r12 = ProfitType.NEUTRAL;
    L35:
        ProfitType r132 = r12;
        String r122 = r11;
        ProfitType r112 = r10;
        String r102 = r9;
        ProfitType r92 = r8;
        String r82 = r7;
        ProfitType r72 = r6;
        String r62 = r5;
        ProfitType r52 = r4;
        String r42 = r3;
        this(r2, r42, r52, r62, r72, r82, r92, r102, r112, r122, r132);
    }
}
