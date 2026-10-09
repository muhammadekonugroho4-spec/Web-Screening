package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
final class zzgt extends zzdu implements RandomAccess {
    private static final Object[] zza = null;
    private static final zzgt zzb = null;
    private Object[] zzc;
    private int zzd;

    static {
        Object[] r1 = new Object[0];
        zza = r1;
        zzb = new zzgt(r1, 0, false);
    }

    public zzgt() {
        this(zza, 0, true);
    }

    public static zzgt zze() {
        return zzb;
    }

    private static int zzg(int r1) {
        return Math.max(((r1 * 3) / 2) + 1, 10);
    }

    private final String zzh(int r4) {
        return "Index:" + r4 + ", Size:" + this.zzd;
    }

    private final void zzi(int r2) {
        if (r2 < 0) goto L7;
        if (r2 >= this.zzd) goto L7;
        return;
    L7:
        throw new IndexOutOfBoundsException(zzh(r2));
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final void add(int r5, Object r6) {
        zza();
        if (r5 < 0) goto L13;
        int r02 = this.zzd;
        if (r5 > r02) goto L13;
        int r1 = r5 + 1;
        Object[] r2 = this.zzc;
        int r3 = r2.length;
        if (r02 >= r3) goto L9;
        System.arraycopy(r2, r5, r2, r1, r02 - r5);
    L10:
        this.zzc[r5] = r6;
        this.zzd++;
        ((AbstractList) this).modCount++;
        return;
    L9:
        Object[] r03 = new Object[zzg(r3)];
        System.arraycopy(this.zzc, 0, r03, 0, r5);
        System.arraycopy(this.zzc, r5, r03, r1, this.zzd - r5);
        this.zzc = r03;
    L13:
        throw new IndexOutOfBoundsException(zzh(r5));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int r2) {
        zzi(r2);
        return this.zzc[r2];
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final Object remove(int r5) {
        zza();
        zzi(r5);
        Object[] r02 = this.zzc;
        Object r1 = r02[r5];
        if (r5 >= (this.zzd - 1)) goto L5;
        System.arraycopy(r02, r5 + 1, r02, r5, (r2 - r5) - 1);
    L5:
        this.zzd--;
        ((AbstractList) this).modCount++;
        return r1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.List
    public final Object set(int r3, Object r4) {
        zza();
        zzi(r3);
        Object[] r02 = this.zzc;
        Object r1 = r02[r3];
        r02[r3] = r4;
        ((AbstractList) this).modCount++;
        return r1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfn
    public final /* bridge */ /* synthetic */ zzfn zzd(int r4) {
        if (r4 < this.zzd) goto L10;
        if (r4 != 0) goto L6;
        Object[] r42 = zza;
    L8:
        return new zzgt(r42, this.zzd, true);
    L6:
        r42 = Arrays.copyOf(this.zzc, r4);
        goto L8
    L10:
        throw new IllegalArgumentException();
    }

    public final void zzf(int r2) {
        int r02 = this.zzc.length;
        if (r2 > r02) goto L5;
        return;
    L5:
        if (r02 == 0) goto L10;
    L6:
        if (r02 >= r2) goto L8;
        r02 = zzg(r02);
        goto L6
    L8:
        this.zzc = Arrays.copyOf(this.zzc, r02);
        return;
    L10:
        this.zzc = new Object[Math.max(r2, 10)];
    }

    private zzgt(Object[] r1, int r2, boolean r3) {
        super(r3);
        this.zzc = r1;
        this.zzd = r2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdu, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object r4) {
        zza();
        int r02 = this.zzd;
        int r1 = this.zzc.length;
        if (r02 != r1) goto L5;
        this.zzc = Arrays.copyOf(this.zzc, zzg(r1));
    L5:
        Object[] r03 = this.zzc;
        int r12 = this.zzd;
        this.zzd = r12 + 1;
        r03[r12] = r4;
        ((AbstractList) this).modCount++;
        return true;
    }
}
