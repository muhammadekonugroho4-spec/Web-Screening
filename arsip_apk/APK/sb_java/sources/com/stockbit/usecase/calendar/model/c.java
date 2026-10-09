package com.stockbit.usecase.calendar.model;

import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final List f155005a;

    public c(List r2) {
        p.l(r2, "calendarTodayList");
        this.f155005a = r2;
    }

    public final List a() {
        return this.f155005a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof c) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f155005a, ((c) r4).f155005a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f155005a.hashCode();
    }

    public String toString() {
        return "CalendarTodayUIState(calendarTodayList=" + this.f155005a + ")";
    }
}
