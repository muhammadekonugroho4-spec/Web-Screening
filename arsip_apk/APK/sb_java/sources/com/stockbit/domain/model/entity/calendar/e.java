package com.stockbit.domain.model.entity.calendar;

import com.clevertap.android.sdk.Constants;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f82582a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82583b;

    /* renamed from: c, reason: collision with root package name */
    public final int f82584c;

    public e(String r2, String r3, int r4) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r3, Constants.KEY_DATE);
        this.f82582a = r2;
        this.f82583b = r3;
        this.f82584c = r4;
    }

    public final String a() {
        return this.f82583b;
    }

    public final int b() {
        return this.f82584c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof e) == true) goto L8;
        return false;
    L8:
        e r52 = (e) r5;
        if (kotlin.jvm.internal.p.g(this.f82582a, r52.f82582a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82583b, r52.f82583b) == true) goto L15;
        return false;
    L15:
        if (this.f82584c == r52.f82584c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f82582a.hashCode() * 31) + this.f82583b.hashCode()) * 31) + Integer.hashCode(this.f82584c);
    }

    public String toString() {
        return "CalendarEconomicRowHeader(id=" + this.f82582a + ", date=" + this.f82583b + ", headerType=" + this.f82584c + ')';
    }
}
