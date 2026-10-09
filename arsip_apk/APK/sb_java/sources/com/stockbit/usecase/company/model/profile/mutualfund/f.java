package com.stockbit.usecase.company.model.profile.mutualfund;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f156549a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156550b;

    public f(String r2, String r3) {
        p.l(r2, "value");
        p.l(r3, "infoUrl");
        this.f156549a = r2;
        this.f156550b = r3;
    }

    public final String a() {
        return this.f156549a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f156549a, r52.f156549a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156550b, r52.f156550b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f156549a.hashCode() * 31) + this.f156550b.hashCode();
    }

    public String toString() {
        return "MutualFundSummaryUIState(value=" + this.f156549a + ", infoUrl=" + this.f156550b + ")";
    }
}
