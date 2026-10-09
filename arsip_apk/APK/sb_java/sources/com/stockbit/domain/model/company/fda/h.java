package com.stockbit.domain.model.company.fda;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f81526a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81527b;

    public h(String r2, String r3) {
        p.l(r2, Constants.ScionAnalytics.PARAM_LABEL);
        p.l(r3, "value");
        this.f81526a = r2;
        this.f81527b = r3;
    }

    public final String a() {
        return this.f81526a;
    }

    public final String b() {
        return this.f81527b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (p.g(this.f81526a, r52.f81526a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81527b, r52.f81527b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f81526a.hashCode() * 31) + this.f81527b.hashCode();
    }

    public String toString() {
        return "ForeignDomesticPeriodEntity(label=" + this.f81526a + ", value=" + this.f81527b + ")";
    }
}
