package com.google.android.gms.internal.time;

/* loaded from: classes5.dex */
public abstract class zzgv {
    private final int zza;
    private final zzek zzb;

    public zzgv(zzek r3, int r4) {
        if (r3 == null) goto L10;
        if (r4 < 0) goto L8;
        this.zza = r4;
        this.zzb = r3;
        return;
    L8:
        throw new IllegalArgumentException("invalid index: " + r4);
    L10:
        throw new IllegalArgumentException("format options cannot be null");
    }

    public abstract void zzb(zzgw r1, Object r2);

    public final int zzc() {
        return this.zza;
    }

    public final zzek zzd() {
        return this.zzb;
    }

    public final void zze(zzgw r3, Object[] r4) {
        int r02 = this.zza;
        if (r02 >= r4.length) goto L10;
        Object r42 = r4[r02];
        if (r42 == null) goto L8;
        zzb(r3, r42);
        return;
    L8:
        r3.zzg();
        return;
    L10:
        r3.zzf();
    }
}
