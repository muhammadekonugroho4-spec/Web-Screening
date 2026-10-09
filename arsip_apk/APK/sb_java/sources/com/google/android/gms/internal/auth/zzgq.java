package com.google.android.gms.internal.auth;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
final class zzgq implements Iterator {
    final /* synthetic */ zzgu zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzgq(zzgu r1, zzgp r2) {
        this.zza = r1;
        this.zzb = -1;
    }

    private final Iterator zza() {
        if (this.zzd != null) goto L6;
        this.zzd = zzgu.zzh(this.zza).entrySet().iterator();
    L6:
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if ((this.zzb + 1) >= zzgu.zzf(this.zza).size()) goto L5;
        return true;
    L5:
        if (zzgu.zzh(this.zza).isEmpty() == false) goto L7;
    L9:
        return false;
    L7:
        if (zza().hasNext() == false) goto L9;
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int r1 = this.zzb + 1;
        this.zzb = r1;
        if (r1 >= zzgu.zzf(this.zza).size()) goto L7;
        return (Map.Entry) zzgu.zzf(this.zza).get(this.zzb);
    L7:
        return (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.zzc == false) goto L11;
        this.zzc = false;
        zzgu.zzi(this.zza);
        if (this.zzb >= zzgu.zzf(this.zza).size()) goto L8;
        zzgu r02 = this.zza;
        int r1 = this.zzb;
        this.zzb = r1 - 1;
        zzgu.zzd(r02, r1);
        return;
    L8:
        zza().remove();
        return;
    L11:
        throw new IllegalStateException("remove() was called before next()");
    }
}
