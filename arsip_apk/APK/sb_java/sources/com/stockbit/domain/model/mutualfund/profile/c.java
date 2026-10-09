package com.stockbit.domain.model.mutualfund.profile;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f84412a;

    /* renamed from: b, reason: collision with root package name */
    public final String f84413b;

    /* renamed from: c, reason: collision with root package name */
    public final String f84414c;
    public final String d;

    public c(String r2, String r3, String r4, String r5) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r3, "file");
        p.l(r4, "dir");
        p.l(r5, "url");
        this.f84412a = r2;
        this.f84413b = r3;
        this.f84414c = r4;
        this.d = r5;
    }

    public final String a() {
        return this.f84412a;
    }

    public final String b() {
        return this.d;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f84412a, r52.f84412a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f84413b, r52.f84413b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f84414c, r52.f84414c) == true) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f84412a.hashCode() * 31) + this.f84413b.hashCode()) * 31) + this.f84414c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "MutualFundFileEntity(name=" + this.f84412a + ", file=" + this.f84413b + ", dir=" + this.f84414c + ", url=" + this.d + ")";
    }
}
