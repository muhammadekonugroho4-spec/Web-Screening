package com.stockbit.usecase.calendar.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.stockbit.usecase.calendar.model.type.CalendarType;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public CalendarType f154999a;

    /* renamed from: b, reason: collision with root package name */
    public List f155000b;

    public a(CalendarType r2, List r3) {
        p.l(r2, "calendarType");
        p.l(r3, FirebaseAnalytics.Param.ITEMS);
        this.f154999a = r2;
        this.f155000b = r3;
    }

    public final CalendarType a() {
        return this.f154999a;
    }

    public final List b() {
        return this.f155000b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (this.f154999a == r52.f154999a) goto L12;
        return false;
    L12:
        if (p.g(this.f155000b, r52.f155000b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f154999a.hashCode() * 31) + this.f155000b.hashCode();
    }

    public String toString() {
        return "CalendarTodayGroupUIState(calendarType=" + this.f154999a + ", items=" + this.f155000b + ")";
    }
}
