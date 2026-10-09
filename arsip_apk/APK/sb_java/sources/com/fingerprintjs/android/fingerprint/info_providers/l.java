package com.fingerprintjs.android.fingerprint.info_providers;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f37315a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37316b;

    public l(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r3, "vendor");
        this.f37315a = r2;
        this.f37316b = r3;
    }

    public final String a() {
        return this.f37315a;
    }

    public final String b() {
        return this.f37316b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof l) == true) goto L8;
        return false;
    L8:
        l r52 = (l) r5;
        if (kotlin.jvm.internal.p.g(this.f37315a, r52.f37315a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f37316b, r52.f37316b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f37315a.hashCode() * 31) + this.f37316b.hashCode();
    }

    public String toString() {
        return "InputDeviceData(name=" + this.f37315a + ", vendor=" + this.f37316b + ')';
    }
}
