package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
final class zzakj extends zzaiq<Integer> implements zzakn<Integer>, RandomAccess {
    private static final int[] zza = null;
    private int[] zzb;
    private int zzc;

    static {
        int[] r1 = new int[0];
        zza = r1;
        new zzakj(r1, 0, false);
    }

    public zzakj() {
        this(zza, 0, true);
    }

    private static int zze(int r1) {
        return Math.max(((r1 * 3) / 2) + 1, 10);
    }

    private final String zzf(int r4) {
        return "Index:" + r4 + ", Size:" + this.zzc;
    }

    private final void zzg(int r2) {
        if (r2 < 0) goto L7;
        if (r2 >= this.zzc) goto L7;
        return;
    L7:
        throw new IndexOutOfBoundsException(zzf(r2));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int r5, Object r6) {
        int r62 = ((Integer) r6).intValue();
        zza();
        if (r5 < 0) goto L13;
        int r02 = this.zzc;
        if (r5 > r02) goto L13;
        int[] r1 = this.zzb;
        if (r02 >= r1.length) goto L9;
        System.arraycopy(r1, r5, r1, r5 + 1, r02 - r5);
    L10:
        this.zzb[r5] = r62;
        this.zzc++;
        ((AbstractList) this).modCount++;
        return;
    L9:
        int[] r03 = new int[zze(r1.length)];
        System.arraycopy(this.zzb, 0, r03, 0, r5);
        System.arraycopy(this.zzb, r5, r03, r5 + 1, this.zzc - r5);
        this.zzb = r03;
    L13:
        throw new IndexOutOfBoundsException(zzf(r5));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> r6) {
        zza();
        zzaki.zza(r6);
        if ((r6 instanceof zzakj) == false) goto L5;
        zzakj r62 = (zzakj) r6;
        int r02 = r62.zzc;
        if (r02 != 0) goto L9;
        return false;
    L9:
        int r2 = this.zzc;
        if ((Integer.MAX_VALUE - r2) < r02) goto L17;
        int r22 = r2 + r02;
        int[] r03 = this.zzb;
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
    public final boolean equals(Object r6) {
        if (this != r6) goto L6;
        return true;
    L6:
        if ((r6 instanceof zzakj) == false) goto L8;
        zzakj r62 = (zzakj) r6;
        if (this.zzc == r62.zzc) goto L12;
        return false;
    L12:
        int[] r63 = r62.zzb;
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
    public final /* synthetic */ Object get(int r1) {
        return Integer.valueOf(zzb(r1));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int r02 = 1;
        int r1 = 0;
    L4:
        if (r1 >= this.zzc) goto L6;
        r02 = (r02 * 31) + this.zzb[r1];
        r1 = r1 + 1;
        goto L4
    L6:
        return r02;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object r5) {
        if ((r5 instanceof Integer) == true) goto L5;
        return -1;
    L5:
        int r52 = ((Integer) r5).intValue();
        int r02 = size();
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int r5) {
        zza();
        zzg(r5);
        int[] r02 = this.zzb;
        int r1 = r02[r5];
        if (r5 >= (this.zzc - 1)) goto L5;
        System.arraycopy(r02, r5 + 1, r02, r5, (r2 - r5) - 1);
    L5:
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(r1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int r3, int r4) {
        zza();
        if (r4 < r3) goto L7;
        int[] r02 = this.zzb;
        System.arraycopy(r02, r4, r02, r3, this.zzc - r4);
        this.zzc -= r4 - r3;
        ((AbstractList) this).modCount++;
        return;
    L7:
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int r3, Object r4) {
        int r42 = ((Integer) r4).intValue();
        zza();
        zzg(r3);
        int[] r02 = this.zzb;
        int r1 = r02[r3];
        r02[r3] = r42;
        return Integer.valueOf(r1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
    public final /* synthetic */ zzakn<Integer> zza(int r4) {
        if (r4 < this.zzc) goto L10;
        if (r4 != 0) goto L6;
        int[] r42 = zza;
    L8:
        return new zzakj(r42, this.zzc, true);
    L6:
        r42 = Arrays.copyOf(this.zzb, r4);
        goto L8
    L10:
        throw new IllegalArgumentException();
    }

    public final int zzb(int r2) {
        zzg(r2);
        return this.zzb[r2];
    }

    public final void zzc(int r5) {
        zza();
        int r02 = this.zzc;
        int[] r1 = this.zzb;
        if (r02 != r1.length) goto L5;
        int[] r03 = new int[zze(r1.length)];
        System.arraycopy(this.zzb, 0, r03, 0, this.zzc);
        this.zzb = r03;
    L5:
        int[] r04 = this.zzb;
        int r12 = this.zzc;
        this.zzc = r12 + 1;
        r04[r12] = r5;
    }

    public final void zzd(int r3) {
        int[] r02 = this.zzb;
        if (r3 > r02.length) goto L6;
        return;
    L6:
        if (r02.length != 0) goto L9;
        this.zzb = new int[Math.max(r3, 10)];
        return;
    L9:
        int r03 = r02.length;
    L10:
        if (r03 >= r3) goto L12;
        r03 = zze(r03);
        goto L10
    L12:
        this.zzb = Arrays.copyOf(this.zzb, r03);
    }

    private zzakj(int[] r1, int r2, boolean r3) {
        super(r3);
        this.zzb = r1;
        this.zzc = r2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object r1) {
        zzc(((Integer) r1).intValue());
        return true;
    }
}
