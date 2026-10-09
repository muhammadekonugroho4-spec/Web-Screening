package com.google.android.gms.internal.fido;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzdj extends zzdr {
    private final boolean zza;

    public zzdj(boolean r1) {
        this.zza = r1;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object r5) {
        zzdr r52 = (zzdr) r5;
        if (zzdr.zzd((byte) -32) != r52.zza()) goto L5;
        zzdj r53 = (zzdj) r52;
        int r1 = 21;
        if (true == this.zza) goto L9;
        int r02 = 20;
    L11:
        if (true == r53.zza) goto L14;
        r1 = 20;
    L14:
        return r02 - r1;
    L9:
        r02 = 21;
        goto L11
    L5:
        return zzdr.zzd((byte) -32) - r52.zza();
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L9;
        return false;
    L9:
        if (zzdj.class == r5.getClass()) goto L12;
        return false;
    L12:
        if (this.zza != ((zzdj) r5).zza) goto L14;
        return true;
    L14:
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzdr.zzd((byte) -32)), Boolean.valueOf(this.zza)});
    }

    public final String toString() {
        return Boolean.toString(this.zza);
    }

    @Override // com.google.android.gms.internal.fido.zzdr
    public final int zza() {
        return zzdr.zzd((byte) -32);
    }
}
