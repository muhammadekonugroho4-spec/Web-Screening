package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
final class zzpb implements Iterator {
    final /* synthetic */ zzpe zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzpb(zzpe r1, zzpd r2) {
        this.zza = r1;
        this.zzb = -1;
    }

    private final Iterator zza() {
        if (this.zzd != null) goto L6;
        this.zzd = zzpe.zzh(this.zza).entrySet().iterator();
    L6:
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int r02 = this.zzb + 1;
        zzpe r2 = this.zza;
        if (r02 >= zzpe.zzb(r2)) goto L5;
        return true;
    L5:
        if (zzpe.zzh(r2).isEmpty() == false) goto L7;
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
        zzpe r02 = this.zza;
        if (r1 >= zzpe.zzb(r02)) goto L7;
        return (zzpa) zzpe.zzk(r02)[r1];
    L7:
        return (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.zzc == false) goto L11;
        this.zzc = false;
        zzpe.zzi(this.zza);
        int r02 = this.zzb;
        zzpe r1 = this.zza;
        if (r02 >= zzpe.zzb(r1)) goto L8;
        this.zzb = r02 - 1;
        zzpe.zze(r1, r02);
        return;
    L8:
        zza().remove();
        return;
    L11:
        throw new IllegalStateException("remove() was called before next()");
    }
}
