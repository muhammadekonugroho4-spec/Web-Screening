package com.stockbit.domain.model.entity.calendar;

import android.widget.TextView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f82612a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f82613b;

    public m(String r2, TextView r3) {
        kotlin.jvm.internal.p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f82612a = r2;
        this.f82613b = r3;
    }

    public final TextView a() {
        return this.f82613b;
    }

    public final String b() {
        return this.f82612a;
    }

    public final void c(TextView r1) {
        this.f82613b = r1;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (kotlin.jvm.internal.p.g(this.f82612a, r52.f82612a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f82613b, r52.f82613b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        int r02 = this.f82612a.hashCode() * 31;
        TextView r1 = this.f82613b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "CalendarRowHeader(name=" + this.f82612a + ", lineCount=" + this.f82613b + ')';
    }

    public /* synthetic */ m(String r1, TextView r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        this(r1, r2);
    }
}
