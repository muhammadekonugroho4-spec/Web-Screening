package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes5.dex */
final class zzalc implements zzalk {
    private zzalk[] zza;

    public zzalc(zzalk... r1) {
        this.zza = r1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalk
    public final zzall zza(Class<?> r6) {
        zzalk[] r02 = this.zza;
        int r1 = r02.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L10;
        zzalk r3 = r02[r2];
        if (r3.zzb(r6) == true) goto L7;
        r2 = r2 + 1;
        goto L3
    L7:
        return r3.zza(r6);
    L10:
        throw new UnsupportedOperationException("No factory is available for message type: " + r6.getName());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalk
    public final boolean zzb(Class<?> r6) {
        zzalk[] r02 = this.zza;
        int r1 = r02.length;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L9;
        if (r02[r3].zzb(r6) == true) goto L6;
        r3 = r3 + 1;
        goto L3
    L6:
        return true;
    L9:
        return false;
    }
}
