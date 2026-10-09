package com.stockbit.usecase.cashsweep.model;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes11.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f155080a;

    /* renamed from: b, reason: collision with root package name */
    public final String f155081b;

    /* renamed from: c, reason: collision with root package name */
    public final j f155082c;

    public r(String r2, String r3, j r4) {
        kotlin.jvm.internal.p.l(r2, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r3, "fileUrl");
        kotlin.jvm.internal.p.l(r4, Constants.KEY_DATE);
        this.f155080a = r2;
        this.f155081b = r3;
        this.f155082c = r4;
    }

    public final String a() {
        return this.f155081b;
    }

    public final String b() {
        return this.f155080a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof r) == true) goto L8;
        return false;
    L8:
        r r52 = (r) r5;
        if (kotlin.jvm.internal.p.g(this.f155080a, r52.f155080a) == true) goto L12;
        return false;
    L12:
        if (kotlin.jvm.internal.p.g(this.f155081b, r52.f155081b) == true) goto L15;
        return false;
    L15:
        if (kotlin.jvm.internal.p.g(this.f155082c, r52.f155082c) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        return (((this.f155080a.hashCode() * 31) + this.f155081b.hashCode()) * 31) + this.f155082c.hashCode();
    }

    public String toString() {
        return "ProductFundFactsUIState(name=" + this.f155080a + ", fileUrl=" + this.f155081b + ", date=" + this.f155082c + ")";
    }
}
