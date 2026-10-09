package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: classes5.dex */
public class GooglePlayServicesManifestException extends IllegalStateException {
    private final int zza;

    public GooglePlayServicesManifestException(int r1, String r2) {
        super(r2);
        this.zza = r1;
    }

    public int getActualVersion() {
        return this.zza;
    }

    public int getExpectedVersion() {
        return GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }
}
