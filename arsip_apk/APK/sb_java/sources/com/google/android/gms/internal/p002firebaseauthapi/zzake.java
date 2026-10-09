package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
final class zzake extends zzaiq<Float> implements zzakn<Float>, RandomAccess {
    private static final float[] zza = null;
    private float[] zzb;
    private int zzc;

    static {
        float[] r1 = new float[0];
        zza = r1;
        new zzake(r1, 0, false);
    }

    public zzake() {
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
    public final /* synthetic */ void add(int r5, Object r6) {
        float r62 = ((Float) r6).floatValue();
        zza();
        if (r5 < 0) goto L13;
        int r02 = this.zzc;
        if (r5 > r02) goto L13;
        float[] r1 = this.zzb;
        if (r02 >= r1.length) goto L9;
        System.arraycopy(r1, r5, r1, r5 + 1, r02 - r5);
    L10:
        this.zzb[r5] = r62;
        this.zzc++;
        ((AbstractList) this).modCount++;
        return;
    L9:
        float[] r03 = new float[zzd(r1.length)];
        System.arraycopy(this.zzb, 0, r03, 0, r5);
        System.arraycopy(this.zzb, r5, r03, r5 + 1, this.zzc - r5);
        this.zzb = r03;
    L13:
        throw new IndexOutOfBoundsException(zze(r5));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> r6) {
        zza();
        zzaki.zza(r6);
        if ((r6 instanceof zzake) == false) goto L5;
        zzake r62 = (zzake) r6;
        int r02 = r62.zzc;
        if (r02 != 0) goto L9;
        return false;
    L9:
        int r2 = this.zzc;
        if ((Integer.MAX_VALUE - r2) < r02) goto L17;
        int r22 = r2 + r02;
        float[] r03 = this.zzb;
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
        if ((r6 instanceof zzake) == false) goto L8;
        zzake r62 = (zzake) r6;
        if (this.zzc == r62.zzc) goto L12;
        return false;
    L12:
        float[] r63 = r62.zzb;
        int r1 = 0;
    L14:
        if (r1 >= this.zzc) goto L19;
        if (Float.floatToIntBits(this.zzb[r1]) != Float.floatToIntBits(r63[r1])) goto L17;
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
        return Float.valueOf(zzb(r1));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int r02 = 1;
        int r1 = 0;
    L4:
        if (r1 >= this.zzc) goto L6;
        r02 = (r02 * 31) + Float.floatToIntBits(this.zzb[r1]);
        r1 = r1 + 1;
        goto L4
    L6:
        return r02;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object r5) {
        if ((r5 instanceof Float) == true) goto L5;
        return -1;
    L5:
        float r52 = ((Float) r5).floatValue();
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
        zzf(r5);
        float[] r02 = this.zzb;
        float r1 = r02[r5];
        if (r5 >= (this.zzc - 1)) goto L5;
        System.arraycopy(r02, r5 + 1, r02, r5, (r2 - r5) - 1);
    L5:
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(r1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int r3, int r4) {
        zza();
        if (r4 < r3) goto L7;
        float[] r02 = this.zzb;
        System.arraycopy(r02, r4, r02, r3, this.zzc - r4);
        this.zzc -= r4 - r3;
        ((AbstractList) this).modCount++;
        return;
    L7:
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int r3, Object r4) {
        float r42 = ((Float) r4).floatValue();
        zza();
        zzf(r3);
        float[] r02 = this.zzb;
        float r1 = r02[r3];
        r02[r3] = r42;
        return Float.valueOf(r1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
    public final /* synthetic */ zzakn<Float> zza(int r4) {
        if (r4 < this.zzc) goto L10;
        if (r4 != 0) goto L6;
        float[] r42 = zza;
    L8:
        return new zzake(r42, this.zzc, true);
    L6:
        r42 = Arrays.copyOf(this.zzb, r4);
        goto L8
    L10:
        throw new IllegalArgumentException();
    }

    public final float zzb(int r2) {
        zzf(r2);
        return this.zzb[r2];
    }

    public final void zzc(int r3) {
        float[] r02 = this.zzb;
        if (r3 > r02.length) goto L6;
        return;
    L6:
        if (r02.length != 0) goto L9;
        this.zzb = new float[Math.max(r3, 10)];
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

    private zzake(float[] r1, int r2, boolean r3) {
        super(r3);
        this.zzb = r1;
        this.zzc = r2;
    }

    public final void zza(float r5) {
        zza();
        int r02 = this.zzc;
        float[] r1 = this.zzb;
        if (r02 != r1.length) goto L5;
        float[] r03 = new float[zzd(r1.length)];
        System.arraycopy(this.zzb, 0, r03, 0, this.zzc);
        this.zzb = r03;
    L5:
        float[] r04 = this.zzb;
        int r12 = this.zzc;
        this.zzc = r12 + 1;
        r04[r12] = r5;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object r1) {
        zza(((Float) r1).floatValue());
        return true;
    }
}
