package com.stockbit.domain.model.company.brokerflow;

import com.clevertap.android.sdk.Constants;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.Date;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Date f81420a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81421b;

    /* renamed from: c, reason: collision with root package name */
    public final c f81422c;
    public final c d;

    /* renamed from: e, reason: collision with root package name */
    public final c f81423e;

    /* renamed from: f, reason: collision with root package name */
    public final c f81424f;

    /* renamed from: g, reason: collision with root package name */
    public final String f81425g;

    /* renamed from: h, reason: collision with root package name */
    public final String f81426h;

    public b(Date r2, String r3, c r4, c r5, c r6, c r7, String r8, String r9) {
        p.l(r2, Constants.KEY_DATE);
        p.l(r3, CrashHianalyticsData.TIME);
        p.l(r4, "open");
        p.l(r5, Constants.PRIORITY_HIGH);
        p.l(r6, "low");
        p.l(r7, Constants.KEY_HIDE_CLOSE);
        p.l(r8, "valueFormatted");
        p.l(r9, "dateTimeLabel");
        this.f81420a = r2;
        this.f81421b = r3;
        this.f81422c = r4;
        this.d = r5;
        this.f81423e = r6;
        this.f81424f = r7;
        this.f81425g = r8;
        this.f81426h = r9;
    }

    public final c a() {
        return this.f81424f;
    }

    public final Date b() {
        return this.f81420a;
    }

    public final String c() {
        return this.f81426h;
    }

    public final c d() {
        return this.d;
    }

    public final c e() {
        return this.f81423e;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f81420a, r52.f81420a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81421b, r52.f81421b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f81422c, r52.f81422c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f81423e, r52.f81423e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f81424f, r52.f81424f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f81425g, r52.f81425g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f81426h, r52.f81426h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public final c f() {
        return this.f81422c;
    }

    public final String g() {
        return this.f81421b;
    }

    public int hashCode() {
        return (((((((((((((this.f81420a.hashCode() * 31) + this.f81421b.hashCode()) * 31) + this.f81422c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f81423e.hashCode()) * 31) + this.f81424f.hashCode()) * 31) + this.f81425g.hashCode()) * 31) + this.f81426h.hashCode();
    }

    public String toString() {
        return "BrokerFlowItemEntity(date=" + this.f81420a + ", time=" + this.f81421b + ", open=" + this.f81422c + ", high=" + this.d + ", low=" + this.f81423e + ", close=" + this.f81424f + ", valueFormatted=" + this.f81425g + ", dateTimeLabel=" + this.f81426h + ")";
    }
}
