package com.stockbit.usecase.cryptowithdrawal.contract.entity;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f157494a;

    /* renamed from: b, reason: collision with root package name */
    public final long f157495b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f157496c;

    public c(long r1, long r3, boolean r5) {
        this.f157494a = r1;
        this.f157495b = r3;
        this.f157496c = r5;
    }

    public final long a() {
        return this.f157495b;
    }

    public final long b() {
        return this.f157494a;
    }

    public final boolean c() {
        return this.f157496c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof c) == true) goto L8;
        return false;
    L8:
        c r82 = (c) r8;
        if (this.f157494a == r82.f157494a) goto L12;
        return false;
    L12:
        if (this.f157495b == r82.f157495b) goto L15;
        return false;
    L15:
        if (this.f157496c == r82.f157496c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f157494a) * 31) + Long.hashCode(this.f157495b)) * 31) + Boolean.hashCode(this.f157496c);
    }

    public String toString() {
        return "CryptoWithdrawalFeeEntity(fee=" + this.f157494a + ", amountReceive=" + this.f157495b + ", showTransferDurationInfo=" + this.f157496c + ")";
    }
}
