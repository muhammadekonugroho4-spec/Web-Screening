package com.stockbit.feature.cryptohistory.ui.realizeddetail.state;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f94152a;

    /* renamed from: b, reason: collision with root package name */
    public final String f94153b;

    /* renamed from: c, reason: collision with root package name */
    public final String f94154c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f94155e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f94156f;

    static {
    }

    public c(String r2, String r3, String r4, String r5, String r6, boolean r7) {
        p.l(r2, CrashHianalyticsData.TIME);
        p.l(r3, "qty");
        p.l(r4, "value");
        p.l(r5, FirebaseAnalytics.Param.PRICE);
        p.l(r6, "pnlLabel");
        this.f94152a = r2;
        this.f94153b = r3;
        this.f94154c = r4;
        this.d = r5;
        this.f94155e = r6;
        this.f94156f = r7;
    }

    public final String a() {
        return this.f94155e;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f94153b;
    }

    public final String d() {
        return this.f94152a;
    }

    public final String e() {
        return this.f94154c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f94152a, r52.f94152a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f94153b, r52.f94153b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f94154c, r52.f94154c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f94155e, r52.f94155e) == true) goto L24;
        return false;
    L24:
        if (this.f94156f == r52.f94156f) goto L26;
        return false;
    L26:
        return true;
    }

    public final boolean f() {
        return this.f94156f;
    }

    public int hashCode() {
        return (((((((((this.f94152a.hashCode() * 31) + this.f94153b.hashCode()) * 31) + this.f94154c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f94155e.hashCode()) * 31) + Boolean.hashCode(this.f94156f);
    }

    public String toString() {
        return "CryptoRealizedTradeRowUIData(time=" + this.f94152a + ", qty=" + this.f94153b + ", value=" + this.f94154c + ", price=" + this.d + ", pnlLabel=" + this.f94155e + ", isGain=" + this.f94156f + ')';
    }
}
