package com.google.android.gms.internal.time;

/* loaded from: classes5.dex */
final class zzds extends zzdw {
    final /* synthetic */ zzdw zza;
    final /* synthetic */ zzdw zzb;

    public zzds(zzdw r1, zzdw r2) {
        this.zza = r1;
        this.zzb = r2;
    }

    @Override // com.google.android.gms.internal.time.zzdw
    public final void zzb() {
        this.zza.zzb();     // Catch: Throwable -> L5
        this.zzb.zzb();
        return;
    L5:
        th = move-exception;
        this.zzb.zzb();
        throw th;
    }
}
