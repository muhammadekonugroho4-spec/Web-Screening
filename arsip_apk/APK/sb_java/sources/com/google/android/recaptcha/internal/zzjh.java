package com.google.android.recaptcha.internal;

import com.clevertap.android.sdk.Constants;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class zzjh {
    private boolean zza;
    private long zzb;
    private long zzc;

    public zzjh() {
    }

    public static zzjh zzb() {
        zzjh r02 = new zzjh();
        r02.zze();
        return r02;
    }

    public static zzjh zzc() {
        return new zzjh();
    }

    private final long zzg() {
        if (this.zza == false) goto L7;
        return (System.nanoTime() - this.zzc) + this.zzb;
    L7:
        return this.zzb;
    }

    public final String toString() {
        long r02 = zzg();
        TimeUnit r2 = TimeUnit.DAYS;
        TimeUnit r3 = TimeUnit.NANOSECONDS;
        if (r2.convert(r02, r3) > 0) goto L21;
        r2 = TimeUnit.HOURS;
        if (r2.convert(r02, r3) > 0) goto L21;
        r2 = TimeUnit.MINUTES;
        if (r2.convert(r02, r3) > 0) goto L21;
        r2 = TimeUnit.SECONDS;
        if (r2.convert(r02, r3) > 0) goto L21;
        r2 = TimeUnit.MILLISECONDS;
        if (r2.convert(r02, r3) > 0) goto L21;
        r2 = TimeUnit.MICROSECONDS;
        if (r2.convert(r02, r3) > 0) goto L21;
        r2 = r3;
    L21:
        String r03 = String.format(Locale.ROOT, "%.4g", new Object[]{Double.valueOf(r02 / r3.convert(1, r2))});
        switch(zzjg.zza[r2.ordinal()]) {
            case 1: goto L31;
            case 2: goto L30;
            case 3: goto L29;
            case 4: goto L28;
            case 5: goto L27;
            case 6: goto L26;
            case 7: goto L25;
            default: goto L24;
        };
    L25:
        String r1 = Constants.INAPP_DATA_TAG;
    L33:
        return r03 + " " + r1;
    L26:
        r1 = "h";
        goto L33
    L27:
        r1 = "min";
        goto L33
    L28:
        r1 = "s";
        goto L33
    L29:
        r1 = "ms";
        goto L33
    L30:
        r1 = "μs";
        goto L33
    L31:
        r1 = "ns";
        goto L33
    L24:
        throw new AssertionError();
    }

    public final long zza(TimeUnit r4) {
        return r4.convert(zzg(), TimeUnit.NANOSECONDS);
    }

    public final zzjh zzd() {
        this.zzb = 0;
        this.zza = false;
        return this;
    }

    public final zzjh zze() {
        zzjf.zze(!this.zza, "This stopwatch is already running.");
        this.zza = true;
        this.zzc = System.nanoTime();
        return this;
    }

    public final zzjh zzf() {
        long r02 = System.nanoTime();
        zzjf.zze(this.zza, "This stopwatch is already stopped.");
        this.zza = false;
        this.zzb += r02 - this.zzc;
        return this;
    }
}
