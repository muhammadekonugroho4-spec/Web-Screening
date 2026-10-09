package com.stockbit.domains.usecase.eipo.model;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f88235a;

    /* renamed from: b, reason: collision with root package name */
    public final String f88236b;

    /* renamed from: c, reason: collision with root package name */
    public final String f88237c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f88238e;

    /* renamed from: f, reason: collision with root package name */
    public final String f88239f;

    public c(String r2, String r3, String r4, String r5, String r6, String r7) {
        p.l(r2, Constants.KEY_DATE);
        p.l(r3, "orderStatus");
        p.l(r4, FirebaseAnalytics.Param.PRICE);
        p.l(r5, "stageDisplay");
        p.l(r6, "stageProgress");
        p.l(r7, "stageProgressDisplay");
        this.f88235a = r2;
        this.f88236b = r3;
        this.f88237c = r4;
        this.d = r5;
        this.f88238e = r6;
        this.f88239f = r7;
    }

    public final String a() {
        return this.f88235a;
    }

    public final String b() {
        return this.f88237c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f88238e;
    }

    public final String e() {
        return this.f88239f;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f88235a, r52.f88235a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f88236b, r52.f88236b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f88237c, r52.f88237c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f88238e, r52.f88238e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f88239f, r52.f88239f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        return (((((((((this.f88235a.hashCode() * 31) + this.f88236b.hashCode()) * 31) + this.f88237c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f88238e.hashCode()) * 31) + this.f88239f.hashCode();
    }

    public String toString() {
        return "EIpoCompanyStatusUIState(date=" + this.f88235a + ", orderStatus=" + this.f88236b + ", price=" + this.f88237c + ", stageDisplay=" + this.d + ", stageProgress=" + this.f88238e + ", stageProgressDisplay=" + this.f88239f + ")";
    }
}
