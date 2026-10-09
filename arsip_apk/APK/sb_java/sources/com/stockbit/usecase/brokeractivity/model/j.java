package com.stockbit.usecase.brokeractivity.model;

import com.clevertap.android.sdk.Constants;
import kotlin.Pair;

/* loaded from: classes11.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f154819a;

    /* renamed from: b, reason: collision with root package name */
    public final Pair f154820b;

    /* renamed from: c, reason: collision with root package name */
    public final Pair f154821c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f154822e;

    /* renamed from: f, reason: collision with root package name */
    public final Pair f154823f;

    public j(String r2, Pair r3, Pair r4, String r5, String r6, Pair r7) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_DATE);
        kotlin.jvm.internal.p.l(r3, "nValue");
        kotlin.jvm.internal.p.l(r4, "nLot");
        kotlin.jvm.internal.p.l(r5, "avgPrice");
        kotlin.jvm.internal.p.l(r6, "closePrice");
        kotlin.jvm.internal.p.l(r7, "returnPercentage");
        this.f154819a = r2;
        this.f154820b = r3;
        this.f154821c = r4;
        this.d = r5;
        this.f154822e = r6;
        this.f154823f = r7;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f154822e;
    }

    public final String c() {
        return this.f154819a;
    }

    public final Pair d() {
        return this.f154821c;
    }

    public final Pair e() {
        return this.f154820b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (kotlin.jvm.internal.p.g(this.f154819a, r52.f154819a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f154820b, r52.f154820b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f154821c, r52.f154821c) == true) goto L18;
        return false;
    L18:
        if (kotlin.jvm.internal.p.g(this.d, r52.d) == true) goto L21;
        return false;
    L21:
        if (kotlin.jvm.internal.p.g(this.f154822e, r52.f154822e) == true) goto L24;
        return false;
    L24:
        if (kotlin.jvm.internal.p.g(this.f154823f, r52.f154823f) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final Pair f() {
        return this.f154823f;
    }

    public int hashCode() {
        return (((((((((this.f154819a.hashCode() * 31) + this.f154820b.hashCode()) * 31) + this.f154821c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f154822e.hashCode()) * 31) + this.f154823f.hashCode();
    }

    public String toString() {
        return "BrokerActivityDailyListItemUIState(date=" + this.f154819a + ", nValue=" + this.f154820b + ", nLot=" + this.f154821c + ", avgPrice=" + this.d + ", closePrice=" + this.f154822e + ", returnPercentage=" + this.f154823f + ")";
    }
}
