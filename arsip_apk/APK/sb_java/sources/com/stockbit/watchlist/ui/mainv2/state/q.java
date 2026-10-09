package com.stockbit.watchlist.ui.mainv2.state;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f171008a;

    /* renamed from: b, reason: collision with root package name */
    public final String f171009b;

    static {
    }

    public q(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r3, Constants.KEY_COLOR);
        this.f171008a = r2;
        this.f171009b = r3;
    }

    public final String a() {
        return this.f171009b;
    }

    public final String b() {
        return this.f171008a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof q) == true) goto L8;
        return false;
    L8:
        q r52 = (q) r5;
        if (kotlin.jvm.internal.p.g(this.f171008a, r52.f171008a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f171009b, r52.f171009b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f171008a.hashCode() * 31) + this.f171009b.hashCode();
    }

    public String toString() {
        return "WatchlistMainNotationItemUIState(name=" + this.f171008a + ", color=" + this.f171009b + ')';
    }
}
