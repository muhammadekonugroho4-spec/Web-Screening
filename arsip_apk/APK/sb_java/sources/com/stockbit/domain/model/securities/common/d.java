package com.stockbit.domain.model.securities.common;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f85077a;

    /* renamed from: b, reason: collision with root package name */
    public final e f85078b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85079c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final String f85080e;

    /* renamed from: f, reason: collision with root package name */
    public final String f85081f;

    public d(int r2, e r3, String r4, int r5, String r6, String r7) {
        p.l(r3, "debtRatioRules");
        p.l(r4, "eventType");
        p.l(r6, "tradingClose");
        p.l(r7, "tradingOpen");
        this.f85077a = r2;
        this.f85078b = r3;
        this.f85079c = r4;
        this.d = r5;
        this.f85080e = r6;
        this.f85081f = r7;
    }

    public final int a() {
        return this.f85077a;
    }

    public final e b() {
        return this.f85078b;
    }

    public final String c() {
        return this.f85079c;
    }

    public final int d() {
        return this.d;
    }

    public final String e() {
        return this.f85080e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (this.f85077a == r52.f85077a) goto L12;
        return false;
    L12:
        if (p.g(this.f85078b, r52.f85078b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85079c, r52.f85079c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L21;
        return false;
    L21:
        if (p.g(this.f85080e, r52.f85080e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f85081f, r52.f85081f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f85081f;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f85077a) * 31) + this.f85078b.hashCode()) * 31) + this.f85079c.hashCode()) * 31) + Integer.hashCode(this.d)) * 31) + this.f85080e.hashCode()) * 31) + this.f85081f.hashCode();
    }

    public String toString() {
        return "DayTradeInfoEntity(countdownStart=" + this.f85077a + ", debtRatioRules=" + this.f85078b + ", eventType=" + this.f85079c + ", remainingTradingClose=" + this.d + ", tradingClose=" + this.f85080e + ", tradingOpen=" + this.f85081f + ")";
    }
}
