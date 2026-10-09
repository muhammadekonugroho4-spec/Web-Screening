package com.stockbit.usecase.cryptohistorylist.contract.entity;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f157223a;

    /* renamed from: b, reason: collision with root package name */
    public final String f157224b;

    /* renamed from: c, reason: collision with root package name */
    public final BigDecimal f157225c;
    public final BigDecimal d;

    /* renamed from: e, reason: collision with root package name */
    public final BigDecimal f157226e;

    /* renamed from: f, reason: collision with root package name */
    public final BigDecimal f157227f;

    public d(List r2, String r3, BigDecimal r4, BigDecimal r5, BigDecimal r6, BigDecimal r7) {
        p.l(r2, FirebaseAnalytics.Param.ITEMS);
        p.l(r4, "rangeRealizedPnl");
        p.l(r5, "rangeRealizedPnlPct");
        p.l(r6, "lastRealizedPnl");
        p.l(r7, "lastRealizedPnlPct");
        this.f157223a = r2;
        this.f157224b = r3;
        this.f157225c = r4;
        this.d = r5;
        this.f157226e = r6;
        this.f157227f = r7;
    }

    public final List a() {
        return this.f157223a;
    }

    public final String b() {
        return this.f157224b;
    }

    public final BigDecimal c() {
        return this.f157225c;
    }

    public final BigDecimal d() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f157223a, r52.f157223a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f157224b, r52.f157224b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f157225c, r52.f157225c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f157226e, r52.f157226e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f157227f, r52.f157227f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public int hashCode() {
        int r02 = this.f157223a.hashCode() * 31;
        String r1 = this.f157224b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((((((((r02 + r12) * 31) + this.f157225c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f157226e.hashCode()) * 31) + this.f157227f.hashCode();
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "CryptoRealizedHistoryPage(items=" + this.f157223a + ", nextPageToken=" + this.f157224b + ", rangeRealizedPnl=" + this.f157225c + ", rangeRealizedPnlPct=" + this.d + ", lastRealizedPnl=" + this.f157226e + ", lastRealizedPnlPct=" + this.f157227f + ")";
    }
}
