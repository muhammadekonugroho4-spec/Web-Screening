package com.google.android.gms.auth;

import android.content.Intent;

/* loaded from: classes5.dex */
public class GooglePlayServicesAvailabilityException extends UserRecoverableAuthException {
    private final int zza;

    public GooglePlayServicesAvailabilityException(int r1, String r2, Intent r3) {
        super(r2, r3);
        this.zza = r1;
    }

    public int getConnectionStatusCode() {
        return this.zza;
    }
}
