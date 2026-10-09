package com.google.android.gms.internal.time;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* loaded from: classes5.dex */
final class zzgb extends zzgg {
    private static final zzgb zza = null;
    private final AtomicReference zzb;

    static {
        zza = new zzgb(zzgg.zze());
    }

    public zzgb(zzgg r2) {
        this.zzb = new AtomicReference(r2);
    }

    public static final zzgb zzb() {
        return zza;
    }

    @Override // com.google.android.gms.internal.time.zzgg
    public final zzet zza() {
        return ((zzgg) this.zzb.get()).zza();
    }

    @Override // com.google.android.gms.internal.time.zzgg
    public final zzgs zzc() {
        return ((zzgg) this.zzb.get()).zzc();
    }

    @Override // com.google.android.gms.internal.time.zzgg
    public final boolean zzd(String r2, Level r3, boolean r4) {
        ((zzgg) this.zzb.get()).zzd(r2, r3, r4);
        return false;
    }
}
