package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
abstract class zzad<E> extends zzaz<E> {
    private final int zza;
    private int zzb;

    public zzad(int r1, int r2) {
        zzw.zzb(r2, r1);
        this.zza = r1;
        this.zzb = r2;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.zzb >= this.zza) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.zzb <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext() == false) goto L7;
        int r02 = this.zzb;
        this.zzb = r02 + 1;
        return zza(r02);
    L7:
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zzb;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious() == false) goto L7;
        int r02 = this.zzb - 1;
        this.zzb = r02;
        return zza(r02);
    L7:
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zzb - 1;
    }

    public abstract E zza(int r1);
}
