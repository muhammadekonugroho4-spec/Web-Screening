package com.google.android.gms.internal.auth;

/* loaded from: classes5.dex */
final class zzfn implements zzfu {
    private final zzfu[] zza;

    public zzfn(zzfu... r1) {
        this.zza = r1;
    }

    @Override // com.google.android.gms.internal.auth.zzfu
    public final zzft zzb(Class r5) {
        zzfu[] r02 = this.zza;
        int r1 = 0;
    L4:
        if (r1 >= 2) goto L11;
        zzfu r2 = r02[r1];
        if (r2.zzc(r5) == true) goto L8;
        r1 = r1 + 1;
        goto L4
    L8:
        return r2.zzb(r5);
    L11:
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(r5.getName()));
    }

    @Override // com.google.android.gms.internal.auth.zzfu
    public final boolean zzc(Class r5) {
        zzfu[] r02 = this.zza;
        int r2 = 0;
    L4:
        if (r2 >= 2) goto L10;
        if (r02[r2].zzc(r5) == true) goto L7;
        r2 = r2 + 1;
        goto L4
    L7:
        return true;
    L10:
        return false;
    }
}
