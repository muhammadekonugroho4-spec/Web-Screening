package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* loaded from: classes5.dex */
final class zzjo implements Iterator {
    boolean zza;
    final /* synthetic */ Iterator zzb;

    public zzjo(zzjp r1, Iterator r2) {
        this.zzb = r2;
        this.zza = true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object r02 = this.zzb.next();
        this.zza = false;
        return r02;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzjf.zze(!this.zza, "no calls to next() since the last call to remove()");
        this.zzb.remove();
    }
}
