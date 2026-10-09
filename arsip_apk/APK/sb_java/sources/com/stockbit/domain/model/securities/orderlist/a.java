package com.stockbit.domain.model.securities.orderlist;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f85581a;

    /* renamed from: b, reason: collision with root package name */
    public final String f85582b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85583c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f85584e;

    /* renamed from: f, reason: collision with root package name */
    public final String f85585f;

    /* renamed from: g, reason: collision with root package name */
    public final double f85586g;

    /* renamed from: h, reason: collision with root package name */
    public final double f85587h;

    /* renamed from: i, reason: collision with root package name */
    public final double f85588i;

    /* renamed from: j, reason: collision with root package name */
    public final String f85589j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f85590k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f85591l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f85592m;

    /* renamed from: n, reason: collision with root package name */
    public final String f85593n;

    /* renamed from: o, reason: collision with root package name */
    public final String f85594o;

    public a(String r5, String r6, String r7, String r8, String r9, String r10, double r11, double r13, double r15, String r17, boolean r18, boolean r19, boolean r20, String r21, String r22) {
        p.l(r5, "symbol");
        p.l(r6, "marketOrderId");
        p.l(r7, "orderId");
        p.l(r8, "smartOrderId");
        p.l(r9, NotificationCompat.CATEGORY_STATUS);
        p.l(r10, CrashHianalyticsData.TIME);
        p.l(r17, Constants.KEY_ACTION);
        p.l(r21, "amountOpenFee");
        p.l(r22, "amountMatchedTotal");
        this.f85581a = r5;
        this.f85582b = r6;
        this.f85583c = r7;
        this.d = r8;
        this.f85584e = r9;
        this.f85585f = r10;
        this.f85586g = r11;
        this.f85587h = r13;
        this.f85588i = r15;
        this.f85589j = r17;
        this.f85590k = r18;
        this.f85591l = r19;
        this.f85592m = r20;
        this.f85593n = r21;
        this.f85594o = r22;
    }

    public final String a() {
        return this.f85589j;
    }

    public final String b() {
        return this.f85582b;
    }

    public final String c() {
        return this.f85583c;
    }

    public final double d() {
        return this.f85586g;
    }

    public final double e() {
        return this.f85587h;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof a) == true) goto L8;
        return false;
    L8:
        a r82 = (a) r8;
        if (p.g(this.f85581a, r82.f85581a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f85582b, r82.f85582b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f85583c, r82.f85583c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f85584e, r82.f85584e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f85585f, r82.f85585f) == true) goto L27;
        return false;
    L27:
        if (Double.compare(this.f85586g, r82.f85586g) == 0) goto L30;
        return false;
    L30:
        if (Double.compare(this.f85587h, r82.f85587h) == 0) goto L33;
        return false;
    L33:
        if (Double.compare(this.f85588i, r82.f85588i) == 0) goto L36;
        return false;
    L36:
        if (p.g(this.f85589j, r82.f85589j) == true) goto L39;
        return false;
    L39:
        if (this.f85590k == r82.f85590k) goto L42;
        return false;
    L42:
        if (this.f85591l == r82.f85591l) goto L45;
        return false;
    L45:
        if (this.f85592m == r82.f85592m) goto L48;
        return false;
    L48:
        if (p.g(this.f85593n, r82.f85593n) == true) goto L51;
        return false;
    L51:
        if (p.g(this.f85594o, r82.f85594o) == true) goto L53;
        return false;
    L53:
        return true;
    }

    public final double f() {
        return this.f85588i;
    }

    public final String g() {
        return this.d;
    }

    public final String h() {
        return this.f85584e;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.f85581a.hashCode() * 31) + this.f85582b.hashCode()) * 31) + this.f85583c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f85584e.hashCode()) * 31) + this.f85585f.hashCode()) * 31) + Double.hashCode(this.f85586g)) * 31) + Double.hashCode(this.f85587h)) * 31) + Double.hashCode(this.f85588i)) * 31) + this.f85589j.hashCode()) * 31) + Boolean.hashCode(this.f85590k)) * 31) + Boolean.hashCode(this.f85591l)) * 31) + Boolean.hashCode(this.f85592m)) * 31) + this.f85593n.hashCode()) * 31) + this.f85594o.hashCode();
    }

    public final String i() {
        return this.f85581a;
    }

    public final String j() {
        return this.f85585f;
    }

    public String toString() {
        return "OrderListEntity(symbol=" + this.f85581a + ", marketOrderId=" + this.f85582b + ", orderId=" + this.f85583c + ", smartOrderId=" + this.d + ", status=" + this.f85584e + ", time=" + this.f85585f + ", orderOpen=" + this.f85586g + ", orderTotal=" + this.f85587h + ", price=" + this.f85588i + ", action=" + this.f85589j + ", isCancelAble=" + this.f85590k + ", isAmendAble=" + this.f85591l + ", isGtc=" + this.f85592m + ", amountOpenFee=" + this.f85593n + ", amountMatchedTotal=" + this.f85594o + ")";
    }
}
