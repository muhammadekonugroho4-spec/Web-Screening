package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes5.dex */
class zzhd extends AbstractMap {
    private Object[] zza;
    private int zzb;
    private Map zzc;
    private boolean zzd;
    private volatile zzhb zze;
    private Map zzf;

    private zzhd() {
        Map r02 = Collections.EMPTY_MAP;
        this.zzc = r02;
        this.zzf = r02;
    }

    public static /* bridge */ /* synthetic */ int zzb(zzhd r02) {
        return r02.zzb;
    }

    public static /* bridge */ /* synthetic */ Object zze(zzhd r02, int r1) {
        return r02.zzm(r1);
    }

    public static /* bridge */ /* synthetic */ Map zzh(zzhd r02) {
        return r02.zzc;
    }

    public static /* bridge */ /* synthetic */ void zzi(zzhd r02) {
        r02.zzo();
    }

    public static /* bridge */ /* synthetic */ Object[] zzk(zzhd r02) {
        return r02.zza;
    }

    private final int zzl(Comparable r5) {
        int r02 = this.zzb;
        int r1 = r02 - 1;
        int r2 = 0;
        if (r1 < 0) goto L11;
        int r3 = r5.compareTo(((zzgz) this.zza[r1]).zza());
        if (r3 > 0) goto L7;
        if (r3 != 0) goto L11;
        return r1;
    L7:
        return -(r02 + 1);
    L11:
        if (r2 > r1) goto L19;
        int r03 = (r2 + r1) / 2;
        int r32 = r5.compareTo(((zzgz) this.zza[r03]).zza());
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

    private final Object zzm(int r7) {
        zzo();
        Object r02 = ((zzgz) this.zza[r7]).getValue();
        Object[] r1 = this.zza;
        System.arraycopy(r1, r7 + 1, r1, r7, (this.zzb - r7) - 1);
        this.zzb--;
        if (this.zzc.isEmpty() == true) goto L5;
        Iterator r72 = zzn().entrySet().iterator();
        Object[] r12 = this.zza;
        int r2 = this.zzb;
        Map.Entry r4 = (Map.Entry) r72.next();
        r12[r2] = new zzgz(this, (Comparable) r4.getKey(), r4.getValue());
        this.zzb++;
        r72.remove();
    L5:
        return r02;
    }

    private final SortedMap zzn() {
        zzo();
        if (this.zzc.isEmpty() == false) goto L8;
        if ((this.zzc instanceof TreeMap) == true) goto L8;
        TreeMap r02 = new TreeMap();
        this.zzc = r02;
        this.zzf = r02.descendingMap();
    L8:
        return (SortedMap) this.zzc;
    }

    private final void zzo() {
        if (this.zzd == true) goto L6;
        return;
    L6:
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzo();
        if (this.zzb == 0) goto L6;
        this.zza = null;
        this.zzb = 0;
    L6:
        if (this.zzc.isEmpty() == true) goto L9;
        this.zzc.clear();
        return;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object r2) {
        Comparable r22 = (Comparable) r2;
        if (zzl(r22) < 0) goto L5;
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
        this.zze = new zzhb(this, null);
    L6:
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof zzhd) == false) goto L8;
        zzhd r82 = (zzhd) r8;
        int r1 = size();
        if (r1 != r82.size()) goto L25;
        int r2 = this.zzb;
        if (r2 != r82.zzb) goto L24;
        int r4 = 0;
    L14:
        if (r4 >= r2) goto L19;
        if (zzg(r4).equals(r82.zzg(r4)) == false) goto L17;
        r4 = r4 + 1;
        goto L14
    L17:
        return false;
    L19:
        if (r2 != r1) goto L21;
        return true;
    L21:
        return this.zzc.equals(r82.zzc);
    L24:
        return entrySet().equals(r82.entrySet());
    L25:
        return false;
    L8:
        return super.equals(r8);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object r2) {
        Comparable r22 = (Comparable) r2;
        int r02 = zzl(r22);
        if (r02 < 0) goto L7;
        return ((zzgz) this.zza[r02]).getValue();
    L7:
        return this.zzc.get(r22);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
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

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object r1, Object r2) {
        return zzf((Comparable) r1, r2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object r2) {
        zzo();
        Comparable r22 = (Comparable) r2;
        int r02 = zzl(r22);
        if (r02 < 0) goto L7;
        return zzm(r02);
    L7:
        if (this.zzc.isEmpty() == false) goto L11;
        return null;
    L11:
        return this.zzc.remove(r22);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzb + this.zzc.size();
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

    public final int zzc() {
        return this.zzb;
    }

    public final Iterable zzd() {
        if (this.zzc.isEmpty() == false) goto L7;
        return Collections.EMPTY_SET;
    L7:
        return this.zzc.entrySet();
    }

    public final Object zzf(Comparable r5, Object r6) {
        zzo();
        int r02 = zzl(r5);
        if (r02 >= 0) goto L5;
        zzo();
        if (this.zza != null) goto L9;
        this.zza = new Object[16];
    L9:
        int r03 = -(r02 + 1);
        if (r03 < 16) goto L14;
        return zzn().put(r5, r6);
    L14:
        if (this.zzb != 16) goto L16;
        zzgz r1 = (zzgz) this.zza[15];
        this.zzb = 15;
        zzn().put(r1.zza(), r1.getValue());
    L16:
        Object[] r12 = this.zza;
        int r3 = r12.length;
        System.arraycopy(r12, r03, r12, r03 + 1, 15 - r03);
        this.zza[r03] = new zzgz(this, r5, r6);
        this.zzb++;
        return null;
    L5:
        return ((zzgz) this.zza[r02]).setValue(r6);
    }

    public final Map.Entry zzg(int r2) {
        if (r2 >= this.zzb) goto L7;
        return (zzgz) this.zza[r2];
    L7:
        throw new ArrayIndexOutOfBoundsException(r2);
    }

    public final boolean zzj() {
        return this.zzd;
    }

    public /* synthetic */ zzhd(zzhc r1) {
        Map r12 = Collections.EMPTY_MAP;
        this.zzc = r12;
        this.zzf = r12;
    }
}
