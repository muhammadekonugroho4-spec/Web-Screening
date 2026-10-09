package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
abstract class zzd<T> implements Iterator<T> {
    private int zza;
    private T zzb;

    public zzd() {
        this.zza = 2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int r02 = this.zza;
        if (r02 == 4) goto L15;
        int r03 = r02 - 1;
        if (r03 != 0) goto L7;
        return true;
    L7:
        if (r03 == 2) goto L12;
        this.zza = 4;
        this.zzb = zza();
        if (this.zza == 3) goto L12;
        this.zza = 1;
        return true;
    L12:
        return false;
    L15:
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext() == false) goto L7;
        this.zza = 2;
        T r02 = this.zzb;
        this.zzb = null;
        return r02;
    L7:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public abstract T zza();

    public final T zzb() {
        this.zza = 3;
        return null;
    }
}
