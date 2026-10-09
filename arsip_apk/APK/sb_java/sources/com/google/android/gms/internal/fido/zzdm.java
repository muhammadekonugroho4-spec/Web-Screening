package com.google.android.gms.internal.fido;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzdm extends zzdr {
    private final long zza;

    public zzdm(long r1) {
        this.zza = r1;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object r5) {
        zzdr r52 = (zzdr) r5;
        if (zza() != r52.zza()) goto L5;
        long r02 = Math.abs(this.zza);
        long r2 = Math.abs(((zzdm) r52).zza);
        if (r02 >= r2) goto L10;
        return -1;
    L10:
        if (r02 <= r2) goto L13;
        return 1;
    L13:
        return 0;
    L5:
        return zza() - r52.zza();
    }

    public final boolean equals(Object r7) {
        if (this != r7) goto L6;
        return true;
    L6:
        if (r7 != null) goto L9;
        return false;
    L9:
        if (zzdm.class == r7.getClass()) goto L12;
        return false;
    L12:
        if (this.zza != ((zzdm) r7).zza) goto L14;
        return true;
    L14:
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.zza)});
    }

    public final String toString() {
        return Long.toString(this.zza);
    }

    @Override // com.google.android.gms.internal.fido.zzdr
    public final int zza() {
        if (this.zza < 0) goto L7;
        byte r02 = 0;
    L6:
        return zzdr.zzd(r02);
    L7:
        r02 = 32;
        goto L6
    }

    public final long zzc() {
        return this.zza;
    }
}
