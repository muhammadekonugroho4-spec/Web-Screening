package com.stockbit.usecase.social.subscription.model;

import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f162989a;

    /* renamed from: b, reason: collision with root package name */
    public final String f162990b;

    public e(String r2, String r3) {
        p.l(r2, "purchaseType");
        p.l(r3, "expirationDate");
        this.f162989a = r2;
        this.f162990b = r3;
    }

    public final String a() {
        return this.f162990b;
    }

    public final String b() {
        return this.f162989a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f162989a, r52.f162989a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f162990b, r52.f162990b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f162989a.hashCode() * 31) + this.f162990b.hashCode();
    }

    public String toString() {
        return "SocialSubscriptionVerifyUIState(purchaseType=" + this.f162989a + ", expirationDate=" + this.f162990b + ')';
    }
}
