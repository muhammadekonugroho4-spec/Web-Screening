package com.stockbit.feature.cryptowithdrawal.model;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f96244a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f96245b;

    /* renamed from: c, reason: collision with root package name */
    public final double f96246c;
    public final String d;

    static {
    }

    public a(boolean r2, boolean r3, double r4, String r6) {
        p.l(r6, "formattedWithdrawable");
        this.f96244a = r2;
        this.f96245b = r3;
        this.f96246c = r4;
        this.d = r6;
    }

    public static /* synthetic */ a b(a r02, boolean r1, boolean r2, double r3, String r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r02.f96244a;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r02.f96245b;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r02.f96246c;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = r02.d;
    L14:
        String r72 = r5;
        double r52 = r3;
        return r02.a(r1, r2, r52, r72);
    }

    public final a a(boolean r8, boolean r9, double r10, String r12) {
        p.l(r12, "formattedWithdrawable");
        return new a(r8, r9, r10, r12);
    }

    public final String c() {
        return this.d;
    }

    public final double d() {
        return this.f96246c;
    }

    public final boolean e() {
        return this.f96245b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (this.f96244a == r82.f96244a) goto L12;
        return false;
    L12:
        if (this.f96245b == r82.f96245b) goto L15;
        return false;
    L15:
        if (Double.compare(this.f96246c, r82.f96246c) == 0) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public final boolean f() {
        return this.f96244a;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f96244a) * 31) + Boolean.hashCode(this.f96245b)) * 31) + Double.hashCode(this.f96246c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "CryptoWithdrawalBalanceUiState(isLoading=" + this.f96244a + ", isError=" + this.f96245b + ", withdrawable=" + this.f96246c + ", formattedWithdrawable=" + this.d + ')';
    }

    public /* synthetic */ a(boolean r2, boolean r3, double r4, String r6, int r7, i r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = false;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = false;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = 0.0d;
    L12:
        if ((r7 & 8) == 0) goto L14;
        r6 = "";
    L14:
        double r5 = r4;
        boolean r42 = r3;
        this(r2, r42, r5, r6);
    }
}
