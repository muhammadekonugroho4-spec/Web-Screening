package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzha implements Iterator {
    final /* synthetic */ zzhd zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzha(zzhd r1, zzhc r2) {
        Objects.requireNonNull(r1);
        this.zza = r1;
        this.zzb = -1;
    }

    private final Iterator zza() {
        if (this.zzd != null) goto L6;
        this.zzd = zzhd.zzh(this.zza).entrySet().iterator();
    L6:
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int r02 = this.zzb + 1;
        zzhd r2 = this.zza;
        if (r02 >= zzhd.zzb(r2)) goto L5;
        return true;
    L5:
        if (zzhd.zzh(r2).isEmpty() == false) goto L7;
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
        zzhd r02 = this.zza;
        if (r1 >= zzhd.zzb(r02)) goto L7;
        return (zzgz) zzhd.zzk(r02)[r1];
    L7:
        return (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.zzc == false) goto L11;
        this.zzc = false;
        zzhd r02 = this.zza;
        zzhd.zzi(r02);
        int r1 = this.zzb;
        if (r1 >= zzhd.zzb(r02)) goto L8;
        this.zzb = r1 - 1;
        zzhd.zze(r02, r1);
        return;
    L8:
        zza().remove();
        return;
    L11:
        throw new IllegalStateException("remove() was called before next()");
    }
}
