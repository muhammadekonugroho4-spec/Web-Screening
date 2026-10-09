package com.facebook.appevents.iap;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Currency;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f35930a;

    /* renamed from: b, reason: collision with root package name */
    public final double f35931b;

    /* renamed from: c, reason: collision with root package name */
    public final Currency f35932c;

    public a(String r2, double r3, Currency r5) {
        kotlin.jvm.internal.p.l(r2, "eventName");
        kotlin.jvm.internal.p.l(r5, FirebaseAnalytics.Param.CURRENCY);
        this.f35930a = r2;
        this.f35931b = r3;
        this.f35932c = r5;
    }

    public final double a() {
        return this.f35931b;
    }

    public final Currency b() {
        return this.f35932c;
    }

    public final String c() {
        return this.f35930a;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (kotlin.jvm.internal.p.g(this.f35930a, r82.f35930a) == true) goto L12;
        return false;
    L12:
        if (Double.compare(this.f35931b, r82.f35931b) == 0) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f35932c, r82.f35932c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f35930a.hashCode() * 31) + Double.hashCode(this.f35931b)) * 31) + this.f35932c.hashCode();
    }

    public String toString() {
        return "InAppPurchase(eventName=" + this.f35930a + ", amount=" + this.f35931b + ", currency=" + this.f35932c + ')';
    }
}
