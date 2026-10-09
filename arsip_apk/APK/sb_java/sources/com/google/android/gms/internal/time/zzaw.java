package com.google.android.gms.internal.time;

import com.google.android.gms.time.Ticks;
import java.util.List;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzaw {
    private final zzg zza;
    private final zzi zzb;
    private final Ticks zzc;
    private final zzco zzd;
    private final zzco zze;

    public zzaw(zzg r1, zzi r2, Ticks r3, List r4, List r5) {
        Objects.requireNonNull(r1);
        this.zza = r1;
        Objects.requireNonNull(r2);
        this.zzb = r2;
        Objects.requireNonNull(r3);
        this.zzc = r3;
        this.zze = zzco.zzj(r4);
        this.zzd = zzco.zzj(r5);
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof zzaw) == true) goto L8;
        return false;
    L8:
        zzaw r52 = (zzaw) r5;
        if (Objects.equals(this.zza, r52.zza) == true) goto L11;
    L19:
        return false;
    L11:
        if (Objects.equals(this.zzb, r52.zzb) == false) goto L19;
        if (Objects.equals(this.zzc, r52.zzc) == false) goto L19;
        if (Objects.equals(this.zzd, r52.zzd) == false) goto L19;
        if (Objects.equals(this.zze, r52.zze) == false) goto L19;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, this.zze});
    }

    public final String toString() {
        zzco r02 = this.zze;
        zzco r1 = this.zzd;
        Ticks r2 = this.zzc;
        zzi r3 = this.zzb;
        return "InternalTimeSignal{estimatedError=" + String.valueOf(this.zza) + ", currentTime=" + String.valueOf(r3) + ", acquisitionTicks=" + String.valueOf(r2) + ", futureUnixEpochClockAdjustments=" + String.valueOf(r1) + ", pastUnixEpochClockAdjustments=" + String.valueOf(r02) + "}";
    }

    public final Ticks zza() {
        return this.zzc;
    }

    public final zzg zzb() {
        return this.zza;
    }

    public final zzi zzc() {
        return this.zzb;
    }

    public final zzco zzd() {
        return this.zzd;
    }

    public final zzco zze() {
        return this.zze;
    }
}
