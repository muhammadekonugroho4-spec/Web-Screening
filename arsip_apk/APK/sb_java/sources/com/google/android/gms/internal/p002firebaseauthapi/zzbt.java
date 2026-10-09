package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
public final class zzbt {
    private boolean zza;
    private zzbq zzb;
    private final zzcg zzc;
    private zzbw zzd;
    private zzbu zze;

    public /* synthetic */ zzbt(zzcg r1, zzby r2) {
        this(r1);
    }

    public static /* bridge */ /* synthetic */ zzbq zza(zzbt r02) {
        return r02.zzb;
    }

    public static /* bridge */ /* synthetic */ zzbw zzb(zzbt r02) {
        return r02.zzd;
    }

    public static /* bridge */ /* synthetic */ zzbu zzc(zzbt r02) {
        return r02.zze;
    }

    public static /* bridge */ /* synthetic */ zzcg zzd(zzbt r02) {
        return r02.zzc;
    }

    public static /* bridge */ /* synthetic */ boolean zze(zzbt r02) {
        return r02.zza;
    }

    private zzbt(zzcg r2) {
        this.zzb = zzbq.zza;
        this.zzd = null;
        this.zze = null;
        this.zzc = r2;
    }

    public static /* bridge */ /* synthetic */ void zza(zzbt r02, zzbu r1) {
        r02.zze = r1;
    }

    public final zzbt zzb() {
        this.zzd = zzbw.zzb();
        return this;
    }

    public static /* bridge */ /* synthetic */ void zza(zzbt r02, boolean r1) {
        r02.zza = false;
    }

    public final zzbt zza() {
        zzbu r02 = this.zze;
        if (r02 == null) goto L5;
        zzbu.zza(r02);
    L5:
        this.zza = true;
        return this;
    }
}
