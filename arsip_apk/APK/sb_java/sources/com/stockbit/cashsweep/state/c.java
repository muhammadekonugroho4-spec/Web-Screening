package com.stockbit.cashsweep.state;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f52002a;

    /* renamed from: b, reason: collision with root package name */
    public final double f52003b;

    static {
    }

    public c(String r2, double r3) {
        p.l(r2, "balance");
        this.f52002a = r2;
        this.f52003b = r3;
    }

    public final String a() {
        return this.f52002a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof c) == true) goto L8;
        return false;
    L8:
        c r82 = (c) r8;
        if (p.g(this.f52002a, r82.f52002a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f52003b, r82.f52003b) == 0) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f52002a.hashCode() * 31) + Double.hashCode(this.f52003b);
    }

    public String toString() {
        return "CashSweepFundState(balance=" + this.f52002a + ", balanceRaw=" + this.f52003b + ')';
    }

    public /* synthetic */ c(String r1, double r2, int r4, i r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = "0";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r2 = 0.0d;
    L8:
        this(r1, r2);
    }
}
