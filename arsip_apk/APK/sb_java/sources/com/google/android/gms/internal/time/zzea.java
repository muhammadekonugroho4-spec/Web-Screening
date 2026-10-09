package com.google.android.gms.internal.time;

/* loaded from: classes5.dex */
final class zzea implements zzdi {
    private final zzdi zza;
    private final Object zzb;

    private zzea(zzdi r2, Object r3) {
        zzhf.zza(r2, "log site key");
        this.zza = r2;
        zzhf.zza(r3, "log site qualifier");
        this.zzb = r3;
    }

    public static zzdi zza(zzdi r1, Object r2) {
        return new zzea(r1, r2);
    }

    public final boolean equals(Object r4) {
        if ((r4 instanceof zzea) == true) goto L5;
        return false;
    L5:
        zzea r42 = (zzea) r4;
        if (this.zza.equals(r42.zza) == true) goto L8;
    L11:
        return false;
    L8:
        if (this.zzb.equals(r42.zzb) == false) goto L11;
        return true;
    }

    public final int hashCode() {
        Object r02 = this.zzb;
        int r1 = this.zza.hashCode();
        return r02.hashCode() ^ r1;
    }

    public final String toString() {
        Object r02 = this.zzb;
        return "SpecializedLogSiteKey{ delegate='" + this.zza.toString() + "', qualifier='" + r02.toString() + "' }";
    }
}
