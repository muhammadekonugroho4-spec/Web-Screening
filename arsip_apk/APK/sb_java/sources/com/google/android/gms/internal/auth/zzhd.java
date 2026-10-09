package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
public final class zzhd extends AbstractList implements RandomAccess, zzfe {
    private final zzfe zza;

    public zzhd(zzfe r1) {
        this.zza = r1;
    }

    public static /* bridge */ /* synthetic */ zzfe zza(zzhd r02) {
        return r02.zza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int r2) {
        return ((zzfd) this.zza).zzf(r2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzhc(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int r2) {
        return new zzhb(this, r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.auth.zzfe
    public final zzfe zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.auth.zzfe
    public final List zzg() {
        return this.zza.zzg();
    }
}
