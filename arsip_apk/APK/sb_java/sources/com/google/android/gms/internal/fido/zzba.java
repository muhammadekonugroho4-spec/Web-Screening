package com.google.android.gms.internal.fido;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class zzba implements Map, Serializable {
    static final Map.Entry[] zza = null;
    private transient zzbc zzb;

    static {
        zza = new Map.Entry[0];
    }

    public zzba() {
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object r1) {
        if (get(r1) == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object r2) {
        return zza().contains(r2);
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Set entrySet() {
        return zzc();
    }

    @Override // java.util.Map
    public final boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof Map) == true) goto L10;
        return false;
    L10:
        return entrySet().equals(((Map) r2).entrySet());
    }

    @Override // java.util.Map
    public abstract Object get(Object r1);

    @Override // java.util.Map
    public final Object getOrDefault(Object r1, Object r2) {
        Object r12 = get(r1);
        if (r12 == null) goto L5;
        return r12;
    L5:
        return r2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzbx.zza(zzc());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (size() != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Set keySet() {
        return zzd();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object r1, Object r2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object r1) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int r02 = size();
        if (r02 < 0) goto L14;
        StringBuilder r2 = new StringBuilder((int) Math.min(r02 * 8, 1073741824));
        r2.append('{');
        Iterator r03 = entrySet().iterator();
        boolean r1 = true;
    L6:
        if (r03.hasNext() == false) goto L11;
        Map.Entry r3 = (Map.Entry) r03.next();
        if (r1 == true) goto L10;
        r2.append(", ");
    L10:
        r2.append(r3.getKey());
        r2.append('=');
        r2.append(r3.getValue());
        r1 = false;
        goto L6
    L11:
        r2.append('}');
        return r2.toString();
    L14:
        throw new IllegalArgumentException("size cannot be negative but was: " + r02);
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Collection values() {
        return zza();
    }

    public zzav zza() {
        throw null;
    }

    public abstract zzbc zzb();

    public final zzbc zzc() {
        zzbc r02 = this.zzb;
        if (r02 != null) goto L6;
        zzbc r03 = zzb();
        this.zzb = r03;
        return r03;
    L6:
        return r02;
    }

    public zzbc zzd() {
        throw null;
    }
}
