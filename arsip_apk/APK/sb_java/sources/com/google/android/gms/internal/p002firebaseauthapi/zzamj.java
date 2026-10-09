package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
final class zzamj implements Iterator {
    private int zza;
    private Iterator zzb;
    private final /* synthetic */ zzamh zzc;

    public /* synthetic */ zzamj(zzamh r1, zzamm r2) {
        this(r1);
    }

    private final Iterator zza() {
        if (this.zzb != null) goto L6;
        this.zzb = zzamh.zzc(this.zzc).entrySet().iterator();
    L6:
        return this.zzb;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int r02 = this.zza;
        if (r02 <= 0) goto L7;
        if (r02 > zzamh.zza(this.zzc)) goto L7;
        return true;
    L7:
        if (zza().hasNext() == true) goto L12;
        return false;
    L12:
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (zza().hasNext() == true) goto L5;
        Object[] r02 = zzamh.zze(this.zzc);
        int r1 = this.zza - 1;
        this.zza = r1;
        return (zzaml) r02[r1];
    L5:
        return (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private zzamj(zzamh r1) {
        this.zzc = r1;
        this.zza = zzamh.zza(r1);
    }
}
