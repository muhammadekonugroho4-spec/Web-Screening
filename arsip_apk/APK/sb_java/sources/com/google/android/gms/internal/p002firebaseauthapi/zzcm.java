package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes5.dex */
public final class zzcm {
    private static final zzcm zza = null;

    static {
        zza = new zzcm();
    }

    private zzcm() {
    }

    public static zzcm zza() {
        return zza;
    }

    public static zzcm zza(zzcm r1) throws GeneralSecurityException {
        if (r1 == null) goto L5;
        return r1;
    L5:
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
