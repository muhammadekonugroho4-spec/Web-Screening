package com.google.android.gms.internal.auth;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzgz {
    private static final zzgz zza = null;
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private boolean zze;

    static {
        zza = new zzgz(0, new int[0], new Object[0], false);
    }

    private zzgz(int r1, int[] r2, Object[] r3, boolean r4) {
        this.zzb = r1;
        this.zzc = r2;
        this.zzd = r3;
        this.zze = r4;
    }

    public static zzgz zza() {
        return zza;
    }

    public static zzgz zzb(zzgz r6, zzgz r7) {
        int r02 = r6.zzb + r7.zzb;
        int[] r1 = Arrays.copyOf(r6.zzc, r02);
        System.arraycopy(r7.zzc, 0, r1, r6.zzb, r7.zzb);
        Object[] r2 = Arrays.copyOf(r6.zzd, r02);
        System.arraycopy(r7.zzd, 0, r2, r6.zzb, r7.zzb);
        return new zzgz(r02, r1, r2, true);
    }

    public static zzgz zzc() {
        return new zzgz(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object r9) {
        if (this != r9) goto L6;
        return true;
    L6:
        if (r9 != null) goto L9;
        return false;
    L9:
        if ((r9 instanceof zzgz) == true) goto L11;
        return false;
    L11:
        zzgz r92 = (zzgz) r9;
        int r2 = this.zzb;
        if (r2 != r92.zzb) goto L25;
        int[] r3 = this.zzc;
        int[] r4 = r92.zzc;
        int r5 = 0;
    L14:
        if (r5 >= r2) goto L19;
        if (r3[r5] != r4[r5]) goto L25;
        r5 = r5 + 1;
        goto L14
    L19:
        Object[] r22 = this.zzd;
        Object[] r93 = r92.zzd;
        int r32 = this.zzb;
        int r42 = 0;
    L20:
        if (r42 >= r32) goto L24;
        if (r22[r42].equals(r93[r42]) == false) goto L25;
        r42 = r42 + 1;
        goto L20
    L24:
        return true;
    L25:
        return false;
    }

    public final int hashCode() {
        int r02 = this.zzb;
        int r1 = (r02 + 527) * 31;
        int[] r2 = this.zzc;
        int r3 = 17;
        int r4 = 0;
        int r6 = 17;
        int r5 = 0;
    L3:
        if (r5 >= r02) goto L5;
        r6 = (r6 * 31) + r2[r5];
        r5 = r5 + 1;
        goto L3
    L5:
        int r12 = (r1 + r6) * 31;
        Object[] r03 = this.zzd;
        int r22 = this.zzb;
    L6:
        if (r4 >= r22) goto L9;
        r3 = (r3 * 31) + r03[r4].hashCode();
        r4 = r4 + 1;
        goto L6
    L9:
        return r12 + r3;
    }

    public final void zzd() {
        this.zze = false;
    }

    public final void zze(StringBuilder r4, int r5) {
        int r02 = 0;
    L4:
        if (r02 >= this.zzb) goto L6;
        zzfy.zzb(r4, r5, String.valueOf(this.zzc[r02] >>> 3), this.zzd[r02]);
        r02 = r02 + 1;
        goto L4
    }

    public final void zzf(int r4, Object r5) {
        if (this.zze == false) goto L14;
        int r02 = this.zzb;
        int[] r1 = this.zzc;
        if (r02 == r1.length) goto L7;
    L11:
        int[] r03 = this.zzc;
        int r12 = this.zzb;
        r03[r12] = r4;
        this.zzd[r12] = r5;
        this.zzb = r12 + 1;
        return;
    L7:
        if (r02 >= 4) goto L9;
        int r2 = 8;
    L10:
        int r04 = r02 + r2;
        this.zzc = Arrays.copyOf(r1, r04);
        this.zzd = Arrays.copyOf(this.zzd, r04);
        goto L11
    L9:
        r2 = r02 >> 1;
        goto L10
    L14:
        throw new UnsupportedOperationException();
    }

    private zzgz() {
        this(0, new int[8], new Object[8], true);
    }
}
