package com.google.android.gms.time.trustedtime;

import com.google.android.gms.time.Ticks;
import java.time.Duration;
import java.time.Instant;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class ComputedInstant {
    private final TimeSignal zza;
    private final long zzb;
    private final Long zzc;
    private final Ticks zzd;

    public ComputedInstant(TimeSignal r1, long r2, Long r4, Ticks r5) {
        Objects.requireNonNull(r1);
        this.zza = r1;
        this.zzb = r2;
        this.zzc = r4;
        Objects.requireNonNull(r5);
        this.zzd = r5;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof ComputedInstant) == true) goto L8;
        return false;
    L8:
        ComputedInstant r82 = (ComputedInstant) r8;
        if (this.zzb == r82.zzb) goto L11;
    L17:
        return false;
    L11:
        if (Objects.equals(this.zzc, r82.zzc) == false) goto L17;
        if (this.zza.equals(r82.zza) == false) goto L17;
        if (this.zzd.equals(r82.zzd) == false) goto L17;
        return true;
    }

    public Duration getEstimatedError() {
        Long r02 = this.zzc;
        if (r02 != null) goto L7;
        return null;
    L7:
        return Duration.ofMillis(r02.longValue());
    }

    public Long getEstimatedErrorMillis() {
        return this.zzc;
    }

    public Instant getInstant() {
        return Instant.ofEpochMilli(this.zzb);
    }

    public long getInstantMillis() {
        return this.zzb;
    }

    public TimeSignal getOriginalTimeSignal() {
        return this.zza;
    }

    public Ticks getTicks() {
        return this.zzd;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.zza, Long.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public String toString() {
        Ticks r02 = this.zzd;
        return "ComputedInstant{originalTimeSignal=" + String.valueOf(this.zza) + ", instantUnixMillis=" + this.zzb + ", estimatedErrorUnixMillis=" + this.zzc + ", ticks=" + String.valueOf(r02) + "}";
    }
}
