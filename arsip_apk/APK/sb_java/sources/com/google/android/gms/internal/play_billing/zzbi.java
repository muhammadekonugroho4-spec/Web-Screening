package com.google.android.gms.internal.play_billing;

import com.clevertap.android.sdk.Constants;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class zzbi {
    private final zzbl zza;
    private boolean zzb;
    private long zzc;
    private long zzd;

    public zzbi() {
        this.zza = zzbl.zzb();
    }

    public static zzbi zzb(zzbl r1) {
        zzbi r02 = new zzbi(r1);
        r02.zze();
        return r02;
    }

    public static zzbi zzc(zzbl r1) {
        return new zzbi(r1);
    }

    private final long zzh() {
        if (this.zzb == false) goto L7;
        return (this.zza.zza() - this.zzd) + this.zzc;
    L7:
        return this.zzc;
    }

    public final String toString() {
        long r02 = zzh();
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
        switch(zzbh.zza[r2.ordinal()]) {
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
        return r4.convert(zzh(), TimeUnit.NANOSECONDS);
    }

    public final zzbi zzd() {
        this.zzc = 0;
        this.zzb = false;
        return this;
    }

    public final zzbi zze() {
        zzbg.zze(!this.zzb, "This stopwatch is already running.");
        this.zzb = true;
        this.zzd = this.zza.zza();
        return this;
    }

    public final zzbi zzf() {
        long r02 = this.zza.zza();
        zzbg.zze(this.zzb, "This stopwatch is already stopped.");
        this.zzb = false;
        this.zzc += r02 - this.zzd;
        return this;
    }

    public final boolean zzg() {
        return this.zzb;
    }

    public zzbi(zzbl r2) {
        zzbg.zzc(r2, "ticker");
        this.zza = r2;
    }
}
