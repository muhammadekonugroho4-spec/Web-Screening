package com.google.android.gms.internal.play_billing;

/* loaded from: classes5.dex */
final class zzgc implements zzgj {
    private final zzgj[] zza;

    public zzgc(zzgj... r1) {
        this.zza = r1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgj
    public final zzgi zzb(Class r4) {
        int r02 = 0;
    L4:
        if (r02 >= 2) goto L11;
        zzgj r1 = this.zza[r02];
        if (r1.zzc(r4) == true) goto L8;
        r02 = r02 + 1;
        goto L4
    L8:
        return r1.zzb(r4);
    L11:
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(r4.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.zzgj
    public final boolean zzc(Class r4) {
        int r1 = 0;
    L4:
        if (r1 >= 2) goto L10;
        if (this.zza[r1].zzc(r4) == true) goto L7;
        r1 = r1 + 1;
        goto L4
    L7:
        return true;
    L10:
        return false;
    }
}
