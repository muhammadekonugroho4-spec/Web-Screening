package com.stockbit.domain.model.entity.calendar;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f82580a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82581b;

    public d(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.f82580a = r2;
        this.f82581b = r3;
    }

    public final String a() {
        return this.f82581b;
    }
}
