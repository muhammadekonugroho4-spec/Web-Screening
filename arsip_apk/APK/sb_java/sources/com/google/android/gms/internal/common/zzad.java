package com.google.android.gms.internal.common;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
abstract class zzad extends zzao {
    private final int zza;
    private int zzb;

    public zzad(int r2, int r3) {
        zzv.zzb(r3, r2, FirebaseAnalytics.Param.INDEX);
        this.zza = r2;
        this.zzb = r3;
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
    public final Object next() {
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
    public final Object previous() {
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

    public abstract Object zza(int r1);
}
