package com.stockbit.cashsweep.state;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f52007a;

    /* renamed from: b, reason: collision with root package name */
    public final double f52008b;

    /* renamed from: c, reason: collision with root package name */
    public final double f52009c;

    static {
    }

    public f(String r2, double r3, double r5) {
        p.l(r2, "balance");
        this.f52007a = r2;
        this.f52008b = r3;
        this.f52009c = r5;
    }

    public final String a() {
        return this.f52007a;
    }

    public final double b() {
        return this.f52009c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof f) == true) goto L8;
        return false;
    L8:
        f r82 = (f) r8;
        if (p.g(this.f52007a, r82.f52007a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f52008b, r82.f52008b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f52009c, r82.f52009c) == 0) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f52007a.hashCode() * 31) + Double.hashCode(this.f52008b)) * 31) + Double.hashCode(this.f52009c);
    }

    public String toString() {
        return "ReservedCashState(balance=" + this.f52007a + ", balanceRaw=" + this.f52008b + ", minAmount=" + this.f52009c + ')';
    }

    public /* synthetic */ f(String r1, double r2, double r4, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = 0.0d;
    L9:
        if ((r6 & 4) == 0) goto L11;
        r4 = 100000.0d;
    L11:
        double r62 = r4;
        String r3 = r1;
        this(r3, r2, r62);
    }
}
