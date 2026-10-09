package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes5.dex */
final class zzbh {
    final String zza;
    final String zzb;
    final long zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final Long zzh;
    final Long zzi;
    final Long zzj;
    final Boolean zzk;

    public zzbh(String r18, String r19, long r20, long r22, long r24, long r26, Long r28, Long r29, Long r30, Boolean r31) {
        this(r18, r19, 0, 0, 0, r24, 0, null, null, null, null);
    }

    public final zzbh zza(Long r20, Long r21, Boolean r22) {
        if (r22 != null) goto L5;
    L7:
        Boolean r18 = r22;
    L9:
        return new zzbh(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, r20, r21, r18);
    L5:
        if (r22.booleanValue() == true) goto L7;
        r18 = null;
        goto L9
    }

    public zzbh(String r14, String r15, long r16, long r18, long r20, long r22, long r24, Long r26, Long r27, Long r28, Boolean r29) {
        Preconditions.checkNotEmpty(r14);
        Preconditions.checkNotEmpty(r15);
        boolean r11 = false;
        if (r16 < 0) goto L5;
        boolean r10 = true;
    L6:
        Preconditions.checkArgument(r10);
        if (r18 < 0) goto L9;
        boolean r102 = true;
    L10:
        Preconditions.checkArgument(r102);
        if (r20 < 0) goto L13;
        boolean r103 = true;
    L14:
        Preconditions.checkArgument(r103);
        if (r24 < 0) goto L17;
        r11 = true;
    L17:
        Preconditions.checkArgument(r11);
        this.zza = r14;
        this.zzb = r15;
        this.zzc = r16;
        this.zzd = r18;
        this.zze = r20;
        this.zzf = r22;
        this.zzg = r24;
        this.zzh = r26;
        this.zzi = r27;
        this.zzj = r28;
        this.zzk = r29;
        return;
    L13:
        r103 = false;
        goto L14
    L9:
        r102 = false;
        goto L10
    L5:
        r10 = false;
        goto L6
    }

    public final zzbh zza(long r19, long r21) {
        return new zzbh(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, r19, Long.valueOf(r21), this.zzi, this.zzj, this.zzk);
    }

    public final zzbh zza(long r19) {
        return new zzbh(this.zza, this.zzb, this.zzc, this.zzd, this.zze, r19, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk);
    }
}
