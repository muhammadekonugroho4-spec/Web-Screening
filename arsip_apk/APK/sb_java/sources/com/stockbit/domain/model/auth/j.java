package com.stockbit.domain.model.auth;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public String f80680a;

    /* renamed from: b, reason: collision with root package name */
    public int f80681b;

    public j(String r2, int r3) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f80680a = r2;
        this.f80681b = r3;
    }

    public final int a() {
        return this.f80681b;
    }

    public final String b() {
        return this.f80680a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (p.g(this.f80680a, r52.f80680a) == true) goto L12;
        return false;
    L12:
        if (this.f80681b == r52.f80681b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f80680a.hashCode() * 31) + Integer.hashCode(this.f80681b);
    }

    public String toString() {
        return "PrivilegeEntity(name=" + this.f80680a + ", code=" + this.f80681b + ")";
    }
}
