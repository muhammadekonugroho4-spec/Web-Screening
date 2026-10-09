package com.stockbit.usecase.screener.model;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f159744a;

    /* renamed from: b, reason: collision with root package name */
    public final String f159745b;

    /* renamed from: c, reason: collision with root package name */
    public final int f159746c;
    public final String d;

    public h(String r2, String r3, int r4, String r5) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r5, "type");
        this.f159744a = r2;
        this.f159745b = r3;
        this.f159746c = r4;
        this.d = r5;
    }

    public static /* synthetic */ h b(h r02, String r1, String r2, int r3, String r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r02.f159744a;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r02.f159745b;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r02.f159746c;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        return r02.a(r1, r2, r3, r4);
    }

    public final h a(String r2, String r3, int r4, String r5) {
        p.l(r2, Constants.KEY_ID);
        p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        p.l(r5, "type");
        return new h(r2, r3, r4, r5);
    }

    public final int c() {
        return this.f159746c;
    }

    public final String d() {
        return this.f159744a;
    }

    public final String e() {
        return this.f159745b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof h) == true) goto L8;
        return false;
    L8:
        h r52 = (h) r5;
        if (p.g(this.f159744a, r52.f159744a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f159745b, r52.f159745b) == true) goto L15;
        return false;
    L15:
        if (this.f159746c == r52.f159746c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((this.f159744a.hashCode() * 31) + this.f159745b.hashCode()) * 31) + Integer.hashCode(this.f159746c)) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "ScreenerSavedUIState(id=" + this.f159744a + ", name=" + this.f159745b + ", favorite=" + this.f159746c + ", type=" + this.d + ")";
    }
}
