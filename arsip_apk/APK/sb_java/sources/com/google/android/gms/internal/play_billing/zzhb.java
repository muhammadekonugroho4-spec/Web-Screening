package com.google.android.gms.internal.play_billing;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzhb extends AbstractSet {
    final /* synthetic */ zzhd zza;

    public /* synthetic */ zzhb(zzhd r1, zzhc r2) {
        Objects.requireNonNull(r1);
        this.zza = r1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object r3) {
        Map.Entry r32 = (Map.Entry) r3;
        if (contains(r32) == true) goto L6;
        this.zza.zzf((Comparable) r32.getKey(), r32.getValue());
        return true;
    L6:
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object r4) {
        Map.Entry r42 = (Map.Entry) r4;
        Object r02 = r42.getKey();
        Object r03 = this.zza.get(r02);
        Object r43 = r42.getValue();
        if (r03 != r43) goto L5;
        return true;
    L5:
        if (r03 != null) goto L7;
    L9:
        return false;
    L7:
        if (r03.equals(r43) == false) goto L9;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzha(this.zza, null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object r2) {
        Map.Entry r22 = (Map.Entry) r2;
        if (contains(r22) == false) goto L6;
        this.zza.remove(r22.getKey());
        return true;
    L6:
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
