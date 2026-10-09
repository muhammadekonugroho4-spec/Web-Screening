package com.stockbit.domain.model.entity;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public Integer f82792a;

    /* renamed from: b, reason: collision with root package name */
    public String f82793b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f82794c;

    public o(Integer r1, String r2, Integer r3) {
        this.f82792a = r1;
        this.f82793b = r2;
        this.f82794c = r3;
    }

    public final Integer a() {
        return this.f82792a;
    }

    public final String b() {
        return this.f82793b;
    }

    public final Integer c() {
        return this.f82794c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof o) == true) goto L8;
        return false;
    L8:
        o r52 = (o) r5;
        if (kotlin.jvm.internal.p.g(this.f82792a, r52.f82792a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82793b, r52.f82793b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f82794c, r52.f82794c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        Integer r02 = this.f82792a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        String r2 = this.f82793b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Integer r23 = this.f82794c;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "ReferralInfo(friends=" + this.f82792a + ", referralCode=" + this.f82793b + ", unredeemReferral=" + this.f82794c + ')';
    }
}
