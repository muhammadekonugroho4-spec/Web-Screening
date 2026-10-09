package com.stockbit.domain.model.search;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f84989a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84990b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84991c;
    public final String d;

    public l(String r2, String r3, String r4, String r5) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r4, "parent");
        p.l(r5, "alias");
        this.f84989a = r2;
        this.f84990b = r3;
        this.f84991c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f84989a;
    }

    public final String c() {
        return this.f84990b;
    }

    public final String d() {
        return this.f84991c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (p.g(this.f84989a, r52.f84989a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84990b, r52.f84990b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84991c, r52.f84991c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f84989a.hashCode() * 31) + this.f84990b.hashCode()) * 31) + this.f84991c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "SearchSectorEntity(id=" + this.f84989a + ", name=" + this.f84990b + ", parent=" + this.f84991c + ", alias=" + this.d + ")";
    }
}
