package com.stockbit.domain.model.calendar;

import com.clevertap.android.sdk.Constants;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f81039a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81040b;

    /* renamed from: c, reason: collision with root package name */
    public final String f81041c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f81042e;

    /* renamed from: f, reason: collision with root package name */
    public final String f81043f;

    /* renamed from: g, reason: collision with root package name */
    public final String f81044g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f81045h;

    /* renamed from: i, reason: collision with root package name */
    public final String f81046i;

    public i(String r2, String r3, String r4, String r5, String r6, String r7, String r8, boolean r9, String r10) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, "companyId");
        p.l(r4, "companySymbol");
        p.l(r5, Constants.KEY_DATE);
        p.l(r6, CrashHianalyticsData.TIME);
        p.l(r7, "venue");
        p.l(r8, "created");
        p.l(r10, "eligibleDate");
        this.f81039a = r2;
        this.f81040b = r3;
        this.f81041c = r4;
        this.d = r5;
        this.f81042e = r6;
        this.f81043f = r7;
        this.f81044g = r8;
        this.f81045h = r9;
        this.f81046i = r10;
    }

    public final String a() {
        return this.f81040b;
    }

    public final String b() {
        return this.f81041c;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f81046i;
    }

    public final String e() {
        return this.f81042e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (p.g(this.f81039a, r52.f81039a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81040b, r52.f81040b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81041c, r52.f81041c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f81042e, r52.f81042e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f81043f, r52.f81043f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f81044g, r52.f81044g) == true) goto L30;
        return false;
    L30:
        if (this.f81045h == r52.f81045h) goto L33;
        return false;
    L33:
        if (p.g(this.f81046i, r52.f81046i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String f() {
        return this.f81043f;
    }

    public final boolean g() {
        return this.f81045h;
    }

    public int hashCode() {
        return (((((((((((((((this.f81039a.hashCode() * 31) + this.f81040b.hashCode()) * 31) + this.f81041c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f81042e.hashCode()) * 31) + this.f81043f.hashCode()) * 31) + this.f81044g.hashCode()) * 31) + Boolean.hashCode(this.f81045h)) * 31) + this.f81046i.hashCode();
    }

    public String toString() {
        return "CalendarRupsEntity(id=" + this.f81039a + ", companyId=" + this.f81040b + ", companySymbol=" + this.f81041c + ", date=" + this.d + ", time=" + this.f81042e + ", venue=" + this.f81043f + ", created=" + this.f81044g + ", isCorpActionActive=" + this.f81045h + ", eligibleDate=" + this.f81046i + ")";
    }
}
