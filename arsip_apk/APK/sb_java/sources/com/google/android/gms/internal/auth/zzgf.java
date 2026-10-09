package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
final class zzgf extends zzdq implements RandomAccess {
    private static final zzgf zza = null;
    private Object[] zzb;
    private int zzc;

    static {
        zzgf r02 = new zzgf(new Object[0], 0);
        zza = r02;
        r02.zzb();
    }

    public zzgf() {
        this(new Object[10], 0);
    }

    public static zzgf zze() {
        return zza;
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

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
    public final void add(int r5, Object r6) {
        zza();
        if (r5 < 0) goto L13;
        int r02 = this.zzc;
        if (r5 > r02) goto L13;
        Object[] r1 = this.zzb;
        if (r02 >= r1.length) goto L9;
        System.arraycopy(r1, r5, r1, r5 + 1, r02 - r5);
    L10:
        this.zzb[r5] = r6;
        this.zzc++;
        ((AbstractList) this).modCount++;
        return;
    L9:
        Object[] r03 = new Object[((r02 * 3) / 2) + 1];
        System.arraycopy(r1, 0, r03, 0, r5);
        System.arraycopy(this.zzb, r5, r03, r5 + 1, this.zzc - r5);
        this.zzb = r03;
    L13:
        throw new IndexOutOfBoundsException(zzf(r5));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int r2) {
        zzg(r2);
        return this.zzb[r2];
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
    public final Object remove(int r5) {
        zza();
        zzg(r5);
        Object[] r02 = this.zzb;
        Object r1 = r02[r5];
        if (r5 >= (this.zzc - 1)) goto L5;
        System.arraycopy(r02, r5 + 1, r02, r5, (r2 - r5) - 1);
    L5:
        this.zzc--;
        ((AbstractList) this).modCount++;
        return r1;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.List
    public final Object set(int r3, Object r4) {
        zza();
        zzg(r3);
        Object[] r02 = this.zzb;
        Object r1 = r02[r3];
        r02[r3] = r4;
        ((AbstractList) this).modCount++;
        return r1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzey
    public final /* bridge */ /* synthetic */ zzey zzd(int r3) {
        if (r3 < this.zzc) goto L7;
        return new zzgf(Arrays.copyOf(this.zzb, r3), this.zzc);
    L7:
        throw new IllegalArgumentException();
    }

    private zzgf(Object[] r1, int r2) {
        this.zzb = r1;
        this.zzc = r2;
    }

    @Override // com.google.android.gms.internal.auth.zzdq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object r5) {
        zza();
        int r02 = this.zzc;
        Object[] r1 = this.zzb;
        if (r02 != r1.length) goto L5;
        this.zzb = Arrays.copyOf(r1, ((r02 * 3) / 2) + 1);
    L5:
        Object[] r03 = this.zzb;
        int r12 = this.zzc;
        this.zzc = r12 + 1;
        r03[r12] = r5;
        ((AbstractList) this).modCount++;
        return true;
    }
}
