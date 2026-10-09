package com.stockbit.domain.model.entity.calendar;

import com.clevertap.android.sdk.Constants;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f82614a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82615b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82616c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82617e;

    /* renamed from: f, reason: collision with root package name */
    public final String f82618f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f82619g;

    public n(String r2, String r3, String r4, String r5, String r6, String r7, boolean r8) {
        kotlin.jvm.internal.p.l(r2, "companyId");
        kotlin.jvm.internal.p.l(r3, "companySymbol");
        kotlin.jvm.internal.p.l(r4, Constants.KEY_DATE);
        kotlin.jvm.internal.p.l(r5, CrashHianalyticsData.TIME);
        kotlin.jvm.internal.p.l(r6, "venue");
        kotlin.jvm.internal.p.l(r7, "eligibleDate");
        this.f82614a = r2;
        this.f82615b = r3;
        this.f82616c = r4;
        this.d = r5;
        this.f82617e = r6;
        this.f82618f = r7;
        this.f82619g = r8;
    }

    public final String a() {
        return this.f82615b;
    }

    public final String b() {
        return this.f82616c;
    }

    public final String c() {
        return this.f82618f;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f82617e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (kotlin.jvm.internal.p.g(this.f82614a, r52.f82614a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82615b, r52.f82615b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f82616c, r52.f82616c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f82617e, r52.f82617e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f82618f, r52.f82618f) == true) goto L27;
        return false;
    L27:
        if (this.f82619g == r52.f82619g) goto L29;
        return false;
    L29:
        return true;
    }

    public int hashCode() {
        return (((((((((((this.f82614a.hashCode() * 31) + this.f82615b.hashCode()) * 31) + this.f82616c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82617e.hashCode()) * 31) + this.f82618f.hashCode()) * 31) + Boolean.hashCode(this.f82619g);
    }

    public String toString() {
        return "CalendarRups(companyId=" + this.f82614a + ", companySymbol=" + this.f82615b + ", date=" + this.f82616c + ", time=" + this.d + ", venue=" + this.f82617e + ", eligibleDate=" + this.f82618f + ", isActive=" + this.f82619g + ')';
    }
}
