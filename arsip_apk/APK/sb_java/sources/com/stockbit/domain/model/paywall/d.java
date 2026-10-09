package com.stockbit.domain.model.paywall;

import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f84628a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84629b;

    public d(int r2, String r3) {
        p.l(r3, "subscription");
        this.f84628a = r2;
        this.f84629b = r3;
    }

    public final int a() {
        return this.f84628a;
    }

    public final String b() {
        return this.f84629b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (this.f84628a == r52.f84628a) goto L12;
        return false;
    L12:
        if (p.g(this.f84629b, r52.f84629b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f84628a) * 31) + this.f84629b.hashCode();
    }

    public String toString() {
        return "PaywallLastSubscriptionEntity(id=" + this.f84628a + ", subscription=" + this.f84629b + ")";
    }
}
