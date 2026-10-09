package com.stockbit.search.ui.discover.search.adapter;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;

/* loaded from: classes11.dex */
public interface u {
    default void E0(String r2, String r3, String r4) {
        kotlin.jvm.internal.p.l(r2, "companyType");
        kotlin.jvm.internal.p.l(r3, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r4, Constants.KEY_ID);
    }

    default void H3(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r3, "username");
    }

    default void Y(long r1) {
    }

    default void d0(String r2, String r3, String r4, String r5, String r6) {
        kotlin.jvm.internal.p.l(r2, "type");
        kotlin.jvm.internal.p.l(r3, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r4, AppMeasurementSdk.ConditionalUserProperty.NAME);
        kotlin.jvm.internal.p.l(r5, "parent");
        kotlin.jvm.internal.p.l(r6, "alias");
    }

    default void x(String r2, String r3) {
        kotlin.jvm.internal.p.l(r2, Constants.KEY_ID);
        kotlin.jvm.internal.p.l(r3, Constants.ScionAnalytics.PARAM_LABEL);
    }
}
