package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class zzlg<K, V> extends LinkedHashMap<K, V> {
    private static final zzlg<?, ?> zza = null;
    private boolean zzb;

    static {
        zzlg<?, ?> r02 = new zzlg();
        zza = r02;
        ((zzlg) r02).zzb = false;
    }

    private zzlg() {
        this.zzb = true;
    }

    private static int zza(Object r1) {
        if ((r1 instanceof byte[]) == false) goto L7;
        return zzkj.zza((byte[]) r1);
    L7:
        if ((r1 instanceof zzki) == true) goto L11;
        return r1.hashCode();
    L11:
        throw new UnsupportedOperationException();
    }

    private final void zze() {
        if (this.zzb == false) goto L6;
        return;
    L6:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zze();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (isEmpty() == false) goto L7;
        return Collections.EMPTY_SET;
    L7:
        return super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object r7) {
        if ((r7 instanceof Map) == false) goto L26;
        Map r72 = (Map) r7;
        if (this != r72) goto L7;
    L23:
        boolean r73 = true;
    L24:
        if (r73 == false) goto L26;
        return true;
    L7:
        if (size() == r72.size()) goto L9;
    L8:
        r73 = false;
        goto L24
    L9:
        Iterator<Map.Entry<K, V>> r2 = entrySet().iterator();
    L11:
        if (r2.hasNext() == false) goto L23;
        Map.Entry<K, V> r3 = r2.next();
        if (r72.containsKey(r3.getKey()) == false) goto L8;
        V r4 = r3.getValue();
        Object r32 = r72.get(r3.getKey());
        if ((r4 instanceof byte[]) == true) goto L18;
    L20:
        boolean r33 = r4.equals(r32);
    L21:
        if (r33 == true) goto L11;
    L18:
        if ((r32 instanceof byte[]) == false) goto L20;
        r33 = Arrays.equals((byte[]) r4, (byte[]) r32);
    L26:
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator<Map.Entry<K, V>> r02 = entrySet().iterator();
        int r1 = 0;
    L4:
        if (r02.hasNext() == false) goto L6;
        Map.Entry<K, V> r2 = r02.next();
        int r3 = zza(r2.getKey());
        r1 = r1 + (zza(r2.getValue()) ^ r3);
        goto L4
    L6:
        return r1;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K r1, V r2) {
        zze();
        zzkj.zza(r1);
        zzkj.zza(r2);
        return (V) super.put(r1, r2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> r3) {
        zze();
        Iterator<? extends K> r02 = r3.keySet().iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        K r1 = r02.next();
        zzkj.zza(r1);
        zzkj.zza(r3.get(r1));
        goto L4
    L6:
        super.putAll(r3);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object r1) {
        zze();
        return (V) super.remove(r1);
    }

    public final zzlg<K, V> zzb() {
        if (isEmpty() == false) goto L7;
        return new zzlg();
    L7:
        return new zzlg(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final boolean zzd() {
        return this.zzb;
    }

    private zzlg(Map<K, V> r1) {
        super(r1);
        this.zzb = true;
    }

    public static <K, V> zzlg<K, V> zza() {
        return (zzlg<K, V>) zza;
    }

    public final void zza(zzlg<K, V> r2) {
        zze();
        if (r2.isEmpty() == true) goto L6;
        putAll(r2);
        return;
    }
}
