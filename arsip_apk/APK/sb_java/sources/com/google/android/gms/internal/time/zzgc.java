package com.google.android.gms.internal.time;

import java.util.Set;
import java.util.logging.Level;

/* loaded from: classes5.dex */
public final class zzgc implements zzfu {
    private final String zza;
    private final Level zzb;
    private final Set zzc;
    private final zzfb zzd;
    private final int zze;

    private zzgc(String r1, boolean r2, int r3, Level r4, boolean r5, Set r6, zzfb r7) {
        this.zza = "";
        this.zze = 2;
        this.zzb = r4;
        this.zzc = r6;
        this.zzd = r7;
    }

    @Override // com.google.android.gms.internal.time.zzfu
    public final zzep zza(String r10) {
        Level r5 = this.zzb;
        Set r6 = this.zzc;
        zzfb r7 = this.zzd;
        boolean r3 = true;
        return new zzgf(this.zza, r10, r3, 2, r5, r6, r7, null);
    }

    public final zzgc zzb(boolean r9) {
        Set r6 = this.zzc;
        zzfb r7 = this.zzd;
        Level r4 = Level.OFF;
        return new zzgc(this.zza, true, 2, r4, false, r6, r7);
    }

    private zzgc() {
        this("", true, 2, Level.ALL, false, zzgf.zzg(), zzgf.zze());
    }

    public /* synthetic */ zzgc(zzge r9) {
        this("", true, 2, Level.ALL, false, zzgf.zzg(), zzgf.zze());
    }
}
