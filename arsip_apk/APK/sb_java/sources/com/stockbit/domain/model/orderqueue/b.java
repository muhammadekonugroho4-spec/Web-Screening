package com.stockbit.domain.model.orderqueue;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f84563a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84564b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84565c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f84566e;

    /* renamed from: f, reason: collision with root package name */
    public final double f84567f;

    /* renamed from: g, reason: collision with root package name */
    public final String f84568g;

    /* renamed from: h, reason: collision with root package name */
    public final String f84569h;

    /* renamed from: i, reason: collision with root package name */
    public final double f84570i;

    /* renamed from: j, reason: collision with root package name */
    public final double f84571j;

    /* renamed from: k, reason: collision with root package name */
    public final double f84572k;

    /* renamed from: l, reason: collision with root package name */
    public final double f84573l;

    /* renamed from: m, reason: collision with root package name */
    public final String f84574m;

    /* renamed from: n, reason: collision with root package name */
    public final String f84575n;

    /* renamed from: o, reason: collision with root package name */
    public final String f84576o;

    /* renamed from: p, reason: collision with root package name */
    public final String f84577p;

    public b(String r8, String r9, String r10, String r11, String r12, double r13, String r15, String r16, double r17, double r19, double r21, double r23, String r25, String r26, String r27, String r28) {
        p.l(r8, Constants.KEY_ID);
        p.l(r9, "queueNumber");
        p.l(r10, "stockCode");
        p.l(r11, CrashHianalyticsData.TIME);
        p.l(r12, "actionType");
        p.l(r15, "orderNumber");
        p.l(r16, NotificationCompat.CATEGORY_STATUS);
        p.l(r25, "boardType");
        p.l(r26, "brokerCode");
        p.l(r27, "exchangeOrderNumberFull");
        p.l(r28, "exchangeOrderNumberFormatted");
        this.f84563a = r8;
        this.f84564b = r9;
        this.f84565c = r10;
        this.d = r11;
        this.f84566e = r12;
        this.f84567f = r13;
        this.f84568g = r15;
        this.f84569h = r16;
        this.f84570i = r17;
        this.f84571j = r19;
        this.f84572k = r21;
        this.f84573l = r23;
        this.f84574m = r25;
        this.f84575n = r26;
        this.f84576o = r27;
        this.f84577p = r28;
    }

    public final String a() {
        return this.f84566e;
    }

    public final String b() {
        return this.f84574m;
    }

    public final String c() {
        return this.f84575n;
    }

    public final String d() {
        return this.f84577p;
    }

    public final String e() {
        return this.f84576o;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof b) == true) goto L8;
        return false;
    L8:
        b r82 = (b) r8;
        if (p.g(this.f84563a, r82.f84563a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84564b, r82.f84564b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84565c, r82.f84565c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f84566e, r82.f84566e) == true) goto L24;
        return false;
    L24:
        if (Double.compare(this.f84567f, r82.f84567f) == 0) goto L27;
        return false;
    L27:
        if (p.g(this.f84568g, r82.f84568g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f84569h, r82.f84569h) == true) goto L33;
        return false;
    L33:
        if (Double.compare(this.f84570i, r82.f84570i) == 0) goto L36;
        return false;
    L36:
        if (Double.compare(this.f84571j, r82.f84571j) == 0) goto L39;
        return false;
    L39:
        if (Double.compare(this.f84572k, r82.f84572k) == 0) goto L42;
        return false;
    L42:
        if (Double.compare(this.f84573l, r82.f84573l) == 0) goto L45;
        return false;
    L45:
        if (p.g(this.f84574m, r82.f84574m) == true) goto L48;
        return false;
    L48:
        if (p.g(this.f84575n, r82.f84575n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f84576o, r82.f84576o) == true) goto L54;
        return false;
    L54:
        if (p.g(this.f84577p, r82.f84577p) == true) goto L56;
        return false;
    L56:
        return true;
    }

    public final String f() {
        return this.f84563a;
    }

    public final double g() {
        return this.f84572k;
    }

    public final double h() {
        return this.f84570i;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((this.f84563a.hashCode() * 31) + this.f84564b.hashCode()) * 31) + this.f84565c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f84566e.hashCode()) * 31) + Double.hashCode(this.f84567f)) * 31) + this.f84568g.hashCode()) * 31) + this.f84569h.hashCode()) * 31) + Double.hashCode(this.f84570i)) * 31) + Double.hashCode(this.f84571j)) * 31) + Double.hashCode(this.f84572k)) * 31) + Double.hashCode(this.f84573l)) * 31) + this.f84574m.hashCode()) * 31) + this.f84575n.hashCode()) * 31) + this.f84576o.hashCode()) * 31) + this.f84577p.hashCode();
    }

    public final double i() {
        return this.f84571j;
    }

    public final String j() {
        return this.f84568g;
    }

    public final double k() {
        return this.f84567f;
    }

    public final double l() {
        return this.f84573l;
    }

    public final String m() {
        return this.f84564b;
    }

    public final String n() {
        return this.f84569h;
    }

    public final String o() {
        return this.f84565c;
    }

    public final String p() {
        return this.d;
    }

    public String toString() {
        return "OrderQueueItemEntity(id=" + this.f84563a + ", queueNumber=" + this.f84564b + ", stockCode=" + this.f84565c + ", time=" + this.d + ", actionType=" + this.f84566e + ", price=" + this.f84567f + ", orderNumber=" + this.f84568g + ", status=" + this.f84569h + ", open=" + this.f84570i + ", openChangeQuantity=" + this.f84571j + ", lot=" + this.f84572k + ", queueLot=" + this.f84573l + ", boardType=" + this.f84574m + ", brokerCode=" + this.f84575n + ", exchangeOrderNumberFull=" + this.f84576o + ", exchangeOrderNumberFormatted=" + this.f84577p + ")";
    }
}
