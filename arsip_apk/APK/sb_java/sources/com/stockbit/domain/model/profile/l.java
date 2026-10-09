package com.stockbit.domain.model.profile;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f84695a;

    /* renamed from: b, reason: collision with root package name */
    public final int f84696b;

    public l(String r2, int r3) {
        kotlin.jvm.internal.p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f84695a = r2;
        this.f84696b = r3;
    }

    public final String a() {
        return this.f84695a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (kotlin.jvm.internal.p.g(this.f84695a, r52.f84695a) == true) goto L12;
        return false;
    L12:
        if (this.f84696b == r52.f84696b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f84695a.hashCode() * 31) + Integer.hashCode(this.f84696b);
    }

    public String toString() {
        return "ProfilePrivilegeEntity(name=" + this.f84695a + ", code=" + this.f84696b + ")";
    }

    public /* synthetic */ l(String r1, int r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = 0;
    L8:
        this(r1, r2);
    }
}
