package com.google.android.gms.internal.location;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes5.dex */
public abstract class zzbp<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] zza = null;

    static {
        zza = new Object[0];
    }

    public zzbp() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return zza();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(zza);
    }

    public abstract zzbu<E> zza();

    @NullableDecl
    public Object[] zzb() {
        throw null;
    }

    public int zzc() {
        throw null;
    }

    public int zzd() {
        throw null;
    }

    public zzbs<E> zze() {
        throw null;
    }

    public abstract boolean zzf();

    public int zzg(Object[] r1, int r2) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] r4) {
        r4.getClass();
        int r02 = size();
        int r1 = r4.length;
        if (r1 >= r02) goto L9;
        Object[] r12 = zzb();
        if (r12 != null) goto L8;
        r4 = (T[]) ((Object[]) Array.newInstance(r4.getClass().getComponentType(), r02));
    L11:
        zzg(r4, 0);
        return r4;
    L8:
        return (T[]) Arrays.copyOfRange(r12, zzc(), zzd(), r4.getClass());
    L9:
        if (r1 <= r02) goto L11;
        r4[r02] = null;
        goto L11
    }
}
