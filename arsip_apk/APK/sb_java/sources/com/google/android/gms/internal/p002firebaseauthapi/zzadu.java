package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;

/* loaded from: classes5.dex */
public final class zzadu {
    private static Boolean zza;

    static {
    }

    public static boolean zza(Context r2) {
        if (zza != null) goto L13;
        int r22 = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(r2, 12451000);
        if (r22 != 0) goto L7;
    L10:
        boolean r23 = true;
    L11:
        zza = Boolean.valueOf(r23);
        goto L13
    L7:
        if (r22 == 2) goto L10;
        r23 = false;
    L13:
        return zza.booleanValue();
    }
}
