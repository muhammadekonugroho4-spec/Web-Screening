package com.google.android.gms.internal.auth;

/* loaded from: classes5.dex */
final class zzgg implements zzft {
    private final zzfw zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzgg(zzfw r4, String r5, Object[] r6) {
        this.zza = r4;
        this.zzb = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a";
        this.zzc = r6;
        char r52 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(0);
        if (r52 >= 55296) goto L6;
        this.zzd = r52;
        return;
    L6:
        int r53 = r52 & 8191;
        int r02 = 13;
        int r1 = 1;
    L7:
        int r2 = r1 + 1;
        char r12 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(r1);
        if (r12 < 55296) goto L10;
        r53 = r53 | ((r12 & 8191) << r02);
        r02 = r02 + 13;
        r1 = r2;
        goto L7
    L10:
        this.zzd = (r12 << r02) | r53;
    }

    @Override // com.google.android.gms.internal.auth.zzft
    public final zzfw zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.auth.zzft
    public final boolean zzb() {
        if ((this.zzd & 2) != 2) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // com.google.android.gms.internal.auth.zzft
    public final int zzc() {
        if ((this.zzd & 1) != 1) goto L5;
        return 1;
    L5:
        return 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
