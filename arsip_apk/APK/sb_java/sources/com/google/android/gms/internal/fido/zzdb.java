package com.google.android.gms.internal.fido;

/* loaded from: classes5.dex */
final class zzdb extends zzdd {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    public /* synthetic */ zzdb(byte[] r1, int r2, int r3, boolean r4, zzda r5) {
        super(null);
        this.zze = Integer.MAX_VALUE;
        this.zzb = r1;
        this.zzc = 0;
    }

    public final int zza(int r4) throws zzdf {
        int r42 = this.zze;
        this.zze = 0;
        int r1 = this.zzc + this.zzd;
        this.zzc = r1;
        if (r1 <= 0) goto L6;
        this.zzd = r1;
        this.zzc = 0;
        return r42;
    L6:
        this.zzd = 0;
        return r42;
    }
}
