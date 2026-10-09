package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* loaded from: classes5.dex */
final class zzbj implements Iterator<String> {
    private Iterator<String> zza;
    private final /* synthetic */ zzbg zzb;

    public zzbj(zzbg r1) {
        this.zzb = r1;
        this.zza = zzbg.zza(r1).keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
