package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes5.dex */
class zzmj<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private Object[] zza;
    private int zzb;
    private Map<K, V> zzc;
    private boolean zzd;
    private volatile zzmp zze;
    private Map<K, V> zzf;

    public /* synthetic */ zzmj(zzmo r1) {
        this();
    }

    public static /* bridge */ /* synthetic */ int zza(zzmj r02) {
        return r02.zzb;
    }

    public static /* bridge */ /* synthetic */ Map zzb(zzmj r02) {
        return r02.zzc;
    }

    public static /* bridge */ /* synthetic */ Map zzc(zzmj r02) {
        return r02.zzf;
    }

    public static /* synthetic */ void zzd(zzmj r02) {
        r02.zzg();
    }

    public static /* bridge */ /* synthetic */ Object[] zze(zzmj r02) {
        return r02.zza;
    }

    private final SortedMap<K, V> zzf() {
        zzg();
        if (this.zzc.isEmpty() == false) goto L8;
        if ((this.zzc instanceof TreeMap) == true) goto L8;
        TreeMap r02 = new TreeMap();
        this.zzc = r02;
        this.zzf = r02.descendingMap();
    L8:
        return (SortedMap) this.zzc;
    }

    private final void zzg() {
        if (this.zzd == true) goto L6;
        return;
    L6:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzg();
        if (this.zzb == 0) goto L6;
        this.zza = null;
        this.zzb = 0;
    L6:
        if (this.zzc.isEmpty() == true) goto L9;
        this.zzc.clear();
        return;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object r2) {
        Comparable r22 = (Comparable) r2;
        if (zza(r22) < 0) goto L5;
        return true;
    L5:
        if (this.zzc.containsKey(r22) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zze != null) goto L6;
        this.zze = new zzmp(this, null);
    L6:
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof zzmj) == false) goto L8;
        zzmj r82 = (zzmj) r8;
        int r1 = size();
        if (r1 == r82.size()) goto L12;
        return false;
    L12:
        int r2 = this.zzb;
        if (r2 != r82.zzb) goto L15;
        int r4 = 0;
    L17:
        if (r4 >= r2) goto L22;
        if (zza(r4).equals(r82.zza(r4)) == false) goto L20;
        r4 = r4 + 1;
        goto L17
    L20:
        return false;
    L22:
        if (r2 != r1) goto L24;
        return true;
    L24:
        return this.zzc.equals(r82.zzc);
    L15:
        return entrySet().equals(r82.entrySet());
    L8:
        return super.equals(r8);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object r2) {
        Comparable r22 = (Comparable) r2;
        int r02 = zza(r22);
        if (r02 < 0) goto L7;
        return (V) ((zzmn) this.zza[r02]).getValue();
    L7:
        return this.zzc.get(r22);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int r02 = this.zzb;
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r02) goto L6;
        r2 = r2 + this.zza[r1].hashCode();
        r1 = r1 + 1;
        goto L3
    L6:
        if (this.zzc.size() > 0) goto L8;
        return r2;
    L8:
        return r2 + this.zzc.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object r1, Object r2) {
        return zza((Comparable) r1, r2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object r2) {
        zzg();
        Comparable r22 = (Comparable) r2;
        int r02 = zza(r22);
        if (r02 < 0) goto L7;
        return zzb(r02);
    L7:
        if (this.zzc.isEmpty() == false) goto L11;
        return null;
    L11:
        return this.zzc.remove(r22);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzb + this.zzc.size();
    }

    private zzmj() {
        Map<K, V> r02 = Collections.EMPTY_MAP;
        this.zzc = r02;
        this.zzf = r02;
    }

    public static /* synthetic */ Object zza(zzmj r02, int r1) {
        return r02.zzb(r1);
    }

    public final int zzb() {
        return this.zzb;
    }

    public final Iterable<Map.Entry<K, V>> zzc() {
        if (this.zzc.isEmpty() == false) goto L7;
        return Collections.EMPTY_SET;
    L7:
        return this.zzc.entrySet();
    }

    public final Set<Map.Entry<K, V>> zzd() {
        return new zzmk(this, null);
    }

    public final boolean zze() {
        return this.zzd;
    }

    private final int zza(K r5) {
        int r02 = this.zzb;
        int r1 = r02 - 1;
        if (r1 < 0) goto L11;
        int r2 = r5.compareTo((Comparable) ((zzmn) this.zza[r1]).getKey());
        if (r2 <= 0) goto L9;
        int r03 = r02 + 1;
    L8:
        return -r03;
    L9:
        if (r2 != 0) goto L11;
        return r1;
    L11:
        int r04 = 0;
    L12:
        if (r04 > r1) goto L19;
        int r22 = (r04 + r1) / 2;
        int r3 = r5.compareTo((Comparable) ((zzmn) this.zza[r22]).getKey());
        if (r3 < 0) goto L15;
        if (r3 <= 0) goto L18;
        r04 = r22 + 1;
        goto L12
    L18:
        return r22;
    L15:
        r1 = r22 - 1;
        goto L12
    L19:
        r03 = r04 + 1;
        goto L8
    }

    private final V zzb(int r6) {
        zzg();
        V r02 = (V) ((zzmn) this.zza[r6]).getValue();
        Object[] r1 = this.zza;
        System.arraycopy(r1, r6 + 1, r1, r6, (this.zzb - r6) - 1);
        this.zzb--;
        if (this.zzc.isEmpty() == true) goto L5;
        Iterator<Map.Entry<K, V>> r62 = zzf().entrySet().iterator();
        this.zza[this.zzb] = new zzmn(this, r62.next());
        this.zzb++;
        r62.remove();
    L5:
        return r02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V zza(K r5, V r6) {
        zzg();
        int r02 = zza(r5);
        if (r02 >= 0) goto L5;
        zzg();
        if (this.zza != null) goto L9;
        this.zza = new Object[16];
    L9:
        int r03 = -(r02 + 1);
        if (r03 >= 16) goto L12;
        int r1 = this.zzb;
        if (r1 != 16) goto L16;
        zzmn r2 = (zzmn) this.zza[15];
        this.zzb = r1 - 1;
        zzf().put((Comparable) r2.getKey(), r2.getValue());
    L16:
        Object[] r12 = this.zza;
        System.arraycopy(r12, r03, r12, r03 + 1, (r12.length - r03) - 1);
        this.zza[r03] = new zzmn(this, r5, r6);
        this.zzb++;
        return null;
    L12:
        return zzf().put(r5, r6);
    L5:
        return (V) ((zzmn) this.zza[r02]).setValue(r6);
    }

    public final Map.Entry<K, V> zza(int r2) {
        if (r2 >= this.zzb) goto L7;
        return (zzmn) this.zza[r2];
    L7:
        throw new ArrayIndexOutOfBoundsException(r2);
    }

    public void zza() {
        if (this.zzd == false) goto L5;
        return;
    L5:
        if (this.zzc.isEmpty() == false) goto L7;
        Map<K, V> r02 = Collections.EMPTY_MAP;
    L8:
        this.zzc = r02;
        if (this.zzf.isEmpty() == false) goto L11;
        Map<K, V> r03 = Collections.EMPTY_MAP;
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
}
