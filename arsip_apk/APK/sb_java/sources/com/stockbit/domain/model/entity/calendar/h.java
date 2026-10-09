package com.stockbit.domain.model.entity.calendar;

import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f82591a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82592b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82593c;
    public final String d;

    public h(String r2, String r3, String r4, String r5) {
        kotlin.jvm.internal.p.l(r2, FirebaseAnalytics.Param.PRICE);
        kotlin.jvm.internal.p.l(r3, "shares");
        kotlin.jvm.internal.p.l(r4, "offeringStart");
        kotlin.jvm.internal.p.l(r5, "offeringEnd");
        this.f82591a = r2;
        this.f82592b = r3;
        this.f82593c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f82593c;
    }

    public final String c() {
        return this.f82591a;
    }

    public final String d() {
        return this.f82592b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (kotlin.jvm.internal.p.g(this.f82591a, r52.f82591a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82592b, r52.f82592b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f82593c, r52.f82593c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f82591a.hashCode() * 31) + this.f82592b.hashCode()) * 31) + this.f82593c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "CalendarIpoDetail(price=" + this.f82591a + ", shares=" + this.f82592b + ", offeringStart=" + this.f82593c + ", offeringEnd=" + this.d + ')';
    }

    public /* synthetic */ h(String r2, String r3, String r4, String r5, int r6, kotlin.jvm.internal.i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = "";
    L14:
        this(r2, r3, r4, r5);
    }
}
