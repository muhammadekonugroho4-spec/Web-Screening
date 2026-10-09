package com.stockbit.domain.model.profile.v2;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f84849a;

    /* renamed from: b, reason: collision with root package name */
    public final int f84850b;

    public i(String r2, int r3) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f84849a = r2;
        this.f84850b = r3;
    }

    public final String a() {
        return this.f84849a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof i) == true) goto L8;
        return false;
    L8:
        i r52 = (i) r5;
        if (p.g(this.f84849a, r52.f84849a) == true) goto L12;
        return false;
    L12:
        if (this.f84850b == r52.f84850b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f84849a.hashCode() * 31) + Integer.hashCode(this.f84850b);
    }

    public String toString() {
        return "MyProfilePrivilegeEntity(name=" + this.f84849a + ", code=" + this.f84850b + ")";
    }

    public /* synthetic */ i(String r1, int r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = 0;
    L8:
        this(r1, r2);
    }
}
