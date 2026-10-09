package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
final class zzamk implements Iterator {
    private int zza;
    private boolean zzb;
    private Iterator zzc;
    private final /* synthetic */ zzamh zzd;

    public /* synthetic */ zzamk(zzamh r1, zzamm r2) {
        this(r1);
    }

    private final Iterator zza() {
        if (this.zzc != null) goto L6;
        this.zzc = zzamh.zzb(this.zzd).entrySet().iterator();
    L6:
        return this.zzc;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if ((this.zza + 1) >= zzamh.zza(this.zzd)) goto L5;
    L11:
        return true;
    L5:
        if (zzamh.zzb(this.zzd).isEmpty() == false) goto L7;
        return false;
    L7:
        if (zza().hasNext() == true) goto L11;
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.zzb = true;
        int r1 = this.zza + 1;
        this.zza = r1;
        if (r1 >= zzamh.zza(this.zzd)) goto L7;
        return (zzaml) zzamh.zze(this.zzd)[this.zza];
    L7:
        return (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.zzb == false) goto L11;
        this.zzb = false;
        zzamh.zzd(this.zzd);
        if (this.zza >= zzamh.zza(this.zzd)) goto L8;
        zzamh r02 = this.zzd;
        int r1 = this.zza;
        this.zza = r1 - 1;
        zzamh.zza(r02, r1);
        return;
    L8:
        zza().remove();
        return;
    L11:
        throw new IllegalStateException("remove() was called before next()");
    }

    private zzamk(zzamh r1) {
        this.zzd = r1;
        this.zza = -1;
    }
}
