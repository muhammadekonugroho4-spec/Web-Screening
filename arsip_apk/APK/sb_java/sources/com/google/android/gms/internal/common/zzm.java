package com.google.android.gms.internal.common;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
abstract class zzm implements Iterator {
    private Object zza;
    private int zzb;

    public zzm() {
        this.zzb = 2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int r02 = this.zzb;
        if (r02 == 4) goto L19;
        int r2 = r02 - 1;
        if (r02 == 0) goto L17;
        if (r2 != 0) goto L9;
        return true;
    L9:
        if (r2 == 2) goto L14;
        this.zzb = 4;
        this.zza = zza();
        if (this.zzb == 3) goto L14;
        this.zzb = 1;
        return true;
    L14:
        return false;
    L17:
        throw null;
    L19:
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext() == false) goto L7;
        this.zzb = 2;
        Object r02 = this.zza;
        this.zza = null;
        return r02;
    L7:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public abstract Object zza();

    public final Object zzb() {
        this.zzb = 3;
        return null;
    }
}
