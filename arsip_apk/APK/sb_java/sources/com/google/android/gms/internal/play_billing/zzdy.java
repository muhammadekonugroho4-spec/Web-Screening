package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
final class zzdy extends zzdu implements RandomAccess, zzfn {
    private static final boolean[] zza = null;
    private boolean[] zzb;
    private int zzc;

    static {
        boolean[] r1 = new boolean[0];
        zza = r1;
        new zzdy(r1, 0, false);
    }

    public zzdy() {
        this(zza, 0, true);
    }

    private static int zzg(int r1) {
        return Math.max(((r1 * 3) / 2) + 1, 10);
    }

    private final String zzh(int r4) {
        return "Index:" + r4 + ", Size:" + this.zzc;
    }

    private final void zzi(int r2) {
        if (r2 < 0) goto L7;
        if (r2 >= this.zzc) goto L7;
        return;
    L7:
        throw new IndexOutOfBoundsException(zzh(r2));
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int r5, Object r6) {
        boolean r62 = ((Boolean) r6).booleanValue();
        zza();
        if (r5 < 0) goto L13;
        int r02 = this.zzc;
        if (r5 > r02) goto L13;
        int r1 = r5 + 1;
        boolean[] r2 = this.zzb;
        int r3 = r2.length;
        if (r02 >= r3) goto L9;
        System.arraycopy(r2, r5, r2, r1, r02 - r5);
    L10:
        this.zzb[r5] = r62;
        this.zzc++;
        ((AbstractList) this).modCount++;
        return;
    L9:
        boolean[] r03 = new boolean[zzg(r3)];
        System.arraycopy(this.zzb, 0, r03, 0, r5);
        System.arraycopy(this.zzb, r5, r03, r1, this.zzc - r5);
        this.zzb = r03;
    L13:
        throw new IndexOutOfBoundsException(zzh(r5));
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection r6) {
        zza();
        byte[] r02 = zzfo.zzb;
        r6.getClass();
        if ((r6 instanceof zzdy) == false) goto L5;
        zzdy r62 = (zzdy) r6;
        int r03 = r62.zzc;
        if (r03 != 0) goto L9;
        return false;
    L9:
        int r2 = this.zzc;
        if ((Integer.MAX_VALUE - r2) < r03) goto L17;
        int r22 = r2 + r03;
        boolean[] r04 = this.zzb;
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

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof zzdy) == false) goto L8;
        zzdy r62 = (zzdy) r6;
        if (this.zzc == r62.zzc) goto L12;
        return false;
    L12:
        boolean[] r63 = r62.zzb;
        int r1 = 0;
    L14:
        if (r1 >= this.zzc) goto L19;
        if (this.zzb[r1] != r63[r1]) goto L17;
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
        zzi(r2);
        return Boolean.valueOf(this.zzb[r2]);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int r02 = 0;
        int r1 = 1;
    L4:
        if (r02 >= this.zzc) goto L6;
        r1 = (r1 * 31) + zzfo.zza(this.zzb[r02]);
        r02 = r02 + 1;
        goto L4
    L6:
        return r1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object r5) {
        if ((r5 instanceof Boolean) == true) goto L5;
        return -1;
    L5:
        boolean r52 = ((Boolean) r5).booleanValue();
        int r02 = this.zzc;
        int r2 = 0;
    L6:
        if (r2 >= r02) goto L11;
        if (this.zzb[r2] == r52) goto L9;
        r2 = r2 + 1;
        goto L6
    L9:
        return r2;
    L11:
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int r5) {
        zza();
        zzi(r5);
        boolean[] r02 = this.zzb;
        boolean r1 = r02[r5];
        if (r5 >= (this.zzc - 1)) goto L5;
        System.arraycopy(r02, r5 + 1, r02, r5, (r2 - r5) - 1);
    L5:
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(r1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int r3, int r4) {
        zza();
        if (r4 < r3) goto L7;
        boolean[] r02 = this.zzb;
        System.arraycopy(r02, r4, r02, r3, this.zzc - r4);
        this.zzc -= r4 - r3;
        ((AbstractList) this).modCount++;
        return;
    L7:
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int r3, Object r4) {
        boolean r42 = ((Boolean) r4).booleanValue();
        zza();
        zzi(r3);
        boolean[] r02 = this.zzb;
        boolean r1 = r02[r3];
        r02[r3] = r42;
        return Boolean.valueOf(r1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfn
    public final /* bridge */ /* synthetic */ zzfn zzd(int r4) {
        if (r4 < this.zzc) goto L10;
        if (r4 != 0) goto L6;
        boolean[] r42 = zza;
    L8:
        return new zzdy(r42, this.zzc, true);
    L6:
        r42 = Arrays.copyOf(this.zzb, r4);
        goto L8
    L10:
        throw new IllegalArgumentException();
    }

    public final void zze(boolean r5) {
        zza();
        int r02 = this.zzc;
        int r1 = this.zzb.length;
        if (r02 != r1) goto L5;
        boolean[] r03 = new boolean[zzg(r1)];
        System.arraycopy(this.zzb, 0, r03, 0, this.zzc);
        this.zzb = r03;
    L5:
        boolean[] r04 = this.zzb;
        int r12 = this.zzc;
        this.zzc = r12 + 1;
        r04[r12] = r5;
    }

    public final boolean zzf(int r2) {
        zzi(r2);
        return this.zzb[r2];
    }

    private zzdy(boolean[] r1, int r2, boolean r3) {
        super(r3);
        this.zzb = r1;
        this.zzc = r2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object r1) {
        zze(((Boolean) r1).booleanValue());
        return true;
    }
}
