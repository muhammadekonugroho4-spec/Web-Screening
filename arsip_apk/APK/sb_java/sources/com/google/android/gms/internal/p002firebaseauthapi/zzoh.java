package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class zzoh {
    private static final zzoh zza = null;
    private final Map<Class<? extends zzcg>, zzog<? extends zzcg>> zzb;

    static {
        zza = new zzoh();
    }

    public zzoh() {
        this.zzb = new HashMap();
    }

    public static zzoh zza() {
        return zza;
    }

    public final synchronized <ParametersT extends zzcg> void zza(zzog<ParametersT> r2, Class<ParametersT> r3) throws GeneralSecurityException {
        monitor-enter(this);
        zzog<? extends zzcg> r02 = this.zzb.get(r3);     // Catch: Throwable -> L10
        if (r02 != null) goto L6;
    L12:
        this.zzb.put(r3, r2);     // Catch: Throwable -> L10
        monitor-exit(this);
        return;
    L6:
        if (r02.equals(r2) == true) goto L12;
        throw new GeneralSecurityException("Different key creator for parameters class already inserted");     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        throw th;
    }
}
