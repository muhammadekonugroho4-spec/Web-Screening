package com.stockbit.usecase.securities.model;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f160606a;

    /* renamed from: b, reason: collision with root package name */
    public final String f160607b;

    /* renamed from: c, reason: collision with root package name */
    public final String f160608c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f160609e;

    /* renamed from: f, reason: collision with root package name */
    public final String f160610f;

    /* renamed from: g, reason: collision with root package name */
    public final double f160611g;

    /* renamed from: h, reason: collision with root package name */
    public final double f160612h;

    /* renamed from: i, reason: collision with root package name */
    public final double f160613i;

    /* renamed from: j, reason: collision with root package name */
    public final String f160614j;

    public h(String r2, String r3, String r4, String r5, String r6, String r7, double r8, double r10, double r12, String r14) {
        p.l(r2, "symbol");
        p.l(r3, "marketOrderId");
        p.l(r4, "orderId");
        p.l(r5, "smartOrderId");
        p.l(r6, NotificationCompat.CATEGORY_STATUS);
        p.l(r7, CrashHianalyticsData.TIME);
        p.l(r14, Constants.KEY_ACTION);
        this.f160606a = r2;
        this.f160607b = r3;
        this.f160608c = r4;
        this.d = r5;
        this.f160609e = r6;
        this.f160610f = r7;
        this.f160611g = r8;
        this.f160612h = r10;
        this.f160613i = r12;
        this.f160614j = r14;
    }

    public final String a() {
        return this.f160614j;
    }

    public final String b() {
        return this.f160607b;
    }

    public final double c() {
        return this.f160611g;
    }

    public final double d() {
        return this.f160612h;
    }

    public final double e() {
        return this.f160613i;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof h) == true) goto L8;
        return false;
    L8:
        h r82 = (h) r8;
        if (p.g(this.f160606a, r82.f160606a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f160607b, r82.f160607b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f160608c, r82.f160608c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r82.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f160609e, r82.f160609e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f160610f, r82.f160610f) == true) goto L27;
        return false;
    L27:
        if (Double.compare(this.f160611g, r82.f160611g) == 0) goto L30;
        return false;
    L30:
        if (Double.compare(this.f160612h, r82.f160612h) == 0) goto L33;
        return false;
    L33:
        if (Double.compare(this.f160613i, r82.f160613i) == 0) goto L36;
        return false;
    L36:
        if (p.g(this.f160614j, r82.f160614j) == true) goto L38;
        return false;
    L38:
        return true;
    }

    public final String f() {
        return this.f160609e;
    }

    public final String g() {
        return this.f160606a;
    }

    public final String h() {
        return this.f160610f;
    }

    public int hashCode() {
        return (((((((((((((((((this.f160606a.hashCode() * 31) + this.f160607b.hashCode()) * 31) + this.f160608c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f160609e.hashCode()) * 31) + this.f160610f.hashCode()) * 31) + Double.hashCode(this.f160611g)) * 31) + Double.hashCode(this.f160612h)) * 31) + Double.hashCode(this.f160613i)) * 31) + this.f160614j.hashCode();
    }

    public String toString() {
        return "OrderListUIState(symbol=" + this.f160606a + ", marketOrderId=" + this.f160607b + ", orderId=" + this.f160608c + ", smartOrderId=" + this.d + ", status=" + this.f160609e + ", time=" + this.f160610f + ", orderOpen=" + this.f160611g + ", orderTotal=" + this.f160612h + ", price=" + this.f160613i + ", action=" + this.f160614j + ")";
    }
}
