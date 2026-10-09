package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
final class zzajt extends zzaiq<Double> implements zzakn<Double>, RandomAccess {
    private static final double[] zza = null;
    private double[] zzb;
    private int zzc;

    static {
        double[] r1 = new double[0];
        zza = r1;
        new zzajt(r1, 0, false);
    }

    public zzajt() {
        this(zza, 0, true);
    }

    private static int zzd(int r1) {
        return Math.max(((r1 * 3) / 2) + 1, 10);
    }

    private final String zze(int r4) {
        return "Index:" + r4 + ", Size:" + this.zzc;
    }

    private final void zzf(int r2) {
        if (r2 < 0) goto L7;
        if (r2 >= this.zzc) goto L7;
        return;
    L7:
        throw new IndexOutOfBoundsException(zze(r2));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int r6, Object r7) {
        double r02 = ((Double) r7).doubleValue();
        zza();
        if (r6 < 0) goto L13;
        int r72 = this.zzc;
        if (r6 > r72) goto L13;
        double[] r2 = this.zzb;
        if (r72 >= r2.length) goto L9;
        System.arraycopy(r2, r6, r2, r6 + 1, r72 - r6);
    L10:
        this.zzb[r6] = r02;
        this.zzc++;
        ((AbstractList) this).modCount++;
        return;
    L9:
        double[] r73 = new double[zzd(r2.length)];
        System.arraycopy(this.zzb, 0, r73, 0, r6);
        System.arraycopy(this.zzb, r6, r73, r6 + 1, this.zzc - r6);
        this.zzb = r73;
    L13:
        throw new IndexOutOfBoundsException(zze(r6));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> r6) {
        zza();
        zzaki.zza(r6);
        if ((r6 instanceof zzajt) == false) goto L5;
        zzajt r62 = (zzajt) r6;
        int r02 = r62.zzc;
        if (r02 != 0) goto L9;
        return false;
    L9:
        int r2 = this.zzc;
        if ((Integer.MAX_VALUE - r2) < r02) goto L17;
        int r22 = r2 + r02;
        double[] r03 = this.zzb;
        if (r22 <= r03.length) goto L14;
        this.zzb = Arrays.copyOf(r03, r22);
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object r9) {
        if (this != r9) goto L6;
        return true;
    L6:
        if ((r9 instanceof zzajt) == false) goto L8;
        zzajt r92 = (zzajt) r9;
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
    public final /* synthetic */ Object get(int r3) {
        return Double.valueOf(zzb(r3));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int r02 = 1;
        int r1 = 0;
    L4:
        if (r1 >= this.zzc) goto L6;
        r02 = (r02 * 31) + zzaki.zza(Double.doubleToLongBits(this.zzb[r1]));
        r1 = r1 + 1;
        goto L4
    L6:
        return r02;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object r8) {
        if ((r8 instanceof Double) == true) goto L5;
        return -1;
    L5:
        double r2 = ((Double) r8).doubleValue();
        int r82 = size();
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int r6) {
        zza();
        zzf(r6);
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int r5, Object r6) {
        double r02 = ((Double) r6).doubleValue();
        zza();
        zzf(r5);
        double[] r62 = this.zzb;
        double r2 = r62[r5];
        r62[r5] = r02;
        return Double.valueOf(r2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
    public final /* synthetic */ zzakn<Double> zza(int r4) {
        if (r4 < this.zzc) goto L10;
        if (r4 != 0) goto L6;
        double[] r42 = zza;
    L8:
        return new zzajt(r42, this.zzc, true);
    L6:
        r42 = Arrays.copyOf(this.zzb, r4);
        goto L8
    L10:
        throw new IllegalArgumentException();
    }

    public final double zzb(int r4) {
        zzf(r4);
        return this.zzb[r4];
    }

    public final void zzc(int r3) {
        double[] r02 = this.zzb;
        if (r3 > r02.length) goto L6;
        return;
    L6:
        if (r02.length != 0) goto L9;
        this.zzb = new double[Math.max(r3, 10)];
        return;
    L9:
        int r03 = r02.length;
    L10:
        if (r03 >= r3) goto L12;
        r03 = zzd(r03);
        goto L10
    L12:
        this.zzb = Arrays.copyOf(this.zzb, r03);
    }

    private zzajt(double[] r1, int r2, boolean r3) {
        super(r3);
        this.zzb = r1;
        this.zzc = r2;
    }

    public final void zza(double r5) {
        zza();
        int r02 = this.zzc;
        double[] r1 = this.zzb;
        if (r02 != r1.length) goto L5;
        double[] r03 = new double[zzd(r1.length)];
        System.arraycopy(this.zzb, 0, r03, 0, this.zzc);
        this.zzb = r03;
    L5:
        double[] r04 = this.zzb;
        int r12 = this.zzc;
        this.zzc = r12 + 1;
        r04[r12] = r5;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object r3) {
        zza(((Double) r3).doubleValue());
        return true;
    }
}
