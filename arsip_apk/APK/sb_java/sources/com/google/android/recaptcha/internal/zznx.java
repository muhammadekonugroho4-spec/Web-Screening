package com.google.android.recaptcha.internal;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
final class zznx extends zzkr implements RandomAccess, zznj, zzor {
    private static final long[] zza = null;
    private static final zznx zzb = null;
    private long[] zzc;
    private int zzd;

    static {
        long[] r1 = new long[0];
        zza = r1;
        zzb = new zznx(r1, 0, false);
    }

    public zznx() {
        this(zza, 0, true);
    }

    public static zznx zzf() {
        return zzb;
    }

    private static int zzi(int r1) {
        return Math.max(((r1 * 3) / 2) + 1, 10);
    }

    private final String zzj(int r4) {
        return "Index:" + r4 + ", Size:" + this.zzd;
    }

    private final void zzk(int r2) {
        if (r2 < 0) goto L7;
        if (r2 >= this.zzd) goto L7;
        return;
    L7:
        throw new IndexOutOfBoundsException(zzj(r2));
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int r6, Object r7) {
        long r02 = ((Long) r7).longValue();
        zza();
        if (r6 < 0) goto L13;
        int r72 = this.zzd;
        if (r6 > r72) goto L13;
        int r2 = r6 + 1;
        long[] r3 = this.zzc;
        int r4 = r3.length;
        if (r72 >= r4) goto L9;
        System.arraycopy(r3, r6, r3, r2, r72 - r6);
    L10:
        this.zzc[r6] = r02;
        this.zzd++;
        ((AbstractList) this).modCount++;
        return;
    L9:
        long[] r73 = new long[zzi(r4)];
        System.arraycopy(this.zzc, 0, r73, 0, r6);
        System.arraycopy(this.zzc, r6, r73, r2, this.zzd - r6);
        this.zzc = r73;
    L13:
        throw new IndexOutOfBoundsException(zzj(r6));
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection r6) {
        zza();
        byte[] r02 = zznl.zzb;
        r6.getClass();
        if ((r6 instanceof zznx) == false) goto L5;
        zznx r62 = (zznx) r6;
        int r03 = r62.zzd;
        if (r03 != 0) goto L9;
        return false;
    L9:
        int r2 = this.zzd;
        if ((Integer.MAX_VALUE - r2) < r03) goto L17;
        int r22 = r2 + r03;
        long[] r04 = this.zzc;
        if (r22 <= r04.length) goto L14;
        this.zzc = Arrays.copyOf(r04, r22);
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

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object r9) {
        if (this != r9) goto L6;
        return true;
    L6:
        if ((r9 instanceof zznx) == false) goto L8;
        zznx r92 = (zznx) r9;
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
    public final /* synthetic */ Object get(int r4) {
        zzk(r4);
        return Long.valueOf(this.zzc[r4]);
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int r02 = 0;
        int r2 = 1;
    L4:
        if (r02 >= this.zzd) goto L6;
        long r4 = this.zzc[r02];
        byte[] r3 = zznl.zzb;
        r2 = (r2 * 31) + ((int) (r4 ^ (r4 >>> 32)));
        r02 = r02 + 1;
        goto L4
    L6:
        return r2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object r8) {
        if ((r8 instanceof Long) == true) goto L5;
        return -1;
    L5:
        long r2 = ((Long) r8).longValue();
        int r82 = this.zzd;
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

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int r6) {
        zza();
        zzk(r6);
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

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int r5, Object r6) {
        long r02 = ((Long) r6).longValue();
        zza();
        zzk(r5);
        long[] r62 = this.zzc;
        long r2 = r62[r5];
        r62[r5] = r02;
        return Long.valueOf(r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zznk
    public final /* bridge */ /* synthetic */ zznk zzd(int r4) {
        if (r4 < this.zzd) goto L10;
        if (r4 != 0) goto L6;
        long[] r42 = zza;
    L8:
        return new zznx(r42, this.zzd, true);
    L6:
        r42 = Arrays.copyOf(this.zzc, r4);
        goto L8
    L10:
        throw new IllegalArgumentException();
    }

    public final long zze(int r4) {
        zzk(r4);
        return this.zzc[r4];
    }

    public final void zzg(long r5) {
        zza();
        int r02 = this.zzd;
        int r1 = this.zzc.length;
        if (r02 != r1) goto L5;
        long[] r03 = new long[zzi(r1)];
        System.arraycopy(this.zzc, 0, r03, 0, this.zzd);
        this.zzc = r03;
    L5:
        long[] r04 = this.zzc;
        int r12 = this.zzd;
        this.zzd = r12 + 1;
        r04[r12] = r5;
    }

    public final void zzh(int r2) {
        int r02 = this.zzc.length;
        if (r2 > r02) goto L5;
        return;
    L5:
        if (r02 == 0) goto L10;
    L6:
        if (r02 >= r2) goto L8;
        r02 = zzi(r02);
        goto L6
    L8:
        this.zzc = Arrays.copyOf(this.zzc, r02);
        return;
    L10:
        this.zzc = new long[Math.max(r2, 10)];
    }

    private zznx(long[] r1, int r2, boolean r3) {
        super(r3);
        this.zzc = r1;
        this.zzd = r2;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object r3) {
        zzg(((Long) r3).longValue());
        return true;
    }
}
