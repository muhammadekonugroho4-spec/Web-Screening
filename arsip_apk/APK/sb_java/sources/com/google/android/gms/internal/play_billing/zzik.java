package com.google.android.gms.internal.play_billing;

/* loaded from: classes5.dex */
final class zzik implements zzfl {
    static final zzfl zza = null;

    static {
        zza = new zzik();
    }

    private zzik() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzfl
    public final boolean zza(int r3) {
        if (r3 == 0) goto L13;
        if (r3 != 1) goto L6;
        zzil r32 = zzil.zzb;
    L14:
        if (r32 == null) goto L16;
        return true;
    L16:
        return false;
    L6:
        if (r3 != 2) goto L8;
        r32 = zzil.zzc;
        goto L14
    L8:
        if (r3 == 3) goto L10;
        r32 = null;
        goto L14
    L10:
        r32 = zzil.zzd;
        goto L14
    L13:
        r32 = zzil.zza;
        goto L14
    }
}
