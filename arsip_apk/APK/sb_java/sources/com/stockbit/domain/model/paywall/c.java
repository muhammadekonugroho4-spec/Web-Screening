package com.stockbit.domain.model.paywall;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f84626a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84627b;

    public c(String r2, boolean r3) {
        p.l(r2, "feature");
        this.f84626a = r2;
        this.f84627b = r3;
    }

    public final String a() {
        return this.f84626a;
    }

    public final boolean b() {
        return this.f84627b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f84626a, r52.f84626a) == true) goto L12;
        return false;
    L12:
        if (this.f84627b == r52.f84627b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f84626a.hashCode() * 31) + Boolean.hashCode(this.f84627b);
    }

    public String toString() {
        return "PaywallFeaturesEntity(feature=" + this.f84626a + ", isEligible=" + this.f84627b + ")";
    }
}
