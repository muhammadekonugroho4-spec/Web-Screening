package com.stockbit.domain.model.chat.upload;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f81375a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81376b;

    public b(String r2, String r3) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r3, "value");
        this.f81375a = r2;
        this.f81376b = r3;
    }

    public final String a() {
        return this.f81375a;
    }

    public final String b() {
        return this.f81376b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r52 = (b) r5;
        if (p.g(this.f81375a, r52.f81375a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f81376b, r52.f81376b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f81375a.hashCode() * 31) + this.f81376b.hashCode();
    }

    public String toString() {
        return "AWSUploadTokenFieldEntity(name=" + this.f81375a + ", value=" + this.f81376b + ")";
    }
}
