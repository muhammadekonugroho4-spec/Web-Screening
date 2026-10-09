package com.stockbit.usecase.cryptodetail.contract.entity;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final k f157075a;

    /* renamed from: b, reason: collision with root package name */
    public final k f157076b;

    /* renamed from: c, reason: collision with root package name */
    public final k f157077c;
    public final k d;

    /* renamed from: e, reason: collision with root package name */
    public final k f157078e;

    /* renamed from: f, reason: collision with root package name */
    public final k f157079f;

    public d(k r1, k r2, k r3, k r4, k r5, k r6) {
        this.f157075a = r1;
        this.f157076b = r2;
        this.f157077c = r3;
        this.d = r4;
        this.f157078e = r5;
        this.f157079f = r6;
    }

    public final k a() {
        return this.f157077c;
    }

    public final k b() {
        return this.d;
    }

    public final k c() {
        return this.f157078e;
    }

    public final k d() {
        return this.f157075a;
    }

    public final k e() {
        return this.f157079f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f157075a, r52.f157075a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157076b, r52.f157076b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f157077c, r52.f157077c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f157078e, r52.f157078e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f157079f, r52.f157079f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final k f() {
        return this.f157076b;
    }

    public int hashCode() {
        k r02 = this.f157075a;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        k r2 = this.f157076b;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        k r23 = this.f157077c;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        k r25 = this.d;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        k r27 = this.f157078e;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        k r29 = this.f157079f;
        if (r29 == null) goto L27;
        r1 = r29.hashCode();
    L27:
        return r08 + r1;
    L21:
        r28 = r27.hashCode();
        goto L22
    L17:
        r26 = r25.hashCode();
        goto L18
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "CryptoFinItemEntity(marketCap=" + this.f157075a + ", tradingVolume24h=" + this.f157076b + ", allTimeHigh=" + this.f157077c + ", allTimeLow=" + this.d + ", circulatingSupply=" + this.f157078e + ", totalSupply=" + this.f157079f + ")";
    }
}
