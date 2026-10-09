package com.fingerprintjs.android.fingerprint.info_providers;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes4.dex */
public abstract class i {
    public static final /* synthetic */ String a(Integer r02) {
        return b(r02);
    }

    public static final String b(Integer r2) {
        if (r2 != null) goto L5;
    L8:
        if (r2 != null) goto L11;
    L14:
        if (r2 != null) goto L17;
    L20:
        if (r2 != null) goto L23;
    L26:
        if (r2 != null) goto L29;
        return "";
    L29:
        if (r2.intValue() != 5) goto L32;
        return "active_per_user";
    L32:
        return "";
    L23:
        if (r2.intValue() != 3) goto L26;
        return AppMeasurementSdk.ConditionalUserProperty.ACTIVE;
    L17:
        if (r2.intValue() != 2) goto L20;
        return "activating";
    L11:
        if (r2.intValue() != 1) goto L14;
        return "inactive";
    L5:
        if (r2.intValue() != 0) goto L8;
        return "unsupported";
    }
}
