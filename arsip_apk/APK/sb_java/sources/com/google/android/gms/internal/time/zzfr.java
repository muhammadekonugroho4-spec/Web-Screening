package com.google.android.gms.internal.time;

/* loaded from: classes5.dex */
public final class zzfr {
    private final zzhb zza;
    private final String zzb;

    public zzfr(zzhb r2, String r3) {
        zzhf.zza(r2, "parser");
        this.zza = r2;
        zzhf.zza(r3, "message");
        this.zzb = r3;
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof zzfr) == false) goto L10;
        zzfr r42 = (zzfr) r4;
        if (this.zza.equals(r42.zza) == false) goto L10;
        if (this.zzb.equals(r42.zzb) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final int hashCode() {
        String r02 = this.zzb;
        int r1 = this.zza.hashCode();
        return r02.hashCode() ^ r1;
    }

    public final zzhb zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
