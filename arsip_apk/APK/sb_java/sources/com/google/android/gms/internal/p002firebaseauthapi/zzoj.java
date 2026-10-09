package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class zzoj {
    private static final zzoj zza = null;
    private static final zzoi zzb = null;
    private final AtomicReference<zzns> zzc;

    static {
        zza = new zzoj();
        zzb = new zzoi(null);
    }

    public zzoj() {
        this.zzc = new AtomicReference();
    }

    public static zzoj zzb() {
        return zza;
    }

    public final zzns zza() {
        zzns r02 = this.zzc.get();
        if (r02 == null) goto L5;
        return r02;
    L5:
        return zzb;
    }
}
