package com.stockbit.domain.model.company.tradebook;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f82036a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82037b;

    /* renamed from: c, reason: collision with root package name */
    public final a f82038c;
    public final a d;

    /* renamed from: e, reason: collision with root package name */
    public final a f82039e;

    /* renamed from: f, reason: collision with root package name */
    public final a f82040f;

    /* renamed from: g, reason: collision with root package name */
    public final a f82041g;

    public g(String r2, String r3, a r4, a r5, a r6, a r7, a r8) {
        p.l(r2, FirebaseAnalytics.Param.PRICE);
        p.l(r3, CrashHianalyticsData.TIME);
        p.l(r4, "buy");
        p.l(r5, "sell");
        p.l(r6, "preOpen");
        p.l(r7, "postClose");
        p.l(r8, "total");
        this.f82036a = r2;
        this.f82037b = r3;
        this.f82038c = r4;
        this.d = r5;
        this.f82039e = r6;
        this.f82040f = r7;
        this.f82041g = r8;
    }

    public final a a() {
        return this.f82038c;
    }

    public final a b() {
        return this.f82040f;
    }

    public final a c() {
        return this.f82039e;
    }

    public final String d() {
        return this.f82036a;
    }

    public final a e() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof g) == true) goto L8;
        return false;
    L8:
        g r52 = (g) r5;
        if (p.g(this.f82036a, r52.f82036a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f82037b, r52.f82037b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f82038c, r52.f82038c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f82039e, r52.f82039e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f82040f, r52.f82040f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f82041g, r52.f82041g) == true) goto L29;
        return false;
    L29:
        return true;
    }

    public final String f() {
        return this.f82037b;
    }

    public final a g() {
        return this.f82041g;
    }

    public int hashCode() {
        return (((((((((((this.f82036a.hashCode() * 31) + this.f82037b.hashCode()) * 31) + this.f82038c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f82039e.hashCode()) * 31) + this.f82040f.hashCode()) * 31) + this.f82041g.hashCode();
    }

    public String toString() {
        return "TradeBookItemEntity(price=" + this.f82036a + ", time=" + this.f82037b + ", buy=" + this.f82038c + ", sell=" + this.d + ", preOpen=" + this.f82039e + ", postClose=" + this.f82040f + ", total=" + this.f82041g + ")";
    }
}
