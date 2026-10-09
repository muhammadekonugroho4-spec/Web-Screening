package com.stockbit.usecase.cashsweep.model;

/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f155022a;

    public f(String r2) {
        kotlin.jvm.internal.p.l(r2, "webviewUrl");
        this.f155022a = r2;
    }

    public final String a() {
        return this.f155022a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof f) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f155022a, ((f) r4).f155022a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f155022a.hashCode();
    }

    public String toString() {
        return "CashSweepRedemptionUIState(webviewUrl=" + this.f155022a + ")";
    }
}
