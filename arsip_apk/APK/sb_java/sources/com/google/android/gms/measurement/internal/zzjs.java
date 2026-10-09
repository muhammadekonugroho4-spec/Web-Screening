package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes5.dex */
public final class zzjs {
    final Context zza;
    String zzb;
    String zzc;
    String zzd;
    Boolean zze;
    long zzf;
    com.google.android.gms.internal.measurement.zzdz zzg;
    boolean zzh;
    Long zzi;
    String zzj;

    public zzjs(Context r4, com.google.android.gms.internal.measurement.zzdz r5, Long r6) {
        this.zzh = true;
        Preconditions.checkNotNull(r4);
        Context r42 = r4.getApplicationContext();
        Preconditions.checkNotNull(r42);
        this.zza = r42;
        this.zzi = r6;
        if (r5 == null) goto L8;
        this.zzg = r5;
        this.zzb = r5.zzf;
        this.zzc = r5.zze;
        this.zzd = r5.zzd;
        this.zzh = r5.zzc;
        this.zzf = r5.zzb;
        this.zzj = r5.zzh;
        Bundle r43 = r5.zzg;
        if (r43 == null) goto L9;
        this.zze = Boolean.valueOf(r43.getBoolean("dataCollectionDefaultEnabled", true));
        return;
    L9:
        return;
    }
}
