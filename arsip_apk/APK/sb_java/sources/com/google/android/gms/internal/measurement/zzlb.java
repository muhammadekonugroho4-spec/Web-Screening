package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
final class zzlb extends zzis<Long> implements zzkn, zzly, RandomAccess {
    private static final long[] zza = null;
    private static final zzlb zzb = null;
    private long[] zzc;
    private int zzd;

    static {
        long[] r1 = new long[0];
        zza = r1;
        zzb = new zzlb(r1, 0, false);
    }

    public zzlb() {
        this(zza, 0, true);
    }

    public static zzlb zzd() {
        return zzb;
    }

    private static int zze(int r1) {
        return Math.max(((r1 * 3) / 2) + 1, 10);
    }

    private final String zzf(int r4) {
        return "Index:" + r4 + ", Size:" + this.zzd;
    }

    private final void zzg(int r2) {
        if (r2 < 0) goto L7;
        if (r2 >= this.zzd) goto L7;
        return;
    L7:
        throw new IndexOutOfBoundsException(zzf(r2));
    }

    @Override // com.google.android.gms.internal.measurement.zzis, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int r6, Object r7) {
        long r02 = ((Long) r7).longValue();
        zza();
        if (r6 < 0) goto L13;
        int r72 = this.zzd;
        if (r6 > r72) goto L13;
        long[] r2 = this.zzc;
        if (r72 >= r2.length) goto L9;
        System.arraycopy(r2, r6, r2, r6 + 1, r72 - r6);
    L10:
        this.zzc[r6] = r02;
        this.zzd++;
        ((AbstractList) this).modCount++;
        return;
    L9:
        long[] r73 = new long[zze(r2.length)];
        System.arraycopy(this.zzc, 0, r73, 0, r6);
        System.arraycopy(this.zzc, r6, r73, r6 + 1, this.zzd - r6);
        this.zzc = r73;
    L13:
        throw new IndexOutOfBoundsException(zzf(r6));
    }

    @Override // com.google.android.gms.internal.measurement.zzis, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> r6) {
        zza();
        zzkj.zza(r6);
        if ((r6 instanceof zzlb) == false) goto L5;
        zzlb r62 = (zzlb) r6;
        int r02 = r62.zzd;
        if (r02 != 0) goto L9;
        return false;
    L9:
        int r2 = this.zzd;
        if ((Integer.MAX_VALUE - r2) < r02) goto L17;
        int r22 = r2 + r02;
        long[] r03 = this.zzc;
        if (r22 <= r03.length) goto L14;
        this.zzc = Arrays.copyOf(r03, r22);
    L14:
        System.arraycopy(r62.zzc, 0, this.zzc, this.zzd, r62.zzd);
        this.zzd = r22;
        ((AbstractList) this).modCount++;
        return true;
    L17:
        throw new OutOfMemoryError();
    L5:
        return super.addAll(r6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object r2) {
        if (indexOf(r2) == (-1)) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzis, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object r9) {
        if (this != r9) goto L6;
        return true;
    L6:
        if ((r9 instanceof zzlb) == false) goto L8;
        zzlb r92 = (zzlb) r9;
        if (this.zzd == r92.zzd) goto L12;
        return false;
    L12:
        long[] r93 = r92.zzc;
        int r1 = 0;
    L14:
        if (r1 >= this.zzd) goto L19;
        if (this.zzc[r1] != r93[r1]) goto L17;
        r1 = r1 + 1;
        goto L14
    L17:
        return false;
    L19:
        return true;
    L8:
        return super.equals(r9);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int r3) {
        return Long.valueOf(zzb(r3));
    }

    @Override // com.google.android.gms.internal.measurement.zzis, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int r02 = 1;
        int r1 = 0;
    L4:
        if (r1 >= this.zzd) goto L6;
        r02 = (r02 * 31) + zzkj.zza(this.zzc[r1]);
        r1 = r1 + 1;
        goto L4
    L6:
        return r02;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object r8) {
        if ((r8 instanceof Long) == true) goto L5;
        return -1;
    L5:
        long r2 = ((Long) r8).longValue();
        int r82 = size();
        int r02 = 0;
    L6:
        if (r02 >= r82) goto L11;
        if (this.zzc[r02] == r2) goto L9;
        r02 = r02 + 1;
        goto L6
    L9:
        return r02;
    L11:
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzis, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int r6) {
        zza();
        zzg(r6);
        long[] r02 = this.zzc;
        long r1 = r02[r6];
        if (r6 >= (this.zzd - 1)) goto L5;
        System.arraycopy(r02, r6 + 1, r02, r6, (r3 - r6) - 1);
    L5:
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(r1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int r3, int r4) {
        zza();
        if (r4 < r3) goto L7;
        long[] r02 = this.zzc;
        System.arraycopy(r02, r4, r02, r3, this.zzd - r4);
        this.zzd -= r4 - r3;
        ((AbstractList) this).modCount++;
        return;
    L7:
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.measurement.zzis, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int r5, Object r6) {
        long r02 = ((Long) r6).longValue();
        zza();
        zzg(r5);
        long[] r62 = this.zzc;
        long r2 = r62[r5];
        r62[r5] = r02;
        return Long.valueOf(r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final /* synthetic */ zzkm<Long> zza(int r1) {
        return zzc(r1);
    }

    @Override // com.google.android.gms.internal.measurement.zzkn
    public final long zzb(int r4) {
        zzg(r4);
        return this.zzc[r4];
    }

    @Override // com.google.android.gms.internal.measurement.zzkn
    public final zzkn zzc(int r4) {
        if (r4 < this.zzd) goto L10;
        if (r4 != 0) goto L6;
        long[] r42 = zza;
    L8:
        return new zzlb(r42, this.zzd, true);
    L6:
        r42 = Arrays.copyOf(this.zzc, r4);
        goto L8
    L10:
        throw new IllegalArgumentException();
    }

    private zzlb(long[] r1, int r2, boolean r3) {
        super(r3);
        this.zzc = r1;
        this.zzd = r2;
    }

    public final void zza(long r5) {
        zza();
        int r02 = this.zzd;
        long[] r1 = this.zzc;
        if (r02 != r1.length) goto L5;
        long[] r03 = new long[zze(r1.length)];
        System.arraycopy(this.zzc, 0, r03, 0, this.zzd);
        this.zzc = r03;
    L5:
        long[] r04 = this.zzc;
        int r12 = this.zzd;
        this.zzd = r12 + 1;
        r04[r12] = r5;
    }

    public final void zzd(int r3) {
        long[] r02 = this.zzc;
        if (r3 > r02.length) goto L6;
        return;
    L6:
        if (r02.length != 0) goto L9;
        this.zzc = new long[Math.max(r3, 10)];
        return;
    L9:
        int r03 = r02.length;
    L10:
        if (r03 >= r3) goto L12;
        r03 = zze(r03);
        goto L10
    L12:
        this.zzc = Arrays.copyOf(this.zzc, r03);
    }

    @Override // com.google.android.gms.internal.measurement.zzis, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object r3) {
        zza(((Long) r3).longValue());
        return true;
    }
}
