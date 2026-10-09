package com.stockbit.feature.cryptohistory.contract;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f93570a;

    /* renamed from: b, reason: collision with root package name */
    public final String f93571b;

    public d(String r2, String r3) {
        p.l(r2, "orderId");
        p.l(r3, "baseAsset");
        this.f93570a = r2;
        this.f93571b = r3;
    }

    public final String a() {
        return this.f93571b;
    }

    public final String b() {
        return this.f93570a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f93570a, r52.f93570a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f93571b, r52.f93571b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f93570a.hashCode() * 31) + this.f93571b.hashCode();
    }

    public String toString() {
        return "CryptoHistoryRealizedDetailContractArgs(orderId=" + this.f93570a + ", baseAsset=" + this.f93571b + ')';
    }
}
