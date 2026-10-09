package com.stockbit.withdrawaldeposit.ui.withdrawal.dialog.multipleaccount.model;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f173096a;

    /* renamed from: b, reason: collision with root package name */
    public final double f173097b;

    /* renamed from: c, reason: collision with root package name */
    public final double f173098c;
    public final double d;

    /* renamed from: e, reason: collision with root package name */
    public final double f173099e;

    static {
    }

    public d(boolean r1, double r2, double r4, double r6, double r8) {
        this.f173096a = r1;
        this.f173097b = r2;
        this.f173098c = r4;
        this.d = r6;
        this.f173099e = r8;
    }

    public final double a() {
        return this.d;
    }

    public final double b() {
        return this.f173098c;
    }

    public final double c() {
        return this.f173099e;
    }

    public final double d() {
        return this.f173097b;
    }

    public final boolean e() {
        return this.f173096a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof d) == true) goto L8;
        return false;
    L8:
        d r82 = (d) r8;
        if (this.f173096a == r82.f173096a) goto L12;
        return false;
    L12:
        if (Double.compare(this.f173097b, r82.f173097b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f173098c, r82.f173098c) == 0) goto L18;
        return false;
    L18:
        if (Double.compare(this.d, r82.d) == 0) goto L21;
        return false;
    L21:
        if (Double.compare(this.f173099e, r82.f173099e) == 0) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f173096a) * 31) + Double.hashCode(this.f173097b)) * 31) + Double.hashCode(this.f173098c)) * 31) + Double.hashCode(this.d)) * 31) + Double.hashCode(this.f173099e);
    }

    public String toString() {
        return "WithdrawalInfoCashSweepUIState(isCashSweepVisible=" + this.f173096a + ", cashSweepTransferFee=" + this.f173097b + ", cashSweepInstantAmount=" + this.f173098c + ", cashSweep2DaysAmount=" + this.d + ", cashSweepTotalAmount=" + this.f173099e + ')';
    }
}
