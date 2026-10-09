package com.stockbit.usecase.watchlistmain.contract.entity;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f164690a;

    /* renamed from: b, reason: collision with root package name */
    public final String f164691b;

    /* renamed from: c, reason: collision with root package name */
    public final String f164692c;

    public c(String r2, String r3, String r4) {
        p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r3, "description");
        p.l(r4, Constants.KEY_COLOR);
        this.f164690a = r2;
        this.f164691b = r3;
        this.f164692c = r4;
    }

    public final String a() {
        return this.f164692c;
    }

    public final String b() {
        return this.f164690a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof c) == true) goto L8;
        return false;
    L8:
        c r52 = (c) r5;
        if (p.g(this.f164690a, r52.f164690a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f164691b, r52.f164691b) == true) goto L15;
        return false;
    L15:
        if (p.g(this.f164692c, r52.f164692c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f164690a.hashCode() * 31) + this.f164691b.hashCode()) * 31) + this.f164692c.hashCode();
    }

    public String toString() {
        return "WatchlistMainNotationEntity(name=" + this.f164690a + ", description=" + this.f164691b + ", color=" + this.f164692c + ")";
    }
}
