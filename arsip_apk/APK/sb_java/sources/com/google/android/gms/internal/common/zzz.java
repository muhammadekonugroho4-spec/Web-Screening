package com.google.android.gms.internal.common;

/* loaded from: classes5.dex */
abstract class zzz extends zzm {
    final CharSequence zzb;
    final zzr zzc;
    final boolean zzd;
    int zze;
    int zzf;

    public zzz(zzaa r2, CharSequence r3) {
        this.zze = 0;
        this.zzc = zzaa.zza(r2);
        this.zzd = zzaa.zzg(r2);
        this.zzf = Integer.MAX_VALUE;
        this.zzb = r3;
    }

    @Override // com.google.android.gms.internal.common.zzm
    public final /* bridge */ /* synthetic */ Object zza() {
        int r02 = this.zze;
    L3:
        int r1 = this.zze;
        if (r1 == (-1)) goto L29;
        int r12 = zzd(r1);
        if (r12 != (-1)) goto L8;
        r12 = this.zzb.length();
        this.zze = -1;
        int r3 = -1;
    L9:
        if (r3 == r02) goto L10;
        if (r02 >= r12) goto L15;
        this.zzb.charAt(r02);
    L15:
        if (r02 >= r12) goto L18;
        this.zzb.charAt(r12 - 1);
    L18:
        if (this.zzd == false) goto L21;
        if (r02 != r12) goto L21;
        r02 = this.zze;
    L21:
        int r32 = this.zzf;
        if (r32 != 1) goto L26;
        r12 = this.zzb.length();
        this.zze = -1;
        if (r12 <= r02) goto L28;
        this.zzb.charAt(r12 - 1);
    L28:
        return this.zzb.subSequence(r02, r12).toString();
    L26:
        this.zzf = r32 - 1;
        goto L28
    L10:
        int r33 = r3 + 1;
        this.zze = r33;
        if (r33 <= this.zzb.length()) goto L3;
        this.zze = -1;
        goto L3
    L8:
        r3 = zzc(r12);
        this.zze = r3;
        goto L9
    L29:
        zzb();
        return null;
    }

    public abstract int zzc(int r1);

    public abstract int zzd(int r1);
}
