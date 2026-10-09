package com.stockbit.withdrawaldeposit.ui.withdrawal.dialog.multipleaccount.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f173094a;

    /* renamed from: b, reason: collision with root package name */
    public final double f173095b;

    static {
    }

    public c(String r2, double r3) {
        p.l(r2, "accountName");
        this.f173094a = r2;
        this.f173095b = r3;
    }

    public final String a() {
        return this.f173094a;
    }

    public final double b() {
        return this.f173095b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof c) == true) goto L8;
        return false;
    L8:
        c r82 = (c) r8;
        if (p.g(this.f173094a, r82.f173094a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f173095b, r82.f173095b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f173094a.hashCode() * 31) + Double.hashCode(this.f173095b);
    }

    public String toString() {
        return "LeverageBannerUiState(accountName=" + this.f173094a + ", obligationAmount=" + this.f173095b + ')';
    }
}
