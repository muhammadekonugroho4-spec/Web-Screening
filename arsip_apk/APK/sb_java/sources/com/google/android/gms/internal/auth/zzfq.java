package com.google.android.gms.internal.auth;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class zzfq extends LinkedHashMap {
    private static final zzfq zza = null;
    private boolean zzb;

    static {
        zzfq r02 = new zzfq();
        zza = r02;
        r02.zzb = false;
    }

    private zzfq() {
        this.zzb = true;
    }

    public static zzfq zza() {
        return zza;
    }

    private static int zzf(Object r1) {
        if ((r1 instanceof byte[]) == false) goto L7;
        return zzez.zzb((byte[]) r1);
    L7:
        if ((r1 instanceof zzew) == true) goto L11;
        return r1.hashCode();
    L11:
        throw new UnsupportedOperationException();
    }

    private final void zzg() {
        if (this.zzb == false) goto L6;
        return;
    L6:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzg();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (isEmpty() == false) goto L7;
        return Collections.EMPTY_SET;
    L7:
        return super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object r5) {
        if ((r5 instanceof Map) == false) goto L25;
        Map r52 = (Map) r5;
        if (this != r52) goto L8;
        return true;
    L8:
        if (size() != r52.size()) goto L34;
        Iterator r02 = entrySet().iterator();
    L12:
        if (r02.hasNext() == false) goto L33;
        Map.Entry r1 = (Map.Entry) r02.next();
        if (r52.containsKey(r1.getKey()) == false) goto L36;
        Object r2 = r1.getValue();
        Object r12 = r52.get(r1.getKey());
        if ((r2 instanceof byte[]) == true) goto L18;
    L20:
        boolean r13 = r2.equals(r12);
    L21:
        if (r13 == true) goto L12;
        return false;
    L18:
        if ((r12 instanceof byte[]) == false) goto L20;
        r13 = Arrays.equals((byte[]) r2, (byte[]) r12);
        goto L21
    L36:
        return false;
    L33:
        return true;
    L34:
        return false;
    L25:
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator r02 = entrySet().iterator();
        int r1 = 0;
    L4:
        if (r02.hasNext() == false) goto L6;
        Map.Entry r2 = (Map.Entry) r02.next();
        int r3 = zzf(r2.getKey());
        r1 = r1 + (zzf(r2.getValue()) ^ r3);
        goto L4
    L6:
        return r1;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object r1, Object r2) {
        zzg();
        zzez.zze(r1);
        zzez.zze(r2);
        return super.put(r1, r2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map r3) {
        zzg();
        Iterator r02 = r3.keySet().iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        Object r1 = r02.next();
        zzez.zze(r1);
        zzez.zze(r3.get(r1));
        goto L4
    L6:
        super.putAll(r3);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object r1) {
        zzg();
        return super.remove(r1);
    }

    public final zzfq zzb() {
        if (isEmpty() == false) goto L7;
        return new zzfq();
    L7:
        return new zzfq(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final void zzd(zzfq r2) {
        zzg();
        if (r2.isEmpty() == true) goto L6;
        putAll(r2);
        return;
    }

    public final boolean zze() {
        return this.zzb;
    }

    private zzfq(Map r1) {
        super(r1);
        this.zzb = true;
    }
}
