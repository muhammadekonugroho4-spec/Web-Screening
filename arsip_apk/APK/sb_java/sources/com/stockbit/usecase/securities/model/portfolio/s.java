package com.stockbit.usecase.securities.model.portfolio;

/* loaded from: classes2.dex */
public final class s implements J {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f161823a;

    /* renamed from: b, reason: collision with root package name */
    public final long f161824b;

    /* renamed from: c, reason: collision with root package name */
    public final long f161825c;
    public final String d;

    public s(boolean r2, long r3, long r5, String r7) {
        kotlin.jvm.internal.p.l(r7, "tradingCloseTime");
        this.f161823a = r2;
        this.f161824b = r3;
        this.f161825c = r5;
        this.d = r7;
    }

    public static /* synthetic */ s x(s r02, boolean r1, long r2, long r4, String r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r02.f161823a;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r02.f161824b;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = r02.f161825c;
    L12:
        if ((r7 & 8) == 0) goto L14;
        r6 = r02.d;
    L14:
        String r82 = r6;
        long r62 = r4;
        boolean r3 = r1;
        return r02.w(r3, r2, r62, r82);
    }

    public final boolean A() {
        return this.f161823a;
    }

    public final String B() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof s) == true) goto L8;
        return false;
    L8:
        s r82 = (s) r8;
        if (this.f161823a == r82.f161823a) goto L12;
        return false;
    L12:
        if (this.f161824b == r82.f161824b) goto L15;
        return false;
    L15:
        if (this.f161825c == r82.f161825c) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r82.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f161823a) * 31) + Long.hashCode(this.f161824b)) * 31) + Long.hashCode(this.f161825c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "PortfolioDayTradeBannerUIState(shouldShowTimer=" + this.f161823a + ", countDownToStart=" + this.f161824b + ", countDownToClose=" + this.f161825c + ", tradingCloseTime=" + this.d + ")";
    }

    public final s w(boolean r9, long r10, long r12, String r14) {
        kotlin.jvm.internal.p.l(r14, "tradingCloseTime");
        return new s(r9, r10, r12, r14);
    }

    public final long y() {
        return this.f161825c;
    }

    public final long z() {
        return this.f161824b;
    }
}
