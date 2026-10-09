package com.google.android.gms.internal.time;

/* loaded from: classes5.dex */
public abstract class zzha {
    private final zzfr zza;
    private int zzb;
    private int zzc;

    public zzha(zzfr r2) {
        this.zzb = 0;
        this.zzc = -1;
        zzhf.zza(r2, "context");
        this.zza = r2;
    }

    public abstract Object zza();

    public abstract void zzc(int r1, int r2, zzgv r3);

    public final int zzh() {
        return this.zzc + 1;
    }

    public final zzhb zzi() {
        return this.zza.zza();
    }

    public final Object zzj() {
        this.zza.zza().zzc(this);
        int r02 = this.zzb;
        if (((r02 + 1) & r02) != 0) goto L11;
        if (this.zzc <= 31) goto L9;
        if (r02 != (-1)) goto L11;
    L9:
        return zza();
    L11:
        throw zzhc.zzb(String.format("unreferenced arguments [first missing index=%d]", new Object[]{Integer.valueOf(Integer.numberOfTrailingZeros(~r02))}), this.zza.zzb());
    }

    public final String zzk() {
        return this.zza.zzb();
    }

    public final void zzl(int r4, int r5, zzgv r6) {
        if (r6.zzc() >= 32) goto L5;
        this.zzb |= 1 << r6.zzc();
    L5:
        this.zzc = Math.max(this.zzc, r6.zzc());
        zzc(r4, r5, r6);
    }
}
