package com.stockbit.domain.model.entity;

import java.util.List;

/* loaded from: classes8.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final List f82800a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f82801b;

    /* renamed from: c, reason: collision with root package name */
    public String f82802c;

    public r(List r1, Integer r2, String r3) {
        this.f82800a = r1;
        this.f82801b = r2;
        this.f82802c = r3;
    }

    public final List a() {
        return this.f82800a;
    }

    public final String b() {
        return this.f82802c;
    }

    public final Integer c() {
        return this.f82801b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof r) == true) goto L8;
        return false;
    L8:
        r r52 = (r) r5;
        if (kotlin.jvm.internal.p.g(this.f82800a, r52.f82800a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82801b, r52.f82801b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f82802c, r52.f82802c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        List r02 = this.f82800a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Integer r2 = this.f82801b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.f82802c;
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
        return "Reward(rewardStocks=" + this.f82800a + ", totalLot=" + this.f82801b + ", termsId=" + this.f82802c + ')';
    }
}
