package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes5.dex */
public final class zzaha {
    private final String zza;
    private final zzaih zzb;

    public zzaha(String r1, zzaih r2) {
        this.zza = Preconditions.checkNotEmpty(r1);
        this.zzb = (zzaih) Preconditions.checkNotNull(r2);
    }

    public final zzaih zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
