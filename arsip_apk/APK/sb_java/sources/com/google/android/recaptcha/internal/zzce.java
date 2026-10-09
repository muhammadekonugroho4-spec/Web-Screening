package com.google.android.recaptcha.internal;

/* loaded from: classes5.dex */
public final class zzce extends Exception {
    private final Throwable zza;
    private final zztd zzb;
    private final int zzc;
    private final int zzd;

    public zzce(int r1, int r2, Throwable r3) {
        this.zzc = r1;
        this.zzd = r2;
        this.zza = r3;
        zztd r32 = zzte.zzf();
        r32.zzq(r2);
        r32.zzr(r1);
        this.zzb = r32;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.zza;
    }

    public final zztd zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }
}
