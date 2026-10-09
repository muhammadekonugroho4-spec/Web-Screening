package com.google.android.gms.internal.location;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes5.dex */
public abstract class zzbs<E> extends zzbp<E> implements List<E>, RandomAccess {
    private static final zzbv<Object> zza = null;

    static {
        zza = new zzbq(zzbt.zza, 0);
    }

    public zzbs() {
    }

    public static <E> zzbs<E> zzi() {
        return (zzbs<E>) zzbt.zza;
    }

    public static <E> zzbs<E> zzj(Collection<? extends E> r3) {
        if ((r3 instanceof zzbp) == false) goto L8;
        zzbs<E> r32 = ((zzbp) r3).zze();
        if (r32.zzf() == false) goto L19;
        Object[] r33 = r32.toArray();
        return zzk(r33, r33.length);
    L19:
        return r32;
    L8:
        Object[] r34 = r3.toArray();
        int r02 = r34.length;
        int r1 = 0;
    L9:
        if (r1 >= r02) goto L16;
        if (r34[r1] == null) goto L13;
        r1 = r1 + 1;
        goto L9
    L13:
        StringBuilder r03 = new StringBuilder(20);
        r03.append("at index ");
        r03.append(r1);
        throw new NullPointerException(r03.toString());
    L16:
        return zzk(r34, r02);
    }

    public static <E> zzbs<E> zzk(Object[] r1, int r2) {
        if (r2 != 0) goto L6;
        return (zzbs<E>) zzbt.zza;
    L6:
        return new zzbt(r1, r2);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int r1, E r2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int r1, Collection<? extends E> r2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(@NullableDecl Object r1) {
        if (indexOf(r1) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@NullableDecl Object r7) {
        if (r7 != this) goto L6;
        return true;
    L6:
        if ((r7 instanceof List) == true) goto L8;
        return false;
    L8:
        List r72 = (List) r7;
        int r1 = size();
        if (r1 == r72.size()) goto L12;
        return false;
    L12:
        if ((r72 instanceof RandomAccess) == false) goto L20;
        int r3 = 0;
    L14:
        if (r3 >= r1) goto L19;
        if (zzbl.zza(get(r3), r72.get(r3)) == false) goto L17;
        r3 = r3 + 1;
        goto L14
    L17:
        return false;
    L19:
        return true;
    L20:
        Iterator<E> r12 = iterator();
        Iterator<E> r73 = r72.iterator();
    L22:
        if (r12.hasNext() == false) goto L30;
        if (r73.hasNext() == false) goto L25;
        if (zzbl.zza(r12.next(), r73.next()) == true) goto L22;
        return false;
    L25:
        return false;
    L30:
        if (r73.hasNext() == true) goto L32;
        return true;
    L32:
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int r02 = size();
        int r1 = 1;
        int r2 = 0;
    L3:
        if (r2 >= r02) goto L5;
        r1 = (r1 * 31) + get(r2).hashCode();
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }

    @Override // java.util.List
    public final int indexOf(@NullableDecl Object r5) {
        if (r5 != null) goto L5;
        return -1;
    L5:
        int r1 = size();
        int r2 = 0;
    L6:
        if (r2 >= r1) goto L11;
        if (r5.equals(get(r2)) == true) goto L9;
        r2 = r2 + 1;
        goto L6
    L9:
        return r2;
    L11:
        return -1;
    }

    @Override // com.google.android.gms.internal.location.zzbp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return zzl(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@NullableDecl Object r4) {
        if (r4 != null) goto L5;
        return -1;
    L5:
        int r1 = size() - 1;
    L6:
        if (r1 < 0) goto L11;
        if (r4.equals(get(r1)) == true) goto L9;
        r1 = r1 - 1;
        goto L6
    L9:
        return r1;
    L11:
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return zzl(0);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int r1, E r2) {
        throw new UnsupportedOperationException();
    }

    public /* bridge */ /* synthetic */ List subList(int r1, int r2) {
        return zzh(r1, r2);
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final zzbu<E> zza() {
        return zzl(0);
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public final zzbs<E> zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    public int zzg(Object[] r3, int r4) {
        int r42 = size();
        int r02 = 0;
    L3:
        if (r02 >= r42) goto L5;
        r3[r02] = get(r02);
        r02 = r02 + 1;
        goto L3
    L5:
        return r42;
    }

    public zzbs<E> zzh(int r2, int r3) {
        zzbm.zzc(r2, r3, size());
        int r32 = r3 - r2;
        if (r32 != size()) goto L5;
        return this;
    L5:
        if (r32 != 0) goto L9;
        return (zzbs<E>) zzbt.zza;
    L9:
        return new zzbr(this, r2, r32);
    }

    public final zzbv<E> zzl(int r3) {
        zzbm.zzb(r3, size(), FirebaseAnalytics.Param.INDEX);
        if (isEmpty() == false) goto L7;
        return (zzbv<E>) zza;
    L7:
        return new zzbq(this, r3);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int r1) {
        return zzl(r1);
    }
}
