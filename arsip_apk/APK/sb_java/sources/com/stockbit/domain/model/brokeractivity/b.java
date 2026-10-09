package com.stockbit.domain.model.brokeractivity;

import com.clevertap.android.sdk.Constants;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.Date;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Date f80871a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80872b;

    /* renamed from: c, reason: collision with root package name */
    public final double f80873c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f80874e;

    public b(Date r2, String r3, double r4, String r6, String r7) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_DATE);
        kotlin.jvm.internal.p.l(r3, CrashHianalyticsData.TIME);
        kotlin.jvm.internal.p.l(r6, "valueFormatted");
        kotlin.jvm.internal.p.l(r7, "dateTimeLabel");
        this.f80871a = r2;
        this.f80872b = r3;
        this.f80873c = r4;
        this.d = r6;
        this.f80874e = r7;
    }

    public final Date a() {
        return this.f80871a;
    }

    public final String b() {
        return this.f80874e;
    }

    public final String c() {
        return this.f80872b;
    }

    public final double d() {
        return this.f80873c;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (kotlin.jvm.internal.p.g(this.f80871a, r82.f80871a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f80872b, r82.f80872b) == true) goto L15;
        return false;
    L15:
        if (Double.compare(this.f80873c, r82.f80873c) == 0) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f80874e, r82.f80874e) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public int hashCode() {
        return (((((((this.f80871a.hashCode() * 31) + this.f80872b.hashCode()) * 31) + Double.hashCode(this.f80873c)) * 31) + this.d.hashCode()) * 31) + this.f80874e.hashCode();
    }

    public String toString() {
        return "BrokerActivityChartItemEntity(date=" + this.f80871a + ", time=" + this.f80872b + ", value=" + this.f80873c + ", valueFormatted=" + this.d + ", dateTimeLabel=" + this.f80874e + ")";
    }
}
