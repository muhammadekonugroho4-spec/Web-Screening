package com.google.android.gms.internal.time;

/* loaded from: classes5.dex */
final class zzdj implements Runnable {
    final /* synthetic */ zzdi zza;
    final /* synthetic */ zzdk zzb;

    public zzdj(zzdk r1, zzdi r2) {
        this.zza = r2;
        this.zzb = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdk.zzc(this.zzb).remove(this.zza);
    }
}
