package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class zzjl extends zzjm implements Collection {
    public zzjl() {
    }

    public boolean add(Object r2) {
        return zzc().add(r2);
    }

    public boolean addAll(Collection r2) {
        return zzc().addAll(r2);
    }

    @Override // java.util.Collection
    public final void clear() {
        zzc().clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object r2) {
        return zzc().contains(r2);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection r2) {
        return zzc().containsAll(r2);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return zzc().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return zzc().iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object r2) {
        return zzc().remove(r2);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection r2) {
        return zzc().removeAll(r2);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection r2) {
        return zzc().retainAll(r2);
    }

    @Override // java.util.Collection
    public final int size() {
        return zzc().size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return zzc().toArray();
    }

    @Override // com.google.android.recaptcha.internal.zzjm
    public /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }

    public abstract Collection zzc();

    @Override // java.util.Collection
    public final Object[] toArray(Object[] r2) {
        return zzc().toArray(r2);
    }
}
