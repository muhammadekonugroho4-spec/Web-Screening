package com.stockbit.domain.model.tradingperformance;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f86038a;

    /* renamed from: b, reason: collision with root package name */
    public final double f86039b;

    /* renamed from: c, reason: collision with root package name */
    public final a f86040c;

    public e(String r2, double r3, a r5) {
        p.l(r2, Constants.ScionAnalytics.PARAM_LABEL);
        p.l(r5, "profitLoss");
        this.f86038a = r2;
        this.f86039b = r3;
        this.f86040c = r5;
    }

    public final double a() {
        return this.f86039b;
    }

    public final String b() {
        return this.f86038a;
    }

    public final a c() {
        return this.f86040c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof e) == true) goto L8;
        return false;
    L8:
        e r82 = (e) r8;
        if (p.g(this.f86038a, r82.f86038a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f86039b, r82.f86039b) == 0) goto L15;
        return false;
    L15:
        if (p.g(this.f86040c, r82.f86040c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f86038a.hashCode() * 31) + Double.hashCode(this.f86039b)) * 31) + this.f86040c.hashCode();
    }

    public String toString() {
        return "PortfolioTotalEquityReturnEntity(label=" + this.f86038a + ", equity=" + this.f86039b + ", profitLoss=" + this.f86040c + ")";
    }

    public /* synthetic */ e(String r8, double r9, a r11, int r12, i r13) {
        if ((r12 & 1) == 0) goto L6;
        r8 = "";
    L6:
        if ((r12 & 2) == 0) goto L9;
        r9 = 0.0d;
    L9:
        if ((r12 & 4) == 0) goto L11;
        r11 = new a(0.0d, 0.0d, 3, null);
    L11:
        this(r8, r9, r11);
    }
}
