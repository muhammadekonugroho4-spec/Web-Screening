package com.google.android.gms.internal.common;

import java.util.Arrays;

/* loaded from: classes5.dex */
class zzae extends zzaf {
    Object[] zza;
    int zzb;
    boolean zzc;

    public zzae(int r1) {
        this.zza = new Object[4];
        this.zzb = 0;
    }

    public final zzae zza(Object r5) {
        r5.getClass();
        int r02 = this.zza.length;
        int r1 = this.zzb;
        int r2 = r1 + 1;
        if (r2 < 0) goto L18;
        if (r2 > r02) goto L6;
        int r3 = r02;
    L11:
        if (r3 <= r02) goto L13;
    L14:
        this.zza = Arrays.copyOf(this.zza, r3);
        this.zzc = false;
    L15:
        Object[] r03 = this.zza;
        int r12 = this.zzb;
        this.zzb = r12 + 1;
        r03[r12] = r5;
        return this;
    L13:
        if (this.zzc == false) goto L15;
    L6:
        r3 = ((r02 >> 1) + r02) + 1;
        if (r3 >= r2) goto L9;
        int r13 = Integer.highestOneBit(r1);
        r3 = r13 + r13;
    L9:
        if (r3 >= 0) goto L11;
        r3 = Integer.MAX_VALUE;
        goto L11
    L18:
        throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
    }
}
