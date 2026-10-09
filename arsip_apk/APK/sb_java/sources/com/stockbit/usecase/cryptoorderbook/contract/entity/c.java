package com.stockbit.usecase.cryptoorderbook.contract.entity;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final a f157302a;

    /* renamed from: b, reason: collision with root package name */
    public final a f157303b;

    /* renamed from: c, reason: collision with root package name */
    public final a f157304c;

    public c(a r2, a r3, a r4) {
        p.l(r2, FirebaseAnalytics.Param.PRICE);
        p.l(r3, "volume");
        this.f157302a = r2;
        this.f157303b = r3;
        this.f157304c = r4;
    }

    public final a a() {
        return this.f157302a;
    }

    public final a b() {
        return this.f157303b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f157302a, r52.f157302a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157303b, r52.f157303b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f157304c, r52.f157304c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = ((this.f157302a.hashCode() * 31) + this.f157303b.hashCode()) * 31;
        a r1 = this.f157304c;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "CryptoOrderBookLevelEntity(price=" + this.f157302a + ", volume=" + this.f157303b + ", frequency=" + this.f157304c + ")";
    }
}
