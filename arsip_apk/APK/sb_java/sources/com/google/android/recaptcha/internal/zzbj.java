package com.google.android.recaptcha.internal;

import kotlin.text.B;

/* loaded from: classes5.dex */
public final class zzbj implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public zzbj() {
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object r1) {
        return zza((zzbj) r1);
    }

    public final String toString() {
        return "avgExecutionTime: " + B.H0(String.valueOf(this.zzb / this.zza), 10, 0, 2, null) + " us| maxExecutionTime: " + B.H0(String.valueOf(this.zzc), 10, 0, 2, null) + " us| totalTime: " + B.H0(String.valueOf(this.zzb), 10, 0, 2, null) + " us| #Usages: " + B.H0(String.valueOf(this.zza), 5, 0, 2, null);
    }

    public final int zza(zzbj r4) {
        return kotlin.comparisons.b.d(Long.valueOf(this.zzb), Long.valueOf(r4.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long r1) {
        this.zzc = r1;
    }

    public final void zzf(long r1) {
        this.zzb = r1;
    }

    public final void zzg(int r1) {
        this.zza = r1;
    }
}
