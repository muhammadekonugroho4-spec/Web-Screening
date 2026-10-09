package com.google.android.gms.internal.time;

import android.os.SystemClock;
import com.google.android.gms.time.Ticks;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzai extends zzav {
    private final Long zza;
    private final int zzb;

    public zzai(Long r1, int r2) {
        this.zza = r1;
        this.zzb = r2;
    }

    @Override // com.google.android.gms.time.Ticker
    public final long elapsedRealtimeMillisForTicks(Ticks r3) {
        zzd(r3);
        return r3.zza();
    }

    @Override // com.google.android.gms.time.Ticker
    public final long elapsedRealtimeNanosForTicks(Ticks r5) {
        zzd(r5);
        return zzbz.zzb(r5.zza(), 1000000);
    }

    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof zzai) == true) goto L10;
        return false;
    L10:
        return Objects.equals(this.zza, ((zzai) r2).zza);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza});
    }

    @Override // com.google.android.gms.time.Ticker
    public final long millisBetween(Ticks r3, Ticks r4) {
        zzd(r3);
        zzd(r4);
        return zzbz.zzc(r4.zza(), r3.zza());
    }

    @Override // com.google.android.gms.time.Ticker
    public final Ticks ticks() {
        return Ticks.zzb(this, SystemClock.elapsedRealtime());
    }

    @Override // com.google.android.gms.time.Ticker
    public final Ticks ticksForElapsedRealtimeMillis(long r1) {
        return Ticks.zzb(this, r1);
    }

    @Override // com.google.android.gms.time.Ticker
    public final Ticks ticksForElapsedRealtimeNanos(long r3) {
        return Ticks.zzb(this, r3 / 1000000);
    }

    public final String toString() {
        return "BasicPhysicalTicker";
    }

    @Override // com.google.android.gms.internal.time.zzav
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.time.zzav
    public final Long zzb() {
        return this.zza;
    }
}
