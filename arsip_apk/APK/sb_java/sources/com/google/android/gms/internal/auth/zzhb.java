package com.google.android.gms.internal.auth;

import java.util.ListIterator;

/* loaded from: classes5.dex */
final class zzhb implements ListIterator {
    final ListIterator zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzhd zzc;

    public zzhb(zzhd r1, int r2) {
        this.zzc = r1;
        this.zzb = r2;
        this.zza = zzhd.zza(r1).listIterator(r2);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object r1) {
        String r12 = (String) r1;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zza.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zza.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.zza.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zza.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object r1) {
        String r12 = (String) r1;
        throw new UnsupportedOperationException();
    }
}
