package com.google.android.recaptcha.internal;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
final class zzmi extends zzkr implements RandomAccess, zznk, zzor {
    private static final double[] zza = null;
    private double[] zzb;
    private int zzc;

    static {
        double[] r1 = new double[0];
        zza = r1;
        new zzmi(r1, 0, false);
    }

    public zzmi() {
        this(zza, 0, true);
    }

    private static int zzh(int r1) {
        return Math.max(((r1 * 3) / 2) + 1, 10);
    }

    private final String zzi(int r4) {
        return "Index:" + r4 + ", Size:" + this.zzc;
    }

    private final void zzj(int r2) {
        if (r2 < 0) goto L7;
        if (r2 >= this.zzc) goto L7;
        return;
    L7:
        throw new IndexOutOfBoundsException(zzi(r2));
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int r6, Object r7) {
        double r02 = ((Double) r7).doubleValue();
        zza();
        if (r6 < 0) goto L13;
        int r72 = this.zzc;
        if (r6 > r72) goto L13;
        int r2 = r6 + 1;
        double[] r3 = this.zzb;
        int r4 = r3.length;
        if (r72 >= r4) goto L9;
        System.arraycopy(r3, r6, r3, r2, r72 - r6);
    L10:
        this.zzb[r6] = r02;
        this.zzc++;
        ((AbstractList) this).modCount++;
        return;
    L9:
        double[] r73 = new double[zzh(r4)];
        System.arraycopy(this.zzb, 0, r73, 0, r6);
        System.arraycopy(this.zzb, r6, r73, r2, this.zzc - r6);
        this.zzb = r73;
    L13:
        throw new IndexOutOfBoundsException(zzi(r6));
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection r6) {
        zza();
        byte[] r02 = zznl.zzb;
        r6.getClass();
        if ((r6 instanceof zzmi) == false) goto L5;
        zzmi r62 = (zzmi) r6;
        int r03 = r62.zzc;
        if (r03 != 0) goto L9;
        return false;
    L9:
        int r2 = this.zzc;
        if ((Integer.MAX_VALUE - r2) < r03) goto L17;
        int r22 = r2 + r03;
        double[] r04 = this.zzb;
        if (r22 <= r04.length) goto L14;
        this.zzb = Arrays.copyOf(r04, r22);
    L14:
        System.arraycopy(r62.zzb, 0, this.zzb, this.zzc, r62.zzc);
        this.zzc = r22;
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
        if ((r9 instanceof zzmi) == false) goto L8;
        zzmi r92 = (zzmi) r9;
        if (this.zzc == r92.zzc) goto L12;
        return false;
    L12:
        double[] r93 = r92.zzb;
        int r1 = 0;
    L14:
        if (r1 >= this.zzc) goto L19;
        if (Double.doubleToLongBits(this.zzb[r1]) != Double.doubleToLongBits(r93[r1])) goto L17;
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
        zzj(r4);
        return Double.valueOf(this.zzb[r4]);
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int r02 = 0;
        int r2 = 1;
    L4:
        if (r02 >= this.zzc) goto L6;
        long r3 = Double.doubleToLongBits(this.zzb[r02]);
        byte[] r5 = zznl.zzb;
        r2 = (r2 * 31) + ((int) (r3 ^ (r3 >>> 32)));
        r02 = r02 + 1;
        goto L4
    L6:
        return r2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object r8) {
        if ((r8 instanceof Double) == true) goto L5;
        return -1;
    L5:
        double r2 = ((Double) r8).doubleValue();
        int r82 = this.zzc;
        int r02 = 0;
    L6:
        if (r02 >= r82) goto L11;
        if (this.zzb[r02] == r2) goto L9;
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
        zzj(r6);
        double[] r02 = this.zzb;
        double r1 = r02[r6];
        if (r6 >= (this.zzc - 1)) goto L5;
        System.arraycopy(r02, r6 + 1, r02, r6, (r3 - r6) - 1);
    L5:
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(r1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int r3, int r4) {
        zza();
        if (r4 < r3) goto L7;
        double[] r02 = this.zzb;
        System.arraycopy(r02, r4, r02, r3, this.zzc - r4);
        this.zzc -= r4 - r3;
        ((AbstractList) this).modCount++;
        return;
    L7:
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int r5, Object r6) {
        double r02 = ((Double) r6).doubleValue();
        zza();
        zzj(r5);
        double[] r62 = this.zzb;
        double r2 = r62[r5];
        r62[r5] = r02;
        return Double.valueOf(r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zznk
    public final /* bridge */ /* synthetic */ zznk zzd(int r4) {
        if (r4 < this.zzc) goto L10;
        if (r4 != 0) goto L6;
        double[] r42 = zza;
    L8:
        return new zzmi(r42, this.zzc, true);
    L6:
        r42 = Arrays.copyOf(this.zzb, r4);
        goto L8
    L10:
        throw new IllegalArgumentException();
    }

    public final double zze(int r4) {
        zzj(r4);
        return this.zzb[r4];
    }

    public final void zzf(double r5) {
        zza();
        int r02 = this.zzc;
        int r1 = this.zzb.length;
        if (r02 != r1) goto L5;
        double[] r03 = new double[zzh(r1)];
        System.arraycopy(this.zzb, 0, r03, 0, this.zzc);
        this.zzb = r03;
    L5:
        double[] r04 = this.zzb;
        int r12 = this.zzc;
        this.zzc = r12 + 1;
        r04[r12] = r5;
    }

    public final void zzg(int r2) {
        int r02 = this.zzb.length;
        if (r2 > r02) goto L5;
        return;
    L5:
        if (r02 == 0) goto L10;
    L6:
        if (r02 >= r2) goto L8;
        r02 = zzh(r02);
        goto L6
    L8:
        this.zzb = Arrays.copyOf(this.zzb, r02);
        return;
    L10:
        this.zzb = new double[Math.max(r2, 10)];
    }

    private zzmi(double[] r1, int r2, boolean r3) {
        super(r3);
        this.zzb = r1;
        this.zzc = r2;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object r3) {
        zzf(((Double) r3).doubleValue());
        return true;
    }
}
