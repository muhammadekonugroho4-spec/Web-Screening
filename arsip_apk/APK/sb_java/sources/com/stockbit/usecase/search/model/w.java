package com.stockbit.usecase.search.model;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f160077a;

    /* renamed from: b, reason: collision with root package name */
    public final String f160078b;

    /* renamed from: c, reason: collision with root package name */
    public final String f160079c;
    public final String d;

    public w(String r2, String r3, String r4, String r5) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r4, "parent");
        kotlin.jvm.internal.p.l(r5, "alias");
        this.f160077a = r2;
        this.f160078b = r3;
        this.f160079c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f160077a;
    }

    public final String c() {
        return this.f160078b;
    }

    public final String d() {
        return this.f160079c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof w) == true) goto L8;
        return false;
    L8:
        w r52 = (w) r5;
        if (kotlin.jvm.internal.p.g(this.f160077a, r52.f160077a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f160078b, r52.f160078b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f160079c, r52.f160079c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f160077a.hashCode() * 31) + this.f160078b.hashCode()) * 31) + this.f160079c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "SearchCatalog(id=" + this.f160077a + ", name=" + this.f160078b + ", parent=" + this.f160079c + ", alias=" + this.d + ")";
    }
}
