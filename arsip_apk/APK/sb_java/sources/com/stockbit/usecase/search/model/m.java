package com.stockbit.usecase.search.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.stockbit.usecase.search.type.MarketProfitLossUIType;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f160030a;

    /* renamed from: b, reason: collision with root package name */
    public final String f160031b;

    /* renamed from: c, reason: collision with root package name */
    public final double f160032c;
    public final MarketProfitLossUIType d;

    public m(String r2, String r3, double r4, MarketProfitLossUIType r6) {
        kotlin.jvm.internal.p.l(r2, FirebaseAnalytics.Param.PRICE);
        kotlin.jvm.internal.p.l(r3, "changeAndPercentage");
        kotlin.jvm.internal.p.l(r6, "marketProfitLossType");
        this.f160030a = r2;
        this.f160031b = r3;
        this.f160032c = r4;
        this.d = r6;
    }

    public final String a() {
        return this.f160031b;
    }

    public final MarketProfitLossUIType b() {
        return this.d;
    }

    public final String c() {
        return this.f160030a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof m) == true) goto L8;
        return false;
    L8:
        m r82 = (m) r8;
        if (kotlin.jvm.internal.p.g(this.f160030a, r82.f160030a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f160031b, r82.f160031b) == true) goto L15;
        return false;
    L15:
        if (Double.compare(this.f160032c, r82.f160032c) == 0) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f160030a.hashCode() * 31) + this.f160031b.hashCode()) * 31) + Double.hashCode(this.f160032c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "MarketIHSGPriceUIState(price=" + this.f160030a + ", changeAndPercentage=" + this.f160031b + ", changeDouble=" + this.f160032c + ", marketProfitLossType=" + this.d + ")";
    }

    public /* synthetic */ m(String r2, String r3, double r4, MarketProfitLossUIType r6, int r7, kotlin.jvm.internal.i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = "-";
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = "-";
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = 0.0d;
    L12:
        if ((r7 & 8) == 0) goto L14;
        r6 = MarketProfitLossUIType.NEUTRAL;
    L14:
        double r5 = r4;
        String r42 = r3;
        String r32 = r2;
        this(r32, r42, r5, r6);
    }
}
