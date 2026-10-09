package com.google.android.gms.internal.auth;

/* loaded from: classes5.dex */
final class zzeg extends zzei {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    public /* synthetic */ zzeg(byte[] r1, int r2, int r3, boolean r4, zzef r5) {
        super(null);
        this.zze = Integer.MAX_VALUE;
        this.zzb = r1;
        this.zzc = 0;
    }

    public final int zza(int r4) throws zzfa {
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
