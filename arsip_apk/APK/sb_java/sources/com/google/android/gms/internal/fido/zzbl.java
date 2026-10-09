package com.google.android.gms.internal.fido;

import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
final class zzbl extends zzcb {
    boolean zza;
    final /* synthetic */ Object zzb;

    public zzbl(Object r1) {
        this.zzb = r1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zza == true) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza == true) goto L7;
        this.zza = true;
        return this.zzb;
    L7:
        throw new NoSuchElementException();
    }
}
