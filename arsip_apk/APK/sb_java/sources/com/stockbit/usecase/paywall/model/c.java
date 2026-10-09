package com.stockbit.usecase.paywall.model;

import com.stockbit.usecase.paywall.model.type.PaywallSubscriptionType;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f158964a;

    /* renamed from: b, reason: collision with root package name */
    public final PaywallSubscriptionType f158965b;

    public c(int r2, PaywallSubscriptionType r3) {
        p.l(r3, "subscription");
        this.f158964a = r2;
        this.f158965b = r3;
    }

    public final int a() {
        return this.f158964a;
    }

    public final PaywallSubscriptionType b() {
        return this.f158965b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (this.f158964a == r52.f158964a) goto L12;
        return false;
    L12:
        if (this.f158965b == r52.f158965b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f158964a) * 31) + this.f158965b.hashCode();
    }

    public String toString() {
        return "PaywallLastSubscriptionUIState(id=" + this.f158964a + ", subscription=" + this.f158965b + ")";
    }
}
