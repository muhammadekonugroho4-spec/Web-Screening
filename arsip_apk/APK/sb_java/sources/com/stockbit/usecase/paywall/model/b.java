package com.stockbit.usecase.paywall.model;

import com.stockbit.usecase.paywall.model.type.PaywallFeatureType;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final PaywallFeatureType f158962a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f158963b;

    public b(PaywallFeatureType r2, boolean r3) {
        p.l(r2, "feature");
        this.f158962a = r2;
        this.f158963b = r3;
    }

    public final PaywallFeatureType a() {
        return this.f158962a;
    }

    public final boolean b() {
        return this.f158963b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (this.f158962a == r52.f158962a) goto L12;
        return false;
    L12:
        if (this.f158963b == r52.f158963b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f158962a.hashCode() * 31) + Boolean.hashCode(this.f158963b);
    }

    public String toString() {
        return "PaywallFeaturesUIState(feature=" + this.f158962a + ", isEligible=" + this.f158963b + ")";
    }
}
