package com.stockbit.domain.model.calendar;

import com.clevertap.android.sdk.Constants;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f80997a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80998b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80999c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f81000e;

    /* renamed from: f, reason: collision with root package name */
    public final String f81001f;

    /* renamed from: g, reason: collision with root package name */
    public final String f81002g;

    public f(String r2, String r3, String r4, String r5, String r6, String r7, String r8) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, "companyId");
        p.l(r4, "companySymbol");
        p.l(r5, Constants.KEY_DATE);
        p.l(r6, CrashHianalyticsData.TIME);
        p.l(r7, "venue");
        p.l(r8, "lastUpdate");
        this.f80997a = r2;
        this.f80998b = r3;
        this.f80999c = r4;
        this.d = r5;
        this.f81000e = r6;
        this.f81001f = r7;
        this.f81002g = r8;
    }

    public final String a() {
        return this.f80999c;
    }

    public final String b() {
        return this.f81000e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof f) == true) goto L8;
        return false;
    L8:
        f r52 = (f) r5;
        if (p.g(this.f80997a, r52.f80997a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f80998b, r52.f80998b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f80999c, r52.f80999c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f81000e, r52.f81000e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f81001f, r52.f81001f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f81002g, r52.f81002g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public int hashCode() {
        return (((((((((((this.f80997a.hashCode() * 31) + this.f80998b.hashCode()) * 31) + this.f80999c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f81000e.hashCode()) * 31) + this.f81001f.hashCode()) * 31) + this.f81002g.hashCode();
    }

    public String toString() {
        return "CalendarPublicExposeEntity(id=" + this.f80997a + ", companyId=" + this.f80998b + ", companySymbol=" + this.f80999c + ", date=" + this.d + ", time=" + this.f81000e + ", venue=" + this.f81001f + ", lastUpdate=" + this.f81002g + ")";
    }
}
