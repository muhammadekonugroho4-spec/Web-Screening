package com.google.android.gms.internal.fido;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzdp extends zzdr {
    private final String zza;

    public zzdp(String r1) {
        this.zza = r1;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object r4) {
        zzdr r42 = (zzdr) r4;
        int r02 = r42.zza();
        if (zzdr.zzd((byte) 96) == r02) goto L7;
        int r43 = r42.zza();
        int r03 = zzdr.zzd((byte) 96);
    L6:
        return r03 - r43;
    L7:
        String r04 = this.zza;
        int r1 = r04.length();
        String r44 = ((zzdp) r42).zza;
        if (r1 == r44.length()) goto L11;
        r03 = r04.length();
        r43 = r44.length();
        goto L6
    L11:
        return r04.compareTo(r44);
    }

    public final boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if (r4 != null) goto L9;
        return false;
    L9:
        if (zzdp.class == r4.getClass()) goto L12;
        return false;
    L12:
        return this.zza.equals(((zzdp) r4).zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzdr.zzd((byte) 96)), this.zza});
    }

    public final String toString() {
        return "\"" + this.zza + "\"";
    }

    @Override // com.google.android.gms.internal.fido.zzdr
    public final int zza() {
        return zzdr.zzd((byte) 96);
    }
}
