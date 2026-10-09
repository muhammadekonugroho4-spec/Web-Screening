package com.stockbit.domain.model.search;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f84966a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84967b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84968c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84969e;

    public h(String r2, String r3, String r4, String r5, String r6) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "parent");
        p.l(r5, "alias");
        p.l(r6, "type");
        this.f84966a = r2;
        this.f84967b = r3;
        this.f84968c = r4;
        this.d = r5;
        this.f84969e = r6;
    }

    public final String a() {
        return this.f84966a;
    }

    public final String b() {
        return this.f84967b;
    }

    public final String c() {
        return this.f84968c;
    }

    public final String d() {
        return this.f84969e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (p.g(this.f84966a, r52.f84966a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84967b, r52.f84967b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84968c, r52.f84968c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f84969e, r52.f84969e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f84966a.hashCode() * 31) + this.f84967b.hashCode()) * 31) + this.f84968c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f84969e.hashCode();
    }

    public String toString() {
        return "SearchIndustryEntity(id=" + this.f84966a + ", name=" + this.f84967b + ", parent=" + this.f84968c + ", alias=" + this.d + ", type=" + this.f84969e + ")";
    }
}
