package com.facebook.internal.gatekeeper;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f36458a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f36459b;

    public a(String r2, boolean r3) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f36458a = r2;
        this.f36459b = r3;
    }

    public final String a() {
        return this.f36458a;
    }

    public final boolean b() {
        return this.f36459b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f36458a, r52.f36458a) == true) goto L12;
        return false;
    L12:
        if (this.f36459b == r52.f36459b) goto L14;
        return false;
    L14:
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int r02 = this.f36458a.hashCode() * 31;
        boolean r1 = this.f36459b;
        int r12 = r1;
        if (r1 == 0) goto L6;
        r12 = 1;
    L6:
        return r02 + r12;
    }

    public String toString() {
        return "GateKeeper(name=" + this.f36458a + ", value=" + this.f36459b + ')';
    }
}
