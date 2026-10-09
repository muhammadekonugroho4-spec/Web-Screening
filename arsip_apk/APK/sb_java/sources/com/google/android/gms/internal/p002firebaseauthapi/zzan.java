package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes5.dex */
public abstract class zzan<K, V> implements Serializable, Map<K, V> {
    private transient zzas<Map.Entry<K, V>> zza;
    private transient zzas<K> zzb;
    private transient zzai<V> zzc;

    public zzan() {
    }

    public static <K, V> zzan<K, V> zza(Map<? extends K, ? extends V> r2) {
        if ((r2 instanceof zzan) == true) goto L5;
    L8:
        Set<Map.Entry<? extends K, ? extends V>> r22 = r2.entrySet();
        if ((r22 instanceof Collection) == false) goto L11;
        int r02 = r22.size();
    L12:
        zzaq r1 = new zzaq(r02);
        r1.zza(r22);
        return r1.zza();
    L11:
        r02 = 4;
        goto L12
    L5:
        if ((r2 instanceof SortedMap) == true) goto L8;
        zzan<K, V> r23 = (zzan) r2;
        r23.zzd();
        return r23;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object r1) {
        if (get(r1) == null) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object r2) {
        return ((zzai) values()).contains(r2);
    }

    @Override // java.util.Map
    public /* synthetic */ Set entrySet() {
        zzas<Map.Entry<K, V>> r02 = this.zza;
        if (r02 != null) goto L6;
        zzas<Map.Entry<K, V>> r03 = zzb();
        this.zza = r03;
        return r03;
    L6:
        return r02;
    }

    @Override // java.util.Map
    public boolean equals(Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof Map) == true) goto L8;
        return false;
    L8:
        return entrySet().equals(((Map) r2).entrySet());
    }

    @Override // java.util.Map
    public abstract V get(Object r1);

    @Override // java.util.Map
    public final V getOrDefault(Object r1, V r2) {
        V r12 = get(r1);
        if (r12 == null) goto L5;
        return r12;
    L5:
        return r2;
    }

    @Override // java.util.Map
    public int hashCode() {
        return zzax.zza((zzas) entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Map
    public /* synthetic */ Set keySet() {
        zzas<K> r02 = this.zzb;
        if (r02 != null) goto L6;
        zzas<K> r03 = zzc();
        this.zzb = r03;
        return r03;
    L6:
        return r02;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K r1, V r2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object r1) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int r02 = size();
        zzag.zza(r02, "size");
        StringBuilder r1 = new StringBuilder((int) Math.min(r02 << 3, 1073741824));
        r1.append('{');
        Iterator<Map.Entry<K, V>> r03 = entrySet().iterator();
        boolean r2 = true;
    L4:
        if (r03.hasNext() == false) goto L9;
        Map.Entry<K, V> r3 = r03.next();
        if (r2 == true) goto L8;
        r1.append(", ");
    L8:
        r1.append(r3.getKey());
        r1.append('=');
        r1.append(r3.getValue());
        r2 = false;
        goto L4
    L9:
        r1.append('}');
        return r1.toString();
    }

    @Override // java.util.Map
    public /* synthetic */ Collection values() {
        zzai<V> r02 = this.zzc;
        if (r02 != null) goto L6;
        zzai<V> r03 = zza();
        this.zzc = r03;
        return r03;
    L6:
        return r02;
    }

    public abstract zzai<V> zza();

    public abstract zzas<Map.Entry<K, V>> zzb();

    public abstract zzas<K> zzc();

    public abstract boolean zzd();
}
