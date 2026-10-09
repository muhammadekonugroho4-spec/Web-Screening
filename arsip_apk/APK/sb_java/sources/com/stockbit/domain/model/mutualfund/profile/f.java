package com.stockbit.domain.model.mutualfund.profile;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f84437a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84438b;

    public f(String r2, String r3) {
        p.l(r2, "value");
        p.l(r3, "infoUrl");
        this.f84437a = r2;
        this.f84438b = r3;
    }

    public final String a() {
        return this.f84438b;
    }

    public final String b() {
        return this.f84437a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f84437a, r52.f84437a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84438b, r52.f84438b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f84437a.hashCode() * 31) + this.f84438b.hashCode();
    }

    public String toString() {
        return "MutualFundSummaryEntity(value=" + this.f84437a + ", infoUrl=" + this.f84438b + ")";
    }
}
