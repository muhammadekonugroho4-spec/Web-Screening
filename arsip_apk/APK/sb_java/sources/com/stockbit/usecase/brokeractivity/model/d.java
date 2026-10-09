package com.stockbit.usecase.brokeractivity.model;

import com.clevertap.android.sdk.Constants;
import kotlin.Pair;

/* loaded from: classes11.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f154795a;

    /* renamed from: b, reason: collision with root package name */
    public final Pair f154796b;

    /* renamed from: c, reason: collision with root package name */
    public final String f154797c;
    public final String d;

    public d(String r2, Pair r3, String r4, String r5) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_DATE);
        kotlin.jvm.internal.p.l(r3, "nValue");
        kotlin.jvm.internal.p.l(r4, "nLot");
        kotlin.jvm.internal.p.l(r5, "avgPrice");
        this.f154795a = r2;
        this.f154796b = r3;
        this.f154797c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f154795a;
    }

    public final String c() {
        return this.f154797c;
    }

    public final Pair d() {
        return this.f154796b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (kotlin.jvm.internal.p.g(this.f154795a, r52.f154795a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f154796b, r52.f154796b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f154797c, r52.f154797c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f154795a.hashCode() * 31) + this.f154796b.hashCode()) * 31) + this.f154797c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "BrokerActivityDailyCalendarItemUIState(date=" + this.f154795a + ", nValue=" + this.f154796b + ", nLot=" + this.f154797c + ", avgPrice=" + this.d + ")";
    }
}
