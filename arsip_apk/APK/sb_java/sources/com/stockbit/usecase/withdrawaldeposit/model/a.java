package com.stockbit.usecase.withdrawaldeposit.model;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f164759a;

    /* renamed from: b, reason: collision with root package name */
    public final double f164760b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f164761c;
    public final boolean d;

    public a(String r2, double r3, boolean r5, boolean r6) {
        p.l(r2, Constants.ScionAnalytics.PARAM_LABEL);
        this.f164759a = r2;
        this.f164760b = r3;
        this.f164761c = r5;
        this.d = r6;
    }

    public final String a() {
        return this.f164759a;
    }

    public final double b() {
        return this.f164760b;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.f164761c;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f164759a, r82.f164759a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f164760b, r82.f164760b) == 0) goto L15;
        return false;
    L15:
        if (this.f164761c == r82.f164761c) goto L18;
        return false;
    L18:
        if (this.d == r82.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f164759a.hashCode() * 31) + Double.hashCode(this.f164760b)) * 31) + Boolean.hashCode(this.f164761c)) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "DailyLimitUIData(label=" + this.f164759a + ", remaining=" + this.f164760b + ", isUsed=" + this.f164761c + ", isExceed=" + this.d + ")";
    }
}
