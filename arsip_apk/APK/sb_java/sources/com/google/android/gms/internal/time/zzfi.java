package com.google.android.gms.internal.time;

import java.util.Iterator;

/* loaded from: classes5.dex */
final class zzfi implements Iterator {
    final /* synthetic */ zzfj zza;
    private final zzdq zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzfi(zzfj r1, zzdq r2, int r3, zzfl r4) {
        this.zza = r1;
        this.zzb = r2;
        int r12 = r3 & 31;
        this.zzc = r12;
        this.zzd = r3 >>> (r12 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zzc < 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object r02 = this.zzb.zze(zzfj.zzf(this.zza, this.zzc));
        int r1 = this.zzd;
        if (r1 == 0) goto L6;
        int r12 = Integer.numberOfTrailingZeros(r1) + 1;
        this.zzd >>>= r12;
        this.zzc += r12;
        return r02;
    L6:
        this.zzc = -1;
        return r02;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
