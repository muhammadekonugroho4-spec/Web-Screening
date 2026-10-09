package com.stockbit.domain.model.withdrawaldeposit;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f87369a;

    /* renamed from: b, reason: collision with root package name */
    public final double f87370b;

    /* renamed from: c, reason: collision with root package name */
    public final double f87371c;

    public a(String r2, double r3, double r5) {
        p.l(r2, Constants.ScionAnalytics.PARAM_LABEL);
        this.f87369a = r2;
        this.f87370b = r3;
        this.f87371c = r5;
    }

    public final String a() {
        return this.f87369a;
    }

    public final double b() {
        return this.f87370b;
    }

    public final double c() {
        return this.f87371c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f87369a, r82.f87369a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f87370b, r82.f87370b) == 0) goto L15;
        return false;
    L15:
        if (Double.compare(this.f87371c, r82.f87371c) == 0) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f87369a.hashCode() * 31) + Double.hashCode(this.f87370b)) * 31) + Double.hashCode(this.f87371c);
    }

    public String toString() {
        return "TransferMethodDailyLimitEntity(label=" + this.f87369a + ", max=" + this.f87370b + ", remaining=" + this.f87371c + ")";
    }
}
