package com.google.android.gms.internal.time;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
public abstract class zzco extends zzcl implements List, RandomAccess {
    private static final zzcr zza = null;

    static {
        zza = new zzcm(zzcp.zza, 0);
    }

    public zzco() {
    }

    public static zzco zzi(Object[] r1, int r2) {
        if (r2 != 0) goto L6;
        return zzcp.zza;
    L6:
        return new zzcp(r1, r2);
    }

    public static zzco zzj(Collection r3) {
        if ((r3 instanceof zzcl) == false) goto L8;
        zzco r32 = ((zzcl) r3).zzd();
        if (r32.zzf() == false) goto L19;
        Object[] r33 = r32.toArray();
        return zzi(r33, r33.length);
    L19:
        return r32;
    L8:
        Object[] r34 = r3.toArray();
        int r02 = r34.length;
        int r1 = 0;
    L9:
        if (r1 >= r02) goto L16;
        if (r34[r1] == null) goto L14;
        r1 = r1 + 1;
        goto L9
    L14:
        throw new NullPointerException("at index " + r1);
    L16:
        return zzi(r34, r34.length);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int r1, Object r2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int r1, Collection r2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object r1) {
        if (indexOf(r1) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object r7) {
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
        if (zzch.zza(get(r3), r72.get(r3)) == false) goto L17;
        r3 = r3 + 1;
        goto L14
    L17:
        return false;
    L19:
        return true;
    L20:
        Iterator r12 = iterator();
        Iterator r73 = r72.iterator();
    L22:
        if (r12.hasNext() == false) goto L30;
        if (r73.hasNext() == false) goto L25;
        if (zzch.zza(r12.next(), r73.next()) == true) goto L22;
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
        int r1 = 0;
        int r2 = 1;
    L3:
        if (r1 >= r02) goto L5;
        r2 = (r2 * 31) + get(r1).hashCode();
        r1 = r1 + 1;
        goto L3
    L5:
        return r2;
    }

    @Override // java.util.List
    public final int indexOf(Object r5) {
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

    @Override // com.google.android.gms.internal.time.zzcl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzk(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object r4) {
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
    public final /* synthetic */ ListIterator listIterator() {
        return zzk(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int r1, Object r2) {
        throw new UnsupportedOperationException();
    }

    public /* bridge */ /* synthetic */ List subList(int r1, int r2) {
        return zzh(r1, r2);
    }

    @Override // com.google.android.gms.internal.time.zzcl
    public int zza(Object[] r3, int r4) {
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

    @Override // com.google.android.gms.internal.time.zzcl
    @Deprecated
    public final zzco zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.time.zzcl
    public final zzcq zze() {
        return zzk(0);
    }

    public zzco zzh(int r2, int r3) {
        zzci.zzc(r2, r3, size());
        int r32 = r3 - r2;
        if (r32 != size()) goto L5;
        return this;
    L5:
        if (r32 != 0) goto L9;
        return zzcp.zza;
    L9:
        return new zzcn(this, r2, r32);
    }

    public final zzcr zzk(int r3) {
        zzci.zzb(r3, size(), FirebaseAnalytics.Param.INDEX);
        if (isEmpty() == false) goto L7;
        return zza;
    L7:
        return new zzcm(this, r3);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int r1) {
        return zzk(r1);
    }
}
