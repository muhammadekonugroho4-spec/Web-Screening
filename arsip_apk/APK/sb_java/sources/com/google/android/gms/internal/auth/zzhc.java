package com.google.android.gms.internal.auth;

import java.util.Iterator;

/* loaded from: classes5.dex */
final class zzhc implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzhd zzb;

    public zzhc(zzhd r1) {
        this.zzb = r1;
        this.zza = zzhd.zza(r1).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
