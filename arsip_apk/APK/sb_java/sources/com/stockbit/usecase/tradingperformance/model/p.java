package com.stockbit.usecase.tradingperformance.model;

import com.clevertap.android.sdk.Constants;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f163533a;

    /* renamed from: b, reason: collision with root package name */
    public final String f163534b;

    /* renamed from: c, reason: collision with root package name */
    public final Pair f163535c;

    public p(String r2, String r3, Pair r4) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_TITLE);
        kotlin.jvm.internal.p.l(r3, "value");
        this.f163533a = r2;
        this.f163534b = r3;
        this.f163535c = r4;
    }

    public final Pair a() {
        return this.f163535c;
    }

    public final String b() {
        return this.f163533a;
    }

    public final String c() {
        return this.f163534b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof p) == true) goto L8;
        return false;
    L8:
        p r52 = (p) r5;
        if (kotlin.jvm.internal.p.g(this.f163533a, r52.f163533a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f163534b, r52.f163534b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f163535c, r52.f163535c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.f163533a.hashCode() * 31) + this.f163534b.hashCode()) * 31;
        Pair r1 = this.f163535c;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "TradePerformancePeriod(title=" + this.f163533a + ", value=" + this.f163534b + ", customPeriod=" + this.f163535c + ")";
    }
}
