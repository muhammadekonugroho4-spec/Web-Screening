package org.koin.core.qualifier;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.p;

/* loaded from: classes3.dex */
public abstract class b {
    public static final c a(String r1) {
        p.l(r1, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return new c(r1);
    }

    public static final c b(String r1) {
        p.l(r1, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return new c(r1);
    }
}
