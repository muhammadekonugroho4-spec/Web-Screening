package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
abstract class zzaiq<E> extends AbstractList<E> implements zzakn<E> {
    private boolean zza;

    public zzaiq(boolean r1) {
        this.zza = r1;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int r1, E r2) {
        zza();
        super.add(r1, r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> r1) {
        zza();
        return super.addAll(r1);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        zza();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object r7) {
        if (r7 != this) goto L6;
        return true;
    L6:
        if ((r7 instanceof List) == true) goto L9;
        return false;
    L9:
        if ((r7 instanceof RandomAccess) == false) goto L11;
        List r72 = (List) r7;
        int r1 = size();
        if (r1 == r72.size()) goto L15;
        return false;
    L15:
        int r3 = 0;
    L16:
        if (r3 >= r1) goto L21;
        if (get(r3).equals(r72.get(r3)) == false) goto L19;
        r3 = r3 + 1;
        goto L16
    L19:
        return false;
    L21:
        return true;
    L11:
        return super.equals(r7);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
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

    @Override // java.util.AbstractList, java.util.List
    public E remove(int r1) {
        zza();
        return (E) super.remove(r1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> r1) {
        zza();
        return super.removeAll(r1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> r1) {
        zza();
        return super.retainAll(r1);
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int r1, E r2) {
        zza();
        return (E) super.set(r1, r2);
    }

    public final void zza() {
        if (this.zza == false) goto L6;
        return;
    L6:
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
    public final void zzb() {
        if (this.zza == false) goto L6;
        this.zza = false;
        return;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
    public final boolean zzc() {
        return this.zza;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E r1) {
        zza();
        return super.add(r1);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int r1, Collection<? extends E> r2) {
        zza();
        return super.addAll(r1, r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object r2) {
        zza();
        int r22 = indexOf(r2);
        if (r22 != (-1)) goto L6;
        return false;
    L6:
        remove(r22);
        return true;
    }
}
