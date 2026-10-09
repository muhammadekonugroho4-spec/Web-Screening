package com.stockbit.domain.model.valueobject;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public double f86922a;

    /* renamed from: b, reason: collision with root package name */
    public String f86923b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86924c;

    public q(double r1, String r3, String r4) {
        this.f86922a = r1;
        this.f86923b = r3;
        this.f86924c = r4;
    }

    public final double a() {
        return this.f86922a;
    }

    public final String b() {
        return this.f86923b;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof q) == true) goto L8;
        return false;
    L8:
        q r82 = (q) r8;
        if (Double.compare(this.f86922a, r82.f86922a) == 0) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f86923b, r82.f86923b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f86924c, r82.f86924c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = Double.hashCode(this.f86922a) * 31;
        String r1 = this.f86923b;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        String r13 = this.f86924c;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "TippingDetailClaim(claimAmount=" + this.f86922a + ", status=" + this.f86923b + ", date=" + this.f86924c + ')';
    }
}
