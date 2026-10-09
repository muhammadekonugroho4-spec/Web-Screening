package com.stockbit.domain.model.calendar;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f80990a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80991b;

    /* renamed from: c, reason: collision with root package name */
    public final String f80992c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f80993e;

    /* renamed from: f, reason: collision with root package name */
    public final String f80994f;

    /* renamed from: g, reason: collision with root package name */
    public final String f80995g;

    /* renamed from: h, reason: collision with root package name */
    public final String f80996h;

    public e(String r2, String r3, String r4, String r5, String r6, String r7, String r8, String r9) {
        p.l(r2, FirebaseAnalytics.Param.PRICE);
        p.l(r3, "shares");
        p.l(r4, "percentage");
        p.l(r5, "offeringStart");
        p.l(r6, "offeringEnd");
        p.l(r7, "allotmentDate");
        p.l(r8, "refundDate");
        p.l(r9, "priceFormatted");
        this.f80990a = r2;
        this.f80991b = r3;
        this.f80992c = r4;
        this.d = r5;
        this.f80993e = r6;
        this.f80994f = r7;
        this.f80995g = r8;
        this.f80996h = r9;
    }

    public final String a() {
        return this.f80996h;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (p.g(this.f80990a, r52.f80990a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f80991b, r52.f80991b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f80992c, r52.f80992c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (p.g(this.f80993e, r52.f80993e) == true) goto L24;
        return false;
    L24:
        if (p.g(this.f80994f, r52.f80994f) == true) goto L27;
        return false;
    L27:
        if (p.g(this.f80995g, r52.f80995g) == true) goto L30;
        return false;
    L30:
        if (p.g(this.f80996h, r52.f80996h) == true) goto L32;
        return false;
    L32:
        return true;
    }

    public int hashCode() {
        return (((((((((((((this.f80990a.hashCode() * 31) + this.f80991b.hashCode()) * 31) + this.f80992c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f80993e.hashCode()) * 31) + this.f80994f.hashCode()) * 31) + this.f80995g.hashCode()) * 31) + this.f80996h.hashCode();
    }

    public String toString() {
        return "CalendarIpoItemEntity(price=" + this.f80990a + ", shares=" + this.f80991b + ", percentage=" + this.f80992c + ", offeringStart=" + this.d + ", offeringEnd=" + this.f80993e + ", allotmentDate=" + this.f80994f + ", refundDate=" + this.f80995g + ", priceFormatted=" + this.f80996h + ")";
    }
}
