package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
final class zzamb<E> extends zzaiq<E> implements RandomAccess {
    private static final Object[] zza = null;
    private static final zzamb<Object> zzb = null;
    private E[] zzc;
    private int zzd;

    static {
        Object[] r1 = new Object[0];
        zza = r1;
        zzb = new zzamb(r1, 0, false);
    }

    public zzamb() {
        this(zza, 0, true);
    }

    private static int zzb(int r1) {
        return Math.max(((r1 * 3) / 2) + 1, 10);
    }

    private final String zzc(int r4) {
        return "Index:" + r4 + ", Size:" + this.zzd;
    }

    public static <E> zzamb<E> zzd() {
        return (zzamb<E>) zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.List
    public final void add(int r5, E r6) {
        zza();
        if (r5 < 0) goto L13;
        int r02 = this.zzd;
        if (r5 > r02) goto L13;
        E[] r1 = this.zzc;
        if (r02 >= r1.length) goto L9;
        System.arraycopy(r1, r5, r1, r5 + 1, r02 - r5);
    L10:
        this.zzc[r5] = r6;
        this.zzd++;
        ((AbstractList) this).modCount++;
        return;
    L9:
        E[] r03 = (E[]) new Object[zzb(r1.length)];
        System.arraycopy(this.zzc, 0, r03, 0, r5);
        System.arraycopy(this.zzc, r5, r03, r5 + 1, this.zzd - r5);
        this.zzc = r03;
    L13:
        throw new IndexOutOfBoundsException(zzc(r5));
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int r2) {
        zzd(r2);
        return this.zzc[r2];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.List
    public final E remove(int r5) {
        zza();
        zzd(r5);
        E[] r02 = this.zzc;
        E r1 = r02[r5];
        if (r5 >= (this.zzd - 1)) goto L5;
        System.arraycopy(r02, r5 + 1, r02, r5, (r2 - r5) - 1);
    L5:
        this.zzd--;
        ((AbstractList) this).modCount++;
        return r1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.List
    public final E set(int r3, E r4) {
        zza();
        zzd(r3);
        E[] r02 = this.zzc;
        E r1 = r02[r3];
        r02[r3] = r4;
        ((AbstractList) this).modCount++;
        return r1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
    public final /* synthetic */ zzakn zza(int r4) {
        if (r4 < this.zzd) goto L10;
        if (r4 != 0) goto L6;
        Object[] r42 = zza;
    L8:
        return new zzamb(r42, this.zzd, true);
    L6:
        r42 = Arrays.copyOf(this.zzc, r4);
        goto L8
    L10:
        throw new IllegalArgumentException();
    }

    private zzamb(E[] r1, int r2, boolean r3) {
        super(r3);
        this.zzc = r1;
        this.zzd = r2;
    }

    private final void zzd(int r2) {
        if (r2 < 0) goto L7;
        if (r2 >= this.zzd) goto L7;
        return;
    L7:
        throw new IndexOutOfBoundsException(zzc(r2));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E r4) {
        zza();
        int r02 = this.zzd;
        E[] r1 = this.zzc;
        if (r02 != r1.length) goto L5;
        this.zzc = (E[]) Arrays.copyOf(this.zzc, zzb(r1.length));
    L5:
        E[] r03 = this.zzc;
        int r12 = this.zzd;
        this.zzd = r12 + 1;
        r03[r12] = r4;
        ((AbstractList) this).modCount++;
        return true;
    }
}
