package com.google.android.gms.internal.time;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.time.Ticker;
import com.google.android.gms.time.Ticks;
import java.time.Duration;

/* loaded from: classes5.dex */
public abstract class zzav implements Ticker {
    public zzav() {
    }

    @Override // com.google.android.gms.time.Ticker
    public final /* synthetic */ Duration durationBetween(Ticks r1, Ticks r2) {
        return Duration.ofMillis(millisBetween(r1, r2));
    }

    public abstract int zza();

    public abstract Long zzb();

    public final Long zzc(Ticks r4, Ticks r5) {
        if (r4.getOriginTicker() != r5.getOriginTicker()) goto L17;
        Long r02 = zzb();
        if (r02 == null) goto L18;
        long r42 = Math.abs(millisBetween(r4, r5));
        if (zza() != 0) goto L15;
        if (r42 <= Constants.ONE_DAY_IN_MILLIS) goto L15;
        return null;
    L15:
        return Long.valueOf(zzbz.zzb(r02.longValue(), r42) / 1000000);
    L18:
        return null;
    L17:
        throw new IllegalArgumentException("Ticks must be from the same origin");
    }

    public final void zzd(Ticks r3) {
        if (r3.getOriginTicker() != this) goto L6;
        return;
    L6:
        throw new IllegalArgumentException(String.format("Ticks (%s) must be from this Ticker (%s)", new Object[]{r3, this}));
    }
}
