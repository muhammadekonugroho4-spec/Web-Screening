package com.stockbit.domain.model.entity.calendar;

import com.clevertap.android.sdk.Constants;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public String f82594a;

    /* renamed from: b, reason: collision with root package name */
    public String f82595b;

    /* renamed from: c, reason: collision with root package name */
    public String f82596c;
    public String d;

    public i(String r2, String r3, String r4, String r5) {
        kotlin.jvm.internal.p.l(r2, "companySymbol");
        kotlin.jvm.internal.p.l(r3, Constants.KEY_DATE);
        kotlin.jvm.internal.p.l(r4, CrashHianalyticsData.TIME);
        kotlin.jvm.internal.p.l(r5, "venue");
        this.f82594a = r2;
        this.f82595b = r3;
        this.f82596c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f82594a;
    }

    public final String b() {
        return this.f82595b;
    }

    public final String c() {
        return this.f82596c;
    }

    public final String d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (kotlin.jvm.internal.p.g(this.f82594a, r52.f82594a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82595b, r52.f82595b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f82596c, r52.f82596c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f82594a.hashCode() * 31) + this.f82595b.hashCode()) * 31) + this.f82596c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "CalendarPublicExpose(companySymbol=" + this.f82594a + ", date=" + this.f82595b + ", time=" + this.f82596c + ", venue=" + this.d + ')';
    }
}
