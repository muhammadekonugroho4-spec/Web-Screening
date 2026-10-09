package com.stockbit.usecase.watchlist.model;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f164565a;

    /* renamed from: b, reason: collision with root package name */
    public final String f164566b;

    /* renamed from: c, reason: collision with root package name */
    public final int f164567c;

    public a(String r2, String r3, int r4) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f164565a = r2;
        this.f164566b = r3;
        this.f164567c = r4;
    }

    public final String a() {
        return this.f164565a;
    }

    public final String b() {
        return this.f164566b;
    }

    public final int c() {
        return this.f164567c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof a) == true) goto L8;
        return false;
    L8:
        a r52 = (a) r5;
        if (p.g(this.f164565a, r52.f164565a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f164566b, r52.f164566b) == true) goto L15;
        return false;
    L15:
        if (this.f164567c == r52.f164567c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f164565a.hashCode() * 31) + this.f164566b.hashCode()) * 31) + Integer.hashCode(this.f164567c);
    }

    public String toString() {
        return "MyWatchlistUIState(id=" + this.f164565a + ", name=" + this.f164566b + ", stockCount=" + this.f164567c + ")";
    }
}
