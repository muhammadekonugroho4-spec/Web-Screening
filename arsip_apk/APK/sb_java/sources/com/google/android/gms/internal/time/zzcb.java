package com.google.android.gms.internal.time;

/* loaded from: classes5.dex */
public final class zzcb {
    private final String zza;

    private zzcb(String r1) {
        this.zza = r1;
    }

    public static zzcb zza(String r1) {
        return new zzcb(r1);
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof zzcb) == true) goto L5;
        return false;
    L5:
        return this.zza.equals(((zzcb) r2).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
