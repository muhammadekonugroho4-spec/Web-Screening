package com.stockbit.domain.model.eipo;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f82128a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82129b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82130c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82131e;

    /* renamed from: f, reason: collision with root package name */
    public final String f82132f;

    public d(String r2, String r3, String r4, String r5, String r6, String r7) {
        p.l(r2, Constants.KEY_DATE);
        p.l(r3, "orderStatus");
        p.l(r4, FirebaseAnalytics.Param.PRICE);
        p.l(r5, "stageDisplay");
        p.l(r6, "stageProgress");
        p.l(r7, "stageProgressDisplay");
        this.f82128a = r2;
        this.f82129b = r3;
        this.f82130c = r4;
        this.d = r5;
        this.f82131e = r6;
        this.f82132f = r7;
    }

    public final String a() {
        return this.f82128a;
    }

    public final String b() {
        return this.f82129b;
    }

    public final String c() {
        return this.f82130c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f82131e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f82128a, r52.f82128a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82129b, r52.f82129b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82130c, r52.f82130c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f82131e, r52.f82131e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f82132f, r52.f82132f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final String f() {
        return this.f82132f;
    }

    public int hashCode() {
        return (((((((((this.f82128a.hashCode() * 31) + this.f82129b.hashCode()) * 31) + this.f82130c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82131e.hashCode()) * 31) + this.f82132f.hashCode();
    }

    public String toString() {
        return "EIpoCompanyStatusDetailEntity(date=" + this.f82128a + ", orderStatus=" + this.f82129b + ", price=" + this.f82130c + ", stageDisplay=" + this.d + ", stageProgress=" + this.f82131e + ", stageProgressDisplay=" + this.f82132f + ")";
    }
}
