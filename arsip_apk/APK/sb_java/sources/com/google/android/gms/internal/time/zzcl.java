package com.google.android.gms.internal.time;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;

/* loaded from: classes5.dex */
public abstract class zzcl extends AbstractCollection implements Serializable {
    private static final Object[] zza = null;

    static {
        zza = new Object[0];
    }

    public zzcl() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(Object r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return zze();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(zza);
    }

    public int zza(Object[] r1, int r2) {
        throw null;
    }

    public int zzb() {
        throw null;
    }

    public int zzc() {
        throw null;
    }

    public zzco zzd() {
        throw null;
    }

    public abstract zzcq zze();

    public abstract boolean zzf();

    public Object[] zzg() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] r5) {
        r5.getClass();
        int r02 = size();
        int r1 = r5.length;
        if (r1 >= r02) goto L11;
        Object[] r3 = zzg();
        if (r3 != null) goto L10;
        if (r1 == 0) goto L8;
        r5 = Arrays.copyOf(r5, 0);
    L8:
        r5 = Arrays.copyOf(r5, r02);
    L13:
        zza(r5, 0);
        return r5;
    L10:
        return Arrays.copyOfRange(r3, zzc(), zzb(), r5.getClass());
    L11:
        if (r1 <= r02) goto L13;
        r5[r02] = null;
        goto L13
    }
}
