package com.stockbit.usecase.company.model.profile.mutualfund;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f156526a;

    /* renamed from: b, reason: collision with root package name */
    public final String f156527b;

    public b(String r2, String r3) {
        p.l(r2, Constants.ScionAnalytics.PARAM_LABEL);
        p.l(r3, "value");
        this.f156526a = r2;
        this.f156527b = r3;
    }

    public final String a() {
        return this.f156526a;
    }

    public final String b() {
        return this.f156527b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f156526a, r52.f156526a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f156527b, r52.f156527b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f156526a.hashCode() * 31) + this.f156527b.hashCode();
    }

    public String toString() {
        return "MutualFundFeeUIState(label=" + this.f156526a + ", value=" + this.f156527b + ")";
    }
}
