package com.google.android.gms.internal.fido;

/* loaded from: classes5.dex */
public final class zzdt {
    private final byte zza;
    private final byte zzb;

    public zzdt(int r2) {
        this.zza = (byte) (r2 & 224);
        this.zzb = (byte) (r2 & 31);
    }

    public final byte zza() {
        return this.zzb;
    }

    public final byte zzb() {
        return this.zza;
    }

    public final int zzc() {
        return (this.zza >> 5) & 7;
    }
}
