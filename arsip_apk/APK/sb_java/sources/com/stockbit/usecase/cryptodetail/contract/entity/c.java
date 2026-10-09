package com.stockbit.usecase.cryptodetail.contract.entity;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f157073a;

    /* renamed from: b, reason: collision with root package name */
    public final List f157074b;

    public c(String r2, List r3) {
        p.l(r2, "symbol");
        p.l(r3, "prices");
        this.f157073a = r2;
        this.f157074b = r3;
    }

    public final List a() {
        return this.f157074b;
    }

    public final String b() {
        return this.f157073a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f157073a, r52.f157073a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157074b, r52.f157074b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f157073a.hashCode() * 31) + this.f157074b.hashCode();
    }

    public String toString() {
        return "CryptoChartRelatedSymbolEntity(symbol=" + this.f157073a + ", prices=" + this.f157074b + ")";
    }
}
