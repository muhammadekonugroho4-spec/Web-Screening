package com.stockbit.cryptodetail.ui.detail.state;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f79699a;

    /* renamed from: b, reason: collision with root package name */
    public final String f79700b;

    static {
    }

    public a(int r1, String r2) {
        this.f79699a = r1;
        this.f79700b = r2;
    }

    public final String a() {
        return this.f79700b;
    }

    public final int b() {
        return this.f79699a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f79699a == r52.f79699a) goto L12;
        return false;
    L12:
        if (p.g(this.f79700b, r52.f79700b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = Integer.hashCode(this.f79699a) * 31;
        String r1 = this.f79700b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "CryptoDetailChartErrorUIData(errorMessageRes=" + this.f79699a + ", dynamicError=" + this.f79700b + ')';
    }
}
