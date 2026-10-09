package com.google.android.gms.internal.auth;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes5.dex */
class zzgu extends AbstractMap {
    private final int zza;
    private List zzb;
    private Map zzc;
    private boolean zzd;
    private volatile zzgs zze;
    private Map zzf;

    public /* synthetic */ zzgu(int r1, zzgt r2) {
        this.zza = r1;
        this.zzb = Collections.EMPTY_LIST;
        Map r12 = Collections.EMPTY_MAP;
        this.zzc = r12;
        this.zzf = r12;
    }

    public static /* bridge */ /* synthetic */ Object zzd(zzgu r02, int r1) {
        return r02.zzl(r1);
    }

    public static /* bridge */ /* synthetic */ List zzf(zzgu r02) {
        return r02.zzb;
    }

    public static /* bridge */ /* synthetic */ Map zzh(zzgu r02) {
        return r02.zzc;
    }

    public static /* bridge */ /* synthetic */ void zzi(zzgu r02) {
        r02.zzn();
    }

    private final int zzk(Comparable r5) {
        int r02 = this.zzb.size();
        int r1 = r02 - 1;
        int r2 = 0;
        if (r1 < 0) goto L11;
        int r3 = r5.compareTo(((zzgo) this.zzb.get(r1)).zza());
        if (r3 > 0) goto L7;
        if (r3 != 0) goto L11;
        return r1;
    L7:
        return -(r02 + 1);
    L11:
        if (r2 > r1) goto L19;
        int r03 = (r2 + r1) / 2;
        int r32 = r5.compareTo(((zzgo) this.zzb.get(r03)).zza());
        if (r32 < 0) goto L14;
        if (r32 <= 0) goto L17;
        r2 = r03 + 1;
        goto L11
    L17:
        return r03;
    L14:
        r1 = r03 - 1;
        goto L11
    L19:
        return -(r2 + 1);
    }

    private final Object zzl(int r6) {
        zzn();
        Object r62 = ((zzgo) this.zzb.remove(r6)).getValue();
        if (this.zzc.isEmpty() == true) goto L5;
        Iterator r02 = zzm().entrySet().iterator();
        List r1 = this.zzb;
        Map.Entry r3 = (Map.Entry) r02.next();
        r1.add(new zzgo(this, (Comparable) r3.getKey(), r3.getValue()));
        r02.remove();
    L5:
        return r62;
    }

    private final SortedMap zzm() {
        zzn();
        if (this.zzc.isEmpty() == false) goto L8;
        if ((this.zzc instanceof TreeMap) == true) goto L8;
        TreeMap r02 = new TreeMap();
        this.zzc = r02;
        this.zzf = r02.descendingMap();
    L8:
        return (SortedMap) this.zzc;
    }

    private final void zzn() {
        if (this.zzd == true) goto L6;
        return;
    L6:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzn();
        if (this.zzb.isEmpty() == true) goto L6;
        this.zzb.clear();
    L6:
        if (this.zzc.isEmpty() == true) goto L9;
        this.zzc.clear();
        return;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object r2) {
        Comparable r22 = (Comparable) r2;
        if (zzk(r22) < 0) goto L5;
        return true;
    L5:
        if (this.zzc.containsKey(r22) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.zze != null) goto L6;
        this.zze = new zzgs(this, null);
    L6:
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof zzgu) == false) goto L8;
        zzgu r82 = (zzgu) r8;
        int r1 = size();
        if (r1 == r82.size()) goto L12;
        return false;
    L12:
        int r2 = zzb();
        if (r2 != r82.zzb()) goto L25;
        int r4 = 0;
    L15:
        if (r4 >= r2) goto L20;
        if (zzg(r4).equals(r82.zzg(r4)) == false) goto L18;
        r4 = r4 + 1;
        goto L15
    L18:
        return false;
    L20:
        if (r2 != r1) goto L22;
        return true;
    L22:
        return this.zzc.equals(r82.zzc);
    L25:
        return entrySet().equals(r82.entrySet());
    L8:
        return super.equals(r8);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object r2) {
        Comparable r22 = (Comparable) r2;
        int r02 = zzk(r22);
        if (r02 < 0) goto L7;
        return ((zzgo) this.zzb.get(r02)).getValue();
    L7:
        return this.zzc.get(r22);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int r02 = zzb();
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r02) goto L6;
        r2 = r2 + ((zzgo) this.zzb.get(r1)).hashCode();
        r1 = r1 + 1;
        goto L3
    L6:
        if (this.zzc.size() > 0) goto L8;
        return r2;
    L8:
        return r2 + this.zzc.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object r1, Object r2) {
        return zze((Comparable) r1, r2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object r2) {
        zzn();
        Comparable r22 = (Comparable) r2;
        int r02 = zzk(r22);
        if (r02 < 0) goto L7;
        return zzl(r02);
    L7:
        if (this.zzc.isEmpty() == false) goto L11;
        return null;
    L11:
        return this.zzc.remove(r22);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb.size() + this.zzc.size();
    }

    public void zza() {
        if (this.zzd == false) goto L5;
        return;
    L5:
        if (this.zzc.isEmpty() == false) goto L7;
        Map r02 = Collections.EMPTY_MAP;
    L8:
        this.zzc = r02;
        if (this.zzf.isEmpty() == false) goto L11;
        Map r03 = Collections.EMPTY_MAP;
    L12:
        this.zzf = r03;
        this.zzd = true;
        return;
    L11:
        r03 = Collections.unmodifiableMap(this.zzf);
        goto L12
    L7:
        r02 = Collections.unmodifiableMap(this.zzc);
        goto L8
    }

    public final int zzb() {
        return this.zzb.size();
    }

    public final Iterable zzc() {
        if (this.zzc.isEmpty() == false) goto L7;
        return zzgn.zza();
    L7:
        return this.zzc.entrySet();
    }

    public final Object zze(Comparable r5, Object r6) {
        zzn();
        int r02 = zzk(r5);
        if (r02 >= 0) goto L5;
        zzn();
        if (this.zzb.isEmpty() == true) goto L9;
    L11:
        int r03 = -(r02 + 1);
        if (r03 >= this.zza) goto L14;
        int r1 = this.zzb.size();
        int r2 = this.zza;
        if (r1 != r2) goto L18;
        zzgo r12 = (zzgo) this.zzb.remove(r2 - 1);
        zzm().put(r12.zza(), r12.getValue());
    L18:
        this.zzb.add(r03, new zzgo(this, r5, r6));
        return null;
    L14:
        return zzm().put(r5, r6);
    L9:
        if ((this.zzb instanceof ArrayList) == true) goto L11;
        this.zzb = new ArrayList(this.zza);
        goto L11
    L5:
        return ((zzgo) this.zzb.get(r02)).setValue(r6);
    }

    public final Map.Entry zzg(int r2) {
        return (Map.Entry) this.zzb.get(r2);
    }

    public final boolean zzj() {
        return this.zzd;
    }
}
