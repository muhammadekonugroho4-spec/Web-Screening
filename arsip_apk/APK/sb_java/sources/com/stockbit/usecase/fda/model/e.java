package com.stockbit.usecase.fda.model;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f157821a;

    /* renamed from: b, reason: collision with root package name */
    public final String f157822b;

    public e(String r2, String r3) {
        p.l(r2, Constants.ScionAnalytics.PARAM_LABEL);
        p.l(r3, "value");
        this.f157821a = r2;
        this.f157822b = r3;
    }

    public final String a() {
        return this.f157821a;
    }

    public final String b() {
        return this.f157822b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f157821a, r52.f157821a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157822b, r52.f157822b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f157821a.hashCode() * 31) + this.f157822b.hashCode();
    }

    public String toString() {
        return "FDAPeriodUIState(label=" + this.f157821a + ", value=" + this.f157822b + ")";
    }
}
