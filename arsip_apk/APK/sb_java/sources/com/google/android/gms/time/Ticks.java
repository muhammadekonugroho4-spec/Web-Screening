package com.google.android.gms.time;

import com.google.android.gms.internal.time.zzav;
import java.time.Duration;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class Ticks {
    private final zzav zza;
    private final long zzb;

    private Ticks(zzav r1, long r2) {
        Objects.requireNonNull(r1);
        this.zza = r1;
        this.zzb = r2;
    }

    public static Ticks zzb(zzav r1, long r2) {
        return new Ticks(r1, r2);
    }

    private final void zzc(Ticks r2) {
        if (this.zza != r2.zza) goto L6;
        return;
    L6:
        throw new IllegalArgumentException("Ticks must be from the same origin");
    }

    public Duration durationUntil(Ticks r2) {
        return getOriginTicker().durationBetween(this, r2);
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof Ticks) == true) goto L8;
        return false;
    L8:
        Ticks r82 = (Ticks) r8;
        if (this.zzb == r82.zzb) goto L11;
    L13:
        return false;
    L11:
        if (Objects.equals(this.zza, r82.zza) == false) goto L13;
        return true;
    }

    public Long estimatedErrorMillisUntil(Ticks r2) {
        return this.zza.zzc(this, r2);
    }

    public Ticker getOriginTicker() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.zza, Long.valueOf(this.zzb)});
    }

    public boolean isAfter(Ticks r5) {
        zzc(r5);
        if (this.zzb <= r5.zzb) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean isBefore(Ticks r5) {
        zzc(r5);
        if (this.zzb >= r5.zzb) goto L6;
        return true;
    L6:
        return false;
    }

    public long millisUntil(Ticks r3) {
        return getOriginTicker().millisBetween(this, r3);
    }

    public String toString() {
        return "Ticks{originalTicker=" + String.valueOf(this.zza) + ", value=" + this.zzb + "}";
    }

    public final long zza() {
        return this.zzb;
    }
}
