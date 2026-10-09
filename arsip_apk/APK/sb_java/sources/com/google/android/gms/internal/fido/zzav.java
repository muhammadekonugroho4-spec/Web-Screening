package com.google.android.gms.internal.fido;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class zzav extends AbstractCollection implements Serializable {
    private static final Object[] zzl = null;

    static {
        zzl = new Object[0];
    }

    public zzav() {
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

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object r1);

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return zzd();
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

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(zzl);
    }

    public int zza(Object[] r4, int r5) {
        zzcb r52 = zzd();
        int r02 = 0;
    L4:
        if (r52.hasNext() == false) goto L6;
        r4[r02] = r52.next();
        r02 = r02 + 1;
        goto L4
    L6:
        return r02;
    }

    public int zzb() {
        throw new UnsupportedOperationException();
    }

    public int zzc() {
        throw new UnsupportedOperationException();
    }

    public abstract zzcb zzd();

    public Object[] zze() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] r5) {
        r5.getClass();
        int r02 = size();
        int r1 = r5.length;
        if (r1 >= r02) goto L11;
        Object[] r3 = zze();
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
