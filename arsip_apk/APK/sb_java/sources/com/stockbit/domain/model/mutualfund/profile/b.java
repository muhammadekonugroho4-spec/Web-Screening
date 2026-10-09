package com.stockbit.domain.model.mutualfund.profile;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f84410a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84411b;

    public b(String r2, String r3) {
        p.l(r2, Constants.ScionAnalytics.PARAM_LABEL);
        p.l(r3, "value");
        this.f84410a = r2;
        this.f84411b = r3;
    }

    public final String a() {
        return this.f84410a;
    }

    public final String b() {
        return this.f84411b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f84410a, r52.f84410a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84411b, r52.f84411b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f84410a.hashCode() * 31) + this.f84411b.hashCode();
    }

    public String toString() {
        return "MutualFundFeeEntity(label=" + this.f84410a + ", value=" + this.f84411b + ")";
    }
}
