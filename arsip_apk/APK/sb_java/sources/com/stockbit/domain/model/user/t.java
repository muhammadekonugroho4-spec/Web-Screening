package com.stockbit.domain.model.user;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f86686a;

    /* renamed from: b, reason: collision with root package name */
    public final int f86687b;

    public t(String r2, int r3) {
        kotlin.jvm.internal.p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f86686a = r2;
        this.f86687b = r3;
    }

    public final String a() {
        return this.f86686a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof t) == true) goto L8;
        return false;
    L8:
        t r52 = (t) r5;
        if (kotlin.jvm.internal.p.g(this.f86686a, r52.f86686a) == true) goto L12;
        return false;
    L12:
        if (this.f86687b == r52.f86687b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f86686a.hashCode() * 31) + Integer.hashCode(this.f86687b);
    }

    public String toString() {
        return "UserSocialPrivilegeEntity(name=" + this.f86686a + ", code=" + this.f86687b + ")";
    }

    public /* synthetic */ t(String r1, int r2, int r3, kotlin.jvm.internal.i r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = 0;
    L8:
        this(r1, r2);
    }
}
