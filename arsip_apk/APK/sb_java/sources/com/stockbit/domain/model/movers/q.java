package com.stockbit.domain.model.movers;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f84399a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84400b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84401c;
    public final Boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final List f84402e;

    /* renamed from: f, reason: collision with root package name */
    public final d f84403f;

    public q(String r2, String r3, String r4, Boolean r5, List r6, d r7) {
        kotlin.jvm.internal.p.l(r2, "code");
        kotlin.jvm.internal.p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r4, "iconUrl");
        kotlin.jvm.internal.p.l(r6, "notations");
        kotlin.jvm.internal.p.l(r7, "corpaction");
        this.f84399a = r2;
        this.f84400b = r3;
        this.f84401c = r4;
        this.d = r5;
        this.f84402e = r6;
        this.f84403f = r7;
    }

    public final String a() {
        return this.f84399a;
    }

    public final d b() {
        return this.f84403f;
    }

    public final Boolean c() {
        return this.d;
    }

    public final String d() {
        return this.f84401c;
    }

    public final String e() {
        return this.f84400b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof q) == true) goto L8;
        return false;
    L8:
        q r52 = (q) r5;
        if (kotlin.jvm.internal.p.g(this.f84399a, r52.f84399a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f84400b, r52.f84400b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f84401c, r52.f84401c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f84402e, r52.f84402e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f84403f, r52.f84403f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final List f() {
        return this.f84402e;
    }

    public int hashCode() {
        int r02 = ((((this.f84399a.hashCode() * 31) + this.f84400b.hashCode()) * 31) + this.f84401c.hashCode()) * 31;
        Boolean r1 = this.d;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((((r02 + r12) * 31) + this.f84402e.hashCode()) * 31) + this.f84403f.hashCode();
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "MoversStockDetailEntity(code=" + this.f84399a + ", name=" + this.f84400b + ", iconUrl=" + this.f84401c + ", hasUma=" + this.d + ", notations=" + this.f84402e + ", corpaction=" + this.f84403f + ")";
    }
}
