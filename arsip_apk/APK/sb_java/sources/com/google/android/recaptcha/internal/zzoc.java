package com.google.android.recaptcha.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class zzoc extends LinkedHashMap {
    private static final zzoc zza = null;
    private boolean zzb;

    static {
        zzoc r02 = new zzoc();
        zza = r02;
        r02.zzb = false;
    }

    private zzoc() {
        this.zzb = true;
    }

    public static zzoc zza() {
        return zza;
    }

    private static int zzf(Object r2) {
        if ((r2 instanceof byte[]) == false) goto L9;
        byte[] r22 = (byte[]) r2;
        byte[] r02 = zznl.zzb;
        int r03 = r22.length;
        int r23 = zznl.zzb(r03, r22, 0, r03);
        if (r23 != 0) goto L14;
        return 1;
    L14:
        return r23;
    L9:
        if ((r2 instanceof zznf) == true) goto L13;
        return r2.hashCode();
    L13:
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
    public final Object put(Object r2, Object r3) {
        zzg();
        byte[] r02 = zznl.zzb;
        r2.getClass();
        r3.getClass();
        return super.put(r2, r3);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map r4) {
        zzg();
        Iterator r02 = r4.keySet().iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        Object r1 = r02.next();
        byte[] r2 = zznl.zzb;
        r1.getClass();
        r4.get(r1).getClass();
        goto L4
    L6:
        super.putAll(r4);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object r1) {
        zzg();
        return super.remove(r1);
    }

    public final zzoc zzb() {
        if (isEmpty() == false) goto L7;
        return new zzoc();
    L7:
        return new zzoc(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final void zzd(zzoc r2) {
        zzg();
        if (r2.isEmpty() == true) goto L6;
        putAll(r2);
        return;
    }

    public final boolean zze() {
        return this.zzb;
    }

    private zzoc(Map r1) {
        super(r1);
        this.zzb = true;
    }
}
