package com.stockbit.usecase.cashsweep.model;

/* loaded from: classes11.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f155019a;

    public d(String r2) {
        kotlin.jvm.internal.p.l(r2, "webviewUrl");
        this.f155019a = r2;
    }

    public final String a() {
        return this.f155019a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof d) == true) goto L9;
        return false;
    L9:
        if (kotlin.jvm.internal.p.g(this.f155019a, ((d) r4).f155019a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f155019a.hashCode();
    }

    public String toString() {
        return "CashSweepActivationUIState(webviewUrl=" + this.f155019a + ")";
    }
}
