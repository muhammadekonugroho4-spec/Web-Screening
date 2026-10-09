package com.google.android.recaptcha.internal;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
final class zzne extends zzkr implements RandomAccess, zzni, zzor {
    private static final int[] zza = null;
    private static final zzne zzb = null;
    private int[] zzc;
    private int zzd;

    static {
        int[] r1 = new int[0];
        zza = r1;
        zzb = new zzne(r1, 0, false);
    }

    public zzne() {
        this(zza, 0, true);
    }

    public static zzne zzf() {
        return zzb;
    }

    private static int zzj(int r1) {
        return Math.max(((r1 * 3) / 2) + 1, 10);
    }

    private final String zzk(int r4) {
        return "Index:" + r4 + ", Size:" + this.zzd;
    }

    private final void zzl(int r2) {
        if (r2 < 0) goto L7;
        if (r2 >= this.zzd) goto L7;
        return;
    L7:
        throw new IndexOutOfBoundsException(zzk(r2));
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int r5, Object r6) {
        int r62 = ((Integer) r6).intValue();
        zza();
        if (r5 < 0) goto L13;
        int r02 = this.zzd;
        if (r5 > r02) goto L13;
        int r1 = r5 + 1;
        int[] r2 = this.zzc;
        int r3 = r2.length;
        if (r02 >= r3) goto L9;
        System.arraycopy(r2, r5, r2, r1, r02 - r5);
    L10:
        this.zzc[r5] = r62;
        this.zzd++;
        ((AbstractList) this).modCount++;
        return;
    L9:
        int[] r03 = new int[zzj(r3)];
        System.arraycopy(this.zzc, 0, r03, 0, r5);
        System.arraycopy(this.zzc, r5, r03, r1, this.zzd - r5);
        this.zzc = r03;
    L13:
        throw new IndexOutOfBoundsException(zzk(r5));
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection r6) {
        zza();
        byte[] r02 = zznl.zzb;
        r6.getClass();
        if ((r6 instanceof zzne) == false) goto L5;
        zzne r62 = (zzne) r6;
        int r03 = r62.zzd;
        if (r03 != 0) goto L9;
        return false;
    L9:
        int r2 = this.zzd;
        if ((Integer.MAX_VALUE - r2) < r03) goto L17;
        int r22 = r2 + r03;
        int[] r04 = this.zzc;
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
    public final boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof zzne) == false) goto L8;
        zzne r62 = (zzne) r6;
        if (this.zzd == r62.zzd) goto L12;
        return false;
    L12:
        int[] r63 = r62.zzc;
        int r1 = 0;
    L14:
        if (r1 >= this.zzd) goto L19;
        if (this.zzc[r1] != r63[r1]) goto L17;
        r1 = r1 + 1;
        goto L14
    L17:
        return false;
    L19:
        return true;
    L8:
        return super.equals(r6);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int r2) {
        zzl(r2);
        return Integer.valueOf(this.zzc[r2]);
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int r02 = 0;
        int r1 = 1;
    L4:
        if (r02 >= this.zzd) goto L6;
        r1 = (r1 * 31) + this.zzc[r02];
        r02 = r02 + 1;
        goto L4
    L6:
        return r1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object r5) {
        if ((r5 instanceof Integer) == true) goto L5;
        return -1;
    L5:
        int r52 = ((Integer) r5).intValue();
        int r02 = this.zzd;
        int r2 = 0;
    L6:
        if (r2 >= r02) goto L11;
        if (this.zzc[r2] == r52) goto L9;
        r2 = r2 + 1;
        goto L6
    L9:
        return r2;
    L11:
        return -1;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int r5) {
        zza();
        zzl(r5);
        int[] r02 = this.zzc;
        int r1 = r02[r5];
        if (r5 >= (this.zzd - 1)) goto L5;
        System.arraycopy(r02, r5 + 1, r02, r5, (r2 - r5) - 1);
    L5:
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(r1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int r3, int r4) {
        zza();
        if (r4 < r3) goto L7;
        int[] r02 = this.zzc;
        System.arraycopy(r02, r4, r02, r3, this.zzd - r4);
        this.zzd -= r4 - r3;
        ((AbstractList) this).modCount++;
        return;
    L7:
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int r3, Object r4) {
        int r42 = ((Integer) r4).intValue();
        zza();
        zzl(r3);
        int[] r02 = this.zzc;
        int r1 = r02[r3];
        r02[r3] = r42;
        return Integer.valueOf(r1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zznk
    public final /* bridge */ /* synthetic */ zznk zzd(int r1) {
        return zzg(r1);
    }

    public final int zze(int r2) {
        zzl(r2);
        return this.zzc[r2];
    }

    @Override // com.google.android.recaptcha.internal.zzni
    public final zzni zzg(int r4) {
        if (r4 < this.zzd) goto L10;
        if (r4 != 0) goto L6;
        int[] r42 = zza;
    L8:
        return new zzne(r42, this.zzd, true);
    L6:
        r42 = Arrays.copyOf(this.zzc, r4);
        goto L8
    L10:
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.recaptcha.internal.zzni
    public final void zzh(int r5) {
        zza();
        int r02 = this.zzd;
        int r1 = this.zzc.length;
        if (r02 != r1) goto L5;
        int[] r03 = new int[zzj(r1)];
        System.arraycopy(this.zzc, 0, r03, 0, this.zzd);
        this.zzc = r03;
    L5:
        int[] r04 = this.zzc;
        int r12 = this.zzd;
        this.zzd = r12 + 1;
        r04[r12] = r5;
    }

    public final void zzi(int r2) {
        int r02 = this.zzc.length;
        if (r2 > r02) goto L5;
        return;
    L5:
        if (r02 == 0) goto L10;
    L6:
        if (r02 >= r2) goto L8;
        r02 = zzj(r02);
        goto L6
    L8:
        this.zzc = Arrays.copyOf(this.zzc, r02);
        return;
    L10:
        this.zzc = new int[Math.max(r2, 10)];
    }

    private zzne(int[] r1, int r2, boolean r3) {
        super(r3);
        this.zzc = r1;
        this.zzd = r2;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object r1) {
        zzh(((Integer) r1).intValue());
        return true;
    }
}
