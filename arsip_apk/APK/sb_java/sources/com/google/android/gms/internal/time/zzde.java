package com.google.android.gms.internal.time;

import java.util.Arrays;

/* loaded from: classes5.dex */
final class zzde extends zzet {
    private Object[] zza;
    private int zzb;

    public zzde() {
        this.zza = new Object[8];
        this.zzb = 0;
    }

    private final int zzh(zzdq r4) {
        int r02 = 0;
    L4:
        if (r02 >= this.zzb) goto L9;
        if (this.zza[r02 + r02].equals(r4) == true) goto L7;
        r02 = r02 + 1;
        goto L4
    L7:
        return r02;
    L9:
        return -1;
    }

    public final String toString() {
        StringBuilder r02 = new StringBuilder("Metadata{");
        int r1 = 0;
    L4:
        if (r1 >= this.zzb) goto L6;
        r02.append(" '");
        r02.append(zzb(r1));
        r02.append("': ");
        r02.append(zzd(r1));
        r1 = r1 + 1;
        goto L4
    L6:
        r02.append(" }");
        return r02.toString();
    }

    @Override // com.google.android.gms.internal.time.zzet
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.time.zzet
    public final zzdq zzb(int r2) {
        if (r2 >= this.zzb) goto L7;
        return (zzdq) this.zza[r2 + r2];
    L7:
        throw new IndexOutOfBoundsException();
    }

    @Override // com.google.android.gms.internal.time.zzet
    public final Object zzc(zzdq r3) {
        int r02 = zzh(r3);
        if (r02 != (-1)) goto L5;
        return null;
    L5:
        return r3.zze(this.zza[(r02 + r02) + 1]);
    }

    @Override // com.google.android.gms.internal.time.zzet
    public final Object zzd(int r2) {
        if (r2 >= this.zzb) goto L7;
        return this.zza[(r2 + r2) + 1];
    L7:
        throw new IndexOutOfBoundsException();
    }

    public final void zze(zzdq r5, Object r6) {
        if (r5.zzi() == true) goto L9;
        int r02 = zzh(r5);
        if (r02 == (-1)) goto L9;
        zzhf.zza(r6, "metadata value");
        this.zza[(r02 + r02) + 1] = r6;
        return;
    L9:
        int r03 = this.zzb + 1;
        Object[] r2 = this.zza;
        int r3 = r2.length;
        if ((r03 + r03) <= r3) goto L12;
        this.zza = Arrays.copyOf(r2, r3 + r3);
    L12:
        Object[] r04 = this.zza;
        int r22 = this.zzb;
        zzhf.zza(r5, "metadata key");
        r04[r22 + r22] = r5;
        Object[] r52 = this.zza;
        int r05 = this.zzb;
        zzhf.zza(r6, "metadata value");
        r52[(r05 + r05) + 1] = r6;
        this.zzb++;
    }

    public final void zzf(zzdq r6) {
        int r02 = zzh(r6);
        if (r02 < 0) goto L14;
        int r03 = r02 + r02;
        int r1 = r03 + 2;
    L5:
        int r2 = this.zzb;
        if (r1 >= (r2 + r2)) goto L11;
        Object r22 = this.zza[r1];
        if (r22.equals(r6) == true) goto L10;
        Object[] r3 = this.zza;
        r3[r03] = r22;
        r3[r03 + 1] = r3[r1 + 1];
        r03 = r03 + 2;
    L10:
        r1 = r1 + 2;
        goto L5
    L11:
        this.zzb = r2 - ((r1 - r03) >> 1);
    L12:
        if (r03 >= r1) goto L19;
        this.zza[r03] = null;
        r03 = r03 + 1;
        goto L12
    L19:
        return;
    }
}
