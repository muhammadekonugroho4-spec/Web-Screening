package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
class zzamn extends AbstractSet {
    private final /* synthetic */ zzamh zza;

    public /* synthetic */ zzamn(zzamh r1, zzamm r2) {
        this(r1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* synthetic */ boolean add(Object r3) {
        Map.Entry r32 = (Map.Entry) r3;
        if (contains(r32) == true) goto L6;
        this.zza.zza((Comparable) r32.getKey(), r32.getValue());
        return true;
    L6:
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object r3) {
        Map.Entry r32 = (Map.Entry) r3;
        Object r02 = this.zza.get(r32.getKey());
        Object r33 = r32.getValue();
        if (r02 == r33) goto L10;
        if (r02 != null) goto L6;
        return false;
    L6:
        if (r02.equals(r33) == true) goto L13;
        return false;
    L13:
        return true;
    L10:
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new zzamk(this.zza, null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object r2) {
        Map.Entry r22 = (Map.Entry) r2;
        if (contains(r22) == false) goto L6;
        this.zza.remove(r22.getKey());
        return true;
    L6:
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.zza.size();
    }

    private zzamn(zzamh r1) {
        this.zza = r1;
    }
}
