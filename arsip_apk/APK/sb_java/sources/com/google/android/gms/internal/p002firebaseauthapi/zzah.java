package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes5.dex */
class zzah<E> extends zzak<E> {
    Object[] zza;
    int zzb;
    boolean zzc;

    public zzah(int r2) {
        zzag.zza(4, "initialCapacity");
        this.zza = new Object[4];
        this.zzb = 0;
    }

    public zzah<E> zza(E r4) {
        zzw.zza(r4);
        Object[] r02 = this.zza;
        int r1 = zzak.zza(r02.length, this.zzb + 1);
        if (r1 <= r02.length) goto L5;
    L6:
        this.zza = Arrays.copyOf(this.zza, r1);
        this.zzc = false;
    L7:
        Object[] r03 = this.zza;
        int r12 = this.zzb;
        this.zzb = r12 + 1;
        r03[r12] = r4;
        return this;
    L5:
        if (this.zzc == false) goto L7;
        goto L6
    }
}
