package com.google.android.recaptcha.internal;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;

/* loaded from: classes5.dex */
public final class zzbs {
    private final GoogleApiAvailabilityLight zza;

    public zzbs(GoogleApiAvailabilityLight r1) {
        this.zza = r1;
    }

    public final int zza(Context r3) {
        int r32 = this.zza.isGooglePlayServicesAvailable(r3);
        if (r32 != 1) goto L5;
        return 4;
    L5:
        if (r32 != 3) goto L7;
        return 4;
    L7:
        if (r32 == 9) goto L12;
        return 3;
    L12:
        return 4;
    }

    public zzbs() {
        this.zza = GoogleApiAvailabilityLight.getInstance();
    }
}
