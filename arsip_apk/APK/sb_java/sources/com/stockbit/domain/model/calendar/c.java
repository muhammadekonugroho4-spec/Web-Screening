package com.stockbit.domain.model.calendar;

import com.clevertap.android.sdk.Constants;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f80976a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80977b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80978c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f80979e;

    /* renamed from: f, reason: collision with root package name */
    public final String f80980f;

    /* renamed from: g, reason: collision with root package name */
    public final String f80981g;

    /* renamed from: h, reason: collision with root package name */
    public final String f80982h;

    /* renamed from: i, reason: collision with root package name */
    public final String f80983i;

    public c(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9, String r10) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, Constants.KEY_DATE);
        p.l(r4, CrashHianalyticsData.TIME);
        p.l(r5, "month");
        p.l(r6, "item");
        p.l(r7, "actual");
        p.l(r8, "previous");
        p.l(r9, "forecast");
        p.l(r10, "lastDate");
        this.f80976a = r2;
        this.f80977b = r3;
        this.f80978c = r4;
        this.d = r5;
        this.f80979e = r6;
        this.f80980f = r7;
        this.f80981g = r8;
        this.f80982h = r9;
        this.f80983i = r10;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f80976a, r52.f80976a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f80977b, r52.f80977b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f80978c, r52.f80978c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f80979e, r52.f80979e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f80980f, r52.f80980f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f80981g, r52.f80981g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f80982h, r52.f80982h) == true) goto L33;
        return false;
    L33:
        if (p.g(this.f80983i, r52.f80983i) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public int hashCode() {
        return (((((((((((((((this.f80976a.hashCode() * 31) + this.f80977b.hashCode()) * 31) + this.f80978c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f80979e.hashCode()) * 31) + this.f80980f.hashCode()) * 31) + this.f80981g.hashCode()) * 31) + this.f80982h.hashCode()) * 31) + this.f80983i.hashCode();
    }

    public String toString() {
        return "CalendarEconomicEntity(id=" + this.f80976a + ", date=" + this.f80977b + ", time=" + this.f80978c + ", month=" + this.d + ", item=" + this.f80979e + ", actual=" + this.f80980f + ", previous=" + this.f80981g + ", forecast=" + this.f80982h + ", lastDate=" + this.f80983i + ")";
    }
}
