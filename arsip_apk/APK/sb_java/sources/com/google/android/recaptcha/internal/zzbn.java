package com.google.android.recaptcha.internal;

import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class zzbn {
    private final long zza;
    private final zzjh zzb;

    public zzbn() {
        this.zza = System.currentTimeMillis();
        this.zzb = zzjh.zzb();
    }

    public final long zza(TimeUnit r3) {
        return this.zzb.zza(r3);
    }

    public final long zzb() {
        return this.zza;
    }

    public final void zzc() {
        this.zzb.zzf();
    }
}
