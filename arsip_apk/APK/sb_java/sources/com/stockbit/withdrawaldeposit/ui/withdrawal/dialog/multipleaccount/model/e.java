package com.stockbit.withdrawaldeposit.ui.withdrawal.dialog.multipleaccount.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f173100a;

    /* renamed from: b, reason: collision with root package name */
    public final double f173101b;

    /* renamed from: c, reason: collision with root package name */
    public final double f173102c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final double f173103e;

    /* renamed from: f, reason: collision with root package name */
    public final double f173104f;

    /* renamed from: g, reason: collision with root package name */
    public final d f173105g;

    static {
    }

    public e(String r2, double r3, double r5, boolean r7, double r8, double r10, d r12) {
        p.l(r2, "transferMethod");
        p.l(r12, "withdrawalInfoCashSweep");
        this.f173100a = r2;
        this.f173101b = r3;
        this.f173102c = r5;
        this.d = r7;
        this.f173103e = r8;
        this.f173104f = r10;
        this.f173105g = r12;
    }

    public final double a() {
        return this.f173103e;
    }

    public final double b() {
        return this.f173102c;
    }

    public final String c() {
        return this.f173100a;
    }

    public final double d() {
        return this.f173104f;
    }

    public final double e() {
        return this.f173101b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof e) == true) goto L8;
        return false;
    L8:
        e r82 = (e) r8;
        if (p.g(this.f173100a, r82.f173100a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f173101b, r82.f173101b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f173102c, r82.f173102c) == 0) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L21;
        return false;
    L21:
        if (Double.compare(this.f173103e, r82.f173103e) == 0) goto L24;
        return false;
    L24:
        if (Double.compare(this.f173104f, r82.f173104f) == 0) goto L27;
        return false;
    L27:
        if (p.g(this.f173105g, r82.f173105g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final d f() {
        return this.f173105g;
    }

    public final boolean g() {
        return this.d;
    }

    public int hashCode() {
        return (((((((((((this.f173100a.hashCode() * 31) + Double.hashCode(this.f173101b)) * 31) + Double.hashCode(this.f173102c)) * 31) + Boolean.hashCode(this.d)) * 31) + Double.hashCode(this.f173103e)) * 31) + Double.hashCode(this.f173104f)) * 31) + this.f173105g.hashCode();
    }

    public String toString() {
        return "WithdrawalInfoUIState(transferMethod=" + this.f173100a + ", withdrawalAmount=" + this.f173101b + ", transferFee=" + this.f173102c + ", isTransferFeeFree=" + this.d + ", receivedAmount=" + this.f173103e + ", unpaidObligation=" + this.f173104f + ", withdrawalInfoCashSweep=" + this.f173105g + ')';
    }
}
