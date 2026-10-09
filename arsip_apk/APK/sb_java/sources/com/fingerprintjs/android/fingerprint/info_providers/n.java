package com.fingerprintjs.android.fingerprint.info_providers;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f37317a;

    /* renamed from: b, reason: collision with root package name */
    public final List f37318b;

    public n(String r2, List r3) {
        kotlin.jvm.internal.p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r3, "capabilities");
        this.f37317a = r2;
        this.f37318b = r3;
    }

    public final List a() {
        return this.f37318b;
    }

    public final String b() {
        return this.f37317a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof n) == true) goto L8;
        return false;
    L8:
        n r52 = (n) r5;
        if (kotlin.jvm.internal.p.g(this.f37317a, r52.f37317a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f37318b, r52.f37318b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f37317a.hashCode() * 31) + this.f37318b.hashCode();
    }

    public String toString() {
        return "MediaCodecInfo(name=" + this.f37317a + ", capabilities=" + this.f37318b + ')';
    }
}
